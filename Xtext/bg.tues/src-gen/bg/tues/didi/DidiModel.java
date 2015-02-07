/**
 */
package bg.tues.didi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bg.tues.didi.DidiModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see bg.tues.didi.DidiPackage#getDidiModel()
 * @model
 * @generated
 */
public interface DidiModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link bg.tues.didi.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see bg.tues.didi.DidiPackage#getDidiModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElements();

} // DidiModel
