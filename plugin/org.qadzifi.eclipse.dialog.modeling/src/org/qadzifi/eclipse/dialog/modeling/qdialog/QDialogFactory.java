/**
 */
package org.qadzifi.eclipse.dialog.modeling.qdialog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.qadzifi.eclipse.dialog.modeling.qdialog.QDialogPackage
 * @generated
 */
public interface QDialogFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDialogFactory eINSTANCE = org.qadzifi.eclipse.dialog.modeling.qdialog.impl.QDialogFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dialog Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog Container</em>'.
	 * @generated
	 */
	DialogContainer createDialogContainer();

	/**
	 * Returns a new object of class '<em>Text Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Input</em>'.
	 * @generated
	 */
	TextInput createTextInput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDialogPackage getQDialogPackage();

} //QDialogFactory
