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
 *   <li>{@link org.dataCentricDSL.Query#getQueryParam <em>Query Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends ProgramElement, PrintParameter
{
  /**
   * Returns the value of the '<em><b>Query Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Param</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Param</em>' attribute.
   * @see #setQueryParam(String)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getQuery_QueryParam()
   * @model
   * @generated
   */
  String getQueryParam();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.Query#getQueryParam <em>Query Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Param</em>' attribute.
   * @see #getQueryParam()
   * @generated
   */
  void setQueryParam(String value);

} // Query
