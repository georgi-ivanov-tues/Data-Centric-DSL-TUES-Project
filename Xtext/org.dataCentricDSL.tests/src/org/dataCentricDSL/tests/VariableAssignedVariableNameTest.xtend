package org.dataCentricDSL.tests

import com.google.inject.Inject
import org.DataCentricDSLInjectorProvider
import org.dataCentricDSL.DataCentricDSL
import org.dataCentricDSL.VariableCall
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
class VariableAssignedVariableNameTest {
	
	@Inject
	ParseHelper<DataCentricDSL> parser
	
	@Test
	def void testVariableAssignedVariableName() {
		val model = parser.parse(
			"firstVariable = \"some value\";
			 secondVariable = firstVariable;
			"
		)
		val variableDecl = model.elements.get(1) as VariableDecl
		assertEquals("firstVariable", ((variableDecl.variableValue as VariableParam).variableVarParam as VariableCall).variableCall);
	}
	
}