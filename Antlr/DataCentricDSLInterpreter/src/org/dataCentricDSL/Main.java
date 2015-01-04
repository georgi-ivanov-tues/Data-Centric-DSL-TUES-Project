package org.dataCentricDSL;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.dataCentricDSL.DataCentricDSLParser.program_return;
import org.dataCentricDSL.derbyDB.CreateDB;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Main {
	public static void main(String[] args) throws Exception {
		// create an instance of the lexer
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(new ANTLRFileStream("test.tl"));

		// wrap a token-stream around the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create the parser
		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);

		// walk the tree
		CommonTree tree = (CommonTree)parser.program().getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);

		program_return program = parser.program();
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.tree);
		Map<String, Object> myMap = new HashMap<String, Object>();
		myMap.put("testVariable", "YESSS");
		try {
			myMap.put("dataSource", DriverManager.getConnection(CreateDB.JDBC_URL));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ProgramWalker walker = new ProgramWalker(nodes, myMap);
		walker.program();
	}
}


