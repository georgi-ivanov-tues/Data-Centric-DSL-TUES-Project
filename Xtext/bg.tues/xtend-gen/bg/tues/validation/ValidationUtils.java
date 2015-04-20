package bg.tues.validation;

import bg.tues.didi.BooleanValue;
import bg.tues.didi.ConditionElement;
import bg.tues.didi.DidiModel;
import bg.tues.didi.ElseFragment;
import bg.tues.didi.ElseIfFragment;
import bg.tues.didi.ForStatement;
import bg.tues.didi.FunctionCall;
import bg.tues.didi.FunctionDefinition;
import bg.tues.didi.IfFragment;
import bg.tues.didi.VariableCall;
import bg.tues.didi.VariableDefinition;
import bg.tues.didi.WhileStatement;
import bg.tues.validation.ErrorMessages;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ValidationUtils {
  public static boolean globalVariableFound = false;
  
  public static boolean variableIsUsed = false;
  
  public static boolean functionIsUsed = false;
  
  public static void checkIfCalledVariableIsGlobal(final EObject object, final String name, final int index) {
    if (ValidationUtils.globalVariableFound) {
      return;
    }
    boolean _or = false;
    if (((((((object instanceof DidiModel) || (object instanceof IfFragment)) || (object instanceof ForStatement)) || (object instanceof WhileStatement)) || (object instanceof FunctionDefinition)) || (object instanceof ElseIfFragment))) {
      _or = true;
    } else {
      _or = (object instanceof ElseFragment);
    }
    if (_or) {
      int lastIndex = 0;
      boolean variableFound = false;
      if ((object instanceof DidiModel)) {
        lastIndex = index;
        EList<EObject> _eContents = ((DidiModel)object).eContents();
        List<EObject> _subList = _eContents.subList(0, lastIndex);
        Object[] _array = _subList.toArray();
        Iterable<VariableDefinition> _filter = Iterables.<VariableDefinition>filter(((Iterable<?>)Conversions.doWrapArray(_array)), VariableDefinition.class);
        final Function1<VariableDefinition, Boolean> _function = new Function1<VariableDefinition, Boolean>() {
          @Override
          public Boolean apply(final VariableDefinition it) {
            return Boolean.valueOf(it.isIsGlobal());
          }
        };
        Iterable<VariableDefinition> _filter_1 = IterableExtensions.<VariableDefinition>filter(_filter, _function);
        boolean _variableIsDefined = ValidationUtils.variableIsDefined(((EObject[])Conversions.unwrapArray(_filter_1, EObject.class)), name);
        variableFound = _variableIsDefined;
      } else {
        EList<EObject> _eContents_1 = object.eContents();
        int _length = ((Object[])Conversions.unwrapArray(_eContents_1, Object.class)).length;
        lastIndex = _length;
        EList<EObject> _eContents_2 = object.eContents();
        Object[] _array_1 = _eContents_2.toArray();
        Iterable<VariableDefinition> _filter_2 = Iterables.<VariableDefinition>filter(((Iterable<?>)Conversions.doWrapArray(_array_1)), VariableDefinition.class);
        final Function1<VariableDefinition, Boolean> _function_1 = new Function1<VariableDefinition, Boolean>() {
          @Override
          public Boolean apply(final VariableDefinition it) {
            return Boolean.valueOf(it.isIsGlobal());
          }
        };
        Iterable<VariableDefinition> _filter_3 = IterableExtensions.<VariableDefinition>filter(_filter_2, _function_1);
        boolean _variableIsDefined_1 = ValidationUtils.variableIsDefined(((EObject[])Conversions.unwrapArray(_filter_3, EObject.class)), name);
        variableFound = _variableIsDefined_1;
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
  
  public static boolean variableIsDefined(final EObject[] elements, final String name) {
    boolean _notEquals = (!Objects.equal(elements, null));
    if (_notEquals) {
      int _length = elements.length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer i : _doubleDotLessThan) {
        Object _get = elements[(i).intValue()];
        if ((_get instanceof VariableDefinition)) {
          EObject _get_1 = elements[(i).intValue()];
          VariableDefinition variableDefinition = ((VariableDefinition) _get_1);
          String _name = variableDefinition.getName();
          boolean _equals = _name.equals(name);
          if (_equals) {
            return true;
          }
        } else {
          EObject _get_2 = elements[(i).intValue()];
          ValidationUtils.checkIfCalledVariableIsGlobal(_get_2, name, (-1));
        }
      }
    }
    return false;
  }
  
  public static boolean functionIsDefined(final FunctionDefinition[] functions, final String name) {
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
    Iterable<FunctionDefinition> functionDefinitions = Iterables.<FunctionDefinition>filter(((Iterable<?>)Conversions.doWrapArray(_array)), FunctionDefinition.class);
    EObject _eContainer_1 = fd.eContainer();
    EList<EObject> _eContents_1 = _eContainer_1.eContents();
    int indexOfThisFunctionDefinition = _eContents_1.indexOf(fd);
    final Iterable<FunctionDefinition> _converted_functionDefinitions = (Iterable<FunctionDefinition>)functionDefinitions;
    int _length = ((Object[])Conversions.unwrapArray(_converted_functionDefinitions, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      if (((i).intValue() != indexOfThisFunctionDefinition)) {
        boolean _and = false;
        String _name = fd.getName();
        final Iterable<FunctionDefinition> _converted_functionDefinitions_1 = (Iterable<FunctionDefinition>)functionDefinitions;
        FunctionDefinition _get = ((FunctionDefinition[])Conversions.unwrapArray(_converted_functionDefinitions_1, FunctionDefinition.class))[(i).intValue()];
        String _name_1 = _get.getName();
        boolean _equals = _name.equals(_name_1);
        if (!_equals) {
          _and = false;
        } else {
          EList<String> _parameters = fd.getParameters();
          int _length_1 = ((Object[])Conversions.unwrapArray(_parameters, Object.class)).length;
          final Iterable<FunctionDefinition> _converted_functionDefinitions_2 = (Iterable<FunctionDefinition>)functionDefinitions;
          FunctionDefinition _get_1 = ((FunctionDefinition[])Conversions.unwrapArray(_converted_functionDefinitions_2, FunctionDefinition.class))[(i).intValue()];
          EList<String> _parameters_1 = _get_1.getParameters();
          int _length_2 = ((Object[])Conversions.unwrapArray(_parameters_1, Object.class)).length;
          boolean _equals_1 = (_length_1 == _length_2);
          _and = _equals_1;
        }
        if (_and) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean functionIsDefinedBeforeTheCode(final FunctionDefinition fd) {
    EObject _eContainer = fd.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    EObject _eContainer_1 = fd.eContainer();
    EList<EObject> _eContents_1 = _eContainer_1.eContents();
    int _indexOf = _eContents_1.indexOf(fd);
    List<EObject> elementsBeforeDefinition = _eContents.subList(0, _indexOf);
    final List<EObject> _converted_elementsBeforeDefinition = (List<EObject>)elementsBeforeDefinition;
    int _length = ((Object[])Conversions.unwrapArray(_converted_elementsBeforeDefinition, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      EObject _get = elementsBeforeDefinition.get((i).intValue());
      if ((!(_get instanceof FunctionDefinition))) {
        return false;
      }
    }
    return true;
  }
  
  public static EObject getDidiModel(final EObject element) {
    EObject container = element.eContainer();
    while ((!(container instanceof DidiModel))) {
      EObject _eContainer = container.eContainer();
      container = _eContainer;
    }
    return container;
  }
  
  public static EObject getContainerBeforeDidiModel(final EObject element) {
    EObject container = element.eContainer();
    while ((!(container.eContainer() instanceof DidiModel))) {
      {
        EObject temp = container;
        EObject _eContainer = container.eContainer();
        container = _eContainer;
        if ((element instanceof VariableDefinition)) {
          EList<EObject> _eContents = container.eContents();
          EList<EObject> _eContents_1 = container.eContents();
          int _indexOf = _eContents_1.indexOf(temp);
          int _plus = (_indexOf + 1);
          EList<EObject> _eContents_2 = container.eContents();
          int _length = ((Object[])Conversions.unwrapArray(_eContents_2, Object.class)).length;
          List<EObject> _subList = _eContents.subList(_plus, _length);
          String _name = ((VariableDefinition) element).getName();
          ValidationUtils.checkIfVariableIsUsed(_subList, _name);
        }
      }
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
      {
        EObject _get = elementContents.get((i).intValue());
        if ((_get instanceof VariableCall)) {
          EObject _get_1 = elementContents.get((i).intValue());
          String _calledVariableName = ((VariableCall) _get_1).getCalledVariableName();
          boolean _equals = _calledVariableName.equals(name);
          if (_equals) {
            ValidationUtils.variableIsUsed = true;
            return;
          }
        }
        EObject _get_2 = elementContents.get((i).intValue());
        if ((_get_2 instanceof VariableDefinition)) {
          EObject _get_3 = elementContents.get((i).intValue());
          String _name = ((VariableDefinition) _get_3).getName();
          boolean _equals_1 = _name.equals(name);
          if (_equals_1) {
            ValidationUtils.variableIsUsed = true;
            return;
          }
        }
        EObject _get_4 = elementContents.get((i).intValue());
        EList<EObject> _eContents = _get_4.eContents();
        ValidationUtils.checkIfVariableIsUsed(_eContents, name);
      }
    }
  }
  
  public static void checkIfFunctionIsUsed(final List<EObject> elementContents, final String name) {
    if (ValidationUtils.functionIsUsed) {
      return;
    }
    int _length = ((Object[])Conversions.unwrapArray(elementContents, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      EObject _get = elementContents.get((i).intValue());
      if ((_get instanceof FunctionCall)) {
        EObject _get_1 = elementContents.get((i).intValue());
        String _calledFunctionName = ((FunctionCall) _get_1).getCalledFunctionName();
        boolean _equals = _calledFunctionName.equals(name);
        if (_equals) {
          ValidationUtils.functionIsUsed = true;
          return;
        }
      } else {
        EObject _get_2 = elementContents.get((i).intValue());
        EList<EObject> _eContents = _get_2.eContents();
        ValidationUtils.checkIfFunctionIsUsed(_eContents, name);
      }
    }
  }
  
  public static boolean variableIsDefinedBeforeElement(final EObject element, final String name) {
    EObject container = element.eContainer();
    EObject[] elements = null;
    EObject containerElement = element.eContainer();
    int containerElementIndex = 0;
    if ((!(container instanceof DidiModel))) {
      while ((!(container instanceof DidiModel))) {
        {
          EObject _eContainer = container.eContainer();
          container = _eContainer;
          boolean _or = false;
          if ((((((container instanceof IfFragment) || (container instanceof ElseIfFragment)) || (container instanceof ElseFragment)) || (container instanceof ForStatement)) || (container instanceof WhileStatement))) {
            _or = true;
          } else {
            _or = (container instanceof FunctionDefinition);
          }
          if (_or) {
            if ((container instanceof ForStatement)) {
              VariableDefinition definedVar = ((ForStatement) container).getForVar();
              String _name = definedVar.getName();
              String _string = _name.toString();
              String _string_1 = name.toString();
              boolean _equals = _string.equals(_string_1);
              if (_equals) {
                return true;
              }
            }
            if ((container instanceof FunctionDefinition)) {
              EList<String> _parameters = ((FunctionDefinition) container).getParameters();
              boolean _namePersistsInArray = ValidationUtils.namePersistsInArray(((String[])Conversions.unwrapArray(_parameters, String.class)), name);
              if (_namePersistsInArray) {
                return true;
              }
            }
            EList<EObject> _eContents = container.eContents();
            int _indexOf = _eContents.indexOf(containerElement);
            containerElementIndex = _indexOf;
            EList<EObject> _eContents_1 = container.eContents();
            List<EObject> _subList = _eContents_1.subList(0, containerElementIndex);
            elements = ((EObject[])Conversions.unwrapArray(_subList, EObject.class));
            boolean _variableIsDefined = ValidationUtils.variableIsDefined(elements, name);
            if (_variableIsDefined) {
              return true;
            }
            elements = null;
          }
          EObject _eContainer_1 = containerElement.eContainer();
          if ((!(_eContainer_1 instanceof DidiModel))) {
            EObject _eContainer_2 = containerElement.eContainer();
            containerElement = _eContainer_2;
          }
        }
      }
    } else {
      containerElement = element;
    }
    EList<EObject> _eContents = container.eContents();
    int _indexOf = _eContents.indexOf(containerElement);
    containerElementIndex = _indexOf;
    EList<EObject> _eContents_1 = container.eContents();
    List<EObject> _subList = _eContents_1.subList(0, containerElementIndex);
    Object[] _array = _subList.toArray();
    Iterable<VariableDefinition> variables = Iterables.<VariableDefinition>filter(((Iterable<?>)Conversions.doWrapArray(_array)), VariableDefinition.class);
    final Iterable<VariableDefinition> _converted_variables = (Iterable<VariableDefinition>)variables;
    boolean _variableIsDefined = ValidationUtils.variableIsDefined(((EObject[])Conversions.unwrapArray(_converted_variables, EObject.class)), name);
    if (_variableIsDefined) {
      return true;
    }
    ValidationUtils.checkIfCalledVariableIsGlobal(container, name, containerElementIndex);
    if ((!ValidationUtils.globalVariableFound)) {
      return false;
    }
    ValidationUtils.globalVariableFound = false;
    return true;
  }
}
