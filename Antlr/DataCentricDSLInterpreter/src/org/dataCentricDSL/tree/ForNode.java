package org.dataCentricDSL.tree;

import org.dataCentricDSL.Scope;
import org.dataCentricDSL.Value;

public class ForNode implements Node{
	
	String initVarName;
	Node initExpression;
	AssignmentNode initVar;
	
	Node condition;
	
	String afterthoughtVarName;
	Node aftExpression;
	AssignmentNode afterthoughtVar;
	
	Node block;
	Scope currentScope;
	
	public ForNode(String ident, Node exp, Node con, String aftIdent, Node aftExpress, Node bl, Scope curr) {
		currentScope = curr;
		
		initVarName = ident;
		initExpression = exp;
		initVar = new AssignmentNode(ident, initExpression, currentScope);
		
		condition = con;
		
		afterthoughtVarName = aftIdent;
		aftExpression = aftExpress;
		afterthoughtVar = new AssignmentNode(afterthoughtVarName, aftExpression, currentScope);
		
		block = bl;
		
	}
	
	@Override
	public Value evaluate() {
		initVar.evaluate();
		Value value = condition.evaluate();
		
		if(!value.isBoolean()) {
			throw new RuntimeException("illegal boolean expression " + 
					"inside for-statement: " + value);
		}
		
		for (initVar.evaluate(); condition.evaluate().asBoolean(); afterthoughtVar.evaluate()) {
			block.evaluate();
		}
		
		return Value.VOID;
	}
}
