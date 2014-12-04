/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.dataCentricDSL.DataCentricDSLPackage
 * @generated
 */
public interface DataCentricDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DataCentricDSLFactory eINSTANCE = org.dataCentricDSL.impl.DataCentricDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Data Centric DSL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Centric DSL</em>'.
   * @generated
   */
  DataCentricDSL createDataCentricDSL();

  /**
   * Returns a new object of class '<em>Variable Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Decl</em>'.
   * @generated
   */
  VariableDecl createVariableDecl();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  Query createQuery();

  /**
   * Returns a new object of class '<em>Query Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Param</em>'.
   * @generated
   */
  QueryParam createQueryParam();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DataCentricDSLPackage getDataCentricDSLPackage();

} //DataCentricDSLFactory
