package bg.tues.didi.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;

import bg.tues.didi.DataCentricDSLLexer;
import bg.tues.didi.DataCentricDSLParser;
import bg.tues.didi.DataCentricDSLParser.program_return;
import bg.tues.didi.ProgramWalker;
import bg.tues.didi.derbydb.CreateDB;

public class FunctionDeclarationTest {
	@Test
	public void PrintExecutionTest() throws RecognitionException, IOException, SQLException {
		CharStream cs = new ANTLRStringStream("func hello(){println \"Hello World\";}");
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);
		program_return program = parser.program();
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.getTree());
		Map<String, Object> myMap = new HashMap<String, Object>();
		myMap.put("dataSource", DriverManager.getConnection(CreateDB.JDBC_URL));
		myMap.put("outputStream", System.out);

		ProgramWalker walker = new ProgramWalker(nodeStream, myMap, parser.functions);
		walker.program();
		parser.functions.size();
		
		assertEquals(1, parser.functions.size());
	}
}