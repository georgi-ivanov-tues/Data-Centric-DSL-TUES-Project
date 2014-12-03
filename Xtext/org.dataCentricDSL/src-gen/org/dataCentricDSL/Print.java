/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.Print#getPrintValue <em>Print Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getPrint()
 * @model
 * @generated
 */
public interface Print extends ProgramElement
{
  /**
   * Returns the value of the '<em><b>Print Value</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Print Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Print Value</em>' containment reference list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getPrint_PrintValue()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getPrintValue();

} // Print
