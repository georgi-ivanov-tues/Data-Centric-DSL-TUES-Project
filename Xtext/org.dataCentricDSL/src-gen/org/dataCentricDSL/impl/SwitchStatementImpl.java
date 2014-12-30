/**
 */
package org.dataCentricDSL.impl;

import java.util.Collection;

import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.Statement;
import org.dataCentricDSL.SwitchStatement;
import org.dataCentricDSL.VariableCall;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.dataCentricDSL.impl.SwitchStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.SwitchStatementImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.SwitchStatementImpl#getSwitchElements <em>Switch Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchStatementImpl extends CompoundStatementImpl implements SwitchStatement
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected VariableCall name;

  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<String> cases;

  /**
   * The cached value of the '{@link #getSwitchElements() <em>Switch Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitchElements()
   * @generated
   * @ordered
   */
  protected EList<Statement> switchElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchStatementImpl()
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
    return DataCentricDSLPackage.Literals.SWITCH_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableCall getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(VariableCall newName, NotificationChain msgs)
  {
    VariableCall oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.SWITCH_STATEMENT__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(VariableCall newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.SWITCH_STATEMENT__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.SWITCH_STATEMENT__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.SWITCH_STATEMENT__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCases()
  {
    if (cases == null)
    {
      cases = new EDataTypeEList<String>(String.class, this, DataCentricDSLPackage.SWITCH_STATEMENT__CASES);
    }
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getSwitchElements()
  {
    if (switchElements == null)
    {
      switchElements = new EObjectContainmentEList<Statement>(Statement.class, this, DataCentricDSLPackage.SWITCH_STATEMENT__SWITCH_ELEMENTS);
    }
    return switchElements;
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
      case DataCentricDSLPackage.SWITCH_STATEMENT__NAME:
        return basicSetName(null, msgs);
      case DataCentricDSLPackage.SWITCH_STATEMENT__SWITCH_ELEMENTS:
        return ((InternalEList<?>)getSwitchElements()).basicRemove(otherEnd, msgs);
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
      case DataCentricDSLPackage.SWITCH_STATEMENT__NAME:
        return getName();
      case DataCentricDSLPackage.SWITCH_STATEMENT__CASES:
        return getCases();
      case DataCentricDSLPackage.SWITCH_STATEMENT__SWITCH_ELEMENTS:
        return getSwitchElements();
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
      case DataCentricDSLPackage.SWITCH_STATEMENT__NAME:
        setName((VariableCall)newValue);
        return;
      case DataCentricDSLPackage.SWITCH_STATEMENT__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends String>)newValue);
        return;
      case DataCentricDSLPackage.SWITCH_STATEMENT__SWITCH_ELEMENTS:
        getSwitchElements().clear();
        getSwitchElements().addAll((Collection<? extends Statement>)newValue);
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
      case DataCentricDSLPackage.SWITCH_STATEMENT__NAME:
        setName((VariableCall)null);
        return;
      case DataCentricDSLPackage.SWITCH_STATEMENT__CASES:
        getCases().clear();
        return;
      case DataCentricDSLPackage.SWITCH_STATEMENT__SWITCH_ELEMENTS:
        getSwitchElements().clear();
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
      case DataCentricDSLPackage.SWITCH_STATEMENT__NAME:
        return name != null;
      case DataCentricDSLPackage.SWITCH_STATEMENT__CASES:
        return cases != null && !cases.isEmpty();
      case DataCentricDSLPackage.SWITCH_STATEMENT__SWITCH_ELEMENTS:
        return switchElements != null && !switchElements.isEmpty();
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
    result.append(" (cases: ");
    result.append(cases);
    result.append(')');
    return result.toString();
  }

} //SwitchStatementImpl
