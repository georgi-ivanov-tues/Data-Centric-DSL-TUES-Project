/**
 */
package bg.tues.didi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bg.tues.didi.ConditionStatement#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see bg.tues.didi.DidiPackage#getConditionStatement()
 * @model
 * @generated
 */
public interface ConditionStatement extends PrintParam
{
  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link bg.tues.didi.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see bg.tues.didi.DidiPackage#getConditionStatement_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getConditions();

} // ConditionStatement
