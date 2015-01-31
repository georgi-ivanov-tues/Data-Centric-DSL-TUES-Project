package org.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.dataCentricDSL.Addition;
import org.dataCentricDSL.BooleanValue;
import org.dataCentricDSL.ConditionElement;
import org.dataCentricDSL.DataCentricDSL;
import org.dataCentricDSL.Division;
import org.dataCentricDSL.ForStatement;
import org.dataCentricDSL.FunctionDecl;
import org.dataCentricDSL.IfStatement;
import org.dataCentricDSL.Mod;
import org.dataCentricDSL.Multiplication;
import org.dataCentricDSL.NumberLiteral;
import org.dataCentricDSL.Substraction;
import org.dataCentricDSL.VariableDecl;
import org.dataCentricDSL.WhileStatement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ValidationUtils {
  public static boolean globalVariableFound = false;
  
  public static void checkIfCalledVariableIsGlobal(final EObject object, final String name, final int index) {
    if (ValidationUtils.globalVariableFound) {
      return;
    }
    boolean _or = false;
    if (((((object instanceof DataCentricDSL) || (object instanceof IfStatement)) || (object instanceof ForStatement)) || (object instanceof WhileStatement))) {
      _or = true;
    } else {
      _or = (object instanceof FunctionDecl);
    }
    if (_or) {
      int lastIndex = 0;
      boolean variableFound = false;
      if ((object instanceof DataCentricDSL)) {
        lastIndex = index;
        EList<EObject> _eContents = ((DataCentricDSL)object).eContents();
        List<EObject> _subList = _eContents.subList(0, lastIndex);
        Object[] _array = _subList.toArray();
        Iterable<VariableDecl> _filter = Iterables.<VariableDecl>filter(((Iterable<?>)Conversions.doWrapArray(_array)), VariableDecl.class);
        final Function1<VariableDecl, Boolean> _function = new Function1<VariableDecl, Boolean>() {
          public Boolean apply(final VariableDecl it) {
            return Boolean.valueOf(it.isIsGlobal());
          }
        };
        Iterable<VariableDecl> _filter_1 = IterableExtensions.<VariableDecl>filter(_filter, _function);
        boolean _variableIsDeclared = ValidationUtils.variableIsDeclared(((VariableDecl[])Conversions.unwrapArray(_filter_1, VariableDecl.class)), name);
        variableFound = _variableIsDeclared;
      } else {
        EList<EObject> _eContents_1 = object.eContents();
        int _length = ((Object[])Conversions.unwrapArray(_eContents_1, Object.class)).length;
        lastIndex = _length;
        EList<EObject> _eContents_2 = object.eContents();
        Object[] _array_1 = _eContents_2.toArray();
        Iterable<VariableDecl> _filter_2 = Iterables.<VariableDecl>filter(((Iterable<?>)Conversions.doWrapArray(_array_1)), VariableDecl.class);
        final Function1<VariableDecl, Boolean> _function_1 = new Function1<VariableDecl, Boolean>() {
          public Boolean apply(final VariableDecl it) {
            return Boolean.valueOf(it.isIsGlobal());
          }
        };
        Iterable<VariableDecl> _filter_3 = IterableExtensions.<VariableDecl>filter(_filter_2, _function_1);
        boolean _variableIsDeclared_1 = ValidationUtils.variableIsDeclared(((VariableDecl[])Conversions.unwrapArray(_filter_3, VariableDecl.class)), name);
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
      if ((object instanceof VariableDecl)) {
        boolean _and = false;
        boolean _isIsGlobal = ((VariableDecl) object).isIsGlobal();
        if (!_isIsGlobal) {
          _and = false;
        } else {
          String _name = ((VariableDecl) object).getName();
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
  
  public static boolean variableIsDeclared(final VariableDecl[] variables, final String name) {
    boolean _notEquals = (!Objects.equal(variables, null));
    if (_notEquals) {
      int _length = variables.length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer i : _doubleDotLessThan) {
        VariableDecl _get = variables[(i).intValue()];
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
  
  public static boolean functionIsDeclared(final FunctionDecl[] functions, final String name) {
    int _length = functions.length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      FunctionDecl _get = functions[(i).intValue()];
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
  
  public static boolean checkOperandsCompatibility(final ConditionElement leftOperand, final ConditionElement rightOperand) {
    boolean _or = false;
    if ((((((leftOperand instanceof Addition) || (leftOperand instanceof Substraction)) || (leftOperand instanceof Multiplication)) || (leftOperand instanceof Division)) || (leftOperand instanceof Mod))) {
      _or = true;
    } else {
      _or = (leftOperand instanceof NumberLiteral);
    }
    if (_or) {
      if ((rightOperand instanceof BooleanValue)) {
        return false;
      }
    } else {
      boolean _or_1 = false;
      if ((((((rightOperand instanceof Addition) || (rightOperand instanceof Substraction)) || (rightOperand instanceof Multiplication)) || (rightOperand instanceof Division)) || (rightOperand instanceof Mod))) {
        _or_1 = true;
      } else {
        _or_1 = (rightOperand instanceof NumberLiteral);
      }
      if (_or_1) {
        if ((leftOperand instanceof BooleanValue)) {
          return false;
        }
      }
    }
    return true;
  }
  
  public static boolean functionWithTheSameNameExists(final FunctionDecl fd) {
    EObject _eContainer = fd.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    Object[] _array = _eContents.toArray();
    Iterable<FunctionDecl> functionDeclarations = Iterables.<FunctionDecl>filter(((Iterable<?>)Conversions.doWrapArray(_array)), FunctionDecl.class);
    EObject _eContainer_1 = fd.eContainer();
    EList<EObject> _eContents_1 = _eContainer_1.eContents();
    int indexOfThisFunctionDecl = _eContents_1.indexOf(fd);
    final Iterable<FunctionDecl> _converted_functionDeclarations = (Iterable<FunctionDecl>)functionDeclarations;
    int _length = ((Object[])Conversions.unwrapArray(_converted_functionDeclarations, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      if (((i).intValue() != indexOfThisFunctionDecl)) {
        String _name = fd.getName();
        final Iterable<FunctionDecl> _converted_functionDeclarations_1 = (Iterable<FunctionDecl>)functionDeclarations;
        FunctionDecl _get = ((FunctionDecl[])Conversions.unwrapArray(_converted_functionDeclarations_1, FunctionDecl.class))[(i).intValue()];
        String _name_1 = _get.getName();
        boolean _equals = _name.equals(_name_1);
        if (_equals) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean functionIsDeclaredBeforeTheCode(final FunctionDecl fd) {
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
      if ((!(_get instanceof FunctionDecl))) {
        return false;
      }
    }
    return true;
  }
}
