package bg.tues.DCL;


public class Main {

	public static void main(String[] args) throws Exception {
		DCLInterpreter interpreter = new DCLInterpreter();
		interpreter.execute("test.dd", System.out);
	}
}