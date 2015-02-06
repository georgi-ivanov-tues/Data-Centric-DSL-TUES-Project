/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.FunctionDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.dataCentricDSL.FunctionDefinition#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.dataCentricDSL.FunctionDefinition#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends CompoundStatement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getFunctionDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.FunctionDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' attribute list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getFunctionDefinition_Arguments()
   * @model unique="false"
   * @generated
   */
  EList<String> getArguments();

  /**
   * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Value</em>' containment reference.
   * @see #setReturnValue(ConditionStatement)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getFunctionDefinition_ReturnValue()
   * @model containment="true"
   * @generated
   */
  ConditionStatement getReturnValue();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.FunctionDefinition#getReturnValue <em>Return Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Value</em>' containment reference.
   * @see #getReturnValue()
   * @generated
   */
  void setReturnValue(ConditionStatement value);

} // FunctionDefinition
