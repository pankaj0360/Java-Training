public class StarDigit8 {

    public static void printLine(String line) {
        System.out.println(line);
    }

    public static void printDigit8(int row) {
        if (row == 7) return;

        if (row == 0 || row == 3 || row == 6) {
            printLine("*****");
        } else {
            printLine("*   *");
        }
        printDigit8(row + 1);
    }

    public static void main(String[] args) {
        printDigit8(0);
    }
}
