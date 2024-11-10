public class LeftLowerTriangle {

    public static void printTriangle(int n) {
        if (n >= 0) {
            return;
        }

        printRow(n);
        printTriangle(n + 1);
    }

    public static void printRow(int n) {
        if (n >= 0) {
            System.out.println();
            return;
        }

        System.out.print("*");
        printRow(n + 1);
    }
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the triangle
        printTriangle(rows);
    }
}