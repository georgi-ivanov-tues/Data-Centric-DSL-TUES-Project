/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Multi Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.ForMultiAssign#getLeft <em>Left</em>}</li>
 *   <li>{@link org.dataCentricDSL.ForMultiAssign#getOp <em>Op</em>}</li>
 *   <li>{@link org.dataCentricDSL.ForMultiAssign#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getForMultiAssign()
 * @model
 * @generated
 */
public interface ForMultiAssign extends EObject
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
   * @see org.dataCentricDSL.DataCentricDSLPackage#getForMultiAssign_Left()
   * @model containment="true"
   * @generated
   */
  VariableCall getLeft();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.ForMultiAssign#getLeft <em>Left</em>}' containment reference.
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
   * @see org.dataCentricDSL.DataCentricDSLPackage#getForMultiAssign_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.ForMultiAssign#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' attribute.
   * @see #setRight(int)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getForMultiAssign_Right()
   * @model
   * @generated
   */
  int getRight();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.ForMultiAssign#getRight <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' attribute.
   * @see #getRight()
   * @generated
   */
  void setRight(int value);

} // ForMultiAssign
