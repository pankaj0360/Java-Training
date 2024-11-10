public class palindrome {
    public static void main(String[] args) {
        String s = "madam";

//        int i = 0;
//        int j = s.length() - 1;

//        if (palindrome1(i, j, s)) {
//            System.out.println("this is palindrome");
//        } else {
//            System.out.println("this is not palindrome");
//        }
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        int res = s.compareTo(reverse);
        if (res == 0) {
            System.out.println(s + " this string is palindrome");

        } else {
            System.out.println("this string is not palindrome");
        }


    }


//    public static boolean palindrome1(int i, int j, String s) {
//        while (i < j) {
//            if (s.charAt(i) != s.charAt(j))
//                return false;
//
//            i++;
//            j--;
//
//        }
//        return true;
//    }
}