package org.dataCentricDSL.tests;

import com.google.inject.Inject;
import org.DataCentricDSLInjectorProvider;
import org.dataCentricDSL.DataCentricDSL;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(DataCentricDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class PrintVariableNameTest {
  @Inject
  private ParseHelper<DataCentricDSL> parser;
  
  @Test
  public void testPrintVariableName() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method variableCall is undefined for the type PrintVariableNameTest");
  }
}
