/**
 */
package org.dataCentricDSL.impl;

import org.dataCentricDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataCentricDSLFactoryImpl extends EFactoryImpl implements DataCentricDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataCentricDSLFactory init()
  {
    try
    {
      DataCentricDSLFactory theDataCentricDSLFactory = (DataCentricDSLFactory)EPackage.Registry.INSTANCE.getEFactory(DataCentricDSLPackage.eNS_URI);
      if (theDataCentricDSLFactory != null)
      {
        return theDataCentricDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DataCentricDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCentricDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DataCentricDSLPackage.DATA_CENTRIC_DSL: return createDataCentricDSL();
      case DataCentricDSLPackage.STATEMENT: return createStatement();
      case DataCentricDSLPackage.SIMPLE_STATEMENT: return createSimpleStatement();
      case DataCentricDSLPackage.VARIABLE_DECL: return createVariableDecl();
      case DataCentricDSLPackage.QUERY: return createQuery();
      case DataCentricDSLPackage.PRINT: return createPrint();
      case DataCentricDSLPackage.VARIABLE_CALL: return createVariableCall();
      case DataCentricDSLPackage.EXPRESSION: return createExpression();
      case DataCentricDSLPackage.NUMBER_LITERAL: return createNumberLiteral();
      case DataCentricDSLPackage.COMPOUND_STATEMENT: return createCompoundStatement();
      case DataCentricDSLPackage.IF_STATEMENT: return createIfStatement();
      case DataCentricDSLPackage.SWITCH_STATEMENT: return createSwitchStatement();
      case DataCentricDSLPackage.CONDITION: return createCondition();
      case DataCentricDSLPackage.VARIABLE_PARAM: return createVariableParam();
      case DataCentricDSLPackage.ADDITION: return createAddition();
      case DataCentricDSLPackage.SUBSTRACTION: return createSubstraction();
      case DataCentricDSLPackage.MULTIPLICATION: return createMultiplication();
      case DataCentricDSLPackage.DIVISION: return createDivision();
      case DataCentricDSLPackage.MOD: return createMod();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCentricDSL createDataCentricDSL()
  {
    DataCentricDSLImpl dataCentricDSL = new DataCentricDSLImpl();
    return dataCentricDSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleStatement createSimpleStatement()
  {
    SimpleStatementImpl simpleStatement = new SimpleStatementImpl();
    return simpleStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl createVariableDecl()
  {
    VariableDeclImpl variableDecl = new VariableDeclImpl();
    return variableDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Print createPrint()
  {
    PrintImpl print = new PrintImpl();
    return print;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableCall createVariableCall()
  {
    VariableCallImpl variableCall = new VariableCallImpl();
    return variableCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundStatement createCompoundStatement()
  {
    CompoundStatementImpl compoundStatement = new CompoundStatementImpl();
    return compoundStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchStatement createSwitchStatement()
  {
    SwitchStatementImpl switchStatement = new SwitchStatementImpl();
    return switchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableParam createVariableParam()
  {
    VariableParamImpl variableParam = new VariableParamImpl();
    return variableParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Substraction createSubstraction()
  {
    SubstractionImpl substraction = new SubstractionImpl();
    return substraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Division createDivision()
  {
    DivisionImpl division = new DivisionImpl();
    return division;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mod createMod()
  {
    ModImpl mod = new ModImpl();
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCentricDSLPackage getDataCentricDSLPackage()
  {
    return (DataCentricDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DataCentricDSLPackage getPackage()
  {
    return DataCentricDSLPackage.eINSTANCE;
  }

} //DataCentricDSLFactoryImpl
