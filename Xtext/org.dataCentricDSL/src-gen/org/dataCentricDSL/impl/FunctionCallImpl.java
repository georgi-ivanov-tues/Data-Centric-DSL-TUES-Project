/**
 */
package org.dataCentricDSL.impl;

import java.util.Collection;

import org.dataCentricDSL.ConditionElement;
import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.Expression;
import org.dataCentricDSL.FunctionCall;
import org.dataCentricDSL.MultiAssignRightOperand;
import org.dataCentricDSL.Print;
import org.dataCentricDSL.Query;

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
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.dataCentricDSL.impl.FunctionCallImpl#getPrintValue <em>Print Value</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.FunctionCallImpl#getQueryValue <em>Query Value</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.FunctionCallImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.FunctionCallImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionCallImpl extends SimpleStatementImpl implements FunctionCall
{
  /**
   * The default value of the '{@link #getPrintValue() <em>Print Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrintValue()
   * @generated
   * @ordered
   */
  protected static final String PRINT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrintValue() <em>Print Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrintValue()
   * @generated
   * @ordered
   */
  protected String printValue = PRINT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getQueryValue() <em>Query Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryValue()
   * @generated
   * @ordered
   */
  protected static final String QUERY_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQueryValue() <em>Query Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryValue()
   * @generated
   * @ordered
   */
  protected String queryValue = QUERY_VALUE_EDEFAULT;

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
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<EObject> arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionCallImpl()
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
    return DataCentricDSLPackage.Literals.FUNCTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrintValue()
  {
    return printValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrintValue(String newPrintValue)
  {
    String oldPrintValue = printValue;
    printValue = newPrintValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.FUNCTION_CALL__PRINT_VALUE, oldPrintValue, printValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQueryValue()
  {
    return queryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryValue(String newQueryValue)
  {
    String oldQueryValue = queryValue;
    queryValue = newQueryValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.FUNCTION_CALL__QUERY_VALUE, oldQueryValue, queryValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.FUNCTION_CALL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<EObject>(EObject.class, this, DataCentricDSLPackage.FUNCTION_CALL__ARGUMENTS);
    }
    return arguments;
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
      case DataCentricDSLPackage.FUNCTION_CALL__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
      case DataCentricDSLPackage.FUNCTION_CALL__PRINT_VALUE:
        return getPrintValue();
      case DataCentricDSLPackage.FUNCTION_CALL__QUERY_VALUE:
        return getQueryValue();
      case DataCentricDSLPackage.FUNCTION_CALL__NAME:
        return getName();
      case DataCentricDSLPackage.FUNCTION_CALL__ARGUMENTS:
        return getArguments();
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
      case DataCentricDSLPackage.FUNCTION_CALL__PRINT_VALUE:
        setPrintValue((String)newValue);
        return;
      case DataCentricDSLPackage.FUNCTION_CALL__QUERY_VALUE:
        setQueryValue((String)newValue);
        return;
      case DataCentricDSLPackage.FUNCTION_CALL__NAME:
        setName((String)newValue);
        return;
      case DataCentricDSLPackage.FUNCTION_CALL__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends EObject>)newValue);
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
      case DataCentricDSLPackage.FUNCTION_CALL__PRINT_VALUE:
        setPrintValue(PRINT_VALUE_EDEFAULT);
        return;
      case DataCentricDSLPackage.FUNCTION_CALL__QUERY_VALUE:
        setQueryValue(QUERY_VALUE_EDEFAULT);
        return;
      case DataCentricDSLPackage.FUNCTION_CALL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataCentricDSLPackage.FUNCTION_CALL__ARGUMENTS:
        getArguments().clear();
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
      case DataCentricDSLPackage.FUNCTION_CALL__PRINT_VALUE:
        return PRINT_VALUE_EDEFAULT == null ? printValue != null : !PRINT_VALUE_EDEFAULT.equals(printValue);
      case DataCentricDSLPackage.FUNCTION_CALL__QUERY_VALUE:
        return QUERY_VALUE_EDEFAULT == null ? queryValue != null : !QUERY_VALUE_EDEFAULT.equals(queryValue);
      case DataCentricDSLPackage.FUNCTION_CALL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataCentricDSLPackage.FUNCTION_CALL__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Print.class)
    {
      switch (derivedFeatureID)
      {
        case DataCentricDSLPackage.FUNCTION_CALL__PRINT_VALUE: return DataCentricDSLPackage.PRINT__PRINT_VALUE;
        default: return -1;
      }
    }
    if (baseClass == MultiAssignRightOperand.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Query.class)
    {
      switch (derivedFeatureID)
      {
        case DataCentricDSLPackage.FUNCTION_CALL__QUERY_VALUE: return DataCentricDSLPackage.QUERY__QUERY_VALUE;
        default: return -1;
      }
    }
    if (baseClass == ConditionElement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Print.class)
    {
      switch (baseFeatureID)
      {
        case DataCentricDSLPackage.PRINT__PRINT_VALUE: return DataCentricDSLPackage.FUNCTION_CALL__PRINT_VALUE;
        default: return -1;
      }
    }
    if (baseClass == MultiAssignRightOperand.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Query.class)
    {
      switch (baseFeatureID)
      {
        case DataCentricDSLPackage.QUERY__QUERY_VALUE: return DataCentricDSLPackage.FUNCTION_CALL__QUERY_VALUE;
        default: return -1;
      }
    }
    if (baseClass == ConditionElement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (printValue: ");
    result.append(printValue);
    result.append(", queryValue: ");
    result.append(queryValue);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FunctionCallImpl
