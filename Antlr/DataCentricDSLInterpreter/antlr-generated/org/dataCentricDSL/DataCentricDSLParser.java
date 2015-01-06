// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2015-01-06 22:41:26

  package org.dataCentricDSL;
  import org.dataCentricDSL.*; 
  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DataCentricDSLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "Add", "And", "Assert", 
		"Assign", "BLOCK", "Bool", "CBrace", "CBracket", "CParen", "Colon", "Comma", 
		"Comment", "Def", "Digit", "Divide", "Do", "EXP", "EXP_LIST", "Else", 
		"End", "Equals", "Excl", "FUNCTION", "FUNC_CALL", "For", "GT", "GTEquals", 
		"ID_LIST", "IF", "INDEXES", "Identifier", "If", "In", "Increment", "Int", 
		"LIST", "LOOKUP", "LT", "LTEquals", "Modulus", "Multiply", "NEGATE", "NEquals", 
		"Null", "Number", "OBrace", "OBracket", "OParen", "Or", "Pow", "Print", 
		"Println", "QMark", "RETURN", "Return", "SColon", "STATEMENTS", "Size", 
		"Space", "String", "Subtract", "TERNARY", "To", "UNARY_MIN", "While", 
		"'query'"
	};
	public static final int EOF=-1;
	public static final int T__70=70;
	public static final int ASSIGNMENT=4;
	public static final int Add=5;
	public static final int And=6;
	public static final int Assert=7;
	public static final int Assign=8;
	public static final int BLOCK=9;
	public static final int Bool=10;
	public static final int CBrace=11;
	public static final int CBracket=12;
	public static final int CParen=13;
	public static final int Colon=14;
	public static final int Comma=15;
	public static final int Comment=16;
	public static final int Def=17;
	public static final int Digit=18;
	public static final int Divide=19;
	public static final int Do=20;
	public static final int EXP=21;
	public static final int EXP_LIST=22;
	public static final int Else=23;
	public static final int End=24;
	public static final int Equals=25;
	public static final int Excl=26;
	public static final int FUNCTION=27;
	public static final int FUNC_CALL=28;
	public static final int For=29;
	public static final int GT=30;
	public static final int GTEquals=31;
	public static final int ID_LIST=32;
	public static final int IF=33;
	public static final int INDEXES=34;
	public static final int Identifier=35;
	public static final int If=36;
	public static final int In=37;
	public static final int Increment=38;
	public static final int Int=39;
	public static final int LIST=40;
	public static final int LOOKUP=41;
	public static final int LT=42;
	public static final int LTEquals=43;
	public static final int Modulus=44;
	public static final int Multiply=45;
	public static final int NEGATE=46;
	public static final int NEquals=47;
	public static final int Null=48;
	public static final int Number=49;
	public static final int OBrace=50;
	public static final int OBracket=51;
	public static final int OParen=52;
	public static final int Or=53;
	public static final int Pow=54;
	public static final int Print=55;
	public static final int Println=56;
	public static final int QMark=57;
	public static final int RETURN=58;
	public static final int Return=59;
	public static final int SColon=60;
	public static final int STATEMENTS=61;
	public static final int Size=62;
	public static final int Space=63;
	public static final int String=64;
	public static final int Subtract=65;
	public static final int TERNARY=66;
	public static final int To=67;
	public static final int UNARY_MIN=68;
	public static final int While=69;

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


	  public Map<String, Function> functions = new HashMap<String, Function>();
	  
	  private void defineFunction(String id, Object idList, Object block) {

	    // `idList` is possibly null! Create an empty tree in that case. 
	    CommonTree idListTree = idList == null ? new CommonTree() : (CommonTree)idList;

	    // `block` is never null.
	    CommonTree blockTree = (CommonTree)block;

	    // The function name with the number of parameters after it the unique key
	    String key = id + idListTree.getChildCount();
	    functions.put(key, new Function(id, idListTree, blockTree));
	  }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:79:1: program : block EOF -> block ;
	public final DataCentricDSLParser.program_return program() throws RecognitionException {
		DataCentricDSLParser.program_return retval = new DataCentricDSLParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope block1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:3: ( block EOF -> block )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:6: block EOF
			{
			pushFollow(FOLLOW_block_in_program149);
			block1=block();
			state._fsp--;

			stream_block.add(block1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program151);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 80:16: -> block
			{
				adaptor.addChild(root_0, stream_block.nextTree());
			}


			retval.tree = root_0;

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


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:83:1: block : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
	public final DataCentricDSLParser.block_return block() throws RecognitionException {
		DataCentricDSLParser.block_return retval = new DataCentricDSLParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Return5=null;
		Token char_literal7=null;
		ParserRuleReturnScope statement3 =null;
		ParserRuleReturnScope functionDecl4 =null;
		ParserRuleReturnScope expression6 =null;

		Object Return5_tree=null;
		Object char_literal7_tree=null;
		RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
		RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:6: ( statement | functionDecl )* ( Return expression ';' )?
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:6: ( statement | functionDecl )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==Assert||LA1_0==For||(LA1_0 >= Identifier && LA1_0 <= If)||(LA1_0 >= Print && LA1_0 <= Println)||LA1_0==Size||(LA1_0 >= While && LA1_0 <= 70)) ) {
					alt1=1;
				}
				else if ( (LA1_0==Def) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:7: statement
					{
					pushFollow(FOLLOW_statement_in_block170);
					statement3=statement();
					state._fsp--;

					stream_statement.add(statement3.getTree());
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:19: functionDecl
					{
					pushFollow(FOLLOW_functionDecl_in_block174);
					functionDecl4=functionDecl();
					state._fsp--;

					stream_functionDecl.add(functionDecl4.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:34: ( Return expression ';' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Return) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:35: Return expression ';'
					{
					Return5=(Token)match(input,Return,FOLLOW_Return_in_block179);  
					stream_Return.add(Return5);

					pushFollow(FOLLOW_expression_in_block181);
					expression6=expression();
					state._fsp--;

					stream_expression.add(expression6.getTree());
					char_literal7=(Token)match(input,SColon,FOLLOW_SColon_in_block183);  
					stream_SColon.add(char_literal7);

					}
					break;

			}

			// AST REWRITE
			// elements: expression, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 85:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:30: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:51: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_2, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "block"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:88:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | query ';' -> query );
	public final DataCentricDSLParser.statement_return statement() throws RecognitionException {
		DataCentricDSLParser.statement_return retval = new DataCentricDSLParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal9=null;
		Token char_literal11=null;
		Token char_literal16=null;
		ParserRuleReturnScope assignment8 =null;
		ParserRuleReturnScope functionCall10 =null;
		ParserRuleReturnScope ifStatement12 =null;
		ParserRuleReturnScope forStatement13 =null;
		ParserRuleReturnScope whileStatement14 =null;
		ParserRuleReturnScope query15 =null;

		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
		Object char_literal16_tree=null;
		RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
		RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:89:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | query ';' -> query )
			int alt3=6;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1==OParen) ) {
					alt3=2;
				}
				else if ( (LA3_1==Assign||LA3_1==OBracket) ) {
					alt3=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Assert:
			case Print:
			case Println:
			case Size:
				{
				alt3=2;
				}
				break;
			case If:
				{
				alt3=3;
				}
				break;
			case For:
				{
				alt3=4;
				}
				break;
			case While:
				{
				alt3=5;
				}
				break;
			case 70:
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:89:6: assignment ';'
					{
					pushFollow(FOLLOW_assignment_in_statement225);
					assignment8=assignment();
					state._fsp--;

					stream_assignment.add(assignment8.getTree());
					char_literal9=(Token)match(input,SColon,FOLLOW_SColon_in_statement227);  
					stream_SColon.add(char_literal9);

					// AST REWRITE
					// elements: assignment
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 89:23: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:91:6: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_statement241);
					functionCall10=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall10.getTree());
					char_literal11=(Token)match(input,SColon,FOLLOW_SColon_in_statement243);  
					stream_SColon.add(char_literal11);

					// AST REWRITE
					// elements: functionCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 91:23: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:92:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement254);
					ifStatement12=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement12.getTree());

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:93:6: forStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement261);
					forStatement13=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement13.getTree());

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:94:6: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement268);
					whileStatement14=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement14.getTree());

					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:95:6: query ';'
					{
					pushFollow(FOLLOW_query_in_statement275);
					query15=query();
					state._fsp--;

					stream_query.add(query15.getTree());
					char_literal16=(Token)match(input,SColon,FOLLOW_SColon_in_statement277);  
					stream_SColon.add(char_literal16);

					// AST REWRITE
					// elements: query
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 95:16: -> query
					{
						adaptor.addChild(root_0, stream_query.nextTree());
					}


					retval.tree = root_0;

					}
					break;

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
	// $ANTLR end "statement"


	public static class query_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "query"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:98:1: query : 'query' ^ ( String | variableCall ) ;
	public final DataCentricDSLParser.query_return query() throws RecognitionException {
		DataCentricDSLParser.query_return retval = new DataCentricDSLParser.query_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal17=null;
		Token String18=null;
		ParserRuleReturnScope variableCall19 =null;

		Object string_literal17_tree=null;
		Object String18_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:98:6: ( 'query' ^ ( String | variableCall ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:99:3: 'query' ^ ( String | variableCall )
			{
			root_0 = (Object)adaptor.nil();


			string_literal17=(Token)match(input,70,FOLLOW_70_in_query294); 
			string_literal17_tree = (Object)adaptor.create(string_literal17);
			root_0 = (Object)adaptor.becomeRoot(string_literal17_tree, root_0);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:99:12: ( String | variableCall )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==String) ) {
				alt4=1;
			}
			else if ( (LA4_0==Identifier) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:99:13: String
					{
					String18=(Token)match(input,String,FOLLOW_String_in_query298); 
					String18_tree = (Object)adaptor.create(String18);
					adaptor.addChild(root_0, String18_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:99:22: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_query302);
					variableCall19=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall19.getTree());

					}
					break;

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
	// $ANTLR end "query"


	public static class variableCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableCall"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:102:1: variableCall : Identifier ;
	public final DataCentricDSLParser.variableCall_return variableCall() throws RecognitionException {
		DataCentricDSLParser.variableCall_return retval = new DataCentricDSLParser.variableCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier20=null;

		Object Identifier20_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:102:13: ( Identifier )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:103:3: Identifier
			{
			root_0 = (Object)adaptor.nil();


			Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableCall313); 
			Identifier20_tree = (Object)adaptor.create(Identifier20);
			adaptor.addChild(root_0, Identifier20_tree);

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
	// $ANTLR end "variableCall"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:106:1: assignment : Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) ;
	public final DataCentricDSLParser.assignment_return assignment() throws RecognitionException {
		DataCentricDSLParser.assignment_return retval = new DataCentricDSLParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier21=null;
		Token char_literal23=null;
		ParserRuleReturnScope indexes22 =null;
		ParserRuleReturnScope expression24 =null;

		Object Identifier21_tree=null;
		Object char_literal23_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:3: ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:6: Identifier ( indexes )? '=' expression
			{
			Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment325);  
			stream_Identifier.add(Identifier21);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:17: ( indexes )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==OBracket) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:17: indexes
					{
					pushFollow(FOLLOW_indexes_in_assignment327);
					indexes22=indexes();
					state._fsp--;

					stream_indexes.add(indexes22.getTree());
					}
					break;

			}

			char_literal23=(Token)match(input,Assign,FOLLOW_Assign_in_assignment330);  
			stream_Assign.add(char_literal23);

			pushFollow(FOLLOW_expression_in_assignment332);
			expression24=expression();
			state._fsp--;

			stream_expression.add(expression24.getTree());
			// AST REWRITE
			// elements: expression, Identifier, indexes
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 107:41: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:44: ^( ASSIGNMENT Identifier ( indexes )? expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:68: ( indexes )?
				if ( stream_indexes.hasNext() ) {
					adaptor.addChild(root_1, stream_indexes.nextTree());
				}
				stream_indexes.reset();

				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "assignment"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:111:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) );
	public final DataCentricDSLParser.functionCall_return functionCall() throws RecognitionException {
		DataCentricDSLParser.functionCall_return retval = new DataCentricDSLParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier25=null;
		Token char_literal26=null;
		Token char_literal28=null;
		Token Println29=null;
		Token char_literal30=null;
		Token char_literal32=null;
		Token Print33=null;
		Token char_literal34=null;
		Token char_literal36=null;
		Token Assert37=null;
		Token char_literal38=null;
		Token char_literal40=null;
		Token Size41=null;
		Token char_literal42=null;
		Token char_literal44=null;
		ParserRuleReturnScope exprList27 =null;
		ParserRuleReturnScope expression31 =null;
		ParserRuleReturnScope expression35 =null;
		ParserRuleReturnScope expression39 =null;
		ParserRuleReturnScope expression43 =null;

		Object Identifier25_tree=null;
		Object char_literal26_tree=null;
		Object char_literal28_tree=null;
		Object Println29_tree=null;
		Object char_literal30_tree=null;
		Object char_literal32_tree=null;
		Object Print33_tree=null;
		Object char_literal34_tree=null;
		Object char_literal36_tree=null;
		Object Assert37_tree=null;
		Object char_literal38_tree=null;
		Object char_literal40_tree=null;
		Object Size41_tree=null;
		Object char_literal42_tree=null;
		Object char_literal44_tree=null;
		RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Assert=new RewriteRuleTokenStream(adaptor,"token Assert");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Print=new RewriteRuleTokenStream(adaptor,"token Print");
		RewriteRuleTokenStream stream_Size=new RewriteRuleTokenStream(adaptor,"token Size");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) )
			int alt8=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt8=1;
				}
				break;
			case Println:
				{
				alt8=2;
				}
				break;
			case Print:
				{
				alt8=3;
				}
				break;
			case Assert:
				{
				alt8=4;
				}
				break;
			case Size:
				{
				alt8=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:6: Identifier '(' ( exprList )? ')'
					{
					Identifier25=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall360);  
					stream_Identifier.add(Identifier25);

					char_literal26=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall362);  
					stream_OParen.add(char_literal26);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:21: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==Assert||LA6_0==Bool||LA6_0==Excl||LA6_0==Identifier||(LA6_0 >= Null && LA6_0 <= Number)||(LA6_0 >= OBracket && LA6_0 <= OParen)||(LA6_0 >= Print && LA6_0 <= Println)||LA6_0==Size||(LA6_0 >= String && LA6_0 <= Subtract)||LA6_0==70) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall364);
							exprList27=exprList();
							state._fsp--;

							stream_exprList.add(exprList27.getTree());
							}
							break;

					}

					char_literal28=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall367);  
					stream_CParen.add(char_literal28);

					// AST REWRITE
					// elements: exprList, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 112:35: -> ^( FUNC_CALL Identifier ( exprList )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:38: ^( FUNC_CALL Identifier ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:61: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:6: Println '(' ( expression )? ')'
					{
					Println29=(Token)match(input,Println,FOLLOW_Println_in_functionCall385);  
					stream_Println.add(Println29);

					char_literal30=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall387);  
					stream_OParen.add(char_literal30);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:18: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Assert||LA7_0==Bool||LA7_0==Excl||LA7_0==Identifier||(LA7_0 >= Null && LA7_0 <= Number)||(LA7_0 >= OBracket && LA7_0 <= OParen)||(LA7_0 >= Print && LA7_0 <= Println)||LA7_0==Size||(LA7_0 >= String && LA7_0 <= Subtract)||LA7_0==70) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:18: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall389);
							expression31=expression();
							state._fsp--;

							stream_expression.add(expression31.getTree());
							}
							break;

					}

					char_literal32=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall392);  
					stream_CParen.add(char_literal32);

					// AST REWRITE
					// elements: expression, Println
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 113:36: -> ^( FUNC_CALL Println ( expression )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:39: ^( FUNC_CALL Println ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Println.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:59: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:116:6: Print '(' expression ')'
					{
					Print33=(Token)match(input,Print,FOLLOW_Print_in_functionCall414);  
					stream_Print.add(Print33);

					char_literal34=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall416);  
					stream_OParen.add(char_literal34);

					pushFollow(FOLLOW_expression_in_functionCall418);
					expression35=expression();
					state._fsp--;

					stream_expression.add(expression35.getTree());
					char_literal36=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall420);  
					stream_CParen.add(char_literal36);

					// AST REWRITE
					// elements: expression, Print
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:35: -> ^( FUNC_CALL Print expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:116:38: ^( FUNC_CALL Print expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Print.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:117:6: Assert '(' expression ')'
					{
					Assert37=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall441);  
					stream_Assert.add(Assert37);

					char_literal38=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall443);  
					stream_OParen.add(char_literal38);

					pushFollow(FOLLOW_expression_in_functionCall445);
					expression39=expression();
					state._fsp--;

					stream_expression.add(expression39.getTree());
					char_literal40=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall447);  
					stream_CParen.add(char_literal40);

					// AST REWRITE
					// elements: expression, Assert
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 117:35: -> ^( FUNC_CALL Assert expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:117:38: ^( FUNC_CALL Assert expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Assert.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:118:6: Size '(' expression ')'
					{
					Size41=(Token)match(input,Size,FOLLOW_Size_in_functionCall467);  
					stream_Size.add(Size41);

					char_literal42=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall469);  
					stream_OParen.add(char_literal42);

					pushFollow(FOLLOW_expression_in_functionCall471);
					expression43=expression();
					state._fsp--;

					stream_expression.add(expression43.getTree());
					char_literal44=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall473);  
					stream_CParen.add(char_literal44);

					// AST REWRITE
					// elements: Size, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 118:35: -> ^( FUNC_CALL Size expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:118:38: ^( FUNC_CALL Size expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Size.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

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
	// $ANTLR end "functionCall"


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:121:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final DataCentricDSLParser.ifStatement_return ifStatement() throws RecognitionException {
		DataCentricDSLParser.ifStatement_return retval = new DataCentricDSLParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ifStat45 =null;
		ParserRuleReturnScope elseIfStat46 =null;
		ParserRuleReturnScope elseStat47 =null;

		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:3: ( ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:6: ifStat ( elseIfStat )* ( elseStat )?
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement502);
			ifStat45=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat45.getTree());
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:13: ( elseIfStat )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==Else) ) {
					int LA9_1 = input.LA(2);
					if ( (LA9_1==If) ) {
						alt9=1;
					}

				}

				switch (alt9) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement504);
					elseIfStat46=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat46.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:25: ( elseStat )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==Else) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement507);
					elseStat47=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat47.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: elseStat, ifStat, elseIfStat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 122:35: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:38: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:50: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:62: ( elseStat )?
				if ( stream_elseStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseStat.nextTree());
				}
				stream_elseStat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "ifStatement"


	public static class ifStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStat"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:125:1: ifStat : If '(' expression ')' '{' block '}' -> ^( EXP expression block ) ;
	public final DataCentricDSLParser.ifStat_return ifStat() throws RecognitionException {
		DataCentricDSLParser.ifStat_return retval = new DataCentricDSLParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If48=null;
		Token char_literal49=null;
		Token char_literal51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		ParserRuleReturnScope expression50 =null;
		ParserRuleReturnScope block53 =null;

		Object If48_tree=null;
		Object char_literal49_tree=null;
		Object char_literal51_tree=null;
		Object char_literal52_tree=null;
		Object char_literal54_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:126:3: ( If '(' expression ')' '{' block '}' -> ^( EXP expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:126:6: If '(' expression ')' '{' block '}'
			{
			If48=(Token)match(input,If,FOLLOW_If_in_ifStat536);  
			stream_If.add(If48);

			char_literal49=(Token)match(input,OParen,FOLLOW_OParen_in_ifStat538);  
			stream_OParen.add(char_literal49);

			pushFollow(FOLLOW_expression_in_ifStat540);
			expression50=expression();
			state._fsp--;

			stream_expression.add(expression50.getTree());
			char_literal51=(Token)match(input,CParen,FOLLOW_CParen_in_ifStat542);  
			stream_CParen.add(char_literal51);

			char_literal52=(Token)match(input,OBrace,FOLLOW_OBrace_in_ifStat544);  
			stream_OBrace.add(char_literal52);

			pushFollow(FOLLOW_block_in_ifStat546);
			block53=block();
			state._fsp--;

			stream_block.add(block53.getTree());
			char_literal54=(Token)match(input,CBrace,FOLLOW_CBrace_in_ifStat548);  
			stream_CBrace.add(char_literal54);

			// AST REWRITE
			// elements: block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 126:42: -> ^( EXP expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:126:45: ^( EXP expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "ifStat"


	public static class elseIfStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseIfStat"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:129:1: elseIfStat : Else If '(' expression ')' '{' block '}' -> ^( EXP expression block ) ;
	public final DataCentricDSLParser.elseIfStat_return elseIfStat() throws RecognitionException {
		DataCentricDSLParser.elseIfStat_return retval = new DataCentricDSLParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else55=null;
		Token If56=null;
		Token char_literal57=null;
		Token char_literal59=null;
		Token char_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope expression58 =null;
		ParserRuleReturnScope block61 =null;

		Object Else55_tree=null;
		Object If56_tree=null;
		Object char_literal57_tree=null;
		Object char_literal59_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:130:3: ( Else If '(' expression ')' '{' block '}' -> ^( EXP expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:130:6: Else If '(' expression ')' '{' block '}'
			{
			Else55=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat572);  
			stream_Else.add(Else55);

			If56=(Token)match(input,If,FOLLOW_If_in_elseIfStat574);  
			stream_If.add(If56);

			char_literal57=(Token)match(input,OParen,FOLLOW_OParen_in_elseIfStat576);  
			stream_OParen.add(char_literal57);

			pushFollow(FOLLOW_expression_in_elseIfStat578);
			expression58=expression();
			state._fsp--;

			stream_expression.add(expression58.getTree());
			char_literal59=(Token)match(input,CParen,FOLLOW_CParen_in_elseIfStat580);  
			stream_CParen.add(char_literal59);

			char_literal60=(Token)match(input,OBrace,FOLLOW_OBrace_in_elseIfStat582);  
			stream_OBrace.add(char_literal60);

			pushFollow(FOLLOW_block_in_elseIfStat584);
			block61=block();
			state._fsp--;

			stream_block.add(block61.getTree());
			char_literal62=(Token)match(input,CBrace,FOLLOW_CBrace_in_elseIfStat586);  
			stream_CBrace.add(char_literal62);

			// AST REWRITE
			// elements: expression, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 130:47: -> ^( EXP expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:130:50: ^( EXP expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "elseIfStat"


	public static class elseStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseStat"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:133:1: elseStat : Else '{' block '}' -> ^( EXP block ) ;
	public final DataCentricDSLParser.elseStat_return elseStat() throws RecognitionException {
		DataCentricDSLParser.elseStat_return retval = new DataCentricDSLParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else63=null;
		Token char_literal64=null;
		Token char_literal66=null;
		ParserRuleReturnScope block65 =null;

		Object Else63_tree=null;
		Object char_literal64_tree=null;
		Object char_literal66_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:134:3: ( Else '{' block '}' -> ^( EXP block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:134:6: Else '{' block '}'
			{
			Else63=(Token)match(input,Else,FOLLOW_Else_in_elseStat610);  
			stream_Else.add(Else63);

			char_literal64=(Token)match(input,OBrace,FOLLOW_OBrace_in_elseStat612);  
			stream_OBrace.add(char_literal64);

			pushFollow(FOLLOW_block_in_elseStat614);
			block65=block();
			state._fsp--;

			stream_block.add(block65.getTree());
			char_literal66=(Token)match(input,CBrace,FOLLOW_CBrace_in_elseStat616);  
			stream_CBrace.add(char_literal66);

			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 134:25: -> ^( EXP block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:134:28: ^( EXP block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "elseStat"


	public static class functionDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDecl"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:137:1: functionDecl : Def Identifier '(' ( idList )? ')' block End ;
	public final DataCentricDSLParser.functionDecl_return functionDecl() throws RecognitionException {
		DataCentricDSLParser.functionDecl_return retval = new DataCentricDSLParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Def67=null;
		Token Identifier68=null;
		Token char_literal69=null;
		Token char_literal71=null;
		Token End73=null;
		ParserRuleReturnScope idList70 =null;
		ParserRuleReturnScope block72 =null;

		Object Def67_tree=null;
		Object Identifier68_tree=null;
		Object char_literal69_tree=null;
		Object char_literal71_tree=null;
		Object End73_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:138:3: ( Def Identifier '(' ( idList )? ')' block End )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:138:6: Def Identifier '(' ( idList )? ')' block End
			{
			root_0 = (Object)adaptor.nil();


			Def67=(Token)match(input,Def,FOLLOW_Def_in_functionDecl638); 
			Def67_tree = (Object)adaptor.create(Def67);
			adaptor.addChild(root_0, Def67_tree);

			Identifier68=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl640); 
			Identifier68_tree = (Object)adaptor.create(Identifier68);
			adaptor.addChild(root_0, Identifier68_tree);

			char_literal69=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl642); 
			char_literal69_tree = (Object)adaptor.create(char_literal69);
			adaptor.addChild(root_0, char_literal69_tree);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:138:25: ( idList )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Identifier) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:138:25: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl644);
					idList70=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList70.getTree());

					}
					break;

			}

			char_literal71=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl647); 
			char_literal71_tree = (Object)adaptor.create(char_literal71);
			adaptor.addChild(root_0, char_literal71_tree);

			pushFollow(FOLLOW_block_in_functionDecl649);
			block72=block();
			state._fsp--;

			adaptor.addChild(root_0, block72.getTree());

			End73=(Token)match(input,End,FOLLOW_End_in_functionDecl651); 
			End73_tree = (Object)adaptor.create(End73);
			adaptor.addChild(root_0, End73_tree);

			defineFunction((Identifier68!=null?Identifier68.getText():null), (idList70!=null?((Object)idList70.getTree()):null), (block72!=null?((Object)block72.getTree()):null));
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
	// $ANTLR end "functionDecl"


	public static class forStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:142:1: forStatement : For '(' Identifier '=' expression ';' expression ';' Identifier '=' expression ')' '{' block '}' -> ^( For Identifier expression expression Identifier expression block ) ;
	public final DataCentricDSLParser.forStatement_return forStatement() throws RecognitionException {
		DataCentricDSLParser.forStatement_return retval = new DataCentricDSLParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For74=null;
		Token char_literal75=null;
		Token Identifier76=null;
		Token char_literal77=null;
		Token char_literal79=null;
		Token char_literal81=null;
		Token Identifier82=null;
		Token char_literal83=null;
		Token char_literal85=null;
		Token char_literal86=null;
		Token char_literal88=null;
		ParserRuleReturnScope expression78 =null;
		ParserRuleReturnScope expression80 =null;
		ParserRuleReturnScope expression84 =null;
		ParserRuleReturnScope block87 =null;

		Object For74_tree=null;
		Object char_literal75_tree=null;
		Object Identifier76_tree=null;
		Object char_literal77_tree=null;
		Object char_literal79_tree=null;
		Object char_literal81_tree=null;
		Object Identifier82_tree=null;
		Object char_literal83_tree=null;
		Object char_literal85_tree=null;
		Object char_literal86_tree=null;
		Object char_literal88_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:145:4: ( For '(' Identifier '=' expression ';' expression ';' Identifier '=' expression ')' '{' block '}' -> ^( For Identifier expression expression Identifier expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:145:7: For '(' Identifier '=' expression ';' expression ';' Identifier '=' expression ')' '{' block '}'
			{
			For74=(Token)match(input,For,FOLLOW_For_in_forStatement676);  
			stream_For.add(For74);

			char_literal75=(Token)match(input,OParen,FOLLOW_OParen_in_forStatement678);  
			stream_OParen.add(char_literal75);

			Identifier76=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement680);  
			stream_Identifier.add(Identifier76);

			char_literal77=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement682);  
			stream_Assign.add(char_literal77);

			pushFollow(FOLLOW_expression_in_forStatement684);
			expression78=expression();
			state._fsp--;

			stream_expression.add(expression78.getTree());
			char_literal79=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement686);  
			stream_SColon.add(char_literal79);

			pushFollow(FOLLOW_expression_in_forStatement688);
			expression80=expression();
			state._fsp--;

			stream_expression.add(expression80.getTree());
			char_literal81=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement690);  
			stream_SColon.add(char_literal81);

			Identifier82=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement692);  
			stream_Identifier.add(Identifier82);

			char_literal83=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement694);  
			stream_Assign.add(char_literal83);

			pushFollow(FOLLOW_expression_in_forStatement696);
			expression84=expression();
			state._fsp--;

			stream_expression.add(expression84.getTree());
			char_literal85=(Token)match(input,CParen,FOLLOW_CParen_in_forStatement698);  
			stream_CParen.add(char_literal85);

			char_literal86=(Token)match(input,OBrace,FOLLOW_OBrace_in_forStatement700);  
			stream_OBrace.add(char_literal86);

			pushFollow(FOLLOW_block_in_forStatement702);
			block87=block();
			state._fsp--;

			stream_block.add(block87.getTree());
			char_literal88=(Token)match(input,CBrace,FOLLOW_CBrace_in_forStatement704);  
			stream_CBrace.add(char_literal88);

			// AST REWRITE
			// elements: For, expression, expression, Identifier, block, expression, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 146:6: -> ^( For Identifier expression expression Identifier expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:146:9: ^( For Identifier expression expression Identifier expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_For.nextNode(), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "forStatement"


	public static class whileStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:150:1: whileStatement : While '(' expression ')' '{' block '}' -> ^( While expression block ) ;
	public final DataCentricDSLParser.whileStatement_return whileStatement() throws RecognitionException {
		DataCentricDSLParser.whileStatement_return retval = new DataCentricDSLParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While89=null;
		Token char_literal90=null;
		Token char_literal92=null;
		Token char_literal93=null;
		Token char_literal95=null;
		ParserRuleReturnScope expression91 =null;
		ParserRuleReturnScope block94 =null;

		Object While89_tree=null;
		Object char_literal90_tree=null;
		Object char_literal92_tree=null;
		Object char_literal93_tree=null;
		Object char_literal95_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:151:3: ( While '(' expression ')' '{' block '}' -> ^( While expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:151:6: While '(' expression ')' '{' block '}'
			{
			While89=(Token)match(input,While,FOLLOW_While_in_whileStatement745);  
			stream_While.add(While89);

			char_literal90=(Token)match(input,OParen,FOLLOW_OParen_in_whileStatement747);  
			stream_OParen.add(char_literal90);

			pushFollow(FOLLOW_expression_in_whileStatement749);
			expression91=expression();
			state._fsp--;

			stream_expression.add(expression91.getTree());
			char_literal92=(Token)match(input,CParen,FOLLOW_CParen_in_whileStatement751);  
			stream_CParen.add(char_literal92);

			char_literal93=(Token)match(input,OBrace,FOLLOW_OBrace_in_whileStatement753);  
			stream_OBrace.add(char_literal93);

			pushFollow(FOLLOW_block_in_whileStatement755);
			block94=block();
			state._fsp--;

			stream_block.add(block94.getTree());
			char_literal95=(Token)match(input,CBrace,FOLLOW_CBrace_in_whileStatement757);  
			stream_CBrace.add(char_literal95);

			// AST REWRITE
			// elements: expression, block, While
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 151:45: -> ^( While expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:151:48: ^( While expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_While.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "whileStatement"


	public static class idList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "idList"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:154:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final DataCentricDSLParser.idList_return idList() throws RecognitionException {
		DataCentricDSLParser.idList_return retval = new DataCentricDSLParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier96=null;
		Token char_literal97=null;
		Token Identifier98=null;

		Object Identifier96_tree=null;
		Object char_literal97_tree=null;
		Object Identifier98_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:155:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:155:6: Identifier ( ',' Identifier )*
			{
			Identifier96=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList781);  
			stream_Identifier.add(Identifier96);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:155:17: ( ',' Identifier )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==Comma) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:155:18: ',' Identifier
					{
					char_literal97=(Token)match(input,Comma,FOLLOW_Comma_in_idList784);  
					stream_Comma.add(char_literal97);

					Identifier98=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList786);  
					stream_Identifier.add(Identifier98);

					}
					break;

				default :
					break loop12;
				}
			}

			// AST REWRITE
			// elements: Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 155:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:155:38: ^( ID_LIST ( Identifier )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID_LIST, "ID_LIST"), root_1);
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "idList"


	public static class exprList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprList"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:158:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final DataCentricDSLParser.exprList_return exprList() throws RecognitionException {
		DataCentricDSLParser.exprList_return retval = new DataCentricDSLParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal100=null;
		ParserRuleReturnScope expression99 =null;
		ParserRuleReturnScope expression101 =null;

		Object char_literal100_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:159:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:159:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList811);
			expression99=expression();
			state._fsp--;

			stream_expression.add(expression99.getTree());
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:159:17: ( ',' expression )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==Comma) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:159:18: ',' expression
					{
					char_literal100=(Token)match(input,Comma,FOLLOW_Comma_in_exprList814);  
					stream_Comma.add(char_literal100);

					pushFollow(FOLLOW_expression_in_exprList816);
					expression101=expression();
					state._fsp--;

					stream_expression.add(expression101.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 159:35: -> ^( EXP_LIST ( expression )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:159:38: ^( EXP_LIST ( expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_LIST, "EXP_LIST"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "exprList"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:162:1: expression : ( condExpr | query );
	public final DataCentricDSLParser.expression_return expression() throws RecognitionException {
		DataCentricDSLParser.expression_return retval = new DataCentricDSLParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr102 =null;
		ParserRuleReturnScope query103 =null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:163:3: ( condExpr | query )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==Assert||LA14_0==Bool||LA14_0==Excl||LA14_0==Identifier||(LA14_0 >= Null && LA14_0 <= Number)||(LA14_0 >= OBracket && LA14_0 <= OParen)||(LA14_0 >= Print && LA14_0 <= Println)||LA14_0==Size||(LA14_0 >= String && LA14_0 <= Subtract)) ) {
				alt14=1;
			}
			else if ( (LA14_0==70) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:163:6: condExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condExpr_in_expression841);
					condExpr102=condExpr();
					state._fsp--;

					adaptor.addChild(root_0, condExpr102.getTree());

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:163:17: query
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_query_in_expression845);
					query103=query();
					state._fsp--;

					adaptor.addChild(root_0, query103.getTree());

					}
					break;

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
	// $ANTLR end "expression"


	public static class condExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:170:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final DataCentricDSLParser.condExpr_return condExpr() throws RecognitionException {
		DataCentricDSLParser.condExpr_return retval = new DataCentricDSLParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal105=null;
		Token char_literal106=null;
		Token In107=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr104 =null;
		ParserRuleReturnScope expression108 =null;

		Object char_literal105_tree=null;
		Object char_literal106_tree=null;
		Object In107_tree=null;
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:171:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:171:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:171:6: ( orExpr -> orExpr )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:171:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr864);
			orExpr104=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr104.getTree());
			// AST REWRITE
			// elements: orExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 171:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:172:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==QMark) ) {
				alt15=1;
			}
			else if ( (LA15_0==In) ) {
				alt15=2;
			}
			switch (alt15) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:172:8: '?' a= expression ':' b= expression
					{
					char_literal105=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr879);  
					stream_QMark.add(char_literal105);

					pushFollow(FOLLOW_expression_in_condExpr883);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal106=(Token)match(input,Colon,FOLLOW_Colon_in_condExpr885);  
					stream_Colon.add(char_literal106);

					pushFollow(FOLLOW_expression_in_condExpr889);
					b=expression();
					state._fsp--;

					stream_expression.add(b.getTree());
					// AST REWRITE
					// elements: orExpr, a, b
					// token labels: 
					// rule labels: retval, b, a
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 172:42: -> ^( TERNARY orExpr $a $b)
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:172:45: ^( TERNARY orExpr $a $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERNARY, "TERNARY"), root_1);
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_1, stream_a.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:173:8: In expression
					{
					In107=(Token)match(input,In,FOLLOW_In_in_condExpr912);  
					stream_In.add(In107);

					pushFollow(FOLLOW_expression_in_condExpr914);
					expression108=expression();
					state._fsp--;

					stream_expression.add(expression108.getTree());
					// AST REWRITE
					// elements: expression, orExpr, In
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 173:42: -> ^( In orExpr expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:173:45: ^( In orExpr expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_In.nextNode(), root_1);
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

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
	// $ANTLR end "condExpr"


	public static class orExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:177:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final DataCentricDSLParser.orExpr_return orExpr() throws RecognitionException {
		DataCentricDSLParser.orExpr_return retval = new DataCentricDSLParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal110=null;
		ParserRuleReturnScope andExpr109 =null;
		ParserRuleReturnScope andExpr111 =null;

		Object string_literal110_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:178:3: ( andExpr ( '||' ^ andExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:178:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr966);
			andExpr109=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr109.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:178:14: ( '||' ^ andExpr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==Or) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:178:15: '||' ^ andExpr
					{
					string_literal110=(Token)match(input,Or,FOLLOW_Or_in_orExpr969); 
					string_literal110_tree = (Object)adaptor.create(string_literal110);
					root_0 = (Object)adaptor.becomeRoot(string_literal110_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr972);
					andExpr111=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr111.getTree());

					}
					break;

				default :
					break loop16;
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
	// $ANTLR end "orExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:181:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final DataCentricDSLParser.andExpr_return andExpr() throws RecognitionException {
		DataCentricDSLParser.andExpr_return retval = new DataCentricDSLParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal113=null;
		ParserRuleReturnScope equExpr112 =null;
		ParserRuleReturnScope equExpr114 =null;

		Object string_literal113_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:182:3: ( equExpr ( '&&' ^ equExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:182:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr988);
			equExpr112=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr112.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:182:14: ( '&&' ^ equExpr )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==And) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:182:15: '&&' ^ equExpr
					{
					string_literal113=(Token)match(input,And,FOLLOW_And_in_andExpr991); 
					string_literal113_tree = (Object)adaptor.create(string_literal113);
					root_0 = (Object)adaptor.becomeRoot(string_literal113_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr994);
					equExpr114=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr114.getTree());

					}
					break;

				default :
					break loop17;
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
	// $ANTLR end "andExpr"


	public static class equExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:185:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final DataCentricDSLParser.equExpr_return equExpr() throws RecognitionException {
		DataCentricDSLParser.equExpr_return retval = new DataCentricDSLParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set116=null;
		ParserRuleReturnScope relExpr115 =null;
		ParserRuleReturnScope relExpr117 =null;

		Object set116_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:186:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:186:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr1010);
			relExpr115=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr115.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:186:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Equals||LA18_0==NEquals) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:186:15: ( '==' | '!=' ) ^ relExpr
					{
					set116=input.LT(1);
					set116=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set116), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr1022);
					relExpr117=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr117.getTree());

					}
					break;

				default :
					break loop18;
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
	// $ANTLR end "equExpr"


	public static class relExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:189:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final DataCentricDSLParser.relExpr_return relExpr() throws RecognitionException {
		DataCentricDSLParser.relExpr_return retval = new DataCentricDSLParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set119=null;
		ParserRuleReturnScope addExpr118 =null;
		ParserRuleReturnScope addExpr120 =null;

		Object set119_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:190:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:190:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr1038);
			addExpr118=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr118.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:190:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= GT && LA19_0 <= GTEquals)||(LA19_0 >= LT && LA19_0 <= LTEquals)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:190:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set119=input.LT(1);
					set119=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set119), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr1058);
					addExpr120=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr120.getTree());

					}
					break;

				default :
					break loop19;
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
	// $ANTLR end "relExpr"


	public static class addExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:193:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final DataCentricDSLParser.addExpr_return addExpr() throws RecognitionException {
		DataCentricDSLParser.addExpr_return retval = new DataCentricDSLParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set122=null;
		ParserRuleReturnScope mulExpr121 =null;
		ParserRuleReturnScope mulExpr123 =null;

		Object set122_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:194:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:194:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr1074);
			mulExpr121=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr121.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:194:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Add||LA20_0==Subtract) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:194:15: ( '+' | '-' ) ^ mulExpr
					{
					set122=input.LT(1);
					set122=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set122), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr1086);
					mulExpr123=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr123.getTree());

					}
					break;

				default :
					break loop20;
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
	// $ANTLR end "addExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:197:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final DataCentricDSLParser.mulExpr_return mulExpr() throws RecognitionException {
		DataCentricDSLParser.mulExpr_return retval = new DataCentricDSLParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set125=null;
		ParserRuleReturnScope powExpr124 =null;
		ParserRuleReturnScope powExpr126 =null;

		Object set125_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:198:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:198:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr1102);
			powExpr124=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr124.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:198:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==Divide||(LA21_0 >= Modulus && LA21_0 <= Multiply)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:198:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set125=input.LT(1);
					set125=input.LT(1);
					if ( input.LA(1)==Divide||(input.LA(1) >= Modulus && input.LA(1) <= Multiply) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set125), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr1118);
					powExpr126=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr126.getTree());

					}
					break;

				default :
					break loop21;
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
	// $ANTLR end "mulExpr"


	public static class powExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "powExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:201:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final DataCentricDSLParser.powExpr_return powExpr() throws RecognitionException {
		DataCentricDSLParser.powExpr_return retval = new DataCentricDSLParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal128=null;
		ParserRuleReturnScope unaryExpr127 =null;
		ParserRuleReturnScope unaryExpr129 =null;

		Object char_literal128_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:202:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:202:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr1134);
			unaryExpr127=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr127.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:202:16: ( '^' ^ unaryExpr )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==Pow) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:202:17: '^' ^ unaryExpr
					{
					char_literal128=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr1137); 
					char_literal128_tree = (Object)adaptor.create(char_literal128);
					root_0 = (Object)adaptor.becomeRoot(char_literal128_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr1140);
					unaryExpr129=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr129.getTree());

					}
					break;

				default :
					break loop22;
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
	// $ANTLR end "powExpr"


	public static class unaryExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:205:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final DataCentricDSLParser.unaryExpr_return unaryExpr() throws RecognitionException {
		DataCentricDSLParser.unaryExpr_return retval = new DataCentricDSLParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal130=null;
		Token char_literal132=null;
		ParserRuleReturnScope atom131 =null;
		ParserRuleReturnScope atom133 =null;
		ParserRuleReturnScope atom134 =null;

		Object char_literal130_tree=null;
		Object char_literal132_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:206:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt23=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt23=1;
				}
				break;
			case Excl:
				{
				alt23=2;
				}
				break;
			case Assert:
			case Bool:
			case Identifier:
			case Null:
			case Number:
			case OBracket:
			case OParen:
			case Print:
			case Println:
			case Size:
			case String:
				{
				alt23=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:206:6: '-' atom
					{
					char_literal130=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr1158);  
					stream_Subtract.add(char_literal130);

					pushFollow(FOLLOW_atom_in_unaryExpr1160);
					atom131=atom();
					state._fsp--;

					stream_atom.add(atom131.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 206:15: -> ^( UNARY_MIN atom )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:206:18: ^( UNARY_MIN atom )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MIN, "UNARY_MIN"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:207:6: '!' atom
					{
					char_literal132=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr1175);  
					stream_Excl.add(char_literal132);

					pushFollow(FOLLOW_atom_in_unaryExpr1177);
					atom133=atom();
					state._fsp--;

					stream_atom.add(atom133.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 207:15: -> ^( NEGATE atom )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:207:18: ^( NEGATE atom )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEGATE, "NEGATE"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:208:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr1192);
					atom134=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom134.getTree());

					}
					break;

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
	// $ANTLR end "unaryExpr"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:211:1: atom : ( Number | Bool | Null | lookup );
	public final DataCentricDSLParser.atom_return atom() throws RecognitionException {
		DataCentricDSLParser.atom_return retval = new DataCentricDSLParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number135=null;
		Token Bool136=null;
		Token Null137=null;
		ParserRuleReturnScope lookup138 =null;

		Object Number135_tree=null;
		Object Bool136_tree=null;
		Object Null137_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:212:3: ( Number | Bool | Null | lookup )
			int alt24=4;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt24=1;
				}
				break;
			case Bool:
				{
				alt24=2;
				}
				break;
			case Null:
				{
				alt24=3;
				}
				break;
			case Assert:
			case Identifier:
			case OBracket:
			case OParen:
			case Print:
			case Println:
			case Size:
			case String:
				{
				alt24=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:212:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number135=(Token)match(input,Number,FOLLOW_Number_in_atom1206); 
					Number135_tree = (Object)adaptor.create(Number135);
					adaptor.addChild(root_0, Number135_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:213:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool136=(Token)match(input,Bool,FOLLOW_Bool_in_atom1213); 
					Bool136_tree = (Object)adaptor.create(Bool136);
					adaptor.addChild(root_0, Bool136_tree);

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:214:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null137=(Token)match(input,Null,FOLLOW_Null_in_atom1220); 
					Null137_tree = (Object)adaptor.create(Null137);
					adaptor.addChild(root_0, Null137_tree);

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:215:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom1227);
					lookup138=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup138.getTree());

					}
					break;

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
	// $ANTLR end "atom"


	public static class list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:218:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final DataCentricDSLParser.list_return list() throws RecognitionException {
		DataCentricDSLParser.list_return retval = new DataCentricDSLParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal139=null;
		Token char_literal141=null;
		ParserRuleReturnScope exprList140 =null;

		Object char_literal139_tree=null;
		Object char_literal141_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:219:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:219:6: '[' ( exprList )? ']'
			{
			char_literal139=(Token)match(input,OBracket,FOLLOW_OBracket_in_list1241);  
			stream_OBracket.add(char_literal139);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:219:10: ( exprList )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==Assert||LA25_0==Bool||LA25_0==Excl||LA25_0==Identifier||(LA25_0 >= Null && LA25_0 <= Number)||(LA25_0 >= OBracket && LA25_0 <= OParen)||(LA25_0 >= Print && LA25_0 <= Println)||LA25_0==Size||(LA25_0 >= String && LA25_0 <= Subtract)||LA25_0==70) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:219:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list1243);
					exprList140=exprList();
					state._fsp--;

					stream_exprList.add(exprList140.getTree());
					}
					break;

			}

			char_literal141=(Token)match(input,CBracket,FOLLOW_CBracket_in_list1246);  
			stream_CBracket.add(char_literal141);

			// AST REWRITE
			// elements: exprList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 219:24: -> ^( LIST ( exprList )? )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:219:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:219:34: ( exprList )?
				if ( stream_exprList.hasNext() ) {
					adaptor.addChild(root_1, stream_exprList.nextTree());
				}
				stream_exprList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "list"


	public static class lookup_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lookup"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:222:1: lookup : ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final DataCentricDSLParser.lookup_return lookup() throws RecognitionException {
		DataCentricDSLParser.lookup_return retval = new DataCentricDSLParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier146=null;
		Token String148=null;
		Token char_literal150=null;
		Token char_literal152=null;
		ParserRuleReturnScope functionCall142 =null;
		ParserRuleReturnScope indexes143 =null;
		ParserRuleReturnScope list144 =null;
		ParserRuleReturnScope indexes145 =null;
		ParserRuleReturnScope indexes147 =null;
		ParserRuleReturnScope indexes149 =null;
		ParserRuleReturnScope expression151 =null;
		ParserRuleReturnScope indexes153 =null;

		Object Identifier146_tree=null;
		Object String148_tree=null;
		Object char_literal150_tree=null;
		Object char_literal152_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:3: ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt31=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA31_1 = input.LA(2);
				if ( (LA31_1==OParen) ) {
					alt31=1;
				}
				else if ( ((LA31_1 >= Add && LA31_1 <= And)||(LA31_1 >= CBracket && LA31_1 <= Comma)||LA31_1==Divide||LA31_1==Equals||(LA31_1 >= GT && LA31_1 <= GTEquals)||LA31_1==In||(LA31_1 >= LT && LA31_1 <= Multiply)||LA31_1==NEquals||LA31_1==OBracket||(LA31_1 >= Or && LA31_1 <= Pow)||LA31_1==QMark||LA31_1==SColon||LA31_1==Subtract) ) {
					alt31=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Assert:
			case Print:
			case Println:
			case Size:
				{
				alt31=1;
				}
				break;
			case OBracket:
				{
				alt31=2;
				}
				break;
			case String:
				{
				alt31=4;
				}
				break;
			case OParen:
				{
				alt31=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:6: functionCall ( indexes )?
					{
					pushFollow(FOLLOW_functionCall_in_lookup1269);
					functionCall142=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall142.getTree());
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:19: ( indexes )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==OBracket) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:19: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1271);
							indexes143=indexes();
							state._fsp--;

							stream_indexes.add(indexes143.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: functionCall, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 223:34: -> ^( LOOKUP functionCall ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:37: ^( LOOKUP functionCall ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_functionCall.nextTree());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:59: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup1296);
					list144=list();
					state._fsp--;

					stream_list.add(list144.getTree());
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:11: ( indexes )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==OBracket) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1298);
							indexes145=indexes();
							state._fsp--;

							stream_indexes.add(indexes145.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 224:34: -> ^( LOOKUP list ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:51: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:6: Identifier ( indexes )?
					{
					Identifier146=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup1331);  
					stream_Identifier.add(Identifier146);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:17: ( indexes )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==OBracket) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1333);
							indexes147=indexes();
							state._fsp--;

							stream_indexes.add(indexes147.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: Identifier, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 225:34: -> ^( LOOKUP Identifier ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:37: ^( LOOKUP Identifier ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:57: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:6: String ( indexes )?
					{
					String148=(Token)match(input,String,FOLLOW_String_in_lookup1360);  
					stream_String.add(String148);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:13: ( indexes )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==OBracket) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1362);
							indexes149=indexes();
							state._fsp--;

							stream_indexes.add(indexes149.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: String, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 226:34: -> ^( LOOKUP String ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:53: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:227:6: '(' expression ')' ( indexes )?
					{
					char_literal150=(Token)match(input,OParen,FOLLOW_OParen_in_lookup1393);  
					stream_OParen.add(char_literal150);

					pushFollow(FOLLOW_expression_in_lookup1395);
					expression151=expression();
					state._fsp--;

					stream_expression.add(expression151.getTree());
					char_literal152=(Token)match(input,CParen,FOLLOW_CParen_in_lookup1397);  
					stream_CParen.add(char_literal152);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:227:25: ( indexes )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==OBracket) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:227:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1399);
							indexes153=indexes();
							state._fsp--;

							stream_indexes.add(indexes153.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: expression, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 227:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:227:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:227:57: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

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
	// $ANTLR end "lookup"


	public static class indexes_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "indexes"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:230:1: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final DataCentricDSLParser.indexes_return indexes() throws RecognitionException {
		DataCentricDSLParser.indexes_return retval = new DataCentricDSLParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal154=null;
		Token char_literal156=null;
		ParserRuleReturnScope expression155 =null;

		Object char_literal154_tree=null;
		Object char_literal156_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:231:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:231:6: ( '[' expression ']' )+
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:231:6: ( '[' expression ']' )+
			int cnt32=0;
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==OBracket) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:231:7: '[' expression ']'
					{
					char_literal154=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes1426);  
					stream_OBracket.add(char_literal154);

					pushFollow(FOLLOW_expression_in_indexes1428);
					expression155=expression();
					state._fsp--;

					stream_expression.add(expression155.getTree());
					char_literal156=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes1430);  
					stream_CBracket.add(char_literal156);

					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					EarlyExitException eee = new EarlyExitException(32, input);
					throw eee;
				}
				cnt32++;
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 231:28: -> ^( INDEXES ( expression )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:231:31: ^( INDEXES ( expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEXES, "INDEXES"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "indexes"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_program149 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block170 = new BitSet(new long[]{0x4980001820020082L,0x0000000000000060L});
	public static final BitSet FOLLOW_functionDecl_in_block174 = new BitSet(new long[]{0x4980001820020082L,0x0000000000000060L});
	public static final BitSet FOLLOW_Return_in_block179 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_block181 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_block183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement225 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement241 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_statement275 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_query294 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_String_in_query298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_query302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableCall313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment325 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_indexes_in_assignment327 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment330 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_assignment332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall360 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall362 = new BitSet(new long[]{0x419B000804002480L,0x0000000000000043L});
	public static final BitSet FOLLOW_exprList_in_functionCall364 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall385 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall387 = new BitSet(new long[]{0x419B000804002480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_functionCall389 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall414 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall416 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_functionCall418 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall441 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall443 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_functionCall445 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall467 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall469 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_functionCall471 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement502 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement504 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat536 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_ifStat538 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_ifStat540 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_ifStat542 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_ifStat544 = new BitSet(new long[]{0x4980001820020880L,0x0000000000000060L});
	public static final BitSet FOLLOW_block_in_ifStat546 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_ifStat548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat572 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_If_in_elseIfStat574 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_elseIfStat576 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_elseIfStat578 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_elseIfStat580 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_elseIfStat582 = new BitSet(new long[]{0x4980001820020880L,0x0000000000000060L});
	public static final BitSet FOLLOW_block_in_elseIfStat584 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_elseIfStat586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat610 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_elseStat612 = new BitSet(new long[]{0x4980001820020880L,0x0000000000000060L});
	public static final BitSet FOLLOW_block_in_elseStat614 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_elseStat616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Def_in_functionDecl638 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl640 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl642 = new BitSet(new long[]{0x0000000800002000L});
	public static final BitSet FOLLOW_idList_in_functionDecl644 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl647 = new BitSet(new long[]{0x4980001821020080L,0x0000000000000060L});
	public static final BitSet FOLLOW_block_in_functionDecl649 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_End_in_functionDecl651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement676 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_forStatement678 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_forStatement680 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_forStatement682 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_forStatement684 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_forStatement686 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_forStatement688 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_forStatement690 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_forStatement692 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_forStatement694 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_forStatement696 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_forStatement698 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_forStatement700 = new BitSet(new long[]{0x4980001820020880L,0x0000000000000060L});
	public static final BitSet FOLLOW_block_in_forStatement702 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_forStatement704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement745 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_whileStatement747 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_whileStatement749 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_whileStatement751 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_whileStatement753 = new BitSet(new long[]{0x4980001820020880L,0x0000000000000060L});
	public static final BitSet FOLLOW_block_in_whileStatement755 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_whileStatement757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList781 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_idList784 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_idList786 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expression_in_exprList811 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_exprList814 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_exprList816 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_condExpr_in_expression841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expression845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr864 = new BitSet(new long[]{0x0200002000000002L});
	public static final BitSet FOLLOW_QMark_in_condExpr879 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_condExpr883 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_Colon_in_condExpr885 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_condExpr889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr912 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_condExpr914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr966 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_Or_in_orExpr969 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_andExpr_in_orExpr972 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_equExpr_in_andExpr988 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_And_in_andExpr991 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_equExpr_in_andExpr994 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1010 = new BitSet(new long[]{0x0000800002000002L});
	public static final BitSet FOLLOW_set_in_equExpr1013 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1022 = new BitSet(new long[]{0x0000800002000002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1038 = new BitSet(new long[]{0x00000C00C0000002L});
	public static final BitSet FOLLOW_set_in_relExpr1041 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1058 = new BitSet(new long[]{0x00000C00C0000002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1074 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_addExpr1077 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1086 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000002L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1102 = new BitSet(new long[]{0x0000300000080002L});
	public static final BitSet FOLLOW_set_in_mulExpr1105 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1118 = new BitSet(new long[]{0x0000300000080002L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1134 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_Pow_in_powExpr1137 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1140 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr1158 = new BitSet(new long[]{0x419B000800000480L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr1175 = new BitSet(new long[]{0x419B000800000480L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list1241 = new BitSet(new long[]{0x419B000804001480L,0x0000000000000043L});
	public static final BitSet FOLLOW_exprList_in_list1243 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_list1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_lookup1269 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup1296 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup1331 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup1360 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup1393 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_lookup1395 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_lookup1397 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes1426 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000043L});
	public static final BitSet FOLLOW_expression_in_indexes1428 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_indexes1430 = new BitSet(new long[]{0x0008000000000002L});
}
