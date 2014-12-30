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
	protected AbstractElementAlias match_IfStatement___ElseKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_p;
	protected AbstractElementAlias match_Print_PrintKeyword_0_q;
	protected AbstractElementAlias match_Print_Query_QueryKeyword_0_q_or___PrintKeyword_0_QueryKeyword_0_q__;
	protected AbstractElementAlias match_Query_QueryKeyword_0_q;
	protected AbstractElementAlias match_SwitchStatement___DefaultKeyword_7_0_ColonKeyword_7_1__q;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XImportDeclaration_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DataCentricDSLGrammarAccess) access;
		match_IfStatement___ElseKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getIfStatementAccess().getElseKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_7_3()));
		match_Primary_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
		match_Primary_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
		match_Print_PrintKeyword_0_q = new TokenAlias(false, true, grammarAccess.getPrintAccess().getPrintKeyword_0());
		match_Print_Query_QueryKeyword_0_q_or___PrintKeyword_0_QueryKeyword_0_q__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrintAccess().getPrintKeyword_0()), new TokenAlias(false, true, grammarAccess.getQueryAccess().getQueryKeyword_0())), new TokenAlias(false, true, grammarAccess.getQueryAccess().getQueryKeyword_0()));
		match_Query_QueryKeyword_0_q = new TokenAlias(false, true, grammarAccess.getQueryAccess().getQueryKeyword_0());
		match_SwitchStatement___DefaultKeyword_7_0_ColonKeyword_7_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSwitchStatementAccess().getDefaultKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getSwitchStatementAccess().getColonKeyword_7_1()));
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
		else if(ruleCall.getRule() == grammarAccess.getOpAssignmentRule())
			return getOpAssignmentToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
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
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_IfStatement___ElseKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q.equals(syntax))
				emit_IfStatement___ElseKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Print_PrintKeyword_0_q.equals(syntax))
				emit_Print_PrintKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Print_Query_QueryKeyword_0_q_or___PrintKeyword_0_QueryKeyword_0_q__.equals(syntax))
				emit_Print_Query_QueryKeyword_0_q_or___PrintKeyword_0_QueryKeyword_0_q__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Query_QueryKeyword_0_q.equals(syntax))
				emit_Query_QueryKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SwitchStatement___DefaultKeyword_7_0_ColonKeyword_7_1__q.equals(syntax))
				emit_SwitchStatement___DefaultKeyword_7_0_ColonKeyword_7_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     ('else ' '{' '}')?
	 */
	protected void emit_IfStatement___ElseKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'print'?
	 */
	protected void emit_Print_PrintKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('print' 'query'?) | 'query'?
	 */
	protected void emit_Print_Query_QueryKeyword_0_q_or___PrintKeyword_0_QueryKeyword_0_q__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'query'?
	 */
	protected void emit_Query_QueryKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('default' ':')?
	 */
	protected void emit_SwitchStatement___DefaultKeyword_7_0_ColonKeyword_7_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
