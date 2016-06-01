// $ANTLR 3.4 /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g 2016-06-01 21:46:59

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESATTRIBUTE", "AND", "ANIMATION", "ARGLIST", "ASSIGN", "ATTRIBUTE", "ATTRIBUTES", "BEGIN", "BOOLEAN", "COMMENT", "COND_EQUAL", "CREATE", "DEFINE", "DEFINES", "DESTROY", "DIV", "DOUBLE", "DURATION", "ELSE", "ELSEIF", "END", "ENDFOR", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FILE", "FOR", "FUNC", "FUNCALL", "GE", "GROUP", "GT", "ID", "IF", "IMPORT", "IMPORTS", "IN", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MODIFY", "MODULE", "MOVE", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PROG", "READ", "RETURN", "ROTATE", "SCALE", "SOURCE", "STRING", "TIMEANNOTATION", "TRANSLATE", "TRUE", "TYPE_OBJECT", "WHILE", "WRITE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'@'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
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
    public static final int DEFINE=16;
    public static final int DEFINES=17;
    public static final int DESTROY=18;
    public static final int DIV=19;
    public static final int DOUBLE=20;
    public static final int DURATION=21;
    public static final int ELSE=22;
    public static final int ELSEIF=23;
    public static final int END=24;
    public static final int ENDFOR=25;
    public static final int ENDFUNC=26;
    public static final int ENDIF=27;
    public static final int ENDWHILE=28;
    public static final int EQUAL=29;
    public static final int ESC_SEQ=30;
    public static final int FALSE=31;
    public static final int FILE=32;
    public static final int FOR=33;
    public static final int FUNC=34;
    public static final int FUNCALL=35;
    public static final int GE=36;
    public static final int GROUP=37;
    public static final int GT=38;
    public static final int ID=39;
    public static final int IF=40;
    public static final int IMPORT=41;
    public static final int IMPORTS=42;
    public static final int IN=43;
    public static final int INT=44;
    public static final int LE=45;
    public static final int LIST_FUNCTIONS=46;
    public static final int LIST_INSTR=47;
    public static final int LT=48;
    public static final int MINUS=49;
    public static final int MOD=50;
    public static final int MODIFY=51;
    public static final int MODULE=52;
    public static final int MOVE=53;
    public static final int MUL=54;
    public static final int NOT=55;
    public static final int NOT_EQUAL=56;
    public static final int OR=57;
    public static final int PARAMS=58;
    public static final int PLUS=59;
    public static final int PREF=60;
    public static final int PROG=61;
    public static final int READ=62;
    public static final int RETURN=63;
    public static final int ROTATE=64;
    public static final int SCALE=65;
    public static final int SOURCE=66;
    public static final int STRING=67;
    public static final int TIMEANNOTATION=68;
    public static final int TRANSLATE=69;
    public static final int TRUE=70;
    public static final int TYPE_OBJECT=71;
    public static final int WHILE=72;
    public static final int WRITE=73;
    public static final int WS=74;

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
    public String getGrammarFileName() { return "/home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:64:1: prog : ( imports defines list_func -> ^( PROG imports defines list_func ) | module_def imports defines list_func -> ^( PROG module_def imports defines list_func ) );
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.imports_return imports1 =null;

        AslParser.defines_return defines2 =null;

        AslParser.list_func_return list_func3 =null;

        AslParser.module_def_return module_def4 =null;

        AslParser.imports_return imports5 =null;

        AslParser.defines_return defines6 =null;

        AslParser.list_func_return list_func7 =null;


        RewriteRuleSubtreeStream stream_defines=new RewriteRuleSubtreeStream(adaptor,"rule defines");
        RewriteRuleSubtreeStream stream_list_func=new RewriteRuleSubtreeStream(adaptor,"rule list_func");
        RewriteRuleSubtreeStream stream_module_def=new RewriteRuleSubtreeStream(adaptor,"rule module_def");
        RewriteRuleSubtreeStream stream_imports=new RewriteRuleSubtreeStream(adaptor,"rule imports");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:64:6: ( imports defines list_func -> ^( PROG imports defines list_func ) | module_def imports defines list_func -> ^( PROG module_def imports defines list_func ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==DEFINE||LA1_0==FUNC||LA1_0==IMPORT) ) {
                alt1=1;
            }
            else if ( (LA1_0==MODULE) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:64:8: imports defines list_func
                    {
                    pushFollow(FOLLOW_imports_in_prog107);
                    imports1=imports();

                    state._fsp--;

                    stream_imports.add(imports1.getTree());

                    pushFollow(FOLLOW_defines_in_prog109);
                    defines2=defines();

                    state._fsp--;

                    stream_defines.add(defines2.getTree());

                    pushFollow(FOLLOW_list_func_in_prog111);
                    list_func3=list_func();

                    state._fsp--;

                    stream_list_func.add(list_func3.getTree());

                    // AST REWRITE
                    // elements: defines, imports, list_func
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 64:34: -> ^( PROG imports defines list_func )
                    {
                        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:64:37: ^( PROG imports defines list_func )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PROG, "PROG")
                        , root_1);

                        adaptor.addChild(root_1, stream_imports.nextTree());

                        adaptor.addChild(root_1, stream_defines.nextTree());

                        adaptor.addChild(root_1, stream_list_func.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:65:7: module_def imports defines list_func
                    {
                    pushFollow(FOLLOW_module_def_in_prog131);
                    module_def4=module_def();

                    state._fsp--;

                    stream_module_def.add(module_def4.getTree());

                    pushFollow(FOLLOW_imports_in_prog133);
                    imports5=imports();

                    state._fsp--;

                    stream_imports.add(imports5.getTree());

                    pushFollow(FOLLOW_defines_in_prog135);
                    defines6=defines();

                    state._fsp--;

                    stream_defines.add(defines6.getTree());

                    pushFollow(FOLLOW_list_func_in_prog137);
                    list_func7=list_func();

                    state._fsp--;

                    stream_list_func.add(list_func7.getTree());

                    // AST REWRITE
                    // elements: defines, imports, module_def, list_func
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 65:44: -> ^( PROG module_def imports defines list_func )
                    {
                        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:65:47: ^( PROG module_def imports defines list_func )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PROG, "PROG")
                        , root_1);

                        adaptor.addChild(root_1, stream_module_def.nextTree());

                        adaptor.addChild(root_1, stream_imports.nextTree());

                        adaptor.addChild(root_1, stream_defines.nextTree());

                        adaptor.addChild(root_1, stream_list_func.nextTree());

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
    // $ANTLR end "prog"


    public static class module_def_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "module_def"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:68:1: module_def : MODULE ^ ID ';' !;
    public final AslParser.module_def_return module_def() throws RecognitionException {
        AslParser.module_def_return retval = new AslParser.module_def_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODULE8=null;
        Token ID9=null;
        Token char_literal10=null;

        AslTree MODULE8_tree=null;
        AslTree ID9_tree=null;
        AslTree char_literal10_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:68:12: ( MODULE ^ ID ';' !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:68:14: MODULE ^ ID ';' !
            {
            root_0 = (AslTree)adaptor.nil();


            MODULE8=(Token)match(input,MODULE,FOLLOW_MODULE_in_module_def160); 
            MODULE8_tree = 
            (AslTree)adaptor.create(MODULE8)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODULE8_tree, root_0);


            ID9=(Token)match(input,ID,FOLLOW_ID_in_module_def163); 
            ID9_tree = 
            (AslTree)adaptor.create(ID9)
            ;
            adaptor.addChild(root_0, ID9_tree);


            char_literal10=(Token)match(input,80,FOLLOW_80_in_module_def165); 

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
    // $ANTLR end "module_def"


    public static class imports_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "imports"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:71:1: imports : ( iimport )* -> ^( IMPORTS ( iimport )* ) ;
    public final AslParser.imports_return imports() throws RecognitionException {
        AslParser.imports_return retval = new AslParser.imports_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.iimport_return iimport11 =null;


        RewriteRuleSubtreeStream stream_iimport=new RewriteRuleSubtreeStream(adaptor,"rule iimport");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:71:9: ( ( iimport )* -> ^( IMPORTS ( iimport )* ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:71:11: ( iimport )*
            {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:71:11: ( iimport )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:71:11: iimport
            	    {
            	    pushFollow(FOLLOW_iimport_in_imports175);
            	    iimport11=iimport();

            	    state._fsp--;

            	    stream_iimport.add(iimport11.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: iimport
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 71:20: -> ^( IMPORTS ( iimport )* )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:71:23: ^( IMPORTS ( iimport )* )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(IMPORTS, "IMPORTS")
                , root_1);

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:71:33: ( iimport )*
                while ( stream_iimport.hasNext() ) {
                    adaptor.addChild(root_1, stream_iimport.nextTree());

                }
                stream_iimport.reset();

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
    // $ANTLR end "imports"


    public static class iimport_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iimport"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:74:1: iimport : IMPORT ! FILE ';' !;
    public final AslParser.iimport_return iimport() throws RecognitionException {
        AslParser.iimport_return retval = new AslParser.iimport_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IMPORT12=null;
        Token FILE13=null;
        Token char_literal14=null;

        AslTree IMPORT12_tree=null;
        AslTree FILE13_tree=null;
        AslTree char_literal14_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:74:9: ( IMPORT ! FILE ';' !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:74:11: IMPORT ! FILE ';' !
            {
            root_0 = (AslTree)adaptor.nil();


            IMPORT12=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_iimport194); 

            FILE13=(Token)match(input,FILE,FOLLOW_FILE_in_iimport197); 
            FILE13_tree = 
            (AslTree)adaptor.create(FILE13)
            ;
            adaptor.addChild(root_0, FILE13_tree);


            char_literal14=(Token)match(input,80,FOLLOW_80_in_iimport199); 

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
    // $ANTLR end "iimport"


    public static class defines_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defines"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:77:1: defines : ( define )* -> ^( DEFINES ( define )* ) ;
    public final AslParser.defines_return defines() throws RecognitionException {
        AslParser.defines_return retval = new AslParser.defines_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.define_return define15 =null;


        RewriteRuleSubtreeStream stream_define=new RewriteRuleSubtreeStream(adaptor,"rule define");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:77:9: ( ( define )* -> ^( DEFINES ( define )* ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:77:11: ( define )*
            {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:77:11: ( define )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DEFINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:77:11: define
            	    {
            	    pushFollow(FOLLOW_define_in_defines209);
            	    define15=define();

            	    state._fsp--;

            	    stream_define.add(define15.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: define
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 77:19: -> ^( DEFINES ( define )* )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:77:22: ^( DEFINES ( define )* )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(DEFINES, "DEFINES")
                , root_1);

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:77:32: ( define )*
                while ( stream_define.hasNext() ) {
                    adaptor.addChild(root_1, stream_define.nextTree());

                }
                stream_define.reset();

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
    // $ANTLR end "defines"


    public static class define_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "define"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:80:1: define : DEFINE ID STRING ( list_attributes )? ';' -> ^( DEFINE ID STRING ^( ATTRIBUTES ( list_attributes )? ) ) ;
    public final AslParser.define_return define() throws RecognitionException {
        AslParser.define_return retval = new AslParser.define_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DEFINE16=null;
        Token ID17=null;
        Token STRING18=null;
        Token char_literal20=null;
        AslParser.list_attributes_return list_attributes19 =null;


        AslTree DEFINE16_tree=null;
        AslTree ID17_tree=null;
        AslTree STRING18_tree=null;
        AslTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DEFINE=new RewriteRuleTokenStream(adaptor,"token DEFINE");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_list_attributes=new RewriteRuleSubtreeStream(adaptor,"rule list_attributes");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:80:8: ( DEFINE ID STRING ( list_attributes )? ';' -> ^( DEFINE ID STRING ^( ATTRIBUTES ( list_attributes )? ) ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:80:10: DEFINE ID STRING ( list_attributes )? ';'
            {
            DEFINE16=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_define228);  
            stream_DEFINE.add(DEFINE16);


            ID17=(Token)match(input,ID,FOLLOW_ID_in_define230);  
            stream_ID.add(ID17);


            STRING18=(Token)match(input,STRING,FOLLOW_STRING_in_define232);  
            stream_STRING.add(STRING18);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:80:27: ( list_attributes )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ATTRIBUTE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:80:27: list_attributes
                    {
                    pushFollow(FOLLOW_list_attributes_in_define234);
                    list_attributes19=list_attributes();

                    state._fsp--;

                    stream_list_attributes.add(list_attributes19.getTree());

                    }
                    break;

            }


            char_literal20=(Token)match(input,80,FOLLOW_80_in_define237);  
            stream_80.add(char_literal20);


            // AST REWRITE
            // elements: ID, list_attributes, STRING, DEFINE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 80:48: -> ^( DEFINE ID STRING ^( ATTRIBUTES ( list_attributes )? ) )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:80:51: ^( DEFINE ID STRING ^( ATTRIBUTES ( list_attributes )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                stream_DEFINE.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_STRING.nextNode()
                );

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:80:70: ^( ATTRIBUTES ( list_attributes )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ATTRIBUTES, "ATTRIBUTES")
                , root_2);

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:80:83: ( list_attributes )?
                if ( stream_list_attributes.hasNext() ) {
                    adaptor.addChild(root_2, stream_list_attributes.nextTree());

                }
                stream_list_attributes.reset();

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
    // $ANTLR end "define"


    public static class list_func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_func"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:84:1: list_func : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.list_func_return list_func() throws RecognitionException {
        AslParser.list_func_return retval = new AslParser.list_func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF22=null;
        AslParser.func_return func21 =null;


        AslTree EOF22_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:84:11: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:84:13: ( func )+ EOF
            {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:84:13: ( func )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==FUNC) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:84:13: func
            	    {
            	    pushFollow(FOLLOW_func_in_list_func264);
            	    func21=func();

            	    state._fsp--;

            	    stream_func.add(func21.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            EOF22=(Token)match(input,EOF,FOLLOW_EOF_in_list_func267);  
            stream_EOF.add(EOF22);


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
            // 84:22: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:84:25: ^( LIST_FUNCTIONS ( func )+ )
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
    // $ANTLR end "list_func"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:88:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC23=null;
        Token ID24=null;
        Token ENDFUNC27=null;
        AslParser.params_return params25 =null;

        AslParser.block_instructions_return block_instructions26 =null;


        AslTree FUNC23_tree=null;
        AslTree ID24_tree=null;
        AslTree ENDFUNC27_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:88:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:88:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC23=(Token)match(input,FUNC,FOLLOW_FUNC_in_func285); 
            FUNC23_tree = 
            (AslTree)adaptor.create(FUNC23)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC23_tree, root_0);


            ID24=(Token)match(input,ID,FOLLOW_ID_in_func288); 
            ID24_tree = 
            (AslTree)adaptor.create(ID24)
            ;
            adaptor.addChild(root_0, ID24_tree);


            pushFollow(FOLLOW_params_in_func290);
            params25=params();

            state._fsp--;

            adaptor.addChild(root_0, params25.getTree());

            pushFollow(FOLLOW_block_instructions_in_func292);
            block_instructions26=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions26.getTree());

            ENDFUNC27=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func294); 

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:91:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal28=null;
        Token char_literal30=null;
        AslParser.paramlist_return paramlist29 =null;


        AslTree char_literal28_tree=null;
        AslTree char_literal30_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:91:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:91:10: '(' ( paramlist )? ')'
            {
            char_literal28=(Token)match(input,75,FOLLOW_75_in_params305);  
            stream_75.add(char_literal28);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:91:14: ( paramlist )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:91:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params307);
                    paramlist29=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist29.getTree());

                    }
                    break;

            }


            char_literal30=(Token)match(input,76,FOLLOW_76_in_params310);  
            stream_76.add(char_literal30);


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
            // 91:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:91:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:91:41: ( paramlist )?
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:94:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal32=null;
        AslParser.param_return param31 =null;

        AslParser.param_return param33 =null;


        AslTree char_literal32_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:94:10: ( param ( ',' ! param )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:94:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist327);
            param31=param();

            state._fsp--;

            adaptor.addChild(root_0, param31.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:94:18: ( ',' ! param )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==77) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:94:19: ',' ! param
            	    {
            	    char_literal32=(Token)match(input,77,FOLLOW_77_in_paramlist330); 

            	    pushFollow(FOLLOW_param_in_paramlist333);
            	    param33=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param33.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:98:1: param : id= ID -> ^( PREF[$id,$id.text] ) ;
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;

        AslTree id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:98:7: (id= ID -> ^( PREF[$id,$id.text] ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:98:9: id= ID
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_param347);  
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
            // 98:15: -> ^( PREF[$id,$id.text] )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:98:18: ^( PREF[$id,$id.text] )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:101:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal35=null;
        AslParser.instruction_return instruction34 =null;

        AslParser.instruction_return instruction36 =null;


        AslTree char_literal35_tree=null;
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:102:5: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:102:5: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions365);
            instruction34=instruction();

            state._fsp--;

            stream_instruction.add(instruction34.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:102:17: ( ';' instruction )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==80) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:102:18: ';' instruction
            	    {
            	    char_literal35=(Token)match(input,80,FOLLOW_80_in_block_instructions368);  
            	    stream_80.add(char_literal35);


            	    pushFollow(FOLLOW_instruction_in_block_instructions370);
            	    instruction36=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction36.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // 103:4: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:103:4: ^( LIST_INSTR ( instruction )+ )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:106:1: instruction : ( assign | basic_instruction | source | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | time_annotation |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign37 =null;

        AslParser.basic_instruction_return basic_instruction38 =null;

        AslParser.source_return source39 =null;

        AslParser.ite_stmt_return ite_stmt40 =null;

        AslParser.while_stmt_return while_stmt41 =null;

        AslParser.for_stmt_return for_stmt42 =null;

        AslParser.funcall_return funcall43 =null;

        AslParser.return_stmt_return return_stmt44 =null;

        AslParser.time_annotation_return time_annotation45 =null;



        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:107:5: ( assign | basic_instruction | source | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | time_annotation |)
            int alt9=10;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EQUAL) ) {
                    alt9=1;
                }
                else if ( (LA9_1==75) ) {
                    alt9=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
                }
                break;
            case CREATE:
            case DESTROY:
            case GROUP:
            case MODIFY:
            case MOVE:
            case ROTATE:
            case SCALE:
            case TRANSLATE:
                {
                alt9=2;
                }
                break;
            case SOURCE:
                {
                alt9=3;
                }
                break;
            case IF:
                {
                alt9=4;
                }
                break;
            case WHILE:
                {
                alt9=5;
                }
                break;
            case FOR:
                {
                alt9=6;
                }
                break;
            case RETURN:
                {
                alt9=8;
                }
                break;
            case 81:
                {
                alt9=9;
                }
                break;
            case ELSE:
            case ELSEIF:
            case ENDFOR:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 80:
                {
                alt9=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:107:5: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction392);
                    assign37=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign37.getTree());

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:108:3: basic_instruction
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_basic_instruction_in_instruction397);
                    basic_instruction38=basic_instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_instruction38.getTree());

                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:109:3: source
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_source_in_instruction402);
                    source39=source();

                    state._fsp--;

                    adaptor.addChild(root_0, source39.getTree());

                    }
                    break;
                case 4 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:110:3: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction406);
                    ite_stmt40=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt40.getTree());

                    }
                    break;
                case 5 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:111:3: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction411);
                    while_stmt41=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt41.getTree());

                    }
                    break;
                case 6 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:112:3: for_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction416);
                    for_stmt42=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt42.getTree());

                    }
                    break;
                case 7 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:113:3: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction421);
                    funcall43=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall43.getTree());

                    }
                    break;
                case 8 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:114:3: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction426);
                    return_stmt44=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt44.getTree());

                    }
                    break;
                case 9 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:115:3: time_annotation
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_time_annotation_in_instruction431);
                    time_annotation45=time_annotation();

                    state._fsp--;

                    adaptor.addChild(root_0, time_annotation45.getTree());

                    }
                    break;
                case 10 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:117:1: 
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:119:1: assign : ( ID eq= EQUAL basic_instruction -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction ) | ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) );
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID46=null;
        Token ID48=null;
        AslParser.basic_instruction_return basic_instruction47 =null;

        AslParser.expr_return expr49 =null;


        AslTree eq_tree=null;
        AslTree ID46_tree=null;
        AslTree ID48_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_basic_instruction=new RewriteRuleSubtreeStream(adaptor,"rule basic_instruction");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:119:8: ( ID eq= EQUAL basic_instruction -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction ) | ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EQUAL) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==CREATE||LA10_2==DESTROY||LA10_2==GROUP||LA10_2==MODIFY||LA10_2==MOVE||(LA10_2 >= ROTATE && LA10_2 <= SCALE)||LA10_2==TRANSLATE) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==DOUBLE||LA10_2==FALSE||LA10_2==ID||LA10_2==INT||LA10_2==MINUS||LA10_2==NOT||LA10_2==PLUS||LA10_2==STRING||LA10_2==TRUE||LA10_2==75) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;

                    }
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
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:119:13: ID eq= EQUAL basic_instruction
                    {
                    ID46=(Token)match(input,ID,FOLLOW_ID_in_assign447);  
                    stream_ID.add(ID46);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign451);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_basic_instruction_in_assign453);
                    basic_instruction47=basic_instruction();

                    state._fsp--;

                    stream_basic_instruction.add(basic_instruction47.getTree());

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
                    // 119:43: -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction )
                    {
                        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:119:46: ^( ASSIGN[$eq,\":=\"] ID basic_instruction )
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
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:120:3: ID eq= EQUAL expr
                    {
                    ID48=(Token)match(input,ID,FOLLOW_ID_in_assign469);  
                    stream_ID.add(ID48);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign473);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign475);
                    expr49=expr();

                    state._fsp--;

                    stream_expr.add(expr49.getTree());

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
                    // 120:20: -> ^( ASSIGN[$eq,\":=\"] ID expr )
                    {
                        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:120:23: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:122:1: basic_instruction : ( create | group | destroy | move | translate | modify | rotate | scale );
    public final AslParser.basic_instruction_return basic_instruction() throws RecognitionException {
        AslParser.basic_instruction_return retval = new AslParser.basic_instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.create_return create50 =null;

        AslParser.group_return group51 =null;

        AslParser.destroy_return destroy52 =null;

        AslParser.move_return move53 =null;

        AslParser.translate_return translate54 =null;

        AslParser.modify_return modify55 =null;

        AslParser.rotate_return rotate56 =null;

        AslParser.scale_return scale57 =null;



        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:122:18: ( create | group | destroy | move | translate | modify | rotate | scale )
            int alt11=8;
            switch ( input.LA(1) ) {
            case CREATE:
                {
                alt11=1;
                }
                break;
            case GROUP:
                {
                alt11=2;
                }
                break;
            case DESTROY:
                {
                alt11=3;
                }
                break;
            case MOVE:
                {
                alt11=4;
                }
                break;
            case TRANSLATE:
                {
                alt11=5;
                }
                break;
            case MODIFY:
                {
                alt11=6;
                }
                break;
            case ROTATE:
                {
                alt11=7;
                }
                break;
            case SCALE:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:123:1: create
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_create_in_basic_instruction494);
                    create50=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create50.getTree());

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:124:3: group
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_group_in_basic_instruction498);
                    group51=group();

                    state._fsp--;

                    adaptor.addChild(root_0, group51.getTree());

                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:125:3: destroy
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_destroy_in_basic_instruction502);
                    destroy52=destroy();

                    state._fsp--;

                    adaptor.addChild(root_0, destroy52.getTree());

                    }
                    break;
                case 4 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:126:3: move
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_in_basic_instruction506);
                    move53=move();

                    state._fsp--;

                    adaptor.addChild(root_0, move53.getTree());

                    }
                    break;
                case 5 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:127:3: translate
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_translate_in_basic_instruction510);
                    translate54=translate();

                    state._fsp--;

                    adaptor.addChild(root_0, translate54.getTree());

                    }
                    break;
                case 6 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:128:3: modify
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_in_basic_instruction514);
                    modify55=modify();

                    state._fsp--;

                    adaptor.addChild(root_0, modify55.getTree());

                    }
                    break;
                case 7 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:129:3: rotate
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_rotate_in_basic_instruction518);
                    rotate56=rotate();

                    state._fsp--;

                    adaptor.addChild(root_0, rotate56.getTree());

                    }
                    break;
                case 8 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:130:3: scale
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_scale_in_basic_instruction522);
                    scale57=scale();

                    state._fsp--;

                    adaptor.addChild(root_0, scale57.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:133:1: ite_stmt : IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF58=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token ENDIF65=null;
        AslParser.expr_return expr60 =null;

        AslParser.block_instructions_return block_instructions62 =null;

        AslParser.elseif_stmt_return elseif_stmt63 =null;

        AslParser.else_stmt_return else_stmt64 =null;


        AslTree IF58_tree=null;
        AslTree char_literal59_tree=null;
        AslTree char_literal61_tree=null;
        AslTree ENDIF65_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:133:10: ( IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:133:13: IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF58=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt532); 
            IF58_tree = 
            (AslTree)adaptor.create(IF58)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF58_tree, root_0);


            char_literal59=(Token)match(input,75,FOLLOW_75_in_ite_stmt535); 

            pushFollow(FOLLOW_expr_in_ite_stmt538);
            expr60=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr60.getTree());

            char_literal61=(Token)match(input,76,FOLLOW_76_in_ite_stmt540); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt543);
            block_instructions62=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions62.getTree());

            pushFollow(FOLLOW_elseif_stmt_in_ite_stmt545);
            elseif_stmt63=elseif_stmt();

            state._fsp--;

            adaptor.addChild(root_0, elseif_stmt63.getTree());

            pushFollow(FOLLOW_else_stmt_in_ite_stmt547);
            else_stmt64=else_stmt();

            state._fsp--;

            adaptor.addChild(root_0, else_stmt64.getTree());

            ENDIF65=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt549); 

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:136:1: elseif_stmt : ( ELSEIF ^ '(' ! expr ')' ! block_instructions )* ;
    public final AslParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        AslParser.elseif_stmt_return retval = new AslParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ELSEIF66=null;
        Token char_literal67=null;
        Token char_literal69=null;
        AslParser.expr_return expr68 =null;

        AslParser.block_instructions_return block_instructions70 =null;


        AslTree ELSEIF66_tree=null;
        AslTree char_literal67_tree=null;
        AslTree char_literal69_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:136:12: ( ( ELSEIF ^ '(' ! expr ')' ! block_instructions )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:136:14: ( ELSEIF ^ '(' ! expr ')' ! block_instructions )*
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:136:14: ( ELSEIF ^ '(' ! expr ')' ! block_instructions )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ELSEIF) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:136:15: ELSEIF ^ '(' ! expr ')' ! block_instructions
            	    {
            	    ELSEIF66=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseif_stmt559); 
            	    ELSEIF66_tree = 
            	    (AslTree)adaptor.create(ELSEIF66)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(ELSEIF66_tree, root_0);


            	    char_literal67=(Token)match(input,75,FOLLOW_75_in_elseif_stmt562); 

            	    pushFollow(FOLLOW_expr_in_elseif_stmt565);
            	    expr68=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr68.getTree());

            	    char_literal69=(Token)match(input,76,FOLLOW_76_in_elseif_stmt567); 

            	    pushFollow(FOLLOW_block_instructions_in_elseif_stmt570);
            	    block_instructions70=block_instructions();

            	    state._fsp--;

            	    adaptor.addChild(root_0, block_instructions70.getTree());

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
    // $ANTLR end "elseif_stmt"


    public static class else_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_stmt"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:139:1: else_stmt : ( ELSE ^ block_instructions )? ;
    public final AslParser.else_stmt_return else_stmt() throws RecognitionException {
        AslParser.else_stmt_return retval = new AslParser.else_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ELSE71=null;
        AslParser.block_instructions_return block_instructions72 =null;


        AslTree ELSE71_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:139:10: ( ( ELSE ^ block_instructions )? )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:139:12: ( ELSE ^ block_instructions )?
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:139:12: ( ELSE ^ block_instructions )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ELSE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:139:13: ELSE ^ block_instructions
                    {
                    ELSE71=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt581); 
                    ELSE71_tree = 
                    (AslTree)adaptor.create(ELSE71)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ELSE71_tree, root_0);


                    pushFollow(FOLLOW_block_instructions_in_else_stmt584);
                    block_instructions72=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions72.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:143:1: while_stmt : WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE73=null;
        Token char_literal74=null;
        Token char_literal76=null;
        Token ENDWHILE78=null;
        AslParser.expr_return expr75 =null;

        AslParser.block_instructions_return block_instructions77 =null;


        AslTree WHILE73_tree=null;
        AslTree char_literal74_tree=null;
        AslTree char_literal76_tree=null;
        AslTree ENDWHILE78_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:143:12: ( WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:143:17: WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE73=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt599); 
            WHILE73_tree = 
            (AslTree)adaptor.create(WHILE73)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE73_tree, root_0);


            char_literal74=(Token)match(input,75,FOLLOW_75_in_while_stmt602); 

            pushFollow(FOLLOW_expr_in_while_stmt605);
            expr75=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr75.getTree());

            char_literal76=(Token)match(input,76,FOLLOW_76_in_while_stmt607); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt610);
            block_instructions77=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions77.getTree());

            ENDWHILE78=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt612); 

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:146:1: for_stmt : FOR ^ '(' ! for_form ')' ! block_instructions ENDFOR !;
    public final AslParser.for_stmt_return for_stmt() throws RecognitionException {
        AslParser.for_stmt_return retval = new AslParser.for_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FOR79=null;
        Token char_literal80=null;
        Token char_literal82=null;
        Token ENDFOR84=null;
        AslParser.for_form_return for_form81 =null;

        AslParser.block_instructions_return block_instructions83 =null;


        AslTree FOR79_tree=null;
        AslTree char_literal80_tree=null;
        AslTree char_literal82_tree=null;
        AslTree ENDFOR84_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:146:10: ( FOR ^ '(' ! for_form ')' ! block_instructions ENDFOR !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:146:13: FOR ^ '(' ! for_form ')' ! block_instructions ENDFOR !
            {
            root_0 = (AslTree)adaptor.nil();


            FOR79=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt623); 
            FOR79_tree = 
            (AslTree)adaptor.create(FOR79)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FOR79_tree, root_0);


            char_literal80=(Token)match(input,75,FOLLOW_75_in_for_stmt626); 

            pushFollow(FOLLOW_for_form_in_for_stmt629);
            for_form81=for_form();

            state._fsp--;

            adaptor.addChild(root_0, for_form81.getTree());

            char_literal82=(Token)match(input,76,FOLLOW_76_in_for_stmt631); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt634);
            block_instructions83=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions83.getTree());

            ENDFOR84=(Token)match(input,ENDFOR,FOLLOW_ENDFOR_in_for_stmt636); 

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:149:1: for_form : ( assign ';' ! expr ';' ! assign | ID IN ! expr ':' ! expr );
    public final AslParser.for_form_return for_form() throws RecognitionException {
        AslParser.for_form_return retval = new AslParser.for_form_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal86=null;
        Token char_literal88=null;
        Token ID90=null;
        Token IN91=null;
        Token char_literal93=null;
        AslParser.assign_return assign85 =null;

        AslParser.expr_return expr87 =null;

        AslParser.assign_return assign89 =null;

        AslParser.expr_return expr92 =null;

        AslParser.expr_return expr94 =null;


        AslTree char_literal86_tree=null;
        AslTree char_literal88_tree=null;
        AslTree ID90_tree=null;
        AslTree IN91_tree=null;
        AslTree char_literal93_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:149:9: ( assign ';' ! expr ';' ! assign | ID IN ! expr ':' ! expr )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EQUAL) ) {
                    alt14=1;
                }
                else if ( (LA14_1==IN) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:149:12: assign ';' ! expr ';' ! assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_for_form646);
                    assign85=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign85.getTree());

                    char_literal86=(Token)match(input,80,FOLLOW_80_in_for_form648); 

                    pushFollow(FOLLOW_expr_in_for_form651);
                    expr87=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr87.getTree());

                    char_literal88=(Token)match(input,80,FOLLOW_80_in_for_form653); 

                    pushFollow(FOLLOW_assign_in_for_form656);
                    assign89=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign89.getTree());

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:150:8: ID IN ! expr ':' ! expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID90=(Token)match(input,ID,FOLLOW_ID_in_for_form665); 
                    ID90_tree = 
                    (AslTree)adaptor.create(ID90)
                    ;
                    adaptor.addChild(root_0, ID90_tree);


                    IN91=(Token)match(input,IN,FOLLOW_IN_in_for_form667); 

                    pushFollow(FOLLOW_expr_in_for_form670);
                    expr92=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr92.getTree());

                    char_literal93=(Token)match(input,79,FOLLOW_79_in_for_form672); 

                    pushFollow(FOLLOW_expr_in_for_form675);
                    expr94=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr94.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:155:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN95=null;
        AslParser.expr_return expr96 =null;


        AslTree RETURN95_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:155:13: ( RETURN ^ ( expr )? )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:155:17: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN95=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt693); 
            RETURN95_tree = 
            (AslTree)adaptor.create(RETURN95)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN95_tree, root_0);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:155:25: ( expr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==DOUBLE||LA15_0==FALSE||LA15_0==ID||LA15_0==INT||LA15_0==MINUS||LA15_0==NOT||LA15_0==PLUS||LA15_0==STRING||LA15_0==TRUE||LA15_0==75) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:155:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt696);
                    expr96=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr96.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:165:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR98=null;
        AslParser.boolterm_return boolterm97 =null;

        AslParser.boolterm_return boolterm99 =null;


        AslTree OR98_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:165:6: ( boolterm ( OR ^ boolterm )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:165:8: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr713);
            boolterm97=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm97.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:165:17: ( OR ^ boolterm )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:165:18: OR ^ boolterm
            	    {
            	    OR98=(Token)match(input,OR,FOLLOW_OR_in_expr716); 
            	    OR98_tree = 
            	    (AslTree)adaptor.create(OR98)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR98_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr719);
            	    boolterm99=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm99.getTree());

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
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:167:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND101=null;
        AslParser.boolfact_return boolfact100 =null;

        AslParser.boolfact_return boolfact102 =null;


        AslTree AND101_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:167:9: ( boolfact ( AND ^ boolfact )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:167:11: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm728);
            boolfact100=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact100.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:167:20: ( AND ^ boolfact )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==AND) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:167:21: AND ^ boolfact
            	    {
            	    AND101=(Token)match(input,AND,FOLLOW_AND_in_boolterm731); 
            	    AND101_tree = 
            	    (AslTree)adaptor.create(AND101)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND101_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm734);
            	    boolfact102=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact102.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:169:1: boolfact : num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COND_EQUAL104=null;
        Token NOT_EQUAL105=null;
        Token LT106=null;
        Token LE107=null;
        Token GT108=null;
        Token GE109=null;
        AslParser.num_expr_return num_expr103 =null;

        AslParser.num_expr_return num_expr110 =null;


        AslTree COND_EQUAL104_tree=null;
        AslTree NOT_EQUAL105_tree=null;
        AslTree LT106_tree=null;
        AslTree LE107_tree=null;
        AslTree GT108_tree=null;
        AslTree GE109_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:169:9: ( num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:169:11: num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact743);
            num_expr103=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr103.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:169:20: ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COND_EQUAL||LA19_0==GE||LA19_0==GT||LA19_0==LE||LA19_0==LT||LA19_0==NOT_EQUAL) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:169:21: ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:169:21: ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt18=6;
                    switch ( input.LA(1) ) {
                    case COND_EQUAL:
                        {
                        alt18=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt18=2;
                        }
                        break;
                    case LT:
                        {
                        alt18=3;
                        }
                        break;
                    case LE:
                        {
                        alt18=4;
                        }
                        break;
                    case GT:
                        {
                        alt18=5;
                        }
                        break;
                    case GE:
                        {
                        alt18=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;

                    }

                    switch (alt18) {
                        case 1 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:169:22: COND_EQUAL ^
                            {
                            COND_EQUAL104=(Token)match(input,COND_EQUAL,FOLLOW_COND_EQUAL_in_boolfact747); 
                            COND_EQUAL104_tree = 
                            (AslTree)adaptor.create(COND_EQUAL104)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(COND_EQUAL104_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:169:36: NOT_EQUAL ^
                            {
                            NOT_EQUAL105=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact752); 
                            NOT_EQUAL105_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL105)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL105_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:169:49: LT ^
                            {
                            LT106=(Token)match(input,LT,FOLLOW_LT_in_boolfact757); 
                            LT106_tree = 
                            (AslTree)adaptor.create(LT106)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT106_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:169:55: LE ^
                            {
                            LE107=(Token)match(input,LE,FOLLOW_LE_in_boolfact762); 
                            LE107_tree = 
                            (AslTree)adaptor.create(LE107)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE107_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:169:61: GT ^
                            {
                            GT108=(Token)match(input,GT,FOLLOW_GT_in_boolfact767); 
                            GT108_tree = 
                            (AslTree)adaptor.create(GT108)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT108_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:169:67: GE ^
                            {
                            GE109=(Token)match(input,GE,FOLLOW_GE_in_boolfact772); 
                            GE109_tree = 
                            (AslTree)adaptor.create(GE109)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE109_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact776);
                    num_expr110=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr110.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:171:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS112=null;
        Token MINUS113=null;
        AslParser.term_return term111 =null;

        AslParser.term_return term114 =null;


        AslTree PLUS112_tree=null;
        AslTree MINUS113_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:171:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:171:11: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr785);
            term111=term();

            state._fsp--;

            adaptor.addChild(root_0, term111.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:171:16: ( ( PLUS ^| MINUS ^) term )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==MINUS||LA21_0==PLUS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:171:18: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:171:18: ( PLUS ^| MINUS ^)
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==PLUS) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==MINUS) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:171:19: PLUS ^
            	            {
            	            PLUS112=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr790); 
            	            PLUS112_tree = 
            	            (AslTree)adaptor.create(PLUS112)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS112_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:171:27: MINUS ^
            	            {
            	            MINUS113=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr795); 
            	            MINUS113_tree = 
            	            (AslTree)adaptor.create(MINUS113)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS113_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr799);
            	    term114=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term114.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:173:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL116=null;
        Token DIV117=null;
        Token MOD118=null;
        AslParser.factor_return factor115 =null;

        AslParser.factor_return factor119 =null;


        AslTree MUL116_tree=null;
        AslTree DIV117_tree=null;
        AslTree MOD118_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:173:6: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:173:8: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term809);
            factor115=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor115.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:173:15: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==DIV||LA23_0==MOD||LA23_0==MUL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:173:17: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:173:17: ( MUL ^| DIV ^| MOD ^)
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:173:18: MUL ^
            	            {
            	            MUL116=(Token)match(input,MUL,FOLLOW_MUL_in_term814); 
            	            MUL116_tree = 
            	            (AslTree)adaptor.create(MUL116)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL116_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:173:25: DIV ^
            	            {
            	            DIV117=(Token)match(input,DIV,FOLLOW_DIV_in_term819); 
            	            DIV117_tree = 
            	            (AslTree)adaptor.create(DIV117)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV117_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:173:32: MOD ^
            	            {
            	            MOD118=(Token)match(input,MOD,FOLLOW_MOD_in_term824); 
            	            MOD118_tree = 
            	            (AslTree)adaptor.create(MOD118)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD118_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term828);
            	    factor119=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor119.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:175:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT120=null;
        Token PLUS121=null;
        Token MINUS122=null;
        AslParser.atom_return atom123 =null;


        AslTree NOT120_tree=null;
        AslTree PLUS121_tree=null;
        AslTree MINUS122_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:175:8: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:175:10: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:175:10: ( NOT ^| PLUS ^| MINUS ^)?
            int alt24=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt24=1;
                    }
                    break;
                case PLUS:
                    {
                    alt24=2;
                    }
                    break;
                case MINUS:
                    {
                    alt24=3;
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:175:11: NOT ^
                    {
                    NOT120=(Token)match(input,NOT,FOLLOW_NOT_in_factor839); 
                    NOT120_tree = 
                    (AslTree)adaptor.create(NOT120)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT120_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:175:18: PLUS ^
                    {
                    PLUS121=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor844); 
                    PLUS121_tree = 
                    (AslTree)adaptor.create(PLUS121)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS121_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:175:26: MINUS ^
                    {
                    MINUS122=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor849); 
                    MINUS122_tree = 
                    (AslTree)adaptor.create(MINUS122)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS122_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor854);
            atom123=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom123.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:180:1: atom : ( ID | INT | DOUBLE | STRING | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| acces_attribute );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID124=null;
        Token INT125=null;
        Token DOUBLE126=null;
        Token STRING127=null;
        Token char_literal129=null;
        Token char_literal131=null;
        AslParser.funcall_return funcall128 =null;

        AslParser.expr_return expr130 =null;

        AslParser.acces_attribute_return acces_attribute132 =null;


        AslTree b_tree=null;
        AslTree ID124_tree=null;
        AslTree INT125_tree=null;
        AslTree DOUBLE126_tree=null;
        AslTree STRING127_tree=null;
        AslTree char_literal129_tree=null;
        AslTree char_literal131_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:180:6: ( ID | INT | DOUBLE | STRING | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| acces_attribute )
            int alt26=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 75:
                    {
                    alt26=6;
                    }
                    break;
                case 78:
                    {
                    alt26=8;
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
                case 76:
                case 77:
                case 79:
                case 80:
                case 83:
                    {
                    alt26=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt26=2;
                }
                break;
            case DOUBLE:
                {
                alt26=3;
                }
                break;
            case STRING:
                {
                alt26=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt26=5;
                }
                break;
            case 75:
                {
                alt26=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:180:8: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID124=(Token)match(input,ID,FOLLOW_ID_in_atom865); 
                    ID124_tree = 
                    (AslTree)adaptor.create(ID124)
                    ;
                    adaptor.addChild(root_0, ID124_tree);


                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:181:3: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT125=(Token)match(input,INT,FOLLOW_INT_in_atom869); 
                    INT125_tree = 
                    (AslTree)adaptor.create(INT125)
                    ;
                    adaptor.addChild(root_0, INT125_tree);


                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:182:3: DOUBLE
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DOUBLE126=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom873); 
                    DOUBLE126_tree = 
                    (AslTree)adaptor.create(DOUBLE126)
                    ;
                    adaptor.addChild(root_0, DOUBLE126_tree);


                    }
                    break;
                case 4 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:183:3: STRING
                    {
                    root_0 = (AslTree)adaptor.nil();


                    STRING127=(Token)match(input,STRING,FOLLOW_STRING_in_atom877); 
                    STRING127_tree = 
                    (AslTree)adaptor.create(STRING127)
                    ;
                    adaptor.addChild(root_0, STRING127_tree);


                    }
                    break;
                case 5 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:184:3: (b= TRUE |b= FALSE )
                    {
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:184:3: (b= TRUE |b= FALSE )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==TRUE) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==FALSE) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }
                    switch (alt25) {
                        case 1 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:184:4: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom884);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:184:13: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom890);  
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
                    // 184:22: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:184:25: ^( BOOLEAN[$b,$b.text] )
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
                case 6 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:185:3: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom902);
                    funcall128=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall128.getTree());

                    }
                    break;
                case 7 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:186:3: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal129=(Token)match(input,75,FOLLOW_75_in_atom906); 

                    pushFollow(FOLLOW_expr_in_atom909);
                    expr130=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr130.getTree());

                    char_literal131=(Token)match(input,76,FOLLOW_76_in_atom911); 

                    }
                    break;
                case 8 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:187:3: acces_attribute
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_acces_attribute_in_atom916);
                    acces_attribute132=acces_attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, acces_attribute132.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:190:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID133=null;
        Token char_literal134=null;
        Token char_literal136=null;
        AslParser.expr_list_return expr_list135 =null;


        AslTree ID133_tree=null;
        AslTree char_literal134_tree=null;
        AslTree char_literal136_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:190:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:190:11: ID '(' ( expr_list )? ')'
            {
            ID133=(Token)match(input,ID,FOLLOW_ID_in_funcall925);  
            stream_ID.add(ID133);


            char_literal134=(Token)match(input,75,FOLLOW_75_in_funcall927);  
            stream_75.add(char_literal134);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:190:18: ( expr_list )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DOUBLE||LA27_0==FALSE||LA27_0==ID||LA27_0==INT||LA27_0==MINUS||LA27_0==NOT||LA27_0==PLUS||LA27_0==STRING||LA27_0==TRUE||LA27_0==75) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:190:18: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall929);
                    expr_list135=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list135.getTree());

                    }
                    break;

            }


            char_literal136=(Token)match(input,76,FOLLOW_76_in_funcall932);  
            stream_76.add(char_literal136);


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
            // 190:33: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:190:36: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:190:49: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:190:59: ( expr_list )?
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:193:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal138=null;
        AslParser.expr_return expr137 =null;

        AslParser.expr_return expr139 =null;


        AslTree char_literal138_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:193:10: ( expr ( ',' ! expr )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:193:12: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list955);
            expr137=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr137.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:193:17: ( ',' ! expr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==77) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:193:18: ',' ! expr
            	    {
            	    char_literal138=(Token)match(input,77,FOLLOW_77_in_expr_list958); 

            	    pushFollow(FOLLOW_expr_in_expr_list961);
            	    expr139=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr139.getTree());

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
    // $ANTLR end "expr_list"


    public static class time_annotation_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "time_annotation"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:195:1: time_annotation : '@' BEGIN EQUAL expr ( ',' finish_time )? -> ^( TIMEANNOTATION expr ( finish_time )? ) ;
    public final AslParser.time_annotation_return time_annotation() throws RecognitionException {
        AslParser.time_annotation_return retval = new AslParser.time_annotation_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal140=null;
        Token BEGIN141=null;
        Token EQUAL142=null;
        Token char_literal144=null;
        AslParser.expr_return expr143 =null;

        AslParser.finish_time_return finish_time145 =null;


        AslTree char_literal140_tree=null;
        AslTree BEGIN141_tree=null;
        AslTree EQUAL142_tree=null;
        AslTree char_literal144_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_finish_time=new RewriteRuleSubtreeStream(adaptor,"rule finish_time");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:195:16: ( '@' BEGIN EQUAL expr ( ',' finish_time )? -> ^( TIMEANNOTATION expr ( finish_time )? ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:196:1: '@' BEGIN EQUAL expr ( ',' finish_time )?
            {
            char_literal140=(Token)match(input,81,FOLLOW_81_in_time_annotation970);  
            stream_81.add(char_literal140);


            BEGIN141=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_time_annotation972);  
            stream_BEGIN.add(BEGIN141);


            EQUAL142=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_time_annotation974);  
            stream_EQUAL.add(EQUAL142);


            pushFollow(FOLLOW_expr_in_time_annotation976);
            expr143=expr();

            state._fsp--;

            stream_expr.add(expr143.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:196:22: ( ',' finish_time )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==77) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:196:23: ',' finish_time
                    {
                    char_literal144=(Token)match(input,77,FOLLOW_77_in_time_annotation979);  
                    stream_77.add(char_literal144);


                    pushFollow(FOLLOW_finish_time_in_time_annotation981);
                    finish_time145=finish_time();

                    state._fsp--;

                    stream_finish_time.add(finish_time145.getTree());

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
            // 196:41: -> ^( TIMEANNOTATION expr ( finish_time )? )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:196:44: ^( TIMEANNOTATION expr ( finish_time )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(TIMEANNOTATION, "TIMEANNOTATION")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:196:66: ( finish_time )?
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:198:1: finish_time : ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr ) ;
    public final AslParser.finish_time_return finish_time() throws RecognitionException {
        AslParser.finish_time_return retval = new AslParser.finish_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token END146=null;
        Token EQUAL147=null;
        Token DURATION149=null;
        Token EQUAL150=null;
        AslParser.expr_return expr148 =null;

        AslParser.expr_return expr151 =null;


        AslTree END146_tree=null;
        AslTree EQUAL147_tree=null;
        AslTree DURATION149_tree=null;
        AslTree EQUAL150_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:198:12: ( ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:199:2: ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr )
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:199:2: ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==END) ) {
                alt30=1;
            }
            else if ( (LA30_0==DURATION) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:199:2: END ^ EQUAL ! expr
                    {
                    END146=(Token)match(input,END,FOLLOW_END_in_finish_time1002); 
                    END146_tree = 
                    (AslTree)adaptor.create(END146)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(END146_tree, root_0);


                    EQUAL147=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_finish_time1005); 

                    pushFollow(FOLLOW_expr_in_finish_time1008);
                    expr148=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr148.getTree());

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:199:21: DURATION ^ EQUAL ! expr
                    {
                    DURATION149=(Token)match(input,DURATION,FOLLOW_DURATION_in_finish_time1012); 
                    DURATION149_tree = 
                    (AslTree)adaptor.create(DURATION149)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(DURATION149_tree, root_0);


                    EQUAL150=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_finish_time1015); 

                    pushFollow(FOLLOW_expr_in_finish_time1018);
                    expr151=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr151.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:1: create : CREATE tipus_objecte ( coordenades )? ( radis )? ( list_attributes )? -> ^( CREATE tipus_objecte ( coordenades )? ( radis )? ( ^( ATTRIBUTES list_attributes ) )? ) ;
    public final AslParser.create_return create() throws RecognitionException {
        AslParser.create_return retval = new AslParser.create_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token CREATE152=null;
        AslParser.tipus_objecte_return tipus_objecte153 =null;

        AslParser.coordenades_return coordenades154 =null;

        AslParser.radis_return radis155 =null;

        AslParser.list_attributes_return list_attributes156 =null;


        AslTree CREATE152_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        RewriteRuleSubtreeStream stream_list_attributes=new RewriteRuleSubtreeStream(adaptor,"rule list_attributes");
        RewriteRuleSubtreeStream stream_tipus_objecte=new RewriteRuleSubtreeStream(adaptor,"rule tipus_objecte");
        RewriteRuleSubtreeStream stream_radis=new RewriteRuleSubtreeStream(adaptor,"rule radis");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:7: ( CREATE tipus_objecte ( coordenades )? ( radis )? ( list_attributes )? -> ^( CREATE tipus_objecte ( coordenades )? ( radis )? ( ^( ATTRIBUTES list_attributes ) )? ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:9: CREATE tipus_objecte ( coordenades )? ( radis )? ( list_attributes )?
            {
            CREATE152=(Token)match(input,CREATE,FOLLOW_CREATE_in_create1026);  
            stream_CREATE.add(CREATE152);


            pushFollow(FOLLOW_tipus_objecte_in_create1028);
            tipus_objecte153=tipus_objecte();

            state._fsp--;

            stream_tipus_objecte.add(tipus_objecte153.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:30: ( coordenades )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==82) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:30: coordenades
                    {
                    pushFollow(FOLLOW_coordenades_in_create1030);
                    coordenades154=coordenades();

                    state._fsp--;

                    stream_coordenades.add(coordenades154.getTree());

                    }
                    break;

            }


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:43: ( radis )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==75) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:43: radis
                    {
                    pushFollow(FOLLOW_radis_in_create1033);
                    radis155=radis();

                    state._fsp--;

                    stream_radis.add(radis155.getTree());

                    }
                    break;

            }


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:50: ( list_attributes )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ATTRIBUTE) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:50: list_attributes
                    {
                    pushFollow(FOLLOW_list_attributes_in_create1036);
                    list_attributes156=list_attributes();

                    state._fsp--;

                    stream_list_attributes.add(list_attributes156.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: tipus_objecte, coordenades, list_attributes, CREATE, radis
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 201:67: -> ^( CREATE tipus_objecte ( coordenades )? ( radis )? ( ^( ATTRIBUTES list_attributes ) )? )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:70: ^( CREATE tipus_objecte ( coordenades )? ( radis )? ( ^( ATTRIBUTES list_attributes ) )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                stream_CREATE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_tipus_objecte.nextTree());

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:93: ( coordenades )?
                if ( stream_coordenades.hasNext() ) {
                    adaptor.addChild(root_1, stream_coordenades.nextTree());

                }
                stream_coordenades.reset();

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:106: ( radis )?
                if ( stream_radis.hasNext() ) {
                    adaptor.addChild(root_1, stream_radis.nextTree());

                }
                stream_radis.reset();

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:113: ( ^( ATTRIBUTES list_attributes ) )?
                if ( stream_list_attributes.hasNext() ) {
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:201:113: ^( ATTRIBUTES list_attributes )
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


    public static class tipus_objecte_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipus_objecte"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:203:1: tipus_objecte : ( TYPE_OBJECT | ID );
    public final AslParser.tipus_objecte_return tipus_objecte() throws RecognitionException {
        AslParser.tipus_objecte_return retval = new AslParser.tipus_objecte_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set157=null;

        AslTree set157_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:203:14: ( TYPE_OBJECT | ID )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set157=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==TYPE_OBJECT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set157)
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
    // $ANTLR end "tipus_objecte"


    public static class group_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "group"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:205:1: group : GROUP ^ ID ( ',' ! ID )+ ;
    public final AslParser.group_return group() throws RecognitionException {
        AslParser.group_return retval = new AslParser.group_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token GROUP158=null;
        Token ID159=null;
        Token char_literal160=null;
        Token ID161=null;

        AslTree GROUP158_tree=null;
        AslTree ID159_tree=null;
        AslTree char_literal160_tree=null;
        AslTree ID161_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:205:6: ( GROUP ^ ID ( ',' ! ID )+ )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:205:8: GROUP ^ ID ( ',' ! ID )+
            {
            root_0 = (AslTree)adaptor.nil();


            GROUP158=(Token)match(input,GROUP,FOLLOW_GROUP_in_group1076); 
            GROUP158_tree = 
            (AslTree)adaptor.create(GROUP158)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(GROUP158_tree, root_0);


            ID159=(Token)match(input,ID,FOLLOW_ID_in_group1079); 
            ID159_tree = 
            (AslTree)adaptor.create(ID159)
            ;
            adaptor.addChild(root_0, ID159_tree);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:205:18: ( ',' ! ID )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==77) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:205:19: ',' ! ID
            	    {
            	    char_literal160=(Token)match(input,77,FOLLOW_77_in_group1082); 

            	    ID161=(Token)match(input,ID,FOLLOW_ID_in_group1085); 
            	    ID161_tree = 
            	    (AslTree)adaptor.create(ID161)
            	    ;
            	    adaptor.addChild(root_0, ID161_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // $ANTLR end "group"


    public static class destroy_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "destroy"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:207:1: destroy : DESTROY ID -> ^( ANIMATION DESTROY ID ) ;
    public final AslParser.destroy_return destroy() throws RecognitionException {
        AslParser.destroy_return retval = new AslParser.destroy_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DESTROY162=null;
        Token ID163=null;

        AslTree DESTROY162_tree=null;
        AslTree ID163_tree=null;
        RewriteRuleTokenStream stream_DESTROY=new RewriteRuleTokenStream(adaptor,"token DESTROY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:207:8: ( DESTROY ID -> ^( ANIMATION DESTROY ID ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:207:10: DESTROY ID
            {
            DESTROY162=(Token)match(input,DESTROY,FOLLOW_DESTROY_in_destroy1094);  
            stream_DESTROY.add(DESTROY162);


            ID163=(Token)match(input,ID,FOLLOW_ID_in_destroy1096);  
            stream_ID.add(ID163);


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
            // 207:21: -> ^( ANIMATION DESTROY ID )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:207:24: ^( ANIMATION DESTROY ID )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:209:1: move : MOVE ID coordenades -> ^( ANIMATION MOVE ID coordenades ) ;
    public final AslParser.move_return move() throws RecognitionException {
        AslParser.move_return retval = new AslParser.move_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVE164=null;
        Token ID165=null;
        AslParser.coordenades_return coordenades166 =null;


        AslTree MOVE164_tree=null;
        AslTree ID165_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MOVE=new RewriteRuleTokenStream(adaptor,"token MOVE");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:209:5: ( MOVE ID coordenades -> ^( ANIMATION MOVE ID coordenades ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:209:9: MOVE ID coordenades
            {
            MOVE164=(Token)match(input,MOVE,FOLLOW_MOVE_in_move1115);  
            stream_MOVE.add(MOVE164);


            ID165=(Token)match(input,ID,FOLLOW_ID_in_move1117);  
            stream_ID.add(ID165);


            pushFollow(FOLLOW_coordenades_in_move1119);
            coordenades166=coordenades();

            state._fsp--;

            stream_coordenades.add(coordenades166.getTree());

            // AST REWRITE
            // elements: ID, MOVE, coordenades
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 209:29: -> ^( ANIMATION MOVE ID coordenades )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:209:32: ^( ANIMATION MOVE ID coordenades )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:211:1: translate : TRANSLATE ID coordenades -> ^( ANIMATION TRANSLATE ID coordenades ) ;
    public final AslParser.translate_return translate() throws RecognitionException {
        AslParser.translate_return retval = new AslParser.translate_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TRANSLATE167=null;
        Token ID168=null;
        AslParser.coordenades_return coordenades169 =null;


        AslTree TRANSLATE167_tree=null;
        AslTree ID168_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TRANSLATE=new RewriteRuleTokenStream(adaptor,"token TRANSLATE");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:211:10: ( TRANSLATE ID coordenades -> ^( ANIMATION TRANSLATE ID coordenades ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:211:13: TRANSLATE ID coordenades
            {
            TRANSLATE167=(Token)match(input,TRANSLATE,FOLLOW_TRANSLATE_in_translate1139);  
            stream_TRANSLATE.add(TRANSLATE167);


            ID168=(Token)match(input,ID,FOLLOW_ID_in_translate1141);  
            stream_ID.add(ID168);


            pushFollow(FOLLOW_coordenades_in_translate1143);
            coordenades169=coordenades();

            state._fsp--;

            stream_coordenades.add(coordenades169.getTree());

            // AST REWRITE
            // elements: TRANSLATE, coordenades, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 211:38: -> ^( ANIMATION TRANSLATE ID coordenades )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:211:41: ^( ANIMATION TRANSLATE ID coordenades )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:213:1: modify : MODIFY ID list_attributes -> ^( ANIMATION MODIFY ID list_attributes ) ;
    public final AslParser.modify_return modify() throws RecognitionException {
        AslParser.modify_return retval = new AslParser.modify_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODIFY170=null;
        Token ID171=null;
        AslParser.list_attributes_return list_attributes172 =null;


        AslTree MODIFY170_tree=null;
        AslTree ID171_tree=null;
        RewriteRuleTokenStream stream_MODIFY=new RewriteRuleTokenStream(adaptor,"token MODIFY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_list_attributes=new RewriteRuleSubtreeStream(adaptor,"rule list_attributes");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:213:7: ( MODIFY ID list_attributes -> ^( ANIMATION MODIFY ID list_attributes ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:213:9: MODIFY ID list_attributes
            {
            MODIFY170=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_modify1162);  
            stream_MODIFY.add(MODIFY170);


            ID171=(Token)match(input,ID,FOLLOW_ID_in_modify1164);  
            stream_ID.add(ID171);


            pushFollow(FOLLOW_list_attributes_in_modify1166);
            list_attributes172=list_attributes();

            state._fsp--;

            stream_list_attributes.add(list_attributes172.getTree());

            // AST REWRITE
            // elements: ID, MODIFY, list_attributes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 213:35: -> ^( ANIMATION MODIFY ID list_attributes )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:213:38: ^( ANIMATION MODIFY ID list_attributes )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:215:1: rotate : ROTATE ID rotate_values -> ^( ANIMATION ROTATE ID rotate_values ) ;
    public final AslParser.rotate_return rotate() throws RecognitionException {
        AslParser.rotate_return retval = new AslParser.rotate_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ROTATE173=null;
        Token ID174=null;
        AslParser.rotate_values_return rotate_values175 =null;


        AslTree ROTATE173_tree=null;
        AslTree ID174_tree=null;
        RewriteRuleTokenStream stream_ROTATE=new RewriteRuleTokenStream(adaptor,"token ROTATE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_rotate_values=new RewriteRuleSubtreeStream(adaptor,"rule rotate_values");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:215:7: ( ROTATE ID rotate_values -> ^( ANIMATION ROTATE ID rotate_values ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:215:9: ROTATE ID rotate_values
            {
            ROTATE173=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_rotate1185);  
            stream_ROTATE.add(ROTATE173);


            ID174=(Token)match(input,ID,FOLLOW_ID_in_rotate1187);  
            stream_ID.add(ID174);


            pushFollow(FOLLOW_rotate_values_in_rotate1189);
            rotate_values175=rotate_values();

            state._fsp--;

            stream_rotate_values.add(rotate_values175.getTree());

            // AST REWRITE
            // elements: ROTATE, rotate_values, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 215:33: -> ^( ANIMATION ROTATE ID rotate_values )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:215:36: ^( ANIMATION ROTATE ID rotate_values )
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

                adaptor.addChild(root_1, stream_rotate_values.nextTree());

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


    public static class rotate_values_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rotate_values"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:217:1: rotate_values : '(' ! expr ( ',' ! expr ',' ! expr )? ')' !;
    public final AslParser.rotate_values_return rotate_values() throws RecognitionException {
        AslParser.rotate_values_return retval = new AslParser.rotate_values_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal176=null;
        Token char_literal178=null;
        Token char_literal180=null;
        Token char_literal182=null;
        AslParser.expr_return expr177 =null;

        AslParser.expr_return expr179 =null;

        AslParser.expr_return expr181 =null;


        AslTree char_literal176_tree=null;
        AslTree char_literal178_tree=null;
        AslTree char_literal180_tree=null;
        AslTree char_literal182_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:217:15: ( '(' ! expr ( ',' ! expr ',' ! expr )? ')' !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:217:18: '(' ! expr ( ',' ! expr ',' ! expr )? ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            char_literal176=(Token)match(input,75,FOLLOW_75_in_rotate_values1210); 

            pushFollow(FOLLOW_expr_in_rotate_values1213);
            expr177=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr177.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:217:28: ( ',' ! expr ',' ! expr )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==77) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:217:29: ',' ! expr ',' ! expr
                    {
                    char_literal178=(Token)match(input,77,FOLLOW_77_in_rotate_values1216); 

                    pushFollow(FOLLOW_expr_in_rotate_values1219);
                    expr179=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr179.getTree());

                    char_literal180=(Token)match(input,77,FOLLOW_77_in_rotate_values1221); 

                    pushFollow(FOLLOW_expr_in_rotate_values1224);
                    expr181=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr181.getTree());

                    }
                    break;

            }


            char_literal182=(Token)match(input,76,FOLLOW_76_in_rotate_values1228); 

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
    // $ANTLR end "rotate_values"


    public static class scale_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scale"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:219:1: scale : SCALE ID expr -> ^( ANIMATION SCALE ID expr ) ;
    public final AslParser.scale_return scale() throws RecognitionException {
        AslParser.scale_return retval = new AslParser.scale_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SCALE183=null;
        Token ID184=null;
        AslParser.expr_return expr185 =null;


        AslTree SCALE183_tree=null;
        AslTree ID184_tree=null;
        RewriteRuleTokenStream stream_SCALE=new RewriteRuleTokenStream(adaptor,"token SCALE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:219:6: ( SCALE ID expr -> ^( ANIMATION SCALE ID expr ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:219:8: SCALE ID expr
            {
            SCALE183=(Token)match(input,SCALE,FOLLOW_SCALE_in_scale1237);  
            stream_SCALE.add(SCALE183);


            ID184=(Token)match(input,ID,FOLLOW_ID_in_scale1239);  
            stream_ID.add(ID184);


            pushFollow(FOLLOW_expr_in_scale1241);
            expr185=expr();

            state._fsp--;

            stream_expr.add(expr185.getTree());

            // AST REWRITE
            // elements: ID, expr, SCALE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 219:22: -> ^( ANIMATION SCALE ID expr )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:219:25: ^( ANIMATION SCALE ID expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ANIMATION, "ANIMATION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_SCALE.nextNode()
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
    // $ANTLR end "scale"


    public static class source_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "source"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:223:1: source : SOURCE ^ FILE '(' ! ( expr ( ',' ! expr )* )? ')' !;
    public final AslParser.source_return source() throws RecognitionException {
        AslParser.source_return retval = new AslParser.source_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SOURCE186=null;
        Token FILE187=null;
        Token char_literal188=null;
        Token char_literal190=null;
        Token char_literal192=null;
        AslParser.expr_return expr189 =null;

        AslParser.expr_return expr191 =null;


        AslTree SOURCE186_tree=null;
        AslTree FILE187_tree=null;
        AslTree char_literal188_tree=null;
        AslTree char_literal190_tree=null;
        AslTree char_literal192_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:223:7: ( SOURCE ^ FILE '(' ! ( expr ( ',' ! expr )* )? ')' !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:223:9: SOURCE ^ FILE '(' ! ( expr ( ',' ! expr )* )? ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            SOURCE186=(Token)match(input,SOURCE,FOLLOW_SOURCE_in_source1262); 
            SOURCE186_tree = 
            (AslTree)adaptor.create(SOURCE186)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(SOURCE186_tree, root_0);


            FILE187=(Token)match(input,FILE,FOLLOW_FILE_in_source1265); 
            FILE187_tree = 
            (AslTree)adaptor.create(FILE187)
            ;
            adaptor.addChild(root_0, FILE187_tree);


            char_literal188=(Token)match(input,75,FOLLOW_75_in_source1267); 

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:223:27: ( expr ( ',' ! expr )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==DOUBLE||LA37_0==FALSE||LA37_0==ID||LA37_0==INT||LA37_0==MINUS||LA37_0==NOT||LA37_0==PLUS||LA37_0==STRING||LA37_0==TRUE||LA37_0==75) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:223:28: expr ( ',' ! expr )*
                    {
                    pushFollow(FOLLOW_expr_in_source1271);
                    expr189=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr189.getTree());

                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:223:33: ( ',' ! expr )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==77) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:223:34: ',' ! expr
                    	    {
                    	    char_literal190=(Token)match(input,77,FOLLOW_77_in_source1274); 

                    	    pushFollow(FOLLOW_expr_in_source1277);
                    	    expr191=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr191.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal192=(Token)match(input,76,FOLLOW_76_in_source1284); 

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
    // $ANTLR end "source"


    public static class list_attributes_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_attributes"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:225:1: list_attributes : attribute ( ',' ! attribute )* ;
    public final AslParser.list_attributes_return list_attributes() throws RecognitionException {
        AslParser.list_attributes_return retval = new AslParser.list_attributes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal194=null;
        AslParser.attribute_return attribute193 =null;

        AslParser.attribute_return attribute195 =null;


        AslTree char_literal194_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:225:16: ( attribute ( ',' ! attribute )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:225:18: attribute ( ',' ! attribute )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_attribute_in_list_attributes1292);
            attribute193=attribute();

            state._fsp--;

            adaptor.addChild(root_0, attribute193.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:225:28: ( ',' ! attribute )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==77) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:225:29: ',' ! attribute
            	    {
            	    char_literal194=(Token)match(input,77,FOLLOW_77_in_list_attributes1295); 

            	    pushFollow(FOLLOW_attribute_in_list_attributes1298);
            	    attribute195=attribute();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribute195.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:227:1: attribute : ATTRIBUTE ^ EQUAL ! expr ;
    public final AslParser.attribute_return attribute() throws RecognitionException {
        AslParser.attribute_return retval = new AslParser.attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ATTRIBUTE196=null;
        Token EQUAL197=null;
        AslParser.expr_return expr198 =null;


        AslTree ATTRIBUTE196_tree=null;
        AslTree EQUAL197_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:227:10: ( ATTRIBUTE ^ EQUAL ! expr )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:227:12: ATTRIBUTE ^ EQUAL ! expr
            {
            root_0 = (AslTree)adaptor.nil();


            ATTRIBUTE196=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute1307); 
            ATTRIBUTE196_tree = 
            (AslTree)adaptor.create(ATTRIBUTE196)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(ATTRIBUTE196_tree, root_0);


            EQUAL197=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_attribute1310); 

            pushFollow(FOLLOW_expr_in_attribute1313);
            expr198=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr198.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:229:1: coordenades : '{' ! expr ',' ! expr ( ',' ! expr ',' ! expr )? '}' !;
    public final AslParser.coordenades_return coordenades() throws RecognitionException {
        AslParser.coordenades_return retval = new AslParser.coordenades_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal199=null;
        Token char_literal201=null;
        Token char_literal203=null;
        Token char_literal205=null;
        Token char_literal207=null;
        AslParser.expr_return expr200 =null;

        AslParser.expr_return expr202 =null;

        AslParser.expr_return expr204 =null;

        AslParser.expr_return expr206 =null;


        AslTree char_literal199_tree=null;
        AslTree char_literal201_tree=null;
        AslTree char_literal203_tree=null;
        AslTree char_literal205_tree=null;
        AslTree char_literal207_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:229:12: ( '{' ! expr ',' ! expr ( ',' ! expr ',' ! expr )? '}' !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:229:14: '{' ! expr ',' ! expr ( ',' ! expr ',' ! expr )? '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            char_literal199=(Token)match(input,82,FOLLOW_82_in_coordenades1320); 

            pushFollow(FOLLOW_expr_in_coordenades1323);
            expr200=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr200.getTree());

            char_literal201=(Token)match(input,77,FOLLOW_77_in_coordenades1325); 

            pushFollow(FOLLOW_expr_in_coordenades1328);
            expr202=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr202.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:229:34: ( ',' ! expr ',' ! expr )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==77) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:229:36: ',' ! expr ',' ! expr
                    {
                    char_literal203=(Token)match(input,77,FOLLOW_77_in_coordenades1332); 

                    pushFollow(FOLLOW_expr_in_coordenades1335);
                    expr204=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr204.getTree());

                    char_literal205=(Token)match(input,77,FOLLOW_77_in_coordenades1337); 

                    pushFollow(FOLLOW_expr_in_coordenades1340);
                    expr206=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr206.getTree());

                    }
                    break;

            }


            char_literal207=(Token)match(input,83,FOLLOW_83_in_coordenades1344); 

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


    public static class radis_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "radis"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:231:1: radis : '(' ! expr ( ')' !| radi2 ) ;
    public final AslParser.radis_return radis() throws RecognitionException {
        AslParser.radis_return retval = new AslParser.radis_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal208=null;
        Token char_literal210=null;
        AslParser.expr_return expr209 =null;

        AslParser.radi2_return radi2211 =null;


        AslTree char_literal208_tree=null;
        AslTree char_literal210_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:231:6: ( '(' ! expr ( ')' !| radi2 ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:231:8: '(' ! expr ( ')' !| radi2 )
            {
            root_0 = (AslTree)adaptor.nil();


            char_literal208=(Token)match(input,75,FOLLOW_75_in_radis1352); 

            pushFollow(FOLLOW_expr_in_radis1355);
            expr209=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr209.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:231:18: ( ')' !| radi2 )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==76) ) {
                alt40=1;
            }
            else if ( (LA40_0==77) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:231:19: ')' !
                    {
                    char_literal210=(Token)match(input,76,FOLLOW_76_in_radis1358); 

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:231:26: radi2
                    {
                    pushFollow(FOLLOW_radi2_in_radis1363);
                    radi2211=radi2();

                    state._fsp--;

                    adaptor.addChild(root_0, radi2211.getTree());

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
    // $ANTLR end "radis"


    public static class radi2_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "radi2"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:233:1: radi2 : ',' ! expr ')' !;
    public final AslParser.radi2_return radi2() throws RecognitionException {
        AslParser.radi2_return retval = new AslParser.radi2_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal212=null;
        Token char_literal214=null;
        AslParser.expr_return expr213 =null;


        AslTree char_literal212_tree=null;
        AslTree char_literal214_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:233:6: ( ',' ! expr ')' !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:233:8: ',' ! expr ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            char_literal212=(Token)match(input,77,FOLLOW_77_in_radi21371); 

            pushFollow(FOLLOW_expr_in_radi21374);
            expr213=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr213.getTree());

            char_literal214=(Token)match(input,76,FOLLOW_76_in_radi21376); 

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
    // $ANTLR end "radi2"


    public static class acces_attribute_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "acces_attribute"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:235:1: acces_attribute : ID '.' att '(' ')' -> ^( ACCESATTRIBUTE ID att ) ;
    public final AslParser.acces_attribute_return acces_attribute() throws RecognitionException {
        AslParser.acces_attribute_return retval = new AslParser.acces_attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID215=null;
        Token char_literal216=null;
        Token char_literal218=null;
        Token char_literal219=null;
        AslParser.att_return att217 =null;


        AslTree ID215_tree=null;
        AslTree char_literal216_tree=null;
        AslTree char_literal218_tree=null;
        AslTree char_literal219_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_att=new RewriteRuleSubtreeStream(adaptor,"rule att");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:235:16: ( ID '.' att '(' ')' -> ^( ACCESATTRIBUTE ID att ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:235:18: ID '.' att '(' ')'
            {
            ID215=(Token)match(input,ID,FOLLOW_ID_in_acces_attribute1384);  
            stream_ID.add(ID215);


            char_literal216=(Token)match(input,78,FOLLOW_78_in_acces_attribute1386);  
            stream_78.add(char_literal216);


            pushFollow(FOLLOW_att_in_acces_attribute1388);
            att217=att();

            state._fsp--;

            stream_att.add(att217.getTree());

            char_literal218=(Token)match(input,75,FOLLOW_75_in_acces_attribute1390);  
            stream_75.add(char_literal218);


            char_literal219=(Token)match(input,76,FOLLOW_76_in_acces_attribute1392);  
            stream_76.add(char_literal219);


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
            // 235:37: -> ^( ACCESATTRIBUTE ID att )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:235:40: ^( ACCESATTRIBUTE ID att )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:238:1: att : ( ATTRIBUTE | BEGIN | END | DURATION );
    public final AslParser.att_return att() throws RecognitionException {
        AslParser.att_return retval = new AslParser.att_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set220=null;

        AslTree set220_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:238:4: ( ATTRIBUTE | BEGIN | END | DURATION )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/SimpleAnimator/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set220=(Token)input.LT(1);

            if ( input.LA(1)==ATTRIBUTE||input.LA(1)==BEGIN||input.LA(1)==DURATION||input.LA(1)==END ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set220)
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


 

    public static final BitSet FOLLOW_imports_in_prog107 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_defines_in_prog109 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_list_func_in_prog111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_def_in_prog131 = new BitSet(new long[]{0x0000020400010000L});
    public static final BitSet FOLLOW_imports_in_prog133 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_defines_in_prog135 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_list_func_in_prog137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module_def160 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_module_def163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_module_def165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iimport_in_imports175 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_IMPORT_in_iimport194 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FILE_in_iimport197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_iimport199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_define_in_defines209 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DEFINE_in_define228 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_define230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_define232 = new BitSet(new long[]{0x0000000000000200L,0x0000000000010000L});
    public static final BitSet FOLLOW_list_attributes_in_define234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_define237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_list_func264 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_EOF_in_list_func267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func285 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_func288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_params_in_func290 = new BitSet(new long[]{0x802801A200048000L,0x0000000000030127L});
    public static final BitSet FOLLOW_block_instructions_in_func292 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_params305 = new BitSet(new long[]{0x0000008000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_paramlist_in_params307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_params310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_paramlist330 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_param_in_paramlist333 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_param347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions365 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_block_instructions368 = new BitSet(new long[]{0x802801A200048000L,0x0000000000030127L});
    public static final BitSet FOLLOW_instruction_in_block_instructions370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_assign_in_instruction392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_instruction_in_instruction397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_source_in_instruction402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_annotation_in_instruction431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign447 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EQUAL_in_assign451 = new BitSet(new long[]{0x0028002000048000L,0x0000000000000023L});
    public static final BitSet FOLLOW_basic_instruction_in_assign453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign469 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EQUAL_in_assign473 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_assign475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_basic_instruction494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_in_basic_instruction498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destroy_in_basic_instruction502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_basic_instruction506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translate_in_basic_instruction510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_in_basic_instruction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rotate_in_basic_instruction518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scale_in_basic_instruction522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ite_stmt535 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_ite_stmt538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ite_stmt540 = new BitSet(new long[]{0x802801A200048000L,0x0000000000030127L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt543 = new BitSet(new long[]{0x0000000008C00000L});
    public static final BitSet FOLLOW_elseif_stmt_in_ite_stmt545 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_else_stmt_in_ite_stmt547 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseif_stmt559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_elseif_stmt562 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_elseif_stmt567 = new BitSet(new long[]{0x802801A200048000L,0x0000000000030127L});
    public static final BitSet FOLLOW_block_instructions_in_elseif_stmt570 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt581 = new BitSet(new long[]{0x802801A200048000L,0x0000000000030127L});
    public static final BitSet FOLLOW_block_instructions_in_else_stmt584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_while_stmt602 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_while_stmt605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_while_stmt607 = new BitSet(new long[]{0x802801A200048000L,0x0000000000030127L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt610 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_for_stmt626 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_for_form_in_for_stmt629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_for_stmt631 = new BitSet(new long[]{0x802801A200048000L,0x0000000000030127L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt634 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ENDFOR_in_for_stmt636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_for_form646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_for_form648 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_for_form651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_for_form653 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_assign_in_for_form656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_for_form665 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IN_in_for_form667 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_for_form670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_for_form672 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_for_form675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt693 = new BitSet(new long[]{0x0882108080100002L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_return_stmt696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr713 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_OR_in_expr716 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_boolterm_in_expr719 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm728 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm731 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_boolfact_in_boolterm734 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact743 = new BitSet(new long[]{0x0101205000004002L});
    public static final BitSet FOLLOW_COND_EQUAL_in_boolfact747 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact752 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_LT_in_boolfact757 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_LE_in_boolfact762 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_GT_in_boolfact767 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_GE_in_boolfact772 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_num_expr_in_boolfact776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr785 = new BitSet(new long[]{0x0802000000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr790 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_MINUS_in_num_expr795 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_term_in_num_expr799 = new BitSet(new long[]{0x0802000000000002L});
    public static final BitSet FOLLOW_factor_in_term809 = new BitSet(new long[]{0x0044000000080002L});
    public static final BitSet FOLLOW_MUL_in_term814 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_DIV_in_term819 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_MOD_in_term824 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_factor_in_term828 = new BitSet(new long[]{0x0044000000080002L});
    public static final BitSet FOLLOW_NOT_in_factor839 = new BitSet(new long[]{0x0000108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_PLUS_in_factor844 = new BitSet(new long[]{0x0000108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_MINUS_in_factor849 = new BitSet(new long[]{0x0000108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_atom_in_factor854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_atom906 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_atom909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_atom911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_acces_attribute_in_atom916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_funcall927 = new BitSet(new long[]{0x0882108080100000L,0x0000000000001848L});
    public static final BitSet FOLLOW_expr_list_in_funcall929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_funcall932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list955 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_expr_list958 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_expr_list961 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_81_in_time_annotation970 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BEGIN_in_time_annotation972 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EQUAL_in_time_annotation974 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_time_annotation976 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_time_annotation979 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_finish_time_in_time_annotation981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_finish_time1002 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EQUAL_in_finish_time1005 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_finish_time1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_finish_time1012 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EQUAL_in_finish_time1015 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_finish_time1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create1026 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_tipus_objecte_in_create1028 = new BitSet(new long[]{0x0000000000000202L,0x0000000000040800L});
    public static final BitSet FOLLOW_coordenades_in_create1030 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000800L});
    public static final BitSet FOLLOW_radis_in_create1033 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_list_attributes_in_create1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_group1076 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_group1079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_group1082 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_group1085 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_DESTROY_in_destroy1094 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_destroy1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move1115 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_move1117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_coordenades_in_move1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSLATE_in_translate1139 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_translate1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_coordenades_in_translate1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_in_modify1162 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_modify1164 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_list_attributes_in_modify1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_rotate1185 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_rotate1187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rotate_values_in_rotate1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rotate_values1210 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_rotate_values1213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_77_in_rotate_values1216 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_rotate_values1219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_rotate_values1221 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_rotate_values1224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_rotate_values1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALE_in_scale1237 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_scale1239 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_scale1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_in_source1262 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FILE_in_source1265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_source1267 = new BitSet(new long[]{0x0882108080100000L,0x0000000000001848L});
    public static final BitSet FOLLOW_expr_in_source1271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_77_in_source1274 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_source1277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_source1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_list_attributes1295 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1298 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute1307 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EQUAL_in_attribute1310 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_attribute1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_coordenades1320 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_coordenades1323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_coordenades1325 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_coordenades1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000082000L});
    public static final BitSet FOLLOW_77_in_coordenades1332 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_coordenades1335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_coordenades1337 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_coordenades1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_coordenades1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_radis1352 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_radis1355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_radis1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radi2_in_radis1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_radi21371 = new BitSet(new long[]{0x0882108080100000L,0x0000000000000848L});
    public static final BitSet FOLLOW_expr_in_radi21374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_radi21376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_acces_attribute1384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_acces_attribute1386 = new BitSet(new long[]{0x0000000001200A00L});
    public static final BitSet FOLLOW_att_in_acces_attribute1388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_acces_attribute1390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_acces_attribute1392 = new BitSet(new long[]{0x0000000000000002L});

}