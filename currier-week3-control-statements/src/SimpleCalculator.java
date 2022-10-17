import java.util.Scanner;

public class SimpleCalculator {
    public static float calculate(int operand0, int operand1, int operator) {
        int result = 0;
        switch(operator) {
            case 1:
                result = operand0 + operand1;
                break;
            case 2:
                result = operand0 - operand1;
                break;
            case 3:
                result = operand0 * operand1;
                break;
            case 4:
                result = operand0 / operand1;
                break;
            case 5:
                result = operand0 % operand1;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    public static void printLegend() {
        System.out.println("1: Add\n2: Subtract\n3: Multiply\n4: Divide\n5: Remainder");
    }

    public static void main(String[] args) {
        int operand0, operand1, operation;
        System.out.println("Enter first number: ");
        Scanner userInput = new Scanner(System.in);
        operand0 = userInput.nextInt();
        System.out.println("Enter second number: ");
        operand1 = userInput.nextInt();
        System.out.println("Enter operator code.");
        printLegend();
        operation = userInput.nextInt();
        System.out.println("Answer: " + calculate(operand0, operand1, operation));
    }
}