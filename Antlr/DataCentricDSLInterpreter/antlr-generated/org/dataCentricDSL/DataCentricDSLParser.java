// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2014-12-13 13:53:11

	package org.dataCentricDSL;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DataCentricDSLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN", "COMMENT", "DIGIT", 
		"ESCAPE", "FLOAT", "IDENT", "INTEGER", "LETTER", "MULTILINE_COMMENT", 
		"STRING_LITERAL", "WS", "';'", "'='", "'print'", "'query'"
	};
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
	@Override public String getGrammarFileName() { return "D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g"; }


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:1: program : ( ( query | print | variableDecl ) ';' !)* EOF !;
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
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:8: ( ( ( query | print | variableDecl ) ';' !)* EOF !)
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:2: ( ( query | print | variableDecl ) ';' !)* EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:2: ( ( query | print | variableDecl ) ';' !)*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IDENT||(LA2_0 >= 17 && LA2_0 <= 18)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:3: ( query | print | variableDecl ) ';' !
					{
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:3: ( query | print | variableDecl )
					int alt1=3;
					switch ( input.LA(1) ) {
					case 18:
						{
						alt1=1;
						}
						break;
					case 17:
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
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:4: query
							{
							pushFollow(FOLLOW_query_in_program66);
							query1=query();
							state._fsp--;

							adaptor.addChild(root_0, query1.getTree());

							}
							break;
						case 2 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:12: print
							{
							pushFollow(FOLLOW_print_in_program70);
							print2=print();
							state._fsp--;

							adaptor.addChild(root_0, print2.getTree());

							}
							break;
						case 3 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:20: variableDecl
							{
							pushFollow(FOLLOW_variableDecl_in_program74);
							variableDecl3=variableDecl();
							state._fsp--;

							adaptor.addChild(root_0, variableDecl3.getTree());

							}
							break;

					}

					char_literal4=(Token)match(input,15,FOLLOW_15_in_program77); 
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:45:1: query : 'query' ^ ( STRING_LITERAL | variableCall ) ;
	public final DataCentricDSLParser.query_return query() throws RecognitionException {
		DataCentricDSLParser.query_return retval = new DataCentricDSLParser.query_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal6=null;
		Token STRING_LITERAL7=null;
		ParserRuleReturnScope variableCall8 =null;

		CommonTree string_literal6_tree=null;
		CommonTree STRING_LITERAL7_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:45:6: ( 'query' ^ ( STRING_LITERAL | variableCall ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:2: 'query' ^ ( STRING_LITERAL | variableCall )
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal6=(Token)match(input,18,FOLLOW_18_in_query94); 
			string_literal6_tree = (CommonTree)adaptor.create(string_literal6);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal6_tree, root_0);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:11: ( STRING_LITERAL | variableCall )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:12: STRING_LITERAL
					{
					STRING_LITERAL7=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_query98); 
					STRING_LITERAL7_tree = (CommonTree)adaptor.create(STRING_LITERAL7);
					adaptor.addChild(root_0, STRING_LITERAL7_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:29: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_query102);
					variableCall8=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall8.getTree());

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
	// $ANTLR end "query"


	public static class print_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "print"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:49:1: print : 'print' ^ ( STRING_LITERAL | query | variableCall ) ;
	public final DataCentricDSLParser.print_return print() throws RecognitionException {
		DataCentricDSLParser.print_return retval = new DataCentricDSLParser.print_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal9=null;
		Token STRING_LITERAL10=null;
		ParserRuleReturnScope query11 =null;
		ParserRuleReturnScope variableCall12 =null;

		CommonTree string_literal9_tree=null;
		CommonTree STRING_LITERAL10_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:49:6: ( 'print' ^ ( STRING_LITERAL | query | variableCall ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:3: 'print' ^ ( STRING_LITERAL | query | variableCall )
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal9=(Token)match(input,17,FOLLOW_17_in_print113); 
			string_literal9_tree = (CommonTree)adaptor.create(string_literal9);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal9_tree, root_0);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:12: ( STRING_LITERAL | query | variableCall )
			int alt4=3;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt4=1;
				}
				break;
			case 18:
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:13: STRING_LITERAL
					{
					STRING_LITERAL10=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_print117); 
					STRING_LITERAL10_tree = (CommonTree)adaptor.create(STRING_LITERAL10);
					adaptor.addChild(root_0, STRING_LITERAL10_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:30: query
					{
					pushFollow(FOLLOW_query_in_print121);
					query11=query();
					state._fsp--;

					adaptor.addChild(root_0, query11.getTree());

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:38: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_print125);
					variableCall12=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall12.getTree());

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
	// $ANTLR end "print"


	public static class variableDecl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variableDecl"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:53:1: variableDecl : IDENT '=' ! ( query | STRING_LITERAL | variableCall | INTEGER | FLOAT | BOOLEAN ) ;
	public final DataCentricDSLParser.variableDecl_return variableDecl() throws RecognitionException {
		DataCentricDSLParser.variableDecl_return retval = new DataCentricDSLParser.variableDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT13=null;
		Token char_literal14=null;
		Token STRING_LITERAL16=null;
		Token INTEGER18=null;
		Token FLOAT19=null;
		Token BOOLEAN20=null;
		ParserRuleReturnScope query15 =null;
		ParserRuleReturnScope variableCall17 =null;

		CommonTree IDENT13_tree=null;
		CommonTree char_literal14_tree=null;
		CommonTree STRING_LITERAL16_tree=null;
		CommonTree INTEGER18_tree=null;
		CommonTree FLOAT19_tree=null;
		CommonTree BOOLEAN20_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:53:13: ( IDENT '=' ! ( query | STRING_LITERAL | variableCall | INTEGER | FLOAT | BOOLEAN ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:3: IDENT '=' ! ( query | STRING_LITERAL | variableCall | INTEGER | FLOAT | BOOLEAN )
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT13=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDecl136); 
			IDENT13_tree = (CommonTree)adaptor.create(IDENT13);
			adaptor.addChild(root_0, IDENT13_tree);

			char_literal14=(Token)match(input,16,FOLLOW_16_in_variableDecl138); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:14: ( query | STRING_LITERAL | variableCall | INTEGER | FLOAT | BOOLEAN )
			int alt5=6;
			switch ( input.LA(1) ) {
			case 18:
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
			case INTEGER:
				{
				alt5=4;
				}
				break;
			case FLOAT:
				{
				alt5=5;
				}
				break;
			case BOOLEAN:
				{
				alt5=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:16: query
					{
					pushFollow(FOLLOW_query_in_variableDecl143);
					query15=query();
					state._fsp--;

					adaptor.addChild(root_0, query15.getTree());

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:24: STRING_LITERAL
					{
					STRING_LITERAL16=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_variableDecl147); 
					STRING_LITERAL16_tree = (CommonTree)adaptor.create(STRING_LITERAL16);
					adaptor.addChild(root_0, STRING_LITERAL16_tree);

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:41: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_variableDecl151);
					variableCall17=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall17.getTree());

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:56: INTEGER
					{
					INTEGER18=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_variableDecl155); 
					INTEGER18_tree = (CommonTree)adaptor.create(INTEGER18);
					adaptor.addChild(root_0, INTEGER18_tree);

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:66: FLOAT
					{
					FLOAT19=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_variableDecl159); 
					FLOAT19_tree = (CommonTree)adaptor.create(FLOAT19);
					adaptor.addChild(root_0, FLOAT19_tree);

					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:74: BOOLEAN
					{
					BOOLEAN20=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_variableDecl163); 
					BOOLEAN20_tree = (CommonTree)adaptor.create(BOOLEAN20);
					adaptor.addChild(root_0, BOOLEAN20_tree);

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:57:1: variableCall : IDENT ;
	public final DataCentricDSLParser.variableCall_return variableCall() throws RecognitionException {
		DataCentricDSLParser.variableCall_return retval = new DataCentricDSLParser.variableCall_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT21=null;

		CommonTree IDENT21_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:57:13: ( IDENT )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:58:3: IDENT
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT21=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableCall174); 
			IDENT21_tree = (CommonTree)adaptor.create(IDENT21);
			adaptor.addChild(root_0, IDENT21_tree);

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



	public static final BitSet FOLLOW_query_in_program66 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_print_in_program70 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDecl_in_program74 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_program77 = new BitSet(new long[]{0x0000000000060200L});
	public static final BitSet FOLLOW_EOF_in_program82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_query94 = new BitSet(new long[]{0x0000000000002200L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_query98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_query102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_print113 = new BitSet(new long[]{0x0000000000042200L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_print117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_print121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_print125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableDecl136 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_variableDecl138 = new BitSet(new long[]{0x0000000000042710L});
	public static final BitSet FOLLOW_query_in_variableDecl143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_variableDecl147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_variableDecl151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_variableDecl155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_variableDecl159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_variableDecl163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableCall174 = new BitSet(new long[]{0x0000000000000002L});
}
