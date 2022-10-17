public class NestedForLoops {
    public static void main(String[] args) {
        int maxRows = 4;
        for (int row = 0; row < maxRows; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
