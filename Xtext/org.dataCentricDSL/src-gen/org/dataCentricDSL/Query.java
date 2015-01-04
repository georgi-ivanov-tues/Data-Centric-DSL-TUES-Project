/**
 */
package org.dataCentricDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.Query#getQueryValue <em>Query Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends SimpleStatement, Print, MultiAssignRightOperand
{
  /**
   * Returns the value of the '<em><b>Query Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Value</em>' attribute.
   * @see #setQueryValue(String)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getQuery_QueryValue()
   * @model
   * @generated
   */
  String getQueryValue();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.Query#getQueryValue <em>Query Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Value</em>' attribute.
   * @see #getQueryValue()
   * @generated
   */
  void setQueryValue(String value);

} // Query
