/**
 */
package org.qadzifi.mdedateyl.model.mdedateyl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qadzifi.mdedateyl.model.mdedateyl.DialogContainer#getTitle <em>Title</em>}</li>
 *   <li>{@link org.qadzifi.mdedateyl.model.mdedateyl.DialogContainer#getTextinput <em>Textinput</em>}</li>
 * </ul>
 *
 * @see org.qadzifi.mdedateyl.model.mdedateyl.ELMDialogPackage#getDialogContainer()
 * @model
 * @generated
 */
public interface DialogContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>"Title Text"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.qadzifi.mdedateyl.model.mdedateyl.ELMDialogPackage#getDialogContainer_Title()
	 * @model default="Title Text" unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.qadzifi.mdedateyl.model.mdedateyl.DialogContainer#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Textinput</b></em>' containment reference list.
	 * The list contents are of type {@link org.qadzifi.mdedateyl.model.mdedateyl.TextInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textinput</em>' containment reference list.
	 * @see org.qadzifi.mdedateyl.model.mdedateyl.ELMDialogPackage#getDialogContainer_Textinput()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextInput> getTextinput();

} // DialogContainer
