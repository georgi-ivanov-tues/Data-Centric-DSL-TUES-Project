package org.dataCentricDSL.tests

import com.google.inject.Inject
import org.DataCentricDSLInjectorProvider
import org.dataCentricDSL.DataCentricDSL
import org.dataCentricDSL.Query
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import static org.junit.Assert.*;

@InjectWith(DataCentricDSLInjectorProvider)
@RunWith(XtextRunner)
class QueryStringValueTest {
	
	@Inject
	ParseHelper<DataCentricDSL> parser
	
	@Test
	def void testQueryStringValue() {
		val elements = parser.parse(
			"query \"SELECT * FROM table\";"	
		)
		val query = elements.elements.head as Query
		assertEquals("SELECT * FROM table", query.queryValue);
	}
	
}