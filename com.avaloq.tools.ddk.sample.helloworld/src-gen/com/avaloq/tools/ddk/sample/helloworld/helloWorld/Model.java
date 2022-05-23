/**
 * generated by Xtext 2.27.0.M3
 */
package com.avaloq.tools.ddk.sample.helloworld.helloWorld;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.Model#getGreetings <em>Greetings</em>}</li>
 *   <li>{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.Model#getKeywordsExample <em>Keywords Example</em>}</li>
 * </ul>
 *
 * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.HelloWorldPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Greetings</b></em>' containment reference list.
   * The list contents are of type {@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.Greeting}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greetings</em>' containment reference list.
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.HelloWorldPackage#getModel_Greetings()
   * @model containment="true"
   * @generated
   */
  EList<Greeting> getGreetings();

  /**
   * Returns the value of the '<em><b>Keywords Example</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keywords Example</em>' containment reference.
   * @see #setKeywordsExample(KeywordsExample)
   * @see com.avaloq.tools.ddk.sample.helloworld.helloWorld.HelloWorldPackage#getModel_KeywordsExample()
   * @model containment="true"
   * @generated
   */
  KeywordsExample getKeywordsExample();

  /**
   * Sets the value of the '{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.Model#getKeywordsExample <em>Keywords Example</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keywords Example</em>' containment reference.
   * @see #getKeywordsExample()
   * @generated
   */
  void setKeywordsExample(KeywordsExample value);

} // Model
