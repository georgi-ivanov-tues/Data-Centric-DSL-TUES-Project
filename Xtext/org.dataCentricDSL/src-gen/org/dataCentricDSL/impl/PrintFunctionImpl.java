/**
 */
package org.dataCentricDSL.impl;

import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.PrintFunction;
import org.dataCentricDSL.PrintParam;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Print Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.dataCentricDSL.impl.PrintFunctionImpl#getPrintParam <em>Print Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrintFunctionImpl extends SimpleStatementImpl implements PrintFunction
{
  /**
   * The cached value of the '{@link #getPrintParam() <em>Print Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrintParam()
   * @generated
   * @ordered
   */
  protected PrintParam printParam;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrintFunctionImpl()
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
    return DataCentricDSLPackage.Literals.PRINT_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrintParam getPrintParam()
  {
    return printParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrintParam(PrintParam newPrintParam, NotificationChain msgs)
  {
    PrintParam oldPrintParam = printParam;
    printParam = newPrintParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.PRINT_FUNCTION__PRINT_PARAM, oldPrintParam, newPrintParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrintParam(PrintParam newPrintParam)
  {
    if (newPrintParam != printParam)
    {
      NotificationChain msgs = null;
      if (printParam != null)
        msgs = ((InternalEObject)printParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.PRINT_FUNCTION__PRINT_PARAM, null, msgs);
      if (newPrintParam != null)
        msgs = ((InternalEObject)newPrintParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.PRINT_FUNCTION__PRINT_PARAM, null, msgs);
      msgs = basicSetPrintParam(newPrintParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.PRINT_FUNCTION__PRINT_PARAM, newPrintParam, newPrintParam));
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
      case DataCentricDSLPackage.PRINT_FUNCTION__PRINT_PARAM:
        return basicSetPrintParam(null, msgs);
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
      case DataCentricDSLPackage.PRINT_FUNCTION__PRINT_PARAM:
        return getPrintParam();
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
      case DataCentricDSLPackage.PRINT_FUNCTION__PRINT_PARAM:
        setPrintParam((PrintParam)newValue);
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
      case DataCentricDSLPackage.PRINT_FUNCTION__PRINT_PARAM:
        setPrintParam((PrintParam)null);
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
      case DataCentricDSLPackage.PRINT_FUNCTION__PRINT_PARAM:
        return printParam != null;
    }
    return super.eIsSet(featureID);
  }

} //PrintFunctionImpl
