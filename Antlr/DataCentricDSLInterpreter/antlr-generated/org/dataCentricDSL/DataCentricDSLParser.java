// $ANTLR 3.5.2 D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2014-11-26 01:59:30

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
		"STRING_LITERAL", "WS", "'('", "')'", "';'", "'query'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
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
	@Override public String getGrammarFileName() { return "D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g"; }


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:1: program : ( query )* EOF !;
	public final DataCentricDSLParser.program_return program() throws RecognitionException {
		DataCentricDSLParser.program_return retval = new DataCentricDSLParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope query1 =null;

		CommonTree EOF2_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:41:8: ( ( query )* EOF !)
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:44:2: ( query )* EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:44:2: ( query )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==12) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:44:3: query
					{
					pushFollow(FOLLOW_query_in_program67);
					query1=query();
					state._fsp--;

					adaptor.addChild(root_0, query1.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program71); 
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:55:1: query : 'query' ^ '(' ! STRING_LITERAL ')' ! ';' !;
	public final DataCentricDSLParser.query_return query() throws RecognitionException {
		DataCentricDSLParser.query_return retval = new DataCentricDSLParser.query_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal3=null;
		Token char_literal4=null;
		Token STRING_LITERAL5=null;
		Token char_literal6=null;
		Token char_literal7=null;

		CommonTree string_literal3_tree=null;
		CommonTree char_literal4_tree=null;
		CommonTree STRING_LITERAL5_tree=null;
		CommonTree char_literal6_tree=null;
		CommonTree char_literal7_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:55:6: ( 'query' ^ '(' ! STRING_LITERAL ')' ! ';' !)
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:56:2: 'query' ^ '(' ! STRING_LITERAL ')' ! ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal3=(Token)match(input,12,FOLLOW_12_in_query92); 
			string_literal3_tree = (CommonTree)adaptor.create(string_literal3);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal3_tree, root_0);

			char_literal4=(Token)match(input,9,FOLLOW_9_in_query95); 
			STRING_LITERAL5=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_query98); 
			STRING_LITERAL5_tree = (CommonTree)adaptor.create(STRING_LITERAL5);
			adaptor.addChild(root_0, STRING_LITERAL5_tree);

			char_literal6=(Token)match(input,10,FOLLOW_10_in_query100); 
			char_literal7=(Token)match(input,11,FOLLOW_11_in_query103); 
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

	// Delegated rules



	public static final BitSet FOLLOW_query_in_program67 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_EOF_in_program71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_query92 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_query95 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_query98 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_query100 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_query103 = new BitSet(new long[]{0x0000000000000002L});
}
