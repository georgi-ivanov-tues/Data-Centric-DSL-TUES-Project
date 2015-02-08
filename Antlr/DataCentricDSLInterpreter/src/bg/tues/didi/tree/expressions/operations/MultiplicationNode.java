package bg.tues.didi.tree.expressions.operations;

import bg.tues.didi.Value;
import bg.tues.didi.tree.Node;

public class MultiplicationNode implements Node {
	private Node lhs;
	private Node rhs;

	public MultiplicationNode(Node lhs, Node rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Value evaluate() {

		Value a = lhs.evaluate();
		Value b = rhs.evaluate();

		// number * number
		if(a.isNumber() && b.isNumber()) {
			return new Value(a.asDouble() * b.asDouble());
		}

		throw new RuntimeException("Illegal expression: " + this);
	}

	@Override
	public String toString() {
		return String.format("(%s + %s)", lhs, rhs);
	}
}
