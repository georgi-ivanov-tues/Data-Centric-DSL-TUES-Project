/**
 */
package bg.tues.didi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bg.tues.didi.UpdateFunction#getUpdateArgument <em>Update Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see bg.tues.didi.DidiPackage#getUpdateFunction()
 * @model
 * @generated
 */
public interface UpdateFunction extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Update Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Argument</em>' containment reference.
   * @see #setUpdateArgument(ConditionStatement)
   * @see bg.tues.didi.DidiPackage#getUpdateFunction_UpdateArgument()
   * @model containment="true"
   * @generated
   */
  ConditionStatement getUpdateArgument();

  /**
   * Sets the value of the '{@link bg.tues.didi.UpdateFunction#getUpdateArgument <em>Update Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Argument</em>' containment reference.
   * @see #getUpdateArgument()
   * @generated
   */
  void setUpdateArgument(ConditionStatement value);

} // UpdateFunction
