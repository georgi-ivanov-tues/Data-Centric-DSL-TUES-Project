/**
 */
package org.dataCentricDSL.impl;

import org.dataCentricDSL.BooleanValue;
import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.Expression;
import org.dataCentricDSL.QueryFunction;
import org.dataCentricDSL.VariableParam;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.dataCentricDSL.impl.VariableParamImpl#getVariableExpressionParam <em>Variable Expression Param</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.VariableParamImpl#getVariableQueryParam <em>Variable Query Param</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.VariableParamImpl#getVariableBolleanValue <em>Variable Bollean Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableParamImpl extends VariableDeclImpl implements VariableParam
{
  /**
   * The cached value of the '{@link #getVariableExpressionParam() <em>Variable Expression Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableExpressionParam()
   * @generated
   * @ordered
   */
  protected Expression variableExpressionParam;

  /**
   * The cached value of the '{@link #getVariableQueryParam() <em>Variable Query Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableQueryParam()
   * @generated
   * @ordered
   */
  protected QueryFunction variableQueryParam;

  /**
   * The cached value of the '{@link #getVariableBolleanValue() <em>Variable Bollean Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableBolleanValue()
   * @generated
   * @ordered
   */
  protected BooleanValue variableBolleanValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableParamImpl()
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
    return DataCentricDSLPackage.Literals.VARIABLE_PARAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getVariableExpressionParam()
  {
    return variableExpressionParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableExpressionParam(Expression newVariableExpressionParam, NotificationChain msgs)
  {
    Expression oldVariableExpressionParam = variableExpressionParam;
    variableExpressionParam = newVariableExpressionParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_EXPRESSION_PARAM, oldVariableExpressionParam, newVariableExpressionParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableExpressionParam(Expression newVariableExpressionParam)
  {
    if (newVariableExpressionParam != variableExpressionParam)
    {
      NotificationChain msgs = null;
      if (variableExpressionParam != null)
        msgs = ((InternalEObject)variableExpressionParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_EXPRESSION_PARAM, null, msgs);
      if (newVariableExpressionParam != null)
        msgs = ((InternalEObject)newVariableExpressionParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_EXPRESSION_PARAM, null, msgs);
      msgs = basicSetVariableExpressionParam(newVariableExpressionParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_EXPRESSION_PARAM, newVariableExpressionParam, newVariableExpressionParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryFunction getVariableQueryParam()
  {
    return variableQueryParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableQueryParam(QueryFunction newVariableQueryParam, NotificationChain msgs)
  {
    QueryFunction oldVariableQueryParam = variableQueryParam;
    variableQueryParam = newVariableQueryParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM, oldVariableQueryParam, newVariableQueryParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableQueryParam(QueryFunction newVariableQueryParam)
  {
    if (newVariableQueryParam != variableQueryParam)
    {
      NotificationChain msgs = null;
      if (variableQueryParam != null)
        msgs = ((InternalEObject)variableQueryParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM, null, msgs);
      if (newVariableQueryParam != null)
        msgs = ((InternalEObject)newVariableQueryParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM, null, msgs);
      msgs = basicSetVariableQueryParam(newVariableQueryParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM, newVariableQueryParam, newVariableQueryParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue getVariableBolleanValue()
  {
    return variableBolleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableBolleanValue(BooleanValue newVariableBolleanValue, NotificationChain msgs)
  {
    BooleanValue oldVariableBolleanValue = variableBolleanValue;
    variableBolleanValue = newVariableBolleanValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE, oldVariableBolleanValue, newVariableBolleanValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableBolleanValue(BooleanValue newVariableBolleanValue)
  {
    if (newVariableBolleanValue != variableBolleanValue)
    {
      NotificationChain msgs = null;
      if (variableBolleanValue != null)
        msgs = ((InternalEObject)variableBolleanValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE, null, msgs);
      if (newVariableBolleanValue != null)
        msgs = ((InternalEObject)newVariableBolleanValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE, null, msgs);
      msgs = basicSetVariableBolleanValue(newVariableBolleanValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE, newVariableBolleanValue, newVariableBolleanValue));
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
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_EXPRESSION_PARAM:
        return basicSetVariableExpressionParam(null, msgs);
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM:
        return basicSetVariableQueryParam(null, msgs);
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE:
        return basicSetVariableBolleanValue(null, msgs);
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
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_EXPRESSION_PARAM:
        return getVariableExpressionParam();
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM:
        return getVariableQueryParam();
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE:
        return getVariableBolleanValue();
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
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_EXPRESSION_PARAM:
        setVariableExpressionParam((Expression)newValue);
        return;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM:
        setVariableQueryParam((QueryFunction)newValue);
        return;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE:
        setVariableBolleanValue((BooleanValue)newValue);
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
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_EXPRESSION_PARAM:
        setVariableExpressionParam((Expression)null);
        return;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM:
        setVariableQueryParam((QueryFunction)null);
        return;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE:
        setVariableBolleanValue((BooleanValue)null);
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
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_EXPRESSION_PARAM:
        return variableExpressionParam != null;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM:
        return variableQueryParam != null;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE:
        return variableBolleanValue != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableParamImpl
