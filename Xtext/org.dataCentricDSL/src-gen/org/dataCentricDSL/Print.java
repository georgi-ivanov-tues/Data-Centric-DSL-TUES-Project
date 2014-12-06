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
 *   <li>{@link org.dataCentricDSL.Print#getPrintValue <em>Print Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getPrint()
 * @model
 * @generated
 */
public interface Print extends EObject
{
  /**
   * Returns the value of the '<em><b>Print Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Print Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Print Value</em>' attribute.
   * @see #setPrintValue(String)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getPrint_PrintValue()
   * @model
   * @generated
   */
  String getPrintValue();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.Print#getPrintValue <em>Print Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Print Value</em>' attribute.
   * @see #getPrintValue()
   * @generated
   */
  void setPrintValue(String value);

} // Print
