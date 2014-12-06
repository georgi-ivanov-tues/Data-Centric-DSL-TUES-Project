package org.dataCentricDSL.tests

import com.google.inject.Inject
import org.DataCentricDSLInjectorProvider
import org.dataCentricDSL.DataCentricDSL
import org.dataCentricDSL.VariableDecl
import org.dataCentricDSL.VariableParam
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@InjectWith(DataCentricDSLInjectorProvider)
@RunWith(XtextRunner)
class VariableStringValueTest {
	
	@Inject
	ParseHelper<DataCentricDSL> parser
	
	@Test
	def testVariableStringValue() {
		val model = parser.parse(
			"queryString = \"SELECT * FROM table\";"
		)
		val variableDecl = model.elements.head as VariableDecl
		assertEquals("SELECT * FROM table", (variableDecl.variableValue as VariableParam).variableStringParam);
	}
	
}