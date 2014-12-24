/**
 */
package org.dataCentricDSL.impl;

import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.Print;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.dataCentricDSL.impl.PrintImpl#getPrintValue <em>Print Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrintImpl extends SimpleStatementImpl implements Print
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrintImpl()
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
    return DataCentricDSLPackage.Literals.PRINT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.PRINT__PRINT_VALUE, oldPrintValue, printValue));
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
      case DataCentricDSLPackage.PRINT__PRINT_VALUE:
        return getPrintValue();
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
      case DataCentricDSLPackage.PRINT__PRINT_VALUE:
        setPrintValue((String)newValue);
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
      case DataCentricDSLPackage.PRINT__PRINT_VALUE:
        setPrintValue(PRINT_VALUE_EDEFAULT);
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
      case DataCentricDSLPackage.PRINT__PRINT_VALUE:
        return PRINT_VALUE_EDEFAULT == null ? printValue != null : !PRINT_VALUE_EDEFAULT.equals(printValue);
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
    result.append(" (printValue: ");
    result.append(printValue);
    result.append(')');
    return result.toString();
  }

} //PrintImpl
