package bg.tues.DCL.tree;

import bg.tues.DCL.Value;

public class WhileNode implements Node {

	Node condition;
	Node block;

	public WhileNode(Node con, Node bl) {
		condition = con;
		block = bl;
	}

	@Override
	public Value evaluate() {
		Value value = condition.evaluate();

		if(!value.isBoolean()) {
			throw new RuntimeException("illegal boolean expression " + 
					"inside while-statement: " + value);
		}

		while(value.asBoolean()) {
			block.evaluate();
			value = condition.evaluate();
		}

		return Value.VOID;
	}

}
