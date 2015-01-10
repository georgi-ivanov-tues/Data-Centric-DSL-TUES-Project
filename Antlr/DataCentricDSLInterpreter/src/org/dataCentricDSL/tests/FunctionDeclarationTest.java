package org.dataCentricDSL.tests;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
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

public class FunctionDeclarationTest {
	@Test
	public void PrintExecutionTest() throws RecognitionException, IOException {
		CharStream cs = new ANTLRStringStream("func hello(){println \"Hello World\";}");
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);
		program_return program = parser.program();
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.getTree());
		ProgramWalker walker = new ProgramWalker(nodeStream);
		walker.program();
		parser.functions.size();
		
		assertEquals(1, parser.functions.size());
	}
}