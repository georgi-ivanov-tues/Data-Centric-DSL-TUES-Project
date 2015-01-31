/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.Print#getPrintParam <em>Print Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getPrint()
 * @model
 * @generated
 */
public interface Print extends PrintFunction
{
  /**
   * Returns the value of the '<em><b>Print Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Print Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Print Param</em>' containment reference.
   * @see #setPrintParam(EObject)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getPrint_PrintParam()
   * @model containment="true"
   * @generated
   */
  EObject getPrintParam();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.Print#getPrintParam <em>Print Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Print Param</em>' containment reference.
   * @see #getPrintParam()
   * @generated
   */
  void setPrintParam(EObject value);

} // Print
