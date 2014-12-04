/**
 */
package org.dataCentricDSL.impl;

import org.dataCentricDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataCentricDSLFactoryImpl extends EFactoryImpl implements DataCentricDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataCentricDSLFactory init()
  {
    try
    {
      DataCentricDSLFactory theDataCentricDSLFactory = (DataCentricDSLFactory)EPackage.Registry.INSTANCE.getEFactory(DataCentricDSLPackage.eNS_URI);
      if (theDataCentricDSLFactory != null)
      {
        return theDataCentricDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DataCentricDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCentricDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DataCentricDSLPackage.DATA_CENTRIC_DSL: return createDataCentricDSL();
      case DataCentricDSLPackage.VARIABLE_DECL: return createVariableDecl();
      case DataCentricDSLPackage.QUERY: return createQuery();
      case DataCentricDSLPackage.QUERY_PARAM: return createQueryParam();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCentricDSL createDataCentricDSL()
  {
    DataCentricDSLImpl dataCentricDSL = new DataCentricDSLImpl();
    return dataCentricDSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl createVariableDecl()
  {
    VariableDeclImpl variableDecl = new VariableDeclImpl();
    return variableDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryParam createQueryParam()
  {
    QueryParamImpl queryParam = new QueryParamImpl();
    return queryParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCentricDSLPackage getDataCentricDSLPackage()
  {
    return (DataCentricDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DataCentricDSLPackage getPackage()
  {
    return DataCentricDSLPackage.eINSTANCE;
  }

} //DataCentricDSLFactoryImpl
