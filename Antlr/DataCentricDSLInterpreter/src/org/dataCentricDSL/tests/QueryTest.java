package org.dataCentricDSL.tests;

import static org.junit.Assert.assertEquals;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.dataCentricDSL.DataCentricDSLLexer;
import org.dataCentricDSL.DataCentricDSLParser;
import org.dataCentricDSL.DataCentricDSLParser.program_return;
import org.dataCentricDSL.derbyDB.CreateDB;
import org.dataCentricDSL.ProgramWalker;
import org.junit.Test;

public class QueryTest {

	@Test
	public void QueryExecutionTest() throws RecognitionException {
		CharStream cs = new ANTLRStringStream("query \"SELECT first_name FROM people\";");
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);
		program_return program = parser.program();
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.getTree());
		Map<String, Object> myMap = new HashMap<String, Object>();
		try {
			myMap.put("dataSource", DriverManager.getConnection(CreateDB.JDBC_URL));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ProgramWalker walker = new ProgramWalker(nodeStream, myMap);
		 
		ResultSet result = walker.query();
		try {
			result.next();
			assertEquals(result.getString(1), "Georgi");
			result.next();
			assertEquals(result.getString(1), "Kiril");
			result.next();
			assertEquals(result.getString(1), "Nedelcho");
			result.next();
			assertEquals(result.getString(1), "Bojidar");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
