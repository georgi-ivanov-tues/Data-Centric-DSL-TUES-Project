// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2014-11-30 16:48:32

	package org.dataCentricDSL;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DataCentricDSLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESCAPE", "MULTILINE_COMMENT", 
		"STRING_LITERAL", "WS", "'('", "')'", "';'", "'print'", "'query'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int COMMENT=4;
	public static final int ESCAPE=5;
	public static final int MULTILINE_COMMENT=6;
	public static final int STRING_LITERAL=7;
	public static final int WS=8;

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:1: program : ( query | print )* ( ';' !| EOF !) ;
	public final DataCentricDSLParser.program_return program() throws RecognitionException {
		DataCentricDSLParser.program_return retval = new DataCentricDSLParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal3=null;
		Token EOF4=null;
		ParserRuleReturnScope query1 =null;
		ParserRuleReturnScope print2 =null;

		CommonTree char_literal3_tree=null;
		CommonTree EOF4_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:8: ( ( query | print )* ( ';' !| EOF !) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:2: ( query | print )* ( ';' !| EOF !)
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:2: ( query | print )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==13) ) {
					alt1=1;
				}
				else if ( (LA1_0==12) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:3: query
					{
					pushFollow(FOLLOW_query_in_program65);
					query1=query();
					state._fsp--;

					adaptor.addChild(root_0, query1.getTree());

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:11: print
					{
					pushFollow(FOLLOW_print_in_program69);
					print2=print();
					state._fsp--;

					adaptor.addChild(root_0, print2.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:19: ( ';' !| EOF !)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==11) ) {
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:20: ';' !
					{
					char_literal3=(Token)match(input,11,FOLLOW_11_in_program74); 
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:42:27: EOF !
					{
					EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_program79); 
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:45:1: query : 'query' ^ '(' ! STRING_LITERAL ')' !;
	public final DataCentricDSLParser.query_return query() throws RecognitionException {
		DataCentricDSLParser.query_return retval = new DataCentricDSLParser.query_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal5=null;
		Token char_literal6=null;
		Token STRING_LITERAL7=null;
		Token char_literal8=null;

		CommonTree string_literal5_tree=null;
		CommonTree char_literal6_tree=null;
		CommonTree STRING_LITERAL7_tree=null;
		CommonTree char_literal8_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:45:6: ( 'query' ^ '(' ! STRING_LITERAL ')' !)
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:46:2: 'query' ^ '(' ! STRING_LITERAL ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal5=(Token)match(input,13,FOLLOW_13_in_query92); 
			string_literal5_tree = (CommonTree)adaptor.create(string_literal5);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal5_tree, root_0);

			char_literal6=(Token)match(input,9,FOLLOW_9_in_query95); 
			STRING_LITERAL7=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_query98); 
			STRING_LITERAL7_tree = (CommonTree)adaptor.create(STRING_LITERAL7);
			adaptor.addChild(root_0, STRING_LITERAL7_tree);

			char_literal8=(Token)match(input,10,FOLLOW_10_in_query100); 
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:49:1: print : 'print' ^ '(' ! ( STRING_LITERAL | query ) ')' !;
	public final DataCentricDSLParser.print_return print() throws RecognitionException {
		DataCentricDSLParser.print_return retval = new DataCentricDSLParser.print_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal9=null;
		Token char_literal10=null;
		Token STRING_LITERAL11=null;
		Token char_literal13=null;
		ParserRuleReturnScope query12 =null;

		CommonTree string_literal9_tree=null;
		CommonTree char_literal10_tree=null;
		CommonTree STRING_LITERAL11_tree=null;
		CommonTree char_literal13_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:49:6: ( 'print' ^ '(' ! ( STRING_LITERAL | query ) ')' !)
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:3: 'print' ^ '(' ! ( STRING_LITERAL | query ) ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal9=(Token)match(input,12,FOLLOW_12_in_print111); 
			string_literal9_tree = (CommonTree)adaptor.create(string_literal9);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal9_tree, root_0);

			char_literal10=(Token)match(input,9,FOLLOW_9_in_print114); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:17: ( STRING_LITERAL | query )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==STRING_LITERAL) ) {
				alt3=1;
			}
			else if ( (LA3_0==13) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:18: STRING_LITERAL
					{
					STRING_LITERAL11=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_print118); 
					STRING_LITERAL11_tree = (CommonTree)adaptor.create(STRING_LITERAL11);
					adaptor.addChild(root_0, STRING_LITERAL11_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:50:35: query
					{
					pushFollow(FOLLOW_query_in_print122);
					query12=query();
					state._fsp--;

					adaptor.addChild(root_0, query12.getTree());

					}
					break;

			}

			char_literal13=(Token)match(input,10,FOLLOW_10_in_print125); 
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

	// Delegated rules



	public static final BitSet FOLLOW_query_in_program65 = new BitSet(new long[]{0x0000000000003800L});
	public static final BitSet FOLLOW_print_in_program69 = new BitSet(new long[]{0x0000000000003800L});
	public static final BitSet FOLLOW_11_in_program74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOF_in_program79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_query92 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_query95 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_query98 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_query100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_print111 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_print114 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_print118 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_query_in_print122 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print125 = new BitSet(new long[]{0x0000000000000002L});
}
