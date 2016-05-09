// $ANTLR 3.4 /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g 2016-05-09 09:11:33

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESATTRIBUTE", "AND", "ANIMATION", "ARGLIST", "ASSIGN", "ATTRIBUTE", "ATTRIBUTES", "BEGIN", "BOOLEAN", "COMMENT", "COND_EQUAL", "CREATE", "CREATE_INSTR", "DESTROY", "DIV", "DURATION", "ELSE", "ELSEIF", "END", "ENDFOR", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FOR", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "IN", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MODIFY", "MOVE", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "READ", "RETURN", "ROTATE", "STRING", "TIMEANNOTATION", "TRANSLATE", "TRUE", "TYPE_OBJECT", "WHILE", "WRITE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'@'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int ACCESATTRIBUTE=4;
    public static final int AND=5;
    public static final int ANIMATION=6;
    public static final int ARGLIST=7;
    public static final int ASSIGN=8;
    public static final int ATTRIBUTE=9;
    public static final int ATTRIBUTES=10;
    public static final int BEGIN=11;
    public static final int BOOLEAN=12;
    public static final int COMMENT=13;
    public static final int COND_EQUAL=14;
    public static final int CREATE=15;
    public static final int CREATE_INSTR=16;
    public static final int DESTROY=17;
    public static final int DIV=18;
    public static final int DURATION=19;
    public static final int ELSE=20;
    public static final int ELSEIF=21;
    public static final int END=22;
    public static final int ENDFOR=23;
    public static final int ENDFUNC=24;
    public static final int ENDIF=25;
    public static final int ENDWHILE=26;
    public static final int EQUAL=27;
    public static final int ESC_SEQ=28;
    public static final int FALSE=29;
    public static final int FOR=30;
    public static final int FUNC=31;
    public static final int FUNCALL=32;
    public static final int GE=33;
    public static final int GT=34;
    public static final int ID=35;
    public static final int IF=36;
    public static final int IN=37;
    public static final int INT=38;
    public static final int LE=39;
    public static final int LIST_FUNCTIONS=40;
    public static final int LIST_INSTR=41;
    public static final int LT=42;
    public static final int MINUS=43;
    public static final int MOD=44;
    public static final int MODIFY=45;
    public static final int MOVE=46;
    public static final int MUL=47;
    public static final int NOT=48;
    public static final int NOT_EQUAL=49;
    public static final int OR=50;
    public static final int PARAMS=51;
    public static final int PLUS=52;
    public static final int PREF=53;
    public static final int READ=54;
    public static final int RETURN=55;
    public static final int ROTATE=56;
    public static final int STRING=57;
    public static final int TIMEANNOTATION=58;
    public static final int TRANSLATE=59;
    public static final int TRUE=60;
    public static final int TYPE_OBJECT=61;
    public static final int WHILE=62;
    public static final int WRITE=63;
    public static final int WS=64;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:60:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_return func1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:60:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:60:8: ( func )+ EOF
            {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:60:8: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:60:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog99);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog102);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 60:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:60:21: ^( LIST_FUNCTIONS ( func )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:63:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:63:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:63:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func120); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func123); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func125);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func127);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func129); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:66:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:66:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:66:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,65,FOLLOW_65_in_params140);  
            stream_65.add(char_literal8);


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:66:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:66:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params142);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,66,FOLLOW_66_in_params145);  
            stream_66.add(char_literal10);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 66:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:66:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:66:41: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:69:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:69:10: ( param ( ',' ! param )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:69:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist162);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:69:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==67) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:69:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,67,FOLLOW_67_in_paramlist165); 

            	    pushFollow(FOLLOW_param_in_paramlist168);
            	    param13=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:73:1: param : id= ID -> ^( PREF[$id,$id.text] ) ;
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;

        AslTree id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:73:7: (id= ID -> ^( PREF[$id,$id.text] ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:73:9: id= ID
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_param182);  
            stream_ID.add(id);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 73:15: -> ^( PREF[$id,$id.text] )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:73:18: ^( PREF[$id,$id.text] )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:76:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal15=null;
        AslParser.instruction_return instruction14 =null;

        AslParser.instruction_return instruction16 =null;


        AslTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:77:5: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:77:5: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions200);
            instruction14=instruction();

            state._fsp--;

            stream_instruction.add(instruction14.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:77:17: ( ';' instruction )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==70) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:77:18: ';' instruction
            	    {
            	    char_literal15=(Token)match(input,70,FOLLOW_70_in_block_instructions203);  
            	    stream_70.add(char_literal15);


            	    pushFollow(FOLLOW_instruction_in_block_instructions205);
            	    instruction16=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction16.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 78:4: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:78:4: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:81:1: instruction : ( assign | basic_instruction | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | time_annotation |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign17 =null;

        AslParser.basic_instruction_return basic_instruction18 =null;

        AslParser.ite_stmt_return ite_stmt19 =null;

        AslParser.while_stmt_return while_stmt20 =null;

        AslParser.for_stmt_return for_stmt21 =null;

        AslParser.funcall_return funcall22 =null;

        AslParser.return_stmt_return return_stmt23 =null;

        AslParser.time_annotation_return time_annotation24 =null;



        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:82:5: ( assign | basic_instruction | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | time_annotation |)
            int alt5=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EQUAL) ) {
                    alt5=1;
                }
                else if ( (LA5_1==65) ) {
                    alt5=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
                }
                break;
            case CREATE:
            case DESTROY:
            case MODIFY:
            case MOVE:
            case ROTATE:
            case TRANSLATE:
                {
                alt5=2;
                }
                break;
            case IF:
                {
                alt5=3;
                }
                break;
            case WHILE:
                {
                alt5=4;
                }
                break;
            case FOR:
                {
                alt5=5;
                }
                break;
            case RETURN:
                {
                alt5=7;
                }
                break;
            case 71:
                {
                alt5=8;
                }
                break;
            case ELSE:
            case ELSEIF:
            case ENDFOR:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 70:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:82:5: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction227);
                    assign17=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign17.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:83:3: basic_instruction
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_basic_instruction_in_instruction232);
                    basic_instruction18=basic_instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_instruction18.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:84:3: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction237);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:85:3: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction242);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:86:3: for_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction247);
                    for_stmt21=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt21.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:87:3: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction252);
                    funcall22=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall22.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:88:3: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction257);
                    return_stmt23=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt23.getTree());

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:89:3: time_annotation
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_time_annotation_in_instruction262);
                    time_annotation24=time_annotation();

                    state._fsp--;

                    adaptor.addChild(root_0, time_annotation24.getTree());

                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:91:1: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:93:1: assign : ( ID eq= EQUAL basic_instruction -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction ) | ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) );
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID25=null;
        Token ID27=null;
        AslParser.basic_instruction_return basic_instruction26 =null;

        AslParser.expr_return expr28 =null;


        AslTree eq_tree=null;
        AslTree ID25_tree=null;
        AslTree ID27_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_basic_instruction=new RewriteRuleSubtreeStream(adaptor,"rule basic_instruction");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:93:8: ( ID eq= EQUAL basic_instruction -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction ) | ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==CREATE||LA6_2==DESTROY||(LA6_2 >= MODIFY && LA6_2 <= MOVE)||LA6_2==ROTATE||LA6_2==TRANSLATE) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==FALSE||LA6_2==ID||LA6_2==INT||LA6_2==MINUS||LA6_2==NOT||LA6_2==PLUS||LA6_2==TRUE||LA6_2==65) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:93:13: ID eq= EQUAL basic_instruction
                    {
                    ID25=(Token)match(input,ID,FOLLOW_ID_in_assign278);  
                    stream_ID.add(ID25);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign282);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_basic_instruction_in_assign284);
                    basic_instruction26=basic_instruction();

                    state._fsp--;

                    stream_basic_instruction.add(basic_instruction26.getTree());

                    // AST REWRITE
                    // elements: ID, basic_instruction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 93:43: -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction )
                    {
                        // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:93:46: ^( ASSIGN[$eq,\":=\"] ID basic_instruction )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ASSIGN, eq, ":=")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_basic_instruction.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:94:3: ID eq= EQUAL expr
                    {
                    ID27=(Token)match(input,ID,FOLLOW_ID_in_assign300);  
                    stream_ID.add(ID27);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign304);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign306);
                    expr28=expr();

                    state._fsp--;

                    stream_expr.add(expr28.getTree());

                    // AST REWRITE
                    // elements: ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 94:20: -> ^( ASSIGN[$eq,\":=\"] ID expr )
                    {
                        // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:94:23: ^( ASSIGN[$eq,\":=\"] ID expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ASSIGN, eq, ":=")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class basic_instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "basic_instruction"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:96:1: basic_instruction : ( create | destroy | move | translate | modify | rotate );
    public final AslParser.basic_instruction_return basic_instruction() throws RecognitionException {
        AslParser.basic_instruction_return retval = new AslParser.basic_instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.create_return create29 =null;

        AslParser.destroy_return destroy30 =null;

        AslParser.move_return move31 =null;

        AslParser.translate_return translate32 =null;

        AslParser.modify_return modify33 =null;

        AslParser.rotate_return rotate34 =null;



        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:96:18: ( create | destroy | move | translate | modify | rotate )
            int alt7=6;
            switch ( input.LA(1) ) {
            case CREATE:
                {
                alt7=1;
                }
                break;
            case DESTROY:
                {
                alt7=2;
                }
                break;
            case MOVE:
                {
                alt7=3;
                }
                break;
            case TRANSLATE:
                {
                alt7=4;
                }
                break;
            case MODIFY:
                {
                alt7=5;
                }
                break;
            case ROTATE:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:97:1: create
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_create_in_basic_instruction325);
                    create29=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create29.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:98:3: destroy
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_destroy_in_basic_instruction329);
                    destroy30=destroy();

                    state._fsp--;

                    adaptor.addChild(root_0, destroy30.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:99:3: move
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_in_basic_instruction333);
                    move31=move();

                    state._fsp--;

                    adaptor.addChild(root_0, move31.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:100:3: translate
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_translate_in_basic_instruction337);
                    translate32=translate();

                    state._fsp--;

                    adaptor.addChild(root_0, translate32.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:101:3: modify
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_in_basic_instruction341);
                    modify33=modify();

                    state._fsp--;

                    adaptor.addChild(root_0, modify33.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:102:3: rotate
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_rotate_in_basic_instruction345);
                    rotate34=rotate();

                    state._fsp--;

                    adaptor.addChild(root_0, rotate34.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "basic_instruction"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:105:1: ite_stmt : IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF35=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token ENDIF42=null;
        AslParser.expr_return expr37 =null;

        AslParser.block_instructions_return block_instructions39 =null;

        AslParser.elseif_stmt_return elseif_stmt40 =null;

        AslParser.else_stmt_return else_stmt41 =null;


        AslTree IF35_tree=null;
        AslTree char_literal36_tree=null;
        AslTree char_literal38_tree=null;
        AslTree ENDIF42_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:105:10: ( IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:105:13: IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF35=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt355); 
            IF35_tree = 
            (AslTree)adaptor.create(IF35)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF35_tree, root_0);


            char_literal36=(Token)match(input,65,FOLLOW_65_in_ite_stmt358); 

            pushFollow(FOLLOW_expr_in_ite_stmt361);
            expr37=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr37.getTree());

            char_literal38=(Token)match(input,66,FOLLOW_66_in_ite_stmt363); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt366);
            block_instructions39=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions39.getTree());

            pushFollow(FOLLOW_elseif_stmt_in_ite_stmt368);
            elseif_stmt40=elseif_stmt();

            state._fsp--;

            adaptor.addChild(root_0, elseif_stmt40.getTree());

            pushFollow(FOLLOW_else_stmt_in_ite_stmt370);
            else_stmt41=else_stmt();

            state._fsp--;

            adaptor.addChild(root_0, else_stmt41.getTree());

            ENDIF42=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt372); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class elseif_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseif_stmt"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:108:1: elseif_stmt : ( ELSEIF ^ '(' ! expr ')' ! block_instructions )* ;
    public final AslParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        AslParser.elseif_stmt_return retval = new AslParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ELSEIF43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        AslParser.expr_return expr45 =null;

        AslParser.block_instructions_return block_instructions47 =null;


        AslTree ELSEIF43_tree=null;
        AslTree char_literal44_tree=null;
        AslTree char_literal46_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:108:12: ( ( ELSEIF ^ '(' ! expr ')' ! block_instructions )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:108:14: ( ELSEIF ^ '(' ! expr ')' ! block_instructions )*
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:108:14: ( ELSEIF ^ '(' ! expr ')' ! block_instructions )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ELSEIF) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:108:15: ELSEIF ^ '(' ! expr ')' ! block_instructions
            	    {
            	    ELSEIF43=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseif_stmt382); 
            	    ELSEIF43_tree = 
            	    (AslTree)adaptor.create(ELSEIF43)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(ELSEIF43_tree, root_0);


            	    char_literal44=(Token)match(input,65,FOLLOW_65_in_elseif_stmt385); 

            	    pushFollow(FOLLOW_expr_in_elseif_stmt388);
            	    expr45=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr45.getTree());

            	    char_literal46=(Token)match(input,66,FOLLOW_66_in_elseif_stmt390); 

            	    pushFollow(FOLLOW_block_instructions_in_elseif_stmt393);
            	    block_instructions47=block_instructions();

            	    state._fsp--;

            	    adaptor.addChild(root_0, block_instructions47.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elseif_stmt"


    public static class else_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_stmt"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:111:1: else_stmt : ( ELSE ^ block_instructions )? ;
    public final AslParser.else_stmt_return else_stmt() throws RecognitionException {
        AslParser.else_stmt_return retval = new AslParser.else_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ELSE48=null;
        AslParser.block_instructions_return block_instructions49 =null;


        AslTree ELSE48_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:111:10: ( ( ELSE ^ block_instructions )? )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:111:12: ( ELSE ^ block_instructions )?
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:111:12: ( ELSE ^ block_instructions )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:111:13: ELSE ^ block_instructions
                    {
                    ELSE48=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt404); 
                    ELSE48_tree = 
                    (AslTree)adaptor.create(ELSE48)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ELSE48_tree, root_0);


                    pushFollow(FOLLOW_block_instructions_in_else_stmt407);
                    block_instructions49=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions49.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:115:1: while_stmt : WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE50=null;
        Token char_literal51=null;
        Token char_literal53=null;
        Token ENDWHILE55=null;
        AslParser.expr_return expr52 =null;

        AslParser.block_instructions_return block_instructions54 =null;


        AslTree WHILE50_tree=null;
        AslTree char_literal51_tree=null;
        AslTree char_literal53_tree=null;
        AslTree ENDWHILE55_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:115:12: ( WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:115:17: WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE50=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt422); 
            WHILE50_tree = 
            (AslTree)adaptor.create(WHILE50)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE50_tree, root_0);


            char_literal51=(Token)match(input,65,FOLLOW_65_in_while_stmt425); 

            pushFollow(FOLLOW_expr_in_while_stmt428);
            expr52=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr52.getTree());

            char_literal53=(Token)match(input,66,FOLLOW_66_in_while_stmt430); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt433);
            block_instructions54=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions54.getTree());

            ENDWHILE55=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt435); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class for_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_stmt"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:118:1: for_stmt : FOR ^ '(' ! for_form ')' ! block_instructions ENDFOR !;
    public final AslParser.for_stmt_return for_stmt() throws RecognitionException {
        AslParser.for_stmt_return retval = new AslParser.for_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FOR56=null;
        Token char_literal57=null;
        Token char_literal59=null;
        Token ENDFOR61=null;
        AslParser.for_form_return for_form58 =null;

        AslParser.block_instructions_return block_instructions60 =null;


        AslTree FOR56_tree=null;
        AslTree char_literal57_tree=null;
        AslTree char_literal59_tree=null;
        AslTree ENDFOR61_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:118:10: ( FOR ^ '(' ! for_form ')' ! block_instructions ENDFOR !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:118:13: FOR ^ '(' ! for_form ')' ! block_instructions ENDFOR !
            {
            root_0 = (AslTree)adaptor.nil();


            FOR56=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt446); 
            FOR56_tree = 
            (AslTree)adaptor.create(FOR56)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FOR56_tree, root_0);


            char_literal57=(Token)match(input,65,FOLLOW_65_in_for_stmt449); 

            pushFollow(FOLLOW_for_form_in_for_stmt452);
            for_form58=for_form();

            state._fsp--;

            adaptor.addChild(root_0, for_form58.getTree());

            char_literal59=(Token)match(input,66,FOLLOW_66_in_for_stmt454); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt457);
            block_instructions60=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions60.getTree());

            ENDFOR61=(Token)match(input,ENDFOR,FOLLOW_ENDFOR_in_for_stmt459); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_stmt"


    public static class for_form_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_form"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:121:1: for_form : ( assign ';' ! expr ';' ! assign | ID IN ! expr ':' ! expr );
    public final AslParser.for_form_return for_form() throws RecognitionException {
        AslParser.for_form_return retval = new AslParser.for_form_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal63=null;
        Token char_literal65=null;
        Token ID67=null;
        Token IN68=null;
        Token char_literal70=null;
        AslParser.assign_return assign62 =null;

        AslParser.expr_return expr64 =null;

        AslParser.assign_return assign66 =null;

        AslParser.expr_return expr69 =null;

        AslParser.expr_return expr71 =null;


        AslTree char_literal63_tree=null;
        AslTree char_literal65_tree=null;
        AslTree ID67_tree=null;
        AslTree IN68_tree=null;
        AslTree char_literal70_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:121:9: ( assign ';' ! expr ';' ! assign | ID IN ! expr ':' ! expr )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EQUAL) ) {
                    alt10=1;
                }
                else if ( (LA10_1==IN) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:121:12: assign ';' ! expr ';' ! assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_for_form469);
                    assign62=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign62.getTree());

                    char_literal63=(Token)match(input,70,FOLLOW_70_in_for_form471); 

                    pushFollow(FOLLOW_expr_in_for_form474);
                    expr64=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr64.getTree());

                    char_literal65=(Token)match(input,70,FOLLOW_70_in_for_form476); 

                    pushFollow(FOLLOW_assign_in_for_form479);
                    assign66=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign66.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:122:8: ID IN ! expr ':' ! expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID67=(Token)match(input,ID,FOLLOW_ID_in_for_form489); 
                    ID67_tree = 
                    (AslTree)adaptor.create(ID67)
                    ;
                    adaptor.addChild(root_0, ID67_tree);


                    IN68=(Token)match(input,IN,FOLLOW_IN_in_for_form491); 

                    pushFollow(FOLLOW_expr_in_for_form494);
                    expr69=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr69.getTree());

                    char_literal70=(Token)match(input,69,FOLLOW_69_in_for_form496); 

                    pushFollow(FOLLOW_expr_in_for_form499);
                    expr71=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr71.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_form"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:127:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN72=null;
        AslParser.expr_return expr73 =null;


        AslTree RETURN72_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:127:13: ( RETURN ^ ( expr )? )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:127:17: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN72=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt516); 
            RETURN72_tree = 
            (AslTree)adaptor.create(RETURN72)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN72_tree, root_0);


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:127:25: ( expr )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FALSE||LA11_0==ID||LA11_0==INT||LA11_0==MINUS||LA11_0==NOT||LA11_0==PLUS||LA11_0==TRUE||LA11_0==65) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:127:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt519);
                    expr73=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr73.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR75=null;
        AslParser.boolterm_return boolterm74 =null;

        AslParser.boolterm_return boolterm76 =null;


        AslTree OR75_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:6: ( boolterm ( OR ^ boolterm )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:8: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr536);
            boolterm74=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm74.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:17: ( OR ^ boolterm )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==OR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:18: OR ^ boolterm
            	    {
            	    OR75=(Token)match(input,OR,FOLLOW_OR_in_expr539); 
            	    OR75_tree = 
            	    (AslTree)adaptor.create(OR75)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR75_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr542);
            	    boolterm76=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm76.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND78=null;
        AslParser.boolfact_return boolfact77 =null;

        AslParser.boolfact_return boolfact79 =null;


        AslTree AND78_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:9: ( boolfact ( AND ^ boolfact )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:11: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm551);
            boolfact77=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact77.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:20: ( AND ^ boolfact )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AND) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:21: AND ^ boolfact
            	    {
            	    AND78=(Token)match(input,AND,FOLLOW_AND_in_boolterm554); 
            	    AND78_tree = 
            	    (AslTree)adaptor.create(AND78)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND78_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm557);
            	    boolfact79=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact79.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:1: boolfact : num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COND_EQUAL81=null;
        Token NOT_EQUAL82=null;
        Token LT83=null;
        Token LE84=null;
        Token GT85=null;
        Token GE86=null;
        AslParser.num_expr_return num_expr80 =null;

        AslParser.num_expr_return num_expr87 =null;


        AslTree COND_EQUAL81_tree=null;
        AslTree NOT_EQUAL82_tree=null;
        AslTree LT83_tree=null;
        AslTree LE84_tree=null;
        AslTree GT85_tree=null;
        AslTree GE86_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:9: ( num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:11: num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact566);
            num_expr80=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr80.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:20: ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==COND_EQUAL||(LA15_0 >= GE && LA15_0 <= GT)||LA15_0==LE||LA15_0==LT||LA15_0==NOT_EQUAL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:21: ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:21: ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt14=6;
                    switch ( input.LA(1) ) {
                    case COND_EQUAL:
                        {
                        alt14=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt14=2;
                        }
                        break;
                    case LT:
                        {
                        alt14=3;
                        }
                        break;
                    case LE:
                        {
                        alt14=4;
                        }
                        break;
                    case GT:
                        {
                        alt14=5;
                        }
                        break;
                    case GE:
                        {
                        alt14=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }

                    switch (alt14) {
                        case 1 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:22: COND_EQUAL ^
                            {
                            COND_EQUAL81=(Token)match(input,COND_EQUAL,FOLLOW_COND_EQUAL_in_boolfact570); 
                            COND_EQUAL81_tree = 
                            (AslTree)adaptor.create(COND_EQUAL81)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(COND_EQUAL81_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:36: NOT_EQUAL ^
                            {
                            NOT_EQUAL82=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact575); 
                            NOT_EQUAL82_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL82)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL82_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:49: LT ^
                            {
                            LT83=(Token)match(input,LT,FOLLOW_LT_in_boolfact580); 
                            LT83_tree = 
                            (AslTree)adaptor.create(LT83)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT83_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:55: LE ^
                            {
                            LE84=(Token)match(input,LE,FOLLOW_LE_in_boolfact585); 
                            LE84_tree = 
                            (AslTree)adaptor.create(LE84)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE84_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:61: GT ^
                            {
                            GT85=(Token)match(input,GT,FOLLOW_GT_in_boolfact590); 
                            GT85_tree = 
                            (AslTree)adaptor.create(GT85)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT85_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:67: GE ^
                            {
                            GE86=(Token)match(input,GE,FOLLOW_GE_in_boolfact595); 
                            GE86_tree = 
                            (AslTree)adaptor.create(GE86)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE86_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact599);
                    num_expr87=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr87.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:143:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS89=null;
        Token MINUS90=null;
        AslParser.term_return term88 =null;

        AslParser.term_return term91 =null;


        AslTree PLUS89_tree=null;
        AslTree MINUS90_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:143:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:143:11: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr608);
            term88=term();

            state._fsp--;

            adaptor.addChild(root_0, term88.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:143:16: ( ( PLUS ^| MINUS ^) term )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==MINUS||LA17_0==PLUS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:143:18: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:143:18: ( PLUS ^| MINUS ^)
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==PLUS) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==MINUS) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:143:19: PLUS ^
            	            {
            	            PLUS89=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr613); 
            	            PLUS89_tree = 
            	            (AslTree)adaptor.create(PLUS89)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS89_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:143:27: MINUS ^
            	            {
            	            MINUS90=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr618); 
            	            MINUS90_tree = 
            	            (AslTree)adaptor.create(MINUS90)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS90_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr622);
            	    term91=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term91.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:145:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL93=null;
        Token DIV94=null;
        Token MOD95=null;
        AslParser.factor_return factor92 =null;

        AslParser.factor_return factor96 =null;


        AslTree MUL93_tree=null;
        AslTree DIV94_tree=null;
        AslTree MOD95_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:145:6: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:145:8: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term632);
            factor92=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor92.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:145:15: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==DIV||LA19_0==MOD||LA19_0==MUL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:145:17: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:145:17: ( MUL ^| DIV ^| MOD ^)
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:145:18: MUL ^
            	            {
            	            MUL93=(Token)match(input,MUL,FOLLOW_MUL_in_term637); 
            	            MUL93_tree = 
            	            (AslTree)adaptor.create(MUL93)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL93_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:145:25: DIV ^
            	            {
            	            DIV94=(Token)match(input,DIV,FOLLOW_DIV_in_term642); 
            	            DIV94_tree = 
            	            (AslTree)adaptor.create(DIV94)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV94_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:145:32: MOD ^
            	            {
            	            MOD95=(Token)match(input,MOD,FOLLOW_MOD_in_term647); 
            	            MOD95_tree = 
            	            (AslTree)adaptor.create(MOD95)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD95_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term651);
            	    factor96=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor96.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:147:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT97=null;
        Token PLUS98=null;
        Token MINUS99=null;
        AslParser.atom_return atom100 =null;


        AslTree NOT97_tree=null;
        AslTree PLUS98_tree=null;
        AslTree MINUS99_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:147:8: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:147:10: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:147:10: ( NOT ^| PLUS ^| MINUS ^)?
            int alt20=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt20=1;
                    }
                    break;
                case PLUS:
                    {
                    alt20=2;
                    }
                    break;
                case MINUS:
                    {
                    alt20=3;
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:147:11: NOT ^
                    {
                    NOT97=(Token)match(input,NOT,FOLLOW_NOT_in_factor662); 
                    NOT97_tree = 
                    (AslTree)adaptor.create(NOT97)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT97_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:147:18: PLUS ^
                    {
                    PLUS98=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor667); 
                    PLUS98_tree = 
                    (AslTree)adaptor.create(PLUS98)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS98_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:147:26: MINUS ^
                    {
                    MINUS99=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor672); 
                    MINUS99_tree = 
                    (AslTree)adaptor.create(MINUS99)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS99_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor677);
            atom100=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom100.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| acces_attribute );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID101=null;
        Token INT102=null;
        Token char_literal104=null;
        Token char_literal106=null;
        AslParser.funcall_return funcall103 =null;

        AslParser.expr_return expr105 =null;

        AslParser.acces_attribute_return acces_attribute107 =null;


        AslTree b_tree=null;
        AslTree ID101_tree=null;
        AslTree INT102_tree=null;
        AslTree char_literal104_tree=null;
        AslTree char_literal106_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:6: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| acces_attribute )
            int alt22=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 65:
                    {
                    alt22=4;
                    }
                    break;
                case 68:
                    {
                    alt22=6;
                    }
                    break;
                case AND:
                case COND_EQUAL:
                case DIV:
                case ELSE:
                case ELSEIF:
                case ENDFOR:
                case ENDFUNC:
                case ENDIF:
                case ENDWHILE:
                case GE:
                case GT:
                case LE:
                case LT:
                case MINUS:
                case MOD:
                case MUL:
                case NOT_EQUAL:
                case OR:
                case PLUS:
                case 66:
                case 67:
                case 69:
                case 70:
                case 73:
                    {
                    alt22=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt22=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt22=3;
                }
                break;
            case 65:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:8: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID101=(Token)match(input,ID,FOLLOW_ID_in_atom688); 
                    ID101_tree = 
                    (AslTree)adaptor.create(ID101)
                    ;
                    adaptor.addChild(root_0, ID101_tree);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:153:3: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT102=(Token)match(input,INT,FOLLOW_INT_in_atom692); 
                    INT102_tree = 
                    (AslTree)adaptor.create(INT102)
                    ;
                    adaptor.addChild(root_0, INT102_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:3: (b= TRUE |b= FALSE )
                    {
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:3: (b= TRUE |b= FALSE )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==TRUE) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==FALSE) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }
                    switch (alt21) {
                        case 1 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:4: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom699);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:13: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom705);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 154:22: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:25: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:155:3: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom717);
                    funcall103=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall103.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:156:3: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal104=(Token)match(input,65,FOLLOW_65_in_atom721); 

                    pushFollow(FOLLOW_expr_in_atom724);
                    expr105=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr105.getTree());

                    char_literal106=(Token)match(input,66,FOLLOW_66_in_atom726); 

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:157:3: acces_attribute
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_acces_attribute_in_atom731);
                    acces_attribute107=acces_attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, acces_attribute107.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID108=null;
        Token char_literal109=null;
        Token char_literal111=null;
        AslParser.expr_list_return expr_list110 =null;


        AslTree ID108_tree=null;
        AslTree char_literal109_tree=null;
        AslTree char_literal111_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:11: ID '(' ( expr_list )? ')'
            {
            ID108=(Token)match(input,ID,FOLLOW_ID_in_funcall740);  
            stream_ID.add(ID108);


            char_literal109=(Token)match(input,65,FOLLOW_65_in_funcall742);  
            stream_65.add(char_literal109);


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:18: ( expr_list )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==FALSE||LA23_0==ID||LA23_0==INT||LA23_0==MINUS||LA23_0==NOT||LA23_0==PLUS||LA23_0==TRUE||LA23_0==65) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:18: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall744);
                    expr_list110=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list110.getTree());

                    }
                    break;

            }


            char_literal111=(Token)match(input,66,FOLLOW_66_in_funcall747);  
            stream_66.add(char_literal111);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 160:33: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:36: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:49: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:59: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:163:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal113=null;
        AslParser.expr_return expr112 =null;

        AslParser.expr_return expr114 =null;


        AslTree char_literal113_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:163:10: ( expr ( ',' ! expr )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:163:12: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list770);
            expr112=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr112.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:163:17: ( ',' ! expr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==67) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:163:18: ',' ! expr
            	    {
            	    char_literal113=(Token)match(input,67,FOLLOW_67_in_expr_list773); 

            	    pushFollow(FOLLOW_expr_in_expr_list776);
            	    expr114=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr114.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"


    public static class time_annotation_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "time_annotation"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:165:1: time_annotation : '@' BEGIN EQUAL expr ( ',' finish_time )? -> ^( TIMEANNOTATION expr ( finish_time )? ) ;
    public final AslParser.time_annotation_return time_annotation() throws RecognitionException {
        AslParser.time_annotation_return retval = new AslParser.time_annotation_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal115=null;
        Token BEGIN116=null;
        Token EQUAL117=null;
        Token char_literal119=null;
        AslParser.expr_return expr118 =null;

        AslParser.finish_time_return finish_time120 =null;


        AslTree char_literal115_tree=null;
        AslTree BEGIN116_tree=null;
        AslTree EQUAL117_tree=null;
        AslTree char_literal119_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_finish_time=new RewriteRuleSubtreeStream(adaptor,"rule finish_time");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:165:16: ( '@' BEGIN EQUAL expr ( ',' finish_time )? -> ^( TIMEANNOTATION expr ( finish_time )? ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:166:1: '@' BEGIN EQUAL expr ( ',' finish_time )?
            {
            char_literal115=(Token)match(input,71,FOLLOW_71_in_time_annotation785);  
            stream_71.add(char_literal115);


            BEGIN116=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_time_annotation787);  
            stream_BEGIN.add(BEGIN116);


            EQUAL117=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_time_annotation789);  
            stream_EQUAL.add(EQUAL117);


            pushFollow(FOLLOW_expr_in_time_annotation791);
            expr118=expr();

            state._fsp--;

            stream_expr.add(expr118.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:166:22: ( ',' finish_time )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==67) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:166:23: ',' finish_time
                    {
                    char_literal119=(Token)match(input,67,FOLLOW_67_in_time_annotation794);  
                    stream_67.add(char_literal119);


                    pushFollow(FOLLOW_finish_time_in_time_annotation796);
                    finish_time120=finish_time();

                    state._fsp--;

                    stream_finish_time.add(finish_time120.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: expr, finish_time
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 166:41: -> ^( TIMEANNOTATION expr ( finish_time )? )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:166:44: ^( TIMEANNOTATION expr ( finish_time )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(TIMEANNOTATION, "TIMEANNOTATION")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:166:66: ( finish_time )?
                if ( stream_finish_time.hasNext() ) {
                    adaptor.addChild(root_1, stream_finish_time.nextTree());

                }
                stream_finish_time.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "time_annotation"


    public static class finish_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "finish_time"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:168:1: finish_time : ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr ) ;
    public final AslParser.finish_time_return finish_time() throws RecognitionException {
        AslParser.finish_time_return retval = new AslParser.finish_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token END121=null;
        Token EQUAL122=null;
        Token DURATION124=null;
        Token EQUAL125=null;
        AslParser.expr_return expr123 =null;

        AslParser.expr_return expr126 =null;


        AslTree END121_tree=null;
        AslTree EQUAL122_tree=null;
        AslTree DURATION124_tree=null;
        AslTree EQUAL125_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:168:12: ( ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:169:2: ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr )
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:169:2: ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==END) ) {
                alt26=1;
            }
            else if ( (LA26_0==DURATION) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:169:2: END ^ EQUAL ! expr
                    {
                    END121=(Token)match(input,END,FOLLOW_END_in_finish_time817); 
                    END121_tree = 
                    (AslTree)adaptor.create(END121)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(END121_tree, root_0);


                    EQUAL122=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_finish_time820); 

                    pushFollow(FOLLOW_expr_in_finish_time823);
                    expr123=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr123.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:169:21: DURATION ^ EQUAL ! expr
                    {
                    DURATION124=(Token)match(input,DURATION,FOLLOW_DURATION_in_finish_time827); 
                    DURATION124_tree = 
                    (AslTree)adaptor.create(DURATION124)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(DURATION124_tree, root_0);


                    EQUAL125=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_finish_time830); 

                    pushFollow(FOLLOW_expr_in_finish_time833);
                    expr126=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr126.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "finish_time"


    public static class create_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:171:1: create : CREATE TYPE_OBJECT coordenades ( list_attributes )? -> ^( CREATE_INSTR TYPE_OBJECT coordenades ( ^( ATTRIBUTES list_attributes ) )? ) ;
    public final AslParser.create_return create() throws RecognitionException {
        AslParser.create_return retval = new AslParser.create_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token CREATE127=null;
        Token TYPE_OBJECT128=null;
        AslParser.coordenades_return coordenades129 =null;

        AslParser.list_attributes_return list_attributes130 =null;


        AslTree CREATE127_tree=null;
        AslTree TYPE_OBJECT128_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_TYPE_OBJECT=new RewriteRuleTokenStream(adaptor,"token TYPE_OBJECT");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        RewriteRuleSubtreeStream stream_list_attributes=new RewriteRuleSubtreeStream(adaptor,"rule list_attributes");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:171:7: ( CREATE TYPE_OBJECT coordenades ( list_attributes )? -> ^( CREATE_INSTR TYPE_OBJECT coordenades ( ^( ATTRIBUTES list_attributes ) )? ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:171:9: CREATE TYPE_OBJECT coordenades ( list_attributes )?
            {
            CREATE127=(Token)match(input,CREATE,FOLLOW_CREATE_in_create841);  
            stream_CREATE.add(CREATE127);


            TYPE_OBJECT128=(Token)match(input,TYPE_OBJECT,FOLLOW_TYPE_OBJECT_in_create843);  
            stream_TYPE_OBJECT.add(TYPE_OBJECT128);


            pushFollow(FOLLOW_coordenades_in_create845);
            coordenades129=coordenades();

            state._fsp--;

            stream_coordenades.add(coordenades129.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:171:40: ( list_attributes )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ATTRIBUTE) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:171:40: list_attributes
                    {
                    pushFollow(FOLLOW_list_attributes_in_create847);
                    list_attributes130=list_attributes();

                    state._fsp--;

                    stream_list_attributes.add(list_attributes130.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: coordenades, TYPE_OBJECT, list_attributes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 171:57: -> ^( CREATE_INSTR TYPE_OBJECT coordenades ( ^( ATTRIBUTES list_attributes ) )? )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:171:60: ^( CREATE_INSTR TYPE_OBJECT coordenades ( ^( ATTRIBUTES list_attributes ) )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(CREATE_INSTR, "CREATE_INSTR")
                , root_1);

                adaptor.addChild(root_1, 
                stream_TYPE_OBJECT.nextNode()
                );

                adaptor.addChild(root_1, stream_coordenades.nextTree());

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:171:99: ( ^( ATTRIBUTES list_attributes ) )?
                if ( stream_list_attributes.hasNext() ) {
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:171:99: ^( ATTRIBUTES list_attributes )
                    {
                    AslTree root_2 = (AslTree)adaptor.nil();
                    root_2 = (AslTree)adaptor.becomeRoot(
                    (AslTree)adaptor.create(ATTRIBUTES, "ATTRIBUTES")
                    , root_2);

                    adaptor.addChild(root_2, stream_list_attributes.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_list_attributes.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create"


    public static class destroy_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "destroy"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:173:1: destroy : DESTROY ID -> ^( ANIMATION DESTROY ID ) ;
    public final AslParser.destroy_return destroy() throws RecognitionException {
        AslParser.destroy_return retval = new AslParser.destroy_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DESTROY131=null;
        Token ID132=null;

        AslTree DESTROY131_tree=null;
        AslTree ID132_tree=null;
        RewriteRuleTokenStream stream_DESTROY=new RewriteRuleTokenStream(adaptor,"token DESTROY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:173:8: ( DESTROY ID -> ^( ANIMATION DESTROY ID ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:173:10: DESTROY ID
            {
            DESTROY131=(Token)match(input,DESTROY,FOLLOW_DESTROY_in_destroy872);  
            stream_DESTROY.add(DESTROY131);


            ID132=(Token)match(input,ID,FOLLOW_ID_in_destroy874);  
            stream_ID.add(ID132);


            // AST REWRITE
            // elements: DESTROY, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 173:21: -> ^( ANIMATION DESTROY ID )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:173:24: ^( ANIMATION DESTROY ID )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ANIMATION, "ANIMATION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_DESTROY.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "destroy"


    public static class move_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:1: move : MOVE ID coordenades -> ^( ANIMATION MOVE ID coordenades ) ;
    public final AslParser.move_return move() throws RecognitionException {
        AslParser.move_return retval = new AslParser.move_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVE133=null;
        Token ID134=null;
        AslParser.coordenades_return coordenades135 =null;


        AslTree MOVE133_tree=null;
        AslTree ID134_tree=null;
        RewriteRuleTokenStream stream_MOVE=new RewriteRuleTokenStream(adaptor,"token MOVE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:5: ( MOVE ID coordenades -> ^( ANIMATION MOVE ID coordenades ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:9: MOVE ID coordenades
            {
            MOVE133=(Token)match(input,MOVE,FOLLOW_MOVE_in_move893);  
            stream_MOVE.add(MOVE133);


            ID134=(Token)match(input,ID,FOLLOW_ID_in_move895);  
            stream_ID.add(ID134);


            pushFollow(FOLLOW_coordenades_in_move897);
            coordenades135=coordenades();

            state._fsp--;

            stream_coordenades.add(coordenades135.getTree());

            // AST REWRITE
            // elements: MOVE, ID, coordenades
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 175:29: -> ^( ANIMATION MOVE ID coordenades )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:32: ^( ANIMATION MOVE ID coordenades )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ANIMATION, "ANIMATION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_MOVE.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_coordenades.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "move"


    public static class translate_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "translate"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:177:1: translate : TRANSLATE ID coordenades -> ^( ANIMATION TRANSLATE ID coordenades ) ;
    public final AslParser.translate_return translate() throws RecognitionException {
        AslParser.translate_return retval = new AslParser.translate_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TRANSLATE136=null;
        Token ID137=null;
        AslParser.coordenades_return coordenades138 =null;


        AslTree TRANSLATE136_tree=null;
        AslTree ID137_tree=null;
        RewriteRuleTokenStream stream_TRANSLATE=new RewriteRuleTokenStream(adaptor,"token TRANSLATE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:177:10: ( TRANSLATE ID coordenades -> ^( ANIMATION TRANSLATE ID coordenades ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:177:13: TRANSLATE ID coordenades
            {
            TRANSLATE136=(Token)match(input,TRANSLATE,FOLLOW_TRANSLATE_in_translate917);  
            stream_TRANSLATE.add(TRANSLATE136);


            ID137=(Token)match(input,ID,FOLLOW_ID_in_translate919);  
            stream_ID.add(ID137);


            pushFollow(FOLLOW_coordenades_in_translate921);
            coordenades138=coordenades();

            state._fsp--;

            stream_coordenades.add(coordenades138.getTree());

            // AST REWRITE
            // elements: coordenades, TRANSLATE, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 177:38: -> ^( ANIMATION TRANSLATE ID coordenades )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:177:41: ^( ANIMATION TRANSLATE ID coordenades )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ANIMATION, "ANIMATION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_TRANSLATE.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_coordenades.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "translate"


    public static class modify_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modify"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:179:1: modify : MODIFY ID list_attributes -> ^( ANIMATION MODIFY ID list_attributes ) ;
    public final AslParser.modify_return modify() throws RecognitionException {
        AslParser.modify_return retval = new AslParser.modify_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODIFY139=null;
        Token ID140=null;
        AslParser.list_attributes_return list_attributes141 =null;


        AslTree MODIFY139_tree=null;
        AslTree ID140_tree=null;
        RewriteRuleTokenStream stream_MODIFY=new RewriteRuleTokenStream(adaptor,"token MODIFY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_list_attributes=new RewriteRuleSubtreeStream(adaptor,"rule list_attributes");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:179:7: ( MODIFY ID list_attributes -> ^( ANIMATION MODIFY ID list_attributes ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:179:9: MODIFY ID list_attributes
            {
            MODIFY139=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_modify940);  
            stream_MODIFY.add(MODIFY139);


            ID140=(Token)match(input,ID,FOLLOW_ID_in_modify942);  
            stream_ID.add(ID140);


            pushFollow(FOLLOW_list_attributes_in_modify944);
            list_attributes141=list_attributes();

            state._fsp--;

            stream_list_attributes.add(list_attributes141.getTree());

            // AST REWRITE
            // elements: list_attributes, MODIFY, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 179:35: -> ^( ANIMATION MODIFY ID list_attributes )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:179:38: ^( ANIMATION MODIFY ID list_attributes )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ANIMATION, "ANIMATION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_MODIFY.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_list_attributes.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modify"


    public static class rotate_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rotate"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:181:1: rotate : ROTATE ID expr -> ^( ANIMATION ROTATE ID expr ) ;
    public final AslParser.rotate_return rotate() throws RecognitionException {
        AslParser.rotate_return retval = new AslParser.rotate_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ROTATE142=null;
        Token ID143=null;
        AslParser.expr_return expr144 =null;


        AslTree ROTATE142_tree=null;
        AslTree ID143_tree=null;
        RewriteRuleTokenStream stream_ROTATE=new RewriteRuleTokenStream(adaptor,"token ROTATE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:181:7: ( ROTATE ID expr -> ^( ANIMATION ROTATE ID expr ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:181:9: ROTATE ID expr
            {
            ROTATE142=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_rotate963);  
            stream_ROTATE.add(ROTATE142);


            ID143=(Token)match(input,ID,FOLLOW_ID_in_rotate965);  
            stream_ID.add(ID143);


            pushFollow(FOLLOW_expr_in_rotate967);
            expr144=expr();

            state._fsp--;

            stream_expr.add(expr144.getTree());

            // AST REWRITE
            // elements: ID, ROTATE, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 181:24: -> ^( ANIMATION ROTATE ID expr )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:181:27: ^( ANIMATION ROTATE ID expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ANIMATION, "ANIMATION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ROTATE.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rotate"


    public static class list_attributes_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_attributes"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:1: list_attributes : attribute ( ',' ! attribute )* ;
    public final AslParser.list_attributes_return list_attributes() throws RecognitionException {
        AslParser.list_attributes_return retval = new AslParser.list_attributes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal146=null;
        AslParser.attribute_return attribute145 =null;

        AslParser.attribute_return attribute147 =null;


        AslTree char_literal146_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:16: ( attribute ( ',' ! attribute )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:18: attribute ( ',' ! attribute )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_attribute_in_list_attributes986);
            attribute145=attribute();

            state._fsp--;

            adaptor.addChild(root_0, attribute145.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:28: ( ',' ! attribute )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==67) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:29: ',' ! attribute
            	    {
            	    char_literal146=(Token)match(input,67,FOLLOW_67_in_list_attributes989); 

            	    pushFollow(FOLLOW_attribute_in_list_attributes992);
            	    attribute147=attribute();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribute147.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_attributes"


    public static class attribute_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:185:1: attribute : ATTRIBUTE ^ EQUAL ! expr ;
    public final AslParser.attribute_return attribute() throws RecognitionException {
        AslParser.attribute_return retval = new AslParser.attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ATTRIBUTE148=null;
        Token EQUAL149=null;
        AslParser.expr_return expr150 =null;


        AslTree ATTRIBUTE148_tree=null;
        AslTree EQUAL149_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:185:10: ( ATTRIBUTE ^ EQUAL ! expr )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:185:12: ATTRIBUTE ^ EQUAL ! expr
            {
            root_0 = (AslTree)adaptor.nil();


            ATTRIBUTE148=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute1001); 
            ATTRIBUTE148_tree = 
            (AslTree)adaptor.create(ATTRIBUTE148)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(ATTRIBUTE148_tree, root_0);


            EQUAL149=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_attribute1004); 

            pushFollow(FOLLOW_expr_in_attribute1007);
            expr150=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr150.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class coordenades_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "coordenades"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:187:1: coordenades : '{' ! expr ',' ! expr '}' !;
    public final AslParser.coordenades_return coordenades() throws RecognitionException {
        AslParser.coordenades_return retval = new AslParser.coordenades_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal151=null;
        Token char_literal153=null;
        Token char_literal155=null;
        AslParser.expr_return expr152 =null;

        AslParser.expr_return expr154 =null;


        AslTree char_literal151_tree=null;
        AslTree char_literal153_tree=null;
        AslTree char_literal155_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:187:12: ( '{' ! expr ',' ! expr '}' !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:187:14: '{' ! expr ',' ! expr '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            char_literal151=(Token)match(input,72,FOLLOW_72_in_coordenades1014); 

            pushFollow(FOLLOW_expr_in_coordenades1017);
            expr152=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr152.getTree());

            char_literal153=(Token)match(input,67,FOLLOW_67_in_coordenades1019); 

            pushFollow(FOLLOW_expr_in_coordenades1022);
            expr154=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr154.getTree());

            char_literal155=(Token)match(input,73,FOLLOW_73_in_coordenades1024); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "coordenades"


    public static class acces_attribute_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "acces_attribute"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:189:1: acces_attribute : ID '.' att '(' ')' -> ^( ACCESATTRIBUTE ID att ) ;
    public final AslParser.acces_attribute_return acces_attribute() throws RecognitionException {
        AslParser.acces_attribute_return retval = new AslParser.acces_attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID156=null;
        Token char_literal157=null;
        Token char_literal159=null;
        Token char_literal160=null;
        AslParser.att_return att158 =null;


        AslTree ID156_tree=null;
        AslTree char_literal157_tree=null;
        AslTree char_literal159_tree=null;
        AslTree char_literal160_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_att=new RewriteRuleSubtreeStream(adaptor,"rule att");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:189:16: ( ID '.' att '(' ')' -> ^( ACCESATTRIBUTE ID att ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:189:18: ID '.' att '(' ')'
            {
            ID156=(Token)match(input,ID,FOLLOW_ID_in_acces_attribute1032);  
            stream_ID.add(ID156);


            char_literal157=(Token)match(input,68,FOLLOW_68_in_acces_attribute1034);  
            stream_68.add(char_literal157);


            pushFollow(FOLLOW_att_in_acces_attribute1036);
            att158=att();

            state._fsp--;

            stream_att.add(att158.getTree());

            char_literal159=(Token)match(input,65,FOLLOW_65_in_acces_attribute1038);  
            stream_65.add(char_literal159);


            char_literal160=(Token)match(input,66,FOLLOW_66_in_acces_attribute1040);  
            stream_66.add(char_literal160);


            // AST REWRITE
            // elements: ID, att
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 189:37: -> ^( ACCESATTRIBUTE ID att )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:189:40: ^( ACCESATTRIBUTE ID att )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ACCESATTRIBUTE, "ACCESATTRIBUTE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_att.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "acces_attribute"


    public static class att_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "att"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:192:1: att : ( ATTRIBUTE | BEGIN | END | DURATION );
    public final AslParser.att_return att() throws RecognitionException {
        AslParser.att_return retval = new AslParser.att_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set161=null;

        AslTree set161_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:192:4: ( ATTRIBUTE | BEGIN | END | DURATION )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set161=(Token)input.LT(1);

            if ( input.LA(1)==ATTRIBUTE||input.LA(1)==BEGIN||input.LA(1)==DURATION||input.LA(1)==END ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set161)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "att"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog99 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_EOF_in_prog102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func120 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_func123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_params_in_func125 = new BitSet(new long[]{0x4980601840028000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_block_instructions_in_func127 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_params140 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramlist_in_params142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_params145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist162 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_paramlist165 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_param_in_paramlist168 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_param182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions200 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_block_instructions203 = new BitSet(new long[]{0x4980601840028000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_instruction_in_block_instructions205 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_assign_in_instruction227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_instruction_in_instruction232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_annotation_in_instruction262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign278 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EQUAL_in_assign282 = new BitSet(new long[]{0x0900600000028000L});
    public static final BitSet FOLLOW_basic_instruction_in_assign284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign300 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EQUAL_in_assign304 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_basic_instruction325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destroy_in_basic_instruction329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_basic_instruction333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translate_in_basic_instruction337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_in_basic_instruction341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rotate_in_basic_instruction345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ite_stmt358 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ite_stmt361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ite_stmt363 = new BitSet(new long[]{0x4980601840028000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt366 = new BitSet(new long[]{0x0000000002300000L});
    public static final BitSet FOLLOW_elseif_stmt_in_ite_stmt368 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_else_stmt_in_ite_stmt370 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseif_stmt382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_elseif_stmt385 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_elseif_stmt390 = new BitSet(new long[]{0x4980601840028000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_block_instructions_in_elseif_stmt393 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt404 = new BitSet(new long[]{0x4980601840028000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_block_instructions_in_else_stmt407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_while_stmt425 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_while_stmt428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_while_stmt430 = new BitSet(new long[]{0x4980601840028000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt433 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_for_stmt449 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_for_form_in_for_stmt452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_for_stmt454 = new BitSet(new long[]{0x4980601840028000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt457 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ENDFOR_in_for_stmt459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_for_form469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_for_form471 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_for_form474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_for_form476 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_assign_in_for_form479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_for_form489 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IN_in_for_form491 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_for_form494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_for_form496 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_for_form499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt516 = new BitSet(new long[]{0x1011084820000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_return_stmt519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr536 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_OR_in_expr539 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr542 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm551 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm554 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm557 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact566 = new BitSet(new long[]{0x0002048600004002L});
    public static final BitSet FOLLOW_COND_EQUAL_in_boolfact570 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact575 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_boolfact580 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_boolfact585 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_boolfact590 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_boolfact595 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_num_expr_in_boolfact599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr608 = new BitSet(new long[]{0x0010080000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr613 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_num_expr618 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr622 = new BitSet(new long[]{0x0010080000000002L});
    public static final BitSet FOLLOW_factor_in_term632 = new BitSet(new long[]{0x0000900000040002L});
    public static final BitSet FOLLOW_MUL_in_term637 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_term642 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_term647 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term651 = new BitSet(new long[]{0x0000900000040002L});
    public static final BitSet FOLLOW_NOT_in_factor662 = new BitSet(new long[]{0x1000004820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_factor667 = new BitSet(new long[]{0x1000004820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor672 = new BitSet(new long[]{0x1000004820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_factor677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_atom721 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_atom724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_atom726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_acces_attribute_in_atom731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_funcall742 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_expr_list_in_funcall744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_funcall747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list770 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expr_list773 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list776 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_71_in_time_annotation785 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BEGIN_in_time_annotation787 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EQUAL_in_time_annotation789 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_time_annotation791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_time_annotation794 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_finish_time_in_time_annotation796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_finish_time817 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EQUAL_in_finish_time820 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_finish_time823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_finish_time827 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EQUAL_in_finish_time830 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_finish_time833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create841 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_TYPE_OBJECT_in_create843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_coordenades_in_create845 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_list_attributes_in_create847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTROY_in_destroy872 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_destroy874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move893 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_move895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_coordenades_in_move897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSLATE_in_translate917 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_translate919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_coordenades_in_translate921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_in_modify940 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_modify942 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_list_attributes_in_modify944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_rotate963 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_rotate965 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rotate967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_list_attributes986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_list_attributes989 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_attribute_in_list_attributes992 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute1001 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EQUAL_in_attribute1004 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_attribute1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_coordenades1014 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_coordenades1017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_coordenades1019 = new BitSet(new long[]{0x1011084820000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_coordenades1022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_coordenades1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_acces_attribute1032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_acces_attribute1034 = new BitSet(new long[]{0x0000000000480A00L});
    public static final BitSet FOLLOW_att_in_acces_attribute1036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_acces_attribute1038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_acces_attribute1040 = new BitSet(new long[]{0x0000000000000002L});

}