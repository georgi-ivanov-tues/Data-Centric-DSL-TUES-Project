// $ANTLR 3.5.2 D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2014-11-24 22:02:42

	package org.dataCentricDSL;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DataCentricDSLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "REQUEST_STRING", "STRING", "WS", 
		"'('", "')'", "';'", "'import'", "'package'", "'query'"
	};
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
	@Override public String getGrammarFileName() { return "D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:16:1: program : ( query ^)* ;
	public final DataCentricDSLParser.program_return program() throws RecognitionException {
		DataCentricDSLParser.program_return retval = new DataCentricDSLParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope query1 =null;


		try {
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:16:8: ( ( query ^)* )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:19:2: ( query ^)*
			{
			root_0 = (Object)adaptor.nil();


			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:19:2: ( query ^)*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==12) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:19:3: query ^
					{
					pushFollow(FOLLOW_query_in_program50);
					query1=query();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(query1.getTree(), root_0);
					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class package_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "package_declaration"
	// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:22:1: package_declaration : 'package' STRING ';' ;
	public final DataCentricDSLParser.package_declaration_return package_declaration() throws RecognitionException {
		DataCentricDSLParser.package_declaration_return retval = new DataCentricDSLParser.package_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal2=null;
		Token STRING3=null;
		Token char_literal4=null;

		Object string_literal2_tree=null;
		Object STRING3_tree=null;
		Object char_literal4_tree=null;

		try {
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:22:20: ( 'package' STRING ';' )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:23:2: 'package' STRING ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal2=(Token)match(input,11,FOLLOW_11_in_package_declaration64); 
			string_literal2_tree = (Object)adaptor.create(string_literal2);
			adaptor.addChild(root_0, string_literal2_tree);

			STRING3=(Token)match(input,STRING,FOLLOW_STRING_in_package_declaration66); 
			STRING3_tree = (Object)adaptor.create(STRING3);
			adaptor.addChild(root_0, STRING3_tree);

			char_literal4=(Token)match(input,9,FOLLOW_9_in_package_declaration68); 
			char_literal4_tree = (Object)adaptor.create(char_literal4);
			adaptor.addChild(root_0, char_literal4_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "package_declaration"


	public static class import_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "import_declaration"
	// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:26:1: import_declaration : 'import' STRING ';' ;
	public final DataCentricDSLParser.import_declaration_return import_declaration() throws RecognitionException {
		DataCentricDSLParser.import_declaration_return retval = new DataCentricDSLParser.import_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal5=null;
		Token STRING6=null;
		Token char_literal7=null;

		Object string_literal5_tree=null;
		Object STRING6_tree=null;
		Object char_literal7_tree=null;

		try {
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:26:19: ( 'import' STRING ';' )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:27:2: 'import' STRING ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal5=(Token)match(input,10,FOLLOW_10_in_import_declaration77); 
			string_literal5_tree = (Object)adaptor.create(string_literal5);
			adaptor.addChild(root_0, string_literal5_tree);

			STRING6=(Token)match(input,STRING,FOLLOW_STRING_in_import_declaration79); 
			STRING6_tree = (Object)adaptor.create(STRING6);
			adaptor.addChild(root_0, STRING6_tree);

			char_literal7=(Token)match(input,9,FOLLOW_9_in_import_declaration81); 
			char_literal7_tree = (Object)adaptor.create(char_literal7);
			adaptor.addChild(root_0, char_literal7_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "import_declaration"


	public static class query_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "query"
	// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:30:1: query : 'query' ^ '(' ! request ')' ! ';' !;
	public final DataCentricDSLParser.query_return query() throws RecognitionException {
		DataCentricDSLParser.query_return retval = new DataCentricDSLParser.query_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal8=null;
		Token char_literal9=null;
		Token char_literal11=null;
		Token char_literal12=null;
		ParserRuleReturnScope request10 =null;

		Object string_literal8_tree=null;
		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
		Object char_literal12_tree=null;

		try {
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:30:6: ( 'query' ^ '(' ! request ')' ! ';' !)
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:31:2: 'query' ^ '(' ! request ')' ! ';' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal8=(Token)match(input,12,FOLLOW_12_in_query91); 
			string_literal8_tree = (Object)adaptor.create(string_literal8);
			root_0 = (Object)adaptor.becomeRoot(string_literal8_tree, root_0);

			char_literal9=(Token)match(input,7,FOLLOW_7_in_query94); 
			pushFollow(FOLLOW_request_in_query97);
			request10=request();
			state._fsp--;

			adaptor.addChild(root_0, request10.getTree());

			char_literal11=(Token)match(input,8,FOLLOW_8_in_query99); 
			char_literal12=(Token)match(input,9,FOLLOW_9_in_query102); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "query"


	public static class request_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "request"
	// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:36:1: request : REQUEST_STRING ;
	public final DataCentricDSLParser.request_return request() throws RecognitionException {
		DataCentricDSLParser.request_return retval = new DataCentricDSLParser.request_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token REQUEST_STRING13=null;

		Object REQUEST_STRING13_tree=null;

		try {
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:36:8: ( REQUEST_STRING )
			// D:\\Documents\\Programing\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:37:2: REQUEST_STRING
			{
			root_0 = (Object)adaptor.nil();


			REQUEST_STRING13=(Token)match(input,REQUEST_STRING,FOLLOW_REQUEST_STRING_in_request114); 
			REQUEST_STRING13_tree = (Object)adaptor.create(REQUEST_STRING13);
			adaptor.addChild(root_0, REQUEST_STRING13_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "request"

	// Delegated rules



	public static final BitSet FOLLOW_query_in_program50 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_11_in_package_declaration64 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_STRING_in_package_declaration66 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_package_declaration68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_import_declaration77 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_STRING_in_import_declaration79 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_import_declaration81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_query91 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_query94 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_request_in_query97 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_query99 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_query102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REQUEST_STRING_in_request114 = new BitSet(new long[]{0x0000000000000002L});
}
