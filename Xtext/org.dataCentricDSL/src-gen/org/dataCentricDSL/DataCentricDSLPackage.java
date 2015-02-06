/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.dataCentricDSL.DataCentricDSLFactory
 * @model kind="package"
 * @generated
 */
public interface DataCentricDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dataCentricDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.DataCentricDSL.org";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dataCentricDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DataCentricDSLPackage eINSTANCE = org.dataCentricDSL.impl.DataCentricDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.DataCentricDSLImpl <em>Data Centric DSL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.DataCentricDSLImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getDataCentricDSL()
   * @generated
   */
  int DATA_CENTRIC_DSL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CENTRIC_DSL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Data Centric DSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CENTRIC_DSL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.StatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.SimpleStatementImpl <em>Simple Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.SimpleStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getSimpleStatement()
   * @generated
   */
  int SIMPLE_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>Simple Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.VariableDefinitionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableDefinition()
   * @generated
   */
  int VARIABLE_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Is Global</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_GLOBAL = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__NAME = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variable Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VARIABLE_VALUE = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.VariableParamImpl <em>Variable Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.VariableParamImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableParam()
   * @generated
   */
  int VARIABLE_PARAM = 4;

  /**
   * The number of structural features of the '<em>Variable Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.QueryFunctionImpl <em>Query Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.QueryFunctionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getQueryFunction()
   * @generated
   */
  int QUERY_FUNCTION = 5;

  /**
   * The feature id for the '<em><b>Query Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FUNCTION__QUERY_PARAM = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Query Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FUNCTION_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.PrintFunctionImpl <em>Print Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.PrintFunctionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getPrintFunction()
   * @generated
   */
  int PRINT_FUNCTION = 6;

  /**
   * The feature id for the '<em><b>Print Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_FUNCTION__PRINT_PARAM = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Print Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_FUNCTION_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.PrintParamImpl <em>Print Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.PrintParamImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getPrintParam()
   * @generated
   */
  int PRINT_PARAM = 7;

  /**
   * The number of structural features of the '<em>Print Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_PARAM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.FunctionCallImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 8;

  /**
   * The feature id for the '<em><b>Called Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__CALLED_FUNCTION_NAME = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__ARGUMENTS = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.ExpressionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 10;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = VARIABLE_PARAM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.VariableCallImpl <em>Variable Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.VariableCallImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableCall()
   * @generated
   */
  int VARIABLE_CALL = 9;

  /**
   * The feature id for the '<em><b>Called Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__CALLED_VARIABLE_NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.CompoundStatementImpl <em>Compound Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.CompoundStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getCompoundStatement()
   * @generated
   */
  int COMPOUND_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Compound Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.FunctionDefinitionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getFunctionDefinition()
   * @generated
   */
  int FUNCTION_DEFINITION = 12;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__STATEMENTS = COMPOUND_STATEMENT__STATEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__NAME = COMPOUND_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__ARGUMENTS = COMPOUND_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION_FEATURE_COUNT = COMPOUND_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.ReturnStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__RETURN_VALUE = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.IfStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__STATEMENTS = COMPOUND_STATEMENT__STATEMENTS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__CONDITION = COMPOUND_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = COMPOUND_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.WhileStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 15;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__STATEMENTS = COMPOUND_STATEMENT__STATEMENTS;

  /**
   * The feature id for the '<em><b>While Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__WHILE_CONDITION = COMPOUND_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = COMPOUND_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.ForStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getForStatement()
   * @generated
   */
  int FOR_STATEMENT = 16;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__STATEMENTS = COMPOUND_STATEMENT__STATEMENTS;

  /**
   * The feature id for the '<em><b>For Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FOR_VAR = COMPOUND_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>For Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FOR_CONDITION = COMPOUND_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__OPERATION = COMPOUND_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = COMPOUND_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.ConditionStatementImpl <em>Condition Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.ConditionStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getConditionStatement()
   * @generated
   */
  int CONDITION_STATEMENT = 17;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_STATEMENT__CONDITIONS = PRINT_PARAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Condition Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_STATEMENT_FEATURE_COUNT = PRINT_PARAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.ConditionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 18;

  /**
   * The feature id for the '<em><b>Condition Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION_ELEMENTS = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OP = 1;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.ConditionElementImpl <em>Condition Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.ConditionElementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getConditionElement()
   * @generated
   */
  int CONDITION_ELEMENT = 19;

  /**
   * The number of structural features of the '<em>Condition Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.PostfixOperationImpl <em>Postfix Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.PostfixOperationImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getPostfixOperation()
   * @generated
   */
  int POSTFIX_OPERATION = 20;

  /**
   * The feature id for the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_OPERATION__CALL = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_OPERATION__OP = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Postfix Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_OPERATION_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.StringLiteralImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.NumberLiteralImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.BooleanValueImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = VARIABLE_PARAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = VARIABLE_PARAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.AdditionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.SubstractionImpl <em>Substraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.SubstractionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getSubstraction()
   * @generated
   */
  int SUBSTRACTION = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTRACTION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTRACTION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Substraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTRACTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.MultiplicationImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.DivisionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.ModImpl <em>Mod</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.ModImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getMod()
   * @generated
   */
  int MOD = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mod</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.DataCentricDSL <em>Data Centric DSL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Centric DSL</em>'.
   * @see org.dataCentricDSL.DataCentricDSL
   * @generated
   */
  EClass getDataCentricDSL();

  /**
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.DataCentricDSL#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.dataCentricDSL.DataCentricDSL#getElements()
   * @see #getDataCentricDSL()
   * @generated
   */
  EReference getDataCentricDSL_Elements();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.dataCentricDSL.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.SimpleStatement <em>Simple Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Statement</em>'.
   * @see org.dataCentricDSL.SimpleStatement
   * @generated
   */
  EClass getSimpleStatement();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see org.dataCentricDSL.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.VariableDefinition#isIsGlobal <em>Is Global</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Global</em>'.
   * @see org.dataCentricDSL.VariableDefinition#isIsGlobal()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsGlobal();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.VariableDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.dataCentricDSL.VariableDefinition#getName()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.VariableDefinition#getVariableValue <em>Variable Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Value</em>'.
   * @see org.dataCentricDSL.VariableDefinition#getVariableValue()
   * @see #getVariableDefinition()
   * @generated
   */
  EReference getVariableDefinition_VariableValue();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.VariableParam <em>Variable Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Param</em>'.
   * @see org.dataCentricDSL.VariableParam
   * @generated
   */
  EClass getVariableParam();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.QueryFunction <em>Query Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Function</em>'.
   * @see org.dataCentricDSL.QueryFunction
   * @generated
   */
  EClass getQueryFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.QueryFunction#getQueryParam <em>Query Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query Param</em>'.
   * @see org.dataCentricDSL.QueryFunction#getQueryParam()
   * @see #getQueryFunction()
   * @generated
   */
  EReference getQueryFunction_QueryParam();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.PrintFunction <em>Print Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print Function</em>'.
   * @see org.dataCentricDSL.PrintFunction
   * @generated
   */
  EClass getPrintFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.PrintFunction#getPrintParam <em>Print Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Print Param</em>'.
   * @see org.dataCentricDSL.PrintFunction#getPrintParam()
   * @see #getPrintFunction()
   * @generated
   */
  EReference getPrintFunction_PrintParam();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.PrintParam <em>Print Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print Param</em>'.
   * @see org.dataCentricDSL.PrintParam
   * @generated
   */
  EClass getPrintParam();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see org.dataCentricDSL.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.FunctionCall#getCalledFunctionName <em>Called Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Called Function Name</em>'.
   * @see org.dataCentricDSL.FunctionCall#getCalledFunctionName()
   * @see #getFunctionCall()
   * @generated
   */
  EAttribute getFunctionCall_CalledFunctionName();

  /**
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.FunctionCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.dataCentricDSL.FunctionCall#getArguments()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Arguments();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.VariableCall <em>Variable Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Call</em>'.
   * @see org.dataCentricDSL.VariableCall
   * @generated
   */
  EClass getVariableCall();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.VariableCall#getCalledVariableName <em>Called Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Called Variable Name</em>'.
   * @see org.dataCentricDSL.VariableCall#getCalledVariableName()
   * @see #getVariableCall()
   * @generated
   */
  EAttribute getVariableCall_CalledVariableName();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.dataCentricDSL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.CompoundStatement <em>Compound Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Statement</em>'.
   * @see org.dataCentricDSL.CompoundStatement
   * @generated
   */
  EClass getCompoundStatement();

  /**
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.CompoundStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.dataCentricDSL.CompoundStatement#getStatements()
   * @see #getCompoundStatement()
   * @generated
   */
  EReference getCompoundStatement_Statements();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Definition</em>'.
   * @see org.dataCentricDSL.FunctionDefinition
   * @generated
   */
  EClass getFunctionDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.FunctionDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.dataCentricDSL.FunctionDefinition#getName()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.dataCentricDSL.FunctionDefinition#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Arguments</em>'.
   * @see org.dataCentricDSL.FunctionDefinition#getArguments()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Arguments();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see org.dataCentricDSL.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.ReturnStatement#getReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Value</em>'.
   * @see org.dataCentricDSL.ReturnStatement#getReturnValue()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_ReturnValue();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see org.dataCentricDSL.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.IfStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition</em>'.
   * @see org.dataCentricDSL.IfStatement#getCondition()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Condition();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see org.dataCentricDSL.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.WhileStatement#getWhileCondition <em>While Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While Condition</em>'.
   * @see org.dataCentricDSL.WhileStatement#getWhileCondition()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_WhileCondition();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see org.dataCentricDSL.ForStatement
   * @generated
   */
  EClass getForStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.ForStatement#getForVar <em>For Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Var</em>'.
   * @see org.dataCentricDSL.ForStatement#getForVar()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_ForVar();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.ForStatement#getForCondition <em>For Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Condition</em>'.
   * @see org.dataCentricDSL.ForStatement#getForCondition()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_ForCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.ForStatement#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see org.dataCentricDSL.ForStatement#getOperation()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Operation();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.ConditionStatement <em>Condition Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Statement</em>'.
   * @see org.dataCentricDSL.ConditionStatement
   * @generated
   */
  EClass getConditionStatement();

  /**
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.ConditionStatement#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see org.dataCentricDSL.ConditionStatement#getConditions()
   * @see #getConditionStatement()
   * @generated
   */
  EReference getConditionStatement_Conditions();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.dataCentricDSL.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.Condition#getConditionElements <em>Condition Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition Elements</em>'.
   * @see org.dataCentricDSL.Condition#getConditionElements()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ConditionElements();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.Condition#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.dataCentricDSL.Condition#getOp()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Op();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.ConditionElement <em>Condition Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Element</em>'.
   * @see org.dataCentricDSL.ConditionElement
   * @generated
   */
  EClass getConditionElement();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.PostfixOperation <em>Postfix Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Postfix Operation</em>'.
   * @see org.dataCentricDSL.PostfixOperation
   * @generated
   */
  EClass getPostfixOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.PostfixOperation#getCall <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Call</em>'.
   * @see org.dataCentricDSL.PostfixOperation#getCall()
   * @see #getPostfixOperation()
   * @generated
   */
  EReference getPostfixOperation_Call();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.PostfixOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.dataCentricDSL.PostfixOperation#getOp()
   * @see #getPostfixOperation()
   * @generated
   */
  EAttribute getPostfixOperation_Op();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.dataCentricDSL.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.dataCentricDSL.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see org.dataCentricDSL.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.dataCentricDSL.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see org.dataCentricDSL.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.BooleanValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.dataCentricDSL.BooleanValue#getValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition</em>'.
   * @see org.dataCentricDSL.Addition
   * @generated
   */
  EClass getAddition();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.Addition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.dataCentricDSL.Addition#getLeft()
   * @see #getAddition()
   * @generated
   */
  EReference getAddition_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.Addition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.dataCentricDSL.Addition#getRight()
   * @see #getAddition()
   * @generated
   */
  EReference getAddition_Right();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.Substraction <em>Substraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Substraction</em>'.
   * @see org.dataCentricDSL.Substraction
   * @generated
   */
  EClass getSubstraction();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.Substraction#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.dataCentricDSL.Substraction#getLeft()
   * @see #getSubstraction()
   * @generated
   */
  EReference getSubstraction_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.Substraction#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.dataCentricDSL.Substraction#getRight()
   * @see #getSubstraction()
   * @generated
   */
  EReference getSubstraction_Right();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see org.dataCentricDSL.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.Multiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.dataCentricDSL.Multiplication#getLeft()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.Multiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.dataCentricDSL.Multiplication#getRight()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Right();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see org.dataCentricDSL.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.dataCentricDSL.Division#getLeft()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.dataCentricDSL.Division#getRight()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Right();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.Mod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod</em>'.
   * @see org.dataCentricDSL.Mod
   * @generated
   */
  EClass getMod();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.Mod#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.dataCentricDSL.Mod#getLeft()
   * @see #getMod()
   * @generated
   */
  EReference getMod_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.Mod#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.dataCentricDSL.Mod#getRight()
   * @see #getMod()
   * @generated
   */
  EReference getMod_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DataCentricDSLFactory getDataCentricDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.DataCentricDSLImpl <em>Data Centric DSL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.DataCentricDSLImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getDataCentricDSL()
     * @generated
     */
    EClass DATA_CENTRIC_DSL = eINSTANCE.getDataCentricDSL();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CENTRIC_DSL__ELEMENTS = eINSTANCE.getDataCentricDSL_Elements();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.StatementImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.SimpleStatementImpl <em>Simple Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.SimpleStatementImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getSimpleStatement()
     * @generated
     */
    EClass SIMPLE_STATEMENT = eINSTANCE.getSimpleStatement();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.VariableDefinitionImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableDefinition()
     * @generated
     */
    EClass VARIABLE_DEFINITION = eINSTANCE.getVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Is Global</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__IS_GLOBAL = eINSTANCE.getVariableDefinition_IsGlobal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__NAME = eINSTANCE.getVariableDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Variable Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEFINITION__VARIABLE_VALUE = eINSTANCE.getVariableDefinition_VariableValue();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.VariableParamImpl <em>Variable Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.VariableParamImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableParam()
     * @generated
     */
    EClass VARIABLE_PARAM = eINSTANCE.getVariableParam();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.QueryFunctionImpl <em>Query Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.QueryFunctionImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getQueryFunction()
     * @generated
     */
    EClass QUERY_FUNCTION = eINSTANCE.getQueryFunction();

    /**
     * The meta object literal for the '<em><b>Query Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_FUNCTION__QUERY_PARAM = eINSTANCE.getQueryFunction_QueryParam();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.PrintFunctionImpl <em>Print Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.PrintFunctionImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getPrintFunction()
     * @generated
     */
    EClass PRINT_FUNCTION = eINSTANCE.getPrintFunction();

    /**
     * The meta object literal for the '<em><b>Print Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRINT_FUNCTION__PRINT_PARAM = eINSTANCE.getPrintFunction_PrintParam();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.PrintParamImpl <em>Print Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.PrintParamImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getPrintParam()
     * @generated
     */
    EClass PRINT_PARAM = eINSTANCE.getPrintParam();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.FunctionCallImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Called Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_CALL__CALLED_FUNCTION_NAME = eINSTANCE.getFunctionCall_CalledFunctionName();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__ARGUMENTS = eINSTANCE.getFunctionCall_Arguments();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.VariableCallImpl <em>Variable Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.VariableCallImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableCall()
     * @generated
     */
    EClass VARIABLE_CALL = eINSTANCE.getVariableCall();

    /**
     * The meta object literal for the '<em><b>Called Variable Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_CALL__CALLED_VARIABLE_NAME = eINSTANCE.getVariableCall_CalledVariableName();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.ExpressionImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.CompoundStatementImpl <em>Compound Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.CompoundStatementImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getCompoundStatement()
     * @generated
     */
    EClass COMPOUND_STATEMENT = eINSTANCE.getCompoundStatement();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_STATEMENT__STATEMENTS = eINSTANCE.getCompoundStatement_Statements();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.FunctionDefinitionImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getFunctionDefinition()
     * @generated
     */
    EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__NAME = eINSTANCE.getFunctionDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__ARGUMENTS = eINSTANCE.getFunctionDefinition_Arguments();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.ReturnStatementImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STATEMENT__RETURN_VALUE = eINSTANCE.getReturnStatement_ReturnValue();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.IfStatementImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.WhileStatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.WhileStatementImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getWhileStatement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

    /**
     * The meta object literal for the '<em><b>While Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__WHILE_CONDITION = eINSTANCE.getWhileStatement_WhileCondition();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.ForStatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.ForStatementImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getForStatement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getForStatement();

    /**
     * The meta object literal for the '<em><b>For Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FOR_VAR = eINSTANCE.getForStatement_ForVar();

    /**
     * The meta object literal for the '<em><b>For Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FOR_CONDITION = eINSTANCE.getForStatement_ForCondition();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__OPERATION = eINSTANCE.getForStatement_Operation();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.ConditionStatementImpl <em>Condition Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.ConditionStatementImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getConditionStatement()
     * @generated
     */
    EClass CONDITION_STATEMENT = eINSTANCE.getConditionStatement();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_STATEMENT__CONDITIONS = eINSTANCE.getConditionStatement_Conditions();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.ConditionImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Condition Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__CONDITION_ELEMENTS = eINSTANCE.getCondition_ConditionElements();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__OP = eINSTANCE.getCondition_Op();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.ConditionElementImpl <em>Condition Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.ConditionElementImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getConditionElement()
     * @generated
     */
    EClass CONDITION_ELEMENT = eINSTANCE.getConditionElement();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.PostfixOperationImpl <em>Postfix Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.PostfixOperationImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getPostfixOperation()
     * @generated
     */
    EClass POSTFIX_OPERATION = eINSTANCE.getPostfixOperation();

    /**
     * The meta object literal for the '<em><b>Call</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTFIX_OPERATION__CALL = eINSTANCE.getPostfixOperation_Call();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSTFIX_OPERATION__OP = eINSTANCE.getPostfixOperation_Op();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.StringLiteralImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.NumberLiteralImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.BooleanValueImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.AdditionImpl <em>Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.AdditionImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getAddition()
     * @generated
     */
    EClass ADDITION = eINSTANCE.getAddition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION__LEFT = eINSTANCE.getAddition_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION__RIGHT = eINSTANCE.getAddition_Right();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.SubstractionImpl <em>Substraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.SubstractionImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getSubstraction()
     * @generated
     */
    EClass SUBSTRACTION = eINSTANCE.getSubstraction();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSTRACTION__LEFT = eINSTANCE.getSubstraction_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSTRACTION__RIGHT = eINSTANCE.getSubstraction_Right();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.MultiplicationImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__LEFT = eINSTANCE.getMultiplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__RIGHT = eINSTANCE.getMultiplication_Right();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.DivisionImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__LEFT = eINSTANCE.getDivision_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__RIGHT = eINSTANCE.getDivision_Right();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.ModImpl <em>Mod</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.ModImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getMod()
     * @generated
     */
    EClass MOD = eINSTANCE.getMod();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD__LEFT = eINSTANCE.getMod_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD__RIGHT = eINSTANCE.getMod_Right();

  }

} //DataCentricDSLPackage
