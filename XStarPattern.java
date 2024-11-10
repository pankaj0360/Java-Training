public class XStarPattern {

    public static void printX(int row, int col, int size) {
        if (row == size) {
            return; // Base case: we've reached the end of the "X"
        }

        if (row == col || row + col == size - 1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }

        if (col == size - 1) {
            System.out.println(); // Move to the next row
            printX(row + 1, 0, size); // Recursively print the next row
        } else {
            printX(row, col + 1, size); // Recursively print the next column
        }
    }


    public static void main(String[] args) {
        int size = 5;
        printX(0,0, size);
    }
}
