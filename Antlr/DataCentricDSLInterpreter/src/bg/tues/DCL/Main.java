package bg.tues.DCL;

import java.io.IOException;
import java.sql.SQLException;

import org.antlr.runtime.RecognitionException;

public class Main {

	public static void main(String[] args) throws IOException, RecognitionException, SQLException {
		DCLInterpreter interpreter = new DCLInterpreter();
		interpreter.execute("test.dd");
	}
}
