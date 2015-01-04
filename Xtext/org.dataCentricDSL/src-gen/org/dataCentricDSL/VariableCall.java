/**
 */
package org.dataCentricDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.VariableCall#getVariableCall <em>Variable Call</em>}</li>
 *   <li>{@link org.dataCentricDSL.VariableCall#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableCall()
 * @model
 * @generated
 */
public interface VariableCall extends Query, Print, ConditionElement, MultiAssignRightOperand, PostfixOperation
{
  /**
   * Returns the value of the '<em><b>Variable Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Call</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Call</em>' attribute.
   * @see #setVariableCall(String)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableCall_VariableCall()
   * @model
   * @generated
   */
  String getVariableCall();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.VariableCall#getVariableCall <em>Variable Call</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Call</em>' attribute.
   * @see #getVariableCall()
   * @generated
   */
  void setVariableCall(String value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableCall_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.VariableCall#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // VariableCall
