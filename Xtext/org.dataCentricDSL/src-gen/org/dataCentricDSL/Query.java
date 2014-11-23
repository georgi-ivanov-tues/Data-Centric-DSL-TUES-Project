/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.Query#getQueryParams <em>Query Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends PredefinedFunction
{
  /**
   * Returns the value of the '<em><b>Query Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Params</em>' containment reference list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getQuery_QueryParams()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getQueryParams();

} // Query
