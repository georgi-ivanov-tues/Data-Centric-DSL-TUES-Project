// $ANTLR 3.5.2 C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2014-11-30 20:21:46

	package org.dataCentricDSL;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DataCentricDSLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DIGIT", "ESCAPE", 
		"IDENT", "LETTER", "MULTILINE_COMMENT", "STRING_LITERAL", "WS", "'('", 
		"')'", "';'", "'='", "'print'", "'query'"
	};
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DataCentricDSLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DataCentricDSLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DataCentricDSLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g"; }


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:1: program : ( query | print | variableDecl )* ( ';' !| EOF !) ;
	public final DataCentricDSLParser.program_return program() throws RecognitionException {
		DataCentricDSLParser.program_return retval = new DataCentricDSLParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal4=null;
		Token EOF5=null;
		ParserRuleReturnScope query1 =null;
		ParserRuleReturnScope print2 =null;
		ParserRuleReturnScope variableDecl3 =null;

		CommonTree char_literal4_tree=null;
		CommonTree EOF5_tree=null;

		try {
			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:8: ( ( query | print | variableDecl )* ( ';' !| EOF !) )
			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:2: ( query | print | variableDecl )* ( ';' !| EOF !)
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:2: ( query | print | variableDecl )*
			loop1:
			while (true) {
				int alt1=4;
				switch ( input.LA(1) ) {
				case 17:
					{
					alt1=1;
					}
					break;
				case 16:
					{
					alt1=2;
					}
					break;
				case IDENT:
					{
					alt1=3;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:3: query
					{
					pushFollow(FOLLOW_query_in_program65);
					query1=query();
					state._fsp--;

					adaptor.addChild(root_0, query1.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:11: print
					{
					pushFollow(FOLLOW_print_in_program69);
					print2=print();
					state._fsp--;

					adaptor.addChild(root_0, print2.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:19: variableDecl
					{
					pushFollow(FOLLOW_variableDecl_in_program73);
					variableDecl3=variableDecl();
					state._fsp--;

					adaptor.addChild(root_0, variableDecl3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:34: ( ';' !| EOF !)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==14) ) {
				alt2=1;
			}
			else if ( (LA2_0==EOF) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:35: ';' !
					{
					char_literal4=(Token)match(input,14,FOLLOW_14_in_program78); 
					}
					break;
				case 2 :
					// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:42: EOF !
					{
					EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_program83); 
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class query_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query"
	// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:45:1: query : 'query' ^ '(' ! STRING_LITERAL ')' !;
	public final DataCentricDSLParser.query_return query() throws RecognitionException {
		DataCentricDSLParser.query_return retval = new DataCentricDSLParser.query_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal6=null;
		Token char_literal7=null;
		Token STRING_LITERAL8=null;
		Token char_literal9=null;

		CommonTree string_literal6_tree=null;
		CommonTree char_literal7_tree=null;
		CommonTree STRING_LITERAL8_tree=null;
		CommonTree char_literal9_tree=null;

		try {
			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:45:6: ( 'query' ^ '(' ! STRING_LITERAL ')' !)
			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:2: 'query' ^ '(' ! STRING_LITERAL ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal6=(Token)match(input,17,FOLLOW_17_in_query96); 
			string_literal6_tree = (CommonTree)adaptor.create(string_literal6);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal6_tree, root_0);

			char_literal7=(Token)match(input,12,FOLLOW_12_in_query99); 
			STRING_LITERAL8=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_query102); 
			STRING_LITERAL8_tree = (CommonTree)adaptor.create(STRING_LITERAL8);
			adaptor.addChild(root_0, STRING_LITERAL8_tree);

			char_literal9=(Token)match(input,13,FOLLOW_13_in_query104); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "query"


	public static class print_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "print"
	// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:49:1: print : 'print' ^ '(' ! ( STRING_LITERAL | query | variableCall ) ')' !;
	public final DataCentricDSLParser.print_return print() throws RecognitionException {
		DataCentricDSLParser.print_return retval = new DataCentricDSLParser.print_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal10=null;
		Token char_literal11=null;
		Token STRING_LITERAL12=null;
		Token char_literal15=null;
		ParserRuleReturnScope query13 =null;
		ParserRuleReturnScope variableCall14 =null;

		CommonTree string_literal10_tree=null;
		CommonTree char_literal11_tree=null;
		CommonTree STRING_LITERAL12_tree=null;
		CommonTree char_literal15_tree=null;

		try {
			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:49:6: ( 'print' ^ '(' ! ( STRING_LITERAL | query | variableCall ) ')' !)
			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:3: 'print' ^ '(' ! ( STRING_LITERAL | query | variableCall ) ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal10=(Token)match(input,16,FOLLOW_16_in_print115); 
			string_literal10_tree = (CommonTree)adaptor.create(string_literal10);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal10_tree, root_0);

			char_literal11=(Token)match(input,12,FOLLOW_12_in_print118); 
			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:17: ( STRING_LITERAL | query | variableCall )
			int alt3=3;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt3=1;
				}
				break;
			case 17:
				{
				alt3=2;
				}
				break;
			case IDENT:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:18: STRING_LITERAL
					{
					STRING_LITERAL12=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_print122); 
					STRING_LITERAL12_tree = (CommonTree)adaptor.create(STRING_LITERAL12);
					adaptor.addChild(root_0, STRING_LITERAL12_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:35: query
					{
					pushFollow(FOLLOW_query_in_print126);
					query13=query();
					state._fsp--;

					adaptor.addChild(root_0, query13.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:43: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_print130);
					variableCall14=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall14.getTree());

					}
					break;

			}

			char_literal15=(Token)match(input,13,FOLLOW_13_in_print133); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print"


	public static class variableDecl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variableDecl"
	// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:53:1: variableDecl : IDENT '=' ! ( query | STRING_LITERAL | variableCall ) ';' !;
	public final DataCentricDSLParser.variableDecl_return variableDecl() throws RecognitionException {
		DataCentricDSLParser.variableDecl_return retval = new DataCentricDSLParser.variableDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT16=null;
		Token char_literal17=null;
		Token STRING_LITERAL19=null;
		Token char_literal21=null;
		ParserRuleReturnScope query18 =null;
		ParserRuleReturnScope variableCall20 =null;

		CommonTree IDENT16_tree=null;
		CommonTree char_literal17_tree=null;
		CommonTree STRING_LITERAL19_tree=null;
		CommonTree char_literal21_tree=null;

		try {
			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:53:13: ( IDENT '=' ! ( query | STRING_LITERAL | variableCall ) ';' !)
			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:3: IDENT '=' ! ( query | STRING_LITERAL | variableCall ) ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT16=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDecl144); 
			IDENT16_tree = (CommonTree)adaptor.create(IDENT16);
			adaptor.addChild(root_0, IDENT16_tree);

			char_literal17=(Token)match(input,15,FOLLOW_15_in_variableDecl146); 
			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:14: ( query | STRING_LITERAL | variableCall )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 17:
				{
				alt4=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt4=2;
				}
				break;
			case IDENT:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:16: query
					{
					pushFollow(FOLLOW_query_in_variableDecl151);
					query18=query();
					state._fsp--;

					adaptor.addChild(root_0, query18.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:24: STRING_LITERAL
					{
					STRING_LITERAL19=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_variableDecl155); 
					STRING_LITERAL19_tree = (CommonTree)adaptor.create(STRING_LITERAL19);
					adaptor.addChild(root_0, STRING_LITERAL19_tree);

					}
					break;
				case 3 :
					// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:41: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_variableDecl159);
					variableCall20=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall20.getTree());

					}
					break;

			}

			char_literal21=(Token)match(input,14,FOLLOW_14_in_variableDecl163); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDecl"


	public static class variableCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variableCall"
	// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:57:1: variableCall : IDENT ;
	public final DataCentricDSLParser.variableCall_return variableCall() throws RecognitionException {
		DataCentricDSLParser.variableCall_return retval = new DataCentricDSLParser.variableCall_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT22=null;

		CommonTree IDENT22_tree=null;

		try {
			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:57:13: ( IDENT )
			// C:\\Users\\Home\\git\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:58:3: IDENT
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT22=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableCall174); 
			IDENT22_tree = (CommonTree)adaptor.create(IDENT22);
			adaptor.addChild(root_0, IDENT22_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableCall"

	// Delegated rules



	public static final BitSet FOLLOW_query_in_program65 = new BitSet(new long[]{0x0000000000034080L});
	public static final BitSet FOLLOW_print_in_program69 = new BitSet(new long[]{0x0000000000034080L});
	public static final BitSet FOLLOW_variableDecl_in_program73 = new BitSet(new long[]{0x0000000000034080L});
	public static final BitSet FOLLOW_14_in_program78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOF_in_program83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_query96 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_query99 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_query102 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_query104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_print115 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_print118 = new BitSet(new long[]{0x0000000000020480L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_print122 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_query_in_print126 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_variableCall_in_print130 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_print133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableDecl144 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_variableDecl146 = new BitSet(new long[]{0x0000000000020480L});
	public static final BitSet FOLLOW_query_in_variableDecl151 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_variableDecl155 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_variableCall_in_variableDecl159 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_variableDecl163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableCall174 = new BitSet(new long[]{0x0000000000000002L});
}
