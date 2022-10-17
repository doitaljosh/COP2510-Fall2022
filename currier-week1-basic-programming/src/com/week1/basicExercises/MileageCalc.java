package com.week1.basicExercises;

import java.util.Scanner;

public class MileageCalc {
    // Main method. Prompt for user input, calculate, then then call printResult() to evaluate response.
    public static void main(String args[]) {
        double distanceDrivenInMiles;
        double gasConsumedInGallons;
        double mileage;

        while (true) {
            System.out.println("========= Mileage Calculator =========");
            System.out.println("How many miles have you driven?");
            Scanner userInput = new Scanner(System.in);
            distanceDrivenInMiles = userInput.nextDouble();
            System.out.println("How many gallons of gas was consumed?");
            gasConsumedInGallons = userInput.nextDouble();

            mileage = (distanceDrivenInMiles / gasConsumedInGallons);

            printResult(mileage);
        }
    }

    // Evaluate the mileage based on a fixed range to provide constructive feedback to the user.
    private static void printResult(Double mileage) {
        if (mileage <= 10) {
            System.out.println("MPG = " + mileage + "\n" + "Damn, are you driving a Hummer?");
        } else if (mileage > 10 && mileage <= 20) {
            System.out.println("MPG = " + mileage + "\n" + "Meh, nothing to write home about.");
        } else if (mileage > 20 && mileage <= 40) {
            System.out.println("MPG = " + mileage + "\n" + "Not too bad!");
        } else if (mileage > 40) {
            System.out.println("MPG = " + mileage + "\n" + "You must be driving a hybrid!");
        }
    }
}
