// $ANTLR 3.5.2 D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g 2015-02-15 23:04:57

  package bg.tues.didi;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DataCentricDSLLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int ASSIGNMENT=4;
	public static final int Add=5;
	public static final int And=6;
	public static final int Assert=7;
	public static final int Assign=8;
	public static final int BLOCK=9;
	public static final int Bool=10;
	public static final int CBrace=11;
	public static final int CBracket=12;
	public static final int CParen=13;
	public static final int Colon=14;
	public static final int Comma=15;
	public static final int Comment=16;
	public static final int Def=17;
	public static final int Digit=18;
	public static final int Divide=19;
	public static final int Do=20;
	public static final int EXP=21;
	public static final int EXP_LIST=22;
	public static final int Else=23;
	public static final int End=24;
	public static final int Equals=25;
	public static final int Escape=26;
	public static final int Excl=27;
	public static final int FUNCTION=28;
	public static final int FUNC_CALL=29;
	public static final int For=30;
	public static final int GT=31;
	public static final int GTEquals=32;
	public static final int ID_LIST=33;
	public static final int IF=34;
	public static final int INDEXES=35;
	public static final int Identifier=36;
	public static final int If=37;
	public static final int In=38;
	public static final int Increment=39;
	public static final int Int=40;
	public static final int LIST=41;
	public static final int LOOKUP=42;
	public static final int LT=43;
	public static final int LTEquals=44;
	public static final int Modulus=45;
	public static final int Multiply=46;
	public static final int NEGATE=47;
	public static final int NEquals=48;
	public static final int Null=49;
	public static final int Number=50;
	public static final int OBrace=51;
	public static final int OBracket=52;
	public static final int OParen=53;
	public static final int Or=54;
	public static final int PRINT=55;
	public static final int PRINTLN=56;
	public static final int Pow=57;
	public static final int Print=58;
	public static final int Println=59;
	public static final int QMark=60;
	public static final int RETURN=61;
	public static final int Return=62;
	public static final int SColon=63;
	public static final int STATEMENTS=64;
	public static final int Size=65;
	public static final int Space=66;
	public static final int String=67;
	public static final int Subtract=68;
	public static final int TERNARY=69;
	public static final int To=70;
	public static final int UNARY_MIN=71;
	public static final int While=72;

	  private void processEscapeSequence(String text, StringBuilder builder) {
	    if(text == null) { //This shouldn't happen, but you never know
	      return; 
	    }
	    if(text.length() < 2) { //This neither
	      return;
	    }
	    char c = text.charAt(text.length() - 1);
	    switch(c) {
	      case 'n': builder.append("\n"); break;
	      case 'r': builder.append("\r"); break;
	      case 't': builder.append("\t"); break;
	      case 'b': builder.append("\b"); break;
	      case '"': builder.append("\""); break;
	      case '\'': builder.append("'"); break;
	      case '/': builder.append("/"); break;
	      case '\\': builder.append("\\"); break;
	      default: builder.append(c);
	    }
	  }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public DataCentricDSLLexer() {} 
	public DataCentricDSLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public DataCentricDSLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g"; }

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:28:7: ( '--' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:28:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:29:7: ( 'func' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:29:9: 'func'
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
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:30:7: ( 'global' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:30:9: 'global'
			{
			match("global"); 

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
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:31:7: ( 'query' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:31:9: 'query'
			{
			match("query"); 

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
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:32:7: ( 'update' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:32:9: 'update'
			{
			match("update"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "Println"
	public final void mPrintln() throws RecognitionException {
		try {
			int _type = Println;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:252:10: ( 'println' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:252:12: 'println'
			{
			match("println"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Println"

	// $ANTLR start "Print"
	public final void mPrint() throws RecognitionException {
		try {
			int _type = Print;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:253:10: ( 'print' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:253:12: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Print"

	// $ANTLR start "Assert"
	public final void mAssert() throws RecognitionException {
		try {
			int _type = Assert;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:254:10: ( 'assert' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:254:12: 'assert'
			{
			match("assert"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Assert"

	// $ANTLR start "Size"
	public final void mSize() throws RecognitionException {
		try {
			int _type = Size;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:255:10: ( 'size' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:255:12: 'size'
			{
			match("size"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Size"

	// $ANTLR start "Def"
	public final void mDef() throws RecognitionException {
		try {
			int _type = Def;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:256:10: ( 'def' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:256:12: 'def'
			{
			match("def"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Def"

	// $ANTLR start "If"
	public final void mIf() throws RecognitionException {
		try {
			int _type = If;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:257:10: ( 'if' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:257:12: 'if'
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
	// $ANTLR end "If"

	// $ANTLR start "Else"
	public final void mElse() throws RecognitionException {
		try {
			int _type = Else;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:258:10: ( 'else' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:258:12: 'else'
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
	// $ANTLR end "Else"

	// $ANTLR start "Return"
	public final void mReturn() throws RecognitionException {
		try {
			int _type = Return;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:259:10: ( 'return' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:259:12: 'return'
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
	// $ANTLR end "Return"

	// $ANTLR start "For"
	public final void mFor() throws RecognitionException {
		try {
			int _type = For;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:260:10: ( 'for' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:260:12: 'for'
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
	// $ANTLR end "For"

	// $ANTLR start "While"
	public final void mWhile() throws RecognitionException {
		try {
			int _type = While;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:261:10: ( 'while' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:261:12: 'while'
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
	// $ANTLR end "While"

	// $ANTLR start "To"
	public final void mTo() throws RecognitionException {
		try {
			int _type = To;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:262:10: ( 'to' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:262:12: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "To"

	// $ANTLR start "Do"
	public final void mDo() throws RecognitionException {
		try {
			int _type = Do;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:263:10: ( 'do' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:263:12: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Do"

	// $ANTLR start "End"
	public final void mEnd() throws RecognitionException {
		try {
			int _type = End;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:264:10: ( 'end' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:264:12: 'end'
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
	// $ANTLR end "End"

	// $ANTLR start "In"
	public final void mIn() throws RecognitionException {
		try {
			int _type = In;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:265:10: ( 'in' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:265:12: 'in'
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
	// $ANTLR end "In"

	// $ANTLR start "Null"
	public final void mNull() throws RecognitionException {
		try {
			int _type = Null;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:266:10: ( 'null' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:266:12: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Null"

	// $ANTLR start "Or"
	public final void mOr() throws RecognitionException {
		try {
			int _type = Or;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:268:10: ( '||' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:268:12: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Or"

	// $ANTLR start "And"
	public final void mAnd() throws RecognitionException {
		try {
			int _type = And;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:269:10: ( '&&' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:269:12: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "And"

	// $ANTLR start "Equals"
	public final void mEquals() throws RecognitionException {
		try {
			int _type = Equals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:270:10: ( '==' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:270:12: '=='
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
	// $ANTLR end "Equals"

	// $ANTLR start "NEquals"
	public final void mNEquals() throws RecognitionException {
		try {
			int _type = NEquals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:271:10: ( '!=' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:271:12: '!='
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
	// $ANTLR end "NEquals"

	// $ANTLR start "GTEquals"
	public final void mGTEquals() throws RecognitionException {
		try {
			int _type = GTEquals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:272:10: ( '>=' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:272:12: '>='
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
	// $ANTLR end "GTEquals"

	// $ANTLR start "LTEquals"
	public final void mLTEquals() throws RecognitionException {
		try {
			int _type = LTEquals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:273:10: ( '<=' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:273:12: '<='
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
	// $ANTLR end "LTEquals"

	// $ANTLR start "Pow"
	public final void mPow() throws RecognitionException {
		try {
			int _type = Pow;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:274:10: ( '^' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:274:12: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Pow"

	// $ANTLR start "Excl"
	public final void mExcl() throws RecognitionException {
		try {
			int _type = Excl;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:275:10: ( '!' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:275:12: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Excl"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:276:10: ( '>' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:276:12: '>'
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

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:277:10: ( '<' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:277:12: '<'
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

	// $ANTLR start "Add"
	public final void mAdd() throws RecognitionException {
		try {
			int _type = Add;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:278:10: ( '+' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:278:12: '+'
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
	// $ANTLR end "Add"

	// $ANTLR start "Increment"
	public final void mIncrement() throws RecognitionException {
		try {
			int _type = Increment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:279:10: ( '++' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:279:12: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Increment"

	// $ANTLR start "Subtract"
	public final void mSubtract() throws RecognitionException {
		try {
			int _type = Subtract;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:280:10: ( '-' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:280:12: '-'
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
	// $ANTLR end "Subtract"

	// $ANTLR start "Multiply"
	public final void mMultiply() throws RecognitionException {
		try {
			int _type = Multiply;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:281:10: ( '*' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:281:12: '*'
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
	// $ANTLR end "Multiply"

	// $ANTLR start "Divide"
	public final void mDivide() throws RecognitionException {
		try {
			int _type = Divide;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:282:10: ( '/' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:282:12: '/'
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
	// $ANTLR end "Divide"

	// $ANTLR start "Modulus"
	public final void mModulus() throws RecognitionException {
		try {
			int _type = Modulus;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:283:10: ( '%' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:283:12: '%'
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
	// $ANTLR end "Modulus"

	// $ANTLR start "OBrace"
	public final void mOBrace() throws RecognitionException {
		try {
			int _type = OBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:284:10: ( '{' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:284:12: '{'
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
	// $ANTLR end "OBrace"

	// $ANTLR start "CBrace"
	public final void mCBrace() throws RecognitionException {
		try {
			int _type = CBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:285:10: ( '}' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:285:12: '}'
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
	// $ANTLR end "CBrace"

	// $ANTLR start "OBracket"
	public final void mOBracket() throws RecognitionException {
		try {
			int _type = OBracket;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:286:10: ( '[' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:286:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBracket"

	// $ANTLR start "CBracket"
	public final void mCBracket() throws RecognitionException {
		try {
			int _type = CBracket;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:287:10: ( ']' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:287:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CBracket"

	// $ANTLR start "OParen"
	public final void mOParen() throws RecognitionException {
		try {
			int _type = OParen;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:288:10: ( '(' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:288:12: '('
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
	// $ANTLR end "OParen"

	// $ANTLR start "CParen"
	public final void mCParen() throws RecognitionException {
		try {
			int _type = CParen;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:289:10: ( ')' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:289:12: ')'
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
	// $ANTLR end "CParen"

	// $ANTLR start "SColon"
	public final void mSColon() throws RecognitionException {
		try {
			int _type = SColon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:290:10: ( ';' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:290:12: ';'
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
	// $ANTLR end "SColon"

	// $ANTLR start "Assign"
	public final void mAssign() throws RecognitionException {
		try {
			int _type = Assign;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:291:10: ( '=' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:291:12: '='
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
	// $ANTLR end "Assign"

	// $ANTLR start "Comma"
	public final void mComma() throws RecognitionException {
		try {
			int _type = Comma;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:292:10: ( ',' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:292:12: ','
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
	// $ANTLR end "Comma"

	// $ANTLR start "QMark"
	public final void mQMark() throws RecognitionException {
		try {
			int _type = QMark;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:293:10: ( '?' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:293:12: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QMark"

	// $ANTLR start "Colon"
	public final void mColon() throws RecognitionException {
		try {
			int _type = Colon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:294:10: ( ':' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:294:12: ':'
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
	// $ANTLR end "Colon"

	// $ANTLR start "Bool"
	public final void mBool() throws RecognitionException {
		try {
			int _type = Bool;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:297:3: ( 'true' | 'false' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:297:6: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:298:6: 'false'
					{
					match("false"); 

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
	// $ANTLR end "Bool"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:302:3: ( Int ( '.' ( Digit )* )? )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:302:6: Int ( '.' ( Digit )* )?
			{
			mInt(); 

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:302:10: ( '.' ( Digit )* )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='.') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:302:11: '.' ( Digit )*
					{
					match('.'); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:302:15: ( Digit )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:
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
							break loop2;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:306:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:306:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:306:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:
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
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "String"
	public final void mString() throws RecognitionException {
		try {
			int _type = String;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;


			  final StringBuilder builder = new StringBuilder();

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:316:3: ( '\"' ( Escape[builder] |c=~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' | '\\'' ( Escape[builder] |c=~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) )* '\\'' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\"') ) {
				alt7=1;
			}
			else if ( (LA7_0=='\'') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:316:6: '\"' ( Escape[builder] |c=~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
					{
					match('\"'); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:316:11: ( Escape[builder] |c=~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
					loop5:
					while (true) {
						int alt5=3;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='\\') ) {
							alt5=1;
						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
							alt5=2;
						}

						switch (alt5) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:316:12: Escape[builder]
							{
							mEscape(builder); 

							}
							break;
						case 2 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:316:30: c=~ ( '\\\\' | '\"' | '\\r' | '\\n' )
							{
							c= input.LA(1);
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							builder.appendCodePoint(c);
							}
							break;

						default :
							break loop5;
						}
					}

					match('\"'); 
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:317:6: '\\'' ( Escape[builder] |c=~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) )* '\\''
					{
					match('\''); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:317:11: ( Escape[builder] |c=~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) )*
					loop6:
					while (true) {
						int alt6=3;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='\\') ) {
							alt6=1;
						}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
							alt6=2;
						}

						switch (alt6) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:317:12: Escape[builder]
							{
							mEscape(builder); 

							}
							break;
						case 2 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:317:30: c=~ ( '\\\\' | '\\'' | '\\r' | '\\n' )
							{
							c= input.LA(1);
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							builder.appendCodePoint(c);
							}
							break;

						default :
							break loop6;
						}
					}

					match('\''); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;

			  setText(builder.toString());

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "String"

	// $ANTLR start "Escape"
	public final void mEscape(StringBuilder builder) throws RecognitionException {
		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:321:3: ( '\\\\' . )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:321:5: '\\\\' .
			{
			match('\\'); 
			matchAny(); 
			processEscapeSequence(getText(), builder);
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Escape"

	// $ANTLR start "Comment"
	public final void mComment() throws RecognitionException {
		try {
			int _type = Comment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:325:3: ( '//' (~ ( '\\r' | '\\n' ) )* | '/*' ( . )* '*/' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='/') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='/') ) {
					alt10=1;
				}
				else if ( (LA10_1=='*') ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:325:6: '//' (~ ( '\\r' | '\\n' ) )*
					{
					match("//"); 

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:325:11: (~ ( '\\r' | '\\n' ) )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:
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
							break loop8;
						}
					}

					skip();
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:326:6: '/*' ( . )* '*/'
					{
					match("/*"); 

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:326:11: ( . )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0=='*') ) {
							int LA9_1 = input.LA(2);
							if ( (LA9_1=='/') ) {
								alt9=2;
							}
							else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
								alt9=1;
							}

						}
						else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:326:11: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop9;
						}
					}

					match("*/"); 

					skip();
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
	// $ANTLR end "Comment"

	// $ANTLR start "Space"
	public final void mSpace() throws RecognitionException {
		try {
			int _type = Space;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:330:3: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:330:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Space"

	// $ANTLR start "Int"
	public final void mInt() throws RecognitionException {
		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:334:3: ( '1' .. '9' ( Digit )* | '0' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= '1' && LA12_0 <= '9')) ) {
				alt12=1;
			}
			else if ( (LA12_0=='0') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:334:6: '1' .. '9' ( Digit )*
					{
					matchRange('1','9'); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:334:15: ( Digit )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:
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
							break loop11;
						}
					}

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:335:6: '0'
					{
					match('0'); 
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Int"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:339:3: ( '0' .. '9' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:8: ( T__73 | T__74 | T__75 | T__76 | T__77 | Println | Print | Assert | Size | Def | If | Else | Return | For | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Increment | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | SColon | Assign | Comma | QMark | Colon | Bool | Number | Identifier | String | Comment | Space )
		int alt13=53;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:10: T__73
				{
				mT__73(); 

				}
				break;
			case 2 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:16: T__74
				{
				mT__74(); 

				}
				break;
			case 3 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:22: T__75
				{
				mT__75(); 

				}
				break;
			case 4 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:28: T__76
				{
				mT__76(); 

				}
				break;
			case 5 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:34: T__77
				{
				mT__77(); 

				}
				break;
			case 6 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:40: Println
				{
				mPrintln(); 

				}
				break;
			case 7 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:48: Print
				{
				mPrint(); 

				}
				break;
			case 8 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:54: Assert
				{
				mAssert(); 

				}
				break;
			case 9 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:61: Size
				{
				mSize(); 

				}
				break;
			case 10 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:66: Def
				{
				mDef(); 

				}
				break;
			case 11 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:70: If
				{
				mIf(); 

				}
				break;
			case 12 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:73: Else
				{
				mElse(); 

				}
				break;
			case 13 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:78: Return
				{
				mReturn(); 

				}
				break;
			case 14 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:85: For
				{
				mFor(); 

				}
				break;
			case 15 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:89: While
				{
				mWhile(); 

				}
				break;
			case 16 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:95: To
				{
				mTo(); 

				}
				break;
			case 17 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:98: Do
				{
				mDo(); 

				}
				break;
			case 18 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:101: End
				{
				mEnd(); 

				}
				break;
			case 19 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:105: In
				{
				mIn(); 

				}
				break;
			case 20 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:108: Null
				{
				mNull(); 

				}
				break;
			case 21 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:113: Or
				{
				mOr(); 

				}
				break;
			case 22 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:116: And
				{
				mAnd(); 

				}
				break;
			case 23 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:120: Equals
				{
				mEquals(); 

				}
				break;
			case 24 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:127: NEquals
				{
				mNEquals(); 

				}
				break;
			case 25 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:135: GTEquals
				{
				mGTEquals(); 

				}
				break;
			case 26 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:144: LTEquals
				{
				mLTEquals(); 

				}
				break;
			case 27 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:153: Pow
				{
				mPow(); 

				}
				break;
			case 28 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:157: Excl
				{
				mExcl(); 

				}
				break;
			case 29 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:162: GT
				{
				mGT(); 

				}
				break;
			case 30 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:165: LT
				{
				mLT(); 

				}
				break;
			case 31 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:168: Add
				{
				mAdd(); 

				}
				break;
			case 32 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:172: Increment
				{
				mIncrement(); 

				}
				break;
			case 33 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:182: Subtract
				{
				mSubtract(); 

				}
				break;
			case 34 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:191: Multiply
				{
				mMultiply(); 

				}
				break;
			case 35 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:200: Divide
				{
				mDivide(); 

				}
				break;
			case 36 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:207: Modulus
				{
				mModulus(); 

				}
				break;
			case 37 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:215: OBrace
				{
				mOBrace(); 

				}
				break;
			case 38 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:222: CBrace
				{
				mCBrace(); 

				}
				break;
			case 39 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:229: OBracket
				{
				mOBracket(); 

				}
				break;
			case 40 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:238: CBracket
				{
				mCBracket(); 

				}
				break;
			case 41 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:247: OParen
				{
				mOParen(); 

				}
				break;
			case 42 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:254: CParen
				{
				mCParen(); 

				}
				break;
			case 43 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:261: SColon
				{
				mSColon(); 

				}
				break;
			case 44 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:268: Assign
				{
				mAssign(); 

				}
				break;
			case 45 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:275: Comma
				{
				mComma(); 

				}
				break;
			case 46 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:281: QMark
				{
				mQMark(); 

				}
				break;
			case 47 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:287: Colon
				{
				mColon(); 

				}
				break;
			case 48 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:293: Bool
				{
				mBool(); 

				}
				break;
			case 49 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:298: Number
				{
				mNumber(); 

				}
				break;
			case 50 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:305: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 51 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:316: String
				{
				mString(); 

				}
				break;
			case 52 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:323: Comment
				{
				mComment(); 

				}
				break;
			case 53 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:1:331: Space
				{
				mSpace(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA13_eotS =
		"\1\uffff\1\52\16\46\2\uffff\1\100\1\102\1\104\1\106\1\uffff\1\110\1\uffff"+
		"\1\112\21\uffff\12\46\1\125\1\126\1\127\4\46\1\134\2\46\14\uffff\1\46"+
		"\1\140\7\46\1\150\3\uffff\1\46\1\152\2\46\1\uffff\2\46\1\157\1\uffff\6"+
		"\46\1\166\1\uffff\1\167\1\uffff\2\46\1\172\1\173\1\uffff\1\172\1\46\1"+
		"\175\1\46\1\u0080\1\46\2\uffff\1\46\1\u0083\2\uffff\1\u0084\1\uffff\1"+
		"\u0085\1\46\1\uffff\1\u0087\1\u0088\3\uffff\1\u0089\3\uffff";
	static final String DFA13_eofS =
		"\u008a\uffff";
	static final String DFA13_minS =
		"\1\11\1\55\1\141\1\154\1\165\1\160\1\162\1\163\1\151\1\145\1\146\1\154"+
		"\1\145\1\150\1\157\1\165\2\uffff\4\75\1\uffff\1\53\1\uffff\1\52\21\uffff"+
		"\1\156\1\162\1\154\1\157\1\145\1\144\1\151\1\163\1\172\1\146\3\60\1\163"+
		"\1\144\1\164\1\151\1\60\1\165\1\154\14\uffff\1\143\1\60\1\163\1\142\1"+
		"\162\1\141\1\156\2\145\1\60\3\uffff\1\145\1\60\1\165\1\154\1\uffff\1\145"+
		"\1\154\1\60\1\uffff\1\145\1\141\1\171\2\164\1\162\1\60\1\uffff\1\60\1"+
		"\uffff\1\162\1\145\2\60\1\uffff\1\60\1\154\1\60\1\145\1\60\1\164\2\uffff"+
		"\1\156\1\60\2\uffff\1\60\1\uffff\1\60\1\156\1\uffff\2\60\3\uffff\1\60"+
		"\3\uffff";
	static final String DFA13_maxS =
		"\1\175\1\55\1\165\1\154\1\165\1\160\1\162\1\163\1\151\1\157\2\156\1\145"+
		"\1\150\1\162\1\165\2\uffff\4\75\1\uffff\1\53\1\uffff\1\57\21\uffff\1\156"+
		"\1\162\1\154\1\157\1\145\1\144\1\151\1\163\1\172\1\146\3\172\1\163\1\144"+
		"\1\164\1\151\1\172\1\165\1\154\14\uffff\1\143\1\172\1\163\1\142\1\162"+
		"\1\141\1\156\2\145\1\172\3\uffff\1\145\1\172\1\165\1\154\1\uffff\1\145"+
		"\1\154\1\172\1\uffff\1\145\1\141\1\171\2\164\1\162\1\172\1\uffff\1\172"+
		"\1\uffff\1\162\1\145\2\172\1\uffff\1\172\1\154\1\172\1\145\1\172\1\164"+
		"\2\uffff\1\156\1\172\2\uffff\1\172\1\uffff\1\172\1\156\1\uffff\2\172\3"+
		"\uffff\1\172\3\uffff";
	static final String DFA13_acceptS =
		"\20\uffff\1\25\1\26\4\uffff\1\33\1\uffff\1\42\1\uffff\1\44\1\45\1\46\1"+
		"\47\1\50\1\51\1\52\1\53\1\55\1\56\1\57\1\61\1\62\1\63\1\65\1\1\1\41\24"+
		"\uffff\1\27\1\54\1\30\1\34\1\31\1\35\1\32\1\36\1\40\1\37\1\64\1\43\12"+
		"\uffff\1\21\1\13\1\23\4\uffff\1\20\3\uffff\1\16\7\uffff\1\12\1\uffff\1"+
		"\22\4\uffff\1\2\6\uffff\1\11\1\14\2\uffff\1\60\1\24\1\uffff\1\4\2\uffff"+
		"\1\7\2\uffff\1\17\1\3\1\5\1\uffff\1\10\1\15\1\6";
	static final String DFA13_specialS =
		"\u008a\uffff}>";
	static final String[] DFA13_transitionS = {
			"\2\50\1\uffff\2\50\22\uffff\1\50\1\23\1\47\2\uffff\1\32\1\21\1\47\1\37"+
			"\1\40\1\30\1\27\1\42\1\1\1\uffff\1\31\12\45\1\44\1\41\1\25\1\22\1\24"+
			"\1\43\1\uffff\32\46\1\35\1\uffff\1\36\1\26\1\46\1\uffff\1\7\2\46\1\11"+
			"\1\13\1\2\1\3\1\46\1\12\4\46\1\17\1\46\1\6\1\4\1\14\1\10\1\16\1\5\1\46"+
			"\1\15\3\46\1\33\1\20\1\34",
			"\1\51",
			"\1\55\15\uffff\1\54\5\uffff\1\53",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64\11\uffff\1\65",
			"\1\66\7\uffff\1\67",
			"\1\70\1\uffff\1\71",
			"\1\72",
			"\1\73",
			"\1\74\2\uffff\1\75",
			"\1\76",
			"",
			"",
			"\1\77",
			"\1\101",
			"\1\103",
			"\1\105",
			"",
			"\1\107",
			"",
			"\1\111\4\uffff\1\111",
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
			"",
			"",
			"",
			"",
			"",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\135",
			"\1\136",
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
			"\1\137",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"",
			"\1\151",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\153",
			"\1\154",
			"",
			"\1\155",
			"\1\156",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\170",
			"\1\171",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\174",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\176",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\177\16\46",
			"\1\u0081",
			"",
			"",
			"\1\u0082",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0086",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__73 | T__74 | T__75 | T__76 | T__77 | Println | Print | Assert | Size | Def | If | Else | Return | For | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Increment | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | SColon | Assign | Comma | QMark | Colon | Bool | Number | Identifier | String | Comment | Space );";
		}
	}

}
