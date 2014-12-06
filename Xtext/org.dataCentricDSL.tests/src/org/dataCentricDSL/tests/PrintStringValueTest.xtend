package org.dataCentricDSL.tests

import com.google.inject.Inject
import org.DataCentricDSLInjectorProvider
import org.dataCentricDSL.DataCentricDSL
import org.dataCentricDSL.Print
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import static org.junit.Assert.*;

@InjectWith(DataCentricDSLInjectorProvider)
@RunWith(XtextRunner)
class PrintStringValueTest {
	
	@Inject
	ParseHelper<DataCentricDSL> parser
	
	@Test
	def void testPrintStringValue() {
		val model = parser.parse(
			"print \"SELECT * FROM table\";"
		)
		val print = model.elements.head as Print
		assertEquals("SELECT * FROM table", print.printValue);
	}
	
}