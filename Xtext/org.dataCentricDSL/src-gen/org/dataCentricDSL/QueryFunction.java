/**
 */
package org.dataCentricDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.QueryFunction#getQueryParam <em>Query Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getQueryFunction()
 * @model
 * @generated
 */
public interface QueryFunction extends SimpleStatement, VariableParam, PrintParam
{
  /**
   * Returns the value of the '<em><b>Query Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Param</em>' containment reference.
   * @see #setQueryParam(ConditionStatement)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getQueryFunction_QueryParam()
   * @model containment="true"
   * @generated
   */
  ConditionStatement getQueryParam();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.QueryFunction#getQueryParam <em>Query Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Param</em>' containment reference.
   * @see #getQueryParam()
   * @generated
   */
  void setQueryParam(ConditionStatement value);

} // QueryFunction
