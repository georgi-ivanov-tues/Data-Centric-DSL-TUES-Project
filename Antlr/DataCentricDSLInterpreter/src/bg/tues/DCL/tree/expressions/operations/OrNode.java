package bg.tues.DCL.tree.expressions.operations;

import bg.tues.DCL.Value;
import bg.tues.DCL.tree.Node;

public class OrNode implements Node{
	private Node lhs;
	private Node rhs;

	public OrNode(Node lhs, Node rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Value evaluate() {

		Value a = lhs.evaluate();
		Value b = rhs.evaluate();

		if(a.isBoolean() && b.isBoolean()) {
			return new Value(a.asBoolean() || b.asBoolean());
		}

		throw new RuntimeException("Illegal expression: " + this);
	}

	@Override
	public String toString() {
		return String.format("(%s < %s)", lhs, rhs);
	}
}