/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.Condition#getConditionElements <em>Condition Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.dataCentricDSL.ConditionElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Elements</em>' containment reference list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getCondition_ConditionElements()
   * @model containment="true"
   * @generated
   */
  EList<ConditionElement> getConditionElements();

} // Condition
