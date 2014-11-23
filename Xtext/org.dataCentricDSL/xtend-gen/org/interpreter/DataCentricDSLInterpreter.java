package org.interpreter;

import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.dataCentricDSL.FunctionCall;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DataCentricDSLInterpreter extends XbaseInterpreter {
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  public Object assignVariable(final JvmOperation operation, final Object receiver, final List<Object> argumentValues) {
    Object _xblockexpression = null;
    {
      Set<EObject> _sourceElements = this._iJvmModelAssociations.getSourceElements(operation);
      final EObject executable = IterableExtensions.<EObject>head(_sourceElements);
      Object _xifexpression = null;
      if ((executable instanceof FunctionCall)) {
        _xifexpression = InputOutput.<String>println("Call function");
      } else {
        _xifexpression = super.invokeOperation(operation, receiver, argumentValues);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public /* bigModel.EObject */Object interprete;
  
  private /* Procedure1<? super o> */Object Person;
}
