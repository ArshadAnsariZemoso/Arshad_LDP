package arshad.assignment.assignment6;

public class Main {
	// Method that takes InterfaceA as an argument
	static void methodWithInterfaceA(InterfaceA obj) {
		obj.methodA1();
		obj.methodA2();
	}

	// Method that takes InterfaceB as an argument
	static void methodWithInterfaceB(InterfaceB obj) {
		obj.methodB1();
		obj.methodB2();
	}

	// Method that takes InterfaceC as an argument
	static void methodWithInterfaceC(InterfaceC obj) {
		obj.methodC1();
		obj.methodC2();
	}

	// Method that takes CombinedInterface as an argument
	static void methodWithCombinedInterface(CombinedInterface obj) {
		obj.methodA1();
		obj.methodB1();
		obj.methodC1();
		obj.additionalMethod();
	}

	public static void main(String[] args) {
		MyClass myObject = new MyClass();

		// Pass the object to methods with respective interfaces
		methodWithInterfaceA(myObject);
		methodWithInterfaceB(myObject);
		methodWithInterfaceC(myObject);
		methodWithCombinedInterface(myObject);

		// Call a method from the concrete class
		myObject.concreteMethod();
	}
}
