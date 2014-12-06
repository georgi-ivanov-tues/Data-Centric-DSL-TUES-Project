/**
 */
package org.dataCentricDSL.impl;

import org.dataCentricDSL.DataCentricDSL;
import org.dataCentricDSL.DataCentricDSLFactory;
import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.Print;
import org.dataCentricDSL.Query;
import org.dataCentricDSL.VariableCall;
import org.dataCentricDSL.VariableDecl;
import org.dataCentricDSL.VariableParam;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataCentricDSLPackageImpl extends EPackageImpl implements DataCentricDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataCentricDSLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass printEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableParamEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.dataCentricDSL.DataCentricDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DataCentricDSLPackageImpl()
  {
    super(eNS_URI, DataCentricDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DataCentricDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DataCentricDSLPackage init()
  {
    if (isInited) return (DataCentricDSLPackage)EPackage.Registry.INSTANCE.getEPackage(DataCentricDSLPackage.eNS_URI);

    // Obtain or create and register package
    DataCentricDSLPackageImpl theDataCentricDSLPackage = (DataCentricDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataCentricDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataCentricDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDataCentricDSLPackage.createPackageContents();

    // Initialize created meta-data
    theDataCentricDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDataCentricDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DataCentricDSLPackage.eNS_URI, theDataCentricDSLPackage);
    return theDataCentricDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataCentricDSL()
  {
    return dataCentricDSLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataCentricDSL_Elements()
  {
    return (EReference)dataCentricDSLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDecl()
  {
    return variableDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDecl_Name()
  {
    return (EAttribute)variableDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDecl_VariableValue()
  {
    return (EReference)variableDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuery()
  {
    return queryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery_QueryValue()
  {
    return (EAttribute)queryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrint()
  {
    return printEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrint_PrintValue()
  {
    return (EAttribute)printEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableCall()
  {
    return variableCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableCall_VariableCall()
  {
    return (EAttribute)variableCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableParam()
  {
    return variableParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableParam_VariableStringParam()
  {
    return (EAttribute)variableParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableParam_VariableVarParam()
  {
    return (EReference)variableParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableParam_VariableQueryParam()
  {
    return (EReference)variableParamEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCentricDSLFactory getDataCentricDSLFactory()
  {
    return (DataCentricDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dataCentricDSLEClass = createEClass(DATA_CENTRIC_DSL);
    createEReference(dataCentricDSLEClass, DATA_CENTRIC_DSL__ELEMENTS);

    variableDeclEClass = createEClass(VARIABLE_DECL);
    createEAttribute(variableDeclEClass, VARIABLE_DECL__NAME);
    createEReference(variableDeclEClass, VARIABLE_DECL__VARIABLE_VALUE);

    queryEClass = createEClass(QUERY);
    createEAttribute(queryEClass, QUERY__QUERY_VALUE);

    printEClass = createEClass(PRINT);
    createEAttribute(printEClass, PRINT__PRINT_VALUE);

    variableCallEClass = createEClass(VARIABLE_CALL);
    createEAttribute(variableCallEClass, VARIABLE_CALL__VARIABLE_CALL);

    variableParamEClass = createEClass(VARIABLE_PARAM);
    createEAttribute(variableParamEClass, VARIABLE_PARAM__VARIABLE_STRING_PARAM);
    createEReference(variableParamEClass, VARIABLE_PARAM__VARIABLE_VAR_PARAM);
    createEReference(variableParamEClass, VARIABLE_PARAM__VARIABLE_QUERY_PARAM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    queryEClass.getESuperTypes().add(this.getPrint());
    variableCallEClass.getESuperTypes().add(this.getQuery());
    variableCallEClass.getESuperTypes().add(this.getPrint());
    variableParamEClass.getESuperTypes().add(this.getVariableDecl());

    // Initialize classes and features; add operations and parameters
    initEClass(dataCentricDSLEClass, DataCentricDSL.class, "DataCentricDSL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataCentricDSL_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, DataCentricDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclEClass, VariableDecl.class, "VariableDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDecl_VariableValue(), this.getVariableDecl(), null, "variableValue", null, 0, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuery_QueryValue(), ecorePackage.getEString(), "queryValue", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(printEClass, Print.class, "Print", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrint_PrintValue(), ecorePackage.getEString(), "printValue", null, 0, 1, Print.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableCallEClass, VariableCall.class, "VariableCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableCall_VariableCall(), ecorePackage.getEString(), "variableCall", null, 0, 1, VariableCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableParamEClass, VariableParam.class, "VariableParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableParam_VariableStringParam(), ecorePackage.getEString(), "variableStringParam", null, 0, 1, VariableParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableParam_VariableVarParam(), this.getVariableCall(), null, "variableVarParam", null, 0, 1, VariableParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableParam_VariableQueryParam(), this.getQuery(), null, "variableQueryParam", null, 0, 1, VariableParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DataCentricDSLPackageImpl
