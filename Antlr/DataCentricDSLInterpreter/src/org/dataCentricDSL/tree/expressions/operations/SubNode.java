package org.dataCentricDSL.tree.expressions.operations;

import java.util.List;

import org.dataCentricDSL.TLValue;
import org.dataCentricDSL.tree.TLNode;

public class SubNode implements TLNode {
	private TLNode lhs;
	private TLNode rhs;

	public SubNode(TLNode lhs, TLNode rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public TLValue evaluate() {

		TLValue a = lhs.evaluate();
		TLValue b = rhs.evaluate();

		// number - number
		if(a.isNumber() && b.isNumber()) {
			return new TLValue(a.asDouble() - b.asDouble());
		}

		//	    // list - any
		//	    if(a.isList()) {
		//	      List<TLValue> list = a.asList();
		//	      list.add(b);
		//	      return new TLValue(list);
		//	    }

		throw new RuntimeException("illegal expression: " + this);
	}

	@Override
	public String toString() {
		return String.format("(%s + %s)", lhs, rhs);
	}
}
