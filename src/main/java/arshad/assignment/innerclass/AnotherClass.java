package arshad.assignment.innerclass;

class AnotherClass {
    class InnerClass2 extends OuterClass.InnerClass1 {
        InnerClass2(OuterClass outerObj, String message) {
            outerObj.super(message);
        }

        void displayMessageFromInnerClass2() {
            System.out.println("InnerClass2 Message: " + getMessage());
        }
    }
}
