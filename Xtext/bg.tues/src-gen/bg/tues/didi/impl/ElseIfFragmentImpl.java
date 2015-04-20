/**
 */
package bg.tues.didi.impl;

import bg.tues.didi.ConditionStatement;
import bg.tues.didi.DidiPackage;
import bg.tues.didi.ElseIfFragment;
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
 * An implementation of the model object '<em><b>Else If Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bg.tues.didi.impl.ElseIfFragmentImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link bg.tues.didi.impl.ElseIfFragmentImpl#getElseIfStatements <em>Else If Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElseIfFragmentImpl extends MinimalEObjectImpl.Container implements ElseIfFragment
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
   * The cached value of the '{@link #getElseIfStatements() <em>Else If Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseIfStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> elseIfStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElseIfFragmentImpl()
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
    return DidiPackage.Literals.ELSE_IF_FRAGMENT;
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
      condition = new EObjectContainmentEList<ConditionStatement>(ConditionStatement.class, this, DidiPackage.ELSE_IF_FRAGMENT__CONDITION);
    }
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getElseIfStatements()
  {
    if (elseIfStatements == null)
    {
      elseIfStatements = new EObjectContainmentEList<Statement>(Statement.class, this, DidiPackage.ELSE_IF_FRAGMENT__ELSE_IF_STATEMENTS);
    }
    return elseIfStatements;
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
      case DidiPackage.ELSE_IF_FRAGMENT__CONDITION:
        return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
      case DidiPackage.ELSE_IF_FRAGMENT__ELSE_IF_STATEMENTS:
        return ((InternalEList<?>)getElseIfStatements()).basicRemove(otherEnd, msgs);
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
      case DidiPackage.ELSE_IF_FRAGMENT__CONDITION:
        return getCondition();
      case DidiPackage.ELSE_IF_FRAGMENT__ELSE_IF_STATEMENTS:
        return getElseIfStatements();
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
      case DidiPackage.ELSE_IF_FRAGMENT__CONDITION:
        getCondition().clear();
        getCondition().addAll((Collection<? extends ConditionStatement>)newValue);
        return;
      case DidiPackage.ELSE_IF_FRAGMENT__ELSE_IF_STATEMENTS:
        getElseIfStatements().clear();
        getElseIfStatements().addAll((Collection<? extends Statement>)newValue);
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
      case DidiPackage.ELSE_IF_FRAGMENT__CONDITION:
        getCondition().clear();
        return;
      case DidiPackage.ELSE_IF_FRAGMENT__ELSE_IF_STATEMENTS:
        getElseIfStatements().clear();
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
      case DidiPackage.ELSE_IF_FRAGMENT__CONDITION:
        return condition != null && !condition.isEmpty();
      case DidiPackage.ELSE_IF_FRAGMENT__ELSE_IF_STATEMENTS:
        return elseIfStatements != null && !elseIfStatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ElseIfFragmentImpl
