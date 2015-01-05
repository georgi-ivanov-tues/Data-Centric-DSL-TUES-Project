/**
 */
package org.dataCentricDSL.impl;

import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.StatementCondition;
import org.dataCentricDSL.WhileStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.dataCentricDSL.impl.WhileStatementImpl#getWhileCondition <em>While Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileStatementImpl extends CompoundStatementImpl implements WhileStatement
{
  /**
   * The cached value of the '{@link #getWhileCondition() <em>While Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhileCondition()
   * @generated
   * @ordered
   */
  protected StatementCondition whileCondition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhileStatementImpl()
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
    return DataCentricDSLPackage.Literals.WHILE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementCondition getWhileCondition()
  {
    return whileCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhileCondition(StatementCondition newWhileCondition, NotificationChain msgs)
  {
    StatementCondition oldWhileCondition = whileCondition;
    whileCondition = newWhileCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.WHILE_STATEMENT__WHILE_CONDITION, oldWhileCondition, newWhileCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhileCondition(StatementCondition newWhileCondition)
  {
    if (newWhileCondition != whileCondition)
    {
      NotificationChain msgs = null;
      if (whileCondition != null)
        msgs = ((InternalEObject)whileCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.WHILE_STATEMENT__WHILE_CONDITION, null, msgs);
      if (newWhileCondition != null)
        msgs = ((InternalEObject)newWhileCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.WHILE_STATEMENT__WHILE_CONDITION, null, msgs);
      msgs = basicSetWhileCondition(newWhileCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.WHILE_STATEMENT__WHILE_CONDITION, newWhileCondition, newWhileCondition));
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
      case DataCentricDSLPackage.WHILE_STATEMENT__WHILE_CONDITION:
        return basicSetWhileCondition(null, msgs);
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
      case DataCentricDSLPackage.WHILE_STATEMENT__WHILE_CONDITION:
        return getWhileCondition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DataCentricDSLPackage.WHILE_STATEMENT__WHILE_CONDITION:
        setWhileCondition((StatementCondition)newValue);
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
      case DataCentricDSLPackage.WHILE_STATEMENT__WHILE_CONDITION:
        setWhileCondition((StatementCondition)null);
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
      case DataCentricDSLPackage.WHILE_STATEMENT__WHILE_CONDITION:
        return whileCondition != null;
    }
    return super.eIsSet(featureID);
  }

} //WhileStatementImpl
