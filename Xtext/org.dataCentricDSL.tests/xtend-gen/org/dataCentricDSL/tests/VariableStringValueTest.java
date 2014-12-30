package org.dataCentricDSL.tests;

import com.google.inject.Inject;
import org.DataCentricDSLInjectorProvider;
import org.dataCentricDSL.DataCentricDSL;
import org.dataCentricDSL.SimpleStatement;
import org.dataCentricDSL.Statement;
import org.dataCentricDSL.VariableDecl;
import org.dataCentricDSL.VariableParam;
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
public class VariableStringValueTest {
  @Inject
  private ParseHelper<DataCentricDSL> parser;
  
  @Test
  public void testVariableStringValue() {
    try {
      final DataCentricDSL model = this.parser.parse(
        "queryString = \"SELECT * FROM table\";");
      EList<Statement> _elements = model.getElements();
      Statement _head = IterableExtensions.<Statement>head(_elements);
      final VariableDecl variableDecl = ((VariableDecl) _head);
      SimpleStatement _variableValue = variableDecl.getVariableValue();
      String _variableStringParam = ((VariableParam) _variableValue).getVariableStringParam();
      Assert.assertEquals("SELECT * FROM table", _variableStringParam);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
