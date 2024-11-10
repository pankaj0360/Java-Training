import java.util.Scanner;
import java.math.*;

public class CheckRotateNbIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R, L;
        int Len = 0;
        System.out.print("Enter the nb : ");
        int nb = sc.nextInt();
        int nb1 = nb;
        System.out.print("enter nb of rotation: ");
        int rot = sc.nextInt();
        while (nb1 != 0) {
            Len++;
            nb1 = nb1 / 10;

        }
        if (rot > Len) {
            rot = rot % Len;
        }
        if (rot < Len) {
            rot = rot + Len;
        }


        R = nb % (Math.pow(10, rot));
        L = nb / (Math.pow(10, rot));
        int res = (int) ((R * Math.pow(10, Len - rot)) + L);
        System.out.println(res);

    }
}

// kap's cons = 6174
// let a nb  and sort the nb when the nb kaps cons
//Q2- square and chek last digit same (automorphism)
// Q3 happy nb =1 , suare sinle digit recuurison  stop when length +1
//Q4 ketih nb  when given nb in the serise  Add three last nb like fib