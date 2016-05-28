/**
* Copyright (c) 2011, Jordi Cortadella
* All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions are met:
* * Redistributions of source code must retain the above copyright
* notice, this list of conditions and the following disclaimer.
* * Redistributions in binary form must reproduce the above copyright
* notice, this list of conditions and the following disclaimer in the
* documentation and/or other materials provided with the distribution.
* * Neither the name of the <organization> nor the
* names of its contributors may be used to endorse or promote products
* derived from this software without specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
* ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
* WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
* DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
* DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
* (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
* LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
* ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
* (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
* SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
grammar Asl;
options {
output = AST;
ASTLabelType = AslTree;
}
// Imaginary tokens to create some AST nodes
tokens {
PROG;
LIST_FUNCTIONS; // List of functions (the root of the tree)
ASSIGN; // Assignment instruction
PARAMS; // List of parameters in the declaration of a function
FUNCALL; // Function call
ARGLIST; // List of arguments passed in a function call
LIST_INSTR; // Block of instructions
BOOLEAN; // Boolean atom (for Boolean constants "true" or "false")
// PVALUE; // Parameter by value in the list of parameters
PREF; // Parameter by reference in the list of parameters
TIMEANNOTATION;
// CREATE_INSTR;
ANIMATION;
ACCESATTRIBUTE;
ATTRIBUTES;
}

@header {
package parser;
import interp.AslTree;
}

@lexer::header {
package parser;
}

// A program is a possible import and a list of functions
// or a module
prog : imports? list_func -> ^(PROG imports? list_func)
    | module_def imports? list_func -> ^(PROG module_def imports? list_func)
;

module_def : MODULE^ ID ';'!
;

imports : (IMPORT^ ID '.sam'! ';'!)+
;

list_func : func+ EOF-> ^(LIST_FUNCTIONS func+)
;

// A function has a name, a list of parameters and a block of instructions
func : FUNC^ ID params block_instructions ENDFUNC! 
;
// The list of parameters grouped in a subtree (it can be empty)
params : '(' paramlist? ')' -> ^(PARAMS paramlist?)
;
// Parameters are separated by commas
paramlist: param (','! param)*
;
// All parameters are passed by reference
// Only one node with the name of the parameter is created
param : id=ID -> ^(PREF[$id,$id.text])
;
// A list of instructions, all of them gouped in a subtree
block_instructions
:   instruction (';' instruction)*
-> ^(LIST_INSTR instruction+)
;
// The different types of instructions
instruction
:   assign // Assignment
| basic_instruction // Basic SVG instruction
| ite_stmt // if-then-else
| while_stmt // while statement
| for_stmt 
| funcall // Call to a procedure (no result produced)
| return_stmt // Return statement
| time_annotation // Animation time annotation
| // Nothing
;
// Assignment
assign :    ID eq=EQUAL basic_instruction -> ^(ASSIGN[$eq,":="] ID basic_instruction )
| ID eq=EQUAL expr -> ^(ASSIGN[$eq,":="] ID expr )
;
basic_instruction:
create
| group
| destroy
| move
| translate
| modify
| rotate
;
// if-then-else (else is optional)
ite_stmt :  IF^ '('! expr ')'! block_instructions elseif_stmt else_stmt ENDIF!
;

elseif_stmt: (ELSEIF^ '('! expr ')'! block_instructions)*
;

else_stmt: (ELSE^ block_instructions)?
;

// while statement
while_stmt :    WHILE^ '('! expr ')'! block_instructions ENDWHILE!
;
// for statement
for_stmt :  FOR^ '('! for_form ')'! block_instructions ENDFOR!
;

for_form:  assign ';'! expr ';'! assign
    |  ID IN! expr ':'! expr 
    ;


// Return statement with an expression
return_stmt :   RETURN^ expr?
;
// HO HEM TRET
// Read a variable
//read :    READ^ ID
// ;
// Write an expression or a string
// write : WRITE^ (expr | STRING )
// ;
// Grammar for expressions with boolean, relational and aritmetic operators
expr : boolterm (OR^ boolterm)*
;
boolterm: boolfact (AND^ boolfact)*
;
boolfact: num_expr ((COND_EQUAL^ | NOT_EQUAL^ | LT^ | LE^ | GT^ | GE^) num_expr)?
;
num_expr: term ( (PLUS^ | MINUS^) term)*
;
term : factor ( (MUL^ | DIV^ | MOD^) factor)*
;
factor : (NOT^ | PLUS^ | MINUS^)? atom
;
// Atom of the expressions (variables, integer and boolean literals).
// An atom can also be a function call or another expression
// in parenthesis
atom : ID
| INT
| (b=TRUE | b=FALSE) -> ^(BOOLEAN[$b,$b.text])
| funcall
| '('! expr ')'!
| acces_attribute
;
// A function call has a lits of arguments in parenthesis (possibly empty)
funcall : ID '(' expr_list? ')' -> ^(FUNCALL ID ^(ARGLIST expr_list?))
;
// A list of expressions separated by commas
expr_list: expr (','! expr)*
;
time_annotation:
'@' BEGIN EQUAL expr (',' finish_time)? -> ^(TIMEANNOTATION expr finish_time?)
;
finish_time:
(END^ EQUAL! expr | DURATION^ EQUAL! expr)
;
create: CREATE TYPE_OBJECT coordenades? radis? list_attributes? -> ^(CREATE TYPE_OBJECT coordenades? radis? ^(ATTRIBUTES list_attributes)?)
;
group: GROUP^ ID (','! ID)+
;
destroy: DESTROY ID -> ^(ANIMATION DESTROY ID)
;
move:   MOVE ID coordenades -> ^(ANIMATION MOVE ID coordenades)
;
translate:  TRANSLATE ID coordenades -> ^(ANIMATION TRANSLATE ID coordenades)
;
modify: MODIFY ID list_attributes -> ^(ANIMATION MODIFY ID list_attributes)
;
rotate: ROTATE ID expr -> ^(ANIMATION ROTATE ID expr)
;
list_attributes: attribute (','! attribute)*
;
attribute: ATTRIBUTE^ EQUAL! expr
;
coordenades: '{'! expr ','! expr '}'!
;
radis: '('! expr (')'! | radi2)
;
radi2: ','! expr ')'!
;
acces_attribute: ID '.' att '(' ')' -> ^(ACCESATTRIBUTE ID att)
;

att:    ATTRIBUTE
    |   BEGIN
    |   END
    |   DURATION
    ;

// Basic tokens
EQUAL : '=' ;
COND_EQUAL : '==' ;
NOT_EQUAL: '!=' ;
LT : '<' ;
LE : '<=';
GT : '>';
GE : '>=';
PLUS : '+' ;
MINUS : '-' ;
MUL : '*';
DIV : '/';
MOD : '%' ;
NOT : 'not';
AND : 'and' ;
OR : 'or' ;
IF : 'if' ;
ELSE : 'else' ;
ELSEIF : 'elseif' ;
ENDIF : 'endif' ;
WHILE : 'while' ;
FOR : 'for' ;
ENDWHILE: 'endwhile' ;
ENDFOR : 'endfor' ;
IN :    'in' ; 
IMPORT : 'import';
MODULE : 'module';
FUNC : 'func' ;
ENDFUNC : 'endfunc' ;
RETURN : 'return' ;
READ : 'read' ;
WRITE : 'write' ;
TRUE : 'true' ;
FALSE : 'false';
BEGIN : 'begin';
END : 'end';
DURATION: 'duration';
CREATE : 'Create';
GROUP :  'Group';
DESTROY : 'Destroy';
MOVE : 'Move';
TRANSLATE : 'Translate';
MODIFY : 'Modify';
ROTATE : 'Rotate';
TYPE_OBJECT : 'Rectangle' | 'Circle' | 'Text' | 'Ellipse' | 'Line' ; // AMPLIAT
ATTRIBUTE : 'width' | 'height' | 'style' | 'color' | 'stroke-width'; // A AMPLIAR
ID :    ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INT :   '0'..'9'+ ;
// C-style comments
COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
| '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
;
// Strings (in quotes) with escape sequences
STRING : '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
;

fragment
ESC_SEQ
: '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
;

// White spaces
WS      : ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
        ;
