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
      case DataCentricDSLPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case DataCentricDSLPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case DataCentricDSLPackage.IMPORT: return createImport();
      case DataCentricDSLPackage.FUNCTION: return createFunction();
      case DataCentricDSLPackage.FIELD: return createField();
      case DataCentricDSLPackage.PREDEFINED_FUNCTION: return createPredefinedFunction();
      case DataCentricDSLPackage.PROPERTY: return createProperty();
      case DataCentricDSLPackage.PROPERTY_USAGE: return createPropertyUsage();
      case DataCentricDSLPackage.FUNCTION_CALL: return createFunctionCall();
      case DataCentricDSLPackage.QUERY: return createQuery();
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
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredefinedFunction createPredefinedFunction()
  {
    PredefinedFunctionImpl predefinedFunction = new PredefinedFunctionImpl();
    return predefinedFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyUsage createPropertyUsage()
  {
    PropertyUsageImpl propertyUsage = new PropertyUsageImpl();
    return propertyUsage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
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
