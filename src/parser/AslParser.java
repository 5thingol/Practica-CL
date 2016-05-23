// $ANTLR 3.4 /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g 2016-05-23 21:47:30

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESATTRIBUTE", "AND", "ANIMATION", "ARGLIST", "ASSIGN", "ATTRIBUTE", "ATTRIBUTES", "BEGIN", "BOOLEAN", "COMMENT", "COND_EQUAL", "CREATE", "CREATE_INSTR", "DESTROY", "DIV", "DURATION", "ELSE", "ELSEIF", "END", "ENDFOR", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FOR", "FUNC", "FUNCALL", "GE", "GROUP", "GT", "ID", "IF", "IMPORT", "IN", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MODIFY", "MODULE", "MOVE", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PROG", "READ", "RETURN", "ROTATE", "STRING", "TIMEANNOTATION", "TRANSLATE", "TRUE", "TYPE_OBJECT", "WHILE", "WRITE", "WS", "'\"'", "'('", "')'", "','", "'.'", "':'", "';'", "'@'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
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
    public static final int GROUP=34;
    public static final int GT=35;
    public static final int ID=36;
    public static final int IF=37;
    public static final int IMPORT=38;
    public static final int IN=39;
    public static final int INT=40;
    public static final int LE=41;
    public static final int LIST_FUNCTIONS=42;
    public static final int LIST_INSTR=43;
    public static final int LT=44;
    public static final int MINUS=45;
    public static final int MOD=46;
    public static final int MODIFY=47;
    public static final int MODULE=48;
    public static final int MOVE=49;
    public static final int MUL=50;
    public static final int NOT=51;
    public static final int NOT_EQUAL=52;
    public static final int OR=53;
    public static final int PARAMS=54;
    public static final int PLUS=55;
    public static final int PREF=56;
    public static final int PROG=57;
    public static final int READ=58;
    public static final int RETURN=59;
    public static final int ROTATE=60;
    public static final int STRING=61;
    public static final int TIMEANNOTATION=62;
    public static final int TRANSLATE=63;
    public static final int TRUE=64;
    public static final int TYPE_OBJECT=65;
    public static final int WHILE=66;
    public static final int WRITE=67;
    public static final int WS=68;

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
    public String getGrammarFileName() { return "/home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:62:1: prog : ( ( imports )? list_func -> ^( PROG ( imports )? list_func ) | module_def ( imports )? list_func -> ^( PROG module_def ( imports )? list_func ) );
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.imports_return imports1 =null;

        AslParser.list_func_return list_func2 =null;

        AslParser.module_def_return module_def3 =null;

        AslParser.imports_return imports4 =null;

        AslParser.list_func_return list_func5 =null;


        RewriteRuleSubtreeStream stream_list_func=new RewriteRuleSubtreeStream(adaptor,"rule list_func");
        RewriteRuleSubtreeStream stream_module_def=new RewriteRuleSubtreeStream(adaptor,"rule module_def");
        RewriteRuleSubtreeStream stream_imports=new RewriteRuleSubtreeStream(adaptor,"rule imports");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:62:6: ( ( imports )? list_func -> ^( PROG ( imports )? list_func ) | module_def ( imports )? list_func -> ^( PROG module_def ( imports )? list_func ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==FUNC||LA3_0==IMPORT) ) {
                alt3=1;
            }
            else if ( (LA3_0==MODULE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:62:8: ( imports )? list_func
                    {
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:62:8: ( imports )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==IMPORT) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:62:8: imports
                            {
                            pushFollow(FOLLOW_imports_in_prog103);
                            imports1=imports();

                            state._fsp--;

                            stream_imports.add(imports1.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_list_func_in_prog106);
                    list_func2=list_func();

                    state._fsp--;

                    stream_list_func.add(list_func2.getTree());

                    // AST REWRITE
                    // elements: imports, list_func
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 62:27: -> ^( PROG ( imports )? list_func )
                    {
                        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:62:30: ^( PROG ( imports )? list_func )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PROG, "PROG")
                        , root_1);

                        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:62:37: ( imports )?
                        if ( stream_imports.hasNext() ) {
                            adaptor.addChild(root_1, stream_imports.nextTree());

                        }
                        stream_imports.reset();

                        adaptor.addChild(root_1, stream_list_func.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:63:7: module_def ( imports )? list_func
                    {
                    pushFollow(FOLLOW_module_def_in_prog125);
                    module_def3=module_def();

                    state._fsp--;

                    stream_module_def.add(module_def3.getTree());

                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:63:18: ( imports )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==IMPORT) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:63:18: imports
                            {
                            pushFollow(FOLLOW_imports_in_prog127);
                            imports4=imports();

                            state._fsp--;

                            stream_imports.add(imports4.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_list_func_in_prog130);
                    list_func5=list_func();

                    state._fsp--;

                    stream_list_func.add(list_func5.getTree());

                    // AST REWRITE
                    // elements: list_func, imports, module_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 63:37: -> ^( PROG module_def ( imports )? list_func )
                    {
                        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:63:40: ^( PROG module_def ( imports )? list_func )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PROG, "PROG")
                        , root_1);

                        adaptor.addChild(root_1, stream_module_def.nextTree());

                        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:63:58: ( imports )?
                        if ( stream_imports.hasNext() ) {
                            adaptor.addChild(root_1, stream_imports.nextTree());

                        }
                        stream_imports.reset();

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:66:1: module_def : MODULE ^ '\"' ! ID '\"' ! ';' !;
    public final AslParser.module_def_return module_def() throws RecognitionException {
        AslParser.module_def_return retval = new AslParser.module_def_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODULE6=null;
        Token char_literal7=null;
        Token ID8=null;
        Token char_literal9=null;
        Token char_literal10=null;

        AslTree MODULE6_tree=null;
        AslTree char_literal7_tree=null;
        AslTree ID8_tree=null;
        AslTree char_literal9_tree=null;
        AslTree char_literal10_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:66:12: ( MODULE ^ '\"' ! ID '\"' ! ';' !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:66:14: MODULE ^ '\"' ! ID '\"' ! ';' !
            {
            root_0 = (AslTree)adaptor.nil();


            MODULE6=(Token)match(input,MODULE,FOLLOW_MODULE_in_module_def152); 
            MODULE6_tree = 
            (AslTree)adaptor.create(MODULE6)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODULE6_tree, root_0);


            char_literal7=(Token)match(input,69,FOLLOW_69_in_module_def155); 

            ID8=(Token)match(input,ID,FOLLOW_ID_in_module_def158); 
            ID8_tree = 
            (AslTree)adaptor.create(ID8)
            ;
            adaptor.addChild(root_0, ID8_tree);


            char_literal9=(Token)match(input,69,FOLLOW_69_in_module_def160); 

            char_literal10=(Token)match(input,75,FOLLOW_75_in_module_def163); 

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:69:1: imports : ( IMPORT ^ '\"' ! ID '\"' ! ';' !)+ ;
    public final AslParser.imports_return imports() throws RecognitionException {
        AslParser.imports_return retval = new AslParser.imports_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IMPORT11=null;
        Token char_literal12=null;
        Token ID13=null;
        Token char_literal14=null;
        Token char_literal15=null;

        AslTree IMPORT11_tree=null;
        AslTree char_literal12_tree=null;
        AslTree ID13_tree=null;
        AslTree char_literal14_tree=null;
        AslTree char_literal15_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:69:9: ( ( IMPORT ^ '\"' ! ID '\"' ! ';' !)+ )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:69:11: ( IMPORT ^ '\"' ! ID '\"' ! ';' !)+
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:69:11: ( IMPORT ^ '\"' ! ID '\"' ! ';' !)+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IMPORT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:69:12: IMPORT ^ '\"' ! ID '\"' ! ';' !
            	    {
            	    IMPORT11=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_imports174); 
            	    IMPORT11_tree = 
            	    (AslTree)adaptor.create(IMPORT11)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(IMPORT11_tree, root_0);


            	    char_literal12=(Token)match(input,69,FOLLOW_69_in_imports177); 

            	    ID13=(Token)match(input,ID,FOLLOW_ID_in_imports180); 
            	    ID13_tree = 
            	    (AslTree)adaptor.create(ID13)
            	    ;
            	    adaptor.addChild(root_0, ID13_tree);


            	    char_literal14=(Token)match(input,69,FOLLOW_69_in_imports182); 

            	    char_literal15=(Token)match(input,75,FOLLOW_75_in_imports185); 

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


    public static class list_func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_func"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:72:1: list_func : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.list_func_return list_func() throws RecognitionException {
        AslParser.list_func_return retval = new AslParser.list_func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF17=null;
        AslParser.func_return func16 =null;


        AslTree EOF17_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:72:11: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:72:13: ( func )+ EOF
            {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:72:13: ( func )+
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
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:72:13: func
            	    {
            	    pushFollow(FOLLOW_func_in_list_func197);
            	    func16=func();

            	    state._fsp--;

            	    stream_func.add(func16.getTree());

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


            EOF17=(Token)match(input,EOF,FOLLOW_EOF_in_list_func200);  
            stream_EOF.add(EOF17);


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
            // 72:23: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:72:26: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:76:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC18=null;
        Token ID19=null;
        Token ENDFUNC22=null;
        AslParser.params_return params20 =null;

        AslParser.block_instructions_return block_instructions21 =null;


        AslTree FUNC18_tree=null;
        AslTree ID19_tree=null;
        AslTree ENDFUNC22_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:76:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:76:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC18=(Token)match(input,FUNC,FOLLOW_FUNC_in_func219); 
            FUNC18_tree = 
            (AslTree)adaptor.create(FUNC18)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC18_tree, root_0);


            ID19=(Token)match(input,ID,FOLLOW_ID_in_func222); 
            ID19_tree = 
            (AslTree)adaptor.create(ID19)
            ;
            adaptor.addChild(root_0, ID19_tree);


            pushFollow(FOLLOW_params_in_func224);
            params20=params();

            state._fsp--;

            adaptor.addChild(root_0, params20.getTree());

            pushFollow(FOLLOW_block_instructions_in_func226);
            block_instructions21=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions21.getTree());

            ENDFUNC22=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func228); 

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:79:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal23=null;
        Token char_literal25=null;
        AslParser.paramlist_return paramlist24 =null;


        AslTree char_literal23_tree=null;
        AslTree char_literal25_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:79:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:79:10: '(' ( paramlist )? ')'
            {
            char_literal23=(Token)match(input,70,FOLLOW_70_in_params239);  
            stream_70.add(char_literal23);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:79:14: ( paramlist )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:79:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params241);
                    paramlist24=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist24.getTree());

                    }
                    break;

            }


            char_literal25=(Token)match(input,71,FOLLOW_71_in_params244);  
            stream_71.add(char_literal25);


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
            // 79:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:79:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:79:41: ( paramlist )?
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:82:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal27=null;
        AslParser.param_return param26 =null;

        AslParser.param_return param28 =null;


        AslTree char_literal27_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:82:10: ( param ( ',' ! param )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:82:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist261);
            param26=param();

            state._fsp--;

            adaptor.addChild(root_0, param26.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:82:18: ( ',' ! param )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==72) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:82:19: ',' ! param
            	    {
            	    char_literal27=(Token)match(input,72,FOLLOW_72_in_paramlist264); 

            	    pushFollow(FOLLOW_param_in_paramlist267);
            	    param28=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param28.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:86:1: param : id= ID -> ^( PREF[$id,$id.text] ) ;
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;

        AslTree id_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:86:7: (id= ID -> ^( PREF[$id,$id.text] ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:86:9: id= ID
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_param281);  
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
            // 86:15: -> ^( PREF[$id,$id.text] )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:86:18: ^( PREF[$id,$id.text] )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:89:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal30=null;
        AslParser.instruction_return instruction29 =null;

        AslParser.instruction_return instruction31 =null;


        AslTree char_literal30_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:90:5: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:90:5: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions299);
            instruction29=instruction();

            state._fsp--;

            stream_instruction.add(instruction29.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:90:17: ( ';' instruction )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==75) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:90:18: ';' instruction
            	    {
            	    char_literal30=(Token)match(input,75,FOLLOW_75_in_block_instructions302);  
            	    stream_75.add(char_literal30);


            	    pushFollow(FOLLOW_instruction_in_block_instructions304);
            	    instruction31=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction31.getTree());

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
            // 91:4: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:91:4: ^( LIST_INSTR ( instruction )+ )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:94:1: instruction : ( assign | basic_instruction | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | time_annotation |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign32 =null;

        AslParser.basic_instruction_return basic_instruction33 =null;

        AslParser.ite_stmt_return ite_stmt34 =null;

        AslParser.while_stmt_return while_stmt35 =null;

        AslParser.for_stmt_return for_stmt36 =null;

        AslParser.funcall_return funcall37 =null;

        AslParser.return_stmt_return return_stmt38 =null;

        AslParser.time_annotation_return time_annotation39 =null;



        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:95:5: ( assign | basic_instruction | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | time_annotation |)
            int alt9=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EQUAL) ) {
                    alt9=1;
                }
                else if ( (LA9_1==70) ) {
                    alt9=6;
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
            case TRANSLATE:
                {
                alt9=2;
                }
                break;
            case IF:
                {
                alt9=3;
                }
                break;
            case WHILE:
                {
                alt9=4;
                }
                break;
            case FOR:
                {
                alt9=5;
                }
                break;
            case RETURN:
                {
                alt9=7;
                }
                break;
            case 76:
                {
                alt9=8;
                }
                break;
            case ELSE:
            case ELSEIF:
            case ENDFOR:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 75:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:95:5: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction326);
                    assign32=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign32.getTree());

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:96:3: basic_instruction
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_basic_instruction_in_instruction331);
                    basic_instruction33=basic_instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_instruction33.getTree());

                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:97:3: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction336);
                    ite_stmt34=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt34.getTree());

                    }
                    break;
                case 4 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:98:3: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction341);
                    while_stmt35=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt35.getTree());

                    }
                    break;
                case 5 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:99:3: for_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction346);
                    for_stmt36=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt36.getTree());

                    }
                    break;
                case 6 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:100:3: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction351);
                    funcall37=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall37.getTree());

                    }
                    break;
                case 7 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:101:3: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction356);
                    return_stmt38=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt38.getTree());

                    }
                    break;
                case 8 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:102:3: time_annotation
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_time_annotation_in_instruction361);
                    time_annotation39=time_annotation();

                    state._fsp--;

                    adaptor.addChild(root_0, time_annotation39.getTree());

                    }
                    break;
                case 9 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:104:1: 
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:106:1: assign : ( ID eq= EQUAL basic_instruction -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction ) | ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) );
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID40=null;
        Token ID42=null;
        AslParser.basic_instruction_return basic_instruction41 =null;

        AslParser.expr_return expr43 =null;


        AslTree eq_tree=null;
        AslTree ID40_tree=null;
        AslTree ID42_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_basic_instruction=new RewriteRuleSubtreeStream(adaptor,"rule basic_instruction");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:106:8: ( ID eq= EQUAL basic_instruction -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction ) | ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EQUAL) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==CREATE||LA10_2==DESTROY||LA10_2==GROUP||LA10_2==MODIFY||LA10_2==MOVE||LA10_2==ROTATE||LA10_2==TRANSLATE) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==FALSE||LA10_2==ID||LA10_2==INT||LA10_2==MINUS||LA10_2==NOT||LA10_2==PLUS||LA10_2==TRUE||LA10_2==70) ) {
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
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:106:13: ID eq= EQUAL basic_instruction
                    {
                    ID40=(Token)match(input,ID,FOLLOW_ID_in_assign377);  
                    stream_ID.add(ID40);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign381);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_basic_instruction_in_assign383);
                    basic_instruction41=basic_instruction();

                    state._fsp--;

                    stream_basic_instruction.add(basic_instruction41.getTree());

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
                    // 106:43: -> ^( ASSIGN[$eq,\":=\"] ID basic_instruction )
                    {
                        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:106:46: ^( ASSIGN[$eq,\":=\"] ID basic_instruction )
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
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:107:3: ID eq= EQUAL expr
                    {
                    ID42=(Token)match(input,ID,FOLLOW_ID_in_assign399);  
                    stream_ID.add(ID42);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign403);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign405);
                    expr43=expr();

                    state._fsp--;

                    stream_expr.add(expr43.getTree());

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
                    // 107:20: -> ^( ASSIGN[$eq,\":=\"] ID expr )
                    {
                        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:107:23: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:109:1: basic_instruction : ( create | group | destroy | move | translate | modify | rotate );
    public final AslParser.basic_instruction_return basic_instruction() throws RecognitionException {
        AslParser.basic_instruction_return retval = new AslParser.basic_instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.create_return create44 =null;

        AslParser.group_return group45 =null;

        AslParser.destroy_return destroy46 =null;

        AslParser.move_return move47 =null;

        AslParser.translate_return translate48 =null;

        AslParser.modify_return modify49 =null;

        AslParser.rotate_return rotate50 =null;



        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:109:18: ( create | group | destroy | move | translate | modify | rotate )
            int alt11=7;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:110:1: create
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_create_in_basic_instruction424);
                    create44=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create44.getTree());

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:111:3: group
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_group_in_basic_instruction428);
                    group45=group();

                    state._fsp--;

                    adaptor.addChild(root_0, group45.getTree());

                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:112:3: destroy
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_destroy_in_basic_instruction432);
                    destroy46=destroy();

                    state._fsp--;

                    adaptor.addChild(root_0, destroy46.getTree());

                    }
                    break;
                case 4 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:113:3: move
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_in_basic_instruction436);
                    move47=move();

                    state._fsp--;

                    adaptor.addChild(root_0, move47.getTree());

                    }
                    break;
                case 5 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:114:3: translate
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_translate_in_basic_instruction440);
                    translate48=translate();

                    state._fsp--;

                    adaptor.addChild(root_0, translate48.getTree());

                    }
                    break;
                case 6 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:115:3: modify
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_in_basic_instruction444);
                    modify49=modify();

                    state._fsp--;

                    adaptor.addChild(root_0, modify49.getTree());

                    }
                    break;
                case 7 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:116:3: rotate
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_rotate_in_basic_instruction448);
                    rotate50=rotate();

                    state._fsp--;

                    adaptor.addChild(root_0, rotate50.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:119:1: ite_stmt : IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF51=null;
        Token char_literal52=null;
        Token char_literal54=null;
        Token ENDIF58=null;
        AslParser.expr_return expr53 =null;

        AslParser.block_instructions_return block_instructions55 =null;

        AslParser.elseif_stmt_return elseif_stmt56 =null;

        AslParser.else_stmt_return else_stmt57 =null;


        AslTree IF51_tree=null;
        AslTree char_literal52_tree=null;
        AslTree char_literal54_tree=null;
        AslTree ENDIF58_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:119:10: ( IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:119:13: IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF51=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt458); 
            IF51_tree = 
            (AslTree)adaptor.create(IF51)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF51_tree, root_0);


            char_literal52=(Token)match(input,70,FOLLOW_70_in_ite_stmt461); 

            pushFollow(FOLLOW_expr_in_ite_stmt464);
            expr53=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr53.getTree());

            char_literal54=(Token)match(input,71,FOLLOW_71_in_ite_stmt466); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt469);
            block_instructions55=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions55.getTree());

            pushFollow(FOLLOW_elseif_stmt_in_ite_stmt471);
            elseif_stmt56=elseif_stmt();

            state._fsp--;

            adaptor.addChild(root_0, elseif_stmt56.getTree());

            pushFollow(FOLLOW_else_stmt_in_ite_stmt473);
            else_stmt57=else_stmt();

            state._fsp--;

            adaptor.addChild(root_0, else_stmt57.getTree());

            ENDIF58=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt475); 

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:122:1: elseif_stmt : ( ELSEIF ^ '(' ! expr ')' ! block_instructions )* ;
    public final AslParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        AslParser.elseif_stmt_return retval = new AslParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ELSEIF59=null;
        Token char_literal60=null;
        Token char_literal62=null;
        AslParser.expr_return expr61 =null;

        AslParser.block_instructions_return block_instructions63 =null;


        AslTree ELSEIF59_tree=null;
        AslTree char_literal60_tree=null;
        AslTree char_literal62_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:122:12: ( ( ELSEIF ^ '(' ! expr ')' ! block_instructions )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:122:14: ( ELSEIF ^ '(' ! expr ')' ! block_instructions )*
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:122:14: ( ELSEIF ^ '(' ! expr ')' ! block_instructions )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ELSEIF) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:122:15: ELSEIF ^ '(' ! expr ')' ! block_instructions
            	    {
            	    ELSEIF59=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseif_stmt485); 
            	    ELSEIF59_tree = 
            	    (AslTree)adaptor.create(ELSEIF59)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(ELSEIF59_tree, root_0);


            	    char_literal60=(Token)match(input,70,FOLLOW_70_in_elseif_stmt488); 

            	    pushFollow(FOLLOW_expr_in_elseif_stmt491);
            	    expr61=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr61.getTree());

            	    char_literal62=(Token)match(input,71,FOLLOW_71_in_elseif_stmt493); 

            	    pushFollow(FOLLOW_block_instructions_in_elseif_stmt496);
            	    block_instructions63=block_instructions();

            	    state._fsp--;

            	    adaptor.addChild(root_0, block_instructions63.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:125:1: else_stmt : ( ELSE ^ block_instructions )? ;
    public final AslParser.else_stmt_return else_stmt() throws RecognitionException {
        AslParser.else_stmt_return retval = new AslParser.else_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ELSE64=null;
        AslParser.block_instructions_return block_instructions65 =null;


        AslTree ELSE64_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:125:10: ( ( ELSE ^ block_instructions )? )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:125:12: ( ELSE ^ block_instructions )?
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:125:12: ( ELSE ^ block_instructions )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ELSE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:125:13: ELSE ^ block_instructions
                    {
                    ELSE64=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt507); 
                    ELSE64_tree = 
                    (AslTree)adaptor.create(ELSE64)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ELSE64_tree, root_0);


                    pushFollow(FOLLOW_block_instructions_in_else_stmt510);
                    block_instructions65=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions65.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:129:1: while_stmt : WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE66=null;
        Token char_literal67=null;
        Token char_literal69=null;
        Token ENDWHILE71=null;
        AslParser.expr_return expr68 =null;

        AslParser.block_instructions_return block_instructions70 =null;


        AslTree WHILE66_tree=null;
        AslTree char_literal67_tree=null;
        AslTree char_literal69_tree=null;
        AslTree ENDWHILE71_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:129:12: ( WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:129:17: WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE66=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt525); 
            WHILE66_tree = 
            (AslTree)adaptor.create(WHILE66)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE66_tree, root_0);


            char_literal67=(Token)match(input,70,FOLLOW_70_in_while_stmt528); 

            pushFollow(FOLLOW_expr_in_while_stmt531);
            expr68=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr68.getTree());

            char_literal69=(Token)match(input,71,FOLLOW_71_in_while_stmt533); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt536);
            block_instructions70=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions70.getTree());

            ENDWHILE71=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt538); 

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:132:1: for_stmt : FOR ^ '(' ! for_form ')' ! block_instructions ENDFOR !;
    public final AslParser.for_stmt_return for_stmt() throws RecognitionException {
        AslParser.for_stmt_return retval = new AslParser.for_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FOR72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        Token ENDFOR77=null;
        AslParser.for_form_return for_form74 =null;

        AslParser.block_instructions_return block_instructions76 =null;


        AslTree FOR72_tree=null;
        AslTree char_literal73_tree=null;
        AslTree char_literal75_tree=null;
        AslTree ENDFOR77_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:132:10: ( FOR ^ '(' ! for_form ')' ! block_instructions ENDFOR !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:132:13: FOR ^ '(' ! for_form ')' ! block_instructions ENDFOR !
            {
            root_0 = (AslTree)adaptor.nil();


            FOR72=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt549); 
            FOR72_tree = 
            (AslTree)adaptor.create(FOR72)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FOR72_tree, root_0);


            char_literal73=(Token)match(input,70,FOLLOW_70_in_for_stmt552); 

            pushFollow(FOLLOW_for_form_in_for_stmt555);
            for_form74=for_form();

            state._fsp--;

            adaptor.addChild(root_0, for_form74.getTree());

            char_literal75=(Token)match(input,71,FOLLOW_71_in_for_stmt557); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt560);
            block_instructions76=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions76.getTree());

            ENDFOR77=(Token)match(input,ENDFOR,FOLLOW_ENDFOR_in_for_stmt562); 

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:135:1: for_form : ( assign ';' ! expr ';' ! assign | ID IN ! expr ':' ! expr );
    public final AslParser.for_form_return for_form() throws RecognitionException {
        AslParser.for_form_return retval = new AslParser.for_form_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal79=null;
        Token char_literal81=null;
        Token ID83=null;
        Token IN84=null;
        Token char_literal86=null;
        AslParser.assign_return assign78 =null;

        AslParser.expr_return expr80 =null;

        AslParser.assign_return assign82 =null;

        AslParser.expr_return expr85 =null;

        AslParser.expr_return expr87 =null;


        AslTree char_literal79_tree=null;
        AslTree char_literal81_tree=null;
        AslTree ID83_tree=null;
        AslTree IN84_tree=null;
        AslTree char_literal86_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:135:9: ( assign ';' ! expr ';' ! assign | ID IN ! expr ':' ! expr )
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
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:135:12: assign ';' ! expr ';' ! assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_for_form572);
                    assign78=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign78.getTree());

                    char_literal79=(Token)match(input,75,FOLLOW_75_in_for_form574); 

                    pushFollow(FOLLOW_expr_in_for_form577);
                    expr80=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr80.getTree());

                    char_literal81=(Token)match(input,75,FOLLOW_75_in_for_form579); 

                    pushFollow(FOLLOW_assign_in_for_form582);
                    assign82=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign82.getTree());

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:136:8: ID IN ! expr ':' ! expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID83=(Token)match(input,ID,FOLLOW_ID_in_for_form592); 
                    ID83_tree = 
                    (AslTree)adaptor.create(ID83)
                    ;
                    adaptor.addChild(root_0, ID83_tree);


                    IN84=(Token)match(input,IN,FOLLOW_IN_in_for_form594); 

                    pushFollow(FOLLOW_expr_in_for_form597);
                    expr85=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr85.getTree());

                    char_literal86=(Token)match(input,74,FOLLOW_74_in_for_form599); 

                    pushFollow(FOLLOW_expr_in_for_form602);
                    expr87=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr87.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:141:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN88=null;
        AslParser.expr_return expr89 =null;


        AslTree RETURN88_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:141:13: ( RETURN ^ ( expr )? )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:141:17: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN88=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt619); 
            RETURN88_tree = 
            (AslTree)adaptor.create(RETURN88)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN88_tree, root_0);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:141:25: ( expr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==FALSE||LA15_0==ID||LA15_0==INT||LA15_0==MINUS||LA15_0==NOT||LA15_0==PLUS||LA15_0==TRUE||LA15_0==70) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:141:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt622);
                    expr89=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr89.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:151:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR91=null;
        AslParser.boolterm_return boolterm90 =null;

        AslParser.boolterm_return boolterm92 =null;


        AslTree OR91_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:151:6: ( boolterm ( OR ^ boolterm )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:151:8: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr639);
            boolterm90=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm90.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:151:17: ( OR ^ boolterm )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:151:18: OR ^ boolterm
            	    {
            	    OR91=(Token)match(input,OR,FOLLOW_OR_in_expr642); 
            	    OR91_tree = 
            	    (AslTree)adaptor.create(OR91)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR91_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr645);
            	    boolterm92=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm92.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:153:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND94=null;
        AslParser.boolfact_return boolfact93 =null;

        AslParser.boolfact_return boolfact95 =null;


        AslTree AND94_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:153:9: ( boolfact ( AND ^ boolfact )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:153:11: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm654);
            boolfact93=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact93.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:153:20: ( AND ^ boolfact )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==AND) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:153:21: AND ^ boolfact
            	    {
            	    AND94=(Token)match(input,AND,FOLLOW_AND_in_boolterm657); 
            	    AND94_tree = 
            	    (AslTree)adaptor.create(AND94)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND94_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm660);
            	    boolfact95=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact95.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:1: boolfact : num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COND_EQUAL97=null;
        Token NOT_EQUAL98=null;
        Token LT99=null;
        Token LE100=null;
        Token GT101=null;
        Token GE102=null;
        AslParser.num_expr_return num_expr96 =null;

        AslParser.num_expr_return num_expr103 =null;


        AslTree COND_EQUAL97_tree=null;
        AslTree NOT_EQUAL98_tree=null;
        AslTree LT99_tree=null;
        AslTree LE100_tree=null;
        AslTree GT101_tree=null;
        AslTree GE102_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:9: ( num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:11: num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact669);
            num_expr96=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr96.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:20: ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COND_EQUAL||LA19_0==GE||LA19_0==GT||LA19_0==LE||LA19_0==LT||LA19_0==NOT_EQUAL) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:21: ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:21: ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:22: COND_EQUAL ^
                            {
                            COND_EQUAL97=(Token)match(input,COND_EQUAL,FOLLOW_COND_EQUAL_in_boolfact673); 
                            COND_EQUAL97_tree = 
                            (AslTree)adaptor.create(COND_EQUAL97)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(COND_EQUAL97_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:36: NOT_EQUAL ^
                            {
                            NOT_EQUAL98=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact678); 
                            NOT_EQUAL98_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL98)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL98_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:49: LT ^
                            {
                            LT99=(Token)match(input,LT,FOLLOW_LT_in_boolfact683); 
                            LT99_tree = 
                            (AslTree)adaptor.create(LT99)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT99_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:55: LE ^
                            {
                            LE100=(Token)match(input,LE,FOLLOW_LE_in_boolfact688); 
                            LE100_tree = 
                            (AslTree)adaptor.create(LE100)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE100_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:61: GT ^
                            {
                            GT101=(Token)match(input,GT,FOLLOW_GT_in_boolfact693); 
                            GT101_tree = 
                            (AslTree)adaptor.create(GT101)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT101_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:67: GE ^
                            {
                            GE102=(Token)match(input,GE,FOLLOW_GE_in_boolfact698); 
                            GE102_tree = 
                            (AslTree)adaptor.create(GE102)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE102_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact702);
                    num_expr103=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr103.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:157:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS105=null;
        Token MINUS106=null;
        AslParser.term_return term104 =null;

        AslParser.term_return term107 =null;


        AslTree PLUS105_tree=null;
        AslTree MINUS106_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:157:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:157:11: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr711);
            term104=term();

            state._fsp--;

            adaptor.addChild(root_0, term104.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:157:16: ( ( PLUS ^| MINUS ^) term )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==MINUS||LA21_0==PLUS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:157:18: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:157:18: ( PLUS ^| MINUS ^)
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
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:157:19: PLUS ^
            	            {
            	            PLUS105=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr716); 
            	            PLUS105_tree = 
            	            (AslTree)adaptor.create(PLUS105)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS105_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:157:27: MINUS ^
            	            {
            	            MINUS106=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr721); 
            	            MINUS106_tree = 
            	            (AslTree)adaptor.create(MINUS106)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS106_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr725);
            	    term107=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term107.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL109=null;
        Token DIV110=null;
        Token MOD111=null;
        AslParser.factor_return factor108 =null;

        AslParser.factor_return factor112 =null;


        AslTree MUL109_tree=null;
        AslTree DIV110_tree=null;
        AslTree MOD111_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:6: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:8: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term735);
            factor108=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor108.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:15: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==DIV||LA23_0==MOD||LA23_0==MUL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:17: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:17: ( MUL ^| DIV ^| MOD ^)
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
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:18: MUL ^
            	            {
            	            MUL109=(Token)match(input,MUL,FOLLOW_MUL_in_term740); 
            	            MUL109_tree = 
            	            (AslTree)adaptor.create(MUL109)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL109_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:25: DIV ^
            	            {
            	            DIV110=(Token)match(input,DIV,FOLLOW_DIV_in_term745); 
            	            DIV110_tree = 
            	            (AslTree)adaptor.create(DIV110)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV110_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:32: MOD ^
            	            {
            	            MOD111=(Token)match(input,MOD,FOLLOW_MOD_in_term750); 
            	            MOD111_tree = 
            	            (AslTree)adaptor.create(MOD111)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD111_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term754);
            	    factor112=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor112.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:161:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT113=null;
        Token PLUS114=null;
        Token MINUS115=null;
        AslParser.atom_return atom116 =null;


        AslTree NOT113_tree=null;
        AslTree PLUS114_tree=null;
        AslTree MINUS115_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:161:8: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:161:10: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:161:10: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:161:11: NOT ^
                    {
                    NOT113=(Token)match(input,NOT,FOLLOW_NOT_in_factor765); 
                    NOT113_tree = 
                    (AslTree)adaptor.create(NOT113)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT113_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:161:18: PLUS ^
                    {
                    PLUS114=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor770); 
                    PLUS114_tree = 
                    (AslTree)adaptor.create(PLUS114)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS114_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:161:26: MINUS ^
                    {
                    MINUS115=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor775); 
                    MINUS115_tree = 
                    (AslTree)adaptor.create(MINUS115)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS115_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor780);
            atom116=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom116.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:166:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| acces_attribute );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID117=null;
        Token INT118=null;
        Token char_literal120=null;
        Token char_literal122=null;
        AslParser.funcall_return funcall119 =null;

        AslParser.expr_return expr121 =null;

        AslParser.acces_attribute_return acces_attribute123 =null;


        AslTree b_tree=null;
        AslTree ID117_tree=null;
        AslTree INT118_tree=null;
        AslTree char_literal120_tree=null;
        AslTree char_literal122_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:166:6: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| acces_attribute )
            int alt26=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 70:
                    {
                    alt26=4;
                    }
                    break;
                case 73:
                    {
                    alt26=6;
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
                case 71:
                case 72:
                case 74:
                case 75:
                case 78:
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
            case FALSE:
            case TRUE:
                {
                alt26=3;
                }
                break;
            case 70:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:166:8: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID117=(Token)match(input,ID,FOLLOW_ID_in_atom791); 
                    ID117_tree = 
                    (AslTree)adaptor.create(ID117)
                    ;
                    adaptor.addChild(root_0, ID117_tree);


                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:167:3: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT118=(Token)match(input,INT,FOLLOW_INT_in_atom795); 
                    INT118_tree = 
                    (AslTree)adaptor.create(INT118)
                    ;
                    adaptor.addChild(root_0, INT118_tree);


                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:168:3: (b= TRUE |b= FALSE )
                    {
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:168:3: (b= TRUE |b= FALSE )
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
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:168:4: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom802);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:168:13: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom808);  
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
                    // 168:22: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:168:25: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:169:3: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom820);
                    funcall119=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall119.getTree());

                    }
                    break;
                case 5 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:170:3: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal120=(Token)match(input,70,FOLLOW_70_in_atom824); 

                    pushFollow(FOLLOW_expr_in_atom827);
                    expr121=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr121.getTree());

                    char_literal122=(Token)match(input,71,FOLLOW_71_in_atom829); 

                    }
                    break;
                case 6 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:171:3: acces_attribute
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_acces_attribute_in_atom834);
                    acces_attribute123=acces_attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, acces_attribute123.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:174:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID124=null;
        Token char_literal125=null;
        Token char_literal127=null;
        AslParser.expr_list_return expr_list126 =null;


        AslTree ID124_tree=null;
        AslTree char_literal125_tree=null;
        AslTree char_literal127_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:174:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:174:11: ID '(' ( expr_list )? ')'
            {
            ID124=(Token)match(input,ID,FOLLOW_ID_in_funcall843);  
            stream_ID.add(ID124);


            char_literal125=(Token)match(input,70,FOLLOW_70_in_funcall845);  
            stream_70.add(char_literal125);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:174:18: ( expr_list )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==FALSE||LA27_0==ID||LA27_0==INT||LA27_0==MINUS||LA27_0==NOT||LA27_0==PLUS||LA27_0==TRUE||LA27_0==70) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:174:18: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall847);
                    expr_list126=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list126.getTree());

                    }
                    break;

            }


            char_literal127=(Token)match(input,71,FOLLOW_71_in_funcall850);  
            stream_71.add(char_literal127);


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
            // 174:33: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:174:36: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:174:49: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:174:59: ( expr_list )?
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:177:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal129=null;
        AslParser.expr_return expr128 =null;

        AslParser.expr_return expr130 =null;


        AslTree char_literal129_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:177:10: ( expr ( ',' ! expr )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:177:12: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list873);
            expr128=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr128.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:177:17: ( ',' ! expr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==72) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:177:18: ',' ! expr
            	    {
            	    char_literal129=(Token)match(input,72,FOLLOW_72_in_expr_list876); 

            	    pushFollow(FOLLOW_expr_in_expr_list879);
            	    expr130=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr130.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:179:1: time_annotation : '@' BEGIN EQUAL expr ( ',' finish_time )? -> ^( TIMEANNOTATION expr ( finish_time )? ) ;
    public final AslParser.time_annotation_return time_annotation() throws RecognitionException {
        AslParser.time_annotation_return retval = new AslParser.time_annotation_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal131=null;
        Token BEGIN132=null;
        Token EQUAL133=null;
        Token char_literal135=null;
        AslParser.expr_return expr134 =null;

        AslParser.finish_time_return finish_time136 =null;


        AslTree char_literal131_tree=null;
        AslTree BEGIN132_tree=null;
        AslTree EQUAL133_tree=null;
        AslTree char_literal135_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_finish_time=new RewriteRuleSubtreeStream(adaptor,"rule finish_time");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:179:16: ( '@' BEGIN EQUAL expr ( ',' finish_time )? -> ^( TIMEANNOTATION expr ( finish_time )? ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:180:1: '@' BEGIN EQUAL expr ( ',' finish_time )?
            {
            char_literal131=(Token)match(input,76,FOLLOW_76_in_time_annotation888);  
            stream_76.add(char_literal131);


            BEGIN132=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_time_annotation890);  
            stream_BEGIN.add(BEGIN132);


            EQUAL133=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_time_annotation892);  
            stream_EQUAL.add(EQUAL133);


            pushFollow(FOLLOW_expr_in_time_annotation894);
            expr134=expr();

            state._fsp--;

            stream_expr.add(expr134.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:180:22: ( ',' finish_time )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==72) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:180:23: ',' finish_time
                    {
                    char_literal135=(Token)match(input,72,FOLLOW_72_in_time_annotation897);  
                    stream_72.add(char_literal135);


                    pushFollow(FOLLOW_finish_time_in_time_annotation899);
                    finish_time136=finish_time();

                    state._fsp--;

                    stream_finish_time.add(finish_time136.getTree());

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
            // 180:41: -> ^( TIMEANNOTATION expr ( finish_time )? )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:180:44: ^( TIMEANNOTATION expr ( finish_time )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(TIMEANNOTATION, "TIMEANNOTATION")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:180:66: ( finish_time )?
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:182:1: finish_time : ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr ) ;
    public final AslParser.finish_time_return finish_time() throws RecognitionException {
        AslParser.finish_time_return retval = new AslParser.finish_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token END137=null;
        Token EQUAL138=null;
        Token DURATION140=null;
        Token EQUAL141=null;
        AslParser.expr_return expr139 =null;

        AslParser.expr_return expr142 =null;


        AslTree END137_tree=null;
        AslTree EQUAL138_tree=null;
        AslTree DURATION140_tree=null;
        AslTree EQUAL141_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:182:12: ( ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:183:2: ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr )
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:183:2: ( END ^ EQUAL ! expr | DURATION ^ EQUAL ! expr )
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
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:183:2: END ^ EQUAL ! expr
                    {
                    END137=(Token)match(input,END,FOLLOW_END_in_finish_time920); 
                    END137_tree = 
                    (AslTree)adaptor.create(END137)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(END137_tree, root_0);


                    EQUAL138=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_finish_time923); 

                    pushFollow(FOLLOW_expr_in_finish_time926);
                    expr139=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr139.getTree());

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:183:21: DURATION ^ EQUAL ! expr
                    {
                    DURATION140=(Token)match(input,DURATION,FOLLOW_DURATION_in_finish_time930); 
                    DURATION140_tree = 
                    (AslTree)adaptor.create(DURATION140)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(DURATION140_tree, root_0);


                    EQUAL141=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_finish_time933); 

                    pushFollow(FOLLOW_expr_in_finish_time936);
                    expr142=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr142.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:1: create : CREATE TYPE_OBJECT ( coordenades )? ( list_attributes )? -> ^( CREATE_INSTR TYPE_OBJECT ( coordenades )? ( ^( ATTRIBUTES list_attributes ) )? ) ;
    public final AslParser.create_return create() throws RecognitionException {
        AslParser.create_return retval = new AslParser.create_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token CREATE143=null;
        Token TYPE_OBJECT144=null;
        AslParser.coordenades_return coordenades145 =null;

        AslParser.list_attributes_return list_attributes146 =null;


        AslTree CREATE143_tree=null;
        AslTree TYPE_OBJECT144_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_TYPE_OBJECT=new RewriteRuleTokenStream(adaptor,"token TYPE_OBJECT");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        RewriteRuleSubtreeStream stream_list_attributes=new RewriteRuleSubtreeStream(adaptor,"rule list_attributes");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:7: ( CREATE TYPE_OBJECT ( coordenades )? ( list_attributes )? -> ^( CREATE_INSTR TYPE_OBJECT ( coordenades )? ( ^( ATTRIBUTES list_attributes ) )? ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:9: CREATE TYPE_OBJECT ( coordenades )? ( list_attributes )?
            {
            CREATE143=(Token)match(input,CREATE,FOLLOW_CREATE_in_create944);  
            stream_CREATE.add(CREATE143);


            TYPE_OBJECT144=(Token)match(input,TYPE_OBJECT,FOLLOW_TYPE_OBJECT_in_create946);  
            stream_TYPE_OBJECT.add(TYPE_OBJECT144);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:28: ( coordenades )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==77) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:28: coordenades
                    {
                    pushFollow(FOLLOW_coordenades_in_create948);
                    coordenades145=coordenades();

                    state._fsp--;

                    stream_coordenades.add(coordenades145.getTree());

                    }
                    break;

            }


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:41: ( list_attributes )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ATTRIBUTE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:41: list_attributes
                    {
                    pushFollow(FOLLOW_list_attributes_in_create951);
                    list_attributes146=list_attributes();

                    state._fsp--;

                    stream_list_attributes.add(list_attributes146.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: TYPE_OBJECT, list_attributes, coordenades
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 185:58: -> ^( CREATE_INSTR TYPE_OBJECT ( coordenades )? ( ^( ATTRIBUTES list_attributes ) )? )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:61: ^( CREATE_INSTR TYPE_OBJECT ( coordenades )? ( ^( ATTRIBUTES list_attributes ) )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(CREATE_INSTR, "CREATE_INSTR")
                , root_1);

                adaptor.addChild(root_1, 
                stream_TYPE_OBJECT.nextNode()
                );

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:88: ( coordenades )?
                if ( stream_coordenades.hasNext() ) {
                    adaptor.addChild(root_1, stream_coordenades.nextTree());

                }
                stream_coordenades.reset();

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:101: ( ^( ATTRIBUTES list_attributes ) )?
                if ( stream_list_attributes.hasNext() ) {
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:101: ^( ATTRIBUTES list_attributes )
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


    public static class group_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "group"
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:188:1: group : GROUP ^ ID ( ',' ! ID )+ ;
    public final AslParser.group_return group() throws RecognitionException {
        AslParser.group_return retval = new AslParser.group_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token GROUP147=null;
        Token ID148=null;
        Token char_literal149=null;
        Token ID150=null;

        AslTree GROUP147_tree=null;
        AslTree ID148_tree=null;
        AslTree char_literal149_tree=null;
        AslTree ID150_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:188:6: ( GROUP ^ ID ( ',' ! ID )+ )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:188:8: GROUP ^ ID ( ',' ! ID )+
            {
            root_0 = (AslTree)adaptor.nil();


            GROUP147=(Token)match(input,GROUP,FOLLOW_GROUP_in_group978); 
            GROUP147_tree = 
            (AslTree)adaptor.create(GROUP147)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(GROUP147_tree, root_0);


            ID148=(Token)match(input,ID,FOLLOW_ID_in_group981); 
            ID148_tree = 
            (AslTree)adaptor.create(ID148)
            ;
            adaptor.addChild(root_0, ID148_tree);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:188:18: ( ',' ! ID )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==72) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:188:19: ',' ! ID
            	    {
            	    char_literal149=(Token)match(input,72,FOLLOW_72_in_group984); 

            	    ID150=(Token)match(input,ID,FOLLOW_ID_in_group987); 
            	    ID150_tree = 
            	    (AslTree)adaptor.create(ID150)
            	    ;
            	    adaptor.addChild(root_0, ID150_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:190:1: destroy : DESTROY ID -> ^( ANIMATION DESTROY ID ) ;
    public final AslParser.destroy_return destroy() throws RecognitionException {
        AslParser.destroy_return retval = new AslParser.destroy_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DESTROY151=null;
        Token ID152=null;

        AslTree DESTROY151_tree=null;
        AslTree ID152_tree=null;
        RewriteRuleTokenStream stream_DESTROY=new RewriteRuleTokenStream(adaptor,"token DESTROY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:190:8: ( DESTROY ID -> ^( ANIMATION DESTROY ID ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:190:10: DESTROY ID
            {
            DESTROY151=(Token)match(input,DESTROY,FOLLOW_DESTROY_in_destroy996);  
            stream_DESTROY.add(DESTROY151);


            ID152=(Token)match(input,ID,FOLLOW_ID_in_destroy998);  
            stream_ID.add(ID152);


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
            // 190:21: -> ^( ANIMATION DESTROY ID )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:190:24: ^( ANIMATION DESTROY ID )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:192:1: move : MOVE ID coordenades -> ^( ANIMATION MOVE ID coordenades ) ;
    public final AslParser.move_return move() throws RecognitionException {
        AslParser.move_return retval = new AslParser.move_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVE153=null;
        Token ID154=null;
        AslParser.coordenades_return coordenades155 =null;


        AslTree MOVE153_tree=null;
        AslTree ID154_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MOVE=new RewriteRuleTokenStream(adaptor,"token MOVE");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:192:5: ( MOVE ID coordenades -> ^( ANIMATION MOVE ID coordenades ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:192:9: MOVE ID coordenades
            {
            MOVE153=(Token)match(input,MOVE,FOLLOW_MOVE_in_move1017);  
            stream_MOVE.add(MOVE153);


            ID154=(Token)match(input,ID,FOLLOW_ID_in_move1019);  
            stream_ID.add(ID154);


            pushFollow(FOLLOW_coordenades_in_move1021);
            coordenades155=coordenades();

            state._fsp--;

            stream_coordenades.add(coordenades155.getTree());

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
            // 192:29: -> ^( ANIMATION MOVE ID coordenades )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:192:32: ^( ANIMATION MOVE ID coordenades )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:194:1: translate : TRANSLATE ID coordenades -> ^( ANIMATION TRANSLATE ID coordenades ) ;
    public final AslParser.translate_return translate() throws RecognitionException {
        AslParser.translate_return retval = new AslParser.translate_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TRANSLATE156=null;
        Token ID157=null;
        AslParser.coordenades_return coordenades158 =null;


        AslTree TRANSLATE156_tree=null;
        AslTree ID157_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TRANSLATE=new RewriteRuleTokenStream(adaptor,"token TRANSLATE");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:194:10: ( TRANSLATE ID coordenades -> ^( ANIMATION TRANSLATE ID coordenades ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:194:13: TRANSLATE ID coordenades
            {
            TRANSLATE156=(Token)match(input,TRANSLATE,FOLLOW_TRANSLATE_in_translate1041);  
            stream_TRANSLATE.add(TRANSLATE156);


            ID157=(Token)match(input,ID,FOLLOW_ID_in_translate1043);  
            stream_ID.add(ID157);


            pushFollow(FOLLOW_coordenades_in_translate1045);
            coordenades158=coordenades();

            state._fsp--;

            stream_coordenades.add(coordenades158.getTree());

            // AST REWRITE
            // elements: ID, coordenades, TRANSLATE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 194:38: -> ^( ANIMATION TRANSLATE ID coordenades )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:194:41: ^( ANIMATION TRANSLATE ID coordenades )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:196:1: modify : MODIFY ID list_attributes -> ^( ANIMATION MODIFY ID list_attributes ) ;
    public final AslParser.modify_return modify() throws RecognitionException {
        AslParser.modify_return retval = new AslParser.modify_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODIFY159=null;
        Token ID160=null;
        AslParser.list_attributes_return list_attributes161 =null;


        AslTree MODIFY159_tree=null;
        AslTree ID160_tree=null;
        RewriteRuleTokenStream stream_MODIFY=new RewriteRuleTokenStream(adaptor,"token MODIFY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_list_attributes=new RewriteRuleSubtreeStream(adaptor,"rule list_attributes");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:196:7: ( MODIFY ID list_attributes -> ^( ANIMATION MODIFY ID list_attributes ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:196:9: MODIFY ID list_attributes
            {
            MODIFY159=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_modify1064);  
            stream_MODIFY.add(MODIFY159);


            ID160=(Token)match(input,ID,FOLLOW_ID_in_modify1066);  
            stream_ID.add(ID160);


            pushFollow(FOLLOW_list_attributes_in_modify1068);
            list_attributes161=list_attributes();

            state._fsp--;

            stream_list_attributes.add(list_attributes161.getTree());

            // AST REWRITE
            // elements: MODIFY, list_attributes, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 196:35: -> ^( ANIMATION MODIFY ID list_attributes )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:196:38: ^( ANIMATION MODIFY ID list_attributes )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:198:1: rotate : ROTATE ID expr -> ^( ANIMATION ROTATE ID expr ) ;
    public final AslParser.rotate_return rotate() throws RecognitionException {
        AslParser.rotate_return retval = new AslParser.rotate_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ROTATE162=null;
        Token ID163=null;
        AslParser.expr_return expr164 =null;


        AslTree ROTATE162_tree=null;
        AslTree ID163_tree=null;
        RewriteRuleTokenStream stream_ROTATE=new RewriteRuleTokenStream(adaptor,"token ROTATE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:198:7: ( ROTATE ID expr -> ^( ANIMATION ROTATE ID expr ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:198:9: ROTATE ID expr
            {
            ROTATE162=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_rotate1087);  
            stream_ROTATE.add(ROTATE162);


            ID163=(Token)match(input,ID,FOLLOW_ID_in_rotate1089);  
            stream_ID.add(ID163);


            pushFollow(FOLLOW_expr_in_rotate1091);
            expr164=expr();

            state._fsp--;

            stream_expr.add(expr164.getTree());

            // AST REWRITE
            // elements: ROTATE, expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 198:24: -> ^( ANIMATION ROTATE ID expr )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:198:27: ^( ANIMATION ROTATE ID expr )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:200:1: list_attributes : attribute ( ',' ! attribute )* ;
    public final AslParser.list_attributes_return list_attributes() throws RecognitionException {
        AslParser.list_attributes_return retval = new AslParser.list_attributes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal166=null;
        AslParser.attribute_return attribute165 =null;

        AslParser.attribute_return attribute167 =null;


        AslTree char_literal166_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:200:16: ( attribute ( ',' ! attribute )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:200:18: attribute ( ',' ! attribute )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_attribute_in_list_attributes1110);
            attribute165=attribute();

            state._fsp--;

            adaptor.addChild(root_0, attribute165.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:200:28: ( ',' ! attribute )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==72) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:200:29: ',' ! attribute
            	    {
            	    char_literal166=(Token)match(input,72,FOLLOW_72_in_list_attributes1113); 

            	    pushFollow(FOLLOW_attribute_in_list_attributes1116);
            	    attribute167=attribute();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribute167.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:202:1: attribute : ATTRIBUTE ^ EQUAL ! expr ;
    public final AslParser.attribute_return attribute() throws RecognitionException {
        AslParser.attribute_return retval = new AslParser.attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ATTRIBUTE168=null;
        Token EQUAL169=null;
        AslParser.expr_return expr170 =null;


        AslTree ATTRIBUTE168_tree=null;
        AslTree EQUAL169_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:202:10: ( ATTRIBUTE ^ EQUAL ! expr )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:202:12: ATTRIBUTE ^ EQUAL ! expr
            {
            root_0 = (AslTree)adaptor.nil();


            ATTRIBUTE168=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute1125); 
            ATTRIBUTE168_tree = 
            (AslTree)adaptor.create(ATTRIBUTE168)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(ATTRIBUTE168_tree, root_0);


            EQUAL169=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_attribute1128); 

            pushFollow(FOLLOW_expr_in_attribute1131);
            expr170=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr170.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:204:1: coordenades : '{' ! expr ',' ! expr '}' !;
    public final AslParser.coordenades_return coordenades() throws RecognitionException {
        AslParser.coordenades_return retval = new AslParser.coordenades_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal171=null;
        Token char_literal173=null;
        Token char_literal175=null;
        AslParser.expr_return expr172 =null;

        AslParser.expr_return expr174 =null;


        AslTree char_literal171_tree=null;
        AslTree char_literal173_tree=null;
        AslTree char_literal175_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:204:12: ( '{' ! expr ',' ! expr '}' !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:204:14: '{' ! expr ',' ! expr '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            char_literal171=(Token)match(input,77,FOLLOW_77_in_coordenades1138); 

            pushFollow(FOLLOW_expr_in_coordenades1141);
            expr172=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr172.getTree());

            char_literal173=(Token)match(input,72,FOLLOW_72_in_coordenades1143); 

            pushFollow(FOLLOW_expr_in_coordenades1146);
            expr174=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr174.getTree());

            char_literal175=(Token)match(input,78,FOLLOW_78_in_coordenades1148); 

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:206:1: acces_attribute : ID '.' att '(' ')' -> ^( ACCESATTRIBUTE ID att ) ;
    public final AslParser.acces_attribute_return acces_attribute() throws RecognitionException {
        AslParser.acces_attribute_return retval = new AslParser.acces_attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID176=null;
        Token char_literal177=null;
        Token char_literal179=null;
        Token char_literal180=null;
        AslParser.att_return att178 =null;


        AslTree ID176_tree=null;
        AslTree char_literal177_tree=null;
        AslTree char_literal179_tree=null;
        AslTree char_literal180_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_att=new RewriteRuleSubtreeStream(adaptor,"rule att");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:206:16: ( ID '.' att '(' ')' -> ^( ACCESATTRIBUTE ID att ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:206:18: ID '.' att '(' ')'
            {
            ID176=(Token)match(input,ID,FOLLOW_ID_in_acces_attribute1156);  
            stream_ID.add(ID176);


            char_literal177=(Token)match(input,73,FOLLOW_73_in_acces_attribute1158);  
            stream_73.add(char_literal177);


            pushFollow(FOLLOW_att_in_acces_attribute1160);
            att178=att();

            state._fsp--;

            stream_att.add(att178.getTree());

            char_literal179=(Token)match(input,70,FOLLOW_70_in_acces_attribute1162);  
            stream_70.add(char_literal179);


            char_literal180=(Token)match(input,71,FOLLOW_71_in_acces_attribute1164);  
            stream_71.add(char_literal180);


            // AST REWRITE
            // elements: att, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 206:37: -> ^( ACCESATTRIBUTE ID att )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:206:40: ^( ACCESATTRIBUTE ID att )
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:209:1: att : ( ATTRIBUTE | BEGIN | END | DURATION );
    public final AslParser.att_return att() throws RecognitionException {
        AslParser.att_return retval = new AslParser.att_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set181=null;

        AslTree set181_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:209:4: ( ATTRIBUTE | BEGIN | END | DURATION )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set181=(Token)input.LT(1);

            if ( input.LA(1)==ATTRIBUTE||input.LA(1)==BEGIN||input.LA(1)==DURATION||input.LA(1)==END ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set181)
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


 

    public static final BitSet FOLLOW_imports_in_prog103 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_list_func_in_prog106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_def_in_prog125 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_imports_in_prog127 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_list_func_in_prog130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module_def152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_module_def155 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ID_in_module_def158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_module_def160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_module_def163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_imports174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_imports177 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ID_in_imports180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_imports182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_imports185 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_func_in_list_func197 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_EOF_in_list_func200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func219 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ID_in_func222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_params_in_func224 = new BitSet(new long[]{0x9802803440028000L,0x0000000000001804L});
    public static final BitSet FOLLOW_block_instructions_in_func226 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_params239 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_paramlist_in_params241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_params244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist261 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_paramlist264 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_param_in_paramlist267 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_param281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_block_instructions302 = new BitSet(new long[]{0x9802803440028000L,0x0000000000001804L});
    public static final BitSet FOLLOW_instruction_in_block_instructions304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_assign_in_instruction326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_instruction_in_instruction331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_annotation_in_instruction361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign377 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EQUAL_in_assign381 = new BitSet(new long[]{0x9002800400028000L});
    public static final BitSet FOLLOW_basic_instruction_in_assign383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign399 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EQUAL_in_assign403 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_assign405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_basic_instruction424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_in_basic_instruction428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destroy_in_basic_instruction432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_basic_instruction436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translate_in_basic_instruction440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_in_basic_instruction444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rotate_in_basic_instruction448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ite_stmt461 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_ite_stmt464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ite_stmt466 = new BitSet(new long[]{0x9802803440028000L,0x0000000000001804L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt469 = new BitSet(new long[]{0x0000000002300000L});
    public static final BitSet FOLLOW_elseif_stmt_in_ite_stmt471 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_else_stmt_in_ite_stmt473 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseif_stmt485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_elseif_stmt488 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_elseif_stmt493 = new BitSet(new long[]{0x9802803440028000L,0x0000000000001804L});
    public static final BitSet FOLLOW_block_instructions_in_elseif_stmt496 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt507 = new BitSet(new long[]{0x9802803440028000L,0x0000000000001804L});
    public static final BitSet FOLLOW_block_instructions_in_else_stmt510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_while_stmt528 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_while_stmt531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_while_stmt533 = new BitSet(new long[]{0x9802803440028000L,0x0000000000001804L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt536 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_for_stmt552 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_for_form_in_for_stmt555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_for_stmt557 = new BitSet(new long[]{0x9802803440028000L,0x0000000000001804L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt560 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ENDFOR_in_for_stmt562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_for_form572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_for_form574 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_for_form577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_for_form579 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_assign_in_for_form582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_for_form592 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IN_in_for_form594 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_for_form597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_for_form599 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_for_form602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt619 = new BitSet(new long[]{0x0088211020000002L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_return_stmt622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr639 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_OR_in_expr642 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_boolterm_in_expr645 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm654 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm657 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_boolfact_in_boolterm660 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact669 = new BitSet(new long[]{0x0010120A00004002L});
    public static final BitSet FOLLOW_COND_EQUAL_in_boolfact673 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact678 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_LT_in_boolfact683 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_LE_in_boolfact688 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_GT_in_boolfact693 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_GE_in_boolfact698 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_num_expr_in_boolfact702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr711 = new BitSet(new long[]{0x0080200000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr716 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_MINUS_in_num_expr721 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_term_in_num_expr725 = new BitSet(new long[]{0x0080200000000002L});
    public static final BitSet FOLLOW_factor_in_term735 = new BitSet(new long[]{0x0004400000040002L});
    public static final BitSet FOLLOW_MUL_in_term740 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_DIV_in_term745 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_MOD_in_term750 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_factor_in_term754 = new BitSet(new long[]{0x0004400000040002L});
    public static final BitSet FOLLOW_NOT_in_factor765 = new BitSet(new long[]{0x0000011020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_PLUS_in_factor770 = new BitSet(new long[]{0x0000011020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_MINUS_in_factor775 = new BitSet(new long[]{0x0000011020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_atom_in_factor780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_atom824 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_atom827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_atom829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_acces_attribute_in_atom834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_funcall845 = new BitSet(new long[]{0x0088211020000000L,0x00000000000000C1L});
    public static final BitSet FOLLOW_expr_list_in_funcall847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_funcall850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list873 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_expr_list876 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_expr_list879 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_76_in_time_annotation888 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BEGIN_in_time_annotation890 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EQUAL_in_time_annotation892 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_time_annotation894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_time_annotation897 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_finish_time_in_time_annotation899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_finish_time920 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EQUAL_in_finish_time923 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_finish_time926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_finish_time930 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EQUAL_in_finish_time933 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_finish_time936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_OBJECT_in_create946 = new BitSet(new long[]{0x0000000000000202L,0x0000000000002000L});
    public static final BitSet FOLLOW_coordenades_in_create948 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_list_attributes_in_create951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_group978 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ID_in_group981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_group984 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ID_in_group987 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_DESTROY_in_destroy996 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ID_in_destroy998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move1017 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ID_in_move1019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_coordenades_in_move1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSLATE_in_translate1041 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ID_in_translate1043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_coordenades_in_translate1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_in_modify1064 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ID_in_modify1066 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_list_attributes_in_modify1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_rotate1087 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ID_in_rotate1089 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_rotate1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1110 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_list_attributes1113 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1116 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute1125 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EQUAL_in_attribute1128 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_attribute1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_coordenades1138 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_coordenades1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_coordenades1143 = new BitSet(new long[]{0x0088211020000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_expr_in_coordenades1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_coordenades1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_acces_attribute1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_acces_attribute1158 = new BitSet(new long[]{0x0000000000480A00L});
    public static final BitSet FOLLOW_att_in_acces_attribute1160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_acces_attribute1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_acces_attribute1164 = new BitSet(new long[]{0x0000000000000002L});

}