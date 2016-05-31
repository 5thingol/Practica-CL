// $ANTLR 3.4 /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g 2016-05-31 23:48:27

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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
    public String getGrammarFileName() { return "/home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g"; }

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:6:7: ( '(' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:6:9: '('
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:7:7: ( ')' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:7:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:8:7: ( ',' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:9:7: ( '.' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:9:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:10:7: ( ':' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:10:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:11:7: ( ';' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:12:7: ( '@' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:12:9: '@'
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:13:7: ( '{' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:13:9: '{'
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:14:7: ( '}' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:14:9: '}'
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
    // $ANTLR end "T__83"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:245:7: ( '=' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:245:9: '='
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:246:12: ( '==' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:246:14: '=='
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:247:10: ( '!=' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:247:12: '!='
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:248:4: ( '<' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:248:6: '<'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:249:4: ( '<=' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:249:6: '<='
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:250:4: ( '>' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:250:6: '>'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:251:4: ( '>=' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:251:6: '>='
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:252:6: ( '+' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:252:8: '+'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:253:7: ( '-' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:253:9: '-'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:254:5: ( '*' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:254:7: '*'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:255:5: ( '/' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:255:7: '/'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:256:5: ( '%' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:256:7: '%'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:257:5: ( 'not' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:257:7: 'not'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:258:5: ( 'and' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:258:7: 'and'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:259:4: ( 'or' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:259:6: 'or'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:260:4: ( 'if' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:260:6: 'if'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:261:6: ( 'else' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:261:8: 'else'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:262:8: ( 'elseif' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:262:10: 'elseif'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:263:7: ( 'endif' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:263:9: 'endif'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:264:7: ( 'while' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:264:9: 'while'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:265:5: ( 'for' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:265:7: 'for'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:266:9: ( 'endwhile' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:266:11: 'endwhile'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:267:8: ( 'endfor' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:267:10: 'endfor'
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

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:268:4: ( 'in' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:268:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:269:8: ( 'module' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:269:10: 'module'
            {
            match("module"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODULE"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:270:8: ( 'import' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:270:10: 'import'
            {
            match("import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:271:8: ( 'define' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:271:10: 'define'
            {
            match("define"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFINE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:272:6: ( 'func' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:272:8: 'func'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:273:9: ( 'endfunc' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:273:11: 'endfunc'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:274:8: ( 'return' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:274:10: 'return'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:275:6: ( 'read' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:275:8: 'read'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:276:7: ( 'write' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:276:9: 'write'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:277:6: ( 'true' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:277:8: 'true'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:278:7: ( 'false' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:278:9: 'false'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:279:7: ( 'begin' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:279:9: 'begin'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:280:5: ( 'end' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:280:7: 'end'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:281:9: ( 'duration' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:281:11: 'duration'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:282:8: ( 'Create' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:282:10: 'Create'
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

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:283:7: ( 'Group' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:283:10: 'Group'
            {
            match("Group"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "DESTROY"
    public final void mDESTROY() throws RecognitionException {
        try {
            int _type = DESTROY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:284:9: ( 'Destroy' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:284:11: 'Destroy'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:285:6: ( 'Move' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:285:8: 'Move'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:286:11: ( 'Translate' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:286:13: 'Translate'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:287:8: ( 'Modify' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:287:10: 'Modify'
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:288:8: ( 'Rotate' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:288:10: 'Rotate'
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

    // $ANTLR start "SCALE"
    public final void mSCALE() throws RecognitionException {
        try {
            int _type = SCALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:289:7: ( 'Scale' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:289:9: 'Scale'
            {
            match("Scale"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCALE"

    // $ANTLR start "SOURCE"
    public final void mSOURCE() throws RecognitionException {
        try {
            int _type = SOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:290:8: ( 'Source' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:290:10: 'Source'
            {
            match("Source"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOURCE"

    // $ANTLR start "TYPE_OBJECT"
    public final void mTYPE_OBJECT() throws RecognitionException {
        try {
            int _type = TYPE_OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:291:13: ( 'Rectangle' | 'Circle' | 'Text' | 'Ellipse' | 'Line' )
            int alt1=5;
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
            case 'E':
                {
                alt1=4;
                }
                break;
            case 'L':
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:291:15: 'Rectangle'
                    {
                    match("Rectangle"); 



                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:291:29: 'Circle'
                    {
                    match("Circle"); 



                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:291:40: 'Text'
                    {
                    match("Text"); 



                    }
                    break;
                case 4 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:291:49: 'Ellipse'
                    {
                    match("Ellipse"); 



                    }
                    break;
                case 5 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:291:61: 'Line'
                    {
                    match("Line"); 



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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:292:11: ( 'width' | 'height' | 'style' | 'color' | 'stroke' | 'stroke-width' | 'txt' )
            int alt2=7;
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
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='t') ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6=='y') ) {
                        alt2=3;
                    }
                    else if ( (LA2_6=='r') ) {
                        int LA2_8 = input.LA(4);

                        if ( (LA2_8=='o') ) {
                            int LA2_9 = input.LA(5);

                            if ( (LA2_9=='k') ) {
                                int LA2_10 = input.LA(6);

                                if ( (LA2_10=='e') ) {
                                    int LA2_11 = input.LA(7);

                                    if ( (LA2_11=='-') ) {
                                        alt2=6;
                                    }
                                    else {
                                        alt2=5;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 10, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 9, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'c':
                {
                alt2=4;
                }
                break;
            case 't':
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:292:13: 'width'
                    {
                    match("width"); 



                    }
                    break;
                case 2 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:292:23: 'height'
                    {
                    match("height"); 



                    }
                    break;
                case 3 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:292:34: 'style'
                    {
                    match("style"); 



                    }
                    break;
                case 4 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:292:44: 'color'
                    {
                    match("color"); 



                    }
                    break;
                case 5 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:292:54: 'stroke'
                    {
                    match("stroke"); 



                    }
                    break;
                case 6 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:292:65: 'stroke-width'
                    {
                    match("stroke-width"); 



                    }
                    break;
                case 7 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:292:82: 'txt'
                    {
                    match("txt"); 



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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:293:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:293:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:293:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:
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

    // $ANTLR start "FILE"
    public final void mFILE() throws RecognitionException {
        try {
            int _type = FILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:294:6: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )+ '.' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ '\"' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:294:10: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )+ '.' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ '\"'
            {
            match('\"'); 

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:294:14: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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


            match('.'); 

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:294:57: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "FILE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:295:5: ( ( '0' .. '9' )+ )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:295:9: ( '0' .. '9' )+
            {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:295:9: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:296:8: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:296:12: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:296:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            match('.'); 

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:296:26: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:298:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='/') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='/') ) {
                    alt12=1;
                }
                else if ( (LA12_1=='*') ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:298:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:298:16: (~ ( '\\n' | '\\r' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:
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
                    	    break loop9;
                        }
                    } while (true);


                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:298:30: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:298:30: '\\r'
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
                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:299:3: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:299:8: ( options {greedy=false; } : . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='*') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1=='/') ) {
                                alt11=2;
                            }
                            else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '.')||(LA11_1 >= '0' && LA11_1 <= '\uFFFF')) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ')')||(LA11_0 >= '+' && LA11_0 <= '\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:299:36: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:302:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:302:10: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:302:14: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\\') ) {
                    alt13=1;
                }
                else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:302:16: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:302:26: ~ ( '\\\\' | '\"' )
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
            	    break loop13;
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:308:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:308:3: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:311:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:311:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
        // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:8: ( T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | EQUAL | COND_EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | ELSEIF | ENDIF | WHILE | FOR | ENDWHILE | ENDFOR | IN | MODULE | IMPORT | DEFINE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | BEGIN | END | DURATION | CREATE | GROUP | DESTROY | MOVE | TRANSLATE | MODIFY | ROTATE | SCALE | SOURCE | TYPE_OBJECT | ATTRIBUTE | ID | FILE | INT | DOUBLE | COMMENT | STRING | WS )
        int alt14=64;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:10: T__75
                {
                mT__75(); 


                }
                break;
            case 2 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:16: T__76
                {
                mT__76(); 


                }
                break;
            case 3 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:22: T__77
                {
                mT__77(); 


                }
                break;
            case 4 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:28: T__78
                {
                mT__78(); 


                }
                break;
            case 5 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:34: T__79
                {
                mT__79(); 


                }
                break;
            case 6 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:40: T__80
                {
                mT__80(); 


                }
                break;
            case 7 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:46: T__81
                {
                mT__81(); 


                }
                break;
            case 8 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:52: T__82
                {
                mT__82(); 


                }
                break;
            case 9 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:58: T__83
                {
                mT__83(); 


                }
                break;
            case 10 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:64: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 11 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:70: COND_EQUAL
                {
                mCOND_EQUAL(); 


                }
                break;
            case 12 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:81: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 13 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:91: LT
                {
                mLT(); 


                }
                break;
            case 14 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:94: LE
                {
                mLE(); 


                }
                break;
            case 15 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:97: GT
                {
                mGT(); 


                }
                break;
            case 16 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:100: GE
                {
                mGE(); 


                }
                break;
            case 17 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:103: PLUS
                {
                mPLUS(); 


                }
                break;
            case 18 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:108: MINUS
                {
                mMINUS(); 


                }
                break;
            case 19 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:114: MUL
                {
                mMUL(); 


                }
                break;
            case 20 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:118: DIV
                {
                mDIV(); 


                }
                break;
            case 21 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:122: MOD
                {
                mMOD(); 


                }
                break;
            case 22 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:126: NOT
                {
                mNOT(); 


                }
                break;
            case 23 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:130: AND
                {
                mAND(); 


                }
                break;
            case 24 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:134: OR
                {
                mOR(); 


                }
                break;
            case 25 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:137: IF
                {
                mIF(); 


                }
                break;
            case 26 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:140: ELSE
                {
                mELSE(); 


                }
                break;
            case 27 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:145: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 28 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:152: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 29 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:158: WHILE
                {
                mWHILE(); 


                }
                break;
            case 30 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:164: FOR
                {
                mFOR(); 


                }
                break;
            case 31 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:168: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 32 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:177: ENDFOR
                {
                mENDFOR(); 


                }
                break;
            case 33 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:184: IN
                {
                mIN(); 


                }
                break;
            case 34 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:187: MODULE
                {
                mMODULE(); 


                }
                break;
            case 35 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:194: IMPORT
                {
                mIMPORT(); 


                }
                break;
            case 36 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:201: DEFINE
                {
                mDEFINE(); 


                }
                break;
            case 37 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:208: FUNC
                {
                mFUNC(); 


                }
                break;
            case 38 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:213: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 39 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:221: RETURN
                {
                mRETURN(); 


                }
                break;
            case 40 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:228: READ
                {
                mREAD(); 


                }
                break;
            case 41 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:233: WRITE
                {
                mWRITE(); 


                }
                break;
            case 42 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:239: TRUE
                {
                mTRUE(); 


                }
                break;
            case 43 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:244: FALSE
                {
                mFALSE(); 


                }
                break;
            case 44 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:250: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 45 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:256: END
                {
                mEND(); 


                }
                break;
            case 46 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:260: DURATION
                {
                mDURATION(); 


                }
                break;
            case 47 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:269: CREATE
                {
                mCREATE(); 


                }
                break;
            case 48 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:276: GROUP
                {
                mGROUP(); 


                }
                break;
            case 49 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:282: DESTROY
                {
                mDESTROY(); 


                }
                break;
            case 50 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:290: MOVE
                {
                mMOVE(); 


                }
                break;
            case 51 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:295: TRANSLATE
                {
                mTRANSLATE(); 


                }
                break;
            case 52 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:305: MODIFY
                {
                mMODIFY(); 


                }
                break;
            case 53 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:312: ROTATE
                {
                mROTATE(); 


                }
                break;
            case 54 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:319: SCALE
                {
                mSCALE(); 


                }
                break;
            case 55 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:325: SOURCE
                {
                mSOURCE(); 


                }
                break;
            case 56 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:332: TYPE_OBJECT
                {
                mTYPE_OBJECT(); 


                }
                break;
            case 57 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:344: ATTRIBUTE
                {
                mATTRIBUTE(); 


                }
                break;
            case 58 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:354: ID
                {
                mID(); 


                }
                break;
            case 59 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:357: FILE
                {
                mFILE(); 


                }
                break;
            case 60 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:362: INT
                {
                mINT(); 


                }
                break;
            case 61 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:366: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 62 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:373: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 63 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:381: STRING
                {
                mSTRING(); 


                }
                break;
            case 64 :
                // /home/guillem/Dropbox/FIB/Quadri8/CL/SimpleAnimator/Practica-CL/src/parser/Asl.g:1:388: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\12\uffff\1\60\1\uffff\1\62\1\64\3\uffff\1\66\1\uffff\30\53\2\uffff"+
        "\1\136\11\uffff\2\53\1\142\1\143\1\144\40\53\4\uffff\1\u0089\1\u008a"+
        "\3\uffff\2\53\1\u0090\3\53\1\u0094\10\53\1\u009d\23\53\3\uffff\1"+
        "\53\1\u00b4\3\53\1\uffff\3\53\1\uffff\1\u00bc\5\53\1\u00c2\1\u00c3"+
        "\1\uffff\5\53\1\u00c9\2\53\1\u00cc\5\53\1\u00cc\4\53\1\uffff\2\53"+
        "\1\uffff\1\u00d9\3\53\1\u00dd\1\u00de\1\u009d\1\uffff\1\u00df\4"+
        "\53\2\uffff\1\u00e4\2\53\1\u00e7\1\53\1\uffff\2\53\1\uffff\2\53"+
        "\1\u00ed\3\53\1\u009d\1\53\1\u009d\1\uffff\1\u00f3\1\u00f4\1\uffff"+
        "\1\53\1\u00f6\1\53\3\uffff\1\u00f8\1\u00f9\1\53\1\u00fb\1\uffff"+
        "\1\u00fc\1\u00cc\1\uffff\1\53\1\u00fe\1\53\1\u0100\1\53\1\uffff"+
        "\1\u0102\1\53\2\u009d\3\uffff\1\53\1\uffff\1\u0105\2\uffff\1\53"+
        "\2\uffff\1\u0107\1\uffff\1\53\1\uffff\1\53\1\uffff\1\u00cc\1\u010a"+
        "\1\uffff\1\u010b\1\uffff\2\53\2\uffff\1\u010e\1\u00cc\1\uffff";
    static final String DFA14_eofS =
        "\u010f\uffff";
    static final String DFA14_minS =
        "\1\11\11\uffff\1\75\1\uffff\2\75\3\uffff\1\52\1\uffff\1\157\1\156"+
        "\1\162\1\146\1\154\1\150\1\141\1\157\2\145\1\162\1\145\1\151\1\162"+
        "\1\145\1\157\2\145\1\143\1\154\1\151\1\145\1\164\1\157\1\uffff\1"+
        "\0\1\56\11\uffff\1\164\1\144\3\60\1\160\1\163\1\144\2\151\1\144"+
        "\1\162\1\156\1\154\1\144\1\146\1\162\1\141\1\165\1\164\1\147\1\145"+
        "\1\162\1\157\1\163\1\144\1\141\1\170\1\164\1\143\1\141\1\165\1\154"+
        "\1\156\1\151\1\162\1\154\1\0\3\uffff\2\60\3\uffff\1\157\1\145\1"+
        "\60\1\154\2\164\1\60\1\143\1\163\1\165\1\151\1\141\1\165\1\144\1"+
        "\145\1\60\1\151\1\141\1\143\1\165\1\164\1\145\1\151\1\156\1\164"+
        "\1\141\1\164\1\154\1\162\1\151\1\145\1\147\1\154\2\157\1\0\2\uffff"+
        "\1\162\1\60\1\146\1\150\1\157\1\uffff\2\145\1\150\1\uffff\1\60\1"+
        "\145\1\154\1\156\1\164\1\162\2\60\1\uffff\1\156\1\164\1\154\1\160"+
        "\1\162\1\60\1\146\1\163\1\60\1\164\1\141\1\145\1\143\1\160\1\60"+
        "\1\150\1\145\1\153\1\162\1\0\1\164\1\146\1\uffff\1\60\1\151\1\162"+
        "\1\156\3\60\1\uffff\1\60\2\145\1\151\1\156\2\uffff\1\60\2\145\1"+
        "\60\1\157\1\uffff\1\171\1\154\1\uffff\1\145\1\156\1\60\1\145\1\163"+
        "\1\164\1\60\1\145\1\60\1\uffff\2\60\1\uffff\1\154\1\60\1\143\3\uffff"+
        "\2\60\1\157\1\60\1\uffff\2\60\1\uffff\1\171\1\60\1\141\1\60\1\147"+
        "\1\uffff\1\60\1\145\2\60\3\uffff\1\145\1\uffff\1\60\2\uffff\1\156"+
        "\2\uffff\1\60\1\uffff\1\164\1\uffff\1\154\1\uffff\2\60\1\uffff\1"+
        "\60\1\uffff\2\145\2\uffff\2\60\1\uffff";
    static final String DFA14_maxS =
        "\1\175\11\uffff\1\75\1\uffff\2\75\3\uffff\1\57\1\uffff\1\157\1\156"+
        "\1\162\2\156\1\162\1\165\1\157\1\165\1\145\1\170\1\145\2\162\1\145"+
        "\1\157\1\162\2\157\1\154\1\151\1\145\1\164\1\157\1\uffff\1\uffff"+
        "\1\71\11\uffff\1\164\1\144\3\172\1\160\1\163\1\144\2\151\1\144\1"+
        "\162\1\156\1\154\1\144\1\146\1\162\1\164\1\165\1\164\1\147\1\145"+
        "\1\162\1\157\1\163\1\166\1\141\1\170\1\164\1\143\1\141\1\165\1\154"+
        "\1\156\1\151\1\171\1\154\1\uffff\3\uffff\2\172\3\uffff\1\157\1\145"+
        "\1\172\1\154\2\164\1\172\1\143\1\163\1\165\1\151\1\141\1\165\1\144"+
        "\1\145\1\172\1\151\1\141\1\143\1\165\1\164\1\145\1\151\1\156\1\164"+
        "\1\141\1\164\1\154\1\162\1\151\1\145\1\147\1\154\2\157\1\uffff\2"+
        "\uffff\1\162\1\172\1\146\1\150\1\165\1\uffff\2\145\1\150\1\uffff"+
        "\1\172\1\145\1\154\1\156\1\164\1\162\2\172\1\uffff\1\156\1\164\1"+
        "\154\1\160\1\162\1\172\1\146\1\163\1\172\1\164\1\141\1\145\1\143"+
        "\1\160\1\172\1\150\1\145\1\153\1\162\1\uffff\1\164\1\146\1\uffff"+
        "\1\172\1\151\1\162\1\156\3\172\1\uffff\1\172\2\145\1\151\1\156\2"+
        "\uffff\1\172\2\145\1\172\1\157\1\uffff\1\171\1\154\1\uffff\1\145"+
        "\1\156\1\172\1\145\1\163\1\164\1\172\1\145\1\172\1\uffff\2\172\1"+
        "\uffff\1\154\1\172\1\143\3\uffff\2\172\1\157\1\172\1\uffff\2\172"+
        "\1\uffff\1\171\1\172\1\141\1\172\1\147\1\uffff\1\172\1\145\2\172"+
        "\3\uffff\1\145\1\uffff\1\172\2\uffff\1\156\2\uffff\1\172\1\uffff"+
        "\1\164\1\uffff\1\154\1\uffff\2\172\1\uffff\1\172\1\uffff\2\145\2"+
        "\uffff\2\172\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\14\2\uffff"+
        "\1\21\1\22\1\23\1\uffff\1\25\30\uffff\1\72\2\uffff\1\100\1\13\1"+
        "\12\1\16\1\15\1\20\1\17\1\76\1\24\46\uffff\1\77\1\74\1\75\2\uffff"+
        "\1\30\1\31\1\41\44\uffff\1\26\1\27\5\uffff\1\55\3\uffff\1\36\10"+
        "\uffff\1\71\26\uffff\1\32\7\uffff\1\45\5\uffff\1\50\1\52\5\uffff"+
        "\1\62\2\uffff\1\70\11\uffff\1\73\2\uffff\1\34\3\uffff\1\35\1\51"+
        "\1\53\4\uffff\1\54\2\uffff\1\60\5\uffff\1\66\4\uffff\1\73\1\43\1"+
        "\33\1\uffff\1\40\1\uffff\1\42\1\44\1\uffff\1\47\1\57\1\uffff\1\64"+
        "\1\uffff\1\65\1\uffff\1\67\2\uffff\1\46\1\uffff\1\61\2\uffff\1\37"+
        "\1\56\2\uffff\1\63";
    static final String DFA14_specialS =
        "\54\uffff\1\1\57\uffff\1\3\53\uffff\1\0\50\uffff\1\2\135\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\56\2\uffff\1\56\22\uffff\1\56\1\13\1\54\2\uffff\1\22\2\uffff"+
            "\1\1\1\2\1\20\1\16\1\3\1\17\1\4\1\21\12\55\1\5\1\6\1\14\1\12"+
            "\1\15\1\uffff\1\7\2\53\1\37\1\41\1\46\1\53\1\40\4\53\1\47\1"+
            "\42\4\53\1\44\1\45\1\43\6\53\4\uffff\1\53\1\uffff\1\24\1\36"+
            "\1\52\1\33\1\27\1\31\1\53\1\50\1\26\3\53\1\32\1\23\1\25\2\53"+
            "\1\34\1\51\1\35\2\53\1\30\3\53\1\10\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "",
            "\1\61",
            "\1\63",
            "",
            "",
            "",
            "\1\65\4\uffff\1\65",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72\6\uffff\1\74\1\73",
            "\1\75\1\uffff\1\76",
            "\1\77\1\101\10\uffff\1\100",
            "\1\104\15\uffff\1\102\5\uffff\1\103",
            "\1\105",
            "\1\106\17\uffff\1\107",
            "\1\110",
            "\1\111\5\uffff\1\112",
            "\1\113",
            "\1\115\10\uffff\1\114",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\122\14\uffff\1\121",
            "\1\124\11\uffff\1\123",
            "\1\125\13\uffff\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\55\135\1\134\2\135\12\134\7\135\32\134\4\135\1\134\1\135\32"+
            "\134\uff85\135",
            "\1\137\1\uffff\12\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\140",
            "\1\141",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\162\22\uffff\1\161",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\173\21\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0086\6\uffff\1\u0085",
            "\1\u0087",
            "\55\135\1\134\1\u0088\1\135\12\134\7\135\32\134\4\135\1\134"+
            "\1\135\32\134\uff85\135",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\5\53\1\u008f\2\53"+
            "\1\u008d\15\53\1\u008e\3\53",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\60\135\12\u00b1\7\135\32\u00b1\4\135\1\u00b1\1\135\32\u00b1"+
            "\uff85\135",
            "",
            "",
            "\1\u00b2",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u00b3\21"+
            "\53",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7\5\uffff\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ca",
            "\1\u00cb",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\42\135\1\u00d6\15\135\12\u00b1\7\135\32\u00b1\4\135\1\u00b1"+
            "\1\135\32\u00b1\uff85\135",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00e5",
            "\1\u00e6",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f1",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00f5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f7",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00fa",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00fd",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ff",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0101",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0103",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\1\u0104",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u0106",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0108",
            "",
            "\1\u0109",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u010c",
            "\1\u010d",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | EQUAL | COND_EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | ELSEIF | ENDIF | WHILE | FOR | ENDWHILE | ENDFOR | IN | MODULE | IMPORT | DEFINE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | BEGIN | END | DURATION | CREATE | GROUP | DESTROY | MOVE | TRANSLATE | MODIFY | ROTATE | SCALE | SOURCE | TYPE_OBJECT | ATTRIBUTE | ID | FILE | INT | DOUBLE | COMMENT | STRING | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_136 = input.LA(1);

                        s = -1;
                        if ( ((LA14_136 >= '0' && LA14_136 <= '9')||(LA14_136 >= 'A' && LA14_136 <= 'Z')||LA14_136=='_'||(LA14_136 >= 'a' && LA14_136 <= 'z')) ) {s = 177;}

                        else if ( ((LA14_136 >= '\u0000' && LA14_136 <= '/')||(LA14_136 >= ':' && LA14_136 <= '@')||(LA14_136 >= '[' && LA14_136 <= '^')||LA14_136=='`'||(LA14_136 >= '{' && LA14_136 <= '\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA14_44 = input.LA(1);

                        s = -1;
                        if ( (LA14_44=='-'||(LA14_44 >= '0' && LA14_44 <= '9')||(LA14_44 >= 'A' && LA14_44 <= 'Z')||LA14_44=='_'||(LA14_44 >= 'a' && LA14_44 <= 'z')) ) {s = 92;}

                        else if ( ((LA14_44 >= '\u0000' && LA14_44 <= ',')||(LA14_44 >= '.' && LA14_44 <= '/')||(LA14_44 >= ':' && LA14_44 <= '@')||(LA14_44 >= '[' && LA14_44 <= '^')||LA14_44=='`'||(LA14_44 >= '{' && LA14_44 <= '\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA14_177 = input.LA(1);

                        s = -1;
                        if ( (LA14_177=='\"') ) {s = 214;}

                        else if ( ((LA14_177 >= '0' && LA14_177 <= '9')||(LA14_177 >= 'A' && LA14_177 <= 'Z')||LA14_177=='_'||(LA14_177 >= 'a' && LA14_177 <= 'z')) ) {s = 177;}

                        else if ( ((LA14_177 >= '\u0000' && LA14_177 <= '!')||(LA14_177 >= '#' && LA14_177 <= '/')||(LA14_177 >= ':' && LA14_177 <= '@')||(LA14_177 >= '[' && LA14_177 <= '^')||LA14_177=='`'||(LA14_177 >= '{' && LA14_177 <= '\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA14_92 = input.LA(1);

                        s = -1;
                        if ( (LA14_92=='.') ) {s = 136;}

                        else if ( (LA14_92=='-'||(LA14_92 >= '0' && LA14_92 <= '9')||(LA14_92 >= 'A' && LA14_92 <= 'Z')||LA14_92=='_'||(LA14_92 >= 'a' && LA14_92 <= 'z')) ) {s = 92;}

                        else if ( ((LA14_92 >= '\u0000' && LA14_92 <= ',')||LA14_92=='/'||(LA14_92 >= ':' && LA14_92 <= '@')||(LA14_92 >= '[' && LA14_92 <= '^')||LA14_92=='`'||(LA14_92 >= '{' && LA14_92 <= '\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}