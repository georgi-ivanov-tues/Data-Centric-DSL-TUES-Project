package org.dataCentricDSL.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.dataCentricDSL.DataCentricDSLLexer;
import org.dataCentricDSL.DataCentricDSLParser;
import org.dataCentricDSL.ProgramWalker;
import org.dataCentricDSL.DataCentricDSLParser.program_return;
import org.junit.Test;

public class VariableQueryDeclarationTest {
	
	@Test
	public void VariableQueryDeclarationTest() throws RecognitionException{
		CharStream cs = new ANTLRStringStream("result = query(\"SELECT first_name FROM people\");");
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);
		program_return program = parser.program();
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.getTree());
		ProgramWalker walker = new ProgramWalker(nodeStream);
		
		walker.variableDecl();
		ArrayList<String[]> result = walker.queryVariables.get("result");
		assertEquals(result.size(), 4);
		assertEquals(result.get(0)[0], "Georgi");
		assertEquals(result.get(1)[0], "Kiril");
		assertEquals(result.get(2)[0], "Nedelcho");
		assertEquals(result.get(3)[0], "Bojidar");
	}
}
