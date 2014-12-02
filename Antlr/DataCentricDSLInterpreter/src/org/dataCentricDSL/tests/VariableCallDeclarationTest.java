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
import org.junit.Test;

public class VariableCallDeclarationTest {
	
	@Test
	public void VariableCallDeclarationTest() throws RecognitionException{
		CharStream cs = new ANTLRStringStream("str = \"Hello World\"; str2 = str;");
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);
		program_return program = parser.program();
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.getTree());
		ProgramWalker walker = new ProgramWalker(nodeStream);
		
		walker.variableDecl(); 
		String str = walker.variables.get("str");
		walker.variableDecl();
		String str2 = walker.variables.get("str2");
		assertEquals(str, str2);
	}
}
