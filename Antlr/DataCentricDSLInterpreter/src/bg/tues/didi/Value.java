package bg.tues.didi;

import java.sql.ResultSet;
import java.util.List;

public class Value implements Comparable<Value> {

  public static final Value NULL = new Value();
  public static final Value VOID = new Value();

  private Object value;

  private Value() {
    // Private constructor: only used for NULL and VOID
    value = new Object();
  }

  public Value(Object v) {
    if(v == null) {
      throw new RuntimeException("value == null");
    }
    value = v;
    // Only accept boolean, list, number or string types
    if(!(isBoolean() || isList() || isNumber() || isString() || isResultSet() || isFunction())) {
      throw new RuntimeException("Invalid data type: " + v + " (" + v.getClass() + ")");
    }
  }

  public ResultSet asResultSet(){
	return (ResultSet)value;
  }
  
  public Boolean asBoolean() {
    return (Boolean)value;
  }

  public Double asDouble() {
    return ((Number)value).doubleValue();
  }

  public Long asLong() {
    return ((Number)value).longValue();
  }

  @SuppressWarnings("unchecked")
  public List<Value> asList() {
    return (List<Value>)value;
  }

  public String asString() {
    return (String)value;
  }

  @Override
  public int compareTo(Value that) {
    if(this.isNumber() && that.isNumber()) {
      if(this.equals(that)) {
        return 0;
      }
      else {
        return this.asDouble().compareTo(that.asDouble());
      }
    }
    else if(this.isString() && that.isString()) {
      return this.asString().compareTo(that.asString());
    }
    else {
      throw new RuntimeException("Illegal expression: can't compare \'" + this + "\' to \'" + that + "\'");
    }
  }

  @Override
  public boolean equals(Object o) {
    if(this == VOID || o == VOID) {
      throw new RuntimeException("Can't use VOID: " + this + " ==/!= " + o);
    }
    if(this == o) {
      return true;
    }
    if(o == null || this.getClass() != o.getClass()) {
      return false;
    }
    Value that = (Value)o;
    if(this.isNumber() && that.isNumber()) {
      double diff = Math.abs(this.asDouble() - that.asDouble());
      return diff < 0.00000000001;
    }
    else {
      return this.value.equals(that.value);
    }
  }

  @Override
  public int hashCode() {
    return value.hashCode();
  }

  public boolean isFunction(){
	  return value instanceof Function;	  
  }
  
  public boolean isBoolean() {
    return value instanceof Boolean;
  }

  public boolean isNumber() {
    return value instanceof Number;
  }

  public boolean isList() {
    return value instanceof List<?>;
  }

  public boolean isNull() {
    return this == NULL;
  }

  public boolean isVoid() {
    return this == VOID;
  }

  public boolean isString() {
    return value instanceof String;
  }
  
  public boolean isResultSet(){
	  return value instanceof ResultSet;
  }

  @Override
  public String toString() {
    return isNull() ? "NULL" : isVoid() ? "VOID" : String.valueOf(value);
  }
}

