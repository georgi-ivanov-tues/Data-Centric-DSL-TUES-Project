/**
 */
package bg.tues.didi.impl;

import bg.tues.didi.ConditionStatement;
import bg.tues.didi.DidiPackage;
import bg.tues.didi.IfStatement;

import java.util.Collection;

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
 *   <li>{@link bg.tues.didi.impl.IfStatementImpl#getCondition <em>Condition</em>}</li>
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
  protected EList<ConditionStatement> condition;

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
    return DidiPackage.Literals.IF_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConditionStatement> getCondition()
  {
    if (condition == null)
    {
      condition = new EObjectContainmentEList<ConditionStatement>(ConditionStatement.class, this, DidiPackage.IF_STATEMENT__CONDITION);
    }
    return condition;
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
      case DidiPackage.IF_STATEMENT__CONDITION:
        return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
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
      case DidiPackage.IF_STATEMENT__CONDITION:
        return getCondition();
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
      case DidiPackage.IF_STATEMENT__CONDITION:
        getCondition().clear();
        getCondition().addAll((Collection<? extends ConditionStatement>)newValue);
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
      case DidiPackage.IF_STATEMENT__CONDITION:
        getCondition().clear();
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
      case DidiPackage.IF_STATEMENT__CONDITION:
        return condition != null && !condition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IfStatementImpl
