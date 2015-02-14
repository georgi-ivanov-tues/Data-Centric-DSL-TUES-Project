/**
 */
package bg.tues.didi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bg.tues.didi.PrintFunction#getPrintArgument <em>Print Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see bg.tues.didi.DidiPackage#getPrintFunction()
 * @model
 * @generated
 */
public interface PrintFunction extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Print Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Print Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Print Argument</em>' containment reference.
   * @see #setPrintArgument(PrintArgument)
   * @see bg.tues.didi.DidiPackage#getPrintFunction_PrintArgument()
   * @model containment="true"
   * @generated
   */
  PrintArgument getPrintArgument();

  /**
   * Sets the value of the '{@link bg.tues.didi.PrintFunction#getPrintArgument <em>Print Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Print Argument</em>' containment reference.
   * @see #getPrintArgument()
   * @generated
   */
  void setPrintArgument(PrintArgument value);

} // PrintFunction
