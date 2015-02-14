/**
 */
package bg.tues.didi.impl;

import bg.tues.didi.*;

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
public class DidiFactoryImpl extends EFactoryImpl implements DidiFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DidiFactory init()
  {
    try
    {
      DidiFactory theDidiFactory = (DidiFactory)EPackage.Registry.INSTANCE.getEFactory(DidiPackage.eNS_URI);
      if (theDidiFactory != null)
      {
        return theDidiFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DidiFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DidiFactoryImpl()
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
      case DidiPackage.DIDI_MODEL: return createDidiModel();
      case DidiPackage.STATEMENT: return createStatement();
      case DidiPackage.SIMPLE_STATEMENT: return createSimpleStatement();
      case DidiPackage.VARIABLE_DEFINITION: return createVariableDefinition();
      case DidiPackage.VARIABLE_VALUE: return createVariableValue();
      case DidiPackage.QUERY_FUNCTION: return createQueryFunction();
      case DidiPackage.UPDATE_FUNCTION: return createUpdateFunction();
      case DidiPackage.PRINT_FUNCTION: return createPrintFunction();
      case DidiPackage.PRINT_ARGUMENT: return createPrintArgument();
      case DidiPackage.FUNCTION_CALL: return createFunctionCall();
      case DidiPackage.VARIABLE_CALL: return createVariableCall();
      case DidiPackage.EXPRESSION: return createExpression();
      case DidiPackage.COMPOUND_STATEMENT: return createCompoundStatement();
      case DidiPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
      case DidiPackage.RETURN_STATEMENT: return createReturnStatement();
      case DidiPackage.IF_STATEMENT: return createIfStatement();
      case DidiPackage.WHILE_STATEMENT: return createWhileStatement();
      case DidiPackage.FOR_STATEMENT: return createForStatement();
      case DidiPackage.CONDITION_STATEMENT: return createConditionStatement();
      case DidiPackage.CONDITION: return createCondition();
      case DidiPackage.CONDITION_ELEMENT: return createConditionElement();
      case DidiPackage.POSTFIX_OPERATION: return createPostfixOperation();
      case DidiPackage.STRING_LITERAL: return createStringLiteral();
      case DidiPackage.NUMBER_LITERAL: return createNumberLiteral();
      case DidiPackage.BOOLEAN_VALUE: return createBooleanValue();
      case DidiPackage.ADDITION: return createAddition();
      case DidiPackage.SUBSTRACTION: return createSubstraction();
      case DidiPackage.MULTIPLICATION: return createMultiplication();
      case DidiPackage.DIVISION: return createDivision();
      case DidiPackage.MOD: return createMod();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DidiModel createDidiModel()
  {
    DidiModelImpl didiModel = new DidiModelImpl();
    return didiModel;
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
  public VariableDefinition createVariableDefinition()
  {
    VariableDefinitionImpl variableDefinition = new VariableDefinitionImpl();
    return variableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableValue createVariableValue()
  {
    VariableValueImpl variableValue = new VariableValueImpl();
    return variableValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryFunction createQueryFunction()
  {
    QueryFunctionImpl queryFunction = new QueryFunctionImpl();
    return queryFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateFunction createUpdateFunction()
  {
    UpdateFunctionImpl updateFunction = new UpdateFunctionImpl();
    return updateFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrintFunction createPrintFunction()
  {
    PrintFunctionImpl printFunction = new PrintFunctionImpl();
    return printFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrintArgument createPrintArgument()
  {
    PrintArgumentImpl printArgument = new PrintArgumentImpl();
    return printArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
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
  public FunctionDefinition createFunctionDefinition()
  {
    FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
    return functionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
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
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionStatement createConditionStatement()
  {
    ConditionStatementImpl conditionStatement = new ConditionStatementImpl();
    return conditionStatement;
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
  public ConditionElement createConditionElement()
  {
    ConditionElementImpl conditionElement = new ConditionElementImpl();
    return conditionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostfixOperation createPostfixOperation()
  {
    PostfixOperationImpl postfixOperation = new PostfixOperationImpl();
    return postfixOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
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
  public BooleanValue createBooleanValue()
  {
    BooleanValueImpl booleanValue = new BooleanValueImpl();
    return booleanValue;
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
  public DidiPackage getDidiPackage()
  {
    return (DidiPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DidiPackage getPackage()
  {
    return DidiPackage.eINSTANCE;
  }

} //DidiFactoryImpl
