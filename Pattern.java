public class Pattern {
    public static void main(String[] args) {
        int n=4;
//        square
        for (int i=1;i<=n;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("___________________");
//        right
        for (int i=1;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("___________________");
        for (int i=1;i<=n;i++){
            for (int j=2*(n-i);j>=1;j-- ){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("___________________");
        for (int i=n;i>=1;i--){

            for (int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("___________________");


        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i==1||i==n ||j==1||j==n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("___________________");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
            for(int k =1;k<=i;k++) {
                System.out.print(" ");
                }
        }
        System.out.println("___________________");
        for (int i=1;i<=n;i++){
            for (int j=2*(n-i);j>=1;j-- ){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}

