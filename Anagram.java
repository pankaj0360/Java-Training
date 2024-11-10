import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String a = sc.nextLine();
        System.out.println("enter first string");
        String b = sc.nextLine();
        if (isAnagram( a, b)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }

    }
    public static boolean isAnagram (String a,String b){
        boolean status = true;
        int arr[] =new int[26];
        if (a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            arr[a.charAt(i)-97]+=1;
            arr[b.charAt(i)-97] -=1;

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                status = false;
            }

        }
        return status;

    }
}
