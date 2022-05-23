/**
 * generated by Xtext 2.27.0.M3
 */
package com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl;

import com.avaloq.tools.ddk.sample.helloworld.helloWorld.Greeting;
import com.avaloq.tools.ddk.sample.helloworld.helloWorld.HelloWorldPackage;
import com.avaloq.tools.ddk.sample.helloworld.helloWorld.KeywordsExample;
import com.avaloq.tools.ddk.sample.helloworld.helloWorld.Model;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.ModelImpl#getGreetings <em>Greetings</em>}</li>
 *   <li>{@link com.avaloq.tools.ddk.sample.helloworld.helloWorld.impl.ModelImpl#getKeywordsExample <em>Keywords Example</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getGreetings() <em>Greetings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreetings()
   * @generated
   * @ordered
   */
  protected EList<Greeting> greetings;

  /**
   * The cached value of the '{@link #getKeywordsExample() <em>Keywords Example</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeywordsExample()
   * @generated
   * @ordered
   */
  protected KeywordsExample keywordsExample;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HelloWorldPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Greeting> getGreetings()
  {
    if (greetings == null)
    {
      greetings = new EObjectContainmentEList<Greeting>(Greeting.class, this, HelloWorldPackage.MODEL__GREETINGS);
    }
    return greetings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public KeywordsExample getKeywordsExample()
  {
    return keywordsExample;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeywordsExample(KeywordsExample newKeywordsExample, NotificationChain msgs)
  {
    KeywordsExample oldKeywordsExample = keywordsExample;
    keywordsExample = newKeywordsExample;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HelloWorldPackage.MODEL__KEYWORDS_EXAMPLE, oldKeywordsExample, newKeywordsExample);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setKeywordsExample(KeywordsExample newKeywordsExample)
  {
    if (newKeywordsExample != keywordsExample)
    {
      NotificationChain msgs = null;
      if (keywordsExample != null)
        msgs = ((InternalEObject)keywordsExample).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HelloWorldPackage.MODEL__KEYWORDS_EXAMPLE, null, msgs);
      if (newKeywordsExample != null)
        msgs = ((InternalEObject)newKeywordsExample).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HelloWorldPackage.MODEL__KEYWORDS_EXAMPLE, null, msgs);
      msgs = basicSetKeywordsExample(newKeywordsExample, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HelloWorldPackage.MODEL__KEYWORDS_EXAMPLE, newKeywordsExample, newKeywordsExample));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HelloWorldPackage.MODEL__GREETINGS:
        return ((InternalEList<?>)getGreetings()).basicRemove(otherEnd, msgs);
      case HelloWorldPackage.MODEL__KEYWORDS_EXAMPLE:
        return basicSetKeywordsExample(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HelloWorldPackage.MODEL__GREETINGS:
        return getGreetings();
      case HelloWorldPackage.MODEL__KEYWORDS_EXAMPLE:
        return getKeywordsExample();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HelloWorldPackage.MODEL__GREETINGS:
        getGreetings().clear();
        getGreetings().addAll((Collection<? extends Greeting>)newValue);
        return;
      case HelloWorldPackage.MODEL__KEYWORDS_EXAMPLE:
        setKeywordsExample((KeywordsExample)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HelloWorldPackage.MODEL__GREETINGS:
        getGreetings().clear();
        return;
      case HelloWorldPackage.MODEL__KEYWORDS_EXAMPLE:
        setKeywordsExample((KeywordsExample)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HelloWorldPackage.MODEL__GREETINGS:
        return greetings != null && !greetings.isEmpty();
      case HelloWorldPackage.MODEL__KEYWORDS_EXAMPLE:
        return keywordsExample != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
