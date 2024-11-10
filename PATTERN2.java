public class PATTERN2 {
    public static void printHollowSquare(int n, int row, int col) {
        if (row > n) {
            return;
        }
        if (col > n) {
            System.out.println();
            printHollowSquare(n, row + 1, 1);
            return;
        }
        if (row == 1 || row == n || col == 1|| col == n) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
        printHollowSquare(n, row, col + 1);
    }

    public static void main(String[] args) {
        int n = 4; // Size of the square
        printHollowSquare(n, 1, 1);
    }
}
