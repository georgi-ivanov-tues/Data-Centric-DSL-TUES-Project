/**
 */
package org.dataCentricDSL.impl;

import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.QueryFunction;
import org.dataCentricDSL.StatementCondition;

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
 *   <li>{@link org.dataCentricDSL.impl.QueryFunctionImpl#getQueryParam <em>Query Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryFunctionImpl extends SimpleStatementImpl implements QueryFunction
{
  /**
   * The cached value of the '{@link #getQueryParam() <em>Query Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryParam()
   * @generated
   * @ordered
   */
  protected StatementCondition queryParam;

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
    return DataCentricDSLPackage.Literals.QUERY_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementCondition getQueryParam()
  {
    return queryParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQueryParam(StatementCondition newQueryParam, NotificationChain msgs)
  {
    StatementCondition oldQueryParam = queryParam;
    queryParam = newQueryParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.QUERY_FUNCTION__QUERY_PARAM, oldQueryParam, newQueryParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryParam(StatementCondition newQueryParam)
  {
    if (newQueryParam != queryParam)
    {
      NotificationChain msgs = null;
      if (queryParam != null)
        msgs = ((InternalEObject)queryParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.QUERY_FUNCTION__QUERY_PARAM, null, msgs);
      if (newQueryParam != null)
        msgs = ((InternalEObject)newQueryParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.QUERY_FUNCTION__QUERY_PARAM, null, msgs);
      msgs = basicSetQueryParam(newQueryParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.QUERY_FUNCTION__QUERY_PARAM, newQueryParam, newQueryParam));
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
      case DataCentricDSLPackage.QUERY_FUNCTION__QUERY_PARAM:
        return basicSetQueryParam(null, msgs);
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
      case DataCentricDSLPackage.QUERY_FUNCTION__QUERY_PARAM:
        return getQueryParam();
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
      case DataCentricDSLPackage.QUERY_FUNCTION__QUERY_PARAM:
        setQueryParam((StatementCondition)newValue);
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
      case DataCentricDSLPackage.QUERY_FUNCTION__QUERY_PARAM:
        setQueryParam((StatementCondition)null);
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
      case DataCentricDSLPackage.QUERY_FUNCTION__QUERY_PARAM:
        return queryParam != null;
    }
    return super.eIsSet(featureID);
  }

} //QueryFunctionImpl
