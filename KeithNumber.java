import java.util.Scanner;
public class KeithNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String s = sc.next();
        int length = s.length();
        int n1 = Integer.parseInt(s);
        int n2 = n1;
        int a[] = new int[100];
        int insert = length;
        while(n2!=0)
        {
            int mod = n2%10;
            a[--insert] = mod;
            n2 = n2/10;
        }
        int flag = length;
        int sum = 0;
        int count= 0;
        while(true)
        {
            for(int i=count;i<flag;i++)
            {
                sum += a[i];
            }
            if(sum>n1)
            {
                System.out.println(n1+" is not a Keith Number");
                System.exit(0);
            }
            if(sum==n1)
            {
                System.out.println(n1+" is a Keith Number");
                System.exit(0);
            }
            a[flag++] = sum;
            count++;
            sum=0;
        }
    }
}


