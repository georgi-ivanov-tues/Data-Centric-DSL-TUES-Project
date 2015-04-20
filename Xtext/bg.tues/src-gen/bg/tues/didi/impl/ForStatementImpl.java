/**
 */
package bg.tues.didi.impl;

import bg.tues.didi.ConditionStatement;
import bg.tues.didi.DidiPackage;
import bg.tues.didi.ForStatement;
import bg.tues.didi.SimpleStatement;
import bg.tues.didi.Statement;
import bg.tues.didi.VariableDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bg.tues.didi.impl.ForStatementImpl#getForVar <em>For Var</em>}</li>
 *   <li>{@link bg.tues.didi.impl.ForStatementImpl#getForCondition <em>For Condition</em>}</li>
 *   <li>{@link bg.tues.didi.impl.ForStatementImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link bg.tues.didi.impl.ForStatementImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForStatementImpl extends CompoundStatementImpl implements ForStatement
{
  /**
   * The cached value of the '{@link #getForVar() <em>For Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForVar()
   * @generated
   * @ordered
   */
  protected VariableDefinition forVar;

  /**
   * The cached value of the '{@link #getForCondition() <em>For Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForCondition()
   * @generated
   * @ordered
   */
  protected ConditionStatement forCondition;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected SimpleStatement operation;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DidiPackage.Literals.FOR_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinition getForVar()
  {
    return forVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForVar(VariableDefinition newForVar, NotificationChain msgs)
  {
    VariableDefinition oldForVar = forVar;
    forVar = newForVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DidiPackage.FOR_STATEMENT__FOR_VAR, oldForVar, newForVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForVar(VariableDefinition newForVar)
  {
    if (newForVar != forVar)
    {
      NotificationChain msgs = null;
      if (forVar != null)
        msgs = ((InternalEObject)forVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DidiPackage.FOR_STATEMENT__FOR_VAR, null, msgs);
      if (newForVar != null)
        msgs = ((InternalEObject)newForVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DidiPackage.FOR_STATEMENT__FOR_VAR, null, msgs);
      msgs = basicSetForVar(newForVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DidiPackage.FOR_STATEMENT__FOR_VAR, newForVar, newForVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionStatement getForCondition()
  {
    return forCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForCondition(ConditionStatement newForCondition, NotificationChain msgs)
  {
    ConditionStatement oldForCondition = forCondition;
    forCondition = newForCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DidiPackage.FOR_STATEMENT__FOR_CONDITION, oldForCondition, newForCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForCondition(ConditionStatement newForCondition)
  {
    if (newForCondition != forCondition)
    {
      NotificationChain msgs = null;
      if (forCondition != null)
        msgs = ((InternalEObject)forCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DidiPackage.FOR_STATEMENT__FOR_CONDITION, null, msgs);
      if (newForCondition != null)
        msgs = ((InternalEObject)newForCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DidiPackage.FOR_STATEMENT__FOR_CONDITION, null, msgs);
      msgs = basicSetForCondition(newForCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DidiPackage.FOR_STATEMENT__FOR_CONDITION, newForCondition, newForCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleStatement getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperation(SimpleStatement newOperation, NotificationChain msgs)
  {
    SimpleStatement oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DidiPackage.FOR_STATEMENT__OPERATION, oldOperation, newOperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(SimpleStatement newOperation)
  {
    if (newOperation != operation)
    {
      NotificationChain msgs = null;
      if (operation != null)
        msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DidiPackage.FOR_STATEMENT__OPERATION, null, msgs);
      if (newOperation != null)
        msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DidiPackage.FOR_STATEMENT__OPERATION, null, msgs);
      msgs = basicSetOperation(newOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DidiPackage.FOR_STATEMENT__OPERATION, newOperation, newOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, DidiPackage.FOR_STATEMENT__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DidiPackage.FOR_STATEMENT__FOR_VAR:
        return basicSetForVar(null, msgs);
      case DidiPackage.FOR_STATEMENT__FOR_CONDITION:
        return basicSetForCondition(null, msgs);
      case DidiPackage.FOR_STATEMENT__OPERATION:
        return basicSetOperation(null, msgs);
      case DidiPackage.FOR_STATEMENT__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DidiPackage.FOR_STATEMENT__FOR_VAR:
        return getForVar();
      case DidiPackage.FOR_STATEMENT__FOR_CONDITION:
        return getForCondition();
      case DidiPackage.FOR_STATEMENT__OPERATION:
        return getOperation();
      case DidiPackage.FOR_STATEMENT__STATEMENTS:
        return getStatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DidiPackage.FOR_STATEMENT__FOR_VAR:
        setForVar((VariableDefinition)newValue);
        return;
      case DidiPackage.FOR_STATEMENT__FOR_CONDITION:
        setForCondition((ConditionStatement)newValue);
        return;
      case DidiPackage.FOR_STATEMENT__OPERATION:
        setOperation((SimpleStatement)newValue);
        return;
      case DidiPackage.FOR_STATEMENT__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DidiPackage.FOR_STATEMENT__FOR_VAR:
        setForVar((VariableDefinition)null);
        return;
      case DidiPackage.FOR_STATEMENT__FOR_CONDITION:
        setForCondition((ConditionStatement)null);
        return;
      case DidiPackage.FOR_STATEMENT__OPERATION:
        setOperation((SimpleStatement)null);
        return;
      case DidiPackage.FOR_STATEMENT__STATEMENTS:
        getStatements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DidiPackage.FOR_STATEMENT__FOR_VAR:
        return forVar != null;
      case DidiPackage.FOR_STATEMENT__FOR_CONDITION:
        return forCondition != null;
      case DidiPackage.FOR_STATEMENT__OPERATION:
        return operation != null;
      case DidiPackage.FOR_STATEMENT__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ForStatementImpl
