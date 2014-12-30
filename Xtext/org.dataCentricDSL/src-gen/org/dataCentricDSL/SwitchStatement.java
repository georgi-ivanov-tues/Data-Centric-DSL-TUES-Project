/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.SwitchStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.dataCentricDSL.SwitchStatement#getCases <em>Cases</em>}</li>
 *   <li>{@link org.dataCentricDSL.SwitchStatement#getSwitchElements <em>Switch Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getSwitchStatement()
 * @model
 * @generated
 */
public interface SwitchStatement extends CompoundStatement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(VariableCall)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getSwitchStatement_Name()
   * @model containment="true"
   * @generated
   */
  VariableCall getName();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.SwitchStatement#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(VariableCall value);

  /**
   * Returns the value of the '<em><b>Cases</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' attribute list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getSwitchStatement_Cases()
   * @model unique="false"
   * @generated
   */
  EList<String> getCases();

  /**
   * Returns the value of the '<em><b>Switch Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.dataCentricDSL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Elements</em>' containment reference list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getSwitchStatement_SwitchElements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getSwitchElements();

} // SwitchStatement
