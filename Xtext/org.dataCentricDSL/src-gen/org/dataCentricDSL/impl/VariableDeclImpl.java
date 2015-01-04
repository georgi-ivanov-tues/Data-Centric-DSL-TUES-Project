/**
 */
package org.dataCentricDSL.impl;

import java.util.Collection;

import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.SimpleStatement;
import org.dataCentricDSL.Statement;
import org.dataCentricDSL.StatementCondition;
import org.dataCentricDSL.VariableDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.dataCentricDSL.impl.VariableDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.VariableDeclImpl#getVariableValue <em>Variable Value</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.VariableDeclImpl#getForCondition <em>For Condition</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.VariableDeclImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.VariableDeclImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclImpl extends SimpleStatementImpl implements VariableDecl
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariableValue() <em>Variable Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableValue()
   * @generated
   * @ordered
   */
  protected SimpleStatement variableValue;

  /**
   * The cached value of the '{@link #getForCondition() <em>For Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForCondition()
   * @generated
   * @ordered
   */
  protected StatementCondition forCondition;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected EObject operation;

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
  protected VariableDeclImpl()
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
    return DataCentricDSLPackage.Literals.VARIABLE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleStatement getVariableValue()
  {
    return variableValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableValue(SimpleStatement newVariableValue, NotificationChain msgs)
  {
    SimpleStatement oldVariableValue = variableValue;
    variableValue = newVariableValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_DECL__VARIABLE_VALUE, oldVariableValue, newVariableValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableValue(SimpleStatement newVariableValue)
  {
    if (newVariableValue != variableValue)
    {
      NotificationChain msgs = null;
      if (variableValue != null)
        msgs = ((InternalEObject)variableValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_DECL__VARIABLE_VALUE, null, msgs);
      if (newVariableValue != null)
        msgs = ((InternalEObject)newVariableValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_DECL__VARIABLE_VALUE, null, msgs);
      msgs = basicSetVariableValue(newVariableValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_DECL__VARIABLE_VALUE, newVariableValue, newVariableValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementCondition getForCondition()
  {
    return forCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForCondition(StatementCondition newForCondition, NotificationChain msgs)
  {
    StatementCondition oldForCondition = forCondition;
    forCondition = newForCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_DECL__FOR_CONDITION, oldForCondition, newForCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForCondition(StatementCondition newForCondition)
  {
    if (newForCondition != forCondition)
    {
      NotificationChain msgs = null;
      if (forCondition != null)
        msgs = ((InternalEObject)forCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_DECL__FOR_CONDITION, null, msgs);
      if (newForCondition != null)
        msgs = ((InternalEObject)newForCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_DECL__FOR_CONDITION, null, msgs);
      msgs = basicSetForCondition(newForCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_DECL__FOR_CONDITION, newForCondition, newForCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperation(EObject newOperation, NotificationChain msgs)
  {
    EObject oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_DECL__OPERATION, oldOperation, newOperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(EObject newOperation)
  {
    if (newOperation != operation)
    {
      NotificationChain msgs = null;
      if (operation != null)
        msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_DECL__OPERATION, null, msgs);
      if (newOperation != null)
        msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_DECL__OPERATION, null, msgs);
      msgs = basicSetOperation(newOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_DECL__OPERATION, newOperation, newOperation));
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
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, DataCentricDSLPackage.VARIABLE_DECL__STATEMENTS);
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
      case DataCentricDSLPackage.VARIABLE_DECL__VARIABLE_VALUE:
        return basicSetVariableValue(null, msgs);
      case DataCentricDSLPackage.VARIABLE_DECL__FOR_CONDITION:
        return basicSetForCondition(null, msgs);
      case DataCentricDSLPackage.VARIABLE_DECL__OPERATION:
        return basicSetOperation(null, msgs);
      case DataCentricDSLPackage.VARIABLE_DECL__STATEMENTS:
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
      case DataCentricDSLPackage.VARIABLE_DECL__NAME:
        return getName();
      case DataCentricDSLPackage.VARIABLE_DECL__VARIABLE_VALUE:
        return getVariableValue();
      case DataCentricDSLPackage.VARIABLE_DECL__FOR_CONDITION:
        return getForCondition();
      case DataCentricDSLPackage.VARIABLE_DECL__OPERATION:
        return getOperation();
      case DataCentricDSLPackage.VARIABLE_DECL__STATEMENTS:
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
      case DataCentricDSLPackage.VARIABLE_DECL__NAME:
        setName((String)newValue);
        return;
      case DataCentricDSLPackage.VARIABLE_DECL__VARIABLE_VALUE:
        setVariableValue((SimpleStatement)newValue);
        return;
      case DataCentricDSLPackage.VARIABLE_DECL__FOR_CONDITION:
        setForCondition((StatementCondition)newValue);
        return;
      case DataCentricDSLPackage.VARIABLE_DECL__OPERATION:
        setOperation((EObject)newValue);
        return;
      case DataCentricDSLPackage.VARIABLE_DECL__STATEMENTS:
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
      case DataCentricDSLPackage.VARIABLE_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataCentricDSLPackage.VARIABLE_DECL__VARIABLE_VALUE:
        setVariableValue((SimpleStatement)null);
        return;
      case DataCentricDSLPackage.VARIABLE_DECL__FOR_CONDITION:
        setForCondition((StatementCondition)null);
        return;
      case DataCentricDSLPackage.VARIABLE_DECL__OPERATION:
        setOperation((EObject)null);
        return;
      case DataCentricDSLPackage.VARIABLE_DECL__STATEMENTS:
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
      case DataCentricDSLPackage.VARIABLE_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataCentricDSLPackage.VARIABLE_DECL__VARIABLE_VALUE:
        return variableValue != null;
      case DataCentricDSLPackage.VARIABLE_DECL__FOR_CONDITION:
        return forCondition != null;
      case DataCentricDSLPackage.VARIABLE_DECL__OPERATION:
        return operation != null;
      case DataCentricDSLPackage.VARIABLE_DECL__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VariableDeclImpl
