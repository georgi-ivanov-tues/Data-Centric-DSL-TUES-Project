/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.common.util.EList;

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
   * Returns the value of the '<em><b>Query Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Params</em>' attribute list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getQuery_QueryParams()
   * @model unique="false"
   * @generated
   */
  EList<String> getQueryParams();

} // Query
