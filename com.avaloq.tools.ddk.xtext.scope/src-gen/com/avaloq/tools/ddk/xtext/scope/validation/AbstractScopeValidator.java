/*
 * generated by Xtext 2.25.0
 */
package com.avaloq.tools.ddk.xtext.scope.validation;

import com.avaloq.tools.ddk.xtext.expression.validation.ExpressionValidator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractScopeValidator extends ExpressionValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.avaloq.com/tools/ddk/xtext/Scope"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.avaloq.com/tools/ddk/xtext/expression/Expression"));
		return result;
	}
}