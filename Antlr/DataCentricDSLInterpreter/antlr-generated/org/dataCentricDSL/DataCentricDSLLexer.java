// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2014-12-13 13:53:12
 
	package org.dataCentricDSL;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DataCentricDSLLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int BOOLEAN=4;
	public static final int COMMENT=5;
	public static final int DIGIT=6;
	public static final int ESCAPE=7;
	public static final int FLOAT=8;
	public static final int IDENT=9;
	public static final int INTEGER=10;
	public static final int LETTER=11;
	public static final int MULTILINE_COMMENT=12;
	public static final int STRING_LITERAL=13;
	public static final int WS=14;

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
	      case 'f': builder.append("\f"); break;
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
	@Override public String getGrammarFileName() { return "D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g"; }

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:34:7: ( ';' )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:34:9: ';'
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:35:7: ( '=' )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:35:9: '='
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:36:7: ( 'print' )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:36:9: 'print'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:37:7: ( 'query' )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:37:9: 'query'
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
	// $ANTLR end "T__18"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			final StringBuilder builder = new StringBuilder();
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:63:3: ( '\"' ( ESCAPE[builder] |c=~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:63:5: '\"' ( ESCAPE[builder] |c=~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
			{
			match('\"'); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:64:5: ( ESCAPE[builder] |c=~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\\') ) {
					alt1=1;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:64:6: ESCAPE[builder]
					{
					mESCAPE(builder); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:65:7: c=~ ( '\\\\' | '\"' | '\\r' | '\\n' )
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
					break loop1;
				}
			}

			match('\"'); 
			setText(builder.toString());
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "ESCAPE"
	public final void mESCAPE(StringBuilder builder) throws RecognitionException {
		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:72:3: ( '\\\\' . )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:72:5: '\\\\' .
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
	// $ANTLR end "ESCAPE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:75:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:75:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:75:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:76:8: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' )? )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:76:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' )?
			{
			match("//"); 

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:76:15: (~ ( '\\n' | '\\r' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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
					break loop3;
				}
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:76:31: ( '\\n' | '\\r' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\n'||LA4_0=='\r') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
					{
					if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "MULTILINE_COMMENT"
	public final void mMULTILINE_COMMENT() throws RecognitionException {
		try {
			int _type = MULTILINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:77:18: ( '/*' ( . )* '*/' )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:77:20: '/*' ( . )* '*/'
			{
			match("/*"); 

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:77:25: ( . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='*') ) {
					int LA5_1 = input.LA(2);
					if ( (LA5_1=='/') ) {
						alt5=2;
					}
					else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
						alt5=1;
					}

				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:77:25: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
				}
			}

			match("*/"); 

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTILINE_COMMENT"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:78:16: ( '0' .. '9' )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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
	// $ANTLR end "DIGIT"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:79:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "LETTER"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:9: ( '1' .. '9' ( DIGIT )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:11: '1' .. '9' ( DIGIT )*
			{
			matchRange('1','9'); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:20: ( DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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
					break loop6;
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
	// $ANTLR end "INTEGER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:81:7: ( '0' .. '9' ( DIGIT )* '.' ( DIGIT )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:81:9: '0' .. '9' ( DIGIT )* '.' ( DIGIT )*
			{
			matchRange('0','9'); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:81:18: ( DIGIT )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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
					break loop7;
				}
			}

			match('.'); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:81:29: ( DIGIT )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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
					break loop8;
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
	// $ANTLR end "FLOAT"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:82:8: ( 'true' | 'false' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='t') ) {
				alt9=1;
			}
			else if ( (LA9_0=='f') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:82:10: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:82:19: 'false'
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
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:83:7: ( LETTER ( LETTER | DIGIT )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:83:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:83:16: ( LETTER | DIGIT )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop10;
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
	// $ANTLR end "IDENT"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | STRING_LITERAL | WS | COMMENT | MULTILINE_COMMENT | INTEGER | FLOAT | BOOLEAN | IDENT )
		int alt11=12;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:10: T__15
				{
				mT__15(); 

				}
				break;
			case 2 :
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:16: T__16
				{
				mT__16(); 

				}
				break;
			case 3 :
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:22: T__17
				{
				mT__17(); 

				}
				break;
			case 4 :
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:28: T__18
				{
				mT__18(); 

				}
				break;
			case 5 :
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:34: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 6 :
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:49: WS
				{
				mWS(); 

				}
				break;
			case 7 :
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:52: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 8 :
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:60: MULTILINE_COMMENT
				{
				mMULTILINE_COMMENT(); 

				}
				break;
			case 9 :
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:78: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 10 :
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:86: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 11 :
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:92: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 12 :
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:100: IDENT
				{
				mIDENT(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\3\uffff\2\14\3\uffff\1\22\1\uffff\2\14\1\uffff\2\14\2\uffff\1\22\1\uffff"+
		"\10\14\1\37\1\14\1\41\1\42\1\uffff\1\37\2\uffff";
	static final String DFA11_eofS =
		"\43\uffff";
	static final String DFA11_minS =
		"\1\11\2\uffff\1\162\1\165\2\uffff\1\52\1\56\1\uffff\1\162\1\141\1\uffff"+
		"\1\151\1\145\2\uffff\1\56\1\uffff\1\165\1\154\1\156\1\162\1\145\1\163"+
		"\1\164\1\171\1\60\1\145\2\60\1\uffff\1\60\2\uffff";
	static final String DFA11_maxS =
		"\1\172\2\uffff\1\162\1\165\2\uffff\1\57\1\71\1\uffff\1\162\1\141\1\uffff"+
		"\1\151\1\145\2\uffff\1\71\1\uffff\1\165\1\154\1\156\1\162\1\145\1\163"+
		"\1\164\1\171\1\172\1\145\2\172\1\uffff\1\172\2\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\2\2\uffff\1\5\1\6\2\uffff\1\12\2\uffff\1\14\2\uffff\1\7"+
		"\1\10\1\uffff\1\11\14\uffff\1\13\1\uffff\1\3\1\4";
	static final String DFA11_specialS =
		"\43\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\6\1\uffff\2\6\22\uffff\1\6\1\uffff\1\5\14\uffff\1\7\1\11\11\10\1\uffff"+
			"\1\1\1\uffff\1\2\3\uffff\32\14\6\uffff\5\14\1\13\11\14\1\3\1\4\2\14\1"+
			"\12\6\14",
			"",
			"",
			"\1\15",
			"\1\16",
			"",
			"",
			"\1\20\4\uffff\1\17",
			"\1\11\1\uffff\12\21",
			"",
			"\1\23",
			"\1\24",
			"",
			"\1\25",
			"\1\26",
			"",
			"",
			"\1\11\1\uffff\12\21",
			"",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"\12\14\7\uffff\32\14\6\uffff\32\14",
			"\1\40",
			"\12\14\7\uffff\32\14\6\uffff\32\14",
			"\12\14\7\uffff\32\14\6\uffff\32\14",
			"",
			"\12\14\7\uffff\32\14\6\uffff\32\14",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | STRING_LITERAL | WS | COMMENT | MULTILINE_COMMENT | INTEGER | FLOAT | BOOLEAN | IDENT );";
		}
	}

}
