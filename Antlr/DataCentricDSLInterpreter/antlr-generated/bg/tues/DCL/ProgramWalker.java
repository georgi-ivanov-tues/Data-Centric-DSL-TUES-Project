// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g 2015-01-12 21:17:19

  package bg.tues.DCL;
  import bg.tues.DCL.*;
  import bg.tues.DCL.tree.*;
  import bg.tues.DCL.tree.funcions.PrintlnNode;
  import bg.tues.DCL.tree.funcions.QueryNode;
  import bg.tues.DCL.tree.expressions.operations.*;
  import java.util.Map; 
  import java.util.HashMap;
  
  import java.util.List;
  import java.util.ArrayList;
  import java.sql.Connection;
  import java.sql.ResultSet;
  import java.sql.Statement;
  import java.sql.SQLException;
  import java.sql.ResultSetMetaData;
  import java.util.Arrays;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProgramWalker extends TreeParser {
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
		"'--'", "'func'", "'global'", "'query'"
	};
	public static final int EOF=-1;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ProgramWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProgramWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProgramWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g"; }


	  public Map<String, Function> functions = null;
	  Scope currentScope = null;
	    
	  public ProgramWalker(TreeNodeStream input, Map<String, Object> context, Map<String, Function> fns) {
	    super(input, new RecognizerSharedState());
	    this.context = context;
	    functions = fns;
	  }
	  
	//  public ProgramWalker(CommonTreeNodeStream nodes, Map<String, Function> fns) {
	//    this(nodes, null, fns);
	//  }
	  
	  public ProgramWalker(CommonTreeNodeStream nds, Scope sc, Map<String, Function> fns) {
	    super(nds);
	    currentScope = sc;
	    functions = fns;
	  }
	  
	   public ProgramWalker(TreeNodeStream input, Map<String, Object> context) {
	    super(input, new RecognizerSharedState());
	    this.context = context;
	  }
	  
	  public ProgramWalker(TreeNodeStream input, RecognizerSharedState state, Map<String, Object> context) {
	    super(input, state);
	    this.context = context;
	  }
	   
	  public Map<String, Object> context = new HashMap<String, Object>();
	  



	// $ANTLR start "program"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:62:1: program returns [Node node] : block ;
	public final Node program() throws RecognitionException {
		Node node = null;


		Node block1 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:63:3: ( block )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:63:6: block
			{
			pushFollow(FOLLOW_block_in_program51);
			block1=block();
			state._fsp--;


			      node = block1; 
			      node.evaluate();
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "program"



	// $ANTLR start "block"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:69:1: block returns [Node node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
	public final Node block() throws RecognitionException {
		Node node = null;


		Node statement2 =null;
		Node expression3 =null;


		  BlockNode bn = new BlockNode();
		  node = bn;
		  Scope scope = new Scope(currentScope);
		  currentScope = scope;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:79:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:79:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block84); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block97); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:80:23: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||(LA1_0 >= FUNC_CALL && LA1_0 <= For)||LA1_0==IF||LA1_0==Identifier||LA1_0==While||(LA1_0 >= 72 && LA1_0 <= 73)) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:80:24: statement
						{
						pushFollow(FOLLOW_statement_in_block100);
						statement2=statement();
						state._fsp--;

						bn.addStatement(statement2);
						}
						break;

					default :
						break loop1;
					}
				}

				match(input, Token.UP, null); 
			}

			match(input,RETURN,FOLLOW_RETURN_in_block120); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:81:23: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= Add && LA2_0 <= And)||LA2_0==Bool||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==In||(LA2_0 >= LOOKUP && LA2_0 <= Number)||(LA2_0 >= Or && LA2_0 <= Pow)||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==73) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:81:24: expression
						{
						pushFollow(FOLLOW_expression_in_block127);
						expression3=expression();
						state._fsp--;

						bn.addReturn(expression3);  
						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			}

			 
			  currentScope = currentScope.parent();

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:85:1: statement returns [Node node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | incrementation | query );
	public final Node statement() throws RecognitionException {
		Node node = null;


		Node assignment4 =null;
		Node functionCall5 =null;
		Node ifStatement6 =null;
		Node forStatement7 =null;
		Node whileStatement8 =null;
		Node incrementation9 =null;
		Node query10 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:86:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | incrementation | query )
			int alt3=7;
			switch ( input.LA(1) ) {
			case ASSIGNMENT:
			case 72:
				{
				alt3=1;
				}
				break;
			case FUNC_CALL:
				{
				alt3=2;
				}
				break;
			case IF:
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
			case Identifier:
				{
				alt3=6;
				}
				break;
			case 73:
				{
				alt3=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:86:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement159);
					assignment4=assignment();
					state._fsp--;

					node = assignment4;
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:87:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement172);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:88:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement183);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6;
					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:89:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement195);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7;
					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:90:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement207);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8;
					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:91:6: incrementation
					{
					pushFollow(FOLLOW_incrementation_in_statement216);
					incrementation9=incrementation();
					state._fsp--;

					node = incrementation9;
					}
					break;
				case 7 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:92:6: query
					{
					pushFollow(FOLLOW_query_in_statement225);
					query10=query();
					state._fsp--;

					node = query10;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "statement"



	// $ANTLR start "query"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:95:1: query returns [Node node] : ^( 'query' ( String | variableCall ) ) ;
	public final Node query() throws RecognitionException {
		Node node = null;


		CommonTree String11=null;
		String variableCall12 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:95:26: ( ^( 'query' ( String | variableCall ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:96:3: ^( 'query' ( String | variableCall ) )
			{
			String sqlStatement = "";
			match(input,73,FOLLOW_73_in_query249); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:98:4: ( String | variableCall )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:98:7: String
					{
					String11=(CommonTree)match(input,String,FOLLOW_String_in_query257); 
					node = new QueryNode(new AtomNode((String11!=null?String11.getText():null)), (Connection) context.get("dataSource"));
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:99:7: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_query268);
					variableCall12=variableCall();
					state._fsp--;

					node = new QueryNode(new IdentifierNode(variableCall12, currentScope), (Connection) context.get("dataSource"));
					}
					break;

			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "query"



	// $ANTLR start "variableCall"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:105:1: variableCall returns [String value] : Identifier ;
	public final String variableCall() throws RecognitionException {
		String value = null;


		CommonTree Identifier13=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:105:36: ( Identifier )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:106:3: Identifier
			{
			Identifier13=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_variableCall295); 
			value=(Identifier13!=null?Identifier13.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "variableCall"



	// $ANTLR start "assignment"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:109:1: assignment returns [Node node] : ( ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression ) | ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? e= expression ) );
	public final Node assignment() throws RecognitionException {
		Node node = null;


		CommonTree i=null;
		java.util.List<Node> x =null;
		Node e =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:110:3: ( ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression ) | ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? e= expression ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ASSIGNMENT) ) {
				alt7=1;
			}
			else if ( (LA7_0==72) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:110:6: ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression )
					{
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment315); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment319); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:110:33: (x= indexes )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==INDEXES) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:110:33: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment323);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_assignment328);
					e=expression();
					state._fsp--;

					node = new AssignmentNode((i!=null?i.getText():null), x, e, currentScope);
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:111:6: ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? e= expression )
					{
					match(input,72,FOLLOW_72_in_assignment339); 
					match(input, Token.DOWN, null); 
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment341); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment345); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:111:42: (x= indexes )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==INDEXES) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:111:42: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment349);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_assignment354);
					e=expression();
					state._fsp--;


					        Scope globalScope = currentScope;
					        
					        while(globalScope.parent() != null){
					          globalScope = globalScope.parent();
					        }
					        node = new AssignmentNode((i!=null?i.getText():null), x, e, globalScope);
					        
					match(input, Token.UP, null); 

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "functionCall"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:121:1: functionCall returns [Node node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) );
	public final Node functionCall() throws RecognitionException {
		Node node = null;


		CommonTree Identifier15=null;
		java.util.List<Node> exprList14 =null;
		Node expression16 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:122:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) )
			int alt10=5;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==FUNC_CALL) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt10=1;
						}
						break;
					case Println:
						{
						alt10=2;
						}
						break;
					case Print:
						{
						alt10=3;
						}
						break;
					case Assert:
						{
						alt10=4;
						}
						break;
					case Size:
						{
						alt10=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:122:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall376); 
					match(input, Token.DOWN, null); 
					Identifier15=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall378); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:122:29: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:122:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall380);
							exprList14=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        
					        int paramSize = 0;
					        if(exprList14 == null){
					            paramSize = 0;
					        }else{
					            paramSize = exprList14.size();
					        }
					      Function function = functions.get((Identifier15!=null?Identifier15.getText():null) + paramSize);
					      function.setParameters(paramSize == 0 ? new ArrayList<Node>() : exprList14);
					      node = function;
					      
					  
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:135:6: ^( FUNC_CALL Println ( expression )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall392); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall394); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:135:26: ( expression )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( ((LA9_0 >= Add && LA9_0 <= And)||LA9_0==Bool||LA9_0==Divide||LA9_0==Equals||(LA9_0 >= GT && LA9_0 <= GTEquals)||LA9_0==In||(LA9_0 >= LOOKUP && LA9_0 <= Number)||(LA9_0 >= Or && LA9_0 <= Pow)||(LA9_0 >= Subtract && LA9_0 <= TERNARY)||LA9_0==UNARY_MIN||LA9_0==73) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:135:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall396);
							expression16=expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PrintlnNode(expression16);
					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:136:6: ^( FUNC_CALL Print expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall408); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall410); 
					pushFollow(FOLLOW_expression_in_functionCall412);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:137:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall421); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall423); 
					pushFollow(FOLLOW_expression_in_functionCall425);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:138:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall435); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall437); 
					pushFollow(FOLLOW_expression_in_functionCall439);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "functionCall"



	// $ANTLR start "ifStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:141:1: ifStatement returns [Node node] : ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) ;
	public final Node ifStatement() throws RecognitionException {
		Node node = null;


		Node b1 =null;
		Node b2 =null;
		Node expression17 =null;


		  IfNode ifNode = new IfNode();
		  node = ifNode;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:146:3: ( ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:146:6: ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement465); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:147:8: ( ^( EXP expression b1= block ) )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==EXP) ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1==DOWN) ) {
						int LA11_3 = input.LA(3);
						if ( ((LA11_3 >= Add && LA11_3 <= And)||LA11_3==Bool||LA11_3==Divide||LA11_3==Equals||(LA11_3 >= GT && LA11_3 <= GTEquals)||LA11_3==In||(LA11_3 >= LOOKUP && LA11_3 <= Number)||(LA11_3 >= Or && LA11_3 <= Pow)||(LA11_3 >= Subtract && LA11_3 <= TERNARY)||LA11_3==UNARY_MIN||LA11_3==73) ) {
							alt11=1;
						}

					}

				}

				switch (alt11) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:147:9: ^( EXP expression b1= block )
					{
					match(input,EXP,FOLLOW_EXP_in_ifStatement477); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_ifStatement479);
					expression17=expression();
					state._fsp--;

					pushFollow(FOLLOW_block_in_ifStatement483);
					b1=block();
					state._fsp--;

					match(input, Token.UP, null); 

					ifNode.addChoice(expression17, b1);  
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:148:8: ( ^( EXP b2= block ) )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==EXP) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:148:9: ^( EXP b2= block )
					{
					match(input,EXP,FOLLOW_EXP_in_ifStatement500); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_ifStatement504);
					b2=block();
					state._fsp--;

					match(input, Token.UP, null); 

					ifNode.addChoice(new AtomNode(true), b2);
					}
					break;

			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "forStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:152:1: forStatement returns [Node node] : ^( For a= assignment b= expression c= afterthought d= block ) ;
	public final Node forStatement() throws RecognitionException {
		Node node = null;


		Node a =null;
		Node b =null;
		Node c =null;
		Node d =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:153:3: ( ^( For a= assignment b= expression c= afterthought d= block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:153:6: ^( For a= assignment b= expression c= afterthought d= block )
			{
			match(input,For,FOLLOW_For_in_forStatement549); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assignment_in_forStatement553);
			a=assignment();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement557);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_afterthought_in_forStatement561);
			c=afterthought();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement565);
			d=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForNode(a, b, c, d, currentScope);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "forStatement"



	// $ANTLR start "afterthought"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:156:1: afterthought returns [Node node] : ( ( Identifier '=' expression ) | incrementation ) ;
	public final Node afterthought() throws RecognitionException {
		Node node = null;


		CommonTree Identifier18=null;
		Node expression19 =null;
		Node incrementation20 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:156:33: ( ( ( Identifier '=' expression ) | incrementation ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:157:3: ( ( Identifier '=' expression ) | incrementation )
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:157:3: ( ( Identifier '=' expression ) | incrementation )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Identifier) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==Assign) ) {
					alt13=1;
				}
				else if ( (LA13_1==Increment||LA13_1==70) ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:157:4: ( Identifier '=' expression )
					{
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:157:4: ( Identifier '=' expression )
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:157:5: Identifier '=' expression
					{
					Identifier18=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_afterthought586); 
					match(input,Assign,FOLLOW_Assign_in_afterthought588); 
					pushFollow(FOLLOW_expression_in_afterthought590);
					expression19=expression();
					state._fsp--;

					node = new AssignmentNode((Identifier18!=null?Identifier18.getText():null), expression19, currentScope);
					}

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:158:5: incrementation
					{
					pushFollow(FOLLOW_incrementation_in_afterthought600);
					incrementation20=incrementation();
					state._fsp--;

					node = incrementation20;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "afterthought"



	// $ANTLR start "whileStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:161:1: whileStatement returns [Node node] : ^( While expression block ) ;
	public final Node whileStatement() throws RecognitionException {
		Node node = null;


		Node expression21 =null;
		Node block22 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:162:3: ( ^( While expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:162:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement620); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement622);
			expression21=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement624);
			block22=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileNode(expression21, block22);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "whileStatement"



	// $ANTLR start "idList"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:165:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:166:3: ( ^( ID_LIST ( Identifier )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:166:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList646); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:166:16: ( Identifier )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==Identifier) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:166:16: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_idList648); 
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "idList"



	// $ANTLR start "exprList"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:169:1: exprList returns [java.util.List<Node> e] : ^( EXP_LIST (a= expression )+ ) ;
	public final java.util.List<Node> exprList() throws RecognitionException {
		java.util.List<Node> e = null;


		Node a =null;


		  e = new ArrayList<Node>();

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:173:3: ( ^( EXP_LIST (a= expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:173:6: ^( EXP_LIST (a= expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList674); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:173:17: (a= expression )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= Add && LA15_0 <= And)||LA15_0==Bool||LA15_0==Divide||LA15_0==Equals||(LA15_0 >= GT && LA15_0 <= GTEquals)||LA15_0==In||(LA15_0 >= LOOKUP && LA15_0 <= Number)||(LA15_0 >= Or && LA15_0 <= Pow)||(LA15_0 >= Subtract && LA15_0 <= TERNARY)||LA15_0==UNARY_MIN||LA15_0==73) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:173:18: a= expression
					{
					pushFollow(FOLLOW_expression_in_exprList679);
					a=expression();
					state._fsp--;

					e.add(a);
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "exprList"



	// $ANTLR start "expression"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:177:1: expression returns [Node node] : ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' expression expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup | query );
	public final Node expression() throws RecognitionException {
		Node node = null;


		CommonTree Number23=null;
		Node a =null;
		Node b =null;
		Node lookup24 =null;
		Node query25 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:178:3: ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' expression expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup | query )
			int alt16=23;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt16=1;
				}
				break;
			case In:
				{
				alt16=2;
				}
				break;
			case Or:
				{
				alt16=3;
				}
				break;
			case And:
				{
				alt16=4;
				}
				break;
			case Equals:
				{
				alt16=5;
				}
				break;
			case NEquals:
				{
				alt16=6;
				}
				break;
			case GTEquals:
				{
				alt16=7;
				}
				break;
			case LTEquals:
				{
				alt16=8;
				}
				break;
			case GT:
				{
				alt16=9;
				}
				break;
			case LT:
				{
				alt16=10;
				}
				break;
			case Add:
				{
				alt16=11;
				}
				break;
			case Subtract:
				{
				alt16=12;
				}
				break;
			case Multiply:
				{
				alt16=13;
				}
				break;
			case Divide:
				{
				alt16=14;
				}
				break;
			case Modulus:
				{
				alt16=15;
				}
				break;
			case Pow:
				{
				alt16=16;
				}
				break;
			case UNARY_MIN:
				{
				alt16=17;
				}
				break;
			case NEGATE:
				{
				alt16=18;
				}
				break;
			case Number:
				{
				alt16=19;
				}
				break;
			case Bool:
				{
				alt16=20;
				}
				break;
			case Null:
				{
				alt16=21;
				}
				break;
			case LOOKUP:
				{
				alt16=22;
				}
				break;
			case 73:
				{
				alt16=23;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:178:6: ^( TERNARY expression expression expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression705); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression707);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression709);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression711);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:179:6: ^( In expression expression )
					{
					match(input,In,FOLLOW_In_in_expression720); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression722);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression724);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:180:6: ^( '||' a= expression b= expression )
					{
					match(input,Or,FOLLOW_Or_in_expression733); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression737);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression741);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:181:6: ^( '&&' a= expression b= expression )
					{
					match(input,And,FOLLOW_And_in_expression751); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression755);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression759);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:182:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression769); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression773);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression777);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:183:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression788); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression792);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression796);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:184:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression807); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression811);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression815);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GreaterThanAndEqualsNode(a, b);
					}
					break;
				case 8 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:185:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression826); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression830);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression834);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LessThanAndEqualsNode(a, b);
					}
					break;
				case 9 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:186:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression845); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression849);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression853);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GreaterThanNode(a, b);
					}
					break;
				case 10 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:187:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression864); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression868);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression872);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LessThanNode(a, b);
					}
					break;
				case 11 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:188:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression883); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression887);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression891);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b);
					}
					break;
				case 12 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:189:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression902); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression906);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression910);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b);
					}
					break;
				case 13 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:190:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression921); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression925);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression929);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MultiplicationNode(a, b);
					}
					break;
				case 14 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:191:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression940); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression944);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression948);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivisionNode(a, b);
					}
					break;
				case 15 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:192:6: ^( '%' expression expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression959); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression961);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression963);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 16 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:193:6: ^( '^' expression expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression972); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression974);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression976);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 17 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:194:6: ^( UNARY_MIN expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression985); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression987);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 18 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:195:6: ^( NEGATE expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression996); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression998);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 19 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:196:6: Number
					{
					Number23=(CommonTree)match(input,Number,FOLLOW_Number_in_expression1006); 
					node = new AtomNode(Double.parseDouble((Number23!=null?Number23.getText():null)));
					}
					break;
				case 20 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:197:6: Bool
					{
					match(input,Bool,FOLLOW_Bool_in_expression1015); 
					}
					break;
				case 21 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:198:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression1022); 
					}
					break;
				case 22 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:199:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression1029);
					lookup24=lookup();
					state._fsp--;

					node = lookup24;
					}
					break;
				case 23 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:200:6: query
					{
					pushFollow(FOLLOW_query_in_expression1040);
					query25=query();
					state._fsp--;

					node = query25;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "expression"



	// $ANTLR start "incrementation"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:204:1: incrementation returns [Node node] : ( variableCall ( '++' | '--' ) ) ;
	public final Node incrementation() throws RecognitionException {
		Node node = null;


		String variableCall26 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:205:3: ( ( variableCall ( '++' | '--' ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:205:4: ( variableCall ( '++' | '--' ) )
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:205:4: ( variableCall ( '++' | '--' ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:205:5: variableCall ( '++' | '--' )
			{
			pushFollow(FOLLOW_variableCall_in_incrementation1060);
			variableCall26=variableCall();
			state._fsp--;

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:205:18: ( '++' | '--' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==Increment) ) {
				alt17=1;
			}
			else if ( (LA17_0==70) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:205:19: '++'
					{
					match(input,Increment,FOLLOW_Increment_in_incrementation1063); 
					node = new IncrementationNode(variableCall26,1,currentScope);
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:206:5: '--'
					{
					match(input,70,FOLLOW_70_in_incrementation1070); 
					node = new IncrementationNode(variableCall26,-1,currentScope);
					}
					break;

			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "incrementation"



	// $ANTLR start "lookup"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:211:1: lookup returns [Node node] : ( ^( LOOKUP functionCall ( indexes )? ) | ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) );
	public final Node lookup() throws RecognitionException {
		Node node = null;


		CommonTree i=null;
		CommonTree String27=null;
		java.util.List<Node> x =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:212:3: ( ^( LOOKUP functionCall ( indexes )? ) | ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) )
			int alt23=5;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==LOOKUP) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt23=4;
						}
						break;
					case String:
						{
						alt23=5;
						}
						break;
					case FUNC_CALL:
						{
						alt23=1;
						}
						break;
					case LIST:
						{
						alt23=2;
						}
						break;
					case Add:
					case And:
					case Bool:
					case Divide:
					case Equals:
					case GT:
					case GTEquals:
					case In:
					case LOOKUP:
					case LT:
					case LTEquals:
					case Modulus:
					case Multiply:
					case NEGATE:
					case NEquals:
					case Null:
					case Number:
					case Or:
					case Pow:
					case Subtract:
					case TERNARY:
					case UNARY_MIN:
					case 73:
						{
						alt23=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 23, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:212:6: ^( LOOKUP functionCall ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1095); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup1097);
					functionCall();
					state._fsp--;

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:212:28: ( indexes )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==INDEXES) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:212:28: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1099);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:213:6: ^( LOOKUP list ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1109); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup1111);
					list();
					state._fsp--;

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:213:20: ( indexes )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==INDEXES) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:213:20: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1113);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:214:6: ^( LOOKUP expression ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1123); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup1125);
					expression();
					state._fsp--;

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:214:26: ( indexes )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==INDEXES) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:214:26: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1127);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:215:6: ^( LOOKUP i= Identifier (x= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1138); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup1142); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:215:29: (x= indexes )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==INDEXES) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:215:29: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1146);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        node = (x != null) ? 
					          new LookupNode(new IdentifierNode((i!=null?i.getText():null), currentScope), x) : 
					          new IdentifierNode((i!=null?i.getText():null), currentScope);
					      
					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:221:6: ^( LOOKUP String ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1165); 
					match(input, Token.DOWN, null); 
					String27=(CommonTree)match(input,String,FOLLOW_String_in_lookup1167); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:221:22: ( indexes )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==INDEXES) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:221:22: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1169);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        node = new AtomNode((String27!=null?String27.getText():null));
					      
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "lookup"



	// $ANTLR start "list"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:226:1: list returns [Node node] : ^( LIST ( exprList )? ) ;
	public final Node list() throws RecognitionException {
		Node node = null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:227:3: ( ^( LIST ( exprList )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:227:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list1194); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:227:13: ( exprList )?
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==EXP_LIST) ) {
					alt24=1;
				}
				switch (alt24) {
					case 1 :
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:227:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list1196);
						exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "list"



	// $ANTLR start "indexes"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:230:1: indexes returns [java.util.List<Node> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<Node> indexes() throws RecognitionException {
		java.util.List<Node> e = null;


		Node expression28 =null;

		e = new java.util.ArrayList<Node>();
		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:232:3: ( ^( INDEXES ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:232:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes1222); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:232:16: ( expression )+
			int cnt25=0;
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( ((LA25_0 >= Add && LA25_0 <= And)||LA25_0==Bool||LA25_0==Divide||LA25_0==Equals||(LA25_0 >= GT && LA25_0 <= GTEquals)||LA25_0==In||(LA25_0 >= LOOKUP && LA25_0 <= Number)||(LA25_0 >= Or && LA25_0 <= Pow)||(LA25_0 >= Subtract && LA25_0 <= TERNARY)||LA25_0==UNARY_MIN||LA25_0==73) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:232:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes1225);
					expression28=expression();
					state._fsp--;

					e.add(expression28);
					}
					break;

				default :
					if ( cnt25 >= 1 ) break loop25;
					EarlyExitException eee = new EarlyExitException(25, input);
					throw eee;
				}
				cnt25++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "indexes"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block84 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STATEMENTS_in_block97 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_block100 = new BitSet(new long[]{0x0000000A30000018L,0x0000000000000320L});
	public static final BitSet FOLLOW_RETURN_in_block120 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block127 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_statement216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_statement225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_query249 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_query257 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variableCall_in_query268 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_variableCall295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment315 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment319 = new BitSet(new long[]{0x0063FE24C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_indexes_in_assignment323 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_assignment328 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_72_in_assignment339 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment341 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_assignment345 = new BitSet(new long[]{0x0063FE24C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_indexes_in_assignment349 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_assignment354 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall376 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall378 = new BitSet(new long[]{0x0000000000400008L});
	public static final BitSet FOLLOW_exprList_in_functionCall380 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall394 = new BitSet(new long[]{0x0063FE20C2080468L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_functionCall396 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall408 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall410 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_functionCall412 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall421 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall423 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_functionCall425 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall435 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall437 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_functionCall439 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement465 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_EXP_in_ifStatement477 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStatement479 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_ifStatement483 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStatement500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_ifStatement504 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement549 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignment_in_forStatement553 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_forStatement557 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_afterthought_in_forStatement561 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_forStatement565 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_afterthought586 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_afterthought588 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_afterthought590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_afterthought600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement620 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement622 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_whileStatement624 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList646 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList648 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList674 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList679 = new BitSet(new long[]{0x0063FE20C2080468L,0x0000000000000216L});
	public static final BitSet FOLLOW_TERNARY_in_expression705 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression707 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression709 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression711 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression720 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression722 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression724 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Or_in_expression733 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression737 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression741 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_And_in_expression751 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression755 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression759 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression769 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression773 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression777 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression788 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression792 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression796 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression807 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression811 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression815 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression826 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression830 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression834 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression845 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression849 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression853 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression864 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression868 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression872 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression883 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression887 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression891 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression902 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression906 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression910 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression921 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression925 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression929 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression940 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression944 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression948 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression959 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression961 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression963 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression972 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression974 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression976 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression985 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression987 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression996 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression998 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expression1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_incrementation1060 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_Increment_in_incrementation1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_incrementation1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1095 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup1097 = new BitSet(new long[]{0x0000000400000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1099 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup1111 = new BitSet(new long[]{0x0000000400000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1113 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1123 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup1125 = new BitSet(new long[]{0x0000000400000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1127 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1138 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup1142 = new BitSet(new long[]{0x0000000400000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1146 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1165 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup1167 = new BitSet(new long[]{0x0000000400000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1169 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LIST_in_list1194 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list1196 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes1222 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes1225 = new BitSet(new long[]{0x0063FE20C2080468L,0x0000000000000216L});
}
