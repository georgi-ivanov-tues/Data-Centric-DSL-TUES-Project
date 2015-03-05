package bg.tues.didi.tree.expressions.operations;

import bg.tues.didi.Value;
import bg.tues.didi.tree.Node;

public class BoolNegationNode implements Node {
	
	private Node operand;

	public BoolNegationNode(Node operand) {
		this.operand = operand;
	}

	@Override
	public Value evaluate() {
		
		Value a = operand.evaluate();
		
		if(a.isBoolean()) {
			return new Value(!a.asBoolean());
		}
		
		throw new RuntimeException("Illegal expression: " + this);
	}

	@Override
	public String toString() {
		return String.format("!%s", operand);
	}
}
