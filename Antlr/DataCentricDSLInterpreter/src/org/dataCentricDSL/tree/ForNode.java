package org.dataCentricDSL.tree;

import org.dataCentricDSL.Scope;
import org.dataCentricDSL.TLValue;

import antlr.ASdebug.ASDebugStream;

public class ForNode implements TLNode{

	TLNode initialization;
	TLNode condition;
	TLNode afterthought;
	TLNode block;
	
	TLValue var;
	TLNode expression;
	Scope currentScope;
	
	public ForNode(String ident, TLNode ini, TLNode con, TLNode aft, TLNode bl, Scope curr) {
//		var = ident;		
		initialization = ini;
		condition = con;
		afterthought = aft;
		block = bl;
		currentScope = curr;
	}
	
	public ForNode(String ident, TLNode exp, TLNode con, TLNode bl, Scope curr) {
		expression = exp;
		condition = con;
		block = bl;
		
		var = new AssignmentNode(ident, exp, currentScope).evaluate();
//		var = new IdentifierNode(ident, currentScope);
	}

	@Override
	public TLValue evaluate() {
		
//		System.out.println(initialization.evaluate());
		
		TLValue value = condition.evaluate();
		
		if(!value.isBoolean()) {
			throw new RuntimeException("illegal boolean expression " + 
					"inside while-statement: " + value);
		}
		
		while(value.isBoolean()){
			//block.evaluate();
//			System.out.println(afterthought.evaluate());
			value = condition.evaluate();
//			System.out.println(value.isBoolean());
		}
		
//		TLValue value = condition.evaluate();
//
//		if(!value.isBoolean()) {
//			throw new RuntimeException("illegal boolean expression " + 
//					"inside while-statement: " + value);
//		}
//		
//		System.out.println(initialization.evaluate());
//		System.out.println(value.asBoolean());
//		System.out.println(afterthought.evaluate());
//		
//		for(initialization.evaluate(); value.asBoolean(); afterthought.evaluate()){
//			block.evaluate();
//		}
		
		return TLValue.VOID;
	}
}
