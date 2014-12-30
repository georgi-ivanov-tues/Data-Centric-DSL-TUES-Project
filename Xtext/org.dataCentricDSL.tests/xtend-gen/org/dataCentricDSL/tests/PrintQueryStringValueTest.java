package org.dataCentricDSL.tests;

import com.google.inject.Inject;
import org.DataCentricDSLInjectorProvider;
import org.dataCentricDSL.DataCentricDSL;
import org.dataCentricDSL.Query;
import org.dataCentricDSL.Statement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(DataCentricDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class PrintQueryStringValueTest {
  @Inject
  private ParseHelper<DataCentricDSL> parser;
  
  @Test
  public void testPrintQueryStringValue() {
    try {
      final DataCentricDSL model = this.parser.parse(
        "print query \"SELECT * FROM table\";");
      EList<Statement> _elements = model.getElements();
      Statement _head = IterableExtensions.<Statement>head(_elements);
      final Query query = ((Query) _head);
      String _queryValue = query.getQueryValue();
      Assert.assertEquals("SELECT * FROM table", _queryValue);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
