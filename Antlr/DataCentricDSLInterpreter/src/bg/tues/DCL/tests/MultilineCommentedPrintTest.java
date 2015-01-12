package bg.tues.DCL.tests;

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

public class MultilineCommentedPrintTest {
	
	@Test(expected=NullPointerException.class)
	public void MultilineCommentedPrintTest() throws RecognitionException {
		CharStream cs = new ANTLRStringStream("/*print();*/");
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(cs);
		CommonTokenStream ts = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(ts);
		program_return program = parser.program();
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.getTree());
		ProgramWalker walker = new ProgramWalker(nodeStream);
		walker.program();
	}
}
