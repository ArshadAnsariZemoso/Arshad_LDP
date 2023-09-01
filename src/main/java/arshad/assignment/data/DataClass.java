package arshad.assignment.data;

public class DataClass {
	private int intValue; // Member variable not initialized
	private char charValue; // Member variable not initialized

	public void printMemberVariables() {
		System.out.println("int: " + intValue);
		System.out.println("char: " + charValue);
	}

	public void printLocalVariables() {
		int localVar1; // Local variable not initialized
		char localVar2; // Local variable not initialized

		// Attempting to print uninitialized local variables
		// These lines will compile but will result in default values being printed.
		/*
		 * The error occurs because localVar1 and localVar2 are declared but not
		 * assigned any values before you attempt to print them. Java requires that
		 * local variables have a defined value before you can use them, and
		 * uninitialized local variables will lead to a compilation error.
		 */
//		System.out.println("Local int: " + localVar1);
//		System.out.println("Local char: " + localVar2);

		/*
		 * You can print intValue and charValue without any issues because they are
		 * member variables of the class DataClass. Member variables are automatically
		 * initialized to default values if you don't explicitly initialize them.
		 */
	}
}
