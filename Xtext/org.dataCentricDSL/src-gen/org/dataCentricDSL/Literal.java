/**
 */
package org.dataCentricDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.Literal#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends PrintParameter, VariableValue
{
  /**
   * Returns the value of the '<em><b>Literal Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal Value</em>' attribute.
   * @see #setLiteralValue(String)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getLiteral_LiteralValue()
   * @model
   * @generated
   */
  String getLiteralValue();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.Literal#getLiteralValue <em>Literal Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal Value</em>' attribute.
   * @see #getLiteralValue()
   * @generated
   */
  void setLiteralValue(String value);

} // Literal
