/**
 */
package bg.tues.didi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bg.tues.didi.VariableCall#getCalledVariableName <em>Called Variable Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see bg.tues.didi.DidiPackage#getVariableCall()
 * @model
 * @generated
 */
public interface VariableCall extends Expression
{
  /**
   * Returns the value of the '<em><b>Called Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Called Variable Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Called Variable Name</em>' attribute.
   * @see #setCalledVariableName(String)
   * @see bg.tues.didi.DidiPackage#getVariableCall_CalledVariableName()
   * @model
   * @generated
   */
  String getCalledVariableName();

  /**
   * Sets the value of the '{@link bg.tues.didi.VariableCall#getCalledVariableName <em>Called Variable Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Called Variable Name</em>' attribute.
   * @see #getCalledVariableName()
   * @generated
   */
  void setCalledVariableName(String value);

} // VariableCall
