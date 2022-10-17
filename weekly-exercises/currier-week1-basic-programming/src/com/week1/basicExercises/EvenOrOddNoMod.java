package com.week1.basicExercises;

import java.util.Scanner;

public class EvenOrOddNoMod {
    // Determine if a number is even or odd
    public static void main(String args[]) {
        int userNum;

        while (true) {
            System.out.println("Enter an integer");
            Scanner userInput = new Scanner(System.in);
            userNum = userInput.nextInt();

            // AND the input value with 1. If odd, it will return a non-zero value.
            if ((userNum & 1) == 0)
                System.out.println(userNum + " is an even number.");
            else
                System.out.println(userNum + " is an odd number.");
        }
    }
}
