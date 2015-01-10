package org.dataCentricDSL.tests;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.DriverManager;
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
import org.dataCentricDSL.ProgramWalker;
import org.dataCentricDSL.DataCentricDSLParser.program_return;
import org.dataCentricDSL.derbyDB.CreateDB;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrintVariableQueryTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}
	
	@Test
	public void QueryExecutionTest() throws RecognitionException {
		CharStream cs = new ANTLRStringStream("r = query \"SELECT first_name FROM people WHERE first_name = 'Georgi'\"; println r;");
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
		walker.program();
		
		String str = outContent.toString();
		assertEquals("Georgi", str.trim());
	}
}
