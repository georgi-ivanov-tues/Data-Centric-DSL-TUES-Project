/**
 */
package bg.tues.didi.impl;

import bg.tues.didi.ConditionStatement;
import bg.tues.didi.DidiPackage;
import bg.tues.didi.WhileStatement;

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
 *   <li>{@link bg.tues.didi.impl.WhileStatementImpl#getWhileCondition <em>While Condition</em>}</li>
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
  protected ConditionStatement whileCondition;

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
    return DidiPackage.Literals.WHILE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionStatement getWhileCondition()
  {
    return whileCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhileCondition(ConditionStatement newWhileCondition, NotificationChain msgs)
  {
    ConditionStatement oldWhileCondition = whileCondition;
    whileCondition = newWhileCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DidiPackage.WHILE_STATEMENT__WHILE_CONDITION, oldWhileCondition, newWhileCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhileCondition(ConditionStatement newWhileCondition)
  {
    if (newWhileCondition != whileCondition)
    {
      NotificationChain msgs = null;
      if (whileCondition != null)
        msgs = ((InternalEObject)whileCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DidiPackage.WHILE_STATEMENT__WHILE_CONDITION, null, msgs);
      if (newWhileCondition != null)
        msgs = ((InternalEObject)newWhileCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DidiPackage.WHILE_STATEMENT__WHILE_CONDITION, null, msgs);
      msgs = basicSetWhileCondition(newWhileCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DidiPackage.WHILE_STATEMENT__WHILE_CONDITION, newWhileCondition, newWhileCondition));
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
      case DidiPackage.WHILE_STATEMENT__WHILE_CONDITION:
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
      case DidiPackage.WHILE_STATEMENT__WHILE_CONDITION:
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
      case DidiPackage.WHILE_STATEMENT__WHILE_CONDITION:
        setWhileCondition((ConditionStatement)newValue);
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
      case DidiPackage.WHILE_STATEMENT__WHILE_CONDITION:
        setWhileCondition((ConditionStatement)null);
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
      case DidiPackage.WHILE_STATEMENT__WHILE_CONDITION:
        return whileCondition != null;
    }
    return super.eIsSet(featureID);
  }

} //WhileStatementImpl
