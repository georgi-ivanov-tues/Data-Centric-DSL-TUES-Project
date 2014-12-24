package org.dataCentricDSL.tests;

import com.google.inject.Inject;
import org.DataCentricDSLInjectorProvider;
import org.dataCentricDSL.DataCentricDSL;
import org.dataCentricDSL.SimpleStatement;
import org.dataCentricDSL.Statement;
import org.dataCentricDSL.VariableCall;
import org.dataCentricDSL.VariableDecl;
import org.dataCentricDSL.VariableParam;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(DataCentricDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class VariableAssignedVariableNameTest {
  @Inject
  private ParseHelper<DataCentricDSL> parser;
  
  @Test
  public void testVariableAssignedVariableName() {
    try {
      final DataCentricDSL model = this.parser.parse(
        "firstVariable = \"some value\";\r\n\t\t\t secondVariable = firstVariable;\r\n\t\t\t");
      EList<Statement> _elements = model.getElements();
      Statement _get = _elements.get(1);
      final VariableDecl variableDecl = ((VariableDecl) _get);
      SimpleStatement _variableValue = variableDecl.getVariableValue();
      VariableCall _variableVarParam = ((VariableParam) _variableValue).getVariableVarParam();
      String _variableCall = ((VariableCall) _variableVarParam).getVariableCall();
      Assert.assertEquals("firstVariable", _variableCall);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
