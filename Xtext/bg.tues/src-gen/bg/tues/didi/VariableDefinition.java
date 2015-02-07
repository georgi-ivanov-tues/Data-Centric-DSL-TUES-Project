/**
 */
package bg.tues.didi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bg.tues.didi.VariableDefinition#isIsGlobal <em>Is Global</em>}</li>
 *   <li>{@link bg.tues.didi.VariableDefinition#getName <em>Name</em>}</li>
 *   <li>{@link bg.tues.didi.VariableDefinition#getVariableValue <em>Variable Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see bg.tues.didi.DidiPackage#getVariableDefinition()
 * @model
 * @generated
 */
public interface VariableDefinition extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Is Global</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Global</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Global</em>' attribute.
   * @see #setIsGlobal(boolean)
   * @see bg.tues.didi.DidiPackage#getVariableDefinition_IsGlobal()
   * @model
   * @generated
   */
  boolean isIsGlobal();

  /**
   * Sets the value of the '{@link bg.tues.didi.VariableDefinition#isIsGlobal <em>Is Global</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Global</em>' attribute.
   * @see #isIsGlobal()
   * @generated
   */
  void setIsGlobal(boolean value);

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
   * @see bg.tues.didi.DidiPackage#getVariableDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link bg.tues.didi.VariableDefinition#getName <em>Name</em>}' attribute.
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
   * @see #setVariableValue(VariableParam)
   * @see bg.tues.didi.DidiPackage#getVariableDefinition_VariableValue()
   * @model containment="true"
   * @generated
   */
  VariableParam getVariableValue();

  /**
   * Sets the value of the '{@link bg.tues.didi.VariableDefinition#getVariableValue <em>Variable Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Value</em>' containment reference.
   * @see #getVariableValue()
   * @generated
   */
  void setVariableValue(VariableParam value);

} // VariableDefinition
