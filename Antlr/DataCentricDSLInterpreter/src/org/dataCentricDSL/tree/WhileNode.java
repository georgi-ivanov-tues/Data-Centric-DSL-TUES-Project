package org.dataCentricDSL.tree;

import org.dataCentricDSL.TLValue;

public class WhileNode implements TLNode {

	TLNode condition;
	TLNode block;

	public WhileNode(TLNode con, TLNode bl) {
		condition = con;
		block = bl;
	}

	@Override
	public TLValue evaluate() {
		TLValue value = condition.evaluate();

		if(!value.isBoolean()) {
			throw new RuntimeException("illegal boolean expression " + 
					"inside while-statement: " + value);
		}

		while(value.asBoolean()) {
			block.evaluate();
			value = condition.evaluate();
		}

		return TLValue.VOID;
	}

}
