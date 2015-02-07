package bg.tues.validation; 

public class ErrorMessages {

	val public static final UNDEFINED_FUNCTION = "Undefined function.";
	
	val public static final UNDEFINED_VARIABLE = "Undefined variable.";
	
	val public static final FUNCTION_CALL_ARGUMENTS_MISMATCH = "Function call's arguments do not match function definition's arguments.";
	
	val public static final QUERY_FUNCTION_PARAMETER_BOOLEAN_EXPRESSION = "Query function's parameter cannot be a boolean expression.";
		
	val public static final FUNCTION_WITHIN_BLOCK_STATEMENT = "Functions cannot be defined within block statements.";
		
	val public static final FUNCTIONS_BEGINNING_OF_CODE = "Functions must be defined at the beginning of the code.";
		
	val public static final FUNCTION_SAME_NAME = "Function with the same name already exists.";
	
	val public static final UNDEFINED_OPERATOR_BOOLEAN_VALUES = "Undefined operator for boolean values.";
		
	val public static final INCOMPATIBLE_OPERANDS = "Operands of incompatible types.";
	
	val public static final UNUSED_VARIABLE = "Variable is not used.";
	
	val public static final UNUSED_FUNCTION = "Function is not used.";
	
	val public static final UNREACHABLE_CODE = "Code after return statement is unreachable.";
	
	val public static final WRONG_RETURN_STATEMENT_POSITION = "Return statement is only allowed at the end of the code.";
		
}