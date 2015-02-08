package bg.tues.didi.tree.expressions.operations;

import bg.tues.didi.Value;
import bg.tues.didi.tree.Node;

public class NotEqualsNode implements Node {
	private Node lhs;
	private Node rhs;

	public NotEqualsNode(Node lhs, Node rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Value evaluate() {

		Value a = lhs.evaluate();
		Value b = rhs.evaluate();

		if(a.isNumber() && b.isNumber()) {
			return new Value(a.asDouble() != b.asDouble());
		}

		if(a.isString() && b.isString()) {
			return new Value(a.asString().compareTo(b.asString()) != 0);
		}
		
		if(a.isBoolean() && b.isBoolean()) {
			return new Value(a.asBoolean().compareTo(b.asBoolean()) != 0);
		}


		throw new RuntimeException("Illegal expression: " + this);
	}

	@Override
	public String toString() {
		return String.format("(%s < %s)", lhs, rhs);
	}
}
