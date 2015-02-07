/**
 */
package bg.tues.didi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bg.tues.didi.WhileStatement#getWhileCondition <em>While Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see bg.tues.didi.DidiPackage#getWhileStatement()
 * @model
 * @generated
 */
public interface WhileStatement extends CompoundStatement
{
  /**
   * Returns the value of the '<em><b>While Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While Condition</em>' containment reference.
   * @see #setWhileCondition(ConditionStatement)
   * @see bg.tues.didi.DidiPackage#getWhileStatement_WhileCondition()
   * @model containment="true"
   * @generated
   */
  ConditionStatement getWhileCondition();

  /**
   * Sets the value of the '{@link bg.tues.didi.WhileStatement#getWhileCondition <em>While Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While Condition</em>' containment reference.
   * @see #getWhileCondition()
   * @generated
   */
  void setWhileCondition(ConditionStatement value);

} // WhileStatement
