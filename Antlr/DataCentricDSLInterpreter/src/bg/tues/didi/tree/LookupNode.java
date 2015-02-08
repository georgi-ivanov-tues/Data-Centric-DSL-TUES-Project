package bg.tues.didi.tree;

import bg.tues.didi.Value;

import java.util.ArrayList;
import java.util.List;

public class LookupNode implements Node {

	public Node expression;
	public List<Node> indexes;

	public LookupNode(Node e, List<Node> i) {
		expression = e;
		indexes = i;
	}

	@Override
	public Value evaluate() {
		Value value = expression.evaluate();

		List<Value> indexValues = new ArrayList<Value>();

		for (Node indexNode : indexes) {
			indexValues.add(indexNode.evaluate());
		}

		for(Value index : indexValues) {

			if(!index.isNumber() || !(value.isList() || value.isString())) {
				throw new RuntimeException("Illegal expression: " + expression + "[" + index + "]");
			}

			int idx = index.asLong().intValue();

			if(value.isList()) {
				value = value.asList().get(idx);
			}
			else if(value.isString()) {
				value = new Value(String.valueOf(value.asString().charAt(idx)));
			}
		}

		return value;
	}
}

