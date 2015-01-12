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
   * The meta object id for the '{@link org.dataCentricDSL.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.VariableDeclImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableDecl()
   * @generated
   */
  int VARIABLE_DECL = 3;

  /**
   * The feature id for the '<em><b>Gloval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__GLOVAL = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__NAME = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variable Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__VARIABLE_VALUE = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Variable Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.QueryImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 4;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__PRINT_VALUE = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Query Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__QUERY_VALUE = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.PrintImpl <em>Print</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.PrintImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getPrint()
   * @generated
   */
  int PRINT = 5;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT__PRINT_VALUE = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Print</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.FunctionCallImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__NAME = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link org.dataCentricDSL.impl.VariableCallImpl <em>Variable Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.VariableCallImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableCall()
   * @generated
   */
  int VARIABLE_CALL = 7;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__PRINT_VALUE = QUERY__PRINT_VALUE;

  /**
   * The feature id for the '<em><b>Query Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__QUERY_VALUE = QUERY__QUERY_VALUE;

  /**
   * The feature id for the '<em><b>Variable Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__VARIABLE_CALL = QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__OP = QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.ExpressionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__PRINT_VALUE = PRINT__PRINT_VALUE;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = PRINT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.NumberLiteralImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__PRINT_VALUE = EXPRESSION__PRINT_VALUE;

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
   * The meta object id for the '{@link org.dataCentricDSL.impl.CompoundStatementImpl <em>Compound Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.CompoundStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getCompoundStatement()
   * @generated
   */
  int COMPOUND_STATEMENT = 10;

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
   * The meta object id for the '{@link org.dataCentricDSL.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.FunctionDeclImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getFunctionDecl()
   * @generated
   */
  int FUNCTION_DECL = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__ARGUMENTS = 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__STATEMENTS = 2;

  /**
   * The number of structural features of the '<em>Function Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.IfStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 12;

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
   * The meta object id for the '{@link org.dataCentricDSL.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.SwitchStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getSwitchStatement()
   * @generated
   */
  int SWITCH_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__CASES = 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__STATEMENTS = 2;

  /**
   * The number of structural features of the '<em>Switch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.WhileStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 14;

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
  int FOR_STATEMENT = 15;

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
   * The meta object id for the '{@link org.dataCentricDSL.impl.StatementConditionImpl <em>Statement Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.StatementConditionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getStatementCondition()
   * @generated
   */
  int STATEMENT_CONDITION = 16;

  /**
   * The feature id for the '<em><b>Statement Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CONDITION__STATEMENT_CONDITION = 0;

  /**
   * The number of structural features of the '<em>Statement Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.ConditionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 17;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__EXPRESSIONS = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
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
  int CONDITION_ELEMENT = 18;

  /**
   * The number of structural features of the '<em>Condition Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.ForMultiAssignImpl <em>For Multi Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.ForMultiAssignImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getForMultiAssign()
   * @generated
   */
  int FOR_MULTI_ASSIGN = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_MULTI_ASSIGN__LEFT = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_MULTI_ASSIGN__OP = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_MULTI_ASSIGN__RIGHT = 2;

  /**
   * The number of structural features of the '<em>For Multi Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_MULTI_ASSIGN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.MultiAssignImpl <em>Multi Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.MultiAssignImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getMultiAssign()
   * @generated
   */
  int MULTI_ASSIGN = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ASSIGN__LEFT = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ASSIGN__OP = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ASSIGN__RIGHT = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Multi Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ASSIGN_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.MultiAssignRightOperandImpl <em>Multi Assign Right Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.MultiAssignRightOperandImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getMultiAssignRightOperand()
   * @generated
   */
  int MULTI_ASSIGN_RIGHT_OPERAND = 21;

  /**
   * The number of structural features of the '<em>Multi Assign Right Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ASSIGN_RIGHT_OPERAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.PostfixOperationImpl <em>Postfix Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.PostfixOperationImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getPostfixOperation()
   * @generated
   */
  int POSTFIX_OPERATION = 22;

  /**
   * The number of structural features of the '<em>Postfix Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_OPERATION_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.StringLiteralImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = CONDITION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = CONDITION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.VariableParamImpl <em>Variable Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.VariableParamImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableParam()
   * @generated
   */
  int VARIABLE_PARAM = 24;

  /**
   * The feature id for the '<em><b>Gloval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAM__GLOVAL = VARIABLE_DECL__GLOVAL;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAM__NAME = VARIABLE_DECL__NAME;

  /**
   * The feature id for the '<em><b>Variable Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAM__VARIABLE_VALUE = VARIABLE_DECL__VARIABLE_VALUE;

  /**
   * The feature id for the '<em><b>Variable String Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAM__VARIABLE_STRING_PARAM = VARIABLE_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable Var Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAM__VARIABLE_VAR_PARAM = VARIABLE_DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variable Query Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAM__VARIABLE_QUERY_PARAM = VARIABLE_DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Variable Bollean Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE = VARIABLE_DECL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Variable Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAM_FEATURE_COUNT = VARIABLE_DECL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.AdditionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 25;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__PRINT_VALUE = EXPRESSION__PRINT_VALUE;

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
  int SUBSTRACTION = 26;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTRACTION__PRINT_VALUE = EXPRESSION__PRINT_VALUE;

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
  int MULTIPLICATION = 27;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__PRINT_VALUE = EXPRESSION__PRINT_VALUE;

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
  int DIVISION = 28;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__PRINT_VALUE = EXPRESSION__PRINT_VALUE;

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
  int MOD = 29;

  /**
   * The feature id for the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD__PRINT_VALUE = EXPRESSION__PRINT_VALUE;

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
   * Returns the meta object for class '{@link org.dataCentricDSL.VariableDecl <em>Variable Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Decl</em>'.
   * @see org.dataCentricDSL.VariableDecl
   * @generated
   */
  EClass getVariableDecl();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.VariableDecl#isGloval <em>Gloval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gloval</em>'.
   * @see org.dataCentricDSL.VariableDecl#isGloval()
   * @see #getVariableDecl()
   * @generated
   */
  EAttribute getVariableDecl_Gloval();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.VariableDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.dataCentricDSL.VariableDecl#getName()
   * @see #getVariableDecl()
   * @generated
   */
  EAttribute getVariableDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.VariableDecl#getVariableValue <em>Variable Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Value</em>'.
   * @see org.dataCentricDSL.VariableDecl#getVariableValue()
   * @see #getVariableDecl()
   * @generated
   */
  EReference getVariableDecl_VariableValue();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see org.dataCentricDSL.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.Query#getQueryValue <em>Query Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query Value</em>'.
   * @see org.dataCentricDSL.Query#getQueryValue()
   * @see #getQuery()
   * @generated
   */
  EAttribute getQuery_QueryValue();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.Print <em>Print</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print</em>'.
   * @see org.dataCentricDSL.Print
   * @generated
   */
  EClass getPrint();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.Print#getPrintValue <em>Print Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Print Value</em>'.
   * @see org.dataCentricDSL.Print#getPrintValue()
   * @see #getPrint()
   * @generated
   */
  EAttribute getPrint_PrintValue();

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
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.FunctionCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.dataCentricDSL.FunctionCall#getName()
   * @see #getFunctionCall()
   * @generated
   */
  EAttribute getFunctionCall_Name();

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
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.VariableCall#getVariableCall <em>Variable Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Call</em>'.
   * @see org.dataCentricDSL.VariableCall#getVariableCall()
   * @see #getVariableCall()
   * @generated
   */
  EAttribute getVariableCall_VariableCall();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.VariableCall#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.dataCentricDSL.VariableCall#getOp()
   * @see #getVariableCall()
   * @generated
   */
  EAttribute getVariableCall_Op();

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
   * Returns the meta object for class '{@link org.dataCentricDSL.FunctionDecl <em>Function Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Decl</em>'.
   * @see org.dataCentricDSL.FunctionDecl
   * @generated
   */
  EClass getFunctionDecl();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.FunctionDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.dataCentricDSL.FunctionDecl#getName()
   * @see #getFunctionDecl()
   * @generated
   */
  EAttribute getFunctionDecl_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.dataCentricDSL.FunctionDecl#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Arguments</em>'.
   * @see org.dataCentricDSL.FunctionDecl#getArguments()
   * @see #getFunctionDecl()
   * @generated
   */
  EAttribute getFunctionDecl_Arguments();

  /**
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.FunctionDecl#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.dataCentricDSL.FunctionDecl#getStatements()
   * @see #getFunctionDecl()
   * @generated
   */
  EReference getFunctionDecl_Statements();

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
   * Returns the meta object for class '{@link org.dataCentricDSL.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Statement</em>'.
   * @see org.dataCentricDSL.SwitchStatement
   * @generated
   */
  EClass getSwitchStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.SwitchStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.dataCentricDSL.SwitchStatement#getName()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.dataCentricDSL.SwitchStatement#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Cases</em>'.
   * @see org.dataCentricDSL.SwitchStatement#getCases()
   * @see #getSwitchStatement()
   * @generated
   */
  EAttribute getSwitchStatement_Cases();

  /**
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.SwitchStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.dataCentricDSL.SwitchStatement#getStatements()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Statements();

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
   * Returns the meta object for class '{@link org.dataCentricDSL.StatementCondition <em>Statement Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Condition</em>'.
   * @see org.dataCentricDSL.StatementCondition
   * @generated
   */
  EClass getStatementCondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.StatementCondition#getStatementCondition <em>Statement Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement Condition</em>'.
   * @see org.dataCentricDSL.StatementCondition#getStatementCondition()
   * @see #getStatementCondition()
   * @generated
   */
  EReference getStatementCondition_StatementCondition();

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
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.Condition#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.dataCentricDSL.Condition#getExpressions()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Expressions();

  /**
   * Returns the meta object for the attribute list '{@link org.dataCentricDSL.Condition#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
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
   * Returns the meta object for class '{@link org.dataCentricDSL.ForMultiAssign <em>For Multi Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Multi Assign</em>'.
   * @see org.dataCentricDSL.ForMultiAssign
   * @generated
   */
  EClass getForMultiAssign();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.ForMultiAssign#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.dataCentricDSL.ForMultiAssign#getLeft()
   * @see #getForMultiAssign()
   * @generated
   */
  EReference getForMultiAssign_Left();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.ForMultiAssign#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.dataCentricDSL.ForMultiAssign#getOp()
   * @see #getForMultiAssign()
   * @generated
   */
  EAttribute getForMultiAssign_Op();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.ForMultiAssign#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.dataCentricDSL.ForMultiAssign#getRight()
   * @see #getForMultiAssign()
   * @generated
   */
  EAttribute getForMultiAssign_Right();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.MultiAssign <em>Multi Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Assign</em>'.
   * @see org.dataCentricDSL.MultiAssign
   * @generated
   */
  EClass getMultiAssign();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.MultiAssign#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.dataCentricDSL.MultiAssign#getLeft()
   * @see #getMultiAssign()
   * @generated
   */
  EReference getMultiAssign_Left();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.MultiAssign#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.dataCentricDSL.MultiAssign#getOp()
   * @see #getMultiAssign()
   * @generated
   */
  EAttribute getMultiAssign_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.MultiAssign#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.dataCentricDSL.MultiAssign#getRight()
   * @see #getMultiAssign()
   * @generated
   */
  EReference getMultiAssign_Right();

  /**
   * Returns the meta object for class '{@link org.dataCentricDSL.MultiAssignRightOperand <em>Multi Assign Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Assign Right Operand</em>'.
   * @see org.dataCentricDSL.MultiAssignRightOperand
   * @generated
   */
  EClass getMultiAssignRightOperand();

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
   * Returns the meta object for class '{@link org.dataCentricDSL.VariableParam <em>Variable Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Param</em>'.
   * @see org.dataCentricDSL.VariableParam
   * @generated
   */
  EClass getVariableParam();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.VariableParam#getVariableStringParam <em>Variable String Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable String Param</em>'.
   * @see org.dataCentricDSL.VariableParam#getVariableStringParam()
   * @see #getVariableParam()
   * @generated
   */
  EAttribute getVariableParam_VariableStringParam();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.VariableParam#getVariableVarParam <em>Variable Var Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Var Param</em>'.
   * @see org.dataCentricDSL.VariableParam#getVariableVarParam()
   * @see #getVariableParam()
   * @generated
   */
  EReference getVariableParam_VariableVarParam();

  /**
   * Returns the meta object for the containment reference '{@link org.dataCentricDSL.VariableParam#getVariableQueryParam <em>Variable Query Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Query Param</em>'.
   * @see org.dataCentricDSL.VariableParam#getVariableQueryParam()
   * @see #getVariableParam()
   * @generated
   */
  EReference getVariableParam_VariableQueryParam();

  /**
   * Returns the meta object for the attribute '{@link org.dataCentricDSL.VariableParam#getVariableBolleanValue <em>Variable Bollean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Bollean Value</em>'.
   * @see org.dataCentricDSL.VariableParam#getVariableBolleanValue()
   * @see #getVariableParam()
   * @generated
   */
  EAttribute getVariableParam_VariableBolleanValue();

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
     * The meta object literal for the '{@link org.dataCentricDSL.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.VariableDeclImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableDecl()
     * @generated
     */
    EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

    /**
     * The meta object literal for the '<em><b>Gloval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECL__GLOVAL = eINSTANCE.getVariableDecl_Gloval();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECL__NAME = eINSTANCE.getVariableDecl_Name();

    /**
     * The meta object literal for the '<em><b>Variable Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECL__VARIABLE_VALUE = eINSTANCE.getVariableDecl_VariableValue();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.QueryImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Query Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY__QUERY_VALUE = eINSTANCE.getQuery_QueryValue();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.PrintImpl <em>Print</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.PrintImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getPrint()
     * @generated
     */
    EClass PRINT = eINSTANCE.getPrint();

    /**
     * The meta object literal for the '<em><b>Print Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRINT__PRINT_VALUE = eINSTANCE.getPrint_PrintValue();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_CALL__NAME = eINSTANCE.getFunctionCall_Name();

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
     * The meta object literal for the '<em><b>Variable Call</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_CALL__VARIABLE_CALL = eINSTANCE.getVariableCall_VariableCall();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_CALL__OP = eINSTANCE.getVariableCall_Op();

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
     * The meta object literal for the '{@link org.dataCentricDSL.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.FunctionDeclImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getFunctionDecl()
     * @generated
     */
    EClass FUNCTION_DECL = eINSTANCE.getFunctionDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECL__NAME = eINSTANCE.getFunctionDecl_Name();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECL__ARGUMENTS = eINSTANCE.getFunctionDecl_Arguments();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECL__STATEMENTS = eINSTANCE.getFunctionDecl_Statements();

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
     * The meta object literal for the '{@link org.dataCentricDSL.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.SwitchStatementImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getSwitchStatement()
     * @generated
     */
    EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__NAME = eINSTANCE.getSwitchStatement_Name();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_STATEMENT__CASES = eINSTANCE.getSwitchStatement_Cases();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__STATEMENTS = eINSTANCE.getSwitchStatement_Statements();

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
     * The meta object literal for the '{@link org.dataCentricDSL.impl.StatementConditionImpl <em>Statement Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.StatementConditionImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getStatementCondition()
     * @generated
     */
    EClass STATEMENT_CONDITION = eINSTANCE.getStatementCondition();

    /**
     * The meta object literal for the '<em><b>Statement Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_CONDITION__STATEMENT_CONDITION = eINSTANCE.getStatementCondition_StatementCondition();

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
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__EXPRESSIONS = eINSTANCE.getCondition_Expressions();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
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
     * The meta object literal for the '{@link org.dataCentricDSL.impl.ForMultiAssignImpl <em>For Multi Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.ForMultiAssignImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getForMultiAssign()
     * @generated
     */
    EClass FOR_MULTI_ASSIGN = eINSTANCE.getForMultiAssign();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_MULTI_ASSIGN__LEFT = eINSTANCE.getForMultiAssign_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_MULTI_ASSIGN__OP = eINSTANCE.getForMultiAssign_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_MULTI_ASSIGN__RIGHT = eINSTANCE.getForMultiAssign_Right();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.MultiAssignImpl <em>Multi Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.MultiAssignImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getMultiAssign()
     * @generated
     */
    EClass MULTI_ASSIGN = eINSTANCE.getMultiAssign();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_ASSIGN__LEFT = eINSTANCE.getMultiAssign_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_ASSIGN__OP = eINSTANCE.getMultiAssign_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_ASSIGN__RIGHT = eINSTANCE.getMultiAssign_Right();

    /**
     * The meta object literal for the '{@link org.dataCentricDSL.impl.MultiAssignRightOperandImpl <em>Multi Assign Right Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.MultiAssignRightOperandImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getMultiAssignRightOperand()
     * @generated
     */
    EClass MULTI_ASSIGN_RIGHT_OPERAND = eINSTANCE.getMultiAssignRightOperand();

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
     * The meta object literal for the '{@link org.dataCentricDSL.impl.VariableParamImpl <em>Variable Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.dataCentricDSL.impl.VariableParamImpl
     * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableParam()
     * @generated
     */
    EClass VARIABLE_PARAM = eINSTANCE.getVariableParam();

    /**
     * The meta object literal for the '<em><b>Variable String Param</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_PARAM__VARIABLE_STRING_PARAM = eINSTANCE.getVariableParam_VariableStringParam();

    /**
     * The meta object literal for the '<em><b>Variable Var Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_PARAM__VARIABLE_VAR_PARAM = eINSTANCE.getVariableParam_VariableVarParam();

    /**
     * The meta object literal for the '<em><b>Variable Query Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_PARAM__VARIABLE_QUERY_PARAM = eINSTANCE.getVariableParam_VariableQueryParam();

    /**
     * The meta object literal for the '<em><b>Variable Bollean Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE = eINSTANCE.getVariableParam_VariableBolleanValue();

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
