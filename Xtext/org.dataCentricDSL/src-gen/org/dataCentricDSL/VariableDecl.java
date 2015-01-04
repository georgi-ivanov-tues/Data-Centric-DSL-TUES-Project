/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.VariableDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.dataCentricDSL.VariableDecl#getVariableValue <em>Variable Value</em>}</li>
 *   <li>{@link org.dataCentricDSL.VariableDecl#getForCondition <em>For Condition</em>}</li>
 *   <li>{@link org.dataCentricDSL.VariableDecl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.dataCentricDSL.VariableDecl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableDecl()
 * @model
 * @generated
 */
public interface VariableDecl extends SimpleStatement, ForStatement
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
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.VariableDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variable Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Value</em>' containment reference.
   * @see #setVariableValue(SimpleStatement)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableDecl_VariableValue()
   * @model containment="true"
   * @generated
   */
  SimpleStatement getVariableValue();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.VariableDecl#getVariableValue <em>Variable Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Value</em>' containment reference.
   * @see #getVariableValue()
   * @generated
   */
  void setVariableValue(SimpleStatement value);

  /**
   * Returns the value of the '<em><b>For Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Condition</em>' containment reference.
   * @see #setForCondition(StatementCondition)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableDecl_ForCondition()
   * @model containment="true"
   * @generated
   */
  StatementCondition getForCondition();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.VariableDecl#getForCondition <em>For Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Condition</em>' containment reference.
   * @see #getForCondition()
   * @generated
   */
  void setForCondition(StatementCondition value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference.
   * @see #setOperation(EObject)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableDecl_Operation()
   * @model containment="true"
   * @generated
   */
  EObject getOperation();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.VariableDecl#getOperation <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' containment reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(EObject value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.dataCentricDSL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableDecl_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // VariableDecl
