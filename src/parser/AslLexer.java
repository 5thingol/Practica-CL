<<<<<<< HEAD
// $ANTLR 3.4 /home/carlos/CL/Practica/src/parser/Asl.g 2016-05-01 11:11:56
=======
// $ANTLR 3.4 /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g 2016-04-25 10:01:21
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
<<<<<<< HEAD
=======
    public static final int T__62=62;
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
<<<<<<< HEAD
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int ACCESATTRIBUTE=4;
    public static final int AND=5;
    public static final int ARGLIST=6;
    public static final int ASSIGN=7;
    public static final int ATTRIBUTE=8;
    public static final int ATTRIBUTES=9;
    public static final int BEGIN=10;
    public static final int BOOLEAN=11;
    public static final int COMMENT=12;
    public static final int COND_EQUAL=13;
    public static final int CREATE=14;
    public static final int DESTROY=15;
    public static final int DIV=16;
    public static final int DURATION=17;
    public static final int ELSE=18;
    public static final int ELSEIF=19;
    public static final int END=20;
    public static final int ENDFOR=21;
    public static final int ENDFUNC=22;
    public static final int ENDIF=23;
    public static final int ENDLINE=24;
    public static final int ENDWHILE=25;
    public static final int EQUAL=26;
    public static final int ESC_SEQ=27;
    public static final int FALSE=28;
    public static final int FOR=29;
    public static final int FUNC=30;
    public static final int FUNCALL=31;
    public static final int GE=32;
    public static final int GT=33;
    public static final int ID=34;
    public static final int IF=35;
    public static final int INT=36;
    public static final int LE=37;
    public static final int LIST_FUNCTIONS=38;
    public static final int LIST_INSTR=39;
    public static final int LT=40;
    public static final int MINUS=41;
    public static final int MOD=42;
    public static final int MODIFY=43;
    public static final int MOVE=44;
    public static final int MUL=45;
    public static final int NOT=46;
    public static final int NOT_EQUAL=47;
    public static final int OR=48;
    public static final int PARAMS=49;
    public static final int PLUS=50;
    public static final int PREF=51;
    public static final int READ=52;
    public static final int RETURN=53;
    public static final int ROTATE=54;
    public static final int STRING=55;
    public static final int TIMEANNOTATION=56;
    public static final int TRANSLATE=57;
    public static final int TRUE=58;
    public static final int TYPE_OBJECT=59;
    public static final int WHILE=60;
    public static final int WRITE=61;
    public static final int WS=62;
=======
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int ATTRIBUTE=7;
    public static final int ATTRIBUTES=8;
    public static final int BEGIN=9;
    public static final int BOOLEAN=10;
    public static final int COMMENT=11;
    public static final int COND_EQUAL=12;
    public static final int CREATE=13;
    public static final int DESTROY=14;
    public static final int DIV=15;
    public static final int DURATION=16;
    public static final int ELSE=17;
    public static final int ELSEIF=18;
    public static final int END=19;
    public static final int ENDFOR=20;
    public static final int ENDFUNC=21;
    public static final int ENDIF=22;
    public static final int ENDLINE=23;
    public static final int ENDWHILE=24;
    public static final int EQUAL=25;
    public static final int ESC_SEQ=26;
    public static final int FALSE=27;
    public static final int FOR=28;
    public static final int FUNC=29;
    public static final int FUNCALL=30;
    public static final int GE=31;
    public static final int GT=32;
    public static final int ID=33;
    public static final int IF=34;
    public static final int INT=35;
    public static final int LE=36;
    public static final int LIST_FUNCTIONS=37;
    public static final int LIST_INSTR=38;
    public static final int LT=39;
    public static final int MINUS=40;
    public static final int MOD=41;
    public static final int MODIFY=42;
    public static final int MOVE=43;
    public static final int MUL=44;
    public static final int NOT=45;
    public static final int NOT_EQUAL=46;
    public static final int OR=47;
    public static final int PARAMS=48;
    public static final int PLUS=49;
    public static final int PREF=50;
    public static final int READ=51;
    public static final int RETURN=52;
    public static final int ROTATE=53;
    public static final int STRING=54;
    public static final int TIMEANNOTATION=55;
    public static final int TRANSLATE=56;
    public static final int TRUE=57;
    public static final int TYPE_OBJECT=58;
    public static final int WHILE=59;
    public static final int WRITE=60;
    public static final int WS=61;
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
<<<<<<< HEAD
    public String getGrammarFileName() { return "/home/carlos/CL/Practica/src/parser/Asl.g"; }
