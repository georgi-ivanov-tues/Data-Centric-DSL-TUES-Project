package org.dataCentricDSL.tree;

import org.dataCentricDSL.Scope;
import org.dataCentricDSL.TLValue;

public class ForNode implements TLNode{
	
	String initVarName;
	TLNode initExpression;
	AssignmentNode initVar;
	
	TLNode condition;
	
	String afterthoughtVarName;
	TLNode aftExpression;
	AssignmentNode afterthoughtVar;
	
	TLNode block;
	Scope currentScope;
	
	public ForNode(String ident, TLNode exp, TLNode con, String aftIdent, TLNode aftExpress, TLNode bl, Scope curr) {
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
	public TLValue evaluate() {
		initVar.evaluate();
		TLValue value = condition.evaluate();
		
		if(!value.isBoolean()) {
			throw new RuntimeException("illegal boolean expression " + 
					"inside for-statement: " + value);
		}
		
		for (initVar.evaluate(); condition.evaluate().asBoolean(); afterthoughtVar.evaluate()) {
			block.evaluate();
		}
		
		return TLValue.VOID;
	}
}
