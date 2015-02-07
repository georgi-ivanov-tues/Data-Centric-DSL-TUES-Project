/**
 */
package bg.tues.didi.impl;

import bg.tues.didi.DidiPackage;
import bg.tues.didi.PostfixOperation;
import bg.tues.didi.VariableCall;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postfix Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bg.tues.didi.impl.PostfixOperationImpl#getCall <em>Call</em>}</li>
 *   <li>{@link bg.tues.didi.impl.PostfixOperationImpl#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostfixOperationImpl extends SimpleStatementImpl implements PostfixOperation
{
  /**
   * The cached value of the '{@link #getCall() <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCall()
   * @generated
   * @ordered
   */
  protected VariableCall call;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PostfixOperationImpl()
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
    return DidiPackage.Literals.POSTFIX_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableCall getCall()
  {
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCall(VariableCall newCall, NotificationChain msgs)
  {
    VariableCall oldCall = call;
    call = newCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DidiPackage.POSTFIX_OPERATION__CALL, oldCall, newCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCall(VariableCall newCall)
  {
    if (newCall != call)
    {
      NotificationChain msgs = null;
      if (call != null)
        msgs = ((InternalEObject)call).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DidiPackage.POSTFIX_OPERATION__CALL, null, msgs);
      if (newCall != null)
        msgs = ((InternalEObject)newCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DidiPackage.POSTFIX_OPERATION__CALL, null, msgs);
      msgs = basicSetCall(newCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DidiPackage.POSTFIX_OPERATION__CALL, newCall, newCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DidiPackage.POSTFIX_OPERATION__OP, oldOp, op));
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
      case DidiPackage.POSTFIX_OPERATION__CALL:
        return basicSetCall(null, msgs);
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
      case DidiPackage.POSTFIX_OPERATION__CALL:
        return getCall();
      case DidiPackage.POSTFIX_OPERATION__OP:
        return getOp();
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
      case DidiPackage.POSTFIX_OPERATION__CALL:
        setCall((VariableCall)newValue);
        return;
      case DidiPackage.POSTFIX_OPERATION__OP:
        setOp((String)newValue);
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
      case DidiPackage.POSTFIX_OPERATION__CALL:
        setCall((VariableCall)null);
        return;
      case DidiPackage.POSTFIX_OPERATION__OP:
        setOp(OP_EDEFAULT);
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
      case DidiPackage.POSTFIX_OPERATION__CALL:
        return call != null;
      case DidiPackage.POSTFIX_OPERATION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //PostfixOperationImpl
