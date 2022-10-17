import java.security.SecureRandom;
import java.util.Scanner;

public class Week7 {
    public static int[] RandomDice(int numIterations) {
        int[] values = {0,0,0,0,0,0,0,0,0,0}; // Initialize all counters to zero.
        int side; // The current side.
        SecureRandom rng = new SecureRandom(); // Initialize the random number generator.

        for (int i=0; i<numIterations; i++) {
            // Set the side equal to a random number between 0 and 9.
            // This will be our array index.
            side = rng.nextInt(10);
            // Increment the counter corresponding to the picked side.
            values[side] = values[side] + 1;
        }

        // Return the values array.
        return values;
    }

    public static void runRandomDice() {
        // Call the RandomDice method with the number of iterations as an argument.
        int[] diceValues = RandomDice(1000000);

        /* Print out all values. */
        System.out.println("====RANDOM DICE====\n\n___________________\nSide: | Frequency: ");
        for (int i=0; i<10; i++) {
            System.out.println((i+1) + "       " + diceValues[i]);
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾\n");
    }

    public static void runGradeClassifier() {

        // Scan for user input
        Scanner userInput = new Scanner(System.in);
        double[] grades = new double[10];
        int currentGrade;
        int average = 0;
        int numGrades = 0;

        // Continue to accept grades until ‘-1’ is entered or the amount exceeds 10.
        System.out.print("Enter up to ten grades. Enter -1 to terminate. \n-> ");
        for (int i=0; i<10; i++) {
            currentGrade = userInput.nextInt();
            if (currentGrade < 0)
                break;
            grades[i] = currentGrade;
            average += currentGrade; // Add to average
            numGrades++; // Increment total.
            System.out.print("-> ");

        }
        average /= numGrades; // Divide by the total to get the average.

        int aboveOrEqualToAvg = 0;
        int belowAvg = 0;

        // Classify grades by their relationship to the average.
        for (int i=0; i<numGrades; i++) {
            if (grades[i] >= average) {
                aboveOrEqualToAvg++;
            } else {
                belowAvg++;
            }
        }
        System.out.println("==GRADE CLASSIFIER==\n\n");


        // Print each grade then the average, above or equal average, and below average amounts.
        for (int i=0; i<numGrades; i++) {
            System.out.println("Student " + (i+1) + ": " + grades[i] + "%");
        }

        System.out.println("Average grade: " + average + "%");
        System.out.println("Satisfactory grades: " + aboveOrEqualToAvg);
        System.out.println("Grades that need improvement: " + belowAvg);
    }


    // Invoke our methods.
    public static void main(String[] args) {
        runRandomDice();
        runGradeClassifier();
    }
}