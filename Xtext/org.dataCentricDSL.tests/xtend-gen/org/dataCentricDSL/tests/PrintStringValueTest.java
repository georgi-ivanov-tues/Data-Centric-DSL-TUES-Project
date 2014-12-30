package org.dataCentricDSL.tests;

import com.google.inject.Inject;
import org.DataCentricDSLInjectorProvider;
import org.dataCentricDSL.DataCentricDSL;
import org.dataCentricDSL.Print;
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
public class PrintStringValueTest {
  @Inject
  private ParseHelper<DataCentricDSL> parser;
  
  @Test
  public void testPrintStringValue() {
    try {
      final DataCentricDSL model = this.parser.parse(
        "print \"SELECT * FROM table\";");
      EList<Statement> _elements = model.getElements();
      Statement _head = IterableExtensions.<Statement>head(_elements);
      final Print print = ((Print) _head);
      String _printValue = print.getPrintValue();
      Assert.assertEquals("SELECT * FROM table", _printValue);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
