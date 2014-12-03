// $ANTLR 3.5.2 D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2014-12-04 00:27:11

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
	@Override public String getGrammarFileName() { return "D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g"; }


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:1: program : ( ( query | print | variableDecl ) ';' !)* EOF !;
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
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:8: ( ( ( query | print | variableDecl ) ';' !)* EOF !)
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:2: ( ( query | print | variableDecl ) ';' !)* EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:2: ( ( query | print | variableDecl ) ';' !)*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IDENT||(LA2_0 >= 16 && LA2_0 <= 17)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:3: ( query | print | variableDecl ) ';' !
					{
					// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:3: ( query | print | variableDecl )
					int alt1=3;
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
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}
					switch (alt1) {
						case 1 :
							// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:4: query
							{
							pushFollow(FOLLOW_query_in_program66);
							query1=query();
							state._fsp--;

							adaptor.addChild(root_0, query1.getTree());

							}
							break;
						case 2 :
							// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:12: print
							{
							pushFollow(FOLLOW_print_in_program70);
							print2=print();
							state._fsp--;

							adaptor.addChild(root_0, print2.getTree());

							}
							break;
						case 3 :
							// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:20: variableDecl
							{
							pushFollow(FOLLOW_variableDecl_in_program74);
							variableDecl3=variableDecl();
							state._fsp--;

							adaptor.addChild(root_0, variableDecl3.getTree());

							}
							break;

					}

					char_literal4=(Token)match(input,14,FOLLOW_14_in_program77); 
					}
					break;

				default :
					break loop2;
				}
			}

			EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_program82); 
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
	// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:45:1: query : 'query' ^ '(' ! ( STRING_LITERAL | variableCall ) ')' !;
	public final DataCentricDSLParser.query_return query() throws RecognitionException {
		DataCentricDSLParser.query_return retval = new DataCentricDSLParser.query_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal6=null;
		Token char_literal7=null;
		Token STRING_LITERAL8=null;
		Token char_literal10=null;
		ParserRuleReturnScope variableCall9 =null;

		CommonTree string_literal6_tree=null;
		CommonTree char_literal7_tree=null;
		CommonTree STRING_LITERAL8_tree=null;
		CommonTree char_literal10_tree=null;

		try {
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:45:6: ( 'query' ^ '(' ! ( STRING_LITERAL | variableCall ) ')' !)
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:2: 'query' ^ '(' ! ( STRING_LITERAL | variableCall ) ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal6=(Token)match(input,17,FOLLOW_17_in_query94); 
			string_literal6_tree = (CommonTree)adaptor.create(string_literal6);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal6_tree, root_0);

			char_literal7=(Token)match(input,12,FOLLOW_12_in_query97); 
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:16: ( STRING_LITERAL | variableCall )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==STRING_LITERAL) ) {
				alt3=1;
			}
			else if ( (LA3_0==IDENT) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:17: STRING_LITERAL
					{
					STRING_LITERAL8=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_query101); 
					STRING_LITERAL8_tree = (CommonTree)adaptor.create(STRING_LITERAL8);
					adaptor.addChild(root_0, STRING_LITERAL8_tree);

					}
					break;
				case 2 :
					// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:34: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_query105);
					variableCall9=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall9.getTree());

					}
					break;

			}

			char_literal10=(Token)match(input,13,FOLLOW_13_in_query108); 
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
	// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:49:1: print : 'print' ^ '(' ! ( STRING_LITERAL | query | variableCall ) ')' !;
	public final DataCentricDSLParser.print_return print() throws RecognitionException {
		DataCentricDSLParser.print_return retval = new DataCentricDSLParser.print_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal11=null;
		Token char_literal12=null;
		Token STRING_LITERAL13=null;
		Token char_literal16=null;
		ParserRuleReturnScope query14 =null;
		ParserRuleReturnScope variableCall15 =null;

		CommonTree string_literal11_tree=null;
		CommonTree char_literal12_tree=null;
		CommonTree STRING_LITERAL13_tree=null;
		CommonTree char_literal16_tree=null;

		try {
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:49:6: ( 'print' ^ '(' ! ( STRING_LITERAL | query | variableCall ) ')' !)
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:3: 'print' ^ '(' ! ( STRING_LITERAL | query | variableCall ) ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal11=(Token)match(input,16,FOLLOW_16_in_print119); 
			string_literal11_tree = (CommonTree)adaptor.create(string_literal11);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal11_tree, root_0);

			char_literal12=(Token)match(input,12,FOLLOW_12_in_print122); 
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:17: ( STRING_LITERAL | query | variableCall )
			int alt4=3;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt4=1;
				}
				break;
			case 17:
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
					// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:18: STRING_LITERAL
					{
					STRING_LITERAL13=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_print126); 
					STRING_LITERAL13_tree = (CommonTree)adaptor.create(STRING_LITERAL13);
					adaptor.addChild(root_0, STRING_LITERAL13_tree);

					}
					break;
				case 2 :
					// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:35: query
					{
					pushFollow(FOLLOW_query_in_print130);
					query14=query();
					state._fsp--;

					adaptor.addChild(root_0, query14.getTree());

					}
					break;
				case 3 :
					// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:43: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_print134);
					variableCall15=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall15.getTree());

					}
					break;

			}

			char_literal16=(Token)match(input,13,FOLLOW_13_in_print137); 
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
	// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:53:1: variableDecl : IDENT '=' ! ( query | STRING_LITERAL | variableCall ) ;
	public final DataCentricDSLParser.variableDecl_return variableDecl() throws RecognitionException {
		DataCentricDSLParser.variableDecl_return retval = new DataCentricDSLParser.variableDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT17=null;
		Token char_literal18=null;
		Token STRING_LITERAL20=null;
		ParserRuleReturnScope query19 =null;
		ParserRuleReturnScope variableCall21 =null;

		CommonTree IDENT17_tree=null;
		CommonTree char_literal18_tree=null;
		CommonTree STRING_LITERAL20_tree=null;

		try {
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:53:13: ( IDENT '=' ! ( query | STRING_LITERAL | variableCall ) )
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:3: IDENT '=' ! ( query | STRING_LITERAL | variableCall )
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT17=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDecl148); 
			IDENT17_tree = (CommonTree)adaptor.create(IDENT17);
			adaptor.addChild(root_0, IDENT17_tree);

			char_literal18=(Token)match(input,15,FOLLOW_15_in_variableDecl150); 
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:14: ( query | STRING_LITERAL | variableCall )
			int alt5=3;
			switch ( input.LA(1) ) {
			case 17:
				{
				alt5=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt5=2;
				}
				break;
			case IDENT:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:16: query
					{
					pushFollow(FOLLOW_query_in_variableDecl155);
					query19=query();
					state._fsp--;

					adaptor.addChild(root_0, query19.getTree());

					}
					break;
				case 2 :
					// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:24: STRING_LITERAL
					{
					STRING_LITERAL20=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_variableDecl159); 
					STRING_LITERAL20_tree = (CommonTree)adaptor.create(STRING_LITERAL20);
					adaptor.addChild(root_0, STRING_LITERAL20_tree);

					}
					break;
				case 3 :
					// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:41: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_variableDecl163);
					variableCall21=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall21.getTree());

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
	// $ANTLR end "variableDecl"


	public static class variableCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variableCall"
	// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:57:1: variableCall : IDENT ;
	public final DataCentricDSLParser.variableCall_return variableCall() throws RecognitionException {
		DataCentricDSLParser.variableCall_return retval = new DataCentricDSLParser.variableCall_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT22=null;

		CommonTree IDENT22_tree=null;

		try {
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:57:13: ( IDENT )
			// D:\\DataCentricDSLInterpreter\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:58:3: IDENT
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT22=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableCall176); 
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



	public static final BitSet FOLLOW_query_in_program66 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_print_in_program70 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_variableDecl_in_program74 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_program77 = new BitSet(new long[]{0x0000000000030080L});
	public static final BitSet FOLLOW_EOF_in_program82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_query94 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_query97 = new BitSet(new long[]{0x0000000000000480L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_query101 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_variableCall_in_query105 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_query108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_print119 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_print122 = new BitSet(new long[]{0x0000000000020480L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_print126 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_query_in_print130 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_variableCall_in_print134 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_print137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableDecl148 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_variableDecl150 = new BitSet(new long[]{0x0000000000020480L});
	public static final BitSet FOLLOW_query_in_variableDecl155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_variableDecl159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_variableDecl163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableCall176 = new BitSet(new long[]{0x0000000000000002L});
}
