public class Main {
    public static void main(String[] args) {
        Elevator elevatorClass = new Elevator(); // Instantiate our Elevator class

        elevatorClass.displayCurrentFloor();
        elevatorClass.goUp(); // Go UP from first to second floor
        elevatorClass.displayCurrentFloor();
        elevatorClass.goUp(); // Go UP from second to third floor
        elevatorClass.displayCurrentFloor();
        elevatorClass.goUp(); // Attempt to go UP to a non-existent fourth floor. Should result in an error.
        elevatorClass.displayCurrentFloor();
        elevatorClass.goDown(); // Go DOWN from third to second floor.
        elevatorClass.displayCurrentFloor();
        elevatorClass.goDown(); // Go DOWN from second to first floor.
        elevatorClass.displayCurrentFloor();
    }
}