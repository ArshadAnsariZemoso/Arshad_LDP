package arshad.assignment.innerclass;

class OuterClass {
    class InnerClass1 {
        private String message;

        InnerClass1(String message) {
            this.message = message;
        }

        void displayMessage() {
            System.out.println("InnerClass1 Message: " + message);
        }

        String getMessage() {
            return message;
        }
    }
}