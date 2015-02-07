/**
 */
package bg.tues.didi.impl;

import bg.tues.didi.DidiPackage;
import bg.tues.didi.VariableCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bg.tues.didi.impl.VariableCallImpl#getCalledVariableName <em>Called Variable Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableCallImpl extends ExpressionImpl implements VariableCall
{
  /**
   * The default value of the '{@link #getCalledVariableName() <em>Called Variable Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalledVariableName()
   * @generated
   * @ordered
   */
  protected static final String CALLED_VARIABLE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCalledVariableName() <em>Called Variable Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalledVariableName()
   * @generated
   * @ordered
   */
  protected String calledVariableName = CALLED_VARIABLE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableCallImpl()
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
    return DidiPackage.Literals.VARIABLE_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCalledVariableName()
  {
    return calledVariableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCalledVariableName(String newCalledVariableName)
  {
    String oldCalledVariableName = calledVariableName;
    calledVariableName = newCalledVariableName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DidiPackage.VARIABLE_CALL__CALLED_VARIABLE_NAME, oldCalledVariableName, calledVariableName));
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
      case DidiPackage.VARIABLE_CALL__CALLED_VARIABLE_NAME:
        return getCalledVariableName();
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
      case DidiPackage.VARIABLE_CALL__CALLED_VARIABLE_NAME:
        setCalledVariableName((String)newValue);
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
      case DidiPackage.VARIABLE_CALL__CALLED_VARIABLE_NAME:
        setCalledVariableName(CALLED_VARIABLE_NAME_EDEFAULT);
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
      case DidiPackage.VARIABLE_CALL__CALLED_VARIABLE_NAME:
        return CALLED_VARIABLE_NAME_EDEFAULT == null ? calledVariableName != null : !CALLED_VARIABLE_NAME_EDEFAULT.equals(calledVariableName);
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
    result.append(" (calledVariableName: ");
    result.append(calledVariableName);
    result.append(')');
    return result.toString();
  }

} //VariableCallImpl
