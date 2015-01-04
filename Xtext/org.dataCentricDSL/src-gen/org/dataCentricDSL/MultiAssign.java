/**
 */
package org.dataCentricDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.MultiAssign#getLeft <em>Left</em>}</li>
 *   <li>{@link org.dataCentricDSL.MultiAssign#getOp <em>Op</em>}</li>
 *   <li>{@link org.dataCentricDSL.MultiAssign#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getMultiAssign()
 * @model
 * @generated
 */
public interface MultiAssign extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(VariableCall)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getMultiAssign_Left()
   * @model containment="true"
   * @generated
   */
  VariableCall getLeft();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.MultiAssign#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(VariableCall value);

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
   * @see org.dataCentricDSL.DataCentricDSLPackage#getMultiAssign_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.MultiAssign#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(MultiAssignRightOperand)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getMultiAssign_Right()
   * @model containment="true"
   * @generated
   */
  MultiAssignRightOperand getRight();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.MultiAssign#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(MultiAssignRightOperand value);

} // MultiAssign
