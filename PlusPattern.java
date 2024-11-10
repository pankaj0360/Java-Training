public class PlusPattern {

    public static void printPlusPattern(int n, int row, int col) {
        if (row >= n) {
            return;
        }
        if (row == n / 2 || col == n / 2) {
            System.out.print("* ");
        }
        else {
            System.out.print("  ");
        }
        if (col < n - 1) {
            printPlusPattern(n, row, col + 1); 
        } 
        else {
            System.out.println();
            printPlusPattern(n, row + 1, 0); 
        }
    }

    public static void main(String[] args) {
        int n = 5; 
        printPlusPattern(n, 0, 0);
    }
}
