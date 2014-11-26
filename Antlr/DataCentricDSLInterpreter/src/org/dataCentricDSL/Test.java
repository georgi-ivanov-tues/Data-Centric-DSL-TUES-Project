package org.dataCentricDSL;

import java.util.List;
import java.util.Scanner;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.dataCentricDSL.DataCentricDSLParser.program_return;


public class Test {

	public static void main(String[] args) throws RecognitionException {
		Scanner input = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		String line;
		while(!((line = input.nextLine()).equalsIgnoreCase("end"))) {
			builder.append(line);
		}
		input.close();
		CharStream charStream = new ANTLRStringStream(builder.toString());
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(tokenStream);
		program_return program = parser.program();
		System.out.println(program.tree.toStringTree());
		
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.tree);
		ProgramWalker walker = new ProgramWalker(nodeStream);
		List<String> queries = walker.program();
		for(String query : queries) {
			System.out.println(query);
		}
	}
}
