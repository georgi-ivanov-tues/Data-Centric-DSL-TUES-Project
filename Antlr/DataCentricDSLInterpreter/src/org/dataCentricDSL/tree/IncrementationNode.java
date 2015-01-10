package org.dataCentricDSL.tree;

import org.dataCentricDSL.Scope;
import org.dataCentricDSL.Value;

public class IncrementationNode implements Node {

	private String variableName;
	private int incrementWith;
	private Scope currentScope;

	public IncrementationNode(String var, int inc, Scope curr) {
		variableName = var;
		incrementWith = inc;
		currentScope = curr;
	}

	@Override
	public Value evaluate() {
		new AssignmentNode(
				variableName,
				new AtomNode(
						new IdentifierNode(variableName, currentScope).evaluate().asDouble() 
						+ new AtomNode(incrementWith).evaluate().asDouble()), 
				currentScope).evaluate();

		return Value.VOID;
	}

}
