package bg.tues.DCL.tests;

import static org.junit.Assert.*;
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

public class VariableStringDeclarationTest {
	
	@Test
	public void VariableStringDeclarationTest() throws RecognitionException{
		CharStream cs = new ANTLRStringStream("str = \"Hello World\";");
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(tokens);
		program_return program = parser.program();
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.getTree());
		ProgramWalker walker = new ProgramWalker(nodeStream);
		
		walker.program();
		String result = (String) walker.context.get("str");
		assertEquals(result, "Hello World");
	}
}
