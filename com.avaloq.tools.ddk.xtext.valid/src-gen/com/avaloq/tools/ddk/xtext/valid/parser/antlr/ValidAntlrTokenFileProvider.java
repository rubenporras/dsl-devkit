/*
 * generated by Xtext 2.27.0.M3
 */
package com.avaloq.tools.ddk.xtext.valid.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ValidAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/avaloq/tools/ddk/xtext/valid/parser/antlr/internal/InternalValid.tokens");
	}
}
