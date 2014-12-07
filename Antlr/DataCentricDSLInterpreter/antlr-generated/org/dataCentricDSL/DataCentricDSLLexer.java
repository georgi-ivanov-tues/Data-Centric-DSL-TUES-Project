// $ANTLR 3.5.2 D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2014-12-07 15:57:08
 
	package org.dataCentricDSL;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DataCentricDSLLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int COMMENT=4;
	public static final int DIGIT=5;
	public static final int ESCAPE=6;
	public static final int IDENT=7;
	public static final int LETTER=8;
	public static final int MULTILINE_COMMENT=9;
	public static final int STRING_LITERAL=10;
	public static final int WS=11;

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
	@Override public String getGrammarFileName() { return "D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g"; }

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:34:7: ( '(' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:34:9: '('
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:35:7: ( ')' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:35:9: ')'
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:36:7: ( ';' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:36:9: ';'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:37:7: ( '=' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:37:9: '='
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:38:7: ( 'print' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:38:9: 'print'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:39:7: ( 'query' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:39:9: 'query'
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
	// $ANTLR end "T__17"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			final StringBuilder builder = new StringBuilder();
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:63:3: ( '\"' ( ESCAPE[builder] |c=~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:63:5: '\"' ( ESCAPE[builder] |c=~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
			{
			match('\"'); 
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:64:5: ( ESCAPE[builder] |c=~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
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
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:64:6: ESCAPE[builder]
					{
					mESCAPE(builder); 

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:65:7: c=~ ( '\\\\' | '\"' | '\\r' | '\\n' )
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
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:72:3: ( '\\\\' . )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:72:5: '\\\\' .
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
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:75:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:75:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:75:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
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
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:76:8: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' )? )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:76:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' )?
			{
			match("//"); 

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:76:15: (~ ( '\\n' | '\\r' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:76:31: ( '\\n' | '\\r' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\n'||LA4_0=='\r') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:77:18: ( '/*' ( . )* '*/' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:77:20: '/*' ( . )* '*/'
			{
			match("/*"); 

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:77:25: ( . )*
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
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:77:25: .
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
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:78:16: ( '0' .. '9' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:79:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:7: ( LETTER ( LETTER | DIGIT )* )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:16: ( LETTER | DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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
	// $ANTLR end "IDENT"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | STRING_LITERAL | WS | COMMENT | MULTILINE_COMMENT | IDENT )
		int alt7=11;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt7=1;
			}
			break;
		case ')':
			{
			alt7=2;
			}
			break;
		case ';':
			{
			alt7=3;
			}
			break;
		case '=':
			{
			alt7=4;
			}
			break;
		case 'p':
			{
			int LA7_5 = input.LA(2);
			if ( (LA7_5=='r') ) {
				int LA7_11 = input.LA(3);
				if ( (LA7_11=='i') ) {
					int LA7_15 = input.LA(4);
					if ( (LA7_15=='n') ) {
						int LA7_17 = input.LA(5);
						if ( (LA7_17=='t') ) {
							int LA7_19 = input.LA(6);
							if ( ((LA7_19 >= '0' && LA7_19 <= '9')||(LA7_19 >= 'A' && LA7_19 <= 'Z')||(LA7_19 >= 'a' && LA7_19 <= 'z')) ) {
								alt7=11;
							}

							else {
								alt7=5;
							}

						}

						else {
							alt7=11;
						}

					}

					else {
						alt7=11;
					}

				}

				else {
					alt7=11;
				}

			}

			else {
				alt7=11;
			}

			}
			break;
		case 'q':
			{
			int LA7_6 = input.LA(2);
			if ( (LA7_6=='u') ) {
				int LA7_12 = input.LA(3);
				if ( (LA7_12=='e') ) {
					int LA7_16 = input.LA(4);
					if ( (LA7_16=='r') ) {
						int LA7_18 = input.LA(5);
						if ( (LA7_18=='y') ) {
							int LA7_20 = input.LA(6);
							if ( ((LA7_20 >= '0' && LA7_20 <= '9')||(LA7_20 >= 'A' && LA7_20 <= 'Z')||(LA7_20 >= 'a' && LA7_20 <= 'z')) ) {
								alt7=11;
							}

							else {
								alt7=6;
							}

						}

						else {
							alt7=11;
						}

					}

					else {
						alt7=11;
					}

				}

				else {
					alt7=11;
				}

			}

			else {
				alt7=11;
			}

			}
			break;
		case '\"':
			{
			alt7=7;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt7=8;
			}
			break;
		case '/':
			{
			int LA7_9 = input.LA(2);
			if ( (LA7_9=='/') ) {
				alt7=9;
			}
			else if ( (LA7_9=='*') ) {
				alt7=10;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 7, 9, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt7=11;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 7, 0, input);
			throw nvae;
		}
		switch (alt7) {
			case 1 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:10: T__12
				{
				mT__12(); 

				}
				break;
			case 2 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:16: T__13
				{
				mT__13(); 

				}
				break;
			case 3 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:22: T__14
				{
				mT__14(); 

				}
				break;
			case 4 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:28: T__15
				{
				mT__15(); 

				}
				break;
			case 5 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:34: T__16
				{
				mT__16(); 

				}
				break;
			case 6 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:40: T__17
				{
				mT__17(); 

				}
				break;
			case 7 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:46: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 8 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:61: WS
				{
				mWS(); 

				}
				break;
			case 9 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:64: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 10 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:72: MULTILINE_COMMENT
				{
				mMULTILINE_COMMENT(); 

				}
				break;
			case 11 :
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:90: IDENT
				{
				mIDENT(); 

				}
				break;

		}
	}



}
