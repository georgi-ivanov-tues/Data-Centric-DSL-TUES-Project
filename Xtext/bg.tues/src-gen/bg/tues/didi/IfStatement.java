/**
 */
package bg.tues.didi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bg.tues.didi.IfStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see bg.tues.didi.DidiPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends CompoundStatement
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
   * The list contents are of type {@link bg.tues.didi.ConditionStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference list.
   * @see bg.tues.didi.DidiPackage#getIfStatement_Condition()
   * @model containment="true"
   * @generated
   */
  EList<ConditionStatement> getCondition();

} // IfStatement
