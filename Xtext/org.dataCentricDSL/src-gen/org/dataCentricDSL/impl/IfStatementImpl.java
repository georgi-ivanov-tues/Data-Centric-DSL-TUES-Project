/**
 */
package org.dataCentricDSL.impl;

import java.util.Collection;

import org.dataCentricDSL.Condition;
import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.IfStatement;
import org.dataCentricDSL.Statement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.dataCentricDSL.impl.IfStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.IfStatementImpl#getIfElements <em>If Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfStatementImpl extends CompoundStatementImpl implements IfStatement
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected EList<Condition> condition;

  /**
   * The cached value of the '{@link #getIfElements() <em>If Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfElements()
   * @generated
   * @ordered
   */
  protected EList<Statement> ifElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStatementImpl()
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
    return DataCentricDSLPackage.Literals.IF_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getCondition()
  {
    if (condition == null)
    {
      condition = new EObjectContainmentEList<Condition>(Condition.class, this, DataCentricDSLPackage.IF_STATEMENT__CONDITION);
    }
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getIfElements()
  {
    if (ifElements == null)
    {
      ifElements = new EObjectContainmentEList<Statement>(Statement.class, this, DataCentricDSLPackage.IF_STATEMENT__IF_ELEMENTS);
    }
    return ifElements;
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
      case DataCentricDSLPackage.IF_STATEMENT__CONDITION:
        return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
      case DataCentricDSLPackage.IF_STATEMENT__IF_ELEMENTS:
        return ((InternalEList<?>)getIfElements()).basicRemove(otherEnd, msgs);
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
      case DataCentricDSLPackage.IF_STATEMENT__CONDITION:
        return getCondition();
      case DataCentricDSLPackage.IF_STATEMENT__IF_ELEMENTS:
        return getIfElements();
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
      case DataCentricDSLPackage.IF_STATEMENT__CONDITION:
        getCondition().clear();
        getCondition().addAll((Collection<? extends Condition>)newValue);
        return;
      case DataCentricDSLPackage.IF_STATEMENT__IF_ELEMENTS:
        getIfElements().clear();
        getIfElements().addAll((Collection<? extends Statement>)newValue);
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
      case DataCentricDSLPackage.IF_STATEMENT__CONDITION:
        getCondition().clear();
        return;
      case DataCentricDSLPackage.IF_STATEMENT__IF_ELEMENTS:
        getIfElements().clear();
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
      case DataCentricDSLPackage.IF_STATEMENT__CONDITION:
        return condition != null && !condition.isEmpty();
      case DataCentricDSLPackage.IF_STATEMENT__IF_ELEMENTS:
        return ifElements != null && !ifElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IfStatementImpl
