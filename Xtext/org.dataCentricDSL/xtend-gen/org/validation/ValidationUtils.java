package org.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.dataCentricDSL.BooleanValue;
import org.dataCentricDSL.ConditionElement;
import org.dataCentricDSL.DataCentricDSL;
import org.dataCentricDSL.ForStatement;
import org.dataCentricDSL.FunctionDefinition;
import org.dataCentricDSL.IfStatement;
import org.dataCentricDSL.VariableCall;
import org.dataCentricDSL.VariableDefinition;
import org.dataCentricDSL.WhileStatement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.validation.ErrorMessages;

@SuppressWarnings("all")
public class ValidationUtils {
  public static boolean globalVariableFound = false;
  
  public static boolean variableIsUsed = false;
  
  public static void checkIfCalledVariableIsGlobal(final EObject object, final String name, final int index) {
    if (ValidationUtils.globalVariableFound) {
      return;
    }
    boolean _or = false;
    if (((((object instanceof DataCentricDSL) || (object instanceof IfStatement)) || (object instanceof ForStatement)) || (object instanceof WhileStatement))) {
      _or = true;
    } else {
      _or = (object instanceof FunctionDefinition);
    }
    if (_or) {
      int lastIndex = 0;
      boolean variableFound = false;
      if ((object instanceof DataCentricDSL)) {
        lastIndex = index;
        EList<EObject> _eContents = ((DataCentricDSL)object).eContents();
        List<EObject> _subList = _eContents.subList(0, lastIndex);
        Object[] _array = _subList.toArray();
        Iterable<VariableDefinition> _filter = Iterables.<VariableDefinition>filter(((Iterable<?>)Conversions.doWrapArray(_array)), VariableDefinition.class);
        final Function1<VariableDefinition, Boolean> _function = new Function1<VariableDefinition, Boolean>() {
          public Boolean apply(final VariableDefinition it) {
            return Boolean.valueOf(it.isIsGlobal());
          }
        };
        Iterable<VariableDefinition> _filter_1 = IterableExtensions.<VariableDefinition>filter(_filter, _function);
        boolean _variableIsDeclared = ValidationUtils.variableIsDeclared(((VariableDefinition[])Conversions.unwrapArray(_filter_1, VariableDefinition.class)), name);
        variableFound = _variableIsDeclared;
      } else {
        EList<EObject> _eContents_1 = object.eContents();
        int _length = ((Object[])Conversions.unwrapArray(_eContents_1, Object.class)).length;
        lastIndex = _length;
        EList<EObject> _eContents_2 = object.eContents();
        Object[] _array_1 = _eContents_2.toArray();
        Iterable<VariableDefinition> _filter_2 = Iterables.<VariableDefinition>filter(((Iterable<?>)Conversions.doWrapArray(_array_1)), VariableDefinition.class);
        final Function1<VariableDefinition, Boolean> _function_1 = new Function1<VariableDefinition, Boolean>() {
          public Boolean apply(final VariableDefinition it) {
            return Boolean.valueOf(it.isIsGlobal());
          }
        };
        Iterable<VariableDefinition> _filter_3 = IterableExtensions.<VariableDefinition>filter(_filter_2, _function_1);
        boolean _variableIsDeclared_1 = ValidationUtils.variableIsDeclared(((VariableDefinition[])Conversions.unwrapArray(_filter_3, VariableDefinition.class)), name);
        variableFound = _variableIsDeclared_1;
      }
      if (variableFound) {
        ValidationUtils.globalVariableFound = true;
        return;
      } else {
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, lastIndex, true);
        for (final Integer i : _doubleDotLessThan) {
          EList<EObject> _eContents_3 = object.eContents();
          EObject _get = _eContents_3.get((i).intValue());
          ValidationUtils.checkIfCalledVariableIsGlobal(_get, name, (-1));
        }
      }
    } else {
      if ((object instanceof VariableDefinition)) {
        boolean _and = false;
        boolean _isIsGlobal = ((VariableDefinition) object).isIsGlobal();
        if (!_isIsGlobal) {
          _and = false;
        } else {
          String _name = ((VariableDefinition) object).getName();
          boolean _equals = _name.equals(name);
          _and = _equals;
        }
        if (_and) {
          ValidationUtils.globalVariableFound = true;
          return;
        }
      }
    }
  }
  
  public static boolean variableIsDeclared(final VariableDefinition[] variables, final String name) {
    boolean _notEquals = (!Objects.equal(variables, null));
    if (_notEquals) {
      int _length = variables.length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer i : _doubleDotLessThan) {
        VariableDefinition _get = variables[(i).intValue()];
        String _name = _get.getName();
        String _string = _name.toString();
        boolean _equals = _string.equals(name);
        if (_equals) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean functionIsDeclared(final FunctionDefinition[] functions, final String name) {
    int _length = functions.length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      FunctionDefinition _get = functions[(i).intValue()];
      String _name = _get.getName();
      String _string = _name.toString();
      boolean _equals = _string.equals(name);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean namePersistsInArray(final String[] array, final String name) {
    int _length = array.length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      String _get = array[(i).intValue()];
      boolean _equals = _get.equals(name);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public static String operandsCOmpatibilityErrorMessage(final ConditionElement leftOperand, final ConditionElement rightOperand, final String operator) {
    boolean _and = false;
    if (!(leftOperand instanceof BooleanValue)) {
      _and = false;
    } else {
      _and = (rightOperand instanceof BooleanValue);
    }
    if (_and) {
      boolean _equals = operator.equals("==");
      boolean _not = (!_equals);
      if (_not) {
        boolean _equals_1 = operator.equals("!=");
        boolean _not_1 = (!_equals_1);
        if (_not_1) {
          return ErrorMessages.UNDEFINED_OPERATOR_BOOLEAN_VALUES;
        } else {
          return null;
        }
      }
    }
    if ((leftOperand instanceof BooleanValue)) {
      if (((!(rightOperand instanceof BooleanValue)) && (!(rightOperand instanceof VariableCall)))) {
        return ErrorMessages.INCOMPATIBLE_OPERANDS;
      }
    } else {
      if ((rightOperand instanceof BooleanValue)) {
        if (((!(leftOperand instanceof BooleanValue)) && (!(leftOperand instanceof VariableCall)))) {
          return ErrorMessages.INCOMPATIBLE_OPERANDS;
        }
      }
    }
    return null;
  }
  
  public static boolean functionWithTheSameNameExists(final FunctionDefinition fd) {
    EObject _eContainer = fd.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    Object[] _array = _eContents.toArray();
    Iterable<FunctionDefinition> functionDeclarations = Iterables.<FunctionDefinition>filter(((Iterable<?>)Conversions.doWrapArray(_array)), FunctionDefinition.class);
    EObject _eContainer_1 = fd.eContainer();
    EList<EObject> _eContents_1 = _eContainer_1.eContents();
    int indexOfThisFunctionDecl = _eContents_1.indexOf(fd);
    final Iterable<FunctionDefinition> _converted_functionDeclarations = (Iterable<FunctionDefinition>)functionDeclarations;
    int _length = ((Object[])Conversions.unwrapArray(_converted_functionDeclarations, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      if (((i).intValue() != indexOfThisFunctionDecl)) {
        String _name = fd.getName();
        final Iterable<FunctionDefinition> _converted_functionDeclarations_1 = (Iterable<FunctionDefinition>)functionDeclarations;
        FunctionDefinition _get = ((FunctionDefinition[])Conversions.unwrapArray(_converted_functionDeclarations_1, FunctionDefinition.class))[(i).intValue()];
        String _name_1 = _get.getName();
        boolean _equals = _name.equals(_name_1);
        if (_equals) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean functionIsDeclaredBeforeTheCode(final FunctionDefinition fd) {
    EObject _eContainer = fd.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    EObject _eContainer_1 = fd.eContainer();
    EList<EObject> _eContents_1 = _eContainer_1.eContents();
    int _indexOf = _eContents_1.indexOf(fd);
    List<EObject> elementsBeforeDeclaration = _eContents.subList(0, _indexOf);
    final List<EObject> _converted_elementsBeforeDeclaration = (List<EObject>)elementsBeforeDeclaration;
    int _length = ((Object[])Conversions.unwrapArray(_converted_elementsBeforeDeclaration, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      EObject _get = elementsBeforeDeclaration.get((i).intValue());
      if ((!(_get instanceof FunctionDefinition))) {
        return false;
      }
    }
    return true;
  }
  
  public static EObject getDataCentricDSLContainer(final EObject element) {
    EObject container = element.eContainer();
    while ((!(container instanceof DataCentricDSL))) {
      EObject _eContainer = container.eContainer();
      container = _eContainer;
    }
    return container;
  }
  
  public static EObject getContainerBeforeDataCentricDSLContainer(final EObject element) {
    EObject container = element.eContainer();
    while ((!(container.eContainer() instanceof DataCentricDSL))) {
      EObject _eContainer = container.eContainer();
      container = _eContainer;
    }
    return container;
  }
  
  public static void checkIfVariableIsUsed(final List<EObject> elementContents, final String name) {
    if (ValidationUtils.variableIsUsed) {
      return;
    }
    int _length = ((Object[])Conversions.unwrapArray(elementContents, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      EObject _get = elementContents.get((i).intValue());
      if ((_get instanceof VariableCall)) {
        EObject _get_1 = elementContents.get((i).intValue());
        String _calledVariableName = ((VariableCall) _get_1).getCalledVariableName();
        boolean _equals = _calledVariableName.equals(name);
        if (_equals) {
          ValidationUtils.variableIsUsed = true;
          return;
        }
      } else {
        EObject _get_2 = elementContents.get((i).intValue());
        EList<EObject> _eContents = _get_2.eContents();
        ValidationUtils.checkIfVariableIsUsed(_eContents, name);
      }
    }
  }
}
