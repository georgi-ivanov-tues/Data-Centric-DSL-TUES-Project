// $ANTLR 3.5.2 D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2014-11-24 22:02:43

	package org.dataCentricDSL;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DataCentricDSLLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int REQUEST_STRING=4;
	public static final int STRING=5;
	public static final int WS=6;

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
	@Override public String getGrammarFileName() { return "D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g"; }

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:11:6: ( '(' )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:11:8: '('
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
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:12:6: ( ')' )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:12:8: ')'
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
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:13:6: ( ';' )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:13:8: ';'
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
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:14:7: ( 'import' )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:14:9: 'import'
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:15:7: ( 'package' )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:15:9: 'package'
			{
			match("package"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:16:7: ( 'query' )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:16:9: 'query'
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
	// $ANTLR end "T__12"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:40:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:40:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:40:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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
					break loop1;
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
	// $ANTLR end "STRING"

	// $ANTLR start "REQUEST_STRING"
	public final void mREQUEST_STRING() throws RecognitionException {
		try {
			int _type = REQUEST_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:15: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' )* )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:17: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:38: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==' '||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
					{
					if ( input.LA(1)==' '||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REQUEST_STRING"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | STRING | REQUEST_STRING | WS )
		int alt4=9;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:10: T__7
				{
				mT__7(); 

				}
				break;
			case 2 :
				// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:15: T__8
				{
				mT__8(); 

				}
				break;
			case 3 :
				// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:20: T__9
				{
				mT__9(); 

				}
				break;
			case 4 :
				// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:25: T__10
				{
				mT__10(); 

				}
				break;
			case 5 :
				// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:31: T__11
				{
				mT__11(); 

				}
				break;
			case 6 :
				// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:37: T__12
				{
				mT__12(); 

				}
				break;
			case 7 :
				// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:43: STRING
				{
				mSTRING(); 

				}
				break;
			case 8 :
				// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:50: REQUEST_STRING
				{
				mREQUEST_STRING(); 

				}
				break;
			case 9 :
				// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:1:65: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\4\uffff\4\13\1\uffff\2\13\2\uffff\12\13\1\32\1\33\1\13\2\uffff\1\35\1"+
		"\uffff";
	static final String DFA4_eofS =
		"\36\uffff";
	static final String DFA4_minS =
		"\1\11\3\uffff\4\40\1\uffff\2\40\2\uffff\15\40\2\uffff\1\40\1\uffff";
	static final String DFA4_maxS =
		"\1\172\3\uffff\4\172\1\uffff\2\172\2\uffff\15\172\2\uffff\1\172\1\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\1\2\1\3\4\uffff\1\11\2\uffff\1\7\1\10\15\uffff\1\6\1\4\1"+
		"\uffff\1\5";
	static final String DFA4_specialS =
		"\36\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\10\1\uffff\2\10\22\uffff\1\10\7\uffff\1\1\1\2\21\uffff\1\3\5\uffff"+
			"\32\7\6\uffff\10\7\1\4\6\7\1\5\1\6\11\7",
			"",
			"",
			"",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\14\12\1\11\15\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\1\15\31\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\24\12\1\16\5\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\32\12",
			"",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\17\12\1\17\12\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\32\12",
			"",
			"",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\2\12\1\20\27\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\4\12\1\21\25\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\16\12\1\22\13\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\12\12\1\23\17\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\21\12\1\24\10\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\21\12\1\25\10\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\1\26\31\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\30\12\1\27\1\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\23\12\1\30\6\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\6\12\1\31\23\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\32\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\32\12",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\4\12\1\34\25\12",
			"",
			"",
			"\1\14\17\uffff\12\12\7\uffff\32\12\6\uffff\32\12",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | STRING | REQUEST_STRING | WS );";
		}
	}

}
