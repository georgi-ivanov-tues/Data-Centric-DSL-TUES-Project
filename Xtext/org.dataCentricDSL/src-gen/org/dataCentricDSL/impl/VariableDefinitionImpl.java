/**
 */
package org.dataCentricDSL.impl;

import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.VariableDecl;
import org.dataCentricDSL.VariableDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.dataCentricDSL.impl.VariableDefinitionImpl#isIsGlobal <em>Is Global</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.VariableDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.VariableDefinitionImpl#getVariableValue <em>Variable Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDefinitionImpl extends SimpleStatementImpl implements VariableDefinition
{
  /**
   * The default value of the '{@link #isIsGlobal() <em>Is Global</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsGlobal()
   * @generated
   * @ordered
   */
  protected static final boolean IS_GLOBAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsGlobal() <em>Is Global</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsGlobal()
   * @generated
   * @ordered
   */
  protected boolean isGlobal = IS_GLOBAL_EDEFAULT;

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
   * The cached value of the '{@link #getVariableValue() <em>Variable Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableValue()
   * @generated
   * @ordered
   */
  protected VariableDecl variableValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDefinitionImpl()
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
    return DataCentricDSLPackage.Literals.VARIABLE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsGlobal()
  {
    return isGlobal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsGlobal(boolean newIsGlobal)
  {
    boolean oldIsGlobal = isGlobal;
    isGlobal = newIsGlobal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_DEFINITION__IS_GLOBAL, oldIsGlobal, isGlobal));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl getVariableValue()
  {
    return variableValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableValue(VariableDecl newVariableValue, NotificationChain msgs)
  {
    VariableDecl oldVariableValue = variableValue;
    variableValue = newVariableValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_DEFINITION__VARIABLE_VALUE, oldVariableValue, newVariableValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableValue(VariableDecl newVariableValue)
  {
    if (newVariableValue != variableValue)
    {
      NotificationChain msgs = null;
      if (variableValue != null)
        msgs = ((InternalEObject)variableValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_DEFINITION__VARIABLE_VALUE, null, msgs);
      if (newVariableValue != null)
        msgs = ((InternalEObject)newVariableValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCentricDSLPackage.VARIABLE_DEFINITION__VARIABLE_VALUE, null, msgs);
      msgs = basicSetVariableValue(newVariableValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.VARIABLE_DEFINITION__VARIABLE_VALUE, newVariableValue, newVariableValue));
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
      case DataCentricDSLPackage.VARIABLE_DEFINITION__VARIABLE_VALUE:
        return basicSetVariableValue(null, msgs);
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
      case DataCentricDSLPackage.VARIABLE_DEFINITION__IS_GLOBAL:
        return isIsGlobal();
      case DataCentricDSLPackage.VARIABLE_DEFINITION__NAME:
        return getName();
      case DataCentricDSLPackage.VARIABLE_DEFINITION__VARIABLE_VALUE:
        return getVariableValue();
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
      case DataCentricDSLPackage.VARIABLE_DEFINITION__IS_GLOBAL:
        setIsGlobal((Boolean)newValue);
        return;
      case DataCentricDSLPackage.VARIABLE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case DataCentricDSLPackage.VARIABLE_DEFINITION__VARIABLE_VALUE:
        setVariableValue((VariableDecl)newValue);
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
      case DataCentricDSLPackage.VARIABLE_DEFINITION__IS_GLOBAL:
        setIsGlobal(IS_GLOBAL_EDEFAULT);
        return;
      case DataCentricDSLPackage.VARIABLE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataCentricDSLPackage.VARIABLE_DEFINITION__VARIABLE_VALUE:
        setVariableValue((VariableDecl)null);
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
      case DataCentricDSLPackage.VARIABLE_DEFINITION__IS_GLOBAL:
        return isGlobal != IS_GLOBAL_EDEFAULT;
      case DataCentricDSLPackage.VARIABLE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataCentricDSLPackage.VARIABLE_DEFINITION__VARIABLE_VALUE:
        return variableValue != null;
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
    result.append(" (isGlobal: ");
    result.append(isGlobal);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VariableDefinitionImpl
