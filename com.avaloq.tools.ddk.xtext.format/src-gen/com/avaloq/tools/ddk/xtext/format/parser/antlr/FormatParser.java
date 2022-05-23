/*
 * generated by Xtext 2.27.0.M3
 */
package com.avaloq.tools.ddk.xtext.format.parser.antlr;

import com.avaloq.tools.ddk.xtext.format.parser.antlr.internal.InternalFormatParser;
import com.avaloq.tools.ddk.xtext.format.services.FormatGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class FormatParser extends AbstractAntlrParser {

	@Inject
	private FormatGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalFormatParser createParser(XtextTokenStream stream) {
		return new InternalFormatParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "FormatConfiguration";
	}

	public FormatGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FormatGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
