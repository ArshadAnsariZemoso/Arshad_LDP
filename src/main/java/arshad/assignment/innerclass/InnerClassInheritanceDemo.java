package arshad.assignment.innerclass;

public class InnerClassInheritanceDemo {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        AnotherClass anotherObj = new AnotherClass();
        AnotherClass.InnerClass2 innerObj2 = anotherObj.new InnerClass2(outerObj, "Hello from InnerClass2");

        innerObj2.displayMessage();
        innerObj2.displayMessageFromInnerClass2();
    }
}
