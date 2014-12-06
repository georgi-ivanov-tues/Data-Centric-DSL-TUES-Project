package org.dataCentricDSL.tests

import com.google.inject.Inject
import org.DataCentricDSLInjectorProvider
import org.dataCentricDSL.DataCentricDSL
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import static org.junit.Assert.*;
import org.dataCentricDSL.VariableDecl

@InjectWith(DataCentricDSLInjectorProvider)
@RunWith(XtextRunner)
class VariableNameValueTest {
	
	@Inject
	ParseHelper<DataCentricDSL> parser
	
	@Test
	def void testVariableNameValue() {
		val model = parser.parse(
			"queryString = \"test\";"
		)
		val variableDecl = model.elements.head as VariableDecl
		assertEquals("queryString", variableDecl.name);
	}
	
}