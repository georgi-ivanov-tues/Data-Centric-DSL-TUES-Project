/**
 */
package bg.tues.didi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bg.tues.didi.ForStatement#getForVar <em>For Var</em>}</li>
 *   <li>{@link bg.tues.didi.ForStatement#getForCondition <em>For Condition</em>}</li>
 *   <li>{@link bg.tues.didi.ForStatement#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see bg.tues.didi.DidiPackage#getForStatement()
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
   * @see bg.tues.didi.DidiPackage#getForStatement_ForVar()
   * @model containment="true"
   * @generated
   */
  VariableDefinition getForVar();

  /**
   * Sets the value of the '{@link bg.tues.didi.ForStatement#getForVar <em>For Var</em>}' containment reference.
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
   * @see #setForCondition(ConditionStatement)
   * @see bg.tues.didi.DidiPackage#getForStatement_ForCondition()
   * @model containment="true"
   * @generated
   */
  ConditionStatement getForCondition();

  /**
   * Sets the value of the '{@link bg.tues.didi.ForStatement#getForCondition <em>For Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Condition</em>' containment reference.
   * @see #getForCondition()
   * @generated
   */
  void setForCondition(ConditionStatement value);

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
   * @see bg.tues.didi.DidiPackage#getForStatement_Operation()
   * @model containment="true"
   * @generated
   */
  SimpleStatement getOperation();

  /**
   * Sets the value of the '{@link bg.tues.didi.ForStatement#getOperation <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' containment reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(SimpleStatement value);

} // ForStatement
