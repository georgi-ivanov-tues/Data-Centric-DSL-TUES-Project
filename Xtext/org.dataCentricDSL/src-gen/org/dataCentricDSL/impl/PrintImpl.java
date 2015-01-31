/**
 */
package org.dataCentricDSL.impl;

import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.Print;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.dataCentricDSL.impl.PrintImpl#getPrintParam <em>Print Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrintImpl extends PrintFunctionImpl implements Print
{
  /**
   * The cached value of the '{@link #getPrintParam() <em>Print Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrintParam()
   * @generated
   * @ordered
   */
  protected EObject printParam;

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
  public EObject getPrintParam()
  {
    return printParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrintParam(EObject newPrintParam, NotificationChain msgs)
  {
    EObject oldPrintParam = printParam;
    printParam = newPrintParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.PRINT__PRINT_PARAM, oldPrintParam, newPrintParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrintParam(EObject newPrintParam)
  {
    if (newPrintParam != printParam)
    {
      NotificationChain msgs = null;
      if (printParam != null)
        msgs = ((InternalEObject)printParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.PRINT__PRINT_PARAM, null, msgs);
      if (newPrintParam != null)
        msgs = ((InternalEObject)newPrintParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.PRINT__PRINT_PARAM, null, msgs);
      msgs = basicSetPrintParam(newPrintParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.PRINT__PRINT_PARAM, newPrintParam, newPrintParam));
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
      case DataCentricDSLPackage.PRINT__PRINT_PARAM:
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
      case DataCentricDSLPackage.PRINT__PRINT_PARAM:
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
      case DataCentricDSLPackage.PRINT__PRINT_PARAM:
        setPrintParam((EObject)newValue);
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
      case DataCentricDSLPackage.PRINT__PRINT_PARAM:
        setPrintParam((EObject)null);
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
      case DataCentricDSLPackage.PRINT__PRINT_PARAM:
        return printParam != null;
    }
    return super.eIsSet(featureID);
  }

} //PrintImpl
