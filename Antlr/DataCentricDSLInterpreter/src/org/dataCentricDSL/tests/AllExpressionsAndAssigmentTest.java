package org.dataCentricDSL.tests;

import static org.junit.Assert.assertEquals;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.dataCentricDSL.DataCentricDSLLexer;
import org.dataCentricDSL.DataCentricDSLParser;
import org.dataCentricDSL.ProgramWalker;
import org.dataCentricDSL.DataCentricDSLParser.program_return;
import org.dataCentricDSL.tree.IdentifierNode;
import org.dataCentricDSL.tree.TLNode;
import org.junit.Test;

public class AllExpressionsAndAssigmentTest {
	
	@Test
	public void AllExpressionsAndAssigmentTest() throws RecognitionException{
		CharStream cs = new ANTLRStringStream("a = 2;result = (((a + 3)*(6 - a))/2)*(-1);");
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);
		program_return program = parser.program();
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.getTree());
		ProgramWalker walker = new ProgramWalker(nodeStream);
		
		walker.program(); 
		TLNode result = new IdentifierNode("result", null);
//		int result =  (Integer) walker.context.get("result");
		System.out.println(result.evaluate().asDouble());
		assertEquals(result.evaluate().asBoolean(), -10);
	}
}