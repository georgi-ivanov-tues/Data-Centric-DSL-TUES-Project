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
 *   <li>{@link org.dataCentricDSL.Condition#getOp <em>Op</em>}</li>
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

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getCondition_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.Condition#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // Condition
