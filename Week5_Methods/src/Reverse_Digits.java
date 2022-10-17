public class Reverse_Digits {
    static int Reverse_Digits(int numberToReverse) {
        int reversedNumber = 0;

        // Iterate over the number until it equals zero.
        while (numberToReverse != 0) {
            // Extract the last digit (aka the remainder when dividing by 10)
            int idx = numberToReverse % 10;
            reversedNumber = reversedNumber * 10 + idx;
            // Exclude the remainder
            numberToReverse = numberToReverse / 10;
        }
        return reversedNumber;
    }
}
