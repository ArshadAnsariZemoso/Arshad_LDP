package arshad.assignment.assignment5;

public class CycleFactoryDemo {
    public static void main(String[] args) {
        // Create cycles using the factories
        Cycle unicycle = UnicycleFactory.create();
        Cycle bicycle = BicycleFactory.create();
        Cycle tricycle = TricycleFactory.create();

        // Use the created cycles
        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
    }
}