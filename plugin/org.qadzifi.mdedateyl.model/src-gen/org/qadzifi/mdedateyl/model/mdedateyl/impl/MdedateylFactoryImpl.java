/**
 */
package org.qadzifi.mdedateyl.model.mdedateyl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.qadzifi.mdedateyl.model.mdedateyl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdedateylFactoryImpl extends EFactoryImpl implements MdedateylFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MdedateylFactory init() {
		try {
			MdedateylFactory theMdedateylFactory = (MdedateylFactory) EPackage.Registry.INSTANCE
					.getEFactory(MdedateylPackage.eNS_URI);
			if (theMdedateylFactory != null) {
				return theMdedateylFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MdedateylFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdedateylFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MdedateylPackage.DIALOG_CONTAINER:
			return createDialogContainer();
		case MdedateylPackage.TEXT_INPUT:
			return createTextInput();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogContainer createDialogContainer() {
		DialogContainerImpl dialogContainer = new DialogContainerImpl();
		return dialogContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInput createTextInput() {
		TextInputImpl textInput = new TextInputImpl();
		return textInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdedateylPackage getMdedateylPackage() {
		return (MdedateylPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MdedateylPackage getPackage() {
		return MdedateylPackage.eINSTANCE;
	}

} //MdedateylFactoryImpl
