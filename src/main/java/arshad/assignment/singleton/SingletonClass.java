package arshad.assignment.singleton;

public class SingletonClass {
    private String stringValue; // Non-static member variable

    // Private constructor to prevent direct instantiation
    private SingletonClass() {
    }

    // Static method to create and initialize the SingletonClass object
    public static SingletonClass createInstance(String value) {
        SingletonClass instance = new SingletonClass();
        instance.setStringValue(value);
        return instance;
    }

    // Non-static method to print the String value
    public void printStringValue() {
        System.out.println("String value: " + stringValue);
    }

    // Setter method to set the String value
    private void setStringValue(String value) {
        stringValue = value;
    }
}
