package bg.tues.didi.tree.expressions.operations;

import bg.tues.didi.Value;
import bg.tues.didi.tree.Node;

public class AndNode implements Node{

	private Node lhs;
	private Node rhs;

	public AndNode(Node lhs, Node rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Value evaluate() {

		Value a = lhs.evaluate();
		Value b = rhs.evaluate();

		if(a.isBoolean() && b.isBoolean()) {
			return new Value(a.asBoolean() && b.asBoolean());
		}

		throw new RuntimeException("Illegal expression: " + this);
	}

	@Override
	public String toString() {
		return String.format("(%s && %s)", lhs, rhs);
	}
}
