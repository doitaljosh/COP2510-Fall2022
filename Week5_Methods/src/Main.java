import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while(true) {
            System.out.println("Week5 project. Please enter a function ID. Available IDs are:");
            System.out.println("0: Reverse an integer");
            System.out.print("1: Calculate your age in years\n-> ");
            switch (userInput.nextInt()) {
                case 0:
                    System.out.println("Enter a number to reverse -> ");
                    System.out.println("Reversed number: " + Reverse_Digits.Reverse_Digits(userInput.nextInt()));
                    break;
                case 1:
                    int by, bm, bd;
                    System.out.print("Enter birth year\n-> ");
                    by = userInput.nextInt();
                    System.out.print("Enter birth month\n-> ");
                    bm = userInput.nextInt();
                    System.out.print("Enter birth day\n-> ");
                    bd = userInput.nextInt();
                    System.out.println("You are " + AgeCalculator.CalculateAge(by, bm, bd) + " years old.");
                    break;
            }
            System.out.println();
        }
    }
}
