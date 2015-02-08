/**
 */
package bg.tues.didi.impl;

import bg.tues.didi.ConditionStatement;
import bg.tues.didi.DidiPackage;
import bg.tues.didi.UpdateFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bg.tues.didi.impl.UpdateFunctionImpl#getUpdateArgument <em>Update Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateFunctionImpl extends SimpleStatementImpl implements UpdateFunction
{
  /**
   * The cached value of the '{@link #getUpdateArgument() <em>Update Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateArgument()
   * @generated
   * @ordered
   */
  protected ConditionStatement updateArgument;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UpdateFunctionImpl()
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
    return DidiPackage.Literals.UPDATE_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionStatement getUpdateArgument()
  {
    return updateArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdateArgument(ConditionStatement newUpdateArgument, NotificationChain msgs)
  {
    ConditionStatement oldUpdateArgument = updateArgument;
    updateArgument = newUpdateArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DidiPackage.UPDATE_FUNCTION__UPDATE_ARGUMENT, oldUpdateArgument, newUpdateArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateArgument(ConditionStatement newUpdateArgument)
  {
    if (newUpdateArgument != updateArgument)
    {
      NotificationChain msgs = null;
      if (updateArgument != null)
        msgs = ((InternalEObject)updateArgument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DidiPackage.UPDATE_FUNCTION__UPDATE_ARGUMENT, null, msgs);
      if (newUpdateArgument != null)
        msgs = ((InternalEObject)newUpdateArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DidiPackage.UPDATE_FUNCTION__UPDATE_ARGUMENT, null, msgs);
      msgs = basicSetUpdateArgument(newUpdateArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DidiPackage.UPDATE_FUNCTION__UPDATE_ARGUMENT, newUpdateArgument, newUpdateArgument));
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
      case DidiPackage.UPDATE_FUNCTION__UPDATE_ARGUMENT:
        return basicSetUpdateArgument(null, msgs);
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
      case DidiPackage.UPDATE_FUNCTION__UPDATE_ARGUMENT:
        return getUpdateArgument();
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
      case DidiPackage.UPDATE_FUNCTION__UPDATE_ARGUMENT:
        setUpdateArgument((ConditionStatement)newValue);
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
      case DidiPackage.UPDATE_FUNCTION__UPDATE_ARGUMENT:
        setUpdateArgument((ConditionStatement)null);
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
      case DidiPackage.UPDATE_FUNCTION__UPDATE_ARGUMENT:
        return updateArgument != null;
    }
    return super.eIsSet(featureID);
  }

} //UpdateFunctionImpl
