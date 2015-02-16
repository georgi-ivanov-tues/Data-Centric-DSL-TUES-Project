package bg.tues.didi;

import java.io.PrintStream;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import bg.tues.didi.DataCentricDSLLexer;
import bg.tues.didi.DataCentricDSLParser;
import bg.tues.didi.ProgramWalker;
import bg.tues.didi.derbydb.CreateDB;

public class DCLInterpreter {

	public Value execute(String absolutePath, PrintStream out) throws Exception{
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(new ANTLRFileStream(absolutePath));

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);

		CommonTree tree = (CommonTree)parser.program().getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
		
		if(out == null){
			out = System.out;
		}

		Map<String, Object> context = new HashMap<String, Object>();
		context.put("dataSource", DriverManager.getConnection(CreateDB.JDBC_URL));
		context.put("outputStream", out);

		ProgramWalker walker = new ProgramWalker(nodes, context, parser.functions);
		return walker.program();
	}
	
	public Value execute(String absolutePath, Map<String, Object> context) throws Exception{
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(new ANTLRFileStream(absolutePath));

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);

		CommonTree tree = (CommonTree)parser.program().getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);

		ProgramWalker walker = new ProgramWalker(nodes, context, parser.functions);
		return walker.program();
	}
	
	public Value execute(String absolutePath, Scope scope, Map<String, Object> context) throws Exception{
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(new ANTLRFileStream(absolutePath));

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);

		CommonTree tree = (CommonTree)parser.program().getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);

		ProgramWalker walker = new ProgramWalker(nodes, scope, context, parser.functions);
		return walker.program();
	}
}


