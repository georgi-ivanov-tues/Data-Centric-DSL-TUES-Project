/**
 */
package bg.tues.didi.impl;

import bg.tues.didi.ConditionStatement;
import bg.tues.didi.DidiPackage;
import bg.tues.didi.QueryFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bg.tues.didi.impl.QueryFunctionImpl#getQueryArgument <em>Query Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryFunctionImpl extends SimpleStatementImpl implements QueryFunction
{
  /**
   * The cached value of the '{@link #getQueryArgument() <em>Query Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryArgument()
   * @generated
   * @ordered
   */
  protected ConditionStatement queryArgument;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryFunctionImpl()
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
    return DidiPackage.Literals.QUERY_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionStatement getQueryArgument()
  {
    return queryArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQueryArgument(ConditionStatement newQueryArgument, NotificationChain msgs)
  {
    ConditionStatement oldQueryArgument = queryArgument;
    queryArgument = newQueryArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DidiPackage.QUERY_FUNCTION__QUERY_ARGUMENT, oldQueryArgument, newQueryArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryArgument(ConditionStatement newQueryArgument)
  {
    if (newQueryArgument != queryArgument)
    {
      NotificationChain msgs = null;
      if (queryArgument != null)
        msgs = ((InternalEObject)queryArgument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DidiPackage.QUERY_FUNCTION__QUERY_ARGUMENT, null, msgs);
      if (newQueryArgument != null)
        msgs = ((InternalEObject)newQueryArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DidiPackage.QUERY_FUNCTION__QUERY_ARGUMENT, null, msgs);
      msgs = basicSetQueryArgument(newQueryArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DidiPackage.QUERY_FUNCTION__QUERY_ARGUMENT, newQueryArgument, newQueryArgument));
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
      case DidiPackage.QUERY_FUNCTION__QUERY_ARGUMENT:
        return basicSetQueryArgument(null, msgs);
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
      case DidiPackage.QUERY_FUNCTION__QUERY_ARGUMENT:
        return getQueryArgument();
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
      case DidiPackage.QUERY_FUNCTION__QUERY_ARGUMENT:
        setQueryArgument((ConditionStatement)newValue);
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
      case DidiPackage.QUERY_FUNCTION__QUERY_ARGUMENT:
        setQueryArgument((ConditionStatement)null);
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
      case DidiPackage.QUERY_FUNCTION__QUERY_ARGUMENT:
        return queryArgument != null;
    }
    return super.eIsSet(featureID);
  }

} //QueryFunctionImpl
