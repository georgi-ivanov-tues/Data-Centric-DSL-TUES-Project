package bg.tues.validation;

import bg.tues.didi.BooleanValue
import bg.tues.didi.ConditionElement
import bg.tues.didi.DidiModel
import bg.tues.didi.ElseFragment
import bg.tues.didi.ElseIfFragment
import bg.tues.didi.ForStatement
import bg.tues.didi.FunctionCall
import bg.tues.didi.FunctionDefinition
import bg.tues.didi.IfFragment
import bg.tues.didi.IfStatement
import bg.tues.didi.VariableCall
import bg.tues.didi.VariableDefinition
import bg.tues.didi.WhileStatement
import java.util.List
import org.eclipse.emf.ecore.EObject

public class ValidationUtils {
	
	var public static boolean globalVariableFound = false;
	var public static boolean variableIsUsed = false;
	var public static boolean functionIsUsed = false;
	
	def static void checkIfCalledVariableIsGlobal(EObject object, String name, int index) {
		if(globalVariableFound) {
			return;
		}
		if(object instanceof DidiModel || object instanceof IfFragment
			|| object instanceof ForStatement || object instanceof WhileStatement
			|| object instanceof FunctionDefinition 
			|| object instanceof ElseIfFragment || object instanceof ElseFragment
		) {	
			var int lastIndex;
			var variableFound = false;
			if(object instanceof DidiModel) {
				lastIndex = index;
				variableFound = variableIsDefined(object.eContents.subList(0, lastIndex).toArray
									.filter(typeof(VariableDefinition)).filter[isGlobal], name)
			} else {
				lastIndex = object.eContents.length;
				variableFound = variableIsDefined(object.eContents.toArray
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

	def static boolean variableIsDefined(EObject[] elements, String name) {
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
	
	def static boolean functionIsDefined(FunctionDefinition[] functions, String name) {
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
		var functionDefinitions = fd.eContainer.eContents.toArray.filter(typeof(FunctionDefinition));
		var indexOfThisFunctionDefinition = fd.eContainer.eContents.indexOf(fd);
		for(i : 0..< functionDefinitions.length) {
			if(i != indexOfThisFunctionDefinition) {
				if(fd.name.equals(functionDefinitions.get(i).name)
					&& fd.parameters.length == functionDefinitions.get(i).parameters.length
				) {
					return true;
				}
			}
		}
			
		return false;
	}
	
	def static boolean functionIsDefinedBeforeTheCode(FunctionDefinition fd) {
		var elementsBeforeDefinition = fd.eContainer.eContents.subList(0, fd.eContainer.eContents.indexOf(fd));
		for(i : 0..< elementsBeforeDefinition.length) {
			if(!(elementsBeforeDefinition.get(i) instanceof FunctionDefinition)) {
				return false;
			}
		}
		
		return true;
	}
	
	def static EObject getDidiModel(EObject element) {
		var container = element.eContainer;
		while(!(container instanceof DidiModel)) {
			container = container.eContainer;
		}
		
		return container;
	}
	
	def static EObject getContainerBeforeDidiModel(EObject element) {
		var container = element.eContainer;
		while(!(container.eContainer instanceof DidiModel)) {
			var temp = container;
			container = container.eContainer;
			if(element instanceof VariableDefinition) {
				checkIfVariableIsUsed(container.eContents.subList(container.eContents.indexOf(temp) + 1, container.eContents.length),
					(element as VariableDefinition).name
				);
			}
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
			}
			if(elementContents.get(i) instanceof VariableDefinition) {
				if((elementContents.get(i) as VariableDefinition).name.equals(name)) {
					variableIsUsed = true;
					return;
				}
			}
			checkIfVariableIsUsed(elementContents.get(i).eContents, name);
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
	
	def static boolean variableIsDefinedBeforeElement(EObject element, String name) {
		var container = element.eContainer;
		var EObject[] elements = null; 
		var EObject containerElement = element.eContainer;
		var int containerElementIndex;
		if(!(container instanceof DidiModel)) {
			while(!(container instanceof DidiModel)) {
				container = container.eContainer;
				
				if(container instanceof IfFragment || container instanceof ElseIfFragment
					|| container instanceof ElseFragment || container instanceof ForStatement
					|| container instanceof WhileStatement || container instanceof FunctionDefinition) {
					
					if(container instanceof ForStatement) {
						var definedVar = (container as ForStatement).forVar;
						if(definedVar.name.toString.equals(name.toString)) {
							return true;
						}
					}
					if(container instanceof FunctionDefinition) {
						if(ValidationUtils
							.namePersistsInArray((container as FunctionDefinition).parameters,
								name
							)) {
							return true;
						}
					}
					containerElementIndex = container.eContents.indexOf(containerElement);
					elements = container.eContents.subList(0, containerElementIndex);
					if(ValidationUtils.variableIsDefined(elements, name)) {
						return true;
					}
					elements = null;
				}
				if(!(containerElement.eContainer instanceof DidiModel)) {
					containerElement = containerElement.eContainer;
				}
			}
		} else {
			containerElement = element;
		}
		containerElementIndex = container.eContents.indexOf(containerElement);
		var variables = container.eContents.subList(0, containerElementIndex).toArray.filter(typeof(VariableDefinition));
		if(ValidationUtils.variableIsDefined(variables, name)) {
			return true;
		}
		ValidationUtils.checkIfCalledVariableIsGlobal(container, name, containerElementIndex);
		if(!ValidationUtils.globalVariableFound) {
			return false;
		}
		ValidationUtils.globalVariableFound = false;
		return true;
	}
	
}