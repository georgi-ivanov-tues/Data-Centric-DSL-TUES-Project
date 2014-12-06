/**
 */
package org.dataCentricDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.VariableParam#getVariableStringParam <em>Variable String Param</em>}</li>
 *   <li>{@link org.dataCentricDSL.VariableParam#getVariableVarParam <em>Variable Var Param</em>}</li>
 *   <li>{@link org.dataCentricDSL.VariableParam#getVariableQueryParam <em>Variable Query Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableParam()
 * @model
 * @generated
 */
public interface VariableParam extends VariableDecl
{
  /**
   * Returns the value of the '<em><b>Variable String Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable String Param</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable String Param</em>' attribute.
   * @see #setVariableStringParam(String)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableParam_VariableStringParam()
   * @model
   * @generated
   */
  String getVariableStringParam();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.VariableParam#getVariableStringParam <em>Variable String Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable String Param</em>' attribute.
   * @see #getVariableStringParam()
   * @generated
   */
  void setVariableStringParam(String value);

  /**
   * Returns the value of the '<em><b>Variable Var Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Var Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Var Param</em>' containment reference.
   * @see #setVariableVarParam(VariableCall)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableParam_VariableVarParam()
   * @model containment="true"
   * @generated
   */
  VariableCall getVariableVarParam();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.VariableParam#getVariableVarParam <em>Variable Var Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Var Param</em>' containment reference.
   * @see #getVariableVarParam()
   * @generated
   */
  void setVariableVarParam(VariableCall value);

  /**
   * Returns the value of the '<em><b>Variable Query Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Query Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Query Param</em>' containment reference.
   * @see #setVariableQueryParam(Query)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableParam_VariableQueryParam()
   * @model containment="true"
   * @generated
   */
  Query getVariableQueryParam();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.VariableParam#getVariableQueryParam <em>Variable Query Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Query Param</em>' containment reference.
   * @see #getVariableQueryParam()
   * @generated
   */
  void setVariableQueryParam(Query value);

} // VariableParam
