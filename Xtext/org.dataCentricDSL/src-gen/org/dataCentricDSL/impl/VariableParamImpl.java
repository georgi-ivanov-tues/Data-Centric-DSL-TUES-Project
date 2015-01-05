/**
 */
package org.dataCentricDSL.impl;

import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.Query;
import org.dataCentricDSL.VariableCall;
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
 *   <li>{@link org.dataCentricDSL.impl.VariableParamImpl#getVariableStringParam <em>Variable String Param</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.VariableParamImpl#getVariableVarParam <em>Variable Var Param</em>}</li>
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
   * The default value of the '{@link #getVariableStringParam() <em>Variable String Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableStringParam()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_STRING_PARAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariableStringParam() <em>Variable String Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableStringParam()
   * @generated
   * @ordered
   */
  protected String variableStringParam = VARIABLE_STRING_PARAM_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariableVarParam() <em>Variable Var Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableVarParam()
   * @generated
   * @ordered
   */
  protected VariableCall variableVarParam;

  /**
   * The cached value of the '{@link #getVariableQueryParam() <em>Variable Query Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableQueryParam()
   * @generated
   * @ordered
   */
  protected Query variableQueryParam;

  /**
   * The default value of the '{@link #getVariableBolleanValue() <em>Variable Bollean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableBolleanValue()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_BOLLEAN_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariableBolleanValue() <em>Variable Bollean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableBolleanValue()
   * @generated
   * @ordered
   */
  protected String variableBolleanValue = VARIABLE_BOLLEAN_VALUE_EDEFAULT;

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
  public String getVariableStringParam()
  {
    return variableStringParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableStringParam(String newVariableStringParam)
  {
    String oldVariableStringParam = variableStringParam;
    variableStringParam = newVariableStringParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_STRING_PARAM, oldVariableStringParam, variableStringParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableCall getVariableVarParam()
  {
    return variableVarParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableVarParam(VariableCall newVariableVarParam, NotificationChain msgs)
  {
    VariableCall oldVariableVarParam = variableVarParam;
    variableVarParam = newVariableVarParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_VAR_PARAM, oldVariableVarParam, newVariableVarParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableVarParam(VariableCall newVariableVarParam)
  {
    if (newVariableVarParam != variableVarParam)
    {
      NotificationChain msgs = null;
      if (variableVarParam != null)
        msgs = ((InternalEObject)variableVarParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_VAR_PARAM, null, msgs);
      if (newVariableVarParam != null)
        msgs = ((InternalEObject)newVariableVarParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_VAR_PARAM, null, msgs);
      msgs = basicSetVariableVarParam(newVariableVarParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_VAR_PARAM, newVariableVarParam, newVariableVarParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query getVariableQueryParam()
  {
    return variableQueryParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableQueryParam(Query newVariableQueryParam, NotificationChain msgs)
  {
    Query oldVariableQueryParam = variableQueryParam;
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
  public void setVariableQueryParam(Query newVariableQueryParam)
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
  public String getVariableBolleanValue()
  {
    return variableBolleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableBolleanValue(String newVariableBolleanValue)
  {
    String oldVariableBolleanValue = variableBolleanValue;
    variableBolleanValue = newVariableBolleanValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE, oldVariableBolleanValue, variableBolleanValue));
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
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_VAR_PARAM:
        return basicSetVariableVarParam(null, msgs);
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM:
        return basicSetVariableQueryParam(null, msgs);
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
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_STRING_PARAM:
        return getVariableStringParam();
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_VAR_PARAM:
        return getVariableVarParam();
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
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_STRING_PARAM:
        setVariableStringParam((String)newValue);
        return;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_VAR_PARAM:
        setVariableVarParam((VariableCall)newValue);
        return;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM:
        setVariableQueryParam((Query)newValue);
        return;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE:
        setVariableBolleanValue((String)newValue);
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
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_STRING_PARAM:
        setVariableStringParam(VARIABLE_STRING_PARAM_EDEFAULT);
        return;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_VAR_PARAM:
        setVariableVarParam((VariableCall)null);
        return;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM:
        setVariableQueryParam((Query)null);
        return;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE:
        setVariableBolleanValue(VARIABLE_BOLLEAN_VALUE_EDEFAULT);
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
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_STRING_PARAM:
        return VARIABLE_STRING_PARAM_EDEFAULT == null ? variableStringParam != null : !VARIABLE_STRING_PARAM_EDEFAULT.equals(variableStringParam);
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_VAR_PARAM:
        return variableVarParam != null;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_QUERY_PARAM:
        return variableQueryParam != null;
      case DataCentricDSLPackage.VARIABLE_PARAM__VARIABLE_BOLLEAN_VALUE:
        return VARIABLE_BOLLEAN_VALUE_EDEFAULT == null ? variableBolleanValue != null : !VARIABLE_BOLLEAN_VALUE_EDEFAULT.equals(variableBolleanValue);
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
    result.append(" (variableStringParam: ");
    result.append(variableStringParam);
    result.append(", variableBolleanValue: ");
    result.append(variableBolleanValue);
    result.append(')');
    return result.toString();
  }

} //VariableParamImpl
