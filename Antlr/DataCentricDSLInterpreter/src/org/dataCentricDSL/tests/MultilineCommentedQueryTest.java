package org.dataCentricDSL.tests;

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

public class MultilineCommentedQueryTest {

	@Test(expected=NullPointerException.class)
	public void MultilineCommentedQueryTest() throws RecognitionException {
		CharStream cs = new ANTLRStringStream("/*query();*/");
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(cs);
		CommonTokenStream ts = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(ts);
		program_return program = parser.program();
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.getTree());
		ProgramWalker walker = new ProgramWalker(nodeStream);
		walker.program();
	}
}
