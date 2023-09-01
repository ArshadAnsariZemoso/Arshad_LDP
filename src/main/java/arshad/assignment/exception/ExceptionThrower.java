package arshad.assignment.exception;

class ExceptionThrower {
    public void throwExceptions() throws CustomException1, CustomException2, CustomException3 {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) {
            throw new CustomException1("Custom Exception 1");
        } else if (choice == 1) {
            throw new CustomException2("Custom Exception 2");
        } else {
            throw new CustomException3("Custom Exception 3");
        }
    }
}