/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.StatementCondition#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.dataCentricDSL.StatementCondition#getStatementCondition <em>Statement Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getStatementCondition()
 * @model
 * @generated
 */
public interface StatementCondition extends WhileStatement
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.dataCentricDSL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getStatementCondition_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * Returns the value of the '<em><b>Statement Condition</b></em>' containment reference list.
   * The list contents are of type {@link org.dataCentricDSL.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement Condition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement Condition</em>' containment reference list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getStatementCondition_StatementCondition()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getStatementCondition();

} // StatementCondition
