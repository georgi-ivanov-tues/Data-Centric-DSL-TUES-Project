package org.validation;

import java.util.List
import org.dataCentricDSL.BooleanValue
import org.dataCentricDSL.ConditionElement
import org.dataCentricDSL.DataCentricDSL
import org.dataCentricDSL.ForStatement
import org.dataCentricDSL.FunctionCall
import org.dataCentricDSL.FunctionDefinition
import org.dataCentricDSL.IfStatement
import org.dataCentricDSL.VariableCall
import org.dataCentricDSL.VariableDefinition
import org.dataCentricDSL.WhileStatement
import org.eclipse.emf.ecore.EObject

public class ValidationUtils {
	
	var public static boolean globalVariableFound = false;
	var public static boolean variableIsUsed = false;
	var public static boolean functionIsUsed = false;
	
	def static void checkIfCalledVariableIsGlobal(EObject object, String name, int index) {
		if(globalVariableFound) {
			return;
		}
		if(object instanceof DataCentricDSL || object instanceof IfStatement
			|| object instanceof ForStatement || object instanceof WhileStatement
			|| object instanceof FunctionDefinition
		) {	
			var int lastIndex;
			var variableFound = false;
			if(object instanceof DataCentricDSL) {
				lastIndex = index;
				variableFound = variableIsDeclared(object.eContents.subList(0, lastIndex).toArray
									.filter(typeof(VariableDefinition)).filter[isGlobal], name)
			} else {
				lastIndex = object.eContents.length;
				variableFound = variableIsDeclared(object.eContents.toArray
									.filter(typeof(VariableDefinition)).filter[isGlobal], name);
			}
			if(variableFound) {
				globalVariableFound = true;
				return;
			} else {
				for(i : 0..< lastIndex) {
					checkIfCalledVariableIsGlobal(object.eContents.get(i), name, -1);
				}
			}
		} else if(object instanceof VariableDefinition) {
			if((object as VariableDefinition).isGlobal && (object as VariableDefinition).name.equals(name)) {
 				globalVariableFound = true;
				return;
			}
		}
	}

	def static boolean variableIsDeclared(EObject[] elements, String name) {
		if(elements != null) {
			for(i : 0..< elements.length) {
				if(elements.get(i) instanceof VariableDefinition) {
					var variableDefinition = (elements.get(i) as VariableDefinition);
					if(variableDefinition.name.equals(name)) {
						return true;
					}
				} else {
					checkIfCalledVariableIsGlobal(elements.get(i), name, -1);
				}
			}
		}
		
		return false;
	}
	
	def static boolean functionIsDeclared(FunctionDefinition[] functions, String name) {
		for(i : 0..< functions.length) {
			if(functions.get(i).name.toString.equals(name)) {
				return true;
			}
		}
		
		return false;
	}
	
	def static boolean namePersistsInArray(String[] array, String name) {
		for(i : 0..< array.length) {
			if(array.get(i).equals(name)) {
				return true;
			}
		}
		
		return false;
	}
	
	def static String operandsCOmpatibilityErrorMessage(ConditionElement leftOperand, 
		ConditionElement rightOperand, String operator
	) {
		if(leftOperand instanceof BooleanValue && rightOperand instanceof BooleanValue) {
			if(!operator.equals("==")) {
				if(!operator.equals("!=")) {
					return ErrorMessages.UNDEFINED_OPERATOR_BOOLEAN_VALUES;
				} else {
					return null;
				}
			}
		}
		
		if(leftOperand instanceof BooleanValue) {
			if(!(rightOperand instanceof BooleanValue)
				&& !(rightOperand instanceof VariableCall)) {
				return ErrorMessages.INCOMPATIBLE_OPERANDS;
			}
		} else if(rightOperand instanceof BooleanValue) {
			if(!(leftOperand instanceof BooleanValue)
				&& !(leftOperand instanceof VariableCall)) {
				return ErrorMessages.INCOMPATIBLE_OPERANDS;
			}
		}
		
		return null;
	}
	
	def static boolean functionWithTheSameNameExists(FunctionDefinition fd) {
		var functionDeclarations = fd.eContainer.eContents.toArray.filter(typeof(FunctionDefinition));
		var indexOfThisFunctionDecl = fd.eContainer.eContents.indexOf(fd);
		for(i : 0..< functionDeclarations.length) {
			if(i != indexOfThisFunctionDecl) {
				if(fd.name.equals(functionDeclarations.get(i).name)) {
					return true;
				}
			}
		}
			
		return false;
	}
	
	def static boolean functionIsDeclaredBeforeTheCode(FunctionDefinition fd) {
		var elementsBeforeDeclaration = fd.eContainer.eContents.subList(0, fd.eContainer.eContents.indexOf(fd));
		for(i : 0..< elementsBeforeDeclaration.length) {
			if(!(elementsBeforeDeclaration.get(i) instanceof FunctionDefinition)) {
				return false;
			}
		}
		
		return true;
	}
	
	def static EObject getDataCentricDSLContainer(EObject element) {
		var container = element.eContainer;
		while(!(container instanceof DataCentricDSL)) {
			container = container.eContainer;
		}
		
		return container;
	}
	
	def static EObject getContainerBeforeDataCentricDSLContainer(EObject element) {
		var container = element.eContainer;
		while(!(container.eContainer instanceof DataCentricDSL)) {
			container = container.eContainer;
		}
		
		return container;
	}
	
	def static void checkIfVariableIsUsed(List<EObject> elementContents, String name) {
		if(variableIsUsed) {
			return;
		}
		for(i : 0..< elementContents.length) {
			if(elementContents.get(i) instanceof VariableCall) {
				if((elementContents.get(i) as VariableCall).calledVariableName.equals(name)) {
					variableIsUsed = true;
					return;
				}
			} else {
				checkIfVariableIsUsed(elementContents.get(i).eContents, name);
			}
		}
	}
	
	def static void checkIfFunctionIsUsed(List<EObject> elementContents, String name) {
		if(functionIsUsed) {
			return;
		}
		for(i : 0..< elementContents.length) {
			if(elementContents.get(i) instanceof FunctionCall) {
				if((elementContents.get(i) as FunctionCall).calledFunctionName.equals(name)) {
					functionIsUsed = true;
					return;
				}
			} else {
				checkIfFunctionIsUsed(elementContents.get(i).eContents, name);
			}
		}
	}
}