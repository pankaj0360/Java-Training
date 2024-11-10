import java.util.Scanner;

public class recursion {
    static void printnb(int n){
        if(n==0){
            return ;
        }

            printnb(n - 1);
            System.out.println(n);


    }
    public static void main(String[] args) {
        printnb(5);



    }
}
