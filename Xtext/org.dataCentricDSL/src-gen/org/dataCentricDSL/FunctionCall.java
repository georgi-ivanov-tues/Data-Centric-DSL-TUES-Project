/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.FunctionCall#getCalledFunctionName <em>Called Function Name</em>}</li>
 *   <li>{@link org.dataCentricDSL.FunctionCall#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends SimpleStatement, Expression
{
  /**
   * Returns the value of the '<em><b>Called Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Called Function Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Called Function Name</em>' attribute.
   * @see #setCalledFunctionName(String)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getFunctionCall_CalledFunctionName()
   * @model
   * @generated
   */
  String getCalledFunctionName();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.FunctionCall#getCalledFunctionName <em>Called Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Called Function Name</em>' attribute.
   * @see #getCalledFunctionName()
   * @generated
   */
  void setCalledFunctionName(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.dataCentricDSL.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getFunctionCall_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArguments();

} // FunctionCall
