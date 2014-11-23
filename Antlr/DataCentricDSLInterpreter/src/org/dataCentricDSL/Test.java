package org.dataCentricDSL;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {

	public static void main(String[] args) throws RecognitionException {
		CharStream charStream = new ANTLRStringStream("maika vi deba");
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(tokenStream);
		parser.rule();
		System.out.println(parser);
	}
}
