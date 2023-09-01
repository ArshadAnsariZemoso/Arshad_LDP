package arshad.assignment.assignment4;

class Hamster extends Rodent {
	Hamster() {
		System.out.println("This is a Hamster.");
	}

	@Override
	void sleep() {
		System.out.println("Hamster is taking a nap.");
	}
}
