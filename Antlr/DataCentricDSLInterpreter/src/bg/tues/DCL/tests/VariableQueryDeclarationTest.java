package bg.tues.DCL.tests;

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
import bg.tues.DCL.DataCentricDSLLexer;
import bg.tues.DCL.DataCentricDSLParser;
import bg.tues.DCL.DataCentricDSLParser.program_return;
import bg.tues.DCL.ProgramWalker;
import org.junit.Test;

import bg.tues.DCL.derbyDB.CreateDB;

public class VariableQueryDeclarationTest {
	
	@Test
	public void VariableQueryDeclarationTest() throws RecognitionException{
		CharStream cs = new ANTLRStringStream("result = query \"SELECT first_name FROM people\";");
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
		ResultSet result = (ResultSet) walker.context.get("result");
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
