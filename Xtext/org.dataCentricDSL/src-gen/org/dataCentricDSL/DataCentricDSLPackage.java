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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__NAME = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__VARIABLE_VALUE = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

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
   * The meta object id for the '{@link org.dataCentricDSL.impl.VariableCallImpl <em>Variable Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.VariableCallImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableCall()
   * @generated
   */
  int VARIABLE_CALL = 6;

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
   * The number of structural features of the '<em>Variable Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.ExpressionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 7;

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
  int NUMBER_LITERAL = 8;

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
  int COMPOUND_STATEMENT = 9;

  /**
   * The number of structural features of the '<em>Compound Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.IfStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 10;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__CONDITION = COMPOUND_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>If Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__IF_ELEMENTS = COMPOUND_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = COMPOUND_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.SwitchStatementImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getSwitchStatement()
   * @generated
   */
  int SWITCH_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__NAME = COMPOUND_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__CASES = COMPOUND_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Switch Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__SWITCH_ELEMENTS = COMPOUND_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Switch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = COMPOUND_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.ConditionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 12;

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
   * The meta object id for the '{@link org.dataCentricDSL.impl.VariableParamImpl <em>Variable Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.VariableParamImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getVariableParam()
   * @generated
   */
  int VARIABLE_PARAM = 13;

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
   * The number of structural features of the '<em>Variable Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PARAM_FEATURE_COUNT = VARIABLE_DECL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.dataCentricDSL.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.dataCentricDSL.impl.AdditionImpl
   * @see org.dataCentricDSL.impl.DataCentricDSLPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 14;

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
  int SUBSTRACTION = 15;

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
  int MULTIPLICATION = 16;

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
  int DIVISION = 17;

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
  int MOD = 18;

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
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.IfStatement#getIfElements <em>If Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>If Elements</em>'.
   * @see org.dataCentricDSL.IfStatement#getIfElements()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_IfElements();

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
   * Returns the meta object for the containment reference list '{@link org.dataCentricDSL.SwitchStatement#getSwitchElements <em>Switch Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switch Elements</em>'.
   * @see org.dataCentricDSL.SwitchStatement#getSwitchElements()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_SwitchElements();

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
     * The meta object literal for the '<em><b>If Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__IF_ELEMENTS = eINSTANCE.getIfStatement_IfElements();

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
     * The meta object literal for the '<em><b>Switch Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__SWITCH_ELEMENTS = eINSTANCE.getSwitchStatement_SwitchElements();

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
