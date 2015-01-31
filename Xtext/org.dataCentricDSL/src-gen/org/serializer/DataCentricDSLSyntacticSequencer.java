package org.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.services.DataCentricDSLGrammarAccess;

@SuppressWarnings("all")
public class DataCentricDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DataCentricDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_IfStatement___ElseParserRuleCall_9_0_OpeningCurlyBracketParserRuleCall_9_1_ClosingCurlyBracketParserRuleCall_9_3__q;
	protected AbstractElementAlias match_Primary_OpeningBracketParserRuleCall_3_0_a;
	protected AbstractElementAlias match_Primary_OpeningBracketParserRuleCall_3_0_p;
	protected AbstractElementAlias match_PrintFunction_PrintParserRuleCall_0_0_or_PrintlnParserRuleCall_0_1;
	protected AbstractElementAlias match_StatementCondition_OpAndParserRuleCall_1_0_0_or_OpOrParserRuleCall_1_0_1;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XImportDeclaration_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DataCentricDSLGrammarAccess) access;
		match_IfStatement___ElseParserRuleCall_9_0_OpeningCurlyBracketParserRuleCall_9_1_ClosingCurlyBracketParserRuleCall_9_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getIfStatementAccess().getElseParserRuleCall_9_0()), new TokenAlias(false, false, grammarAccess.getIfStatementAccess().getOpeningCurlyBracketParserRuleCall_9_1()), new TokenAlias(false, false, grammarAccess.getIfStatementAccess().getClosingCurlyBracketParserRuleCall_9_3()));
		match_Primary_OpeningBracketParserRuleCall_3_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getOpeningBracketParserRuleCall_3_0());
		match_Primary_OpeningBracketParserRuleCall_3_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getOpeningBracketParserRuleCall_3_0());
		match_PrintFunction_PrintParserRuleCall_0_0_or_PrintlnParserRuleCall_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrintFunctionAccess().getPrintParserRuleCall_0_0()), new TokenAlias(false, false, grammarAccess.getPrintFunctionAccess().getPrintlnParserRuleCall_0_1()));
		match_StatementCondition_OpAndParserRuleCall_1_0_0_or_OpOrParserRuleCall_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementConditionAccess().getOpAndParserRuleCall_1_0_0()), new TokenAlias(false, false, grammarAccess.getStatementConditionAccess().getOpOrParserRuleCall_1_0_1()));
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XImportDeclaration_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getArrayBracketsRule())
			return getArrayBracketsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getClosingBracketRule())
			return getClosingBracketToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getClosingCurlyBracketRule())
			return getClosingCurlyBracketToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCommaRule())
			return getCommaToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getElseRule())
			return getElseToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getElseIfRule())
			return getElseIfToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getForRule())
			return getForToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFuncRule())
			return getFuncToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getGlobalRule())
			return getGlobalToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIfRule())
			return getIfToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpAdditionRule())
			return getOpAdditionToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpAndRule())
			return getOpAndToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpAssignmentRule())
			return getOpAssignmentToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpCompareRule())
			return getOpCompareToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpDivisionRule())
			return getOpDivisionToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpModRule())
			return getOpModToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpMultiplicationRule())
			return getOpMultiplicationToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpOrRule())
			return getOpOrToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpSubstractionRule())
			return getOpSubstractionToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpeningBracketRule())
			return getOpeningBracketToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpeningCurlyBracketRule())
			return getOpeningCurlyBracketToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPrintRule())
			return getPrintToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPrintlnRule())
			return getPrintlnToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getQueryRule())
			return getQueryToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSemicolonRule())
			return getSemicolonToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWhileRule())
			return getWhileToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArrayBrackets :
	 * 	'[' ']'
	 * ;
	 */
	protected String getArrayBracketsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[]";
	}
	
	/**
	 * ClosingBracket:
	 * 	')'
	 * ;
	 */
	protected String getClosingBracketToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * ClosingCurlyBracket:
	 * 	'}'
	 * ;
	 */
	protected String getClosingCurlyBracketToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * Comma:
	 * 	','
	 * ;
	 */
	protected String getCommaToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * Else:
	 * 	'else'
	 * ;
	 */
	protected String getElseToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "else";
	}
	
	/**
	 * ElseIf:
	 * 	Else If
	 * ;
	 */
	protected String getElseIfToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "elseif";
	}
	
	/**
	 * For:
	 * 	'for'
	 * ;
	 */
	protected String getForToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "for";
	}
	
	/**
	 * Func:
	 * 	'func'
	 * ;
	 */
	protected String getFuncToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "func";
	}
	
	/**
	 * Global:
	 * 	'global'
	 * ;
	 */
	protected String getGlobalToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "global";
	}
	
	/**
	 * If:
	 * 	'if'
	 * ;
	 */
	protected String getIfToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "if";
	}
	
	/**
	 * OpAddition:
	 * 	'+'
	 * ;
	 */
	protected String getOpAdditionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * OpAnd:
	 * 	'&&'
	 * ;
	 */
	protected String getOpAndToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&&";
	}
	
	/**
	 * OpAssignment:
	 * 	'='
	 * ;
	 */
	protected String getOpAssignmentToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * OpCompare:
	 * 	('>' |
	 * 	'<' |
	 * 	'==' |
	 * 	'<=' |
	 * 	'>=' |
	 * 	'!=')
	 * ;
	 */
	protected String getOpCompareToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * OpDivision:
	 * 	'/'
	 * ;
	 */
	protected String getOpDivisionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/";
	}
	
	/**
	 * OpMod:
	 * 	'%'
	 * ;
	 */
	protected String getOpModToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%";
	}
	
	/**
	 * OpMultiplication:
	 * 	'*'
	 * ;
	 */
	protected String getOpMultiplicationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	/**
	 * OpOr:
	 * 	'||'
	 * ;
	 */
	protected String getOpOrToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "||";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * OpSubstraction:
	 * 	'-'
	 * ;
	 */
	protected String getOpSubstractionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	/**
	 * OpeningBracket:
	 * 	'('
	 * ;
	 */
	protected String getOpeningBracketToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * OpeningCurlyBracket:
	 * 	'{'
	 * ;
	 */
	protected String getOpeningCurlyBracketToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * Print:
	 * 	'print'
	 * ;
	 */
	protected String getPrintToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "print";
	}
	
	/**
	 * Println:
	 * 	'println'
	 * ;
	 */
	protected String getPrintlnToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "println";
	}
	
	/**
	 * Query:
	 * 	'query'
	 * ;
	 */
	protected String getQueryToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "query";
	}
	
	/**
	 * Semicolon:
	 * 	';'
	 * ;
	 */
	protected String getSemicolonToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * While:
	 * 	'while'
	 * ;
	 */
	protected String getWhileToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "while";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_IfStatement___ElseParserRuleCall_9_0_OpeningCurlyBracketParserRuleCall_9_1_ClosingCurlyBracketParserRuleCall_9_3__q.equals(syntax))
				emit_IfStatement___ElseParserRuleCall_9_0_OpeningCurlyBracketParserRuleCall_9_1_ClosingCurlyBracketParserRuleCall_9_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_OpeningBracketParserRuleCall_3_0_a.equals(syntax))
				emit_Primary_OpeningBracketParserRuleCall_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_OpeningBracketParserRuleCall_3_0_p.equals(syntax))
				emit_Primary_OpeningBracketParserRuleCall_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrintFunction_PrintParserRuleCall_0_0_or_PrintlnParserRuleCall_0_1.equals(syntax))
				emit_PrintFunction_PrintParserRuleCall_0_0_or_PrintlnParserRuleCall_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StatementCondition_OpAndParserRuleCall_1_0_0_or_OpOrParserRuleCall_1_0_1.equals(syntax))
				emit_StatementCondition_OpAndParserRuleCall_1_0_0_or_OpOrParserRuleCall_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XImportDeclaration_SemicolonKeyword_2_q.equals(syntax))
				emit_XImportDeclaration_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (Else OpeningCurlyBracket ClosingCurlyBracket)?
	 */
	protected void emit_IfStatement___ElseParserRuleCall_9_0_OpeningCurlyBracketParserRuleCall_9_1_ClosingCurlyBracketParserRuleCall_9_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     OpeningBracket*
	 */
	protected void emit_Primary_OpeningBracketParserRuleCall_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     OpeningBracket+
	 */
	protected void emit_Primary_OpeningBracketParserRuleCall_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Print | Println
	 */
	protected void emit_PrintFunction_PrintParserRuleCall_0_0_or_PrintlnParserRuleCall_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     OpAnd | OpOr
	 */
	protected void emit_StatementCondition_OpAndParserRuleCall_1_0_0_or_OpOrParserRuleCall_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XImportDeclaration_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
