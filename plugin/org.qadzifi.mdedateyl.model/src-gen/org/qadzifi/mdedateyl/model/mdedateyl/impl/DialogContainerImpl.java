/**
 */
package org.qadzifi.mdedateyl.model.mdedateyl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.qadzifi.mdedateyl.model.mdedateyl.DialogContainer;
import org.qadzifi.mdedateyl.model.mdedateyl.ELMDialogPackage;
import org.qadzifi.mdedateyl.model.mdedateyl.TextInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialog Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qadzifi.mdedateyl.model.mdedateyl.impl.DialogContainerImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.qadzifi.mdedateyl.model.mdedateyl.impl.DialogContainerImpl#getTextinput <em>Textinput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DialogContainerImpl extends MinimalEObjectImpl.Container implements DialogContainer {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = "Title Text";

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextinput() <em>Textinput</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextinput()
	 * @generated
	 * @ordered
	 */
	protected EList<TextInput> textinput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ELMDialogPackage.Literals.DIALOG_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ELMDialogPackage.DIALOG_CONTAINER__TITLE, oldTitle,
					title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextInput> getTextinput() {
		if (textinput == null) {
			textinput = new EObjectContainmentEList<TextInput>(TextInput.class, this,
					ELMDialogPackage.DIALOG_CONTAINER__TEXTINPUT);
		}
		return textinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ELMDialogPackage.DIALOG_CONTAINER__TEXTINPUT:
			return ((InternalEList<?>) getTextinput()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ELMDialogPackage.DIALOG_CONTAINER__TITLE:
			return getTitle();
		case ELMDialogPackage.DIALOG_CONTAINER__TEXTINPUT:
			return getTextinput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ELMDialogPackage.DIALOG_CONTAINER__TITLE:
			setTitle((String) newValue);
			return;
		case ELMDialogPackage.DIALOG_CONTAINER__TEXTINPUT:
			getTextinput().clear();
			getTextinput().addAll((Collection<? extends TextInput>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ELMDialogPackage.DIALOG_CONTAINER__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case ELMDialogPackage.DIALOG_CONTAINER__TEXTINPUT:
			getTextinput().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ELMDialogPackage.DIALOG_CONTAINER__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case ELMDialogPackage.DIALOG_CONTAINER__TEXTINPUT:
			return textinput != null && !textinput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //DialogContainerImpl
