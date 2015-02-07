package org.validation;

@SuppressWarnings("all")
public class ErrorMessages {
  public final static String UNDEFINED_FUNCTION = "Undefined function.";
  
  public final static String UNDEFINED_VARIABLE = "Undefined variable.";
  
  public final static String FUNCTION_CALL_ARGUMENTS_MISMATCH = "Function call\'s arguments do not match function definition\'s arguments.";
  
  public final static String QUERY_FUNCTION_PARAMETER_BOOLEAN_EXPRESSION = "Query function\'s parameter cannot be a boolean expression.";
  
  public final static String FUNCTION_WITHIN_BLOCK_STATEMENT = "Functions cannot be defined within block statements.";
  
  public final static String FUNCTIONS_BEGINNING_OF_CODE = "Functions must be defined at the beginning of the code.";
  
  public final static String FUNCTION_SAME_NAME = "Function with the same name already exists.";
  
  public final static String UNDEFINED_OPERATOR_BOOLEAN_VALUES = "Undefined operator for boolean values.";
  
  public final static String INCOMPATIBLE_OPERANDS = "Operands of incompatible types.";
  
  public final static String UNUSED_VARIABLE = "Variable is not used.";
  
  public final static String UNUSED_FUNCTION = "Function is not used.";
  
  public final static String UNREACHABLE_CODE = "Code after return statement is unreachable.";
  
  public final static String WRONG_RETURN_STATEMENT_POSITION = "Return statement is only allowed at the end of the code.";
}
