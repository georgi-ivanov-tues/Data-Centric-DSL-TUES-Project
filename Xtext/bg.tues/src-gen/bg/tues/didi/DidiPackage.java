/**
 */
package bg.tues.didi;

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
 * @see bg.tues.didi.DidiFactory
 * @model kind="package"
 * @generated
 */
public interface DidiPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "didi";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tues.bg/Didi";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "didi";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DidiPackage eINSTANCE = bg.tues.didi.impl.DidiPackageImpl.init();

  /**
   * The meta object id for the '{@link bg.tues.didi.impl.DidiModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.DidiModelImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getDidiModel()
   * @generated
   */
  int DIDI_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIDI_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIDI_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link bg.tues.didi.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.StatementImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getStatement()
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
   * The meta object id for the '{@link bg.tues.didi.impl.SimpleStatementImpl <em>Simple Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.SimpleStatementImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getSimpleStatement()
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
   * The meta object id for the '{@link bg.tues.didi.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.VariableDefinitionImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getVariableDefinition()
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
   * The meta object id for the '{@link bg.tues.didi.impl.VariableParamImpl <em>Variable Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.VariableParamImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getVariableParam()
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
   * The meta object id for the '{@link bg.tues.didi.impl.QueryFunctionImpl <em>Query Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.QueryFunctionImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getQueryFunction()
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
   * The meta object id for the '{@link bg.tues.didi.impl.PrintFunctionImpl <em>Print Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.PrintFunctionImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getPrintFunction()
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
   * The meta object id for the '{@link bg.tues.didi.impl.PrintParamImpl <em>Print Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.PrintParamImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getPrintParam()
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
   * The meta object id for the '{@link bg.tues.didi.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.FunctionCallImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getFunctionCall()
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
   * The meta object id for the '{@link bg.tues.didi.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.ExpressionImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getExpression()
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
   * The meta object id for the '{@link bg.tues.didi.impl.VariableCallImpl <em>Variable Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.VariableCallImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getVariableCall()
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
   * The meta object id for the '{@link bg.tues.didi.impl.CompoundStatementImpl <em>Compound Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.CompoundStatementImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getCompoundStatement()
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
   * The meta object id for the '{@link bg.tues.didi.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.FunctionDefinitionImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getFunctionDefinition()
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
   * The meta object id for the '{@link bg.tues.didi.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.ReturnStatementImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getReturnStatement()
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
   * The meta object id for the '{@link bg.tues.didi.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.IfStatementImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getIfStatement()
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
   * The meta object id for the '{@link bg.tues.didi.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.WhileStatementImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getWhileStatement()
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
   * The meta object id for the '{@link bg.tues.didi.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.ForStatementImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getForStatement()
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
   * The meta object id for the '{@link bg.tues.didi.impl.ConditionStatementImpl <em>Condition Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.ConditionStatementImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getConditionStatement()
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
   * The meta object id for the '{@link bg.tues.didi.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.ConditionImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getCondition()
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
   * The meta object id for the '{@link bg.tues.didi.impl.ConditionElementImpl <em>Condition Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.ConditionElementImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getConditionElement()
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
   * The meta object id for the '{@link bg.tues.didi.impl.PostfixOperationImpl <em>Postfix Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.PostfixOperationImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getPostfixOperation()
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
   * The meta object id for the '{@link bg.tues.didi.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.StringLiteralImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getStringLiteral()
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
   * The meta object id for the '{@link bg.tues.didi.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.NumberLiteralImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getNumberLiteral()
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
   * The meta object id for the '{@link bg.tues.didi.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.BooleanValueImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getBooleanValue()
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
   * The meta object id for the '{@link bg.tues.didi.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.AdditionImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getAddition()
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
   * The meta object id for the '{@link bg.tues.didi.impl.SubstractionImpl <em>Substraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.SubstractionImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getSubstraction()
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
   * The meta object id for the '{@link bg.tues.didi.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.MultiplicationImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getMultiplication()
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
   * The meta object id for the '{@link bg.tues.didi.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.DivisionImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getDivision()
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
   * The meta object id for the '{@link bg.tues.didi.impl.ModImpl <em>Mod</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bg.tues.didi.impl.ModImpl
   * @see bg.tues.didi.impl.DidiPackageImpl#getMod()
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
   * Returns the meta object for class '{@link bg.tues.didi.DidiModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see bg.tues.didi.DidiModel
   * @generated
   */
  EClass getDidiModel();

  /**
   * Returns the meta object for the containment reference list '{@link bg.tues.didi.DidiModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see bg.tues.didi.DidiModel#getElements()
   * @see #getDidiModel()
   * @generated
   */
  EReference getDidiModel_Elements();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see bg.tues.didi.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.SimpleStatement <em>Simple Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Statement</em>'.
   * @see bg.tues.didi.SimpleStatement
   * @generated
   */
  EClass getSimpleStatement();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see bg.tues.didi.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link bg.tues.didi.VariableDefinition#isIsGlobal <em>Is Global</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Global</em>'.
   * @see bg.tues.didi.VariableDefinition#isIsGlobal()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsGlobal();

  /**
   * Returns the meta object for the attribute '{@link bg.tues.didi.VariableDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bg.tues.didi.VariableDefinition#getName()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.VariableDefinition#getVariableValue <em>Variable Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Value</em>'.
   * @see bg.tues.didi.VariableDefinition#getVariableValue()
   * @see #getVariableDefinition()
   * @generated
   */
  EReference getVariableDefinition_VariableValue();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.VariableParam <em>Variable Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Param</em>'.
   * @see bg.tues.didi.VariableParam
   * @generated
   */
  EClass getVariableParam();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.QueryFunction <em>Query Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Function</em>'.
   * @see bg.tues.didi.QueryFunction
   * @generated
   */
  EClass getQueryFunction();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.QueryFunction#getQueryParam <em>Query Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query Param</em>'.
   * @see bg.tues.didi.QueryFunction#getQueryParam()
   * @see #getQueryFunction()
   * @generated
   */
  EReference getQueryFunction_QueryParam();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.PrintFunction <em>Print Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print Function</em>'.
   * @see bg.tues.didi.PrintFunction
   * @generated
   */
  EClass getPrintFunction();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.PrintFunction#getPrintParam <em>Print Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Print Param</em>'.
   * @see bg.tues.didi.PrintFunction#getPrintParam()
   * @see #getPrintFunction()
   * @generated
   */
  EReference getPrintFunction_PrintParam();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.PrintParam <em>Print Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print Param</em>'.
   * @see bg.tues.didi.PrintParam
   * @generated
   */
  EClass getPrintParam();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see bg.tues.didi.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the attribute '{@link bg.tues.didi.FunctionCall#getCalledFunctionName <em>Called Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Called Function Name</em>'.
   * @see bg.tues.didi.FunctionCall#getCalledFunctionName()
   * @see #getFunctionCall()
   * @generated
   */
  EAttribute getFunctionCall_CalledFunctionName();

  /**
   * Returns the meta object for the containment reference list '{@link bg.tues.didi.FunctionCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see bg.tues.didi.FunctionCall#getArguments()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Arguments();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.VariableCall <em>Variable Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Call</em>'.
   * @see bg.tues.didi.VariableCall
   * @generated
   */
  EClass getVariableCall();

  /**
   * Returns the meta object for the attribute '{@link bg.tues.didi.VariableCall#getCalledVariableName <em>Called Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Called Variable Name</em>'.
   * @see bg.tues.didi.VariableCall#getCalledVariableName()
   * @see #getVariableCall()
   * @generated
   */
  EAttribute getVariableCall_CalledVariableName();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see bg.tues.didi.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.CompoundStatement <em>Compound Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Statement</em>'.
   * @see bg.tues.didi.CompoundStatement
   * @generated
   */
  EClass getCompoundStatement();

  /**
   * Returns the meta object for the containment reference list '{@link bg.tues.didi.CompoundStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see bg.tues.didi.CompoundStatement#getStatements()
   * @see #getCompoundStatement()
   * @generated
   */
  EReference getCompoundStatement_Statements();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Definition</em>'.
   * @see bg.tues.didi.FunctionDefinition
   * @generated
   */
  EClass getFunctionDefinition();

  /**
   * Returns the meta object for the attribute '{@link bg.tues.didi.FunctionDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bg.tues.didi.FunctionDefinition#getName()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Name();

  /**
   * Returns the meta object for the attribute list '{@link bg.tues.didi.FunctionDefinition#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Arguments</em>'.
   * @see bg.tues.didi.FunctionDefinition#getArguments()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Arguments();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see bg.tues.didi.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.ReturnStatement#getReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Value</em>'.
   * @see bg.tues.didi.ReturnStatement#getReturnValue()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_ReturnValue();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see bg.tues.didi.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference list '{@link bg.tues.didi.IfStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition</em>'.
   * @see bg.tues.didi.IfStatement#getCondition()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Condition();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see bg.tues.didi.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.WhileStatement#getWhileCondition <em>While Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While Condition</em>'.
   * @see bg.tues.didi.WhileStatement#getWhileCondition()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_WhileCondition();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see bg.tues.didi.ForStatement
   * @generated
   */
  EClass getForStatement();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.ForStatement#getForVar <em>For Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Var</em>'.
   * @see bg.tues.didi.ForStatement#getForVar()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_ForVar();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.ForStatement#getForCondition <em>For Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Condition</em>'.
   * @see bg.tues.didi.ForStatement#getForCondition()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_ForCondition();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.ForStatement#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see bg.tues.didi.ForStatement#getOperation()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Operation();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.ConditionStatement <em>Condition Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Statement</em>'.
   * @see bg.tues.didi.ConditionStatement
   * @generated
   */
  EClass getConditionStatement();

  /**
   * Returns the meta object for the containment reference list '{@link bg.tues.didi.ConditionStatement#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see bg.tues.didi.ConditionStatement#getConditions()
   * @see #getConditionStatement()
   * @generated
   */
  EReference getConditionStatement_Conditions();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see bg.tues.didi.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference list '{@link bg.tues.didi.Condition#getConditionElements <em>Condition Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition Elements</em>'.
   * @see bg.tues.didi.Condition#getConditionElements()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ConditionElements();

  /**
   * Returns the meta object for the attribute '{@link bg.tues.didi.Condition#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bg.tues.didi.Condition#getOp()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Op();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.ConditionElement <em>Condition Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Element</em>'.
   * @see bg.tues.didi.ConditionElement
   * @generated
   */
  EClass getConditionElement();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.PostfixOperation <em>Postfix Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Postfix Operation</em>'.
   * @see bg.tues.didi.PostfixOperation
   * @generated
   */
  EClass getPostfixOperation();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.PostfixOperation#getCall <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Call</em>'.
   * @see bg.tues.didi.PostfixOperation#getCall()
   * @see #getPostfixOperation()
   * @generated
   */
  EReference getPostfixOperation_Call();

  /**
   * Returns the meta object for the attribute '{@link bg.tues.didi.PostfixOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bg.tues.didi.PostfixOperation#getOp()
   * @see #getPostfixOperation()
   * @generated
   */
  EAttribute getPostfixOperation_Op();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see bg.tues.didi.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link bg.tues.didi.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see bg.tues.didi.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see bg.tues.didi.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link bg.tues.didi.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see bg.tues.didi.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see bg.tues.didi.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link bg.tues.didi.BooleanValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see bg.tues.didi.BooleanValue#getValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition</em>'.
   * @see bg.tues.didi.Addition
   * @generated
   */
  EClass getAddition();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.Addition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see bg.tues.didi.Addition#getLeft()
   * @see #getAddition()
   * @generated
   */
  EReference getAddition_Left();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.Addition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see bg.tues.didi.Addition#getRight()
   * @see #getAddition()
   * @generated
   */
  EReference getAddition_Right();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.Substraction <em>Substraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Substraction</em>'.
   * @see bg.tues.didi.Substraction
   * @generated
   */
  EClass getSubstraction();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.Substraction#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see bg.tues.didi.Substraction#getLeft()
   * @see #getSubstraction()
   * @generated
   */
  EReference getSubstraction_Left();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.Substraction#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see bg.tues.didi.Substraction#getRight()
   * @see #getSubstraction()
   * @generated
   */
  EReference getSubstraction_Right();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see bg.tues.didi.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.Multiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see bg.tues.didi.Multiplication#getLeft()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.Multiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see bg.tues.didi.Multiplication#getRight()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Right();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see bg.tues.didi.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see bg.tues.didi.Division#getLeft()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Left();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see bg.tues.didi.Division#getRight()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Right();

  /**
   * Returns the meta object for class '{@link bg.tues.didi.Mod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod</em>'.
   * @see bg.tues.didi.Mod
   * @generated
   */
  EClass getMod();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.Mod#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see bg.tues.didi.Mod#getLeft()
   * @see #getMod()
   * @generated
   */
  EReference getMod_Left();

  /**
   * Returns the meta object for the containment reference '{@link bg.tues.didi.Mod#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see bg.tues.didi.Mod#getRight()
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
  DidiFactory getDidiFactory();

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
     * The meta object literal for the '{@link bg.tues.didi.impl.DidiModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.DidiModelImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getDidiModel()
     * @generated
     */
    EClass DIDI_MODEL = eINSTANCE.getDidiModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIDI_MODEL__ELEMENTS = eINSTANCE.getDidiModel_Elements();

    /**
     * The meta object literal for the '{@link bg.tues.didi.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.StatementImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link bg.tues.didi.impl.SimpleStatementImpl <em>Simple Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.SimpleStatementImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getSimpleStatement()
     * @generated
     */
    EClass SIMPLE_STATEMENT = eINSTANCE.getSimpleStatement();

    /**
     * The meta object literal for the '{@link bg.tues.didi.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.VariableDefinitionImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getVariableDefinition()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.VariableParamImpl <em>Variable Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.VariableParamImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getVariableParam()
     * @generated
     */
    EClass VARIABLE_PARAM = eINSTANCE.getVariableParam();

    /**
     * The meta object literal for the '{@link bg.tues.didi.impl.QueryFunctionImpl <em>Query Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.QueryFunctionImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getQueryFunction()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.PrintFunctionImpl <em>Print Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.PrintFunctionImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getPrintFunction()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.PrintParamImpl <em>Print Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.PrintParamImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getPrintParam()
     * @generated
     */
    EClass PRINT_PARAM = eINSTANCE.getPrintParam();

    /**
     * The meta object literal for the '{@link bg.tues.didi.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.FunctionCallImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getFunctionCall()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.VariableCallImpl <em>Variable Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.VariableCallImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getVariableCall()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.ExpressionImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link bg.tues.didi.impl.CompoundStatementImpl <em>Compound Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.CompoundStatementImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getCompoundStatement()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.FunctionDefinitionImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getFunctionDefinition()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.ReturnStatementImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getReturnStatement()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.IfStatementImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getIfStatement()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.WhileStatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.WhileStatementImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getWhileStatement()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.ForStatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.ForStatementImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getForStatement()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.ConditionStatementImpl <em>Condition Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.ConditionStatementImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getConditionStatement()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.ConditionImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getCondition()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.ConditionElementImpl <em>Condition Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.ConditionElementImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getConditionElement()
     * @generated
     */
    EClass CONDITION_ELEMENT = eINSTANCE.getConditionElement();

    /**
     * The meta object literal for the '{@link bg.tues.didi.impl.PostfixOperationImpl <em>Postfix Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.PostfixOperationImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getPostfixOperation()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.StringLiteralImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getStringLiteral()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.NumberLiteralImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getNumberLiteral()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.BooleanValueImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getBooleanValue()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.AdditionImpl <em>Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.AdditionImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getAddition()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.SubstractionImpl <em>Substraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.SubstractionImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getSubstraction()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.MultiplicationImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getMultiplication()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.DivisionImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getDivision()
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
     * The meta object literal for the '{@link bg.tues.didi.impl.ModImpl <em>Mod</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bg.tues.didi.impl.ModImpl
     * @see bg.tues.didi.impl.DidiPackageImpl#getMod()
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

} //DidiPackage
