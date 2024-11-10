public class HollowDiamond {

    static void printRow(int space, int stars) {
        if (space > 0) {
            System.out.print(" ");
            printRow(space - 1, stars);
        } else if (stars > 0) {
            if (stars == 1 || stars == 2) {
                System.out.print("*");
            } else {
                System.out.print("*");
                printRow(stars - 2, 0);
                System.out.print("*");
            }
        }
    }

   
    static void upperDiamond(int n, int row) {
        if (row <= n-1) {
            printRow(n - row, 2 * row - 1);
            System.out.println();
            upperDiamond(n, row + 1);
        }
    }

    static void lowerDiamond(int n, int row) {
        if (row >= 1) {
            printRow(n - row+1, 2 * row -1);
            System.out.println();
            lowerDiamond(n, row - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5; 
        upperDiamond(n, 1);  
        lowerDiamond(n - 1, n -1);
    }
}
