/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.StatementCondition#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getStatementCondition()
 * @model
 * @generated
 */
public interface StatementCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link org.dataCentricDSL.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getStatementCondition_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getConditions();

} // StatementCondition
