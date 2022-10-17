package com.week1.basicExercises;
import java.util.Scanner;

public class EvenOrOdd {
    // Determine if a number is even or odd
    public static void main(String args[]) {
        int userNum;

        while (true) {
            System.out.println("Enter an integer");
            Scanner userInput = new Scanner(System.in);
            userNum = userInput.nextInt();

            // Evaluate the remainder of the input value. Even numbers shouldn't have a remainder.
            if (userNum % 2 == 0)
                System.out.println(userNum + " is an even number.");
            else
                System.out.println(userNum + " is an odd number.");
        }
    }
}
