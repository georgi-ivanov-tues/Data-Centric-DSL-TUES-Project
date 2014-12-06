package org.dataCentricDSL.tests

import com.google.inject.Inject
import org.DataCentricDSLInjectorProvider
import org.dataCentricDSL.DataCentricDSL
import org.dataCentricDSL.VariableCall
import org.dataCentricDSL.VariableDecl
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

@InjectWith(DataCentricDSLInjectorProvider)
@RunWith(XtextRunner)
class TestSomething {
	
	@Inject
	ParseHelper<DataCentricDSL> parser
	
	@Test
	def void test() {
		val model = parser.parse(
			"a = \"dasdas\";
			 b = a;
			"
		)
		for(i : 0..< model.elements.size) {
			print(((model.elements.get(i) as VariableDecl).variableValue as VariableCall).variableCall)
		}
	}
	
}