package bg.tues.didi.tree.expressions.operations;

import bg.tues.didi.Value;
import bg.tues.didi.tree.Node;

public class ModNode implements Node {
	private Node lhs;
	private Node rhs;

	public ModNode(Node lhs, Node rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Value evaluate() {

		Value a = lhs.evaluate();
		Value b = rhs.evaluate();

		// number / number
		if(a.isNumber() && b.isNumber()) {
			if(b.asDouble() == 0){
				throw new RuntimeException("Division by zero: " + this);
			}
			return new Value(a.asDouble() % b.asDouble());
		}

		throw new RuntimeException("Illegal expression: " + this);
	}

	@Override
	public String toString() {
		return String.format("(%s mod %s)", lhs, rhs);
	}
}
