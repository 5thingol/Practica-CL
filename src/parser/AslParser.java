// $ANTLR 3.4 /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g 2016-05-02 08:45:52

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESATTRIBUTE", "AND", "ARGLIST", "ASSIGN", "ATTRIBUTE", "ATTRIBUTES", "BEGIN", "BOOLEAN", "COMMENT", "COND_EQUAL", "CREATE", "DESTROY", "DIV", "DURATION", "ELSE", "ELSEIF", "END", "ENDFOR", "ENDFUNC", "ENDIF", "ENDLINE", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FOR", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MODIFY", "MOVE", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "READ", "RETURN", "ROTATE", "STRING", "TIMEANNOTATION", "TRANSLATE", "TRUE", "TYPE_OBJECT", "WHILE", "WRITE", "WS", "'('", "')'", "','", "'.'", "';'", "'@'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:58:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:58:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:58:8: ( func )+ EOF
            {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:58:8: ( func )+
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
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:58:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog93);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog96);  
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
            // 58:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:58:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:61:1: func : FUNC ^ ID params block_instructions ENDFUNC ! ( ENDLINE )* ;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        Token ENDLINE8=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;
        AslTree ENDLINE8_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:61:6: ( FUNC ^ ID params block_instructions ENDFUNC ! ( ENDLINE )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:61:8: FUNC ^ ID params block_instructions ENDFUNC ! ( ENDLINE )*
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func114); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func117); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func119);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func121);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func123); 

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:61:52: ( ENDLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ENDLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:61:52: ENDLINE
            	    {
            	    ENDLINE8=(Token)match(input,ENDLINE,FOLLOW_ENDLINE_in_func126); 
            	    ENDLINE8_tree = 
            	    (AslTree)adaptor.create(ENDLINE8)
            	    ;
            	    adaptor.addChild(root_0, ENDLINE8_tree);


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:64:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal9=null;
        Token char_literal11=null;
        AslParser.paramlist_return paramlist10 =null;


        AslTree char_literal9_tree=null;
        AslTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:64:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:64:10: '(' ( paramlist )? ')'
            {
            char_literal9=(Token)match(input,63,FOLLOW_63_in_params136);  
            stream_63.add(char_literal9);


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:64:14: ( paramlist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:64:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params138);
                    paramlist10=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist10.getTree());

                    }
                    break;

            }


            char_literal11=(Token)match(input,64,FOLLOW_64_in_params141);  
            stream_64.add(char_literal11);


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
            // 64:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:64:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:64:41: ( paramlist )?
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:67:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal13=null;
        AslParser.param_return param12 =null;

        AslParser.param_return param14 =null;


        AslTree char_literal13_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:67:10: ( param ( ',' ! param )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:67:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist158);
            param12=param();

            state._fsp--;

            adaptor.addChild(root_0, param12.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:67:18: ( ',' ! param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==65) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:67:19: ',' ! param
            	    {
            	    char_literal13=(Token)match(input,65,FOLLOW_65_in_paramlist161); 

            	    pushFollow(FOLLOW_param_in_paramlist164);
            	    param14=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param14.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:71:1: param : id= ID -> ^( PREF[$id,$id.text] ) ;
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;

        AslTree id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:71:7: (id= ID -> ^( PREF[$id,$id.text] ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:71:9: id= ID
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_param178);  
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
            // 71:15: -> ^( PREF[$id,$id.text] )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:71:18: ^( PREF[$id,$id.text] )
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:74:1: block_instructions : instruction ( ENDLINE instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ENDLINE16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree ENDLINE16_tree=null;
        RewriteRuleTokenStream stream_ENDLINE=new RewriteRuleTokenStream(adaptor,"token ENDLINE");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:75:5: ( instruction ( ENDLINE instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:75:5: instruction ( ENDLINE instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions196);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:75:17: ( ENDLINE instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ENDLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:75:18: ENDLINE instruction
            	    {
            	    ENDLINE16=(Token)match(input,ENDLINE,FOLLOW_ENDLINE_in_block_instructions199);  
            	    stream_ENDLINE.add(ENDLINE16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions201);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // 76:4: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:76:4: ^( LIST_INSTR ( instruction )+ )
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:79:1: instruction : ( assign | basic_instruction | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | time_annotation |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign18 =null;

        AslParser.basic_instruction_return basic_instruction19 =null;

        AslParser.ite_stmt_return ite_stmt20 =null;

        AslParser.while_stmt_return while_stmt21 =null;

        AslParser.for_stmt_return for_stmt22 =null;

        AslParser.funcall_return funcall23 =null;

        AslParser.return_stmt_return return_stmt24 =null;

        AslParser.time_annotation_return time_annotation25 =null;



        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:80:5: ( assign | basic_instruction | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | time_annotation |)
            int alt6=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL) ) {
                    alt6=1;
                }
                else if ( (LA6_1==63) ) {
                    alt6=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

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
                alt6=2;
                }
                break;
            case IF:
                {
                alt6=3;
                }
                break;
            case WHILE:
                {
                alt6=4;
                }
                break;
            case FOR:
                {
                alt6=5;
                }
                break;
            case RETURN:
                {
                alt6=7;
                }
                break;
            case 68:
                {
                alt6=8;
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
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:80:5: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction223);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:81:3: basic_instruction
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_basic_instruction_in_instruction228);
                    basic_instruction19=basic_instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_instruction19.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:82:3: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction233);
                    ite_stmt20=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:83:3: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction238);
                    while_stmt21=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt21.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:84:3: for_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction243);
                    for_stmt22=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:85:3: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction247);
                    funcall23=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall23.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:86:3: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction252);
                    return_stmt24=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt24.getTree());

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:87:3: time_annotation
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_time_annotation_in_instruction257);
                    time_annotation25=time_annotation();

                    state._fsp--;

                    adaptor.addChild(root_0, time_annotation25.getTree());

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
        Token ID26=null;
        Token ID28=null;
        AslParser.basic_instruction_return basic_instruction27 =null;

        AslParser.expr_return expr29 =null;


        AslTree eq_tree=null;
        AslTree ID26_tree=null;
        AslTree ID28_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_basic_instruction=new RewriteRuleSubtreeStream(adaptor,"rule basic_instruction");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:93:8: ( ID eq= EQUAL basic_instruction -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction ) | ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EQUAL) ) {
                    int LA7_2 = input.LA(3);

                    if ( ((LA7_2 >= CREATE && LA7_2 <= DESTROY)||(LA7_2 >= MODIFY && LA7_2 <= MOVE)||LA7_2==ROTATE||LA7_2==TRANSLATE) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==FALSE||LA7_2==ID||LA7_2==INT||LA7_2==MINUS||LA7_2==NOT||LA7_2==PLUS||LA7_2==TRUE||LA7_2==63) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:93:13: ID eq= EQUAL basic_instruction
                    {
                    ID26=(Token)match(input,ID,FOLLOW_ID_in_assign275);  
                    stream_ID.add(ID26);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign279);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_basic_instruction_in_assign281);
                    basic_instruction27=basic_instruction();

                    state._fsp--;

                    stream_basic_instruction.add(basic_instruction27.getTree());

                    // AST REWRITE
                    // elements: basic_instruction, ID
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
                    ID28=(Token)match(input,ID,FOLLOW_ID_in_assign297);  
                    stream_ID.add(ID28);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign301);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign303);
                    expr29=expr();

                    state._fsp--;

                    stream_expr.add(expr29.getTree());

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

        AslParser.create_return create30 =null;

        AslParser.destroy_return destroy31 =null;

        AslParser.move_return move32 =null;

        AslParser.translate_return translate33 =null;

        AslParser.modify_return modify34 =null;

        AslParser.rotate_return rotate35 =null;



        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:96:18: ( create | destroy | move | translate | modify | rotate )
            int alt8=6;
            switch ( input.LA(1) ) {
            case CREATE:
                {
                alt8=1;
                }
                break;
            case DESTROY:
                {
                alt8=2;
                }
                break;
            case MOVE:
                {
                alt8=3;
                }
                break;
            case TRANSLATE:
                {
                alt8=4;
                }
                break;
            case MODIFY:
                {
                alt8=5;
                }
                break;
            case ROTATE:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:97:1: create
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_create_in_basic_instruction322);
                    create30=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create30.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:98:3: destroy
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_destroy_in_basic_instruction326);
                    destroy31=destroy();

                    state._fsp--;

                    adaptor.addChild(root_0, destroy31.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:99:3: move
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_in_basic_instruction330);
                    move32=move();

                    state._fsp--;

                    adaptor.addChild(root_0, move32.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:100:3: translate
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_translate_in_basic_instruction334);
                    translate33=translate();

                    state._fsp--;

                    adaptor.addChild(root_0, translate33.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:101:3: modify
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_in_basic_instruction338);
                    modify34=modify();

                    state._fsp--;

                    adaptor.addChild(root_0, modify34.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:102:3: rotate
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_rotate_in_basic_instruction342);
                    rotate35=rotate();

                    state._fsp--;

                    adaptor.addChild(root_0, rotate35.getTree());

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

        Token IF36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token ENDIF43=null;
        AslParser.expr_return expr38 =null;

        AslParser.block_instructions_return block_instructions40 =null;

        AslParser.elseif_stmt_return elseif_stmt41 =null;

        AslParser.else_stmt_return else_stmt42 =null;


        AslTree IF36_tree=null;
        AslTree char_literal37_tree=null;
        AslTree char_literal39_tree=null;
        AslTree ENDIF43_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:105:10: ( IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:105:13: IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF36=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt352); 
            IF36_tree = 
            (AslTree)adaptor.create(IF36)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF36_tree, root_0);


            char_literal37=(Token)match(input,63,FOLLOW_63_in_ite_stmt355); 

            pushFollow(FOLLOW_expr_in_ite_stmt358);
            expr38=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr38.getTree());

            char_literal39=(Token)match(input,64,FOLLOW_64_in_ite_stmt360); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt363);
            block_instructions40=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions40.getTree());

            pushFollow(FOLLOW_elseif_stmt_in_ite_stmt365);
            elseif_stmt41=elseif_stmt();

            state._fsp--;

            adaptor.addChild(root_0, elseif_stmt41.getTree());

            pushFollow(FOLLOW_else_stmt_in_ite_stmt367);
            else_stmt42=else_stmt();

            state._fsp--;

            adaptor.addChild(root_0, else_stmt42.getTree());

            ENDIF43=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt369); 

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

        Token ELSEIF44=null;
        Token char_literal45=null;
        Token char_literal47=null;
        AslParser.expr_return expr46 =null;

        AslParser.block_instructions_return block_instructions48 =null;


        AslTree ELSEIF44_tree=null;
        AslTree char_literal45_tree=null;
        AslTree char_literal47_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:108:12: ( ( ELSEIF ^ '(' ! expr ')' ! block_instructions )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:108:14: ( ELSEIF ^ '(' ! expr ')' ! block_instructions )*
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:108:14: ( ELSEIF ^ '(' ! expr ')' ! block_instructions )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ELSEIF) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:108:15: ELSEIF ^ '(' ! expr ')' ! block_instructions
            	    {
            	    ELSEIF44=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseif_stmt379); 
            	    ELSEIF44_tree = 
            	    (AslTree)adaptor.create(ELSEIF44)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(ELSEIF44_tree, root_0);


            	    char_literal45=(Token)match(input,63,FOLLOW_63_in_elseif_stmt382); 

            	    pushFollow(FOLLOW_expr_in_elseif_stmt385);
            	    expr46=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr46.getTree());

            	    char_literal47=(Token)match(input,64,FOLLOW_64_in_elseif_stmt387); 

            	    pushFollow(FOLLOW_block_instructions_in_elseif_stmt390);
            	    block_instructions48=block_instructions();

            	    state._fsp--;

            	    adaptor.addChild(root_0, block_instructions48.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
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

        Token ELSE49=null;
        AslParser.block_instructions_return block_instructions50 =null;


        AslTree ELSE49_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:111:10: ( ( ELSE ^ block_instructions )? )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:111:12: ( ELSE ^ block_instructions )?
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:111:12: ( ELSE ^ block_instructions )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ELSE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:111:13: ELSE ^ block_instructions
                    {
                    ELSE49=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt401); 
                    ELSE49_tree = 
                    (AslTree)adaptor.create(ELSE49)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ELSE49_tree, root_0);


                    pushFollow(FOLLOW_block_instructions_in_else_stmt404);
                    block_instructions50=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions50.getTree());

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

        Token WHILE51=null;
        Token char_literal52=null;
        Token char_literal54=null;
        Token ENDWHILE56=null;
        AslParser.expr_return expr53 =null;

        AslParser.block_instructions_return block_instructions55 =null;


        AslTree WHILE51_tree=null;
        AslTree char_literal52_tree=null;
        AslTree char_literal54_tree=null;
        AslTree ENDWHILE56_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:115:12: ( WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:115:17: WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE51=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt419); 
            WHILE51_tree = 
            (AslTree)adaptor.create(WHILE51)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE51_tree, root_0);


            char_literal52=(Token)match(input,63,FOLLOW_63_in_while_stmt422); 

            pushFollow(FOLLOW_expr_in_while_stmt425);
            expr53=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr53.getTree());

            char_literal54=(Token)match(input,64,FOLLOW_64_in_while_stmt427); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt430);
            block_instructions55=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions55.getTree());

            ENDWHILE56=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt432); 

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:118:1: for_stmt : FOR ^ '(' ! assign ';' ! expr ';' ! assign ')' ! block_instructions ENDFOR !;
    public final AslParser.for_stmt_return for_stmt() throws RecognitionException {
        AslParser.for_stmt_return retval = new AslParser.for_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FOR57=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token ENDFOR66=null;
        AslParser.assign_return assign59 =null;

        AslParser.expr_return expr61 =null;

        AslParser.assign_return assign63 =null;

        AslParser.block_instructions_return block_instructions65 =null;


        AslTree FOR57_tree=null;
        AslTree char_literal58_tree=null;
        AslTree char_literal60_tree=null;
        AslTree char_literal62_tree=null;
        AslTree char_literal64_tree=null;
        AslTree ENDFOR66_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:118:10: ( FOR ^ '(' ! assign ';' ! expr ';' ! assign ')' ! block_instructions ENDFOR !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:118:13: FOR ^ '(' ! assign ';' ! expr ';' ! assign ')' ! block_instructions ENDFOR !
            {
            root_0 = (AslTree)adaptor.nil();


            FOR57=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt443); 
            FOR57_tree = 
            (AslTree)adaptor.create(FOR57)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FOR57_tree, root_0);


            char_literal58=(Token)match(input,63,FOLLOW_63_in_for_stmt446); 

            pushFollow(FOLLOW_assign_in_for_stmt449);
            assign59=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign59.getTree());

            char_literal60=(Token)match(input,67,FOLLOW_67_in_for_stmt451); 

            pushFollow(FOLLOW_expr_in_for_stmt454);
            expr61=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr61.getTree());

            char_literal62=(Token)match(input,67,FOLLOW_67_in_for_stmt456); 

            pushFollow(FOLLOW_assign_in_for_stmt459);
            assign63=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign63.getTree());

            char_literal64=(Token)match(input,64,FOLLOW_64_in_for_stmt461); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt464);
            block_instructions65=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions65.getTree());

            ENDFOR66=(Token)match(input,ENDFOR,FOLLOW_ENDFOR_in_for_stmt466); 

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:121:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN67=null;
        AslParser.expr_return expr68 =null;


        AslTree RETURN67_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:121:13: ( RETURN ^ ( expr )? )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:121:17: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN67=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt478); 
            RETURN67_tree = 
            (AslTree)adaptor.create(RETURN67)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN67_tree, root_0);


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:121:25: ( expr )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FALSE||LA11_0==ID||LA11_0==INT||LA11_0==MINUS||LA11_0==NOT||LA11_0==PLUS||LA11_0==TRUE||LA11_0==63) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:121:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt481);
                    expr68=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr68.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:131:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR70=null;
        AslParser.boolterm_return boolterm69 =null;

        AslParser.boolterm_return boolterm71 =null;


        AslTree OR70_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:131:6: ( boolterm ( OR ^ boolterm )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:131:8: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr498);
            boolterm69=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm69.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:131:17: ( OR ^ boolterm )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==OR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:131:18: OR ^ boolterm
            	    {
            	    OR70=(Token)match(input,OR,FOLLOW_OR_in_expr501); 
            	    OR70_tree = 
            	    (AslTree)adaptor.create(OR70)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR70_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr504);
            	    boolterm71=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm71.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:133:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND73=null;
        AslParser.boolfact_return boolfact72 =null;

        AslParser.boolfact_return boolfact74 =null;


        AslTree AND73_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:133:9: ( boolfact ( AND ^ boolfact )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:133:11: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm513);
            boolfact72=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact72.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:133:20: ( AND ^ boolfact )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AND) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:133:21: AND ^ boolfact
            	    {
            	    AND73=(Token)match(input,AND,FOLLOW_AND_in_boolterm516); 
            	    AND73_tree = 
            	    (AslTree)adaptor.create(AND73)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND73_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm519);
            	    boolfact74=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact74.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:135:1: boolfact : num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COND_EQUAL76=null;
        Token NOT_EQUAL77=null;
        Token LT78=null;
        Token LE79=null;
        Token GT80=null;
        Token GE81=null;
        AslParser.num_expr_return num_expr75 =null;

        AslParser.num_expr_return num_expr82 =null;


        AslTree COND_EQUAL76_tree=null;
        AslTree NOT_EQUAL77_tree=null;
        AslTree LT78_tree=null;
        AslTree LE79_tree=null;
        AslTree GT80_tree=null;
        AslTree GE81_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:135:9: ( num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:135:11: num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact528);
            num_expr75=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr75.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:135:20: ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==COND_EQUAL||(LA15_0 >= GE && LA15_0 <= GT)||LA15_0==LE||LA15_0==LT||LA15_0==NOT_EQUAL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:135:21: ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:135:21: ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:135:22: COND_EQUAL ^
                            {
                            COND_EQUAL76=(Token)match(input,COND_EQUAL,FOLLOW_COND_EQUAL_in_boolfact532); 
                            COND_EQUAL76_tree = 
                            (AslTree)adaptor.create(COND_EQUAL76)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(COND_EQUAL76_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:135:36: NOT_EQUAL ^
                            {
                            NOT_EQUAL77=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact537); 
                            NOT_EQUAL77_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL77)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL77_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:135:49: LT ^
                            {
                            LT78=(Token)match(input,LT,FOLLOW_LT_in_boolfact542); 
                            LT78_tree = 
                            (AslTree)adaptor.create(LT78)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT78_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:135:55: LE ^
                            {
                            LE79=(Token)match(input,LE,FOLLOW_LE_in_boolfact547); 
                            LE79_tree = 
                            (AslTree)adaptor.create(LE79)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE79_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:135:61: GT ^
                            {
                            GT80=(Token)match(input,GT,FOLLOW_GT_in_boolfact552); 
                            GT80_tree = 
                            (AslTree)adaptor.create(GT80)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT80_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:135:67: GE ^
                            {
                            GE81=(Token)match(input,GE,FOLLOW_GE_in_boolfact557); 
                            GE81_tree = 
                            (AslTree)adaptor.create(GE81)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE81_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact561);
                    num_expr82=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr82.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS84=null;
        Token MINUS85=null;
        AslParser.term_return term83 =null;

        AslParser.term_return term86 =null;


        AslTree PLUS84_tree=null;
        AslTree MINUS85_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:11: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr570);
            term83=term();

            state._fsp--;

            adaptor.addChild(root_0, term83.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:16: ( ( PLUS ^| MINUS ^) term )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==MINUS||LA17_0==PLUS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:18: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:18: ( PLUS ^| MINUS ^)
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
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:19: PLUS ^
            	            {
            	            PLUS84=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr575); 
            	            PLUS84_tree = 
            	            (AslTree)adaptor.create(PLUS84)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS84_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:137:27: MINUS ^
            	            {
            	            MINUS85=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr580); 
            	            MINUS85_tree = 
            	            (AslTree)adaptor.create(MINUS85)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS85_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr584);
            	    term86=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term86.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL88=null;
        Token DIV89=null;
        Token MOD90=null;
        AslParser.factor_return factor87 =null;

        AslParser.factor_return factor91 =null;


        AslTree MUL88_tree=null;
        AslTree DIV89_tree=null;
        AslTree MOD90_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:6: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:8: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term594);
            factor87=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor87.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:15: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==DIV||LA19_0==MOD||LA19_0==MUL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:17: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:17: ( MUL ^| DIV ^| MOD ^)
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
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:18: MUL ^
            	            {
            	            MUL88=(Token)match(input,MUL,FOLLOW_MUL_in_term599); 
            	            MUL88_tree = 
            	            (AslTree)adaptor.create(MUL88)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL88_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:25: DIV ^
            	            {
            	            DIV89=(Token)match(input,DIV,FOLLOW_DIV_in_term604); 
            	            DIV89_tree = 
            	            (AslTree)adaptor.create(DIV89)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV89_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:139:32: MOD ^
            	            {
            	            MOD90=(Token)match(input,MOD,FOLLOW_MOD_in_term609); 
            	            MOD90_tree = 
            	            (AslTree)adaptor.create(MOD90)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD90_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term613);
            	    factor91=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor91.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT92=null;
        Token PLUS93=null;
        Token MINUS94=null;
        AslParser.atom_return atom95 =null;


        AslTree NOT92_tree=null;
        AslTree PLUS93_tree=null;
        AslTree MINUS94_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:8: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:10: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:10: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:11: NOT ^
                    {
                    NOT92=(Token)match(input,NOT,FOLLOW_NOT_in_factor624); 
                    NOT92_tree = 
                    (AslTree)adaptor.create(NOT92)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT92_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:18: PLUS ^
                    {
                    PLUS93=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor629); 
                    PLUS93_tree = 
                    (AslTree)adaptor.create(PLUS93)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS93_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:141:26: MINUS ^
                    {
                    MINUS94=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor634); 
                    MINUS94_tree = 
                    (AslTree)adaptor.create(MINUS94)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS94_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor639);
            atom95=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom95.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:146:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| acces_attribute );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID96=null;
        Token INT97=null;
        Token char_literal99=null;
        Token char_literal101=null;
        AslParser.funcall_return funcall98 =null;

        AslParser.expr_return expr100 =null;

        AslParser.acces_attribute_return acces_attribute102 =null;


        AslTree b_tree=null;
        AslTree ID96_tree=null;
        AslTree INT97_tree=null;
        AslTree char_literal99_tree=null;
        AslTree char_literal101_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:146:6: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| acces_attribute )
            int alt22=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 63:
                    {
                    alt22=4;
                    }
                    break;
                case 66:
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
                case ENDLINE:
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
                case 64:
                case 65:
                case 67:
                case 70:
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
            case 63:
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:146:8: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID96=(Token)match(input,ID,FOLLOW_ID_in_atom650); 
                    ID96_tree = 
                    (AslTree)adaptor.create(ID96)
                    ;
                    adaptor.addChild(root_0, ID96_tree);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:147:3: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT97=(Token)match(input,INT,FOLLOW_INT_in_atom654); 
                    INT97_tree = 
                    (AslTree)adaptor.create(INT97)
                    ;
                    adaptor.addChild(root_0, INT97_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:148:3: (b= TRUE |b= FALSE )
                    {
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:148:3: (b= TRUE |b= FALSE )
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
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:148:4: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom661);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:148:13: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom667);  
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
                    // 148:22: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:148:25: ^( BOOLEAN[$b,$b.text] )
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:149:3: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom679);
                    funcall98=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall98.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:150:3: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal99=(Token)match(input,63,FOLLOW_63_in_atom683); 

                    pushFollow(FOLLOW_expr_in_atom686);
                    expr100=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr100.getTree());

                    char_literal101=(Token)match(input,64,FOLLOW_64_in_atom688); 

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:151:3: acces_attribute
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_acces_attribute_in_atom693);
                    acces_attribute102=acces_attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, acces_attribute102.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID103=null;
        Token char_literal104=null;
        Token char_literal106=null;
        AslParser.expr_list_return expr_list105 =null;


        AslTree ID103_tree=null;
        AslTree char_literal104_tree=null;
        AslTree char_literal106_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:11: ID '(' ( expr_list )? ')'
            {
            ID103=(Token)match(input,ID,FOLLOW_ID_in_funcall702);  
            stream_ID.add(ID103);


            char_literal104=(Token)match(input,63,FOLLOW_63_in_funcall704);  
            stream_63.add(char_literal104);


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:18: ( expr_list )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==FALSE||LA23_0==ID||LA23_0==INT||LA23_0==MINUS||LA23_0==NOT||LA23_0==PLUS||LA23_0==TRUE||LA23_0==63) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:18: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall706);
                    expr_list105=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list105.getTree());

                    }
                    break;

            }


            char_literal106=(Token)match(input,64,FOLLOW_64_in_funcall709);  
            stream_64.add(char_literal106);


            // AST REWRITE
            // elements: ID, expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 154:33: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:36: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:49: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:154:59: ( expr_list )?
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:157:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal108=null;
        AslParser.expr_return expr107 =null;

        AslParser.expr_return expr109 =null;


        AslTree char_literal108_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:157:10: ( expr ( ',' ! expr )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:157:12: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list732);
            expr107=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr107.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:157:17: ( ',' ! expr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==65) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:157:18: ',' ! expr
            	    {
            	    char_literal108=(Token)match(input,65,FOLLOW_65_in_expr_list735); 

            	    pushFollow(FOLLOW_expr_in_expr_list738);
            	    expr109=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr109.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:159:1: time_annotation : '@' BEGIN EQUAL expr ( ',' finish_time )? -> ^( TIMEANNOTATION expr ( finish_time )? ) ;
    public final AslParser.time_annotation_return time_annotation() throws RecognitionException {
        AslParser.time_annotation_return retval = new AslParser.time_annotation_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal110=null;
        Token BEGIN111=null;
        Token EQUAL112=null;
        Token char_literal114=null;
        AslParser.expr_return expr113 =null;

        AslParser.finish_time_return finish_time115 =null;


        AslTree char_literal110_tree=null;
        AslTree BEGIN111_tree=null;
        AslTree EQUAL112_tree=null;
        AslTree char_literal114_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_finish_time=new RewriteRuleSubtreeStream(adaptor,"rule finish_time");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:159:16: ( '@' BEGIN EQUAL expr ( ',' finish_time )? -> ^( TIMEANNOTATION expr ( finish_time )? ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:1: '@' BEGIN EQUAL expr ( ',' finish_time )?
            {
            char_literal110=(Token)match(input,68,FOLLOW_68_in_time_annotation747);  
            stream_68.add(char_literal110);


            BEGIN111=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_time_annotation749);  
            stream_BEGIN.add(BEGIN111);


            EQUAL112=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_time_annotation751);  
            stream_EQUAL.add(EQUAL112);


            pushFollow(FOLLOW_expr_in_time_annotation753);
            expr113=expr();

            state._fsp--;

            stream_expr.add(expr113.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:22: ( ',' finish_time )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==65) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:23: ',' finish_time
                    {
                    char_literal114=(Token)match(input,65,FOLLOW_65_in_time_annotation756);  
                    stream_65.add(char_literal114);


                    pushFollow(FOLLOW_finish_time_in_time_annotation758);
                    finish_time115=finish_time();

                    state._fsp--;

                    stream_finish_time.add(finish_time115.getTree());

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
            // 160:41: -> ^( TIMEANNOTATION expr ( finish_time )? )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:44: ^( TIMEANNOTATION expr ( finish_time )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(TIMEANNOTATION, "TIMEANNOTATION")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:160:66: ( finish_time )?
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:162:1: finish_time : ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr ) ;
    public final AslParser.finish_time_return finish_time() throws RecognitionException {
        AslParser.finish_time_return retval = new AslParser.finish_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token END116=null;
        Token EQUAL117=null;
        Token DURATION119=null;
        Token EQUAL120=null;
        AslParser.expr_return expr118 =null;

        AslParser.expr_return expr121 =null;


        AslTree END116_tree=null;
        AslTree EQUAL117_tree=null;
        AslTree DURATION119_tree=null;
        AslTree EQUAL120_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:162:12: ( ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:163:2: ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr )
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:163:2: ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr )
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:163:2: END ^ EQUAL ! expr
                    {
                    END116=(Token)match(input,END,FOLLOW_END_in_finish_time779); 
                    END116_tree = 
                    (AslTree)adaptor.create(END116)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(END116_tree, root_0);


                    EQUAL117=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_finish_time782); 

                    pushFollow(FOLLOW_expr_in_finish_time785);
                    expr118=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr118.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:163:21: DURATION ^ EQUAL ! expr
                    {
                    DURATION119=(Token)match(input,DURATION,FOLLOW_DURATION_in_finish_time789); 
                    DURATION119_tree = 
                    (AslTree)adaptor.create(DURATION119)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(DURATION119_tree, root_0);


                    EQUAL120=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_finish_time792); 

                    pushFollow(FOLLOW_expr_in_finish_time795);
                    expr121=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr121.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:165:1: create : CREATE TYPE_OBJECT coordenades ( list_attributes )? -> ^( CREATE TYPE_OBJECT coordenades ( ^( ATTRIBUTES list_attributes ) )? ) ;
    public final AslParser.create_return create() throws RecognitionException {
        AslParser.create_return retval = new AslParser.create_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token CREATE122=null;
        Token TYPE_OBJECT123=null;
        AslParser.coordenades_return coordenades124 =null;

        AslParser.list_attributes_return list_attributes125 =null;


        AslTree CREATE122_tree=null;
        AslTree TYPE_OBJECT123_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_TYPE_OBJECT=new RewriteRuleTokenStream(adaptor,"token TYPE_OBJECT");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        RewriteRuleSubtreeStream stream_list_attributes=new RewriteRuleSubtreeStream(adaptor,"rule list_attributes");
        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:165:7: ( CREATE TYPE_OBJECT coordenades ( list_attributes )? -> ^( CREATE TYPE_OBJECT coordenades ( ^( ATTRIBUTES list_attributes ) )? ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:165:9: CREATE TYPE_OBJECT coordenades ( list_attributes )?
            {
            CREATE122=(Token)match(input,CREATE,FOLLOW_CREATE_in_create803);  
            stream_CREATE.add(CREATE122);


            TYPE_OBJECT123=(Token)match(input,TYPE_OBJECT,FOLLOW_TYPE_OBJECT_in_create805);  
            stream_TYPE_OBJECT.add(TYPE_OBJECT123);


            pushFollow(FOLLOW_coordenades_in_create807);
            coordenades124=coordenades();

            state._fsp--;

            stream_coordenades.add(coordenades124.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:165:40: ( list_attributes )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ATTRIBUTE) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:165:40: list_attributes
                    {
                    pushFollow(FOLLOW_list_attributes_in_create809);
                    list_attributes125=list_attributes();

                    state._fsp--;

                    stream_list_attributes.add(list_attributes125.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: TYPE_OBJECT, coordenades, list_attributes, CREATE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 165:57: -> ^( CREATE TYPE_OBJECT coordenades ( ^( ATTRIBUTES list_attributes ) )? )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:165:60: ^( CREATE TYPE_OBJECT coordenades ( ^( ATTRIBUTES list_attributes ) )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                stream_CREATE.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_TYPE_OBJECT.nextNode()
                );

                adaptor.addChild(root_1, stream_coordenades.nextTree());

                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:165:93: ( ^( ATTRIBUTES list_attributes ) )?
                if ( stream_list_attributes.hasNext() ) {
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:165:93: ^( ATTRIBUTES list_attributes )
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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:167:1: destroy : DESTROY ^ ID ;
    public final AslParser.destroy_return destroy() throws RecognitionException {
        AslParser.destroy_return retval = new AslParser.destroy_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DESTROY126=null;
        Token ID127=null;

        AslTree DESTROY126_tree=null;
        AslTree ID127_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:167:8: ( DESTROY ^ ID )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:167:10: DESTROY ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            DESTROY126=(Token)match(input,DESTROY,FOLLOW_DESTROY_in_destroy834); 
            DESTROY126_tree = 
            (AslTree)adaptor.create(DESTROY126)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DESTROY126_tree, root_0);


            ID127=(Token)match(input,ID,FOLLOW_ID_in_destroy837); 
            ID127_tree = 
            (AslTree)adaptor.create(ID127)
            ;
            adaptor.addChild(root_0, ID127_tree);


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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:169:1: move : MOVE ^ ID coordenades ;
    public final AslParser.move_return move() throws RecognitionException {
        AslParser.move_return retval = new AslParser.move_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVE128=null;
        Token ID129=null;
        AslParser.coordenades_return coordenades130 =null;


        AslTree MOVE128_tree=null;
        AslTree ID129_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:169:5: ( MOVE ^ ID coordenades )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:169:9: MOVE ^ ID coordenades
            {
            root_0 = (AslTree)adaptor.nil();


            MOVE128=(Token)match(input,MOVE,FOLLOW_MOVE_in_move846); 
            MOVE128_tree = 
            (AslTree)adaptor.create(MOVE128)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MOVE128_tree, root_0);


            ID129=(Token)match(input,ID,FOLLOW_ID_in_move849); 
            ID129_tree = 
            (AslTree)adaptor.create(ID129)
            ;
            adaptor.addChild(root_0, ID129_tree);


            pushFollow(FOLLOW_coordenades_in_move851);
            coordenades130=coordenades();

            state._fsp--;

            adaptor.addChild(root_0, coordenades130.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:171:1: translate : TRANSLATE ^ ID coordenades ;
    public final AslParser.translate_return translate() throws RecognitionException {
        AslParser.translate_return retval = new AslParser.translate_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TRANSLATE131=null;
        Token ID132=null;
        AslParser.coordenades_return coordenades133 =null;


        AslTree TRANSLATE131_tree=null;
        AslTree ID132_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:171:10: ( TRANSLATE ^ ID coordenades )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:171:13: TRANSLATE ^ ID coordenades
            {
            root_0 = (AslTree)adaptor.nil();


            TRANSLATE131=(Token)match(input,TRANSLATE,FOLLOW_TRANSLATE_in_translate859); 
            TRANSLATE131_tree = 
            (AslTree)adaptor.create(TRANSLATE131)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(TRANSLATE131_tree, root_0);


            ID132=(Token)match(input,ID,FOLLOW_ID_in_translate862); 
            ID132_tree = 
            (AslTree)adaptor.create(ID132)
            ;
            adaptor.addChild(root_0, ID132_tree);


            pushFollow(FOLLOW_coordenades_in_translate864);
            coordenades133=coordenades();

            state._fsp--;

            adaptor.addChild(root_0, coordenades133.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:173:1: modify : MODIFY ^ ID list_attributes ;
    public final AslParser.modify_return modify() throws RecognitionException {
        AslParser.modify_return retval = new AslParser.modify_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODIFY134=null;
        Token ID135=null;
        AslParser.list_attributes_return list_attributes136 =null;


        AslTree MODIFY134_tree=null;
        AslTree ID135_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:173:7: ( MODIFY ^ ID list_attributes )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:173:9: MODIFY ^ ID list_attributes
            {
            root_0 = (AslTree)adaptor.nil();


            MODIFY134=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_modify871); 
            MODIFY134_tree = 
            (AslTree)adaptor.create(MODIFY134)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODIFY134_tree, root_0);


            ID135=(Token)match(input,ID,FOLLOW_ID_in_modify874); 
            ID135_tree = 
            (AslTree)adaptor.create(ID135)
            ;
            adaptor.addChild(root_0, ID135_tree);


            pushFollow(FOLLOW_list_attributes_in_modify876);
            list_attributes136=list_attributes();

            state._fsp--;

            adaptor.addChild(root_0, list_attributes136.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:1: rotate : ROTATE ^ ID expr ;
    public final AslParser.rotate_return rotate() throws RecognitionException {
        AslParser.rotate_return retval = new AslParser.rotate_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ROTATE137=null;
        Token ID138=null;
        AslParser.expr_return expr139 =null;


        AslTree ROTATE137_tree=null;
        AslTree ID138_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:7: ( ROTATE ^ ID expr )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:175:9: ROTATE ^ ID expr
            {
            root_0 = (AslTree)adaptor.nil();


            ROTATE137=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_rotate883); 
            ROTATE137_tree = 
            (AslTree)adaptor.create(ROTATE137)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(ROTATE137_tree, root_0);


            ID138=(Token)match(input,ID,FOLLOW_ID_in_rotate886); 
            ID138_tree = 
            (AslTree)adaptor.create(ID138)
            ;
            adaptor.addChild(root_0, ID138_tree);


            pushFollow(FOLLOW_expr_in_rotate888);
            expr139=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr139.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:177:1: list_attributes : attribute ( ',' ! attribute )* ;
    public final AslParser.list_attributes_return list_attributes() throws RecognitionException {
        AslParser.list_attributes_return retval = new AslParser.list_attributes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal141=null;
        AslParser.attribute_return attribute140 =null;

        AslParser.attribute_return attribute142 =null;


        AslTree char_literal141_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:177:16: ( attribute ( ',' ! attribute )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:177:18: attribute ( ',' ! attribute )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_attribute_in_list_attributes895);
            attribute140=attribute();

            state._fsp--;

            adaptor.addChild(root_0, attribute140.getTree());

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:177:28: ( ',' ! attribute )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==65) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:177:29: ',' ! attribute
            	    {
            	    char_literal141=(Token)match(input,65,FOLLOW_65_in_list_attributes898); 

            	    pushFollow(FOLLOW_attribute_in_list_attributes901);
            	    attribute142=attribute();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribute142.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:179:1: attribute : ATTRIBUTE ^ EQUAL ! expr ;
    public final AslParser.attribute_return attribute() throws RecognitionException {
        AslParser.attribute_return retval = new AslParser.attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ATTRIBUTE143=null;
        Token EQUAL144=null;
        AslParser.expr_return expr145 =null;


        AslTree ATTRIBUTE143_tree=null;
        AslTree EQUAL144_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:179:10: ( ATTRIBUTE ^ EQUAL ! expr )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:179:12: ATTRIBUTE ^ EQUAL ! expr
            {
            root_0 = (AslTree)adaptor.nil();


            ATTRIBUTE143=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute910); 
            ATTRIBUTE143_tree = 
            (AslTree)adaptor.create(ATTRIBUTE143)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(ATTRIBUTE143_tree, root_0);


            EQUAL144=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_attribute913); 

            pushFollow(FOLLOW_expr_in_attribute916);
            expr145=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr145.getTree());

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:181:1: coordenades : '{' ! expr ',' ! expr '}' !;
    public final AslParser.coordenades_return coordenades() throws RecognitionException {
        AslParser.coordenades_return retval = new AslParser.coordenades_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal146=null;
        Token char_literal148=null;
        Token char_literal150=null;
        AslParser.expr_return expr147 =null;

        AslParser.expr_return expr149 =null;


        AslTree char_literal146_tree=null;
        AslTree char_literal148_tree=null;
        AslTree char_literal150_tree=null;

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:181:12: ( '{' ! expr ',' ! expr '}' !)
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:181:14: '{' ! expr ',' ! expr '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            char_literal146=(Token)match(input,69,FOLLOW_69_in_coordenades923); 

            pushFollow(FOLLOW_expr_in_coordenades926);
            expr147=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr147.getTree());

            char_literal148=(Token)match(input,65,FOLLOW_65_in_coordenades928); 

            pushFollow(FOLLOW_expr_in_coordenades931);
            expr149=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr149.getTree());

            char_literal150=(Token)match(input,70,FOLLOW_70_in_coordenades933); 

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
    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:1: acces_attribute : ID '.' ATTRIBUTE '(' ')' -> ^( ACCESATTRIBUTE ID ATTRIBUTE ) ;
    public final AslParser.acces_attribute_return acces_attribute() throws RecognitionException {
        AslParser.acces_attribute_return retval = new AslParser.acces_attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID151=null;
        Token char_literal152=null;
        Token ATTRIBUTE153=null;
        Token char_literal154=null;
        Token char_literal155=null;

        AslTree ID151_tree=null;
        AslTree char_literal152_tree=null;
        AslTree ATTRIBUTE153_tree=null;
        AslTree char_literal154_tree=null;
        AslTree char_literal155_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ATTRIBUTE=new RewriteRuleTokenStream(adaptor,"token ATTRIBUTE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");

        try {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:16: ( ID '.' ATTRIBUTE '(' ')' -> ^( ACCESATTRIBUTE ID ATTRIBUTE ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:18: ID '.' ATTRIBUTE '(' ')'
            {
            ID151=(Token)match(input,ID,FOLLOW_ID_in_acces_attribute941);  
            stream_ID.add(ID151);


            char_literal152=(Token)match(input,66,FOLLOW_66_in_acces_attribute943);  
            stream_66.add(char_literal152);


            ATTRIBUTE153=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_acces_attribute945);  
            stream_ATTRIBUTE.add(ATTRIBUTE153);


            char_literal154=(Token)match(input,63,FOLLOW_63_in_acces_attribute947);  
            stream_63.add(char_literal154);


            char_literal155=(Token)match(input,64,FOLLOW_64_in_acces_attribute949);  
            stream_64.add(char_literal155);


            // AST REWRITE
            // elements: ID, ATTRIBUTE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 183:43: -> ^( ACCESATTRIBUTE ID ATTRIBUTE )
            {
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:183:46: ^( ACCESATTRIBUTE ID ATTRIBUTE )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ACCESATTRIBUTE, "ACCESATTRIBUTE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ATTRIBUTE.nextNode()
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
    // $ANTLR end "acces_attribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog93 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EOF_in_prog96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func114 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_func117 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_params_in_func119 = new BitSet(new long[]{0x1260180C2100C000L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_instructions_in_func121 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func123 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ENDLINE_in_func126 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_63_in_params136 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_paramlist_in_params138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_params141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist158 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_paramlist161 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_param_in_paramlist164 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions196 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ENDLINE_in_block_instructions199 = new BitSet(new long[]{0x1260180C2100C000L,0x0000000000000010L});
    public static final BitSet FOLLOW_instruction_in_block_instructions201 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_assign_in_instruction223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_instruction_in_instruction228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_annotation_in_instruction257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign275 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_assign279 = new BitSet(new long[]{0x024018000000C000L});
    public static final BitSet FOLLOW_basic_instruction_in_assign281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign297 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_assign301 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_assign303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_basic_instruction322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destroy_in_basic_instruction326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_basic_instruction330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translate_in_basic_instruction334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_in_basic_instruction338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rotate_in_basic_instruction342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt352 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ite_stmt355 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ite_stmt360 = new BitSet(new long[]{0x1260180C2100C000L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt363 = new BitSet(new long[]{0x00000000008C0000L});
    public static final BitSet FOLLOW_elseif_stmt_in_ite_stmt365 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_else_stmt_in_ite_stmt367 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseif_stmt379 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_elseif_stmt382 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_elseif_stmt387 = new BitSet(new long[]{0x1260180C2100C000L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_instructions_in_elseif_stmt390 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt401 = new BitSet(new long[]{0x1260180C2100C000L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_instructions_in_else_stmt404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt419 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_while_stmt422 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_while_stmt425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_while_stmt427 = new BitSet(new long[]{0x1260180C2100C000L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt430 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt443 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_for_stmt446 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_assign_in_for_stmt449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_for_stmt451 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_for_stmt454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_for_stmt456 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_assign_in_for_stmt459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_for_stmt461 = new BitSet(new long[]{0x1260180C2100C000L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt464 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ENDFOR_in_for_stmt466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt478 = new BitSet(new long[]{0x8404421410000002L});
    public static final BitSet FOLLOW_expr_in_return_stmt481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr498 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_OR_in_expr501 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_boolterm_in_expr504 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm513 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm516 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm519 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact528 = new BitSet(new long[]{0x0000812300002002L});
    public static final BitSet FOLLOW_COND_EQUAL_in_boolfact532 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact537 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_LT_in_boolfact542 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_LE_in_boolfact547 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_GT_in_boolfact552 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_GE_in_boolfact557 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr570 = new BitSet(new long[]{0x0004020000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr575 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr580 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_term_in_num_expr584 = new BitSet(new long[]{0x0004020000000002L});
    public static final BitSet FOLLOW_factor_in_term594 = new BitSet(new long[]{0x0000240000010002L});
    public static final BitSet FOLLOW_MUL_in_term599 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_DIV_in_term604 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_MOD_in_term609 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_factor_in_term613 = new BitSet(new long[]{0x0000240000010002L});
    public static final BitSet FOLLOW_NOT_in_factor624 = new BitSet(new long[]{0x8400001410000000L});
    public static final BitSet FOLLOW_PLUS_in_factor629 = new BitSet(new long[]{0x8400001410000000L});
    public static final BitSet FOLLOW_MINUS_in_factor634 = new BitSet(new long[]{0x8400001410000000L});
    public static final BitSet FOLLOW_atom_in_factor639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_atom683 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_atom686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_atom688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_acces_attribute_in_atom693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall702 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_funcall704 = new BitSet(new long[]{0x8404421410000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_list_in_funcall706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_funcall709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list732 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_expr_list735 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_expr_list738 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_time_annotation747 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BEGIN_in_time_annotation749 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_time_annotation751 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_time_annotation753 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_time_annotation756 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_finish_time_in_time_annotation758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_finish_time779 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_finish_time782 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_finish_time785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_finish_time789 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_finish_time792 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_finish_time795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create803 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_TYPE_OBJECT_in_create805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_coordenades_in_create807 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_list_attributes_in_create809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTROY_in_destroy834 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_destroy837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move846 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_move849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_coordenades_in_move851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSLATE_in_translate859 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_translate862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_coordenades_in_translate864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_in_modify871 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_modify874 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_list_attributes_in_modify876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_rotate883 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_rotate886 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_rotate888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_list_attributes895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_list_attributes898 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_attribute_in_list_attributes901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute910 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_attribute913 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_attribute916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_coordenades923 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_coordenades926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_coordenades928 = new BitSet(new long[]{0x8404421410000000L});
    public static final BitSet FOLLOW_expr_in_coordenades931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_coordenades933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_acces_attribute941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_acces_attribute943 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_acces_attribute945 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_acces_attribute947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_acces_attribute949 = new BitSet(new long[]{0x0000000000000002L});

}