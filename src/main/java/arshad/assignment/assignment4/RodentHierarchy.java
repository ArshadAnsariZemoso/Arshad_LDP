package arshad.assignment.assignment4;

public class RodentHierarchy {
	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[3];
		rodents[0] = new Mouse();
		rodents[1] = new Gerbil();
		rodents[2] = new Hamster();

		System.out.println("Calling common methods:");
		for (Rodent rodent : rodents) {
			rodent.eat();
			rodent.sleep();
			rodent.run();
			System.out.println();
		}
	}
}
