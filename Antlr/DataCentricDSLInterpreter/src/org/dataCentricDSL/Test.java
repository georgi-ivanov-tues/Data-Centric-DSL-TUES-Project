package org.dataCentricDSL;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;


public class Test {

	public static void main(String[] args) throws RecognitionException {
		CharStream charStream = new ANTLRStringStream("query(as qwe asd); \n query(ln wd);");
		DataCentricDSLLexer lexer = new DataCentricDSLLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		DataCentricDSLParser parser = new DataCentricDSLParser(tokenStream);
		
		
		CommonTree tree = (CommonTree) parser.program().getTree();
		DOTTreeGenerator gen = new DOTTreeGenerator();
		StringTemplate st = gen.toDOT(tree);
		System.out.println(st);
		
		
		
		
//		printTree(tree,1);

//		Iterator entries = st.getArgumentContext().entrySet().iterator(); 
//		while (entries.hasNext()) {
//		  Entry thisEntry = (Entry) entries.next();
//		  Object key = thisEntry.getKey();
//		  Object value = thisEntry.getValue();
//		  System.out.println(key + " -> " + value);
//		  // ...
//		}
		
		
//		//		System.out.println(parser.getRuleInvocationStack());
//		System.out.println(parser.getDelegates());
//		for(String e : parser.getRuleInvocationStack())
//			System.out.println(e.toString());
//		for(String e : parser.getTokenStream().toString())
//			System.out.println(parser.getTokenStream().toString());
	}
	
	// Useless but leave it be
	public static void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			
			if (t.getParent() == null){
				System.out.println(sb.toString() + t.getText().toString());	
			}
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}
}
