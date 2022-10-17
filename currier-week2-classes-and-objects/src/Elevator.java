public class Elevator {
    int currentFloor = 1; // Start from first floor
    String consoleMessages[] = {
            "I: Current floor is: ",
            "E: Upper-most floor has been reached. Cannot proceed!",
            "E: Bottom-most floor has been reached. Cannot proceed!",
    };

    void goUp() {
        if (currentFloor < 3) {
            currentFloor++; // Go up exactly one floor
        } else {
            System.out.println(consoleMessages[1]);
        }
    }

    void goDown() {
        if (currentFloor > 1) {
            currentFloor--; // Go down exactly one floor
        } else {
            System.out.println(consoleMessages[2]);
        }
    }

    void displayCurrentFloor() {
        // Display the current value of currentFloor.
        System.out.println(consoleMessages[0] + currentFloor);
    }
}
