import java.util.Scanner;
public class HappyNb {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number:");
            int n = sc.nextInt();
            System.out.println(isHappyNum(n));
        }

        public static boolean isHappyNum(int n) {
            int sum;
            int original = n;
            java.util.HashSet<Integer> seen = new java.util.HashSet<>();

            while (true) {
                sum = 0;
                while (n > 0) {
                    int rem = n % 10;
                    sum += rem * rem;
                    n = n / 10;
                }

                if (sum == 1) {
                    return true;
                }
                if (seen.contains(sum)) {
                    return false;
                }
                seen.add(sum);
                n = sum;
            }
        }
    }

