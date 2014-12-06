package org.dataCentricDSL.tests;

import com.google.inject.Inject;
import org.DataCentricDSLInjectorProvider;
import org.dataCentricDSL.DataCentricDSL;
import org.dataCentricDSL.VariableCall;
import org.dataCentricDSL.VariableDecl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(DataCentricDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class TestSomething {
  @Inject
  private ParseHelper<DataCentricDSL> parser;
  
  @Test
  public void test() {
    try {
      final DataCentricDSL model = this.parser.parse(
        "a = \"dasdas\";\r\n\t\t\t b = a;\r\n\t\t\t");
      EList<EObject> _elements = model.getElements();
      int _size = _elements.size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        EList<EObject> _elements_1 = model.getElements();
        EObject _get = _elements_1.get((i).intValue());
        VariableDecl _variableValue = ((VariableDecl) _get).getVariableValue();
        String _variableCall = ((VariableCall) _variableValue).getVariableCall();
        InputOutput.<String>print(_variableCall);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
