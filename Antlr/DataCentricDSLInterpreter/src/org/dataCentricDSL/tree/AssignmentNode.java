package org.dataCentricDSL.tree;

import org.dataCentricDSL.Scope;
import org.dataCentricDSL.Value;

import java.util.ArrayList;
import java.util.List;

public class AssignmentNode implements Node {

	protected String identifier;
	protected List<Node> indexNodes;
	protected Node rhs;
	protected Scope scope;

	public AssignmentNode(String i, List<Node> e, Node n, Scope s) {
		identifier = i;
		indexNodes = (e == null) ? new ArrayList<Node>() : e;
		rhs = n;
		scope = s;
	}

	public AssignmentNode(String i, Node n, Scope s) {
		identifier = i;
		indexNodes = new ArrayList<Node>();
		rhs = n;
		scope = s;
	}

	@Override
	public Value evaluate() {

		Value value = rhs.evaluate();
		if (value == Value.VOID) {
			throw new RuntimeException("can't assign VOID to " + identifier);
		}

		if (indexNodes.isEmpty()) { // a simple assignment
			scope.assign(identifier, value);
		}
		else { // a possible list-lookup and reassignment

			Value list = scope.resolve(identifier);

			// iterate up to `foo[x][y]` in case of `foo[x][y][z] = 42;`
			for (int i = 0; i < indexNodes.size() - 1 && list != null; i++) {
				Value index = indexNodes.get(i).evaluate();

				if (!index.isNumber() || !list.isList()) { // sanity checks
					throw new RuntimeException("illegal statement: " + this);
				}

				int idx = index.asLong().intValue();
				list = list.asList().get(idx);
			}
			// list is now pointing to `foo[x][y]` in case of `foo[x][y][z] = 42;`

			// get the value `z`: the last index, in `foo[x][y][z] = 42;`
			Value lastIndex = indexNodes.get(indexNodes.size() - 1).evaluate();

			if (!lastIndex.isNumber() || !list.isList()) { // sanity checks
				throw new RuntimeException("illegal statement: " + this);
			}

			// re-assign `foo[x][y][z]`
			List<Value> existing = list.asList();
			existing.set(lastIndex.asLong().intValue(), value);
		}

		return Value.VOID;
	}

	@Override
	public String toString() {
		return String.format("(%s[%s] = %s)", identifier, indexNodes, rhs);
	}
}
