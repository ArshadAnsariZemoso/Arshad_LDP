package arshad.assignment.assignment4;

class Mouse extends Rodent {
    Mouse() {
        System.out.println("This is a Mouse.");
    }

    @Override
    void eat() {
        System.out.println("Mouse is nibbling.");
    }
}