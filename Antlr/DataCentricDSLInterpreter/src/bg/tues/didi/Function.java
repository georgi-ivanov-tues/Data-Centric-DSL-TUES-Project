package bg.tues.didi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import bg.tues.didi.tree.Node;

public class Function implements Node{

	private String id;
	private List<String> identifiers;
	private CommonTree code;
	private Scope scope;
	private Map<String, Function> functions;
	private List<Node> params;
	private Map<String, Object> context;

	public Function(String i, CommonTree ids, CommonTree block) {
		id = i;
		identifiers = toList(ids);
		code = block;
		scope = new Scope();
	}
	
	public Function(String i, CommonTree ids, CommonTree block, Map<String, Function> funcs) {
		id = i;
		identifiers = toList(ids);
		code = block;
		scope = new Scope();
		functions = funcs;
	}

	public Function(Function original) {
		id = original.id;
		identifiers = original.identifiers;
		code = original.code;
		scope = original.scope.copy();
	}

	public void setParameters(List<Node> par){
		params = par;
	}
	
	public void setFunctions(Map<String, Function> funcs) {
		functions = funcs;
	}
	
	public void setContext(Map<String, Object> cont) {
		context = cont;
	}
	
	public void setScope(Scope newScope) {
		scope = newScope;
	}
	public Value invoke(List<Node> params, Map<String, Object> context, Map<String, Function> functions) {
		if(params.size() != identifiers.size()) {
			throw new RuntimeException("Illegal function call: " + identifiers.size() +
					" parameters expected for function \'" + id + "\'");
		}

		// Assign all expression parameters to this function's identifiers
		for(int i = 0; i < identifiers.size(); i++) {
			scope.assign(identifiers.get(i), params.get(i).evaluate());
		}
		
		try {
			// Create a tree walker to evaluate this function's code block
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(code);
			ProgramWalker walker = new ProgramWalker(nodes, scope, context, functions);
			return walker.program();
		} catch (RecognitionException e) {
			// Do not recover from this
			throw new RuntimeException("Something went wrong, terminating...", e);
		}
	
	}
	
	@Override
	public Value evaluate() {
		return invoke(params, context, functions);
	}

	private List<String> toList(CommonTree tree) {
		List<String> ids = new ArrayList<String>();

		// Convert the tree to a List of Strings
		for(int i = 0; i < tree.getChildCount(); i++) {
			CommonTree child = (CommonTree)tree.getChild(i);
			ids.add(child.getText());
		}
		return ids;
	}

}

