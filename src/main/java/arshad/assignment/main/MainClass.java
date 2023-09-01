package arshad.assignment.main;

import arshad.assignment.data.DataClass;
import arshad.assignment.singleton.SingletonClass;

public class MainClass {
    public static void main(String[] args) {
        // Create an object of DataClass
        DataClass dataObject = new DataClass();

        // Call methods to print member variables and local variables
        System.out.println("Printing DataClass member variables:");
        dataObject.printMemberVariables();
        System.out.println("Printing DataClass local variables:");
        dataObject.printLocalVariables();

        // Create an object of SingletonClass using the static method
        SingletonClass singletonObject = SingletonClass.createInstance("Hello, Singleton!");

        // Call the method to print the String value
        System.out.println("Printing SingletonClass String value:");
        singletonObject.printStringValue();
    }
}
