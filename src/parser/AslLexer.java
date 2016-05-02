// $ANTLR 3.4 /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g 2016-05-02 08:50:56

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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
    public String getGrammarFileName() { return "/home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g"; }

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:7:7: ( ')' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:7:9: ')'
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:8:7: ( ',' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:8:9: ','
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:9:7: ( '.' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:9:9: '.'
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:10:7: ( ';' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:10:9: ';'
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:11:7: ( '@' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:11:9: '@'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:12:7: ( '{' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:12:9: '{'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:13:7: ( '}' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:13:9: '}'
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
    // $ANTLR end "T__70"

    // $ANTLR start "ENDLINE"
    public final void mENDLINE() throws RecognitionException {
        try {
            int _type = ENDLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:193:9: ( '\\n' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:193:11: '\\n'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:194:7: ( '=' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:194:9: '='
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:195:12: ( '==' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:195:14: '=='
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:196:10: ( '!=' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:196:12: '!='
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:197:4: ( '<' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:197:6: '<'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:198:4: ( '<=' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:198:6: '<='
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:199:4: ( '>' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:199:6: '>'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:200:4: ( '>=' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:200:6: '>='
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:201:6: ( '+' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:201:8: '+'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:202:7: ( '-' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:202:9: '-'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:203:5: ( '*' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:203:7: '*'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:204:5: ( '/' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:204:7: '/'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:205:5: ( '%' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:205:7: '%'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:206:5: ( 'not' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:206:7: 'not'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:207:5: ( 'and' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:207:7: 'and'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:208:4: ( 'or' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:208:6: 'or'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:209:4: ( 'if' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:209:6: 'if'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:210:6: ( 'else' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:210:8: 'else'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:211:8: ( 'elseif' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:211:10: 'elseif'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:212:7: ( 'endif' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:212:9: 'endif'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:213:7: ( 'while' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:213:9: 'while'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:214:5: ( 'for' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:214:7: 'for'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:215:9: ( 'endwhile' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:215:11: 'endwhile'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:216:8: ( 'endfor' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:216:10: 'endfor'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:217:6: ( 'func' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:217:8: 'func'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:218:9: ( 'endfunc' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:218:11: 'endfunc'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:219:8: ( 'return' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:219:10: 'return'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:220:6: ( 'read' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:220:8: 'read'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:221:7: ( 'write' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:221:9: 'write'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:222:6: ( 'true' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:222:8: 'true'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:223:7: ( 'false' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:223:9: 'false'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:224:7: ( 'begin' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:224:9: 'begin'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:225:5: ( 'end' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:225:7: 'end'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:226:9: ( 'duration' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:226:11: 'duration'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:227:8: ( 'Create' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:227:10: 'Create'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:228:9: ( 'Destroy' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:228:11: 'Destroy'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:229:6: ( 'Move' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:229:8: 'Move'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:230:11: ( 'Translate' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:230:13: 'Translate'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:231:8: ( 'Modify' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:231:10: 'Modify'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:232:8: ( 'Rotate' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:232:10: 'Rotate'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:233:13: ( 'Rectangle' | 'Circle' | 'Text' )
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:233:15: 'Rectangle'
                    {
                    match("Rectangle"); 



                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:233:29: 'Circle'
                    {
                    match("Circle"); 



                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:233:40: 'Text'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:234:11: ( 'width' | 'height' | 'style' | 'color' )
            int alt2=4;
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
            case 'c':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:234:13: 'width'
                    {
                    match("width"); 



                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:234:23: 'height'
                    {
                    match("height"); 



                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:234:34: 'style'
                    {
                    match("style"); 



                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:234:44: 'color'
                    {
                    match("color"); 



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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:235:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:235:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:235:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:236:5: ( ( '0' .. '9' )+ )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:236:9: ( '0' .. '9' )+
            {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:236:9: ( '0' .. '9' )+
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
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:238:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:238:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:238:16: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:
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


                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:238:30: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:238:30: '\\r'
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:239:3: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:239:8: ( options {greedy=false; } : . )*
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
                    	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:239:36: .
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:242:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:242:10: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:242:14: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:242:16: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:242:26: ~ ( '\\\\' | '\"' )
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:248:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:248:3: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:251:9: ( ( ' ' | '\\t' | '\\r' ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:251:11: ( ' ' | '\\t' | '\\r' )
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
        // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:8: ( T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | ENDLINE | EQUAL | COND_EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | ELSEIF | ENDIF | WHILE | FOR | ENDWHILE | ENDFOR | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | BEGIN | END | DURATION | CREATE | DESTROY | MOVE | TRANSLATE | MODIFY | ROTATE | TYPE_OBJECT | ATTRIBUTE | ID | INT | COMMENT | STRING | WS )
        int alt10=55;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:10: T__63
                {
                mT__63(); 


                }
                break;
            case 2 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:16: T__64
                {
                mT__64(); 


                }
                break;
            case 3 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:22: T__65
                {
                mT__65(); 


                }
                break;
            case 4 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:28: T__66
                {
                mT__66(); 


                }
                break;
            case 5 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:34: T__67
                {
                mT__67(); 


                }
                break;
            case 6 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:40: T__68
                {
                mT__68(); 


                }
                break;
            case 7 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:46: T__69
                {
                mT__69(); 


                }
                break;
            case 8 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:52: T__70
                {
                mT__70(); 


                }
                break;
            case 9 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:58: ENDLINE
                {
                mENDLINE(); 


                }
                break;
            case 10 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:66: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 11 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:72: COND_EQUAL
                {
                mCOND_EQUAL(); 


                }
                break;
            case 12 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:83: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 13 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:93: LT
                {
                mLT(); 


                }
                break;
            case 14 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:96: LE
                {
                mLE(); 


                }
                break;
            case 15 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:99: GT
                {
                mGT(); 


                }
                break;
            case 16 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:102: GE
                {
                mGE(); 


                }
                break;
            case 17 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:105: PLUS
                {
                mPLUS(); 


                }
                break;
            case 18 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:110: MINUS
                {
                mMINUS(); 


                }
                break;
            case 19 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:116: MUL
                {
                mMUL(); 


                }
                break;
            case 20 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:120: DIV
                {
                mDIV(); 


                }
                break;
            case 21 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:124: MOD
                {
                mMOD(); 


                }
                break;
            case 22 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:128: NOT
                {
                mNOT(); 


                }
                break;
            case 23 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:132: AND
                {
                mAND(); 


                }
                break;
            case 24 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:136: OR
                {
                mOR(); 


                }
                break;
            case 25 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:139: IF
                {
                mIF(); 


                }
                break;
            case 26 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:142: ELSE
                {
                mELSE(); 


                }
                break;
            case 27 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:147: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 28 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:154: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 29 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:160: WHILE
                {
                mWHILE(); 


                }
                break;
            case 30 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:166: FOR
                {
                mFOR(); 


                }
                break;
            case 31 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:170: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 32 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:179: ENDFOR
                {
                mENDFOR(); 


                }
                break;
            case 33 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:186: FUNC
                {
                mFUNC(); 


                }
                break;
            case 34 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:191: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 35 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:199: RETURN
                {
                mRETURN(); 


                }
                break;
            case 36 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:206: READ
                {
                mREAD(); 


                }
                break;
            case 37 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:211: WRITE
                {
                mWRITE(); 


                }
                break;
            case 38 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:217: TRUE
                {
                mTRUE(); 


                }
                break;
            case 39 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:222: FALSE
                {
                mFALSE(); 


                }
                break;
            case 40 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:228: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 41 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:234: END
                {
                mEND(); 


                }
                break;
            case 42 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:238: DURATION
                {
                mDURATION(); 


                }
                break;
            case 43 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:247: CREATE
                {
                mCREATE(); 


                }
                break;
            case 44 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:254: DESTROY
                {
                mDESTROY(); 


                }
                break;
            case 45 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:262: MOVE
                {
                mMOVE(); 


                }
                break;
            case 46 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:267: TRANSLATE
                {
                mTRANSLATE(); 


                }
                break;
            case 47 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:277: MODIFY
                {
                mMODIFY(); 


                }
                break;
            case 48 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:284: ROTATE
                {
                mROTATE(); 


                }
                break;
            case 49 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:291: TYPE_OBJECT
                {
                mTYPE_OBJECT(); 


                }
                break;
            case 50 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:303: ATTRIBUTE
                {
                mATTRIBUTE(); 


                }
                break;
            case 51 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:313: ID
                {
                mID(); 


                }
                break;
            case 52 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:316: INT
                {
                mINT(); 


                }
                break;
            case 53 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:320: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 54 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:328: STRING
                {
                mSTRING(); 


                }
                break;
            case 55 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:335: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\12\uffff\1\53\1\uffff\1\55\1\57\3\uffff\1\61\1\uffff\23\46\14\uffff"+
        "\2\46\1\117\1\120\27\46\1\152\1\153\2\uffff\1\46\1\160\3\46\1\164"+
        "\23\46\2\uffff\1\u0089\3\46\1\uffff\3\46\1\uffff\1\u0091\2\46\1"+
        "\u0094\1\u0095\5\46\1\u009b\2\46\1\u009e\6\46\1\uffff\1\u00a5\3"+
        "\46\1\u00a9\1\u00aa\1\u00ab\1\uffff\1\u00ac\1\46\2\uffff\1\u00ae"+
        "\4\46\1\uffff\2\46\1\uffff\3\46\2\u00ab\1\u00b8\1\uffff\1\46\1\u00ba"+
        "\1\46\4\uffff\1\u00bc\1\uffff\1\46\1\u00be\1\u009e\1\46\1\u00c0"+
        "\1\46\1\u00c2\1\46\1\u00ab\1\uffff\1\46\1\uffff\1\u00c5\1\uffff"+
        "\1\46\1\uffff\1\u00c7\1\uffff\1\46\1\uffff\1\46\1\u00ca\1\uffff"+
        "\1\u00cb\1\uffff\2\46\2\uffff\1\u00ce\1\u009e\1\uffff";
    static final String DFA10_eofS =
        "\u00cf\uffff";
    static final String DFA10_minS =
        "\1\11\11\uffff\1\75\1\uffff\2\75\3\uffff\1\52\1\uffff\1\157\1\156"+
        "\1\162\1\146\1\154\1\150\1\141\1\145\1\162\1\145\1\165\1\151\1\145"+
        "\1\157\3\145\1\164\1\157\14\uffff\1\164\1\144\2\60\1\163\1\144\2"+
        "\151\1\144\1\162\1\156\1\154\1\141\1\165\1\147\1\162\1\145\1\162"+
        "\1\163\1\144\1\141\1\170\1\164\1\143\1\151\1\171\1\154\2\60\2\uffff"+
        "\1\145\1\60\1\154\2\164\1\60\1\143\1\163\1\165\1\144\1\145\1\151"+
        "\2\141\1\143\1\164\1\145\1\151\1\156\1\164\1\141\1\164\1\147\1\154"+
        "\1\157\2\uffff\1\60\1\146\1\150\1\157\1\uffff\2\145\1\150\1\uffff"+
        "\1\60\1\145\1\162\2\60\1\156\2\164\1\154\1\162\1\60\1\146\1\163"+
        "\1\60\1\164\1\141\1\150\1\145\1\162\1\146\1\uffff\1\60\1\151\1\162"+
        "\1\156\3\60\1\uffff\1\60\1\156\2\uffff\1\60\1\151\2\145\1\157\1"+
        "\uffff\1\171\1\154\1\uffff\1\145\1\156\1\164\3\60\1\uffff\1\154"+
        "\1\60\1\143\4\uffff\1\60\1\uffff\1\157\2\60\1\171\1\60\1\141\1\60"+
        "\1\147\1\60\1\uffff\1\145\1\uffff\1\60\1\uffff\1\156\1\uffff\1\60"+
        "\1\uffff\1\164\1\uffff\1\154\1\60\1\uffff\1\60\1\uffff\2\145\2\uffff"+
        "\2\60\1\uffff";
    static final String DFA10_maxS =
        "\1\175\11\uffff\1\75\1\uffff\2\75\3\uffff\1\57\1\uffff\1\157\1\156"+
        "\1\162\1\146\1\156\1\162\1\165\1\145\1\162\1\145\1\165\1\162\1\145"+
        "\1\157\1\162\1\157\1\145\1\164\1\157\14\uffff\1\164\1\144\2\172"+
        "\1\163\1\144\2\151\1\144\1\162\1\156\1\154\1\164\1\165\1\147\1\162"+
        "\1\145\1\162\1\163\1\166\1\141\1\170\1\164\1\143\1\151\1\171\1\154"+
        "\2\172\2\uffff\1\145\1\172\1\154\2\164\1\172\1\143\1\163\1\165\1"+
        "\144\1\145\1\151\2\141\1\143\1\164\1\145\1\151\1\156\1\164\1\141"+
        "\1\164\1\147\1\154\1\157\2\uffff\1\172\1\146\1\150\1\165\1\uffff"+
        "\2\145\1\150\1\uffff\1\172\1\145\1\162\2\172\1\156\2\164\1\154\1"+
        "\162\1\172\1\146\1\163\1\172\1\164\1\141\1\150\1\145\1\162\1\146"+
        "\1\uffff\1\172\1\151\1\162\1\156\3\172\1\uffff\1\172\1\156\2\uffff"+
        "\1\172\1\151\2\145\1\157\1\uffff\1\171\1\154\1\uffff\1\145\1\156"+
        "\1\164\3\172\1\uffff\1\154\1\172\1\143\4\uffff\1\172\1\uffff\1\157"+
        "\2\172\1\171\1\172\1\141\1\172\1\147\1\172\1\uffff\1\145\1\uffff"+
        "\1\172\1\uffff\1\156\1\uffff\1\172\1\uffff\1\164\1\uffff\1\154\1"+
        "\172\1\uffff\1\172\1\uffff\2\145\2\uffff\2\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\14\2\uffff"+
        "\1\21\1\22\1\23\1\uffff\1\25\23\uffff\1\63\1\64\1\66\1\67\1\13\1"+
        "\12\1\16\1\15\1\20\1\17\1\65\1\24\35\uffff\1\30\1\31\31\uffff\1"+
        "\26\1\27\4\uffff\1\51\3\uffff\1\36\24\uffff\1\32\7\uffff\1\41\2"+
        "\uffff\1\44\1\46\5\uffff\1\55\2\uffff\1\61\6\uffff\1\34\3\uffff"+
        "\1\35\1\45\1\62\1\47\1\uffff\1\50\11\uffff\1\33\1\uffff\1\40\1\uffff"+
        "\1\43\1\uffff\1\53\1\uffff\1\57\1\uffff\1\60\2\uffff\1\42\1\uffff"+
        "\1\54\2\uffff\1\37\1\52\2\uffff\1\56";
    static final String DFA10_specialS =
        "\u00cf\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\51\1\11\2\uffff\1\51\22\uffff\1\51\1\13\1\50\2\uffff\1\22"+
            "\2\uffff\1\1\1\2\1\20\1\16\1\3\1\17\1\4\1\21\12\47\1\uffff\1"+
            "\5\1\14\1\12\1\15\1\uffff\1\6\2\46\1\36\1\37\10\46\1\40\4\46"+
            "\1\42\1\46\1\41\6\46\4\uffff\1\46\1\uffff\1\24\1\34\1\45\1\35"+
            "\1\27\1\31\1\46\1\43\1\26\4\46\1\23\1\25\2\46\1\32\1\44\1\33"+
            "\2\46\1\30\3\46\1\7\1\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "",
            "\1\54",
            "\1\56",
            "",
            "",
            "",
            "\1\60\4\uffff\1\60",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66\1\uffff\1\67",
            "\1\70\1\72\10\uffff\1\71",
            "\1\75\15\uffff\1\73\5\uffff\1\74",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\103\10\uffff\1\102",
            "\1\104",
            "\1\105",
            "\1\107\14\uffff\1\106",
            "\1\111\11\uffff\1\110",
            "\1\112",
            "\1\113",
            "\1\114",
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
            "\1\115",
            "\1\116",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\132\22\uffff\1\131",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\142\21\uffff\1\141",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\154",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\5\46\1\157\2\46\1"+
            "\155\15\46\1\156\3\46",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
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
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\u0088\21"+
            "\46",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c\5\uffff\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0092",
            "\1\u0093",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009c",
            "\1\u009d",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ad",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00b9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00bb",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00bd",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00bf",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c1",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c3",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00c4",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00c6",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
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
            return "1:1: Tokens : ( T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | ENDLINE | EQUAL | COND_EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | ELSEIF | ENDIF | WHILE | FOR | ENDWHILE | ENDFOR | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | BEGIN | END | DURATION | CREATE | DESTROY | MOVE | TRANSLATE | MODIFY | ROTATE | TYPE_OBJECT | ATTRIBUTE | ID | INT | COMMENT | STRING | WS );";
        }
    }
 

}