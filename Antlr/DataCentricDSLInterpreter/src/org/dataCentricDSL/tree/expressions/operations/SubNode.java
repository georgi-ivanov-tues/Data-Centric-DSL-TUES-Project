package org.dataCentricDSL.tree.expressions.operations;

import java.util.List;

import org.dataCentricDSL.Value;
import org.dataCentricDSL.tree.Node;

public class SubNode implements Node {
	private Node lhs;
	private Node rhs;

	public SubNode(Node lhs, Node rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Value evaluate() {

		Value a = lhs.evaluate();
		Value b = rhs.evaluate();

		// number - number
		if(a.isNumber() && b.isNumber()) {
			return new Value(a.asDouble() - b.asDouble());
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
