package bg.tues.DCL;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import bg.tues.DCL.derbyDB.CreateDB;

public class DCLInterpreter {

	public void execute(String absolutePath) throws IOException, Exception, SQLException{
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(new ANTLRFileStream(absolutePath));

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);

		CommonTree tree = (CommonTree)parser.program().getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
		
		Map<String, Object> myMap = new HashMap<String, Object>();
		myMap.put("dataSource", DriverManager.getConnection(CreateDB.JDBC_URL));

		ProgramWalker walker = new ProgramWalker(nodes, myMap, parser.functions);
		walker.program();
	}
}


