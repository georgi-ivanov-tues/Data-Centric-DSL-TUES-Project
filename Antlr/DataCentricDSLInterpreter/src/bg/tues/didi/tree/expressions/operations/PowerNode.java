package bg.tues.didi.tree.expressions.operations;

import bg.tues.didi.Value;
import bg.tues.didi.tree.Node;

public class PowerNode implements Node {
	private Node lhs;
	private Node rhs;
	
	public PowerNode(Node lhs, Node rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Value evaluate() {
		
		Value a = lhs.evaluate();
		Value b = rhs.evaluate();
		
		if(a.isNumber() && b.isNumber()) {
			return new Value(Math.pow(a.asDouble(), b.asDouble()));
		}
		
		return null;
	}

	@Override
	public String toString() {
		return String.format("(%s ^ %s)", lhs, rhs);
	}
}
