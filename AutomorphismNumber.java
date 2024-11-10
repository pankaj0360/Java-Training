import java.util.Scanner;
public class AutomorphismNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        System.out.println(isAutomorphic(n));
    }
    public static int length(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }
    public static boolean isAutomorphic(int n){
        int n_sq = n*n;
        int Last_num = n_sq %(int) Math.pow(10,length(n));
//        System.out.println(Last_num);
        return Last_num==n;

    }
}