/**
 */
package bg.tues.didi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bg.tues.didi.QueryFunction#getQueryArgument <em>Query Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see bg.tues.didi.DidiPackage#getQueryFunction()
 * @model
 * @generated
 */
public interface QueryFunction extends SimpleStatement, VariableValue, PrintArgument
{
  /**
   * Returns the value of the '<em><b>Query Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Argument</em>' containment reference.
   * @see #setQueryArgument(ConditionStatement)
   * @see bg.tues.didi.DidiPackage#getQueryFunction_QueryArgument()
   * @model containment="true"
   * @generated
   */
  ConditionStatement getQueryArgument();

  /**
   * Sets the value of the '{@link bg.tues.didi.QueryFunction#getQueryArgument <em>Query Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Argument</em>' containment reference.
   * @see #getQueryArgument()
   * @generated
   */
  void setQueryArgument(ConditionStatement value);

} // QueryFunction
