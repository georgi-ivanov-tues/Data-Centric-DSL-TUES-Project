package bg.tues.didi;


public class Main {

	public static void main(String[] args) throws Exception {
		DCLInterpreter interpreter = new DCLInterpreter();
		interpreter.execute("test.dd", System.out);
	}
}