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
public class VariableStringValueTest {
  @Inject
  private ParseHelper<DataCentricDSL> parser;
  
  @Test
  public void testVariableStringValue() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method variableStringParam is undefined for the type VariableStringValueTest");
  }
}
