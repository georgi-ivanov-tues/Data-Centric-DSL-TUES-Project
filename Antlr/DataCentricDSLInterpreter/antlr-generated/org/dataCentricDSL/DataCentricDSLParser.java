// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2014-12-13 17:34:04

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
		"NEGATION", "STRING_LITERAL", "WS", "'('", "')'", "'*'", "'+'", "'-'", 
		"'/'", "';'", "'='", "'mod'", "'print'", "'query'"
	};
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int BOOLEAN=4;
	public static final int COMMENT=5;
	public static final int DIGIT=6;
	public static final int ESCAPE=7;
	public static final int FLOAT=8;
	public static final int IDENT=9;
	public static final int INTEGER=10;
	public static final int LETTER=11;
	public static final int MULTILINE_COMMENT=12;
	public static final int NEGATION=13;
	public static final int STRING_LITERAL=14;
	public static final int WS=15;

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:45:1: program : ( ( query | print | variableDecl ) ';' !)* EOF !;
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
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:45:8: ( ( ( query | print | variableDecl ) ';' !)* EOF !)
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:2: ( ( query | print | variableDecl ) ';' !)* EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:2: ( ( query | print | variableDecl ) ';' !)*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IDENT||(LA2_0 >= 25 && LA2_0 <= 26)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:3: ( query | print | variableDecl ) ';' !
					{
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:3: ( query | print | variableDecl )
					int alt1=3;
					switch ( input.LA(1) ) {
					case 26:
						{
						alt1=1;
						}
						break;
					case 25:
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
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:4: query
							{
							pushFollow(FOLLOW_query_in_program76);
							query1=query();
							state._fsp--;

							adaptor.addChild(root_0, query1.getTree());

							}
							break;
						case 2 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:12: print
							{
							pushFollow(FOLLOW_print_in_program80);
							print2=print();
							state._fsp--;

							adaptor.addChild(root_0, print2.getTree());

							}
							break;
						case 3 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:20: variableDecl
							{
							pushFollow(FOLLOW_variableDecl_in_program84);
							variableDecl3=variableDecl();
							state._fsp--;

							adaptor.addChild(root_0, variableDecl3.getTree());

							}
							break;

					}

					char_literal4=(Token)match(input,22,FOLLOW_22_in_program87); 
					}
					break;

				default :
					break loop2;
				}
			}

			EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_program92); 
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:49:1: query : 'query' ^ ( STRING_LITERAL | variableCall ) ;
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
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:49:6: ( 'query' ^ ( STRING_LITERAL | variableCall ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:2: 'query' ^ ( STRING_LITERAL | variableCall )
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal6=(Token)match(input,26,FOLLOW_26_in_query104); 
			string_literal6_tree = (CommonTree)adaptor.create(string_literal6);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal6_tree, root_0);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:11: ( STRING_LITERAL | variableCall )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:12: STRING_LITERAL
					{
					STRING_LITERAL7=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_query108); 
					STRING_LITERAL7_tree = (CommonTree)adaptor.create(STRING_LITERAL7);
					adaptor.addChild(root_0, STRING_LITERAL7_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:29: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_query112);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:53:1: print : 'print' ^ ( STRING_LITERAL | query | variableCall ) ;
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
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:53:6: ( 'print' ^ ( STRING_LITERAL | query | variableCall ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:3: 'print' ^ ( STRING_LITERAL | query | variableCall )
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal9=(Token)match(input,25,FOLLOW_25_in_print123); 
			string_literal9_tree = (CommonTree)adaptor.create(string_literal9);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal9_tree, root_0);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:12: ( STRING_LITERAL | query | variableCall )
			int alt4=3;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt4=1;
				}
				break;
			case 26:
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:13: STRING_LITERAL
					{
					STRING_LITERAL10=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_print127); 
					STRING_LITERAL10_tree = (CommonTree)adaptor.create(STRING_LITERAL10);
					adaptor.addChild(root_0, STRING_LITERAL10_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:30: query
					{
					pushFollow(FOLLOW_query_in_print131);
					query11=query();
					state._fsp--;

					adaptor.addChild(root_0, query11.getTree());

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:38: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_print135);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:57:1: variableDecl : IDENT '=' ! ( query | STRING_LITERAL | FLOAT | BOOLEAN | expression ) ;
	public final DataCentricDSLParser.variableDecl_return variableDecl() throws RecognitionException {
		DataCentricDSLParser.variableDecl_return retval = new DataCentricDSLParser.variableDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT13=null;
		Token char_literal14=null;
		Token STRING_LITERAL16=null;
		Token FLOAT17=null;
		Token BOOLEAN18=null;
		ParserRuleReturnScope query15 =null;
		ParserRuleReturnScope expression19 =null;

		CommonTree IDENT13_tree=null;
		CommonTree char_literal14_tree=null;
		CommonTree STRING_LITERAL16_tree=null;
		CommonTree FLOAT17_tree=null;
		CommonTree BOOLEAN18_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:57:13: ( IDENT '=' ! ( query | STRING_LITERAL | FLOAT | BOOLEAN | expression ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:58:3: IDENT '=' ! ( query | STRING_LITERAL | FLOAT | BOOLEAN | expression )
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT13=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDecl146); 
			IDENT13_tree = (CommonTree)adaptor.create(IDENT13);
			adaptor.addChild(root_0, IDENT13_tree);

			char_literal14=(Token)match(input,23,FOLLOW_23_in_variableDecl148); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:58:14: ( query | STRING_LITERAL | FLOAT | BOOLEAN | expression )
			int alt5=5;
			switch ( input.LA(1) ) {
			case 26:
				{
				alt5=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt5=2;
				}
				break;
			case FLOAT:
				{
				alt5=3;
				}
				break;
			case BOOLEAN:
				{
				alt5=4;
				}
				break;
			case IDENT:
			case INTEGER:
			case 16:
			case 19:
			case 20:
				{
				alt5=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:58:16: query
					{
					pushFollow(FOLLOW_query_in_variableDecl153);
					query15=query();
					state._fsp--;

					adaptor.addChild(root_0, query15.getTree());

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:58:24: STRING_LITERAL
					{
					STRING_LITERAL16=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_variableDecl157); 
					STRING_LITERAL16_tree = (CommonTree)adaptor.create(STRING_LITERAL16);
					adaptor.addChild(root_0, STRING_LITERAL16_tree);

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:58:41: FLOAT
					{
					FLOAT17=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_variableDecl161); 
					FLOAT17_tree = (CommonTree)adaptor.create(FLOAT17);
					adaptor.addChild(root_0, FLOAT17_tree);

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:58:49: BOOLEAN
					{
					BOOLEAN18=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_variableDecl165); 
					BOOLEAN18_tree = (CommonTree)adaptor.create(BOOLEAN18);
					adaptor.addChild(root_0, BOOLEAN18_tree);

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:58:59: expression
					{
					pushFollow(FOLLOW_expression_in_variableDecl169);
					expression19=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression19.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:61:1: variableCall : IDENT ;
	public final DataCentricDSLParser.variableCall_return variableCall() throws RecognitionException {
		DataCentricDSLParser.variableCall_return retval = new DataCentricDSLParser.variableCall_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT20=null;

		CommonTree IDENT20_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:61:13: ( IDENT )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:62:3: IDENT
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT20=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableCall180); 
			IDENT20_tree = (CommonTree)adaptor.create(IDENT20);
			adaptor.addChild(root_0, IDENT20_tree);

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


	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:65:1: term : ( variableCall | '(' ! expression ')' !| INTEGER );
	public final DataCentricDSLParser.term_return term() throws RecognitionException {
		DataCentricDSLParser.term_return retval = new DataCentricDSLParser.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal22=null;
		Token char_literal24=null;
		Token INTEGER25=null;
		ParserRuleReturnScope variableCall21 =null;
		ParserRuleReturnScope expression23 =null;

		CommonTree char_literal22_tree=null;
		CommonTree char_literal24_tree=null;
		CommonTree INTEGER25_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:66:3: ( variableCall | '(' ! expression ')' !| INTEGER )
			int alt6=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt6=1;
				}
				break;
			case 16:
				{
				alt6=2;
				}
				break;
			case INTEGER:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:66:5: variableCall
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableCall_in_term191);
					variableCall21=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall21.getTree());

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:67:5: '(' ! expression ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal22=(Token)match(input,16,FOLLOW_16_in_term197); 
					pushFollow(FOLLOW_expression_in_term200);
					expression23=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression23.getTree());

					char_literal24=(Token)match(input,17,FOLLOW_17_in_term202); 
					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:68:5: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER25=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term209); 
					INTEGER25_tree = (CommonTree)adaptor.create(INTEGER25);
					adaptor.addChild(root_0, INTEGER25_tree);

					}
					break;

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
	// $ANTLR end "term"


	public static class unary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:71:1: unary : ( '+' !| negation ^)* term ;
	public final DataCentricDSLParser.unary_return unary() throws RecognitionException {
		DataCentricDSLParser.unary_return retval = new DataCentricDSLParser.unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal26=null;
		ParserRuleReturnScope negation27 =null;
		ParserRuleReturnScope term28 =null;

		CommonTree char_literal26_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:72:3: ( ( '+' !| negation ^)* term )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:72:5: ( '+' !| negation ^)* term
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:72:5: ( '+' !| negation ^)*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==19) ) {
					alt7=1;
				}
				else if ( (LA7_0==20) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:72:6: '+' !
					{
					char_literal26=(Token)match(input,19,FOLLOW_19_in_unary225); 
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:72:13: negation ^
					{
					pushFollow(FOLLOW_negation_in_unary230);
					negation27=negation();
					state._fsp--;

					root_0 = (CommonTree)adaptor.becomeRoot(negation27.getTree(), root_0);
					}
					break;

				default :
					break loop7;
				}
			}

			pushFollow(FOLLOW_term_in_unary235);
			term28=term();
			state._fsp--;

			adaptor.addChild(root_0, term28.getTree());

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
	// $ANTLR end "unary"


	public static class negation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "negation"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:75:1: negation : '-' -> NEGATION ;
	public final DataCentricDSLParser.negation_return negation() throws RecognitionException {
		DataCentricDSLParser.negation_return retval = new DataCentricDSLParser.negation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal29=null;

		CommonTree char_literal29_tree=null;
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:76:3: ( '-' -> NEGATION )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:76:5: '-'
			{
			char_literal29=(Token)match(input,20,FOLLOW_20_in_negation248);  
			stream_20.add(char_literal29);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 76:9: -> NEGATION
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));
			}


			retval.tree = root_0;

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
	// $ANTLR end "negation"


	public static class mult_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mult"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:79:1: mult : unary ( ( '*' ^| '/' ^| 'mod' ^) unary )* ;
	public final DataCentricDSLParser.mult_return mult() throws RecognitionException {
		DataCentricDSLParser.mult_return retval = new DataCentricDSLParser.mult_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal31=null;
		Token char_literal32=null;
		Token string_literal33=null;
		ParserRuleReturnScope unary30 =null;
		ParserRuleReturnScope unary34 =null;

		CommonTree char_literal31_tree=null;
		CommonTree char_literal32_tree=null;
		CommonTree string_literal33_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:3: ( unary ( ( '*' ^| '/' ^| 'mod' ^) unary )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:5: unary ( ( '*' ^| '/' ^| 'mod' ^) unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unary_in_mult265);
			unary30=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary30.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:11: ( ( '*' ^| '/' ^| 'mod' ^) unary )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==18||LA9_0==21||LA9_0==24) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:12: ( '*' ^| '/' ^| 'mod' ^) unary
					{
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:12: ( '*' ^| '/' ^| 'mod' ^)
					int alt8=3;
					switch ( input.LA(1) ) {
					case 18:
						{
						alt8=1;
						}
						break;
					case 21:
						{
						alt8=2;
						}
						break;
					case 24:
						{
						alt8=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:13: '*' ^
							{
							char_literal31=(Token)match(input,18,FOLLOW_18_in_mult269); 
							char_literal31_tree = (CommonTree)adaptor.create(char_literal31);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal31_tree, root_0);

							}
							break;
						case 2 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:20: '/' ^
							{
							char_literal32=(Token)match(input,21,FOLLOW_21_in_mult274); 
							char_literal32_tree = (CommonTree)adaptor.create(char_literal32);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal32_tree, root_0);

							}
							break;
						case 3 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:27: 'mod' ^
							{
							string_literal33=(Token)match(input,24,FOLLOW_24_in_mult279); 
							string_literal33_tree = (CommonTree)adaptor.create(string_literal33);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal33_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unary_in_mult283);
					unary34=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary34.getTree());

					}
					break;

				default :
					break loop9;
				}
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
	// $ANTLR end "mult"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:83:1: expression : mult ( ( '+' ^| '-' ^) mult )* ;
	public final DataCentricDSLParser.expression_return expression() throws RecognitionException {
		DataCentricDSLParser.expression_return retval = new DataCentricDSLParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal36=null;
		Token char_literal37=null;
		ParserRuleReturnScope mult35 =null;
		ParserRuleReturnScope mult38 =null;

		CommonTree char_literal36_tree=null;
		CommonTree char_literal37_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:3: ( mult ( ( '+' ^| '-' ^) mult )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:5: mult ( ( '+' ^| '-' ^) mult )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mult_in_expression300);
			mult35=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult35.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:10: ( ( '+' ^| '-' ^) mult )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= 19 && LA11_0 <= 20)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:11: ( '+' ^| '-' ^) mult
					{
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:11: ( '+' ^| '-' ^)
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==19) ) {
						alt10=1;
					}
					else if ( (LA10_0==20) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:12: '+' ^
							{
							char_literal36=(Token)match(input,19,FOLLOW_19_in_expression304); 
							char_literal36_tree = (CommonTree)adaptor.create(char_literal36);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal36_tree, root_0);

							}
							break;
						case 2 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:19: '-' ^
							{
							char_literal37=(Token)match(input,20,FOLLOW_20_in_expression309); 
							char_literal37_tree = (CommonTree)adaptor.create(char_literal37);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal37_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_mult_in_expression313);
					mult38=mult();
					state._fsp--;

					adaptor.addChild(root_0, mult38.getTree());

					}
					break;

				default :
					break loop11;
				}
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
	// $ANTLR end "expression"

	// Delegated rules



	public static final BitSet FOLLOW_query_in_program76 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_print_in_program80 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_variableDecl_in_program84 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_program87 = new BitSet(new long[]{0x0000000006000200L});
	public static final BitSet FOLLOW_EOF_in_program92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_query104 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_query108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_query112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_print123 = new BitSet(new long[]{0x0000000004004200L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_print127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_print131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_print135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableDecl146 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_variableDecl148 = new BitSet(new long[]{0x0000000004194710L});
	public static final BitSet FOLLOW_query_in_variableDecl153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_variableDecl157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_variableDecl161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_variableDecl165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableDecl169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableCall180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_term191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_term197 = new BitSet(new long[]{0x0000000000190600L});
	public static final BitSet FOLLOW_expression_in_term200 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_term202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_term209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_unary225 = new BitSet(new long[]{0x0000000000190600L});
	public static final BitSet FOLLOW_negation_in_unary230 = new BitSet(new long[]{0x0000000000190600L});
	public static final BitSet FOLLOW_term_in_unary235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_negation248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult265 = new BitSet(new long[]{0x0000000001240002L});
	public static final BitSet FOLLOW_18_in_mult269 = new BitSet(new long[]{0x0000000000190600L});
	public static final BitSet FOLLOW_21_in_mult274 = new BitSet(new long[]{0x0000000000190600L});
	public static final BitSet FOLLOW_24_in_mult279 = new BitSet(new long[]{0x0000000000190600L});
	public static final BitSet FOLLOW_unary_in_mult283 = new BitSet(new long[]{0x0000000001240002L});
	public static final BitSet FOLLOW_mult_in_expression300 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_19_in_expression304 = new BitSet(new long[]{0x0000000000190600L});
	public static final BitSet FOLLOW_20_in_expression309 = new BitSet(new long[]{0x0000000000190600L});
	public static final BitSet FOLLOW_mult_in_expression313 = new BitSet(new long[]{0x0000000000180002L});
}
