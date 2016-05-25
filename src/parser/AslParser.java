// $ANTLR 3.4 /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g 2016-05-25 22:48:31

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESATTRIBUTE", "AND", "ANIMATION", "ARGLIST", "ASSIGN", "ATTRIBUTE", "ATTRIBUTES", "BEGIN", "BOOLEAN", "COMMENT", "COND_EQUAL", "CREATE", "DESTROY", "DIV", "DURATION", "ELSE", "ELSEIF", "END", "ENDFOR", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FOR", "FUNC", "FUNCALL", "GE", "GROUP", "GT", "ID", "IF", "IMPORT", "IN", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MODIFY", "MODULE", "MOVE", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PROG", "READ", "RETURN", "ROTATE", "STRING", "TIMEANNOTATION", "TRANSLATE", "TRUE", "TYPE_OBJECT", "WHILE", "WRITE", "WS", "'('", "')'", "','", "'.'", "'.sam'", "':'", "';'", "'@'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
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
    public static final int DESTROY=16;
    public static final int DIV=17;
    public static final int DURATION=18;
    public static final int ELSE=19;
    public static final int ELSEIF=20;
    public static final int END=21;
    public static final int ENDFOR=22;
    public static final int ENDFUNC=23;
    public static final int ENDIF=24;
    public static final int ENDWHILE=25;
    public static final int EQUAL=26;
    public static final int ESC_SEQ=27;
    public static final int FALSE=28;
    public static final int FOR=29;
    public static final int FUNC=30;
    public static final int FUNCALL=31;
    public static final int GE=32;
    public static final int GROUP=33;
    public static final int GT=34;
    public static final int ID=35;
    public static final int IF=36;
    public static final int IMPORT=37;
    public static final int IN=38;
    public static final int INT=39;
    public static final int LE=40;
    public static final int LIST_FUNCTIONS=41;
    public static final int LIST_INSTR=42;
    public static final int LT=43;
    public static final int MINUS=44;
    public static final int MOD=45;
    public static final int MODIFY=46;
    public static final int MODULE=47;
    public static final int MOVE=48;
    public static final int MUL=49;
    public static final int NOT=50;
    public static final int NOT_EQUAL=51;
    public static final int OR=52;
    public static final int PARAMS=53;
    public static final int PLUS=54;
    public static final int PREF=55;
    public static final int PROG=56;
    public static final int READ=57;
    public static final int RETURN=58;
    public static final int ROTATE=59;
    public static final int STRING=60;
    public static final int TIMEANNOTATION=61;
    public static final int TRANSLATE=62;
    public static final int TRUE=63;
    public static final int TYPE_OBJECT=64;
    public static final int WHILE=65;
    public static final int WRITE=66;
    public static final int WS=67;

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
                            pushFollow(FOLLOW_imports_in_prog101);
                            imports1=imports();

                            state._fsp--;

                            stream_imports.add(imports1.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_list_func_in_prog104);
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
                    pushFollow(FOLLOW_module_def_in_prog123);
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
                            pushFollow(FOLLOW_imports_in_prog125);
                            imports4=imports();

                            state._fsp--;

                            stream_imports.add(imports4.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_list_func_in_prog128);
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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:66:1: module_def : MODULE ^ ID ';' !;
    public final AslParser.module_def_return module_def() throws RecognitionException {
        AslParser.module_def_return retval = new AslParser.module_def_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODULE6=null;
        Token ID7=null;
        Token char_literal8=null;

        AslTree MODULE6_tree=null;
        AslTree ID7_tree=null;
        AslTree char_literal8_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:66:12: ( MODULE ^ ID ';' !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:66:14: MODULE ^ ID ';' !
            {
            root_0 = (AslTree)adaptor.nil();


            MODULE6=(Token)match(input,MODULE,FOLLOW_MODULE_in_module_def150); 
            MODULE6_tree = 
            (AslTree)adaptor.create(MODULE6)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODULE6_tree, root_0);


            ID7=(Token)match(input,ID,FOLLOW_ID_in_module_def153); 
            ID7_tree = 
            (AslTree)adaptor.create(ID7)
            ;
            adaptor.addChild(root_0, ID7_tree);


            char_literal8=(Token)match(input,74,FOLLOW_74_in_module_def155); 

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:69:1: imports : ( IMPORT ^ ID '.sam' ! ';' !)+ ;
    public final AslParser.imports_return imports() throws RecognitionException {
        AslParser.imports_return retval = new AslParser.imports_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IMPORT9=null;
        Token ID10=null;
        Token string_literal11=null;
        Token char_literal12=null;

        AslTree IMPORT9_tree=null;
        AslTree ID10_tree=null;
        AslTree string_literal11_tree=null;
        AslTree char_literal12_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:69:9: ( ( IMPORT ^ ID '.sam' ! ';' !)+ )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:69:11: ( IMPORT ^ ID '.sam' ! ';' !)+
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:69:11: ( IMPORT ^ ID '.sam' ! ';' !)+
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
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:69:12: IMPORT ^ ID '.sam' ! ';' !
            	    {
            	    IMPORT9=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_imports166); 
            	    IMPORT9_tree = 
            	    (AslTree)adaptor.create(IMPORT9)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(IMPORT9_tree, root_0);


            	    ID10=(Token)match(input,ID,FOLLOW_ID_in_imports169); 
            	    ID10_tree = 
            	    (AslTree)adaptor.create(ID10)
            	    ;
            	    adaptor.addChild(root_0, ID10_tree);


            	    string_literal11=(Token)match(input,72,FOLLOW_72_in_imports171); 

            	    char_literal12=(Token)match(input,74,FOLLOW_74_in_imports174); 

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

        Token EOF14=null;
        AslParser.func_return func13 =null;


        AslTree EOF14_tree=null;
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
            	    pushFollow(FOLLOW_func_in_list_func186);
            	    func13=func();

            	    state._fsp--;

            	    stream_func.add(func13.getTree());

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


            EOF14=(Token)match(input,EOF,FOLLOW_EOF_in_list_func189);  
            stream_EOF.add(EOF14);


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
            // 72:22: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:72:25: ^( LIST_FUNCTIONS ( func )+ )
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

        Token FUNC15=null;
        Token ID16=null;
        Token ENDFUNC19=null;
        AslParser.params_return params17 =null;

        AslParser.block_instructions_return block_instructions18 =null;


        AslTree FUNC15_tree=null;
        AslTree ID16_tree=null;
        AslTree ENDFUNC19_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:76:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:76:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC15=(Token)match(input,FUNC,FOLLOW_FUNC_in_func207); 
            FUNC15_tree = 
            (AslTree)adaptor.create(FUNC15)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC15_tree, root_0);


            ID16=(Token)match(input,ID,FOLLOW_ID_in_func210); 
            ID16_tree = 
            (AslTree)adaptor.create(ID16)
            ;
            adaptor.addChild(root_0, ID16_tree);


            pushFollow(FOLLOW_params_in_func212);
            params17=params();

            state._fsp--;

            adaptor.addChild(root_0, params17.getTree());

            pushFollow(FOLLOW_block_instructions_in_func214);
            block_instructions18=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions18.getTree());

            ENDFUNC19=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func216); 

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

        Token char_literal20=null;
        Token char_literal22=null;
        AslParser.paramlist_return paramlist21 =null;


        AslTree char_literal20_tree=null;
        AslTree char_literal22_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:79:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:79:10: '(' ( paramlist )? ')'
            {
            char_literal20=(Token)match(input,68,FOLLOW_68_in_params227);  
            stream_68.add(char_literal20);


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
                    pushFollow(FOLLOW_paramlist_in_params229);
                    paramlist21=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist21.getTree());

                    }
                    break;

            }


            char_literal22=(Token)match(input,69,FOLLOW_69_in_params232);  
            stream_69.add(char_literal22);


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

        Token char_literal24=null;
        AslParser.param_return param23 =null;

        AslParser.param_return param25 =null;


        AslTree char_literal24_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:82:10: ( param ( ',' ! param )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:82:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist249);
            param23=param();

            state._fsp--;

            adaptor.addChild(root_0, param23.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:82:18: ( ',' ! param )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==70) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:82:19: ',' ! param
            	    {
            	    char_literal24=(Token)match(input,70,FOLLOW_70_in_paramlist252); 

            	    pushFollow(FOLLOW_param_in_paramlist255);
            	    param25=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param25.getTree());

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
            id=(Token)match(input,ID,FOLLOW_ID_in_param269);  
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

        Token char_literal27=null;
        AslParser.instruction_return instruction26 =null;

        AslParser.instruction_return instruction28 =null;


        AslTree char_literal27_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:90:5: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:90:5: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions287);
            instruction26=instruction();

            state._fsp--;

            stream_instruction.add(instruction26.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:90:17: ( ';' instruction )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==74) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:90:18: ';' instruction
            	    {
            	    char_literal27=(Token)match(input,74,FOLLOW_74_in_block_instructions290);  
            	    stream_74.add(char_literal27);


            	    pushFollow(FOLLOW_instruction_in_block_instructions292);
            	    instruction28=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction28.getTree());

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

        AslParser.assign_return assign29 =null;

        AslParser.basic_instruction_return basic_instruction30 =null;

        AslParser.ite_stmt_return ite_stmt31 =null;

        AslParser.while_stmt_return while_stmt32 =null;

        AslParser.for_stmt_return for_stmt33 =null;

        AslParser.funcall_return funcall34 =null;

        AslParser.return_stmt_return return_stmt35 =null;

        AslParser.time_annotation_return time_annotation36 =null;



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
                else if ( (LA9_1==68) ) {
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
            case 75:
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
            case 74:
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


                    pushFollow(FOLLOW_assign_in_instruction314);
                    assign29=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign29.getTree());

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:96:3: basic_instruction
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_basic_instruction_in_instruction319);
                    basic_instruction30=basic_instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_instruction30.getTree());

                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:97:3: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction324);
                    ite_stmt31=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt31.getTree());

                    }
                    break;
                case 4 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:98:3: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction329);
                    while_stmt32=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt32.getTree());

                    }
                    break;
                case 5 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:99:3: for_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction334);
                    for_stmt33=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt33.getTree());

                    }
                    break;
                case 6 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:100:3: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction339);
                    funcall34=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall34.getTree());

                    }
                    break;
                case 7 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:101:3: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction344);
                    return_stmt35=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt35.getTree());

                    }
                    break;
                case 8 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:102:3: time_annotation
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_time_annotation_in_instruction349);
                    time_annotation36=time_annotation();

                    state._fsp--;

                    adaptor.addChild(root_0, time_annotation36.getTree());

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
        Token ID37=null;
        Token ID39=null;
        AslParser.basic_instruction_return basic_instruction38 =null;

        AslParser.expr_return expr40 =null;


        AslTree eq_tree=null;
        AslTree ID37_tree=null;
        AslTree ID39_tree=null;
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

                    if ( ((LA10_2 >= CREATE && LA10_2 <= DESTROY)||LA10_2==GROUP||LA10_2==MODIFY||LA10_2==MOVE||LA10_2==ROTATE||LA10_2==TRANSLATE) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==FALSE||LA10_2==ID||LA10_2==INT||LA10_2==MINUS||LA10_2==NOT||LA10_2==PLUS||LA10_2==TRUE||LA10_2==68) ) {
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
                    ID37=(Token)match(input,ID,FOLLOW_ID_in_assign365);  
                    stream_ID.add(ID37);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign369);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_basic_instruction_in_assign371);
                    basic_instruction38=basic_instruction();

                    state._fsp--;

                    stream_basic_instruction.add(basic_instruction38.getTree());

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
                    ID39=(Token)match(input,ID,FOLLOW_ID_in_assign387);  
                    stream_ID.add(ID39);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign391);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign393);
                    expr40=expr();

                    state._fsp--;

                    stream_expr.add(expr40.getTree());

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

        AslParser.create_return create41 =null;

        AslParser.group_return group42 =null;

        AslParser.destroy_return destroy43 =null;

        AslParser.move_return move44 =null;

        AslParser.translate_return translate45 =null;

        AslParser.modify_return modify46 =null;

        AslParser.rotate_return rotate47 =null;



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


                    pushFollow(FOLLOW_create_in_basic_instruction412);
                    create41=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create41.getTree());

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:111:3: group
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_group_in_basic_instruction416);
                    group42=group();

                    state._fsp--;

                    adaptor.addChild(root_0, group42.getTree());

                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:112:3: destroy
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_destroy_in_basic_instruction420);
                    destroy43=destroy();

                    state._fsp--;

                    adaptor.addChild(root_0, destroy43.getTree());

                    }
                    break;
                case 4 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:113:3: move
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_in_basic_instruction424);
                    move44=move();

                    state._fsp--;

                    adaptor.addChild(root_0, move44.getTree());

                    }
                    break;
                case 5 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:114:3: translate
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_translate_in_basic_instruction428);
                    translate45=translate();

                    state._fsp--;

                    adaptor.addChild(root_0, translate45.getTree());

                    }
                    break;
                case 6 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:115:3: modify
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_in_basic_instruction432);
                    modify46=modify();

                    state._fsp--;

                    adaptor.addChild(root_0, modify46.getTree());

                    }
                    break;
                case 7 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:116:3: rotate
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_rotate_in_basic_instruction436);
                    rotate47=rotate();

                    state._fsp--;

                    adaptor.addChild(root_0, rotate47.getTree());

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

        Token IF48=null;
        Token char_literal49=null;
        Token char_literal51=null;
        Token ENDIF55=null;
        AslParser.expr_return expr50 =null;

        AslParser.block_instructions_return block_instructions52 =null;

        AslParser.elseif_stmt_return elseif_stmt53 =null;

        AslParser.else_stmt_return else_stmt54 =null;


        AslTree IF48_tree=null;
        AslTree char_literal49_tree=null;
        AslTree char_literal51_tree=null;
        AslTree ENDIF55_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:119:10: ( IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:119:13: IF ^ '(' ! expr ')' ! block_instructions elseif_stmt else_stmt ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF48=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt446); 
            IF48_tree = 
            (AslTree)adaptor.create(IF48)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF48_tree, root_0);


            char_literal49=(Token)match(input,68,FOLLOW_68_in_ite_stmt449); 

            pushFollow(FOLLOW_expr_in_ite_stmt452);
            expr50=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr50.getTree());

            char_literal51=(Token)match(input,69,FOLLOW_69_in_ite_stmt454); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt457);
            block_instructions52=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions52.getTree());

            pushFollow(FOLLOW_elseif_stmt_in_ite_stmt459);
            elseif_stmt53=elseif_stmt();

            state._fsp--;

            adaptor.addChild(root_0, elseif_stmt53.getTree());

            pushFollow(FOLLOW_else_stmt_in_ite_stmt461);
            else_stmt54=else_stmt();

            state._fsp--;

            adaptor.addChild(root_0, else_stmt54.getTree());

            ENDIF55=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt463); 

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

        Token ELSEIF56=null;
        Token char_literal57=null;
        Token char_literal59=null;
        AslParser.expr_return expr58 =null;

        AslParser.block_instructions_return block_instructions60 =null;


        AslTree ELSEIF56_tree=null;
        AslTree char_literal57_tree=null;
        AslTree char_literal59_tree=null;

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
            	    ELSEIF56=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseif_stmt473); 
            	    ELSEIF56_tree = 
            	    (AslTree)adaptor.create(ELSEIF56)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(ELSEIF56_tree, root_0);


            	    char_literal57=(Token)match(input,68,FOLLOW_68_in_elseif_stmt476); 

            	    pushFollow(FOLLOW_expr_in_elseif_stmt479);
            	    expr58=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr58.getTree());

            	    char_literal59=(Token)match(input,69,FOLLOW_69_in_elseif_stmt481); 

            	    pushFollow(FOLLOW_block_instructions_in_elseif_stmt484);
            	    block_instructions60=block_instructions();

            	    state._fsp--;

            	    adaptor.addChild(root_0, block_instructions60.getTree());

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

        Token ELSE61=null;
        AslParser.block_instructions_return block_instructions62 =null;


        AslTree ELSE61_tree=null;

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
                    ELSE61=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt495); 
                    ELSE61_tree = 
                    (AslTree)adaptor.create(ELSE61)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ELSE61_tree, root_0);


                    pushFollow(FOLLOW_block_instructions_in_else_stmt498);
                    block_instructions62=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions62.getTree());

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

        Token WHILE63=null;
        Token char_literal64=null;
        Token char_literal66=null;
        Token ENDWHILE68=null;
        AslParser.expr_return expr65 =null;

        AslParser.block_instructions_return block_instructions67 =null;


        AslTree WHILE63_tree=null;
        AslTree char_literal64_tree=null;
        AslTree char_literal66_tree=null;
        AslTree ENDWHILE68_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:129:12: ( WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:129:17: WHILE ^ '(' ! expr ')' ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE63=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt513); 
            WHILE63_tree = 
            (AslTree)adaptor.create(WHILE63)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE63_tree, root_0);


            char_literal64=(Token)match(input,68,FOLLOW_68_in_while_stmt516); 

            pushFollow(FOLLOW_expr_in_while_stmt519);
            expr65=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr65.getTree());

            char_literal66=(Token)match(input,69,FOLLOW_69_in_while_stmt521); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt524);
            block_instructions67=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions67.getTree());

            ENDWHILE68=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt526); 

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

        Token FOR69=null;
        Token char_literal70=null;
        Token char_literal72=null;
        Token ENDFOR74=null;
        AslParser.for_form_return for_form71 =null;

        AslParser.block_instructions_return block_instructions73 =null;


        AslTree FOR69_tree=null;
        AslTree char_literal70_tree=null;
        AslTree char_literal72_tree=null;
        AslTree ENDFOR74_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:132:10: ( FOR ^ '(' ! for_form ')' ! block_instructions ENDFOR !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:132:13: FOR ^ '(' ! for_form ')' ! block_instructions ENDFOR !
            {
            root_0 = (AslTree)adaptor.nil();


            FOR69=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt537); 
            FOR69_tree = 
            (AslTree)adaptor.create(FOR69)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FOR69_tree, root_0);


            char_literal70=(Token)match(input,68,FOLLOW_68_in_for_stmt540); 

            pushFollow(FOLLOW_for_form_in_for_stmt543);
            for_form71=for_form();

            state._fsp--;

            adaptor.addChild(root_0, for_form71.getTree());

            char_literal72=(Token)match(input,69,FOLLOW_69_in_for_stmt545); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt548);
            block_instructions73=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions73.getTree());

            ENDFOR74=(Token)match(input,ENDFOR,FOLLOW_ENDFOR_in_for_stmt550); 

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

        Token char_literal76=null;
        Token char_literal78=null;
        Token ID80=null;
        Token IN81=null;
        Token char_literal83=null;
        AslParser.assign_return assign75 =null;

        AslParser.expr_return expr77 =null;

        AslParser.assign_return assign79 =null;

        AslParser.expr_return expr82 =null;

        AslParser.expr_return expr84 =null;


        AslTree char_literal76_tree=null;
        AslTree char_literal78_tree=null;
        AslTree ID80_tree=null;
        AslTree IN81_tree=null;
        AslTree char_literal83_tree=null;

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


                    pushFollow(FOLLOW_assign_in_for_form560);
                    assign75=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign75.getTree());

                    char_literal76=(Token)match(input,74,FOLLOW_74_in_for_form562); 

                    pushFollow(FOLLOW_expr_in_for_form565);
                    expr77=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr77.getTree());

                    char_literal78=(Token)match(input,74,FOLLOW_74_in_for_form567); 

                    pushFollow(FOLLOW_assign_in_for_form570);
                    assign79=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign79.getTree());

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:136:8: ID IN ! expr ':' ! expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID80=(Token)match(input,ID,FOLLOW_ID_in_for_form580); 
                    ID80_tree = 
                    (AslTree)adaptor.create(ID80)
                    ;
                    adaptor.addChild(root_0, ID80_tree);


                    IN81=(Token)match(input,IN,FOLLOW_IN_in_for_form582); 

                    pushFollow(FOLLOW_expr_in_for_form585);
                    expr82=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr82.getTree());

                    char_literal83=(Token)match(input,73,FOLLOW_73_in_for_form587); 

                    pushFollow(FOLLOW_expr_in_for_form590);
                    expr84=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr84.getTree());

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

        Token RETURN85=null;
        AslParser.expr_return expr86 =null;


        AslTree RETURN85_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:141:13: ( RETURN ^ ( expr )? )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:141:17: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN85=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt607); 
            RETURN85_tree = 
            (AslTree)adaptor.create(RETURN85)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN85_tree, root_0);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:141:25: ( expr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==FALSE||LA15_0==ID||LA15_0==INT||LA15_0==MINUS||LA15_0==NOT||LA15_0==PLUS||LA15_0==TRUE||LA15_0==68) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:141:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt610);
                    expr86=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr86.getTree());

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

        Token OR88=null;
        AslParser.boolterm_return boolterm87 =null;

        AslParser.boolterm_return boolterm89 =null;


        AslTree OR88_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:151:6: ( boolterm ( OR ^ boolterm )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:151:8: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr627);
            boolterm87=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm87.getTree());

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
            	    OR88=(Token)match(input,OR,FOLLOW_OR_in_expr630); 
            	    OR88_tree = 
            	    (AslTree)adaptor.create(OR88)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR88_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr633);
            	    boolterm89=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm89.getTree());

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

        Token AND91=null;
        AslParser.boolfact_return boolfact90 =null;

        AslParser.boolfact_return boolfact92 =null;


        AslTree AND91_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:153:9: ( boolfact ( AND ^ boolfact )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:153:11: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm642);
            boolfact90=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact90.getTree());

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
            	    AND91=(Token)match(input,AND,FOLLOW_AND_in_boolterm645); 
            	    AND91_tree = 
            	    (AslTree)adaptor.create(AND91)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND91_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm648);
            	    boolfact92=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact92.getTree());

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

        Token COND_EQUAL94=null;
        Token NOT_EQUAL95=null;
        Token LT96=null;
        Token LE97=null;
        Token GT98=null;
        Token GE99=null;
        AslParser.num_expr_return num_expr93 =null;

        AslParser.num_expr_return num_expr100 =null;


        AslTree COND_EQUAL94_tree=null;
        AslTree NOT_EQUAL95_tree=null;
        AslTree LT96_tree=null;
        AslTree LE97_tree=null;
        AslTree GT98_tree=null;
        AslTree GE99_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:9: ( num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:11: num_expr ( ( COND_EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact657);
            num_expr93=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr93.getTree());

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
                            COND_EQUAL94=(Token)match(input,COND_EQUAL,FOLLOW_COND_EQUAL_in_boolfact661); 
                            COND_EQUAL94_tree = 
                            (AslTree)adaptor.create(COND_EQUAL94)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(COND_EQUAL94_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:36: NOT_EQUAL ^
                            {
                            NOT_EQUAL95=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact666); 
                            NOT_EQUAL95_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL95)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL95_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:49: LT ^
                            {
                            LT96=(Token)match(input,LT,FOLLOW_LT_in_boolfact671); 
                            LT96_tree = 
                            (AslTree)adaptor.create(LT96)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT96_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:55: LE ^
                            {
                            LE97=(Token)match(input,LE,FOLLOW_LE_in_boolfact676); 
                            LE97_tree = 
                            (AslTree)adaptor.create(LE97)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE97_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:61: GT ^
                            {
                            GT98=(Token)match(input,GT,FOLLOW_GT_in_boolfact681); 
                            GT98_tree = 
                            (AslTree)adaptor.create(GT98)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT98_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:155:67: GE ^
                            {
                            GE99=(Token)match(input,GE,FOLLOW_GE_in_boolfact686); 
                            GE99_tree = 
                            (AslTree)adaptor.create(GE99)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE99_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact690);
                    num_expr100=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr100.getTree());

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

        Token PLUS102=null;
        Token MINUS103=null;
        AslParser.term_return term101 =null;

        AslParser.term_return term104 =null;


        AslTree PLUS102_tree=null;
        AslTree MINUS103_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:157:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:157:11: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr699);
            term101=term();

            state._fsp--;

            adaptor.addChild(root_0, term101.getTree());

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
            	            PLUS102=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr704); 
            	            PLUS102_tree = 
            	            (AslTree)adaptor.create(PLUS102)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS102_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:157:27: MINUS ^
            	            {
            	            MINUS103=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr709); 
            	            MINUS103_tree = 
            	            (AslTree)adaptor.create(MINUS103)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS103_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr713);
            	    term104=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term104.getTree());

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

        Token MUL106=null;
        Token DIV107=null;
        Token MOD108=null;
        AslParser.factor_return factor105 =null;

        AslParser.factor_return factor109 =null;


        AslTree MUL106_tree=null;
        AslTree DIV107_tree=null;
        AslTree MOD108_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:6: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:8: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term723);
            factor105=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor105.getTree());

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
            	            MUL106=(Token)match(input,MUL,FOLLOW_MUL_in_term728); 
            	            MUL106_tree = 
            	            (AslTree)adaptor.create(MUL106)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL106_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:25: DIV ^
            	            {
            	            DIV107=(Token)match(input,DIV,FOLLOW_DIV_in_term733); 
            	            DIV107_tree = 
            	            (AslTree)adaptor.create(DIV107)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV107_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:159:32: MOD ^
            	            {
            	            MOD108=(Token)match(input,MOD,FOLLOW_MOD_in_term738); 
            	            MOD108_tree = 
            	            (AslTree)adaptor.create(MOD108)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD108_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term742);
            	    factor109=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor109.getTree());

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

        Token NOT110=null;
        Token PLUS111=null;
        Token MINUS112=null;
        AslParser.atom_return atom113 =null;


        AslTree NOT110_tree=null;
        AslTree PLUS111_tree=null;
        AslTree MINUS112_tree=null;

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
                    NOT110=(Token)match(input,NOT,FOLLOW_NOT_in_factor753); 
                    NOT110_tree = 
                    (AslTree)adaptor.create(NOT110)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT110_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:161:18: PLUS ^
                    {
                    PLUS111=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor758); 
                    PLUS111_tree = 
                    (AslTree)adaptor.create(PLUS111)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS111_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:161:26: MINUS ^
                    {
                    MINUS112=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor763); 
                    MINUS112_tree = 
                    (AslTree)adaptor.create(MINUS112)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS112_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor768);
            atom113=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom113.getTree());

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
        Token ID114=null;
        Token INT115=null;
        Token char_literal117=null;
        Token char_literal119=null;
        AslParser.funcall_return funcall116 =null;

        AslParser.expr_return expr118 =null;

        AslParser.acces_attribute_return acces_attribute120 =null;


        AslTree b_tree=null;
        AslTree ID114_tree=null;
        AslTree INT115_tree=null;
        AslTree char_literal117_tree=null;
        AslTree char_literal119_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:166:6: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| acces_attribute )
            int alt26=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 68:
                    {
                    alt26=4;
                    }
                    break;
                case 71:
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
                case 69:
                case 70:
                case 73:
                case 74:
                case 77:
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
            case 68:
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


                    ID114=(Token)match(input,ID,FOLLOW_ID_in_atom779); 
                    ID114_tree = 
                    (AslTree)adaptor.create(ID114)
                    ;
                    adaptor.addChild(root_0, ID114_tree);


                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:167:3: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT115=(Token)match(input,INT,FOLLOW_INT_in_atom783); 
                    INT115_tree = 
                    (AslTree)adaptor.create(INT115)
                    ;
                    adaptor.addChild(root_0, INT115_tree);


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
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom790);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:168:13: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom796);  
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


                    pushFollow(FOLLOW_funcall_in_atom808);
                    funcall116=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall116.getTree());

                    }
                    break;
                case 5 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:170:3: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal117=(Token)match(input,68,FOLLOW_68_in_atom812); 

                    pushFollow(FOLLOW_expr_in_atom815);
                    expr118=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr118.getTree());

                    char_literal119=(Token)match(input,69,FOLLOW_69_in_atom817); 

                    }
                    break;
                case 6 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:171:3: acces_attribute
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_acces_attribute_in_atom822);
                    acces_attribute120=acces_attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, acces_attribute120.getTree());

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

        Token ID121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        AslParser.expr_list_return expr_list123 =null;


        AslTree ID121_tree=null;
        AslTree char_literal122_tree=null;
        AslTree char_literal124_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:174:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:174:11: ID '(' ( expr_list )? ')'
            {
            ID121=(Token)match(input,ID,FOLLOW_ID_in_funcall831);  
            stream_ID.add(ID121);


            char_literal122=(Token)match(input,68,FOLLOW_68_in_funcall833);  
            stream_68.add(char_literal122);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:174:18: ( expr_list )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==FALSE||LA27_0==ID||LA27_0==INT||LA27_0==MINUS||LA27_0==NOT||LA27_0==PLUS||LA27_0==TRUE||LA27_0==68) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:174:18: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall835);
                    expr_list123=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list123.getTree());

                    }
                    break;

            }


            char_literal124=(Token)match(input,69,FOLLOW_69_in_funcall838);  
            stream_69.add(char_literal124);


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

        Token char_literal126=null;
        AslParser.expr_return expr125 =null;

        AslParser.expr_return expr127 =null;


        AslTree char_literal126_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:177:10: ( expr ( ',' ! expr )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:177:12: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list861);
            expr125=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr125.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:177:17: ( ',' ! expr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==70) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:177:18: ',' ! expr
            	    {
            	    char_literal126=(Token)match(input,70,FOLLOW_70_in_expr_list864); 

            	    pushFollow(FOLLOW_expr_in_expr_list867);
            	    expr127=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr127.getTree());

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

        Token char_literal128=null;
        Token BEGIN129=null;
        Token EQUAL130=null;
        Token char_literal132=null;
        AslParser.expr_return expr131 =null;

        AslParser.finish_time_return finish_time133 =null;


        AslTree char_literal128_tree=null;
        AslTree BEGIN129_tree=null;
        AslTree EQUAL130_tree=null;
        AslTree char_literal132_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_finish_time=new RewriteRuleSubtreeStream(adaptor,"rule finish_time");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:179:16: ( '@' BEGIN EQUAL expr ( ',' finish_time )? -> ^( TIMEANNOTATION expr ( finish_time )? ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:180:1: '@' BEGIN EQUAL expr ( ',' finish_time )?
            {
            char_literal128=(Token)match(input,75,FOLLOW_75_in_time_annotation876);  
            stream_75.add(char_literal128);


            BEGIN129=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_time_annotation878);  
            stream_BEGIN.add(BEGIN129);


            EQUAL130=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_time_annotation880);  
            stream_EQUAL.add(EQUAL130);


            pushFollow(FOLLOW_expr_in_time_annotation882);
            expr131=expr();

            state._fsp--;

            stream_expr.add(expr131.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:180:22: ( ',' finish_time )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==70) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:180:23: ',' finish_time
                    {
                    char_literal132=(Token)match(input,70,FOLLOW_70_in_time_annotation885);  
                    stream_70.add(char_literal132);


                    pushFollow(FOLLOW_finish_time_in_time_annotation887);
                    finish_time133=finish_time();

                    state._fsp--;

                    stream_finish_time.add(finish_time133.getTree());

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

        Token END134=null;
        Token EQUAL135=null;
        Token DURATION137=null;
        Token EQUAL138=null;
        AslParser.expr_return expr136 =null;

        AslParser.expr_return expr139 =null;


        AslTree END134_tree=null;
        AslTree EQUAL135_tree=null;
        AslTree DURATION137_tree=null;
        AslTree EQUAL138_tree=null;

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
                    END134=(Token)match(input,END,FOLLOW_END_in_finish_time908); 
                    END134_tree = 
                    (AslTree)adaptor.create(END134)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(END134_tree, root_0);


                    EQUAL135=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_finish_time911); 

                    pushFollow(FOLLOW_expr_in_finish_time914);
                    expr136=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr136.getTree());

                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:183:21: DURATION ^ EQUAL ! expr
                    {
                    DURATION137=(Token)match(input,DURATION,FOLLOW_DURATION_in_finish_time918); 
                    DURATION137_tree = 
                    (AslTree)adaptor.create(DURATION137)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(DURATION137_tree, root_0);


                    EQUAL138=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_finish_time921); 

                    pushFollow(FOLLOW_expr_in_finish_time924);
                    expr139=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr139.getTree());

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
    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:1: create : CREATE TYPE_OBJECT ( coordenades )? ( list_attributes )? -> ^( CREATE TYPE_OBJECT ( coordenades )? ( ^( ATTRIBUTES list_attributes ) )? ) ;
    public final AslParser.create_return create() throws RecognitionException {
        AslParser.create_return retval = new AslParser.create_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token CREATE140=null;
        Token TYPE_OBJECT141=null;
        AslParser.coordenades_return coordenades142 =null;

        AslParser.list_attributes_return list_attributes143 =null;


        AslTree CREATE140_tree=null;
        AslTree TYPE_OBJECT141_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_TYPE_OBJECT=new RewriteRuleTokenStream(adaptor,"token TYPE_OBJECT");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        RewriteRuleSubtreeStream stream_list_attributes=new RewriteRuleSubtreeStream(adaptor,"rule list_attributes");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:7: ( CREATE TYPE_OBJECT ( coordenades )? ( list_attributes )? -> ^( CREATE TYPE_OBJECT ( coordenades )? ( ^( ATTRIBUTES list_attributes ) )? ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:9: CREATE TYPE_OBJECT ( coordenades )? ( list_attributes )?
            {
            CREATE140=(Token)match(input,CREATE,FOLLOW_CREATE_in_create932);  
            stream_CREATE.add(CREATE140);


            TYPE_OBJECT141=(Token)match(input,TYPE_OBJECT,FOLLOW_TYPE_OBJECT_in_create934);  
            stream_TYPE_OBJECT.add(TYPE_OBJECT141);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:28: ( coordenades )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==76) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:28: coordenades
                    {
                    pushFollow(FOLLOW_coordenades_in_create936);
                    coordenades142=coordenades();

                    state._fsp--;

                    stream_coordenades.add(coordenades142.getTree());

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
                    pushFollow(FOLLOW_list_attributes_in_create939);
                    list_attributes143=list_attributes();

                    state._fsp--;

                    stream_list_attributes.add(list_attributes143.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: CREATE, coordenades, TYPE_OBJECT, list_attributes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 185:58: -> ^( CREATE TYPE_OBJECT ( coordenades )? ( ^( ATTRIBUTES list_attributes ) )? )
            {
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:61: ^( CREATE TYPE_OBJECT ( coordenades )? ( ^( ATTRIBUTES list_attributes ) )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                stream_CREATE.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_TYPE_OBJECT.nextNode()
                );

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:82: ( coordenades )?
                if ( stream_coordenades.hasNext() ) {
                    adaptor.addChild(root_1, stream_coordenades.nextTree());

                }
                stream_coordenades.reset();

                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:95: ( ^( ATTRIBUTES list_attributes ) )?
                if ( stream_list_attributes.hasNext() ) {
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:185:95: ^( ATTRIBUTES list_attributes )
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

        Token GROUP144=null;
        Token ID145=null;
        Token char_literal146=null;
        Token ID147=null;

        AslTree GROUP144_tree=null;
        AslTree ID145_tree=null;
        AslTree char_literal146_tree=null;
        AslTree ID147_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:188:6: ( GROUP ^ ID ( ',' ! ID )+ )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:188:8: GROUP ^ ID ( ',' ! ID )+
            {
            root_0 = (AslTree)adaptor.nil();


            GROUP144=(Token)match(input,GROUP,FOLLOW_GROUP_in_group966); 
            GROUP144_tree = 
            (AslTree)adaptor.create(GROUP144)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(GROUP144_tree, root_0);


            ID145=(Token)match(input,ID,FOLLOW_ID_in_group969); 
            ID145_tree = 
            (AslTree)adaptor.create(ID145)
            ;
            adaptor.addChild(root_0, ID145_tree);


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:188:18: ( ',' ! ID )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==70) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:188:19: ',' ! ID
            	    {
            	    char_literal146=(Token)match(input,70,FOLLOW_70_in_group972); 

            	    ID147=(Token)match(input,ID,FOLLOW_ID_in_group975); 
            	    ID147_tree = 
            	    (AslTree)adaptor.create(ID147)
            	    ;
            	    adaptor.addChild(root_0, ID147_tree);


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

        Token DESTROY148=null;
        Token ID149=null;

        AslTree DESTROY148_tree=null;
        AslTree ID149_tree=null;
        RewriteRuleTokenStream stream_DESTROY=new RewriteRuleTokenStream(adaptor,"token DESTROY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:190:8: ( DESTROY ID -> ^( ANIMATION DESTROY ID ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:190:10: DESTROY ID
            {
            DESTROY148=(Token)match(input,DESTROY,FOLLOW_DESTROY_in_destroy984);  
            stream_DESTROY.add(DESTROY148);


            ID149=(Token)match(input,ID,FOLLOW_ID_in_destroy986);  
            stream_ID.add(ID149);


            // AST REWRITE
            // elements: ID, DESTROY
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

        Token MOVE150=null;
        Token ID151=null;
        AslParser.coordenades_return coordenades152 =null;


        AslTree MOVE150_tree=null;
        AslTree ID151_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MOVE=new RewriteRuleTokenStream(adaptor,"token MOVE");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:192:5: ( MOVE ID coordenades -> ^( ANIMATION MOVE ID coordenades ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:192:9: MOVE ID coordenades
            {
            MOVE150=(Token)match(input,MOVE,FOLLOW_MOVE_in_move1005);  
            stream_MOVE.add(MOVE150);


            ID151=(Token)match(input,ID,FOLLOW_ID_in_move1007);  
            stream_ID.add(ID151);


            pushFollow(FOLLOW_coordenades_in_move1009);
            coordenades152=coordenades();

            state._fsp--;

            stream_coordenades.add(coordenades152.getTree());

            // AST REWRITE
            // elements: MOVE, coordenades, ID
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

        Token TRANSLATE153=null;
        Token ID154=null;
        AslParser.coordenades_return coordenades155 =null;


        AslTree TRANSLATE153_tree=null;
        AslTree ID154_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TRANSLATE=new RewriteRuleTokenStream(adaptor,"token TRANSLATE");
        RewriteRuleSubtreeStream stream_coordenades=new RewriteRuleSubtreeStream(adaptor,"rule coordenades");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:194:10: ( TRANSLATE ID coordenades -> ^( ANIMATION TRANSLATE ID coordenades ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:194:13: TRANSLATE ID coordenades
            {
            TRANSLATE153=(Token)match(input,TRANSLATE,FOLLOW_TRANSLATE_in_translate1029);  
            stream_TRANSLATE.add(TRANSLATE153);


            ID154=(Token)match(input,ID,FOLLOW_ID_in_translate1031);  
            stream_ID.add(ID154);


            pushFollow(FOLLOW_coordenades_in_translate1033);
            coordenades155=coordenades();

            state._fsp--;

            stream_coordenades.add(coordenades155.getTree());

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

        Token MODIFY156=null;
        Token ID157=null;
        AslParser.list_attributes_return list_attributes158 =null;


        AslTree MODIFY156_tree=null;
        AslTree ID157_tree=null;
        RewriteRuleTokenStream stream_MODIFY=new RewriteRuleTokenStream(adaptor,"token MODIFY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_list_attributes=new RewriteRuleSubtreeStream(adaptor,"rule list_attributes");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:196:7: ( MODIFY ID list_attributes -> ^( ANIMATION MODIFY ID list_attributes ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:196:9: MODIFY ID list_attributes
            {
            MODIFY156=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_modify1052);  
            stream_MODIFY.add(MODIFY156);


            ID157=(Token)match(input,ID,FOLLOW_ID_in_modify1054);  
            stream_ID.add(ID157);


            pushFollow(FOLLOW_list_attributes_in_modify1056);
            list_attributes158=list_attributes();

            state._fsp--;

            stream_list_attributes.add(list_attributes158.getTree());

            // AST REWRITE
            // elements: list_attributes, ID, MODIFY
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

        Token ROTATE159=null;
        Token ID160=null;
        AslParser.expr_return expr161 =null;


        AslTree ROTATE159_tree=null;
        AslTree ID160_tree=null;
        RewriteRuleTokenStream stream_ROTATE=new RewriteRuleTokenStream(adaptor,"token ROTATE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:198:7: ( ROTATE ID expr -> ^( ANIMATION ROTATE ID expr ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:198:9: ROTATE ID expr
            {
            ROTATE159=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_rotate1075);  
            stream_ROTATE.add(ROTATE159);


            ID160=(Token)match(input,ID,FOLLOW_ID_in_rotate1077);  
            stream_ID.add(ID160);


            pushFollow(FOLLOW_expr_in_rotate1079);
            expr161=expr();

            state._fsp--;

            stream_expr.add(expr161.getTree());

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

        Token char_literal163=null;
        AslParser.attribute_return attribute162 =null;

        AslParser.attribute_return attribute164 =null;


        AslTree char_literal163_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:200:16: ( attribute ( ',' ! attribute )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:200:18: attribute ( ',' ! attribute )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_attribute_in_list_attributes1098);
            attribute162=attribute();

            state._fsp--;

            adaptor.addChild(root_0, attribute162.getTree());

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:200:28: ( ',' ! attribute )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==70) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:200:29: ',' ! attribute
            	    {
            	    char_literal163=(Token)match(input,70,FOLLOW_70_in_list_attributes1101); 

            	    pushFollow(FOLLOW_attribute_in_list_attributes1104);
            	    attribute164=attribute();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribute164.getTree());

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

        Token ATTRIBUTE165=null;
        Token EQUAL166=null;
        AslParser.expr_return expr167 =null;


        AslTree ATTRIBUTE165_tree=null;
        AslTree EQUAL166_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:202:10: ( ATTRIBUTE ^ EQUAL ! expr )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:202:12: ATTRIBUTE ^ EQUAL ! expr
            {
            root_0 = (AslTree)adaptor.nil();


            ATTRIBUTE165=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute1113); 
            ATTRIBUTE165_tree = 
            (AslTree)adaptor.create(ATTRIBUTE165)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(ATTRIBUTE165_tree, root_0);


            EQUAL166=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_attribute1116); 

            pushFollow(FOLLOW_expr_in_attribute1119);
            expr167=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr167.getTree());

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

        Token char_literal168=null;
        Token char_literal170=null;
        Token char_literal172=null;
        AslParser.expr_return expr169 =null;

        AslParser.expr_return expr171 =null;


        AslTree char_literal168_tree=null;
        AslTree char_literal170_tree=null;
        AslTree char_literal172_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:204:12: ( '{' ! expr ',' ! expr '}' !)
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:204:14: '{' ! expr ',' ! expr '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            char_literal168=(Token)match(input,76,FOLLOW_76_in_coordenades1126); 

            pushFollow(FOLLOW_expr_in_coordenades1129);
            expr169=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr169.getTree());

            char_literal170=(Token)match(input,70,FOLLOW_70_in_coordenades1131); 

            pushFollow(FOLLOW_expr_in_coordenades1134);
            expr171=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr171.getTree());

            char_literal172=(Token)match(input,77,FOLLOW_77_in_coordenades1136); 

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

        Token ID173=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal177=null;
        AslParser.att_return att175 =null;


        AslTree ID173_tree=null;
        AslTree char_literal174_tree=null;
        AslTree char_literal176_tree=null;
        AslTree char_literal177_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_att=new RewriteRuleSubtreeStream(adaptor,"rule att");
        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:206:16: ( ID '.' att '(' ')' -> ^( ACCESATTRIBUTE ID att ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:206:18: ID '.' att '(' ')'
            {
            ID173=(Token)match(input,ID,FOLLOW_ID_in_acces_attribute1144);  
            stream_ID.add(ID173);


            char_literal174=(Token)match(input,71,FOLLOW_71_in_acces_attribute1146);  
            stream_71.add(char_literal174);


            pushFollow(FOLLOW_att_in_acces_attribute1148);
            att175=att();

            state._fsp--;

            stream_att.add(att175.getTree());

            char_literal176=(Token)match(input,68,FOLLOW_68_in_acces_attribute1150);  
            stream_68.add(char_literal176);


            char_literal177=(Token)match(input,69,FOLLOW_69_in_acces_attribute1152);  
            stream_69.add(char_literal177);


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

        Token set178=null;

        AslTree set178_tree=null;

        try {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:209:4: ( ATTRIBUTE | BEGIN | END | DURATION )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set178=(Token)input.LT(1);

            if ( input.LA(1)==ATTRIBUTE||input.LA(1)==BEGIN||input.LA(1)==DURATION||input.LA(1)==END ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set178)
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


 

    public static final BitSet FOLLOW_imports_in_prog101 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_list_func_in_prog104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_def_in_prog123 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_imports_in_prog125 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_list_func_in_prog128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module_def150 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_module_def153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_module_def155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_imports166 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_imports169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_imports171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_imports174 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_func_in_list_func186 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EOF_in_list_func189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func207 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_func210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_params_in_func212 = new BitSet(new long[]{0x4C01401A20018000L,0x0000000000000C02L});
    public static final BitSet FOLLOW_block_instructions_in_func214 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_params227 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_paramlist_in_params229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_params232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist249 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_paramlist252 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_param_in_paramlist255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_param269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions287 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_block_instructions290 = new BitSet(new long[]{0x4C01401A20018000L,0x0000000000000C02L});
    public static final BitSet FOLLOW_instruction_in_block_instructions292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_assign_in_instruction314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_instruction_in_instruction319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_annotation_in_instruction349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign365 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_assign369 = new BitSet(new long[]{0x4801400200018000L});
    public static final BitSet FOLLOW_basic_instruction_in_assign371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign387 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_assign391 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_assign393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_basic_instruction412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_in_basic_instruction416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destroy_in_basic_instruction420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_basic_instruction424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_translate_in_basic_instruction428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_in_basic_instruction432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rotate_in_basic_instruction436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ite_stmt449 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_ite_stmt452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ite_stmt454 = new BitSet(new long[]{0x4C01401A20018000L,0x0000000000000C02L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt457 = new BitSet(new long[]{0x0000000001180000L});
    public static final BitSet FOLLOW_elseif_stmt_in_ite_stmt459 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_else_stmt_in_ite_stmt461 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseif_stmt473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_elseif_stmt476 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_elseif_stmt481 = new BitSet(new long[]{0x4C01401A20018000L,0x0000000000000C02L});
    public static final BitSet FOLLOW_block_instructions_in_elseif_stmt484 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt495 = new BitSet(new long[]{0x4C01401A20018000L,0x0000000000000C02L});
    public static final BitSet FOLLOW_block_instructions_in_else_stmt498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_while_stmt516 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_while_stmt519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_while_stmt521 = new BitSet(new long[]{0x4C01401A20018000L,0x0000000000000C02L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt524 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_for_stmt540 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_for_form_in_for_stmt543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_for_stmt545 = new BitSet(new long[]{0x4C01401A20018000L,0x0000000000000C02L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt548 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ENDFOR_in_for_stmt550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_for_form560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_for_form562 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_for_form565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_for_form567 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_assign_in_for_form570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_for_form580 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IN_in_for_form582 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_for_form585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_for_form587 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_for_form590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt607 = new BitSet(new long[]{0x8044108810000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_return_stmt610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr627 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OR_in_expr630 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_boolterm_in_expr633 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm642 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm645 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_boolfact_in_boolterm648 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact657 = new BitSet(new long[]{0x0008090500004002L});
    public static final BitSet FOLLOW_COND_EQUAL_in_boolfact661 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact666 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LT_in_boolfact671 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LE_in_boolfact676 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_GT_in_boolfact681 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_GE_in_boolfact686 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_num_expr_in_boolfact690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr699 = new BitSet(new long[]{0x0040100000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr704 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_MINUS_in_num_expr709 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_term_in_num_expr713 = new BitSet(new long[]{0x0040100000000002L});
    public static final BitSet FOLLOW_factor_in_term723 = new BitSet(new long[]{0x0002200000020002L});
    public static final BitSet FOLLOW_MUL_in_term728 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DIV_in_term733 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_MOD_in_term738 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_factor_in_term742 = new BitSet(new long[]{0x0002200000020002L});
    public static final BitSet FOLLOW_NOT_in_factor753 = new BitSet(new long[]{0x8000008810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_PLUS_in_factor758 = new BitSet(new long[]{0x8000008810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_MINUS_in_factor763 = new BitSet(new long[]{0x8000008810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_atom_in_factor768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_atom812 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_atom815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_atom817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_acces_attribute_in_atom822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_funcall833 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_expr_list_in_funcall835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_funcall838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list861 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_expr_list864 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_expr_list867 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_75_in_time_annotation876 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BEGIN_in_time_annotation878 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_time_annotation880 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_time_annotation882 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_time_annotation885 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_finish_time_in_time_annotation887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_finish_time908 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_finish_time911 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_finish_time914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_finish_time918 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_finish_time921 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_finish_time924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TYPE_OBJECT_in_create934 = new BitSet(new long[]{0x0000000000000202L,0x0000000000001000L});
    public static final BitSet FOLLOW_coordenades_in_create936 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_list_attributes_in_create939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_group966 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_group969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_group972 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_group975 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_DESTROY_in_destroy984 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_destroy986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move1005 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_move1007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_coordenades_in_move1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSLATE_in_translate1029 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_translate1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_coordenades_in_translate1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_in_modify1052 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_modify1054 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_list_attributes_in_modify1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_rotate1075 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_rotate1077 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_rotate1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1098 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_list_attributes1101 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attribute1113 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_attribute1116 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_attribute1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_coordenades1126 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_coordenades1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_coordenades1131 = new BitSet(new long[]{0x8044108810000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_coordenades1134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_coordenades1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_acces_attribute1144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_acces_attribute1146 = new BitSet(new long[]{0x0000000000240A00L});
    public static final BitSet FOLLOW_att_in_acces_attribute1148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_acces_attribute1150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_acces_attribute1152 = new BitSet(new long[]{0x0000000000000002L});

}