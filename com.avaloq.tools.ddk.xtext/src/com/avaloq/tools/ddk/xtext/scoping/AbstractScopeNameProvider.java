/*******************************************************************************
 * Copyright (c) 2016 Avaloq Group AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Avaloq Group AG - initial API and implementation
 *******************************************************************************/
package com.avaloq.tools.ddk.xtext.scoping;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.collect.MapMaker;
import com.google.inject.Inject;


/**
 * Abstract implementation of name provider used by scope provider to determine the name of a given object. The name provider
 * manages the names on a type basis and can provide multiple names for a given type (in priority order).
 * <p>
 * Subclasses will automatically be generated by the scope provider fragment and can further be subclassed.
 */
public abstract class AbstractScopeNameProvider implements IScopeNameProvider {

  @Inject
  private IQualifiedNameConverter nameConverter;

  /**
   * Cache for the name functions associated with a given {@link EClass type}.
   */
  private final Map<EClass, Iterable<INameFunction>> nameFunctionCache = new MapMaker().concurrencyLevel(1).weakKeys().makeMap();

  /**
   * Returns the list of name functions for a given type by calling {@link #internalGetNameFunctions(EClass)}. The result is cached for subsequent calls.
   *
   * @param type
   *          the context type
   * @return a list of name functions
   */
  @Override
  public Iterable<INameFunction> getNameFunctions(final EClass type) {
    Iterable<INameFunction> result = nameFunctionCache.get(type);
    if (result == null) {
      result = internalGetNameFunctions(type);
      if (result == null) {
        result = getDefaultNames(type);
      }
      nameFunctionCache.put(type, result);
    }
    return result;
  }

  /**
   * Returns the list of name functions for a given type. This method should be implemented by subclasses.
   *
   * @param type
   *          the context type
   * @return a list of name functions
   */
  protected abstract Iterable<INameFunction> internalGetNameFunctions(final EClass type);

  /**
   * Returns the default name to be used if no names were returned by {@link #internalGetNameFunctions(EClass)}. This implementation returns a
   * name function corresponding to the "name" feature if present. If not an exception is raised. Subclasses may override this
   * method.
   *
   * @param type
   *          type to return default name for
   * @return default name functions
   */
  protected Iterable<INameFunction> getDefaultNames(final EClass type) {
    final EStructuralFeature nameFeature = type.getEStructuralFeature("name"); //$NON-NLS-1$
    if (nameFeature != null) {
      return NameFunctions.fromFeatures(nameFeature);
    }

    throw new IllegalArgumentException("unknown type: " + type); //$NON-NLS-1$
  }

  /**
   * Returns a qualified name for the given object.
   *
   * @param o
   *          string to convert
   * @return converted string or null
   */
  protected QualifiedName toQualifiedName(final Object o) {
    return o != null ? nameConverter.toQualifiedName(o.toString()) : null;
  }

  /**
   * Returns a qualified name for the given object.
   *
   * @param s
   *          string to convert
   * @return converted string or null
   */
  protected QualifiedName toQualifiedName(final String s) {
    return s != null ? nameConverter.toQualifiedName(s) : null;
  }
}
