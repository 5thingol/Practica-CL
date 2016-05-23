// $ANTLR 3.4 /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g 2016-05-23 09:13:50

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:10:7: ( ':' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:10:9: ':'
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:11:7: ( ';' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:11:9: ';'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:12:7: ( '@' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:12:9: '@'
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:13:7: ( '{' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:13:9: '{'
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:14:7: ( '}' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:14:9: '}'
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
    // $ANTLR end "T__73"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:199:7: ( '=' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:199:9: '='
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:200:12: ( '==' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:200:14: '=='
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:201:10: ( '!=' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:201:12: '!='
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:202:4: ( '<' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:202:6: '<'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:203:4: ( '<=' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:203:6: '<='
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:204:4: ( '>' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:204:6: '>'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:205:4: ( '>=' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:205:6: '>='
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:206:6: ( '+' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:206:8: '+'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:207:7: ( '-' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:207:9: '-'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:208:5: ( '*' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:208:7: '*'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:209:5: ( '/' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:209:7: '/'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:210:5: ( '%' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:210:7: '%'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:211:5: ( 'not' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:211:7: 'not'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:212:5: ( 'and' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:212:7: 'and'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:213:4: ( 'or' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:213:6: 'or'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:214:4: ( 'if' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:214:6: 'if'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:215:6: ( 'else' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:215:8: 'else'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:216:8: ( 'elseif' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:216:10: 'elseif'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:217:7: ( 'endif' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:217:9: 'endif'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:218:7: ( 'while' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:218:9: 'while'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:219:5: ( 'for' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:219:7: 'for'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:220:9: ( 'endwhile' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:220:11: 'endwhile'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:221:8: ( 'endfor' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:221:10: 'endfor'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:222:4: ( 'in' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:222:9: 'in'
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

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:223:6: ( 'func' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:223:8: 'func'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:224:9: ( 'endfunc' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:224:11: 'endfunc'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:225:8: ( 'return' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:225:10: 'return'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:226:6: ( 'read' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:226:8: 'read'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:227:7: ( 'write' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:227:9: 'write'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:228:6: ( 'true' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:228:8: 'true'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:229:7: ( 'false' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:229:9: 'false'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:230:7: ( 'begin' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:230:9: 'begin'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:231:5: ( 'end' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:231:7: 'end'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:232:9: ( 'duration' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:232:11: 'duration'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:233:8: ( 'Create' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:233:10: 'Create'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:234:9: ( 'Destroy' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:234:11: 'Destroy'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:235:6: ( 'Move' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:235:8: 'Move'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:236:11: ( 'Translate' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:236:13: 'Translate'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:237:8: ( 'Modify' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:237:10: 'Modify'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:238:8: ( 'Rotate' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:238:10: 'Rotate'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:239:13: ( 'Rectangle' | 'Circle' | 'Text' | 'Ellipse' | 'Line' )
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:239:15: 'Rectangle'
                    {
                    match("Rectangle"); 



                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:239:29: 'Circle'
                    {
                    match("Circle"); 



                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:239:40: 'Text'
                    {
                    match("Text"); 



                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:239:49: 'Ellipse'
                    {
                    match("Ellipse"); 



                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:239:61: 'Line'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:240:11: ( 'width' | 'height' | 'style' | 'color' )
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:240:13: 'width'
                    {
                    match("width"); 



                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:240:23: 'height'
                    {
                    match("height"); 



                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:240:34: 'style'
                    {
                    match("style"); 



                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:240:44: 'color'
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:241:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:241:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:241:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:242:5: ( ( '0' .. '9' )+ )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:242:9: ( '0' .. '9' )+
            {
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:242:9: ( '0' .. '9' )+
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:244:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:244:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:244:16: (~ ( '\\n' | '\\r' ) )*
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


                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:244:30: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:244:30: '\\r'
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
                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:245:3: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:245:8: ( options {greedy=false; } : . )*
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
                    	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:245:36: .
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:248:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:248:10: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:248:14: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:248:16: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:248:26: ~ ( '\\\\' | '\"' )
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:254:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:254:3: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:257:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:257:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:8: ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | EQUAL | COND_EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | ELSEIF | ENDIF | WHILE | FOR | ENDWHILE | ENDFOR | IN | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | BEGIN | END | DURATION | CREATE | DESTROY | MOVE | TRANSLATE | MODIFY | ROTATE | TYPE_OBJECT | ATTRIBUTE | ID | INT | COMMENT | STRING | WS )
        int alt10=56;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:10: T__65
                {
                mT__65(); 


                }
                break;
            case 2 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:16: T__66
                {
                mT__66(); 


                }
                break;
            case 3 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:22: T__67
                {
                mT__67(); 


                }
                break;
            case 4 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:28: T__68
                {
                mT__68(); 


                }
                break;
            case 5 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:34: T__69
                {
                mT__69(); 


                }
                break;
            case 6 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:40: T__70
                {
                mT__70(); 


                }
                break;
            case 7 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:46: T__71
                {
                mT__71(); 


                }
                break;
            case 8 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:52: T__72
                {
                mT__72(); 


                }
                break;
            case 9 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:58: T__73
                {
                mT__73(); 


                }
                break;
            case 10 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:64: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 11 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:70: COND_EQUAL
                {
                mCOND_EQUAL(); 


                }
                break;
            case 12 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:81: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 13 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:91: LT
                {
                mLT(); 


                }
                break;
            case 14 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:94: LE
                {
                mLE(); 


                }
                break;
            case 15 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:97: GT
                {
                mGT(); 


                }
                break;
            case 16 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:100: GE
                {
                mGE(); 


                }
                break;
            case 17 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:103: PLUS
                {
                mPLUS(); 


                }
                break;
            case 18 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:108: MINUS
                {
                mMINUS(); 


                }
                break;
            case 19 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:114: MUL
                {
                mMUL(); 


                }
                break;
            case 20 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:118: DIV
                {
                mDIV(); 


                }
                break;
            case 21 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:122: MOD
                {
                mMOD(); 


                }
                break;
            case 22 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:126: NOT
                {
                mNOT(); 


                }
                break;
            case 23 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:130: AND
                {
                mAND(); 


                }
                break;
            case 24 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:134: OR
                {
                mOR(); 


                }
                break;
            case 25 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:137: IF
                {
                mIF(); 


                }
                break;
            case 26 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:140: ELSE
                {
                mELSE(); 


                }
                break;
            case 27 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:145: ELSEIF
                {
                mELSEIF(); 


                }
                break;
            case 28 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:152: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 29 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:158: WHILE
                {
                mWHILE(); 


                }
                break;
            case 30 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:164: FOR
                {
                mFOR(); 


                }
                break;
            case 31 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:168: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 32 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:177: ENDFOR
                {
                mENDFOR(); 


                }
                break;
            case 33 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:184: IN
                {
                mIN(); 


                }
                break;
            case 34 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:187: FUNC
                {
                mFUNC(); 


                }
                break;
            case 35 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:192: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 36 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:200: RETURN
                {
                mRETURN(); 


                }
                break;
            case 37 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:207: READ
                {
                mREAD(); 


                }
                break;
            case 38 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:212: WRITE
                {
                mWRITE(); 


                }
                break;
            case 39 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:218: TRUE
                {
                mTRUE(); 


                }
                break;
            case 40 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:223: FALSE
                {
                mFALSE(); 


                }
                break;
            case 41 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:229: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 42 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:235: END
                {
                mEND(); 


                }
                break;
            case 43 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:239: DURATION
                {
                mDURATION(); 


                }
                break;
            case 44 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:248: CREATE
                {
                mCREATE(); 


                }
                break;
            case 45 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:255: DESTROY
                {
                mDESTROY(); 


                }
                break;
            case 46 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:263: MOVE
                {
                mMOVE(); 


                }
                break;
            case 47 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:268: TRANSLATE
                {
                mTRANSLATE(); 


                }
                break;
            case 48 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:278: MODIFY
                {
                mMODIFY(); 


                }
                break;
            case 49 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:285: ROTATE
                {
                mROTATE(); 


                }
                break;
            case 50 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:292: TYPE_OBJECT
                {
                mTYPE_OBJECT(); 


                }
                break;
            case 51 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:304: ATTRIBUTE
                {
                mATTRIBUTE(); 


                }
                break;
            case 52 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:314: ID
                {
                mID(); 


                }
                break;
            case 53 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:317: INT
                {
                mINT(); 


                }
                break;
            case 54 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:321: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 55 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:329: STRING
                {
                mSTRING(); 


                }
                break;
            case 56 :
                // /home2/users/alumnes/1171466/dades/8equadri/CL/Practica/SimpleAnimator/src/parser/Asl.g:1:336: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\12\uffff\1\55\1\uffff\1\57\1\61\3\uffff\1\63\1\uffff\25\50\14\uffff"+
        "\2\50\1\124\1\125\1\126\31\50\1\162\1\163\3\uffff\1\50\1\170\3\50"+
        "\1\174\25\50\2\uffff\1\u0093\3\50\1\uffff\3\50\1\uffff\1\u009b\2"+
        "\50\1\u009e\1\u009f\5\50\1\u00a5\2\50\1\u00a8\3\50\1\u00a8\4\50"+
        "\1\uffff\1\u00b0\3\50\1\u00b4\1\u00b5\1\u00b6\1\uffff\1\u00b7\1"+
        "\50\2\uffff\1\u00b9\4\50\1\uffff\2\50\1\uffff\4\50\2\u00b6\1\u00c4"+
        "\1\uffff\1\50\1\u00c6\1\50\4\uffff\1\u00c8\1\uffff\1\50\1\u00ca"+
        "\1\u00a8\1\50\1\u00cc\1\50\1\u00ce\2\50\1\u00b6\1\uffff\1\50\1\uffff"+
        "\1\u00d2\1\uffff\1\50\1\uffff\1\u00d4\1\uffff\1\50\1\uffff\1\50"+
        "\1\u00a8\1\u00d7\1\uffff\1\u00d8\1\uffff\2\50\2\uffff\1\u00db\1"+
        "\u00a8\1\uffff";
    static final String DFA10_eofS =
        "\u00dc\uffff";
    static final String DFA10_minS =
        "\1\11\11\uffff\1\75\1\uffff\2\75\3\uffff\1\52\1\uffff\1\157\1\156"+
        "\1\162\1\146\1\154\1\150\1\141\1\145\1\162\1\145\1\165\1\151\1\145"+
        "\1\157\2\145\1\154\1\151\1\145\1\164\1\157\14\uffff\1\164\1\144"+
        "\3\60\1\163\1\144\2\151\1\144\1\162\1\156\1\154\1\141\1\165\1\147"+
        "\1\162\1\145\1\162\1\163\1\144\1\141\1\170\1\164\1\143\1\154\1\156"+
        "\1\151\1\171\1\154\2\60\3\uffff\1\145\1\60\1\154\2\164\1\60\1\143"+
        "\1\163\1\165\1\144\1\145\1\151\2\141\1\143\1\164\1\145\1\151\1\156"+
        "\1\164\1\141\1\164\1\151\1\145\1\147\1\154\1\157\2\uffff\1\60\1"+
        "\146\1\150\1\157\1\uffff\2\145\1\150\1\uffff\1\60\1\145\1\162\2"+
        "\60\1\156\2\164\1\154\1\162\1\60\1\146\1\163\1\60\1\164\1\141\1"+
        "\160\1\60\1\150\1\145\1\162\1\146\1\uffff\1\60\1\151\1\162\1\156"+
        "\3\60\1\uffff\1\60\1\156\2\uffff\1\60\1\151\2\145\1\157\1\uffff"+
        "\1\171\1\154\1\uffff\1\145\1\156\1\163\1\164\3\60\1\uffff\1\154"+
        "\1\60\1\143\4\uffff\1\60\1\uffff\1\157\2\60\1\171\1\60\1\141\1\60"+
        "\1\147\1\145\1\60\1\uffff\1\145\1\uffff\1\60\1\uffff\1\156\1\uffff"+
        "\1\60\1\uffff\1\164\1\uffff\1\154\2\60\1\uffff\1\60\1\uffff\2\145"+
        "\2\uffff\2\60\1\uffff";
    static final String DFA10_maxS =
        "\1\175\11\uffff\1\75\1\uffff\2\75\3\uffff\1\57\1\uffff\1\157\1\156"+
        "\1\162\2\156\1\162\1\165\1\145\1\162\1\145\1\165\1\162\1\145\1\157"+
        "\1\162\1\157\1\154\1\151\1\145\1\164\1\157\14\uffff\1\164\1\144"+
        "\3\172\1\163\1\144\2\151\1\144\1\162\1\156\1\154\1\164\1\165\1\147"+
        "\1\162\1\145\1\162\1\163\1\166\1\141\1\170\1\164\1\143\1\154\1\156"+
        "\1\151\1\171\1\154\2\172\3\uffff\1\145\1\172\1\154\2\164\1\172\1"+
        "\143\1\163\1\165\1\144\1\145\1\151\2\141\1\143\1\164\1\145\1\151"+
        "\1\156\1\164\1\141\1\164\1\151\1\145\1\147\1\154\1\157\2\uffff\1"+
        "\172\1\146\1\150\1\165\1\uffff\2\145\1\150\1\uffff\1\172\1\145\1"+
        "\162\2\172\1\156\2\164\1\154\1\162\1\172\1\146\1\163\1\172\1\164"+
        "\1\141\1\160\1\172\1\150\1\145\1\162\1\146\1\uffff\1\172\1\151\1"+
        "\162\1\156\3\172\1\uffff\1\172\1\156\2\uffff\1\172\1\151\2\145\1"+
        "\157\1\uffff\1\171\1\154\1\uffff\1\145\1\156\1\163\1\164\3\172\1"+
        "\uffff\1\154\1\172\1\143\4\uffff\1\172\1\uffff\1\157\2\172\1\171"+
        "\1\172\1\141\1\172\1\147\1\145\1\172\1\uffff\1\145\1\uffff\1\172"+
        "\1\uffff\1\156\1\uffff\1\172\1\uffff\1\164\1\uffff\1\154\2\172\1"+
        "\uffff\1\172\1\uffff\2\145\2\uffff\2\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\14\2\uffff"+
        "\1\21\1\22\1\23\1\uffff\1\25\25\uffff\1\64\1\65\1\67\1\70\1\13\1"+
        "\12\1\16\1\15\1\20\1\17\1\66\1\24\40\uffff\1\30\1\31\1\41\33\uffff"+
        "\1\26\1\27\4\uffff\1\52\3\uffff\1\36\26\uffff\1\32\7\uffff\1\42"+
        "\2\uffff\1\45\1\47\5\uffff\1\56\2\uffff\1\62\7\uffff\1\34\3\uffff"+
        "\1\35\1\46\1\63\1\50\1\uffff\1\51\12\uffff\1\33\1\uffff\1\40\1\uffff"+
        "\1\44\1\uffff\1\54\1\uffff\1\60\1\uffff\1\61\3\uffff\1\43\1\uffff"+
        "\1\55\2\uffff\1\37\1\53\2\uffff\1\57";
    static final String DFA10_specialS =
        "\u00dc\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\13\1\52\2\uffff\1\22\2\uffff"+
            "\1\1\1\2\1\20\1\16\1\3\1\17\1\4\1\21\12\51\1\5\1\6\1\14\1\12"+
            "\1\15\1\uffff\1\7\2\50\1\36\1\37\1\43\6\50\1\44\1\40\4\50\1"+
            "\42\1\50\1\41\6\50\4\uffff\1\50\1\uffff\1\24\1\34\1\47\1\35"+
            "\1\27\1\31\1\50\1\45\1\26\4\50\1\23\1\25\2\50\1\32\1\46\1\33"+
            "\2\50\1\30\3\50\1\10\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "",
            "\1\56",
            "\1\60",
            "",
            "",
            "",
            "\1\62\4\uffff\1\62",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67\7\uffff\1\70",
            "\1\71\1\uffff\1\72",
            "\1\73\1\75\10\uffff\1\74",
            "\1\100\15\uffff\1\76\5\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\106\10\uffff\1\105",
            "\1\107",
            "\1\110",
            "\1\112\14\uffff\1\111",
            "\1\114\11\uffff\1\113",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
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
            "\1\122",
            "\1\123",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\140\22\uffff\1\137",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\150\21\uffff\1\147",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\164",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\5\50\1\167\2\50\1"+
            "\165\15\50\1\166\3\50",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\u0092\21"+
            "\50",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\5\uffff\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009c",
            "\1\u009d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a6",
            "\1\u00a7",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b8",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00c5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c7",
            "",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00c9",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00cb",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00cd",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00cf",
            "\1\u00d0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00d1",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00d3",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00d9",
            "\1\u00da",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            return "1:1: Tokens : ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | EQUAL | COND_EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | ELSEIF | ENDIF | WHILE | FOR | ENDWHILE | ENDFOR | IN | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | BEGIN | END | DURATION | CREATE | DESTROY | MOVE | TRANSLATE | MODIFY | ROTATE | TYPE_OBJECT | ATTRIBUTE | ID | INT | COMMENT | STRING | WS );";
        }
    }
 

}