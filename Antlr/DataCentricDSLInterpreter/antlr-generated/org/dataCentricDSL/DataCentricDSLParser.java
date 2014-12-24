// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2014-12-24 17:09:54

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
		"NEGATION", "STRING_LITERAL", "WS", "'!='", "'('", "')'", "'*'", "'+'", 
		"'-'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'and'", 
		"'else'", "'if'", "'mod'", "'or'", "'print'", "'query'", "'then'"
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
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:45:1: program : ( block )* EOF !;
	public final DataCentricDSLParser.program_return program() throws RecognitionException {
		DataCentricDSLParser.program_return retval = new DataCentricDSLParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope block1 =null;

		CommonTree EOF2_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:45:8: ( ( block )* EOF !)
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:2: ( block )* EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:2: ( block )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==IDENT||LA1_0==32||LA1_0==35) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:2: block
					{
					pushFollow(FOLLOW_block_in_program74);
					block1=block();
					state._fsp--;

					adaptor.addChild(root_0, block1.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program77); 
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


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:49:1: block : ( ( ( print | variableDecl ) ';' !) | ifStatement ) ;
	public final DataCentricDSLParser.block_return block() throws RecognitionException {
		DataCentricDSLParser.block_return retval = new DataCentricDSLParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal5=null;
		ParserRuleReturnScope print3 =null;
		ParserRuleReturnScope variableDecl4 =null;
		ParserRuleReturnScope ifStatement6 =null;

		CommonTree char_literal5_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:49:6: ( ( ( ( print | variableDecl ) ';' !) | ifStatement ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:51:3: ( ( ( print | variableDecl ) ';' !) | ifStatement )
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:51:3: ( ( ( print | variableDecl ) ';' !) | ifStatement )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==IDENT||LA3_0==35) ) {
				alt3=1;
			}
			else if ( (LA3_0==32) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:51:4: ( ( print | variableDecl ) ';' !)
					{
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:51:4: ( ( print | variableDecl ) ';' !)
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:51:5: ( print | variableDecl ) ';' !
					{
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:51:5: ( print | variableDecl )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==35) ) {
						alt2=1;
					}
					else if ( (LA2_0==IDENT) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:51:6: print
							{
							pushFollow(FOLLOW_print_in_block95);
							print3=print();
							state._fsp--;

							adaptor.addChild(root_0, print3.getTree());

							}
							break;
						case 2 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:51:14: variableDecl
							{
							pushFollow(FOLLOW_variableDecl_in_block99);
							variableDecl4=variableDecl();
							state._fsp--;

							adaptor.addChild(root_0, variableDecl4.getTree());

							}
							break;

					}

					char_literal5=(Token)match(input,23,FOLLOW_23_in_block102); 
					}

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:51:36: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_block108);
					ifStatement6=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement6.getTree());

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
	// $ANTLR end "block"


	public static class query_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:1: query : 'query' ^ ( STRING_LITERAL | variableCall ) ;
	public final DataCentricDSLParser.query_return query() throws RecognitionException {
		DataCentricDSLParser.query_return retval = new DataCentricDSLParser.query_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal7=null;
		Token STRING_LITERAL8=null;
		ParserRuleReturnScope variableCall9 =null;

		CommonTree string_literal7_tree=null;
		CommonTree STRING_LITERAL8_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:54:6: ( 'query' ^ ( STRING_LITERAL | variableCall ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:55:2: 'query' ^ ( STRING_LITERAL | variableCall )
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal7=(Token)match(input,36,FOLLOW_36_in_query119); 
			string_literal7_tree = (CommonTree)adaptor.create(string_literal7);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal7_tree, root_0);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:55:11: ( STRING_LITERAL | variableCall )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==STRING_LITERAL) ) {
				alt4=1;
			}
			else if ( (LA4_0==IDENT) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:55:12: STRING_LITERAL
					{
					STRING_LITERAL8=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_query123); 
					STRING_LITERAL8_tree = (CommonTree)adaptor.create(STRING_LITERAL8);
					adaptor.addChild(root_0, STRING_LITERAL8_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:55:29: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_query127);
					variableCall9=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall9.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:58:1: print : 'print' ^ ( STRING_LITERAL | query | variableCall ) ;
	public final DataCentricDSLParser.print_return print() throws RecognitionException {
		DataCentricDSLParser.print_return retval = new DataCentricDSLParser.print_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal10=null;
		Token STRING_LITERAL11=null;
		ParserRuleReturnScope query12 =null;
		ParserRuleReturnScope variableCall13 =null;

		CommonTree string_literal10_tree=null;
		CommonTree STRING_LITERAL11_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:58:6: ( 'print' ^ ( STRING_LITERAL | query | variableCall ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:59:3: 'print' ^ ( STRING_LITERAL | query | variableCall )
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal10=(Token)match(input,35,FOLLOW_35_in_print138); 
			string_literal10_tree = (CommonTree)adaptor.create(string_literal10);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal10_tree, root_0);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:59:12: ( STRING_LITERAL | query | variableCall )
			int alt5=3;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt5=1;
				}
				break;
			case 36:
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:59:13: STRING_LITERAL
					{
					STRING_LITERAL11=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_print142); 
					STRING_LITERAL11_tree = (CommonTree)adaptor.create(STRING_LITERAL11);
					adaptor.addChild(root_0, STRING_LITERAL11_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:59:30: query
					{
					pushFollow(FOLLOW_query_in_print146);
					query12=query();
					state._fsp--;

					adaptor.addChild(root_0, query12.getTree());

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:59:38: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_print150);
					variableCall13=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall13.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:62:1: variableDecl : IDENT '=' ! ( query | STRING_LITERAL | FLOAT | BOOLEAN | expression ) ;
	public final DataCentricDSLParser.variableDecl_return variableDecl() throws RecognitionException {
		DataCentricDSLParser.variableDecl_return retval = new DataCentricDSLParser.variableDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT14=null;
		Token char_literal15=null;
		Token STRING_LITERAL17=null;
		Token FLOAT18=null;
		Token BOOLEAN19=null;
		ParserRuleReturnScope query16 =null;
		ParserRuleReturnScope expression20 =null;

		CommonTree IDENT14_tree=null;
		CommonTree char_literal15_tree=null;
		CommonTree STRING_LITERAL17_tree=null;
		CommonTree FLOAT18_tree=null;
		CommonTree BOOLEAN19_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:62:13: ( IDENT '=' ! ( query | STRING_LITERAL | FLOAT | BOOLEAN | expression ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:63:3: IDENT '=' ! ( query | STRING_LITERAL | FLOAT | BOOLEAN | expression )
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT14=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDecl161); 
			IDENT14_tree = (CommonTree)adaptor.create(IDENT14);
			adaptor.addChild(root_0, IDENT14_tree);

			char_literal15=(Token)match(input,26,FOLLOW_26_in_variableDecl163); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:63:14: ( query | STRING_LITERAL | FLOAT | BOOLEAN | expression )
			int alt6=5;
			switch ( input.LA(1) ) {
			case 36:
				{
				alt6=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt6=2;
				}
				break;
			case FLOAT:
				{
				alt6=3;
				}
				break;
			case BOOLEAN:
				{
				alt6=4;
				}
				break;
			case IDENT:
			case INTEGER:
			case 17:
			case 20:
			case 21:
				{
				alt6=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:63:16: query
					{
					pushFollow(FOLLOW_query_in_variableDecl168);
					query16=query();
					state._fsp--;

					adaptor.addChild(root_0, query16.getTree());

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:63:24: STRING_LITERAL
					{
					STRING_LITERAL17=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_variableDecl172); 
					STRING_LITERAL17_tree = (CommonTree)adaptor.create(STRING_LITERAL17);
					adaptor.addChild(root_0, STRING_LITERAL17_tree);

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:63:41: FLOAT
					{
					FLOAT18=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_variableDecl176); 
					FLOAT18_tree = (CommonTree)adaptor.create(FLOAT18);
					adaptor.addChild(root_0, FLOAT18_tree);

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:63:49: BOOLEAN
					{
					BOOLEAN19=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_variableDecl180); 
					BOOLEAN19_tree = (CommonTree)adaptor.create(BOOLEAN19);
					adaptor.addChild(root_0, BOOLEAN19_tree);

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:63:59: expression
					{
					pushFollow(FOLLOW_expression_in_variableDecl184);
					expression20=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression20.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:66:1: variableCall : IDENT ;
	public final DataCentricDSLParser.variableCall_return variableCall() throws RecognitionException {
		DataCentricDSLParser.variableCall_return retval = new DataCentricDSLParser.variableCall_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT21=null;

		CommonTree IDENT21_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:66:13: ( IDENT )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:67:3: IDENT
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT21=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableCall195); 
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


	public static class ifStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:71:1: ifStatement : 'if' a= if_expression 'then' b= if_expression ( 'else' c= if_expression )? -> ^( 'if' $a $b ( $c)? ) ;
	public final DataCentricDSLParser.ifStatement_return ifStatement() throws RecognitionException {
		DataCentricDSLParser.ifStatement_return retval = new DataCentricDSLParser.ifStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal22=null;
		Token string_literal23=null;
		Token string_literal24=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		CommonTree string_literal22_tree=null;
		CommonTree string_literal23_tree=null;
		CommonTree string_literal24_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_if_expression=new RewriteRuleSubtreeStream(adaptor,"rule if_expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:73:4: ( 'if' a= if_expression 'then' b= if_expression ( 'else' c= if_expression )? -> ^( 'if' $a $b ( $c)? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:73:4: 'if' a= if_expression 'then' b= if_expression ( 'else' c= if_expression )?
			{
			string_literal22=(Token)match(input,32,FOLLOW_32_in_ifStatement207);  
			stream_32.add(string_literal22);

			pushFollow(FOLLOW_if_expression_in_ifStatement211);
			a=if_expression();
			state._fsp--;

			stream_if_expression.add(a.getTree());
			string_literal23=(Token)match(input,37,FOLLOW_37_in_ifStatement213);  
			stream_37.add(string_literal23);

			pushFollow(FOLLOW_if_expression_in_ifStatement217);
			b=if_expression();
			state._fsp--;

			stream_if_expression.add(b.getTree());
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:73:48: ( 'else' c= if_expression )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==31) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:73:49: 'else' c= if_expression
					{
					string_literal24=(Token)match(input,31,FOLLOW_31_in_ifStatement220);  
					stream_31.add(string_literal24);

					pushFollow(FOLLOW_if_expression_in_ifStatement224);
					c=if_expression();
					state._fsp--;

					stream_if_expression.add(c.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: b, 32, c, a
			// token labels: 
			// rule labels: retval, b, c, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 73:75: -> ^( 'if' $a $b ( $c)? )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:73:78: ^( 'if' $a $b ( $c)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_32.nextNode(), root_1);
				adaptor.addChild(root_1, stream_a.nextTree());
				adaptor.addChild(root_1, stream_b.nextTree());
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:73:92: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextTree());
				}
				stream_c.reset();

				adaptor.addChild(root_0, root_1);
				}

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
	// $ANTLR end "ifStatement"


	public static class if_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "if_expression"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:76:1: if_expression : orExpression ;
	public final DataCentricDSLParser.if_expression_return if_expression() throws RecognitionException {
		DataCentricDSLParser.if_expression_return retval = new DataCentricDSLParser.if_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope orExpression25 =null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:77:3: ( orExpression )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:77:6: orExpression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_orExpression_in_if_expression257);
			orExpression25=orExpression();
			state._fsp--;

			adaptor.addChild(root_0, orExpression25.getTree());

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
	// $ANTLR end "if_expression"


	public static class orExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "orExpression"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:1: orExpression : andExpression ( 'or' ^ andExpression )* ;
	public final DataCentricDSLParser.orExpression_return orExpression() throws RecognitionException {
		DataCentricDSLParser.orExpression_return retval = new DataCentricDSLParser.orExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal27=null;
		ParserRuleReturnScope andExpression26 =null;
		ParserRuleReturnScope andExpression28 =null;

		CommonTree string_literal27_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:81:3: ( andExpression ( 'or' ^ andExpression )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:81:6: andExpression ( 'or' ^ andExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_andExpression_in_orExpression271);
			andExpression26=andExpression();
			state._fsp--;

			adaptor.addChild(root_0, andExpression26.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:81:20: ( 'or' ^ andExpression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==34) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:81:21: 'or' ^ andExpression
					{
					string_literal27=(Token)match(input,34,FOLLOW_34_in_orExpression274); 
					string_literal27_tree = (CommonTree)adaptor.create(string_literal27);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal27_tree, root_0);

					pushFollow(FOLLOW_andExpression_in_orExpression277);
					andExpression28=andExpression();
					state._fsp--;

					adaptor.addChild(root_0, andExpression28.getTree());

					}
					break;

				default :
					break loop8;
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
	// $ANTLR end "orExpression"


	public static class andExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "andExpression"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:1: andExpression : equalityExpression ( 'and' ^ equalityExpression )* ;
	public final DataCentricDSLParser.andExpression_return andExpression() throws RecognitionException {
		DataCentricDSLParser.andExpression_return retval = new DataCentricDSLParser.andExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal30=null;
		ParserRuleReturnScope equalityExpression29 =null;
		ParserRuleReturnScope equalityExpression31 =null;

		CommonTree string_literal30_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:3: ( equalityExpression ( 'and' ^ equalityExpression )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:6: equalityExpression ( 'and' ^ equalityExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_andExpression293);
			equalityExpression29=equalityExpression();
			state._fsp--;

			adaptor.addChild(root_0, equalityExpression29.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:25: ( 'and' ^ equalityExpression )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==30) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:26: 'and' ^ equalityExpression
					{
					string_literal30=(Token)match(input,30,FOLLOW_30_in_andExpression296); 
					string_literal30_tree = (CommonTree)adaptor.create(string_literal30);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal30_tree, root_0);

					pushFollow(FOLLOW_equalityExpression_in_andExpression299);
					equalityExpression31=equalityExpression();
					state._fsp--;

					adaptor.addChild(root_0, equalityExpression31.getTree());

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
	// $ANTLR end "andExpression"


	public static class equalityExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equalityExpression"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:88:1: equalityExpression : relationalExpression ( ( '==' | '!=' ) ^ relationalExpression )* ;
	public final DataCentricDSLParser.equalityExpression_return equalityExpression() throws RecognitionException {
		DataCentricDSLParser.equalityExpression_return retval = new DataCentricDSLParser.equalityExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set33=null;
		ParserRuleReturnScope relationalExpression32 =null;
		ParserRuleReturnScope relationalExpression34 =null;

		CommonTree set33_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:89:3: ( relationalExpression ( ( '==' | '!=' ) ^ relationalExpression )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:89:6: relationalExpression ( ( '==' | '!=' ) ^ relationalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression315);
			relationalExpression32=relationalExpression();
			state._fsp--;

			adaptor.addChild(root_0, relationalExpression32.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:89:27: ( ( '==' | '!=' ) ^ relationalExpression )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==16||LA10_0==27) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:89:28: ( '==' | '!=' ) ^ relationalExpression
					{
					set33=input.LT(1);
					set33=input.LT(1);
					if ( input.LA(1)==16||input.LA(1)==27 ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set33), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression327);
					relationalExpression34=relationalExpression();
					state._fsp--;

					adaptor.addChild(root_0, relationalExpression34.getTree());

					}
					break;

				default :
					break loop10;
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
	// $ANTLR end "equalityExpression"


	public static class relationalExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relationalExpression"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:92:1: relationalExpression : atom ( ( '<=' | '<' | '>=' | '>' ) ^ atom )* ;
	public final DataCentricDSLParser.relationalExpression_return relationalExpression() throws RecognitionException {
		DataCentricDSLParser.relationalExpression_return retval = new DataCentricDSLParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set36=null;
		ParserRuleReturnScope atom35 =null;
		ParserRuleReturnScope atom37 =null;

		CommonTree set36_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:93:3: ( atom ( ( '<=' | '<' | '>=' | '>' ) ^ atom )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:93:6: atom ( ( '<=' | '<' | '>=' | '>' ) ^ atom )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_atom_in_relationalExpression343);
			atom35=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom35.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:93:11: ( ( '<=' | '<' | '>=' | '>' ) ^ atom )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= 24 && LA11_0 <= 25)||(LA11_0 >= 28 && LA11_0 <= 29)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:93:12: ( '<=' | '<' | '>=' | '>' ) ^ atom
					{
					set36=input.LT(1);
					set36=input.LT(1);
					if ( (input.LA(1) >= 24 && input.LA(1) <= 25)||(input.LA(1) >= 28 && input.LA(1) <= 29) ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set36), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atom_in_relationalExpression363);
					atom37=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom37.getTree());

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
	// $ANTLR end "relationalExpression"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:96:1: atom : ( BOOLEAN | INTEGER | variableCall | '(' if_expression ')' -> if_expression | print );
	public final DataCentricDSLParser.atom_return atom() throws RecognitionException {
		DataCentricDSLParser.atom_return retval = new DataCentricDSLParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BOOLEAN38=null;
		Token INTEGER39=null;
		Token char_literal41=null;
		Token char_literal43=null;
		ParserRuleReturnScope variableCall40 =null;
		ParserRuleReturnScope if_expression42 =null;
		ParserRuleReturnScope print44 =null;

		CommonTree BOOLEAN38_tree=null;
		CommonTree INTEGER39_tree=null;
		CommonTree char_literal41_tree=null;
		CommonTree char_literal43_tree=null;
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
		RewriteRuleSubtreeStream stream_if_expression=new RewriteRuleSubtreeStream(adaptor,"rule if_expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:97:3: ( BOOLEAN | INTEGER | variableCall | '(' if_expression ')' -> if_expression | print )
			int alt12=5;
			switch ( input.LA(1) ) {
			case BOOLEAN:
				{
				alt12=1;
				}
				break;
			case INTEGER:
				{
				alt12=2;
				}
				break;
			case IDENT:
				{
				alt12=3;
				}
				break;
			case 17:
				{
				alt12=4;
				}
				break;
			case 35:
				{
				alt12=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:97:6: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN38=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom379); 
					BOOLEAN38_tree = (CommonTree)adaptor.create(BOOLEAN38);
					adaptor.addChild(root_0, BOOLEAN38_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:98:6: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER39=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atom386); 
					INTEGER39_tree = (CommonTree)adaptor.create(INTEGER39);
					adaptor.addChild(root_0, INTEGER39_tree);

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:99:6: variableCall
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableCall_in_atom393);
					variableCall40=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall40.getTree());

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:100:6: '(' if_expression ')'
					{
					char_literal41=(Token)match(input,17,FOLLOW_17_in_atom400);  
					stream_17.add(char_literal41);

					pushFollow(FOLLOW_if_expression_in_atom402);
					if_expression42=if_expression();
					state._fsp--;

					stream_if_expression.add(if_expression42.getTree());
					char_literal43=(Token)match(input,18,FOLLOW_18_in_atom404);  
					stream_18.add(char_literal43);

					// AST REWRITE
					// elements: if_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 100:28: -> if_expression
					{
						adaptor.addChild(root_0, stream_if_expression.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:101:6: print
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_print_in_atom415);
					print44=print();
					state._fsp--;

					adaptor.addChild(root_0, print44.getTree());

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
	// $ANTLR end "atom"


	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:106:1: term : ( variableCall | '(' ! expression ')' !| INTEGER );
	public final DataCentricDSLParser.term_return term() throws RecognitionException {
		DataCentricDSLParser.term_return retval = new DataCentricDSLParser.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal46=null;
		Token char_literal48=null;
		Token INTEGER49=null;
		ParserRuleReturnScope variableCall45 =null;
		ParserRuleReturnScope expression47 =null;

		CommonTree char_literal46_tree=null;
		CommonTree char_literal48_tree=null;
		CommonTree INTEGER49_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:3: ( variableCall | '(' ! expression ')' !| INTEGER )
			int alt13=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt13=1;
				}
				break;
			case 17:
				{
				alt13=2;
				}
				break;
			case INTEGER:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:5: variableCall
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableCall_in_term430);
					variableCall45=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall45.getTree());

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:108:5: '(' ! expression ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal46=(Token)match(input,17,FOLLOW_17_in_term436); 
					pushFollow(FOLLOW_expression_in_term439);
					expression47=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression47.getTree());

					char_literal48=(Token)match(input,18,FOLLOW_18_in_term441); 
					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:109:5: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER49=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term448); 
					INTEGER49_tree = (CommonTree)adaptor.create(INTEGER49);
					adaptor.addChild(root_0, INTEGER49_tree);

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:1: unary : ( '+' !| negation ^)* term ;
	public final DataCentricDSLParser.unary_return unary() throws RecognitionException {
		DataCentricDSLParser.unary_return retval = new DataCentricDSLParser.unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal50=null;
		ParserRuleReturnScope negation51 =null;
		ParserRuleReturnScope term52 =null;

		CommonTree char_literal50_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:3: ( ( '+' !| negation ^)* term )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:5: ( '+' !| negation ^)* term
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:5: ( '+' !| negation ^)*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==20) ) {
					alt14=1;
				}
				else if ( (LA14_0==21) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:6: '+' !
					{
					char_literal50=(Token)match(input,20,FOLLOW_20_in_unary464); 
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:13: negation ^
					{
					pushFollow(FOLLOW_negation_in_unary469);
					negation51=negation();
					state._fsp--;

					root_0 = (CommonTree)adaptor.becomeRoot(negation51.getTree(), root_0);
					}
					break;

				default :
					break loop14;
				}
			}

			pushFollow(FOLLOW_term_in_unary474);
			term52=term();
			state._fsp--;

			adaptor.addChild(root_0, term52.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:116:1: negation : '-' -> NEGATION ;
	public final DataCentricDSLParser.negation_return negation() throws RecognitionException {
		DataCentricDSLParser.negation_return retval = new DataCentricDSLParser.negation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal53=null;

		CommonTree char_literal53_tree=null;
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:117:3: ( '-' -> NEGATION )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:117:5: '-'
			{
			char_literal53=(Token)match(input,21,FOLLOW_21_in_negation487);  
			stream_21.add(char_literal53);

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
			// 117:9: -> NEGATION
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:120:1: mult : unary ( ( '*' ^| '/' ^| 'mod' ^) unary )* ;
	public final DataCentricDSLParser.mult_return mult() throws RecognitionException {
		DataCentricDSLParser.mult_return retval = new DataCentricDSLParser.mult_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal55=null;
		Token char_literal56=null;
		Token string_literal57=null;
		ParserRuleReturnScope unary54 =null;
		ParserRuleReturnScope unary58 =null;

		CommonTree char_literal55_tree=null;
		CommonTree char_literal56_tree=null;
		CommonTree string_literal57_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:121:3: ( unary ( ( '*' ^| '/' ^| 'mod' ^) unary )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:121:5: unary ( ( '*' ^| '/' ^| 'mod' ^) unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unary_in_mult504);
			unary54=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary54.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:121:11: ( ( '*' ^| '/' ^| 'mod' ^) unary )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==19||LA16_0==22||LA16_0==33) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:121:12: ( '*' ^| '/' ^| 'mod' ^) unary
					{
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:121:12: ( '*' ^| '/' ^| 'mod' ^)
					int alt15=3;
					switch ( input.LA(1) ) {
					case 19:
						{
						alt15=1;
						}
						break;
					case 22:
						{
						alt15=2;
						}
						break;
					case 33:
						{
						alt15=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}
					switch (alt15) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:121:13: '*' ^
							{
							char_literal55=(Token)match(input,19,FOLLOW_19_in_mult508); 
							char_literal55_tree = (CommonTree)adaptor.create(char_literal55);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal55_tree, root_0);

							}
							break;
						case 2 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:121:20: '/' ^
							{
							char_literal56=(Token)match(input,22,FOLLOW_22_in_mult513); 
							char_literal56_tree = (CommonTree)adaptor.create(char_literal56);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal56_tree, root_0);

							}
							break;
						case 3 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:121:27: 'mod' ^
							{
							string_literal57=(Token)match(input,33,FOLLOW_33_in_mult518); 
							string_literal57_tree = (CommonTree)adaptor.create(string_literal57);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal57_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unary_in_mult522);
					unary58=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary58.getTree());

					}
					break;

				default :
					break loop16;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:124:1: expression : mult ( ( '+' ^| '-' ^) mult )* ;
	public final DataCentricDSLParser.expression_return expression() throws RecognitionException {
		DataCentricDSLParser.expression_return retval = new DataCentricDSLParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal60=null;
		Token char_literal61=null;
		ParserRuleReturnScope mult59 =null;
		ParserRuleReturnScope mult62 =null;

		CommonTree char_literal60_tree=null;
		CommonTree char_literal61_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:125:3: ( mult ( ( '+' ^| '-' ^) mult )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:125:5: mult ( ( '+' ^| '-' ^) mult )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mult_in_expression539);
			mult59=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult59.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:125:10: ( ( '+' ^| '-' ^) mult )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= 20 && LA18_0 <= 21)) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:125:11: ( '+' ^| '-' ^) mult
					{
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:125:11: ( '+' ^| '-' ^)
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==20) ) {
						alt17=1;
					}
					else if ( (LA17_0==21) ) {
						alt17=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:125:12: '+' ^
							{
							char_literal60=(Token)match(input,20,FOLLOW_20_in_expression543); 
							char_literal60_tree = (CommonTree)adaptor.create(char_literal60);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal60_tree, root_0);

							}
							break;
						case 2 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:125:19: '-' ^
							{
							char_literal61=(Token)match(input,21,FOLLOW_21_in_expression548); 
							char_literal61_tree = (CommonTree)adaptor.create(char_literal61);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal61_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_mult_in_expression552);
					mult62=mult();
					state._fsp--;

					adaptor.addChild(root_0, mult62.getTree());

					}
					break;

				default :
					break loop18;
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



	public static final BitSet FOLLOW_block_in_program74 = new BitSet(new long[]{0x0000000900000200L});
	public static final BitSet FOLLOW_EOF_in_program77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_block95 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_variableDecl_in_block99 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_block102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_block108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_query119 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_query123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_query127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_print138 = new BitSet(new long[]{0x0000001000004200L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_print142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_print146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_print150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableDecl161 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_variableDecl163 = new BitSet(new long[]{0x0000001000324710L});
	public static final BitSet FOLLOW_query_in_variableDecl168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_variableDecl172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_variableDecl176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_variableDecl180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableDecl184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableCall195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_ifStatement207 = new BitSet(new long[]{0x0000000800020610L});
	public static final BitSet FOLLOW_if_expression_in_ifStatement211 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_ifStatement213 = new BitSet(new long[]{0x0000000800020610L});
	public static final BitSet FOLLOW_if_expression_in_ifStatement217 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_ifStatement220 = new BitSet(new long[]{0x0000000800020610L});
	public static final BitSet FOLLOW_if_expression_in_ifStatement224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpression_in_if_expression257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpression_in_orExpression271 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_orExpression274 = new BitSet(new long[]{0x0000000800020610L});
	public static final BitSet FOLLOW_andExpression_in_orExpression277 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression293 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_andExpression296 = new BitSet(new long[]{0x0000000800020610L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression299 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression315 = new BitSet(new long[]{0x0000000008010002L});
	public static final BitSet FOLLOW_set_in_equalityExpression318 = new BitSet(new long[]{0x0000000800020610L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression327 = new BitSet(new long[]{0x0000000008010002L});
	public static final BitSet FOLLOW_atom_in_relationalExpression343 = new BitSet(new long[]{0x0000000033000002L});
	public static final BitSet FOLLOW_set_in_relationalExpression346 = new BitSet(new long[]{0x0000000800020610L});
	public static final BitSet FOLLOW_atom_in_relationalExpression363 = new BitSet(new long[]{0x0000000033000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_atom379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_atom386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_atom393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_atom400 = new BitSet(new long[]{0x0000000800020610L});
	public static final BitSet FOLLOW_if_expression_in_atom402 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_atom404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_atom415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_term430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_term436 = new BitSet(new long[]{0x0000000000320600L});
	public static final BitSet FOLLOW_expression_in_term439 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_term441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_term448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_unary464 = new BitSet(new long[]{0x0000000000320600L});
	public static final BitSet FOLLOW_negation_in_unary469 = new BitSet(new long[]{0x0000000000320600L});
	public static final BitSet FOLLOW_term_in_unary474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_negation487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult504 = new BitSet(new long[]{0x0000000200480002L});
	public static final BitSet FOLLOW_19_in_mult508 = new BitSet(new long[]{0x0000000000320600L});
	public static final BitSet FOLLOW_22_in_mult513 = new BitSet(new long[]{0x0000000000320600L});
	public static final BitSet FOLLOW_33_in_mult518 = new BitSet(new long[]{0x0000000000320600L});
	public static final BitSet FOLLOW_unary_in_mult522 = new BitSet(new long[]{0x0000000200480002L});
	public static final BitSet FOLLOW_mult_in_expression539 = new BitSet(new long[]{0x0000000000300002L});
	public static final BitSet FOLLOW_20_in_expression543 = new BitSet(new long[]{0x0000000000320600L});
	public static final BitSet FOLLOW_21_in_expression548 = new BitSet(new long[]{0x0000000000320600L});
	public static final BitSet FOLLOW_mult_in_expression552 = new BitSet(new long[]{0x0000000000300002L});
}
