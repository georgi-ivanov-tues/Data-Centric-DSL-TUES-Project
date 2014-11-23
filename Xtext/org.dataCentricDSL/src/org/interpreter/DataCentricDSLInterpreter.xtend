package org.interpreter

import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import javax.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import java.util.List
import org.eclipse.xtext.common.types.JvmOperation
import org.dataCentricDSL.FunctionCall
import org.eclipse.internal.xtend.util.QualifiedName
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.xbase.XVariableDeclaration

@SuppressWarnings("restriction")
class DataCentricDSLInterpreter extends XbaseInterpreter{
	@Inject extension IJvmModelAssociations 
	
	def assignVariable(JvmOperation operation, Object receiver, List<Object> argumentValues){
		val executable = operation.sourceElements.head
		if (executable instanceof FunctionCall) {
			println("Call function")
//			val context = createContext
//			context.newValue(QualifiedName.create("this"), tortoise)
//			var index = 0
//			for (param : operation.parameters) {
//				context.newValue(QualifiedName.create(param.name), argumentValues.get(index))
//				index = index + 1	
//			}
//			val result = evaluate(executable.body, context, CancelIndicator.NullImpl)
//			if(result.exception != null)
//				throw result.exception
//			result.result
		} else {
			super.invokeOperation(operation, receiver, argumentValues)
		}
	}
	
	// More of less M2M transformation rules
   public bigModel.EObject interprete(DSLEobject o){
      if (o instanceof Person){
         bigModel.Person p = bigModelFactory.eINSTANCE.createPerson();
         p.setName(((Person)o).getName());
         for (String name : ((Person)o).getChildren()){
            bigModel.Person child = bigModelFactory.eINSTANCE.createPerson();
            child .setName(name);
            p.getChildren().add(child);
         }
         return p;
      }
   }
	
	protected Object _evaluateVariableDeclaration(XVariableDeclaration variableDecl, IEvaluationContext context, CancelIndicator indicator) {
		super._evaluateVariableDeclaration(variableDecl, context, indicator);
		return context.getValue(QualifiedName.create(variableDecl.getName()));
	}
	
}