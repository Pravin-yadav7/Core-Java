package basicProgram;

// program to understand Exception Handling
public class ExceptionHandling2 {

	public static void main(String[] args) {

		// example of Rethrowing new exception
		try {
			
			System.out.println(10 / 0);
			
		} catch (ArithmeticException e) {

			throw new NullPointerException("Invalid Input");

		}

	}

}
