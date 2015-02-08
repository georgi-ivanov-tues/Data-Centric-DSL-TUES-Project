package bg.tues.didi.tree;

import bg.tues.didi.Value;

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
			throw new RuntimeException("Illegal boolean expression " + 
					"inside while-statement: " + value);
		}

		while(value.asBoolean()) {
			value = block.evaluate();
			if(value != Value.VOID) {
				return value;
			}
			value = condition.evaluate();
		}

		return Value.VOID;
	}
}
