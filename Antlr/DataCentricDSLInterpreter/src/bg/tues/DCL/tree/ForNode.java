package bg.tues.DCL.tree;

import bg.tues.DCL.Scope;
import bg.tues.DCL.Value;

public class ForNode implements Node{
	
	Node initExpression;
	Node condition;
	Node aftExpression;
	
	Node block;
	Scope currentScope;
	
	public ForNode(Node exp, Node con, Node aftExpress, Node bl, Scope curr) {
		initExpression = exp;
		condition = con;
		aftExpression = aftExpress;

		currentScope = curr;
		block = bl;
	}
	
	@Override
	public Value evaluate() {
		initExpression.evaluate();
		// do we need this?
		Value value = condition.evaluate();
		
		if(!value.isBoolean()) {
			throw new RuntimeException("Illegal boolean expression " + 
					"inside for-statement: " + value);
		}

		for (initExpression.evaluate(); condition.evaluate().asBoolean(); aftExpression.evaluate()) {
			value = block.evaluate();
			if(value != Value.VOID) {
				return value;
			}
		}
		
		return Value.VOID;
	}
}
