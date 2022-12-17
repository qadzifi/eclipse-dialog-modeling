/**
 */
package org.qadzifi.eclipse.dialog.modeling.qdialog.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.qadzifi.eclipse.dialog.modeling.qdialog.DialogContainer;
import org.qadzifi.eclipse.dialog.modeling.qdialog.QDialogFactory;
import org.qadzifi.eclipse.dialog.modeling.qdialog.QDialogPackage;
import org.qadzifi.eclipse.dialog.modeling.qdialog.TextInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QDialogPackageImpl extends EPackageImpl implements QDialogPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputEClass = null;

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
	 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.QDialogPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QDialogPackageImpl() {
		super(eNS_URI, QDialogFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QDialogPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDialogPackage init() {
		if (isInited)
			return (QDialogPackage) EPackage.Registry.INSTANCE.getEPackage(QDialogPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQDialogPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QDialogPackageImpl theQDialogPackage = registeredQDialogPackage instanceof QDialogPackageImpl
				? (QDialogPackageImpl) registeredQDialogPackage
				: new QDialogPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theQDialogPackage.createPackageContents();

		// Initialize created meta-data
		theQDialogPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQDialogPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDialogPackage.eNS_URI, theQDialogPackage);
		return theQDialogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogContainer() {
		return dialogContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogContainer_Title() {
		return (EAttribute) dialogContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogContainer_Textinput() {
		return (EReference) dialogContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextInput() {
		return textInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDialogFactory getQDialogFactory() {
		return (QDialogFactory) getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dialogContainerEClass = createEClass(DIALOG_CONTAINER);
		createEAttribute(dialogContainerEClass, DIALOG_CONTAINER__TITLE);
		createEReference(dialogContainerEClass, DIALOG_CONTAINER__TEXTINPUT);

		textInputEClass = createEClass(TEXT_INPUT);
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
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dialogContainerEClass, DialogContainer.class, "DialogContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDialogContainer_Title(), ecorePackage.getEString(), "Title", null, 1, 1,
				DialogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getDialogContainer_Textinput(), this.getTextInput(), null, "textinput", null, 0, -1,
				DialogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textInputEClass, TextInput.class, "TextInput", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //QDialogPackageImpl
