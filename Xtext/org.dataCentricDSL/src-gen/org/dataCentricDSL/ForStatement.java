/**
 */
package org.dataCentricDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.ForStatement#getForVar <em>For Var</em>}</li>
 *   <li>{@link org.dataCentricDSL.ForStatement#getForCondition <em>For Condition</em>}</li>
 *   <li>{@link org.dataCentricDSL.ForStatement#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends CompoundStatement
{
  /**
   * Returns the value of the '<em><b>For Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Var</em>' containment reference.
   * @see #setForVar(VariableDefinition)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getForStatement_ForVar()
   * @model containment="true"
   * @generated
   */
  VariableDefinition getForVar();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.ForStatement#getForVar <em>For Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Var</em>' containment reference.
   * @see #getForVar()
   * @generated
   */
  void setForVar(VariableDefinition value);

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
   * @see org.dataCentricDSL.DataCentricDSLPackage#getForStatement_ForCondition()
   * @model containment="true"
   * @generated
   */
  StatementCondition getForCondition();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.ForStatement#getForCondition <em>For Condition</em>}' containment reference.
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
   * @see #setOperation(SimpleStatement)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getForStatement_Operation()
   * @model containment="true"
   * @generated
   */
  SimpleStatement getOperation();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.ForStatement#getOperation <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' containment reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(SimpleStatement value);

} // ForStatement
