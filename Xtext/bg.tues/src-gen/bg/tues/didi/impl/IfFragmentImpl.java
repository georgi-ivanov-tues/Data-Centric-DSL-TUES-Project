/**
 */
package bg.tues.didi.impl;

import bg.tues.didi.ConditionStatement;
import bg.tues.didi.DidiPackage;
import bg.tues.didi.IfFragment;
import bg.tues.didi.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bg.tues.didi.impl.IfFragmentImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link bg.tues.didi.impl.IfFragmentImpl#getIfStatements <em>If Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfFragmentImpl extends MinimalEObjectImpl.Container implements IfFragment
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
   * The cached value of the '{@link #getIfStatements() <em>If Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> ifStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfFragmentImpl()
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
    return DidiPackage.Literals.IF_FRAGMENT;
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
      condition = new EObjectContainmentEList<ConditionStatement>(ConditionStatement.class, this, DidiPackage.IF_FRAGMENT__CONDITION);
    }
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getIfStatements()
  {
    if (ifStatements == null)
    {
      ifStatements = new EObjectContainmentEList<Statement>(Statement.class, this, DidiPackage.IF_FRAGMENT__IF_STATEMENTS);
    }
    return ifStatements;
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
      case DidiPackage.IF_FRAGMENT__CONDITION:
        return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
      case DidiPackage.IF_FRAGMENT__IF_STATEMENTS:
        return ((InternalEList<?>)getIfStatements()).basicRemove(otherEnd, msgs);
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
      case DidiPackage.IF_FRAGMENT__CONDITION:
        return getCondition();
      case DidiPackage.IF_FRAGMENT__IF_STATEMENTS:
        return getIfStatements();
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
      case DidiPackage.IF_FRAGMENT__CONDITION:
        getCondition().clear();
        getCondition().addAll((Collection<? extends ConditionStatement>)newValue);
        return;
      case DidiPackage.IF_FRAGMENT__IF_STATEMENTS:
        getIfStatements().clear();
        getIfStatements().addAll((Collection<? extends Statement>)newValue);
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
      case DidiPackage.IF_FRAGMENT__CONDITION:
        getCondition().clear();
        return;
      case DidiPackage.IF_FRAGMENT__IF_STATEMENTS:
        getIfStatements().clear();
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
      case DidiPackage.IF_FRAGMENT__CONDITION:
        return condition != null && !condition.isEmpty();
      case DidiPackage.IF_FRAGMENT__IF_STATEMENTS:
        return ifStatements != null && !ifStatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IfFragmentImpl
