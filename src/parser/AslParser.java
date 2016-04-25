// $ANTLR 3.4 /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g 2016-04-25 10:01:21

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
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "ATTRIBUTE", "ATTRIBUTES", "BEGIN", "BOOLEAN", "COMMENT", "COND_EQUAL", "CREATE", "DESTROY", "DIV", "DURATION", "ELSE", "ELSEIF", "END", "ENDFOR", "ENDFUNC", "ENDIF", "ENDLINE", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FOR", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MODIFY", "MOVE", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "READ", "RETURN", "ROTATE", "STRING", "TIMEANNOTATION", "TRANSLATE", "TRUE", "TYPE_OBJECT", "WHILE", "WRITE", "WS", "'('", "')'", "','", "';'", "'@'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:62:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:62:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:62:8: ( func )+ EOF
            {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:62:8: ( func )+
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
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:62:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog170);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog173);  
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
            // 62:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:62:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:66:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:66:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:66:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func212); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func215); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func217);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func219);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func221); 

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:70:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:70:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:70:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,62,FOLLOW_62_in_params240);  
            stream_62.add(char_literal8);


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:70:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:70:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params242);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,63,FOLLOW_63_in_params245);  
            stream_63.add(char_literal10);


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
            // 70:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:70:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:70:41: ( paramlist )?
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:74:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:74:10: ( param ( ',' ! param )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:74:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist271);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:74:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==64) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:74:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,64,FOLLOW_64_in_paramlist274); 

            	    pushFollow(FOLLOW_param_in_paramlist277);
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:79:1: param : id= ID -> ^( PREF[$id,$id.text] ) ;
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;

        AslTree id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:79:9: (id= ID -> ^( PREF[$id,$id.text] ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:79:13: id= ID
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_param304);  
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
            // 79:19: -> ^( PREF[$id,$id.text] )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:79:22: ^( PREF[$id,$id.text] )
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:83:1: block_instructions : instruction ( ENDLINE instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ENDLINE15=null;
        AslParser.instruction_return instruction14 =null;

        AslParser.instruction_return instruction16 =null;


        AslTree ENDLINE15_tree=null;
        RewriteRuleTokenStream stream_ENDLINE=new RewriteRuleTokenStream(adaptor,"token ENDLINE");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:84:9: ( instruction ( ENDLINE instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:84:12: instruction ( ENDLINE instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions338);
            instruction14=instruction();

            state._fsp--;

            stream_instruction.add(instruction14.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:84:24: ( ENDLINE instruction )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ENDLINE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:84:25: ENDLINE instruction
            	    {
            	    ENDLINE15=(Token)match(input,ENDLINE,FOLLOW_ENDLINE_in_block_instructions341);  
            	    stream_ENDLINE.add(ENDLINE15);


            	    pushFollow(FOLLOW_instruction_in_block_instructions343);
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
            // 85:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:85:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:89:1: instruction : ( assign | basic_instruction | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | time_annotation |);
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:90:9: ( assign | basic_instruction | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | time_annotation |)
            int alt5=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EQUAL) ) {
                    alt5=1;
                }
                else if ( (LA5_1==62) ) {
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
            case 66:
                {
                alt5=8;
                }
                break;
            case ELSE:
            case ELSEIF:
            case ENDFOR:
            case ENDFUNC:
            case ENDIF:
            case ENDLINE:
            case ENDWHILE:
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:90:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction392);
                    assign17=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign17.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:91:14: basic_instruction
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_basic_instruction_in_instruction417);
                    basic_instruction18=basic_instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_instruction18.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:92:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction430);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:93:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction450);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:94:11: for_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction468);
                    for_stmt21=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt21.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:95:15: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction484);
                    funcall22=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall22.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:96:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction505);
                    return_stmt23=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt23.getTree());

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:97:14: time_annotation
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_time_annotation_in_instruction525);
                    time_annotation24=time_annotation();

                    state._fsp--;

                    adaptor.addChild(root_0, time_annotation24.getTree());

                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:101:9: 
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:104:1: assign : ( ID eq= EQUAL basic_instruction -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction ) | ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) );
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:104:8: ( ID eq= EQUAL basic_instruction -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction ) | ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL) ) {
                    int LA6_2 = input.LA(3);

                    if ( ((LA6_2 >= CREATE && LA6_2 <= DESTROY)||(LA6_2 >= MODIFY && LA6_2 <= MOVE)||LA6_2==ROTATE||LA6_2==TRANSLATE) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==FALSE||LA6_2==ID||LA6_2==INT||LA6_2==MINUS||LA6_2==NOT||LA6_2==PLUS||LA6_2==TRUE||LA6_2==62) ) {
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:104:10: ID eq= EQUAL basic_instruction
                    {
                    ID25=(Token)match(input,ID,FOLLOW_ID_in_assign591);  
                    stream_ID.add(ID25);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign595);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_basic_instruction_in_assign597);
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
                    // 104:40: -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction )
                    {
                        // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:104:43: ^( ASSIGN[$eq,\":=\"] ID basic_instruction )
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:105:4: ID eq= EQUAL expr
                    {
                    ID27=(Token)match(input,ID,FOLLOW_ID_in_assign614);  
                    stream_ID.add(ID27);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign618);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign620);
                    expr28=expr();

                    state._fsp--;

                    stream_expr.add(expr28.getTree());

                    // AST REWRITE
                    // elements: expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 105:21: -> ^( ASSIGN[$eq,\":=\"] ID expr )
                    {
                        // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:105:24: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:110:1: basic_instruction : ( create | destroy | move | translate | modify | rotate );
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:110:18: ( create | destroy | move | translate | modify | rotate )
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:111:14: create
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_create_in_basic_instruction664);
                    create29=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create29.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:112:14: destroy
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_destroy_in_basic_instruction679);
                    destroy30=destroy();

                    state._fsp--;

                    adaptor.addChild(root_0, destroy30.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:113:14: move
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_in_basic_instruction694);
                    move31=move();

                    state._fsp--;

                    adaptor.addChild(root_0, move31.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:114:14: translate
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_translate_in_basic_instruction709);
                    translate32=translate();

                    state._fsp--;

                    adaptor.addChild(root_0, translate32.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:115:14: modify
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_in_basic_instruction724);
                    modify33=modify();

                    state._fsp--;

                    adaptor.addChild(root_0, modify33.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:116:14: rotate
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_rotate_in_basic_instruction739);
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:120:1: ite_stmt : IF ^ '(' ! expr ')' ! block_instructions ( ELSEIF ^ '(' ! expr ')' ! block_instructions )* ( ELSE ^ block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF35=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token ELSEIF40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        Token ELSE45=null;
        Token ENDIF47=null;
        AslParser.expr_return expr37 =null;

        AslParser.block_instructions_return block_instructions39 =null;

        AslParser.expr_return expr42 =null;

        AslParser.block_instructions_return block_instructions44 =null;

        AslParser.block_instructions_return block_instructions46 =null;


        AslTree IF35_tree=null;
        AslTree char_literal36_tree=null;
        AslTree char_literal38_tree=null;
        AslTree ELSEIF40_tree=null;
        AslTree char_literal41_tree=null;
        AslTree char_literal43_tree=null;
        AslTree ELSE45_tree=null;
        AslTree ENDIF47_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:120:10: ( IF ^ '(' ! expr ')' ! block_instructions ( ELSEIF ^ '(' ! expr ')' ! block_instructions )* ( ELSE ^ block_instructions )? ENDIF !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:120:12: IF ^ '(' ! expr ')' ! block_instructions ( ELSEIF ^ '(' ! expr ')' ! block_instructions )* ( ELSE ^ block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF35=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt757); 
            IF35_tree = 
            (AslTree)adaptor.create(IF35)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF35_tree, root_0);


            char_literal36=(Token)match(input,62,FOLLOW_62_in_ite_stmt760); 

            pushFollow(FOLLOW_expr_in_ite_stmt763);
            expr37=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr37.getTree());

            char_literal38=(Token)match(input,63,FOLLOW_63_in_ite_stmt765); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt768);
            block_instructions39=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions39.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:120:50: ( ELSEIF ^ '(' ! expr ')' ! block_instructions )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ELSEIF) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:120:51: ELSEIF ^ '(' ! expr ')' ! block_instructions
            	    {
            	    ELSEIF40=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_ite_stmt771); 
            	    ELSEIF40_tree = 
            	    (AslTree)adaptor.create(ELSEIF40)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(ELSEIF40_tree, root_0);


            	    char_literal41=(Token)match(input,62,FOLLOW_62_in_ite_stmt774); 

            	    pushFollow(FOLLOW_expr_in_ite_stmt777);
            	    expr42=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr42.getTree());

            	    char_literal43=(Token)match(input,63,FOLLOW_63_in_ite_stmt779); 

            	    pushFollow(FOLLOW_block_instructions_in_ite_stmt782);
            	    block_instructions44=block_instructions();

            	    state._fsp--;

            	    adaptor.addChild(root_0, block_instructions44.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:120:95: ( ELSE ^ block_instructions )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:120:96: ELSE ^ block_instructions
                    {
                    ELSE45=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt787); 
                    ELSE45_tree = 
                    (AslTree)adaptor.create(ELSE45)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ELSE45_tree, root_0);


                    pushFollow(FOLLOW_block_instructions_in_ite_stmt790);
                    block_instructions46=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions46.getTree());

                    }
                    break;

            }


            ENDIF47=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt794); 

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


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:124:1: while_stmt : WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE48=null;
        Token char_literal49=null;
        Token char_literal51=null;
        Token ENDWHILE53=null;
        AslParser.expr_return expr50 =null;

        AslParser.block_instructions_return block_instructions52 =null;


        AslTree WHILE48_tree=null;
        AslTree char_literal49_tree=null;
        AslTree char_literal51_tree=null;
        AslTree ENDWHILE53_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:124:12: ( WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:124:14: WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE48=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt817); 
            WHILE48_tree = 
            (AslTree)adaptor.create(WHILE48)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE48_tree, root_0);


            char_literal49=(Token)match(input,62,FOLLOW_62_in_while_stmt820); 

            pushFollow(FOLLOW_expr_in_while_stmt823);
            expr50=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr50.getTree());

            char_literal51=(Token)match(input,63,FOLLOW_63_in_while_stmt825); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt828);
            block_instructions52=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions52.getTree());

            ENDWHILE53=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt830); 

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:128:1: for_stmt : FOR ^ '(' ! assign ';' ! expr ';' ! assign ')' ! block_instructions ENDFOR !;
    public final AslParser.for_stmt_return for_stmt() throws RecognitionException {
        AslParser.for_stmt_return retval = new AslParser.for_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FOR54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token ENDFOR63=null;
        AslParser.assign_return assign56 =null;

        AslParser.expr_return expr58 =null;

        AslParser.assign_return assign60 =null;

        AslParser.block_instructions_return block_instructions62 =null;


        AslTree FOR54_tree=null;
        AslTree char_literal55_tree=null;
        AslTree char_literal57_tree=null;
        AslTree char_literal59_tree=null;
        AslTree char_literal61_tree=null;
        AslTree ENDFOR63_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:128:10: ( FOR ^ '(' ! assign ';' ! expr ';' ! assign ')' ! block_instructions ENDFOR !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:128:12: FOR ^ '(' ! assign ';' ! expr ';' ! assign ')' ! block_instructions ENDFOR !
            {
            root_0 = (AslTree)adaptor.nil();


            FOR54=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt865); 
            FOR54_tree = 
            (AslTree)adaptor.create(FOR54)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FOR54_tree, root_0);


            char_literal55=(Token)match(input,62,FOLLOW_62_in_for_stmt868); 

            pushFollow(FOLLOW_assign_in_for_stmt871);
            assign56=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign56.getTree());

            char_literal57=(Token)match(input,65,FOLLOW_65_in_for_stmt873); 

            pushFollow(FOLLOW_expr_in_for_stmt876);
            expr58=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr58.getTree());

            char_literal59=(Token)match(input,65,FOLLOW_65_in_for_stmt878); 

            pushFollow(FOLLOW_assign_in_for_stmt881);
            assign60=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign60.getTree());

            char_literal61=(Token)match(input,63,FOLLOW_63_in_for_stmt883); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt886);
            block_instructions62=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions62.getTree());

            ENDFOR63=(Token)match(input,ENDFOR,FOLLOW_ENDFOR_in_for_stmt888); 

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


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:132:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN64=null;
        AslParser.expr_return expr65 =null;


        AslTree RETURN64_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:132:13: ( RETURN ^ ( expr )? )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:132:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN64=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt911); 
            RETURN64_tree = 
            (AslTree)adaptor.create(RETURN64)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN64_tree, root_0);


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:132:23: ( expr )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==62) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:132:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt914);
                    expr65=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr65.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:146:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR67=null;
        AslParser.boolterm_return boolterm66 =null;

        AslParser.boolterm_return boolterm68 =null;


        AslTree OR67_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:146:9: ( boolterm ( OR ^ boolterm )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:146:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr948);
            boolterm66=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm66.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:146:22: ( OR ^ boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:146:23: OR ^ boolterm
            	    {
            	    OR67=(Token)match(input,OR,FOLLOW_OR_in_expr951); 
            	    OR67_tree = 
            	    (AslTree)adaptor.create(OR67)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR67_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr954);
            	    boolterm68=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm68.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:149:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND70=null;
        AslParser.boolfact_return boolfact69 =null;

        AslParser.boolfact_return boolfact71 =null;


        AslTree AND70_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:149:9: ( boolfact ( AND ^ boolfact )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:149:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm974);
            boolfact69=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact69.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:149:22: ( AND ^ boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:149:23: AND ^ boolfact
            	    {
            	    AND70=(Token)match(input,AND,FOLLOW_AND_in_boolterm977); 
            	    AND70_tree = 
            	    (AslTree)adaptor.create(AND70)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND70_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm980);
            	    boolfact71=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact71.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:1: boolfact : num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COND_EQUAL73=null;
        Token NOT_EQUAL74=null;
        Token LT75=null;
        Token LE76=null;
        Token GT77=null;
        Token GE78=null;
        AslParser.num_expr_return num_expr72 =null;

        AslParser.num_expr_return num_expr79 =null;


        AslTree COND_EQUAL73_tree=null;
        AslTree NOT_EQUAL74_tree=null;
        AslTree LT75_tree=null;
        AslTree LE76_tree=null;
        AslTree GT77_tree=null;
        AslTree GE78_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:9: ( num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:13: num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1000);
            num_expr72=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr72.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:22: ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COND_EQUAL||(LA14_0 >= GE && LA14_0 <= GT)||LA14_0==LE||LA14_0==LT||LA14_0==NOT_EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:23: ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:23: ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt13=6;
                    switch ( input.LA(1) ) {
                    case COND_EQUAL:
                        {
                        alt13=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt13=2;
                        }
                        break;
                    case LT:
                        {
                        alt13=3;
                        }
                        break;
                    case LE:
                        {
                        alt13=4;
                        }
                        break;
                    case GT:
                        {
                        alt13=5;
                        }
                        break;
                    case GE:
                        {
                        alt13=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }

                    switch (alt13) {
                        case 1 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:24: COND_EQUAL ^
                            {
                            COND_EQUAL73=(Token)match(input,COND_EQUAL,FOLLOW_COND_EQUAL_in_boolfact1004); 
                            COND_EQUAL73_tree = 
                            (AslTree)adaptor.create(COND_EQUAL73)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(COND_EQUAL73_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:38: NOT_EQUAL ^
                            {
                            NOT_EQUAL74=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1009); 
                            NOT_EQUAL74_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL74)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL74_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:51: LT ^
                            {
                            LT75=(Token)match(input,LT,FOLLOW_LT_in_boolfact1014); 
                            LT75_tree = 
                            (AslTree)adaptor.create(LT75)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT75_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:57: LE ^
                            {
                            LE76=(Token)match(input,LE,FOLLOW_LE_in_boolfact1019); 
                            LE76_tree = 
                            (AslTree)adaptor.create(LE76)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE76_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:63: GT ^
                            {
                            GT77=(Token)match(input,GT,FOLLOW_GT_in_boolfact1024); 
                            GT77_tree = 
                            (AslTree)adaptor.create(GT77)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT77_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:152:69: GE ^
                            {
                            GE78=(Token)match(input,GE,FOLLOW_GE_in_boolfact1029); 
                            GE78_tree = 
                            (AslTree)adaptor.create(GE78)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE78_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1033);
                    num_expr79=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr79.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:155:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS81=null;
        Token MINUS82=null;
        AslParser.term_return term80 =null;

        AslParser.term_return term83 =null;


        AslTree PLUS81_tree=null;
        AslTree MINUS82_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:155:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:155:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1053);
            term80=term();

            state._fsp--;

            adaptor.addChild(root_0, term80.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:155:18: ( ( PLUS ^| MINUS ^) term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:155:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:155:20: ( PLUS ^| MINUS ^)
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==PLUS) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==MINUS) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:155:21: PLUS ^
            	            {
            	            PLUS81=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1058); 
            	            PLUS81_tree = 
            	            (AslTree)adaptor.create(PLUS81)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS81_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:155:29: MINUS ^
            	            {
            	            MINUS82=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1063); 
            	            MINUS82_tree = 
            	            (AslTree)adaptor.create(MINUS82)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS82_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1067);
            	    term83=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term83.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:158:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL85=null;
        Token DIV86=null;
        Token MOD87=null;
        AslParser.factor_return factor84 =null;

        AslParser.factor_return factor88 =null;


        AslTree MUL85_tree=null;
        AslTree DIV86_tree=null;
        AslTree MOD87_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:158:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:158:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1091);
            factor84=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor84.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:158:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DIV||LA18_0==MOD||LA18_0==MUL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:158:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:158:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:158:23: MUL ^
            	            {
            	            MUL85=(Token)match(input,MUL,FOLLOW_MUL_in_term1096); 
            	            MUL85_tree = 
            	            (AslTree)adaptor.create(MUL85)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL85_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:158:30: DIV ^
            	            {
            	            DIV86=(Token)match(input,DIV,FOLLOW_DIV_in_term1101); 
            	            DIV86_tree = 
            	            (AslTree)adaptor.create(DIV86)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV86_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:158:37: MOD ^
            	            {
            	            MOD87=(Token)match(input,MOD,FOLLOW_MOD_in_term1106); 
            	            MOD87_tree = 
            	            (AslTree)adaptor.create(MOD87)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD87_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1110);
            	    factor88=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor88.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:161:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT89=null;
        Token PLUS90=null;
        Token MINUS91=null;
        AslParser.atom_return atom92 =null;


        AslTree NOT89_tree=null;
        AslTree PLUS90_tree=null;
        AslTree MINUS91_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:161:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:161:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:161:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt19=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt19=1;
                    }
                    break;
                case PLUS:
                    {
                    alt19=2;
                    }
                    break;
                case MINUS:
                    {
                    alt19=3;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:161:14: NOT ^
                    {
                    NOT89=(Token)match(input,NOT,FOLLOW_NOT_in_factor1133); 
                    NOT89_tree = 
                    (AslTree)adaptor.create(NOT89)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT89_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:161:21: PLUS ^
                    {
                    PLUS90=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1138); 
                    PLUS90_tree = 
                    (AslTree)adaptor.create(PLUS90)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS90_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:161:29: MINUS ^
                    {
                    MINUS91=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1143); 
                    MINUS91_tree = 
                    (AslTree)adaptor.create(MINUS91)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS91_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1148);
            atom92=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom92.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:167:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID93=null;
        Token INT94=null;
        Token char_literal96=null;
        Token char_literal98=null;
        AslParser.funcall_return funcall95 =null;

        AslParser.expr_return expr97 =null;


        AslTree b_tree=null;
        AslTree ID93_tree=null;
        AslTree INT94_tree=null;
        AslTree char_literal96_tree=null;
        AslTree char_literal98_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:167:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt21=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==62) ) {
                    alt21=4;
                }
                else if ( (LA21_1==AND||LA21_1==COND_EQUAL||LA21_1==DIV||(LA21_1 >= ELSE && LA21_1 <= ELSEIF)||(LA21_1 >= ENDFOR && LA21_1 <= ENDWHILE)||(LA21_1 >= GE && LA21_1 <= GT)||LA21_1==LE||(LA21_1 >= LT && LA21_1 <= MOD)||LA21_1==MUL||(LA21_1 >= NOT_EQUAL && LA21_1 <= OR)||LA21_1==PLUS||(LA21_1 >= 63 && LA21_1 <= 65)||LA21_1==68) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt21=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt21=3;
                }
                break;
            case 62:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:167:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID93=(Token)match(input,ID,FOLLOW_ID_in_atom1173); 
                    ID93_tree = 
                    (AslTree)adaptor.create(ID93)
                    ;
                    adaptor.addChild(root_0, ID93_tree);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:168:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT94=(Token)match(input,INT,FOLLOW_INT_in_atom1188); 
                    INT94_tree = 
                    (AslTree)adaptor.create(INT94)
                    ;
                    adaptor.addChild(root_0, INT94_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:169:13: (b= TRUE |b= FALSE )
                    {
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:169:13: (b= TRUE |b= FALSE )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==TRUE) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==FALSE) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }
                    switch (alt20) {
                        case 1 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:169:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1205);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:169:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1211);  
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
                    // 169:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:169:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:170:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1234);
                    funcall95=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall95.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:171:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal96=(Token)match(input,62,FOLLOW_62_in_atom1248); 

                    pushFollow(FOLLOW_expr_in_atom1251);
                    expr97=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr97.getTree());

                    char_literal98=(Token)match(input,63,FOLLOW_63_in_atom1253); 

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID99=null;
        Token char_literal100=null;
        Token char_literal102=null;
        AslParser.expr_list_return expr_list101 =null;


        AslTree ID99_tree=null;
        AslTree char_literal100_tree=null;
        AslTree char_literal102_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:13: ID '(' ( expr_list )? ')'
            {
            ID99=(Token)match(input,ID,FOLLOW_ID_in_funcall1274);  
            stream_ID.add(ID99);


            char_literal100=(Token)match(input,62,FOLLOW_62_in_funcall1276);  
            stream_62.add(char_literal100);


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:20: ( expr_list )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FALSE||LA22_0==ID||LA22_0==INT||LA22_0==MINUS||LA22_0==NOT||LA22_0==PLUS||LA22_0==TRUE||LA22_0==62) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1278);
                    expr_list101=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list101.getTree());

                    }
                    break;

            }


            char_literal102=(Token)match(input,63,FOLLOW_63_in_funcall1281);  
            stream_63.add(char_literal102);


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
            // 175:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:61: ( expr_list )?
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:179:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal104=null;
        AslParser.expr_return expr103 =null;

        AslParser.expr_return expr105 =null;


        AslTree char_literal104_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:179:10: ( expr ( ',' ! expr )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:179:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1314);
            expr103=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr103.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:179:18: ( ',' ! expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==64) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:179:19: ',' ! expr
            	    {
            	    char_literal104=(Token)match(input,64,FOLLOW_64_in_expr_list1317); 

            	    pushFollow(FOLLOW_expr_in_expr_list1320);
            	    expr105=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr105.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:182:1: time_annotation : '@' BEGIN EQUAL expr ( ',' finish_time )? -> ^( TIMEANNOTATION expr finish_time ) ;
    public final AslParser.time_annotation_return time_annotation() throws RecognitionException {
        AslParser.time_annotation_return retval = new AslParser.time_annotation_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal106=null;
        Token BEGIN107=null;
        Token EQUAL108=null;
        Token char_literal110=null;
        AslParser.expr_return expr109 =null;

        AslParser.finish_time_return finish_time111 =null;


        AslTree char_literal106_tree=null;
        AslTree BEGIN107_tree=null;
        AslTree EQUAL108_tree=null;
        AslTree char_literal110_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_finish_time=new RewriteRuleSubtreeStream(adaptor,"rule finish_time");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:182:16: ( '@' BEGIN EQUAL expr ( ',' finish_time )? -> ^( TIMEANNOTATION expr finish_time ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:13: '@' BEGIN EQUAL expr ( ',' finish_time )?
            {
            char_literal106=(Token)match(input,66,FOLLOW_66_in_time_annotation1350);  
            stream_66.add(char_literal106);


            BEGIN107=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_time_annotation1352);  
            stream_BEGIN.add(BEGIN107);


            EQUAL108=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_time_annotation1354);  
            stream_EQUAL.add(EQUAL108);


            pushFollow(FOLLOW_expr_in_time_annotation1356);
            expr109=expr();

            state._fsp--;

            stream_expr.add(expr109.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:34: ( ',' finish_time )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==64) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:35: ',' finish_time
                    {
                    char_literal110=(Token)match(input,64,FOLLOW_64_in_time_annotation1359);  
                    stream_64.add(char_literal110);


                    pushFollow(FOLLOW_finish_time_in_time_annotation1361);
                    finish_time111=finish_time();

                    state._fsp--;

                    stream_finish_time.add(finish_time111.getTree());

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
            // 183:53: -> ^( TIMEANNOTATION expr finish_time )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:56: ^( TIMEANNOTATION expr finish_time )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(TIMEANNOTATION, "TIMEANNOTATION")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_finish_time.nextTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:186:1: finish_time : ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr ) ;
    public final AslParser.finish_time_return finish_time() throws RecognitionException {
        AslParser.finish_time_return retval = new AslParser.finish_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token END112=null;
        Token EQUAL113=null;
        Token DURATION115=null;
        Token EQUAL116=null;
        AslParser.expr_return expr114 =null;

        AslParser.expr_return expr117 =null;


        AslTree END112_tree=null;
        AslTree EQUAL113_tree=null;
        AslTree DURATION115_tree=null;
        AslTree EQUAL116_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:186:12: ( ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:187:13: ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr )
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:187:13: ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==END) ) {
                alt25=1;
            }
            else if ( (LA25_0==DURATION) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:187:14: END ^ EQUAL ! expr
                    {
                    END112=(Token)match(input,END,FOLLOW_END_in_finish_time1402); 
                    END112_tree = 
                    (AslTree)adaptor.create(END112)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(END112_tree, root_0);


                    EQUAL113=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_finish_time1405); 

                    pushFollow(FOLLOW_expr_in_finish_time1408);
                    expr114=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr114.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:187:33: DURATION ^ EQUAL ! expr
                    {
                    DURATION115=(Token)match(input,DURATION,FOLLOW_DURATION_in_finish_time1412); 
                    DURATION115_tree = 
                    (AslTree)adaptor.create(DURATION115)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(DURATION115_tree, root_0);


                    EQUAL116=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_finish_time1415); 

                    pushFollow(FOLLOW_expr_in_finish_time1418);
                    expr117=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr117.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:190:1: create : CREATE TYPE_OBJECT coordenades ( list_attributes )? -> ^( CREATE TYPE_OBJECT coordenades ^( ATTRIBUTES list_attributes ) ) ;
    public final AslParser.create_return create() throws RecognitionException {
        AslParser.create_return retval = new AslParser.create_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token CREATE118=null;
        Token TYPE_OBJECT119=null;
        AslParser.coordenades_return coordenades120 =null;

        AslParser.list_attributes_return list_attributes121 =null;


        AslTree CREATE118_tree=null;
        AslTree TYPE_OBJECT119_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_TYPE_OBJECT=new RewriteRuleTokenStream(adaptor,"token TYPE_OBJECT");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        RewriteRuleSubtreeStream stream_list_attributes=new RewriteRuleSubtreeStream(adaptor,"rule list_attributes");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:190:7: ( CREATE TYPE_OBJECT coordenades ( list_attributes )? -> ^( CREATE TYPE_OBJECT coordenades ^( ATTRIBUTES list_attributes ) ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:190:13: CREATE TYPE_OBJECT coordenades ( list_attributes )?
            {
            CREATE118=(Token)match(input,CREATE,FOLLOW_CREATE_in_create1439);  
            stream_CREATE.add(CREATE118);


            TYPE_OBJECT119=(Token)match(input,TYPE_OBJECT,FOLLOW_TYPE_OBJECT_in_create1441);  
            stream_TYPE_OBJECT.add(TYPE_OBJECT119);


            pushFollow(FOLLOW_coordenades_in_create1443);
            coordenades120=coordenades();

            state._fsp--;

            stream_coordenades.add(coordenades120.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:190:44: ( list_attributes )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ATTRIBUTE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:190:44: list_attributes
                    {
                    pushFollow(FOLLOW_list_attributes_in_create1445);
                    list_attributes121=list_attributes();

                    state._fsp--;

                    stream_list_attributes.add(list_attributes121.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: CREATE, coordenades, list_attributes, TYPE_OBJECT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 190:61: -> ^( CREATE TYPE_OBJECT coordenades ^( ATTRIBUTES list_attributes ) )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:190:64: ^( CREATE TYPE_OBJECT coordenades ^( ATTRIBUTES list_attributes ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                stream_CREATE.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_TYPE_OBJECT.nextNode()
                );

                adaptor.addChild(root_1, stream_coordenades.nextTree());

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:190:97: ^( ATTRIBUTES list_attributes )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ATTRIBUTES, "ATTRIBUTES")
                , root_2);

                adaptor.addChild(root_2, stream_list_attributes.nextTree());

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
    // $ANTLR end "create"


    public static class destroy_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "destroy"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:193:1: destroy : DESTROY ^ ID ;
    public final AslParser.destroy_return destroy() throws RecognitionException {
        AslParser.destroy_return retval = new AslParser.destroy_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DESTROY122=null;
        Token ID123=null;

        AslTree DESTROY122_tree=null;
        AslTree ID123_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:193:8: ( DESTROY ^ ID )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:193:14: DESTROY ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            DESTROY122=(Token)match(input,DESTROY,FOLLOW_DESTROY_in_destroy1490); 
            DESTROY122_tree = 
            (AslTree)adaptor.create(DESTROY122)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DESTROY122_tree, root_0);


            ID123=(Token)match(input,ID,FOLLOW_ID_in_destroy1493); 
            ID123_tree = 
            (AslTree)adaptor.create(ID123)
            ;
            adaptor.addChild(root_0, ID123_tree);


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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:196:1: move : MOVE ^ ID coordenades ;
    public final AslParser.move_return move() throws RecognitionException {
        AslParser.move_return retval = new AslParser.move_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVE124=null;
        Token ID125=null;
        AslParser.coordenades_return coordenades126 =null;


        AslTree MOVE124_tree=null;
        AslTree ID125_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:196:5: ( MOVE ^ ID coordenades )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:196:8: MOVE ^ ID coordenades
            {
            root_0 = (AslTree)adaptor.nil();


            MOVE124=(Token)match(input,MOVE,FOLLOW_MOVE_in_move1518); 
            MOVE124_tree = 
            (AslTree)adaptor.create(MOVE124)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MOVE124_tree, root_0);


            ID125=(Token)match(input,ID,FOLLOW_ID_in_move1521); 
            ID125_tree = 
            (AslTree)adaptor.create(ID125)
            ;
            adaptor.addChild(root_0, ID125_tree);


            pushFollow(FOLLOW_coordenades_in_move1523);
            coordenades126=coordenades();

            state._fsp--;

            adaptor.addChild(root_0, coordenades126.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:199:1: translate : TRANSLATE ^ ID coordenades ;
    public final AslParser.translate_return translate() throws RecognitionException {
        AslParser.translate_return retval = new AslParser.translate_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TRANSLATE127=null;
        Token ID128=null;
        AslParser.coordenades_return coordenades129 =null;


        AslTree TRANSLATE127_tree=null;
        AslTree ID128_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:199:10: ( TRANSLATE ^ ID coordenades )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:199:12: TRANSLATE ^ ID coordenades
            {
            root_0 = (AslTree)adaptor.nil();


            TRANSLATE127=(Token)match(input,TRANSLATE,FOLLOW_TRANSLATE_in_translate1533); 
            TRANSLATE127_tree = 
            (AslTree)adaptor.create(TRANSLATE127)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(TRANSLATE127_tree, root_0);


            ID128=(Token)match(input,ID,FOLLOW_ID_in_translate1536); 
            ID128_tree = 
            (AslTree)adaptor.create(ID128)
            ;
            adaptor.addChild(root_0, ID128_tree);


            pushFollow(FOLLOW_coordenades_in_translate1538);
            coordenades129=coordenades();

            state._fsp--;

            adaptor.addChild(root_0, coordenades129.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:202:1: modify : MODIFY ^ ID list_attributes ;
    public final AslParser.modify_return modify() throws RecognitionException {
        AslParser.modify_return retval = new AslParser.modify_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODIFY130=null;
        Token ID131=null;
        AslParser.list_attributes_return list_attributes132 =null;


        AslTree MODIFY130_tree=null;
        AslTree ID131_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:202:7: ( MODIFY ^ ID list_attributes )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:202:10: MODIFY ^ ID list_attributes
            {
            root_0 = (AslTree)adaptor.nil();


            MODIFY130=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_modify1549); 
            MODIFY130_tree = 
            (AslTree)adaptor.create(MODIFY130)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODIFY130_tree, root_0);


            ID131=(Token)match(input,ID,FOLLOW_ID_in_modify1552); 
            ID131_tree = 
            (AslTree)adaptor.create(ID131)
            ;
            adaptor.addChild(root_0, ID131_tree);


            pushFollow(FOLLOW_list_attributes_in_modify1554);
            list_attributes132=list_attributes();

            state._fsp--;

            adaptor.addChild(root_0, list_attributes132.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:205:1: rotate : ROTATE ^ ID expr ;
    public final AslParser.rotate_return rotate() throws RecognitionException {
        AslParser.rotate_return retval = new AslParser.rotate_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ROTATE133=null;
        Token ID134=null;
        AslParser.expr_return expr135 =null;


        AslTree ROTATE133_tree=null;
        AslTree ID134_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:205:7: ( ROTATE ^ ID expr )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:205:10: ROTATE ^ ID expr
            {
            root_0 = (AslTree)adaptor.nil();


            ROTATE133=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_rotate1565); 
            ROTATE133_tree = 
            (AslTree)adaptor.create(ROTATE133)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(ROTATE133_tree, root_0);


            ID134=(Token)match(input,ID,FOLLOW_ID_in_rotate1568); 
            ID134_tree = 
            (AslTree)adaptor.create(ID134)
            ;
            adaptor.addChild(root_0, ID134_tree);


            pushFollow(FOLLOW_expr_in_rotate1570);
            expr135=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr135.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:208:1: list_attributes : attribute ( ',' ! attribute )* ;
    public final AslParser.list_attributes_return list_attributes() throws RecognitionException {
        AslParser.list_attributes_return retval = new AslParser.list_attributes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal137=null;
        AslParser.attribute_return attribute136 =null;

        AslParser.attribute_return attribute138 =null;


        AslTree char_literal137_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:208:16: ( attribute ( ',' ! attribute )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:208:20: attribute ( ',' ! attribute )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_attribute_in_list_attributes1581);
            attribute136=attribute();

            state._fsp--;

            adaptor.addChild(root_0, attribute136.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:208:30: ( ',' ! attribute )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==64) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:208:31: ',' ! attribute
            	    {
            	    char_literal137=(Token)match(input,64,FOLLOW_64_in_list_attributes1584); 

            	    pushFollow(FOLLOW_attribute_in_list_attributes1587);
            	    attribute138=attribute();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribute138.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:211:1: attribute : ATTRIBUTE ^ EQUAL ! expr ;
    public final AslParser.attribute_return attribute() throws RecognitionException {
        AslParser.attribute_return retval = new AslParser.attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ATTRIBUTE139=null;
        Token EQUAL140=null;
        AslParser.expr_return expr141 =null;


        AslTree ATTRIBUTE139_tree=null;
        AslTree EQUAL140_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:211:10: ( ATTRIBUTE ^ EQUAL ! expr )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:211:12: ATTRIBUTE ^ EQUAL ! expr
            {
            root_0 = (AslTree)adaptor.nil();


            ATTRIBUTE139=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute1598); 
            ATTRIBUTE139_tree = 
            (AslTree)adaptor.create(ATTRIBUTE139)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(ATTRIBUTE139_tree, root_0);


            EQUAL140=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_attribute1601); 

            pushFollow(FOLLOW_expr_in_attribute1604);
            expr141=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr141.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:214:1: coordenades : '{' ! expr ',' ! expr '}' !;
    public final AslParser.coordenades_return coordenades() throws RecognitionException {
        AslParser.coordenades_return retval = new AslParser.coordenades_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal142=null;
        Token char_literal144=null;
        Token char_literal146=null;
        AslParser.expr_return expr143 =null;

        AslParser.expr_return expr145 =null;


        AslTree char_literal142_tree=null;
        AslTree char_literal144_tree=null;
        AslTree char_literal146_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:214:12: ( '{' ! expr ',' ! expr '}' !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:214:14: '{' ! expr ',' ! expr '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            char_literal142=(Token)match(input,67,FOLLOW_67_in_coordenades1616); 

            pushFollow(FOLLOW_expr_in_coordenades1619);
            expr143=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr143.getTree());

            char_literal144=(Token)match(input,64,FOLLOW_64_in_coordenades1621); 

            pushFollow(FOLLOW_expr_in_coordenades1624);
            expr145=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr145.getTree());

            char_literal146=(Token)match(input,68,FOLLOW_68_in_coordenades1626); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog170 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EOF_in_prog173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func212 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_func215 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_params_in_func217 = new BitSet(new long[]{0x09300C0610806000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_instructions_in_func219 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_params240 = new BitSet(new long[]{0x8000000200000000L});
    public static final BitSet FOLLOW_paramlist_in_params242 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_params245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_paramlist274 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_param_in_paramlist277 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ID_in_param304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions338 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ENDLINE_in_block_instructions341 = new BitSet(new long[]{0x09300C0610806000L,0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_block_instructions343 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_assign_in_instruction392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_instruction_in_instruction417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_annotation_in_instruction525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign591 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQUAL_in_assign595 = new BitSet(new long[]{0x01200C0000006000L});
    public static final BitSet FOLLOW_basic_instruction_in_assign597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign614 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQUAL_in_assign618 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_assign620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_basic_instruction664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destroy_in_basic_instruction679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_basic_instruction694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translate_in_basic_instruction709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_in_basic_instruction724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rotate_in_basic_instruction739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt757 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ite_stmt760 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt763 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ite_stmt765 = new BitSet(new long[]{0x09300C0610806000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt768 = new BitSet(new long[]{0x0000000000460000L});
    public static final BitSet FOLLOW_ELSEIF_in_ite_stmt771 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ite_stmt774 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt777 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ite_stmt779 = new BitSet(new long[]{0x09300C0610806000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt782 = new BitSet(new long[]{0x0000000000460000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt787 = new BitSet(new long[]{0x09300C0610806000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt790 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt817 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_while_stmt820 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_while_stmt823 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_while_stmt825 = new BitSet(new long[]{0x09300C0610806000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt828 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt865 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_for_stmt868 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_assign_in_for_stmt871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_for_stmt873 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_for_stmt876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_for_stmt878 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_assign_in_for_stmt881 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_for_stmt883 = new BitSet(new long[]{0x09300C0610806000L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt886 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ENDFOR_in_for_stmt888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt911 = new BitSet(new long[]{0x4202210A08000002L});
    public static final BitSet FOLLOW_expr_in_return_stmt914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr948 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_OR_in_expr951 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_boolterm_in_expr954 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm974 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm977 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm980 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1000 = new BitSet(new long[]{0x0000409180001002L});
    public static final BitSet FOLLOW_COND_EQUAL_in_boolfact1004 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1009 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_LT_in_boolfact1014 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_LE_in_boolfact1019 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_GT_in_boolfact1024 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_GE_in_boolfact1029 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1053 = new BitSet(new long[]{0x0002010000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1058 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1063 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_term_in_num_expr1067 = new BitSet(new long[]{0x0002010000000002L});
    public static final BitSet FOLLOW_factor_in_term1091 = new BitSet(new long[]{0x0000120000008002L});
    public static final BitSet FOLLOW_MUL_in_term1096 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_DIV_in_term1101 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_MOD_in_term1106 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_factor_in_term1110 = new BitSet(new long[]{0x0000120000008002L});
    public static final BitSet FOLLOW_NOT_in_factor1133 = new BitSet(new long[]{0x4200000A08000000L});
    public static final BitSet FOLLOW_PLUS_in_factor1138 = new BitSet(new long[]{0x4200000A08000000L});
    public static final BitSet FOLLOW_MINUS_in_factor1143 = new BitSet(new long[]{0x4200000A08000000L});
    public static final BitSet FOLLOW_atom_in_factor1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_atom1248 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_atom1251 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_atom1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1274 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_funcall1276 = new BitSet(new long[]{0xC202210A08000000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1278 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_funcall1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1314 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_expr_list1317 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_expr_list1320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_66_in_time_annotation1350 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BEGIN_in_time_annotation1352 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQUAL_in_time_annotation1354 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_time_annotation1356 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_time_annotation1359 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_finish_time_in_time_annotation1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_finish_time1402 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQUAL_in_finish_time1405 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_finish_time1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_finish_time1412 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQUAL_in_finish_time1415 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_finish_time1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create1439 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TYPE_OBJECT_in_create1441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_coordenades_in_create1443 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_list_attributes_in_create1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTROY_in_destroy1490 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_destroy1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move1518 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_move1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_coordenades_in_move1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSLATE_in_translate1533 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_translate1536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_coordenades_in_translate1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_in_modify1549 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_modify1552 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_list_attributes_in_modify1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_rotate1565 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_rotate1568 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_rotate1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_list_attributes1584 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute1598 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQUAL_in_attribute1601 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_attribute1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_coordenades1616 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_coordenades1619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_coordenades1621 = new BitSet(new long[]{0x4202210A08000000L});
    public static final BitSet FOLLOW_expr_in_coordenades1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_coordenades1626 = new BitSet(new long[]{0x0000000000000002L});

}