=======
    public String getGrammarFileName() { return "/home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g"; }

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:6:7: ( '(' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:6:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:6:7: ( '(' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:6:9: '('
            {
            match('('); 
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:7:7: ( ')' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:7:9: ')'
            {
            match(')'); 
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:7:7: ( ')' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:7:9: ')'
            {
            match(')'); 
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:8:7: ( ',' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:8:9: ','
            {
            match(','); 
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:8:7: ( ',' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:8:9: ','
            {
            match(','); 
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:9:7: ( ';' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:9:9: ';'
            {
            match(';'); 
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:9:7: ( '.' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:9:9: '.'
            {
            match('.'); 
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:10:7: ( '@' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:10:9: '@'
            {
            match('@'); 
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:10:7: ( ';' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:10:9: ';'
            {
            match(';'); 
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:11:7: ( '{' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:11:9: '{'
            {
            match('{'); 
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:11:7: ( '@' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:11:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/CL/Practica/src/parser/Asl.g:12:7: ( '{' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/CL/Practica/src/parser/Asl.g:13:7: ( '}' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:13:9: '}'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:12:7: ( '}' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:12:9: '}'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
<<<<<<< HEAD
    // $ANTLR end "T__70"
=======
    // $ANTLR end "T__68"
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a

    // $ANTLR start "ENDLINE"
    public final void mENDLINE() throws RecognitionException {
        try {
            int _type = ENDLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:183:9: ( '\\n' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:183:11: '\\n'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:218:9: ( '\\n' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:218:11: '\\n'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDLINE"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:184:7: ( '=' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:184:9: '='
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:219:7: ( '=' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:219:9: '='
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "COND_EQUAL"
    public final void mCOND_EQUAL() throws RecognitionException {
        try {
            int _type = COND_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:185:12: ( '==' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:185:14: '=='
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:220:12: ( '==' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:220:14: '=='
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COND_EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:186:10: ( '!=' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:186:12: '!='
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:221:10: ( '!=' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:221:12: '!='
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:187:4: ( '<' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:187:6: '<'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:222:8: ( '<' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:222:10: '<'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:188:4: ( '<=' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:188:6: '<='
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:223:8: ( '<=' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:223:10: '<='
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:189:4: ( '>' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:189:6: '>'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:224:8: ( '>' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:224:10: '>'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:190:4: ( '>=' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:190:6: '>='
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:225:8: ( '>=' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:225:10: '>='
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:191:6: ( '+' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:191:8: '+'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:226:6: ( '+' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:226:8: '+'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:192:7: ( '-' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:192:9: '-'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:227:7: ( '-' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:227:9: '-'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:193:5: ( '*' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:193:7: '*'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:228:9: ( '*' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:228:11: '*'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:194:5: ( '/' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:194:7: '/'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:229:9: ( '/' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:229:11: '/'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:195:5: ( '%' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:195:7: '%'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:230:9: ( '%' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:230:11: '%'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:196:5: ( 'not' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:196:7: 'not'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:231:9: ( 'not' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:231:11: 'not'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:197:5: ( 'and' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:197:7: 'and'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:232:9: ( 'and' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:232:11: 'and'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:198:4: ( 'or' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:198:6: 'or'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:233:8: ( 'or' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:233:10: 'or'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:199:4: ( 'if' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:199:6: 'if'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:234:6: ( 'if' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:234:8: 'if'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:200:6: ( 'else' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:200:8: 'else'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:235:9: ( 'else' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:235:11: 'else'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELSEIF"
    public final void mELSEIF() throws RecognitionException {
        try {
            int _type = ELSEIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:201:8: ( 'elseif' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:201:10: 'elseif'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:236:11: ( 'elseif' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:236:13: 'elseif'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("elseif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSEIF"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:202:7: ( 'endif' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:202:9: 'endif'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:237:7: ( 'endif' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:237:9: 'endif'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:203:7: ( 'while' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:203:9: 'while'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:238:7: ( 'while' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:238:9: 'while'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:204:5: ( 'for' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:204:7: 'for'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:239:5: ( 'for' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:239:7: 'for'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "ENDWHILE"
    public final void mENDWHILE() throws RecognitionException {
        try {
            int _type = ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:205:9: ( 'endwhile' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:205:11: 'endwhile'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:240:9: ( 'endwhile' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:240:11: 'endwhile'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("endwhile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDWHILE"

    // $ANTLR start "ENDFOR"
    public final void mENDFOR() throws RecognitionException {
        try {
            int _type = ENDFOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:206:8: ( 'endfor' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:206:10: 'endfor'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:241:8: ( 'endfor' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:241:10: 'endfor'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("endfor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFOR"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:207:6: ( 'func' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:207:8: 'func'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:242:6: ( 'func' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:242:8: 'func'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ENDFUNC"
    public final void mENDFUNC() throws RecognitionException {
        try {
            int _type = ENDFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:208:9: ( 'endfunc' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:208:11: 'endfunc'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:243:9: ( 'endfunc' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:243:11: 'endfunc'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("endfunc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:209:8: ( 'return' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:209:10: 'return'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:244:8: ( 'return' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:244:10: 'return'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:210:6: ( 'read' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:210:8: 'read'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:245:6: ( 'read' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:245:8: 'read'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:211:7: ( 'write' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:211:9: 'write'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:246:7: ( 'write' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:246:9: 'write'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:212:6: ( 'true' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:212:8: 'true'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:247:9: ( 'true' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:247:11: 'true'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:213:7: ( 'false' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:213:9: 'false'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:248:9: ( 'false' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:248:11: 'false'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:214:7: ( 'begin' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:214:9: 'begin'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:249:9: ( 'begin' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:249:11: 'begin'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:215:5: ( 'end' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:215:7: 'end'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:250:9: ( 'end' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:250:11: 'end'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "DURATION"
    public final void mDURATION() throws RecognitionException {
        try {
            int _type = DURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:216:9: ( 'duration' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:216:11: 'duration'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:251:9: ( 'duration' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:251:11: 'duration'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("duration"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DURATION"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:217:8: ( 'Create' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:217:10: 'Create'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:252:9: ( 'Create' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:252:11: 'Create'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("Create"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DESTROY"
    public final void mDESTROY() throws RecognitionException {
        try {
            int _type = DESTROY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:218:9: ( 'Destroy' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:218:11: 'Destroy'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:253:9: ( 'Destroy' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:253:11: 'Destroy'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("Destroy"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESTROY"

    // $ANTLR start "MOVE"
    public final void mMOVE() throws RecognitionException {
        try {
            int _type = MOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:219:6: ( 'Move' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:219:8: 'Move'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:254:9: ( 'Move' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:254:11: 'Move'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("Move"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOVE"

    // $ANTLR start "TRANSLATE"
    public final void mTRANSLATE() throws RecognitionException {
        try {
            int _type = TRANSLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:220:11: ( 'Translate' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:220:13: 'Translate'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:255:11: ( 'Translate' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:255:13: 'Translate'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("Translate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRANSLATE"

    // $ANTLR start "MODIFY"
    public final void mMODIFY() throws RecognitionException {
        try {
            int _type = MODIFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:221:8: ( 'Modify' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:221:10: 'Modify'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:256:9: ( 'Modify' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:256:11: 'Modify'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("Modify"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODIFY"

    // $ANTLR start "ROTATE"
    public final void mROTATE() throws RecognitionException {
        try {
            int _type = ROTATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:222:8: ( 'Rotate' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:222:10: 'Rotate'
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:257:9: ( 'Rotate' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:257:11: 'Rotate'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match("Rotate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROTATE"

    // $ANTLR start "TYPE_OBJECT"
    public final void mTYPE_OBJECT() throws RecognitionException {
        try {
            int _type = TYPE_OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:223:13: ( 'Rectangle' | 'Circle' | 'Text' )
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:258:13: ( 'Rectangle' | 'Circle' | 'Text' )
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'R':
                {
                alt1=1;
                }
                break;
            case 'C':
                {
                alt1=2;
                }
                break;
            case 'T':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
<<<<<<< HEAD
                    // /home/carlos/CL/Practica/src/parser/Asl.g:223:15: 'Rectangle'
=======
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:258:15: 'Rectangle'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    {
                    match("Rectangle"); 



                    }
                    break;
                case 2 :
<<<<<<< HEAD
                    // /home/carlos/CL/Practica/src/parser/Asl.g:223:29: 'Circle'
=======
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:258:29: 'Circle'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    {
                    match("Circle"); 



                    }
                    break;
                case 3 :
<<<<<<< HEAD
                    // /home/carlos/CL/Practica/src/parser/Asl.g:223:40: 'Text'
=======
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:258:40: 'Text'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    {
                    match("Text"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_OBJECT"

    // $ANTLR start "ATTRIBUTE"
    public final void mATTRIBUTE() throws RecognitionException {
        try {
            int _type = ATTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:224:11: ( 'width' | 'height' | 'style' )
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:259:11: ( 'width' | 'height' | 'style' )
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'w':
                {
                alt2=1;
                }
                break;
            case 'h':
                {
                alt2=2;
                }
                break;
            case 's':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
<<<<<<< HEAD
                    // /home/carlos/CL/Practica/src/parser/Asl.g:224:13: 'width'
=======
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:259:13: 'width'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    {
                    match("width"); 



                    }
                    break;
                case 2 :
<<<<<<< HEAD
                    // /home/carlos/CL/Practica/src/parser/Asl.g:224:23: 'height'
=======
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:259:23: 'height'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    {
                    match("height"); 



                    }
                    break;
                case 3 :
<<<<<<< HEAD
                    // /home/carlos/CL/Practica/src/parser/Asl.g:224:34: 'style'
=======
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:259:34: 'style'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    {
                    match("style"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ATTRIBUTE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:225:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/carlos/CL/Practica/src/parser/Asl.g:225:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:260:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:260:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:225:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:260:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
<<<<<<< HEAD
            	    // /home/carlos/CL/Practica/src/parser/Asl.g:
=======
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:226:5: ( ( '0' .. '9' )+ )
            // /home/carlos/CL/Practica/src/parser/Asl.g:226:9: ( '0' .. '9' )+
            {
            // /home/carlos/CL/Practica/src/parser/Asl.g:226:9: ( '0' .. '9' )+
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:261:6: ( ( '0' .. '9' )+ )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:261:8: ( '0' .. '9' )+
            {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:261:8: ( '0' .. '9' )+
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
<<<<<<< HEAD
            	    // /home/carlos/CL/Practica/src/parser/Asl.g:
=======
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:228:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:264:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
<<<<<<< HEAD
                    // /home/carlos/CL/Practica/src/parser/Asl.g:228:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
=======
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:264:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    {
                    match("//"); 



<<<<<<< HEAD
                    // /home/carlos/CL/Practica/src/parser/Asl.g:228:16: (~ ( '\\n' | '\\r' ) )*
=======
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:264:16: (~ ( '\\n' | '\\r' ) )*
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
<<<<<<< HEAD
                    	    // /home/carlos/CL/Practica/src/parser/Asl.g:
=======
                    	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


<<<<<<< HEAD
                    // /home/carlos/CL/Practica/src/parser/Asl.g:228:30: ( '\\r' )?
=======
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:264:30: ( '\\r' )?
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
<<<<<<< HEAD
                            // /home/carlos/CL/Practica/src/parser/Asl.g:228:30: '\\r'
=======
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:264:30: '\\r'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
<<<<<<< HEAD
                    // /home/carlos/CL/Practica/src/parser/Asl.g:229:3: '/*' ( options {greedy=false; } : . )* '*/'
=======
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:265:8: '/*' ( options {greedy=false; } : . )* '*/'
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    {
                    match("/*"); 



<<<<<<< HEAD
                    // /home/carlos/CL/Practica/src/parser/Asl.g:229:8: ( options {greedy=false; } : . )*
=======
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:265:13: ( options {greedy=false; } : . )*
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
<<<<<<< HEAD
                    	    // /home/carlos/CL/Practica/src/parser/Asl.g:229:36: .
=======
                    	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:265:41: .
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:232:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/carlos/CL/Practica/src/parser/Asl.g:232:10: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/carlos/CL/Practica/src/parser/Asl.g:232:14: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:269:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:269:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:269:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
<<<<<<< HEAD
            	    // /home/carlos/CL/Practica/src/parser/Asl.g:232:16: ESC_SEQ
=======
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:269:18: ESC_SEQ
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
<<<<<<< HEAD
            	    // /home/carlos/CL/Practica/src/parser/Asl.g:232:26: ~ ( '\\\\' | '\"' )
=======
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:269:28: ~ ( '\\\\' | '\"' )
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:237:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/carlos/CL/Practica/src/parser/Asl.g:237:3: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:275:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:275:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /home/carlos/CL/Practica/src/parser/Asl.g:239:4: ( ( ' ' | '\\t' | '\\r' ) )
            // /home/carlos/CL/Practica/src/parser/Asl.g:239:6: ( ' ' | '\\t' | '\\r' )
=======
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:278:6: ( ( ' ' | '\\t' | '\\r' ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:278:8: ( ' ' | '\\t' | '\\r' )
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
<<<<<<< HEAD
        // /home/carlos/CL/Practica/src/parser/Asl.g:1:8: ( T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | ENDLINE | EQUAL | COND_EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | ELSEIF | ENDIF | WHILE | FOR | ENDWHILE | ENDFOR | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | BEGIN | END | DURATION | CREATE | DESTROY | MOVE | TRANSLATE | MODIFY | ROTATE | TYPE_OBJECT | ATTRIBUTE | ID | INT | COMMENT | STRING | WS )
        int alt10=55;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:10: T__63
                {
                mT__63(); 
=======
        // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:8: ( T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | ENDLINE | EQUAL | COND_EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | ELSEIF | ENDIF | WHILE | FOR | ENDWHILE | ENDFOR | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | BEGIN | END | DURATION | CREATE | DESTROY | MOVE | TRANSLATE | MODIFY | ROTATE | TYPE_OBJECT | ATTRIBUTE | ID | INT | COMMENT | STRING | WS )
        int alt10=54;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:10: T__62
                {
                mT__62(); 
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a


                }
                break;
            case 2 :
<<<<<<< HEAD
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:16: T__64
                {
                mT__64(); 
=======
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:16: T__63
                {
                mT__63(); 
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a


                }
                break;
            case 3 :
<<<<<<< HEAD
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:22: T__65
                {
                mT__65(); 
=======
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:22: T__64
                {
                mT__64(); 
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a


                }
                break;
            case 4 :
<<<<<<< HEAD
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:28: T__66
                {
                mT__66(); 
=======
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:28: T__65
                {
                mT__65(); 
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a


                }
                break;
            case 5 :
<<<<<<< HEAD
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:34: T__67
                {
                mT__67(); 
=======
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:34: T__66
                {
                mT__66(); 
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a


                }
                break;
            case 6 :
<<<<<<< HEAD
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:40: T__68
                {
                mT__68(); 
=======
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:40: T__67
                {
                mT__67(); 
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a


                }
                break;
            case 7 :
<<<<<<< HEAD
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:46: T__69
                {
                mT__69(); 
=======
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:46: T__68
                {
                mT__68(); 
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a


                }
                break;
            case 8 :
<<<<<<< HEAD
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:52: T__70
                {
                mT__70(); 


                }
                break;
            case 9 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:58: ENDLINE
=======
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:52: ENDLINE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mENDLINE(); 


                }
                break;
<<<<<<< HEAD
            case 10 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:66: EQUAL
=======
            case 9 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:60: EQUAL
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mEQUAL(); 


                }
                break;
<<<<<<< HEAD
            case 11 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:72: COND_EQUAL
=======
            case 10 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:66: COND_EQUAL
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mCOND_EQUAL(); 


                }
                break;
<<<<<<< HEAD
            case 12 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:83: NOT_EQUAL
=======
            case 11 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:77: NOT_EQUAL
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mNOT_EQUAL(); 


                }
                break;
<<<<<<< HEAD
            case 13 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:93: LT
=======
            case 12 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:87: LT
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mLT(); 


                }
                break;
<<<<<<< HEAD
            case 14 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:96: LE
=======
            case 13 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:90: LE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mLE(); 


                }
                break;
<<<<<<< HEAD
            case 15 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:99: GT
=======
            case 14 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:93: GT
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mGT(); 


                }
                break;
<<<<<<< HEAD
            case 16 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:102: GE
=======
            case 15 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:96: GE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mGE(); 


                }
                break;
<<<<<<< HEAD
            case 17 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:105: PLUS
=======
            case 16 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:99: PLUS
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mPLUS(); 


                }
                break;
<<<<<<< HEAD
            case 18 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:110: MINUS
=======
            case 17 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:104: MINUS
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mMINUS(); 


                }
                break;
<<<<<<< HEAD
            case 19 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:116: MUL
=======
            case 18 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:110: MUL
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mMUL(); 


                }
                break;
<<<<<<< HEAD
            case 20 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:120: DIV
=======
            case 19 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:114: DIV
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mDIV(); 


                }
                break;
<<<<<<< HEAD
            case 21 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:124: MOD
=======
            case 20 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:118: MOD
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mMOD(); 


                }
                break;
<<<<<<< HEAD
            case 22 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:128: NOT
=======
            case 21 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:122: NOT
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mNOT(); 


                }
                break;
<<<<<<< HEAD
            case 23 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:132: AND
=======
            case 22 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:126: AND
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mAND(); 


                }
                break;
<<<<<<< HEAD
            case 24 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:136: OR
=======
            case 23 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:130: OR
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mOR(); 


                }
                break;
<<<<<<< HEAD
            case 25 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:139: IF
=======
            case 24 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:133: IF
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mIF(); 


                }
                break;
<<<<<<< HEAD
            case 26 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:142: ELSE
=======
            case 25 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:136: ELSE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mELSE(); 


                }
                break;
<<<<<<< HEAD
            case 27 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:147: ELSEIF
=======
            case 26 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:141: ELSEIF
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mELSEIF(); 


                }
                break;
<<<<<<< HEAD
            case 28 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:154: ENDIF
=======
            case 27 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:148: ENDIF
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mENDIF(); 


                }
                break;
<<<<<<< HEAD
            case 29 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:160: WHILE
=======
            case 28 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:154: WHILE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mWHILE(); 


                }
                break;
<<<<<<< HEAD
            case 30 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:166: FOR
=======
            case 29 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:160: FOR
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mFOR(); 


                }
                break;
<<<<<<< HEAD
            case 31 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:170: ENDWHILE
=======
            case 30 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:164: ENDWHILE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mENDWHILE(); 


                }
                break;
<<<<<<< HEAD
            case 32 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:179: ENDFOR
=======
            case 31 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:173: ENDFOR
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mENDFOR(); 


                }
                break;
<<<<<<< HEAD
            case 33 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:186: FUNC
=======
            case 32 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:180: FUNC
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mFUNC(); 


                }
                break;
<<<<<<< HEAD
            case 34 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:191: ENDFUNC
=======
            case 33 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:185: ENDFUNC
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mENDFUNC(); 


                }
                break;
<<<<<<< HEAD
            case 35 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:199: RETURN
=======
            case 34 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:193: RETURN
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mRETURN(); 


                }
                break;
<<<<<<< HEAD
            case 36 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:206: READ
=======
            case 35 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:200: READ
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mREAD(); 


                }
                break;
<<<<<<< HEAD
            case 37 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:211: WRITE
=======
            case 36 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:205: WRITE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mWRITE(); 


                }
                break;
<<<<<<< HEAD
            case 38 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:217: TRUE
=======
            case 37 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:211: TRUE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mTRUE(); 


                }
                break;
<<<<<<< HEAD
            case 39 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:222: FALSE
=======
            case 38 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:216: FALSE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mFALSE(); 


                }
                break;
<<<<<<< HEAD
            case 40 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:228: BEGIN
=======
            case 39 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:222: BEGIN
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mBEGIN(); 


                }
                break;
<<<<<<< HEAD
            case 41 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:234: END
=======
            case 40 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:228: END
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mEND(); 


                }
                break;
<<<<<<< HEAD
            case 42 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:238: DURATION
=======
            case 41 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:232: DURATION
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mDURATION(); 


                }
                break;
<<<<<<< HEAD
            case 43 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:247: CREATE
=======
            case 42 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:241: CREATE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mCREATE(); 


                }
                break;
<<<<<<< HEAD
            case 44 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:254: DESTROY
=======
            case 43 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:248: DESTROY
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mDESTROY(); 


                }
                break;
<<<<<<< HEAD
            case 45 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:262: MOVE
=======
            case 44 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:256: MOVE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mMOVE(); 


                }
                break;
<<<<<<< HEAD
            case 46 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:267: TRANSLATE
=======
            case 45 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:261: TRANSLATE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mTRANSLATE(); 


                }
                break;
<<<<<<< HEAD
            case 47 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:277: MODIFY
=======
            case 46 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:271: MODIFY
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mMODIFY(); 


                }
                break;
<<<<<<< HEAD
            case 48 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:284: ROTATE
=======
            case 47 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:278: ROTATE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mROTATE(); 


                }
                break;
<<<<<<< HEAD
            case 49 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:291: TYPE_OBJECT
=======
            case 48 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:285: TYPE_OBJECT
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mTYPE_OBJECT(); 


                }
                break;
<<<<<<< HEAD
            case 50 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:303: ATTRIBUTE
=======
            case 49 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:297: ATTRIBUTE
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mATTRIBUTE(); 


                }
                break;
<<<<<<< HEAD
            case 51 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:313: ID
=======
            case 50 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:307: ID
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mID(); 


                }
                break;
<<<<<<< HEAD
            case 52 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:316: INT
=======
            case 51 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:310: INT
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mINT(); 


                }
                break;
<<<<<<< HEAD
            case 53 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:320: COMMENT
=======
            case 52 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:314: COMMENT
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mCOMMENT(); 


                }
                break;
<<<<<<< HEAD
            case 54 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:328: STRING
=======
            case 53 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:322: STRING
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mSTRING(); 


                }
                break;
<<<<<<< HEAD
            case 55 :
                // /home/carlos/CL/Practica/src/parser/Asl.g:1:335: WS
=======
            case 54 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:329: WS
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
<<<<<<< HEAD
        "\12\uffff\1\52\1\uffff\1\54\1\56\3\uffff\1\60\1\uffff\22\45\14\uffff"+
        "\2\45\1\115\1\116\26\45\1\147\1\150\2\uffff\1\45\1\155\3\45\1\161"+
        "\22\45\2\uffff\1\u0085\3\45\1\uffff\3\45\1\uffff\1\u008d\2\45\1"+
        "\u0090\1\u0091\5\45\1\u0097\2\45\1\u009a\5\45\1\uffff\1\u00a0\3"+
        "\45\1\u00a4\1\u00a5\1\u00a6\1\uffff\1\u00a7\1\45\2\uffff\1\u00a9"+
        "\4\45\1\uffff\2\45\1\uffff\3\45\1\u00a6\1\u00b3\1\uffff\1\45\1\u00b5"+
        "\1\45\4\uffff\1\u00b7\1\uffff\1\45\1\u00b9\1\u009a\1\45\1\u00bb"+
        "\1\45\1\u00bd\1\45\1\u00a6\1\uffff\1\45\1\uffff\1\u00c0\1\uffff"+
        "\1\45\1\uffff\1\u00c2\1\uffff\1\45\1\uffff\1\45\1\u00c5\1\uffff"+
        "\1\u00c6\1\uffff\2\45\2\uffff\1\u00c9\1\u009a\1\uffff";
    static final String DFA10_eofS =
        "\u00ca\uffff";
    static final String DFA10_minS =
        "\1\11\11\uffff\1\75\1\uffff\2\75\3\uffff\1\52\1\uffff\1\157\1\156"+
=======
        "\11\uffff\1\51\1\uffff\1\53\1\55\3\uffff\1\57\1\uffff\22\44\14\uffff"+
        "\2\44\1\114\1\115\26\44\1\146\1\147\2\uffff\1\44\1\154\3\44\1\160"+
        "\22\44\2\uffff\1\u0084\3\44\1\uffff\3\44\1\uffff\1\u008c\2\44\1"+
        "\u008f\1\u0090\5\44\1\u0096\2\44\1\u0099\5\44\1\uffff\1\u009f\3"+
        "\44\1\u00a3\1\u00a4\1\u00a5\1\uffff\1\u00a6\1\44\2\uffff\1\u00a8"+
        "\4\44\1\uffff\2\44\1\uffff\3\44\1\u00a5\1\u00b2\1\uffff\1\44\1\u00b4"+
        "\1\44\4\uffff\1\u00b6\1\uffff\1\44\1\u00b8\1\u0099\1\44\1\u00ba"+
        "\1\44\1\u00bc\1\44\1\u00a5\1\uffff\1\44\1\uffff\1\u00bf\1\uffff"+
        "\1\44\1\uffff\1\u00c1\1\uffff\1\44\1\uffff\1\44\1\u00c4\1\uffff"+
        "\1\u00c5\1\uffff\2\44\2\uffff\1\u00c8\1\u0099\1\uffff";
    static final String DFA10_eofS =
        "\u00c9\uffff";
    static final String DFA10_minS =
        "\1\11\10\uffff\1\75\1\uffff\2\75\3\uffff\1\52\1\uffff\1\157\1\156"+
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
        "\1\162\1\146\1\154\1\150\1\141\1\145\1\162\1\145\1\165\1\151\1\145"+
        "\1\157\3\145\1\164\14\uffff\1\164\1\144\2\60\1\163\1\144\2\151\1"+
        "\144\1\162\1\156\1\154\1\141\1\165\1\147\1\162\1\145\1\162\1\163"+
        "\1\144\1\141\1\170\1\164\1\143\1\151\1\171\2\60\2\uffff\1\145\1"+
        "\60\1\154\2\164\1\60\1\143\1\163\1\165\1\144\1\145\1\151\2\141\1"+
        "\143\1\164\1\145\1\151\1\156\1\164\1\141\1\164\1\147\1\154\2\uffff"+
        "\1\60\1\146\1\150\1\157\1\uffff\2\145\1\150\1\uffff\1\60\1\145\1"+
        "\162\2\60\1\156\2\164\1\154\1\162\1\60\1\146\1\163\1\60\1\164\1"+
        "\141\1\150\1\145\1\146\1\uffff\1\60\1\151\1\162\1\156\3\60\1\uffff"+
        "\1\60\1\156\2\uffff\1\60\1\151\2\145\1\157\1\uffff\1\171\1\154\1"+
        "\uffff\1\145\1\156\1\164\2\60\1\uffff\1\154\1\60\1\143\4\uffff\1"+
        "\60\1\uffff\1\157\2\60\1\171\1\60\1\141\1\60\1\147\1\60\1\uffff"+
        "\1\145\1\uffff\1\60\1\uffff\1\156\1\uffff\1\60\1\uffff\1\164\1\uffff"+
        "\1\154\1\60\1\uffff\1\60\1\uffff\2\145\2\uffff\2\60\1\uffff";
    static final String DFA10_maxS =
<<<<<<< HEAD
        "\1\175\11\uffff\1\75\1\uffff\2\75\3\uffff\1\57\1\uffff\1\157\1\156"+
=======
        "\1\175\10\uffff\1\75\1\uffff\2\75\3\uffff\1\57\1\uffff\1\157\1\156"+
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
        "\1\162\1\146\1\156\1\162\1\165\1\145\1\162\1\145\1\165\1\162\1\145"+
        "\1\157\1\162\1\157\1\145\1\164\14\uffff\1\164\1\144\2\172\1\163"+
        "\1\144\2\151\1\144\1\162\1\156\1\154\1\164\1\165\1\147\1\162\1\145"+
        "\1\162\1\163\1\166\1\141\1\170\1\164\1\143\1\151\1\171\2\172\2\uffff"+
        "\1\145\1\172\1\154\2\164\1\172\1\143\1\163\1\165\1\144\1\145\1\151"+
        "\2\141\1\143\1\164\1\145\1\151\1\156\1\164\1\141\1\164\1\147\1\154"+
        "\2\uffff\1\172\1\146\1\150\1\165\1\uffff\2\145\1\150\1\uffff\1\172"+
        "\1\145\1\162\2\172\1\156\2\164\1\154\1\162\1\172\1\146\1\163\1\172"+
        "\1\164\1\141\1\150\1\145\1\146\1\uffff\1\172\1\151\1\162\1\156\3"+
        "\172\1\uffff\1\172\1\156\2\uffff\1\172\1\151\2\145\1\157\1\uffff"+
        "\1\171\1\154\1\uffff\1\145\1\156\1\164\2\172\1\uffff\1\154\1\172"+
        "\1\143\4\uffff\1\172\1\uffff\1\157\2\172\1\171\1\172\1\141\1\172"+
        "\1\147\1\172\1\uffff\1\145\1\uffff\1\172\1\uffff\1\156\1\uffff\1"+
        "\172\1\uffff\1\164\1\uffff\1\154\1\172\1\uffff\1\172\1\uffff\2\145"+
        "\2\uffff\2\172\1\uffff";
    static final String DFA10_acceptS =
<<<<<<< HEAD
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\14\2\uffff"+
        "\1\21\1\22\1\23\1\uffff\1\25\22\uffff\1\63\1\64\1\66\1\67\1\13\1"+
        "\12\1\16\1\15\1\20\1\17\1\65\1\24\34\uffff\1\30\1\31\30\uffff\1"+
        "\26\1\27\4\uffff\1\51\3\uffff\1\36\23\uffff\1\32\7\uffff\1\41\2"+
        "\uffff\1\44\1\46\5\uffff\1\55\2\uffff\1\61\5\uffff\1\34\3\uffff"+
        "\1\35\1\45\1\62\1\47\1\uffff\1\50\11\uffff\1\33\1\uffff\1\40\1\uffff"+
        "\1\43\1\uffff\1\53\1\uffff\1\57\1\uffff\1\60\2\uffff\1\42\1\uffff"+
        "\1\54\2\uffff\1\37\1\52\2\uffff\1\56";
    static final String DFA10_specialS =
        "\u00ca\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\50\1\11\2\uffff\1\50\22\uffff\1\50\1\13\1\47\2\uffff\1\22"+
            "\2\uffff\1\1\1\2\1\20\1\16\1\3\1\17\1\4\1\21\12\46\1\uffff\1"+
            "\5\1\14\1\12\1\15\1\uffff\1\6\2\45\1\36\1\37\10\45\1\40\4\45"+
            "\1\42\1\45\1\41\6\45\4\uffff\1\45\1\uffff\1\24\1\34\1\45\1\35"+
            "\1\27\1\31\1\45\1\43\1\26\4\45\1\23\1\25\2\45\1\32\1\44\1\33"+
            "\2\45\1\30\3\45\1\7\1\uffff\1\10",
            "",
=======
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\2\uffff\1"+
        "\20\1\21\1\22\1\uffff\1\24\22\uffff\1\62\1\63\1\65\1\66\1\12\1\11"+
        "\1\15\1\14\1\17\1\16\1\64\1\23\34\uffff\1\27\1\30\30\uffff\1\25"+
        "\1\26\4\uffff\1\50\3\uffff\1\35\23\uffff\1\31\7\uffff\1\40\2\uffff"+
        "\1\43\1\45\5\uffff\1\54\2\uffff\1\60\5\uffff\1\33\3\uffff\1\34\1"+
        "\44\1\61\1\46\1\uffff\1\47\11\uffff\1\32\1\uffff\1\37\1\uffff\1"+
        "\42\1\uffff\1\52\1\uffff\1\56\1\uffff\1\57\2\uffff\1\41\1\uffff"+
        "\1\53\2\uffff\1\36\1\51\2\uffff\1\55";
    static final String DFA10_specialS =
        "\u00c9\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\47\1\10\2\uffff\1\47\22\uffff\1\47\1\12\1\46\2\uffff\1\21"+
            "\2\uffff\1\1\1\2\1\17\1\15\1\3\1\16\1\uffff\1\20\12\45\1\uffff"+
            "\1\4\1\13\1\11\1\14\1\uffff\1\5\2\44\1\35\1\36\10\44\1\37\4"+
            "\44\1\41\1\44\1\40\6\44\4\uffff\1\44\1\uffff\1\23\1\33\1\44"+
            "\1\34\1\26\1\30\1\44\1\42\1\25\4\44\1\22\1\24\2\44\1\31\1\43"+
            "\1\32\2\44\1\27\3\44\1\6\1\uffff\1\7",
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
<<<<<<< HEAD
            "\1\51",
            "",
            "\1\53",
            "\1\55",
            "",
            "",
            "",
            "\1\57\4\uffff\1\57",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65\1\uffff\1\66",
            "\1\67\1\71\10\uffff\1\70",
            "\1\74\15\uffff\1\72\5\uffff\1\73",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\102\10\uffff\1\101",
            "\1\103",
            "\1\104",
            "\1\106\14\uffff\1\105",
            "\1\110\11\uffff\1\107",
            "\1\111",
            "\1\112",
=======
            "\1\50",
            "",
            "\1\52",
            "\1\54",
            "",
            "",
            "",
            "\1\56\4\uffff\1\56",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\1\uffff\1\65",
            "\1\66\1\70\10\uffff\1\67",
            "\1\73\15\uffff\1\71\5\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\101\10\uffff\1\100",
            "\1\102",
            "\1\103",
            "\1\105\14\uffff\1\104",
            "\1\107\11\uffff\1\106",
            "\1\110",
            "\1\111",
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
<<<<<<< HEAD
            "\1\113",
            "\1\114",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
=======
            "\1\112",
            "\1\113",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\116",
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
<<<<<<< HEAD
            "\1\126",
            "\1\130\22\uffff\1\127",
=======
            "\1\127\22\uffff\1\126",
            "\1\130",
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
<<<<<<< HEAD
            "\1\136",
            "\1\140\21\uffff\1\137",
=======
            "\1\137\21\uffff\1\136",
            "\1\140",
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
<<<<<<< HEAD
            "\1\146",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\151",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\5\45\1\154\2\45\1"+
            "\152\15\45\1\153\3\45",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
=======
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\150",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\5\44\1\153\2\44\1"+
            "\151\15\44\1\152\3\44",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\161",
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
<<<<<<< HEAD
            "\1\u0083",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\u0084\21"+
            "\45",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\5\uffff\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u008e",
            "\1\u008f",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
=======
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\u0083\21"+
            "\44",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087\5\uffff\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008d",
            "\1\u008e",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0091",
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
<<<<<<< HEAD
            "\1\u0096",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0098",
            "\1\u0099",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
=======
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0097",
            "\1\u0098",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009a",
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
<<<<<<< HEAD
            "\1\u009f",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a8",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00b4",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b6",
=======
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a7",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00b3",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b5",
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            "",
            "",
            "",
            "",
<<<<<<< HEAD
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00b8",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ba",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00bc",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00be",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00bf",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00c1",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
=======
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00b7",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b9",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00bb",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00bd",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00be",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00c0",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
<<<<<<< HEAD
            return "1:1: Tokens : ( T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | ENDLINE | EQUAL | COND_EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | ELSEIF | ENDIF | WHILE | FOR | ENDWHILE | ENDFOR | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | BEGIN | END | DURATION | CREATE | DESTROY | MOVE | TRANSLATE | MODIFY | ROTATE | TYPE_OBJECT | ATTRIBUTE | ID | INT | COMMENT | STRING | WS );";
=======
            return "1:1: Tokens : ( T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | ENDLINE | EQUAL | COND_EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | ELSEIF | ENDIF | WHILE | FOR | ENDWHILE | ENDFOR | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | BEGIN | END | DURATION | CREATE | DESTROY | MOVE | TRANSLATE | MODIFY | ROTATE | TYPE_OBJECT | ATTRIBUTE | ID | INT | COMMENT | STRING | WS );";
>>>>>>> 8233c8c15b040d82ca9190899d9ac7a39a5a4f6a
        }
    }
 

}