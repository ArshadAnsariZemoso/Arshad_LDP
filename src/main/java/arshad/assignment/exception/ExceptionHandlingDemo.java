package arshad.assignment.exception;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		ExceptionThrower thrower = new ExceptionThrower();

		try {
			thrower.throwExceptions();
		} catch (CustomException1 | CustomException2 | CustomException3 e) {
			System.out.println("Caught exception: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed.");
		}

		// Simulate a NullPointerException
		try {
			String nullString = null;
			nullString.length(); // This will throw a NullPointerException
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e.getMessage());
		} finally {
			System.out.println("Finally block after NullPointerException.");
		}
	}
}