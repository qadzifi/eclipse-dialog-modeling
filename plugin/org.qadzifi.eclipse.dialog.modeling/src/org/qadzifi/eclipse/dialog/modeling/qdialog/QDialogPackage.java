/**
 */
package org.qadzifi.eclipse.dialog.modeling.qdialog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.QDialogFactory
 * @model kind="package"
 * @generated
 */
public interface QDialogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qdialog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://qadzifi.github.io/modeling/eclipse/dialog";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDialogPackage eINSTANCE = org.qadzifi.eclipse.dialog.modeling.qdialog.impl.QDialogPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.qadzifi.eclipse.dialog.modeling.qdialog.impl.DialogContainerImpl <em>Dialog Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.impl.DialogContainerImpl
	 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.impl.QDialogPackageImpl#getDialogContainer()
	 * @generated
	 */
	int DIALOG_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONTAINER__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Textinput</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONTAINER__TEXTINPUT = 1;

	/**
	 * The number of structural features of the '<em>Dialog Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dialog Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qadzifi.eclipse.dialog.modeling.qdialog.impl.TextInputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.impl.TextInputImpl
	 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.impl.QDialogPackageImpl#getTextInput()
	 * @generated
	 */
	int TEXT_INPUT = 1;

	/**
	 * The number of structural features of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.qadzifi.eclipse.dialog.modeling.qdialog.DialogContainer <em>Dialog Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog Container</em>'.
	 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.DialogContainer
	 * @generated
	 */
	EClass getDialogContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.qadzifi.eclipse.dialog.modeling.qdialog.DialogContainer#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.DialogContainer#getTitle()
	 * @see #getDialogContainer()
	 * @generated
	 */
	EAttribute getDialogContainer_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.qadzifi.eclipse.dialog.modeling.qdialog.DialogContainer#getTextinput <em>Textinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textinput</em>'.
	 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.DialogContainer#getTextinput()
	 * @see #getDialogContainer()
	 * @generated
	 */
	EReference getDialogContainer_Textinput();

	/**
	 * Returns the meta object for class '{@link org.qadzifi.eclipse.dialog.modeling.qdialog.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.TextInput
	 * @generated
	 */
	EClass getTextInput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDialogFactory getQDialogFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.qadzifi.eclipse.dialog.modeling.qdialog.impl.DialogContainerImpl <em>Dialog Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.impl.DialogContainerImpl
		 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.impl.QDialogPackageImpl#getDialogContainer()
		 * @generated
		 */
		EClass DIALOG_CONTAINER = eINSTANCE.getDialogContainer();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG_CONTAINER__TITLE = eINSTANCE.getDialogContainer_Title();

		/**
		 * The meta object literal for the '<em><b>Textinput</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG_CONTAINER__TEXTINPUT = eINSTANCE.getDialogContainer_Textinput();

		/**
		 * The meta object literal for the '{@link org.qadzifi.eclipse.dialog.modeling.qdialog.impl.TextInputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.impl.TextInputImpl
		 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.impl.QDialogPackageImpl#getTextInput()
		 * @generated
		 */
		EClass TEXT_INPUT = eINSTANCE.getTextInput();

	}

} //QDialogPackage
