package org.dataCentricDSL.tests

import com.google.inject.Inject
import org.DataCentricDSLInjectorProvider
import org.dataCentricDSL.DataCentricDSL
import org.dataCentricDSL.VariableCall
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@InjectWith(DataCentricDSLInjectorProvider)
@RunWith(XtextRunner)
class PrintVariableNameTest {
	
	@Inject
	ParseHelper<DataCentricDSL> parser
	
	@Test
	def void testPrintVariableName() {
		val model = parser.parse(
			"queryString = \"SELECT * FROM parse\";
			 print queryString;
			"
		)
		val variableCall = model.elements.get(1) as VariableCall
		assertEquals("queryString", variableCall.variableCall);
	}
	
}