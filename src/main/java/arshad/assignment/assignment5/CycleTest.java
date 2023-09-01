package arshad.assignment.assignment5;

public class CycleTest {
	public static void main(String[] args) {
		Cycle[] cycles = new Cycle[3];
		cycles[0] = new Unicycle();
		cycles[1] = new Bicycle();
		cycles[2] = new Tricycle();

		System.out.println("Calling ride() on each element of the array:");
		for (Cycle cycle : cycles) {
			cycle.ride();
		}

		System.out.println("\nCalling balance() on Unicycle and Bicycle after downcasting:");
		for (Cycle cycle : cycles) {
			if (cycle instanceof Unicycle) {
				((Unicycle) cycle).balance();
			} else if (cycle instanceof Bicycle) {
				((Bicycle) cycle).balance();
			}
		}
	}
}
