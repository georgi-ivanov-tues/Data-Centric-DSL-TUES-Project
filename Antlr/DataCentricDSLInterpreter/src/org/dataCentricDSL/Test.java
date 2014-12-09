package org.dataCentricDSL;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.dataCentricDSL.DataCentricDSLParser.program_return;
import org.dataCentricDSL.derbyDB.CreateDB;

public class Test {

	public static void main(String[] args) throws RecognitionException, FileNotFoundException, URISyntaxException {
		URL url = Test.class.getResource("inputFile.txt");
		File inputFile = new File(url.toURI());
		Scanner input = new Scanner(inputFile);
//		Scanner input = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		while(input.hasNextLine()) {
			builder.append(input.nextLine());
			builder.append("\n");
		}
		input.close();
		CharStream charStream = new ANTLRStringStream(builder.toString());
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(tokenStream);
		program_return program = parser.program();
//		System.out.println(program.tree.toStringTree());
//		System.out.println();
		
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(program.tree);
		Map<String, Object> myMap = new HashMap<String, Object>();
		myMap.put("testVariable", "YESSS");
		try {
			myMap.put("dataSource", DriverManager.getConnection(CreateDB.JDBC_URL));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ProgramWalker walker = new ProgramWalker(nodeStream, myMap);
		walker.program();
//		System.out.println(myMap.get("str"));
		
	}
}


/*
str = "SELECT * FROM people";
result = query(str);
print(result);
end
*/