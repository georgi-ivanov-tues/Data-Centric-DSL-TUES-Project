/**
 */
package bg.tues.didi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else If Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bg.tues.didi.ElseIfFragment#getCondition <em>Condition</em>}</li>
 *   <li>{@link bg.tues.didi.ElseIfFragment#getElseIfStatements <em>Else If Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see bg.tues.didi.DidiPackage#getElseIfFragment()
 * @model
 * @generated
 */
public interface ElseIfFragment extends EObject
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
   * @see bg.tues.didi.DidiPackage#getElseIfFragment_Condition()
   * @model containment="true"
   * @generated
   */
  EList<ConditionStatement> getCondition();

  /**
   * Returns the value of the '<em><b>Else If Statements</b></em>' containment reference list.
   * The list contents are of type {@link bg.tues.didi.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else If Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else If Statements</em>' containment reference list.
   * @see bg.tues.didi.DidiPackage#getElseIfFragment_ElseIfStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElseIfStatements();

} // ElseIfFragment
