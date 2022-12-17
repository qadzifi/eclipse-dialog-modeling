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
public class ELMDialogFactoryImpl extends EFactoryImpl implements ELMDialogFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ELMDialogFactory init() {
		try {
			ELMDialogFactory theELMDialogFactory = (ELMDialogFactory) EPackage.Registry.INSTANCE
					.getEFactory(ELMDialogPackage.eNS_URI);
			if (theELMDialogFactory != null) {
				return theELMDialogFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ELMDialogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELMDialogFactoryImpl() {
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
		case ELMDialogPackage.DIALOG_CONTAINER:
			return createDialogContainer();
		case ELMDialogPackage.TEXT_INPUT:
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
	public ELMDialogPackage getELMDialogPackage() {
		return (ELMDialogPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ELMDialogPackage getPackage() {
		return ELMDialogPackage.eINSTANCE;
	}

} //ELMDialogFactoryImpl
