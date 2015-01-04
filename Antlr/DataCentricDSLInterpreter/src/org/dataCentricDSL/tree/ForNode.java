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
	
//	public ForNode(String ident, TLNode ini, TLNode con, TLNode aft, TLNode bl, Scope curr) {
//		var = ident;		
//		initialization = ini;
//		condition = con;
//		afterthought = aft;
//		block = bl;
//		currentScope = curr;
//	}
	
	public ForNode(String ident, TLNode exp, TLNode con, TLNode bl, Scope curr) {
		initVarName = ident;
		initExpression = exp;
		condition = con;
		block = bl;
		currentScope = curr;
		
		initVar = new AssignmentNode(ident, initExpression, currentScope);
	}
	
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
					"inside while-statement: " + value);
		}
		
//		System.out.println(initExpression.evaluate());
//		System.out.println(afterthoughtVar.evaluate());
		
//		afterthoughtVar = new AssignmentNode(afterthoughtVarName, new AtomNode(aftExpression.evaluate().asDouble() + new AtomNode(afterthoughtVar.evaluate()).evaluate().asDouble()), currentScope);
		
//		System.out.println("aftName = " + afterthoughtVarName);
//		System.out.println("aftExpr = " + aftExpression.evaluate());
//		System.out.println("aftVar = " + afterthoughtVar.evaluate());
		
//		while(value.asBoolean()){
//			block.evaluate();
//			afterthoughtVar = new AssignmentNode(afterthoughtVarName, new AtomNode(aftExpression.evaluate().asDouble() + new AtomNode(afterthoughtVar).evaluate().asDouble()), currentScope);
//			afterthoughtVar.evaluate();
//			initVar.evaluate();
//			value = condition.evaluate();
//		}
		
		double counter = 1.0;
		while(value.asBoolean()){
			block.evaluate();
			initVar = new AssignmentNode(initVarName, new AtomNode(initExpression.evaluate().asDouble() + new AtomNode(counter).evaluate().asDouble()), currentScope);
			initVar.evaluate();
			value = condition.evaluate();
			counter++;
		}
		
		return TLValue.VOID;
	}
}
