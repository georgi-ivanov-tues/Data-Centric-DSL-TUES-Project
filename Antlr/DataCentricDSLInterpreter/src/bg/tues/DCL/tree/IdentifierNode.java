package bg.tues.DCL.tree;

import bg.tues.DCL.Scope;
import bg.tues.DCL.Value;

public class IdentifierNode implements Node {

	private String identifier;
	private Scope scope;

	public IdentifierNode(String id, Scope s) {
		identifier = id;
		scope = s;
	}

	@Override
	public Value evaluate() {
		Value value = scope.resolve(identifier);
		if(value == null) {
			throw new RuntimeException("No such variable: " + this);
		}
		return value;
	}

	@Override
	public String toString() {
		return identifier;
	}
}

