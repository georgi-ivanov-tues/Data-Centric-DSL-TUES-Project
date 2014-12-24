/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.IfStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.dataCentricDSL.IfStatement#getIfElements <em>If Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends CompoundStatement
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
   * The list contents are of type {@link org.dataCentricDSL.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getIfStatement_Condition()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getCondition();

  /**
   * Returns the value of the '<em><b>If Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.dataCentricDSL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Elements</em>' containment reference list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getIfStatement_IfElements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getIfElements();

} // IfStatement
