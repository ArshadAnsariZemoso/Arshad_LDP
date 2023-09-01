package arshad.assignment.assignment4;

class Gerbil extends Rodent {
	Gerbil() {
		System.out.println("This is a Gerbil.");
	}

	@Override
    void run() {
        System.out.println("Gerbil is darting.");
    }
}