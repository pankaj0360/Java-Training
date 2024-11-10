public class kap {


    public static void main(String[] args) {
        int n = 1342;
        int diff = 0;
        System.out.println(ascending(n));
        System.out.println(decreasing(n));
        int n1 = ascending(n);
        int n2 = decreasing(n);
        diff = n;
//

        int asc;
        int desc;
        while (n != 6174) {
            asc = ascending(n);
            desc = decreasing(n);

            System.out.println(desc + " - " + asc + " = " + (desc - asc));

            n = desc - asc;
            if (n==6174) System.out.println("we get it");
        }
    }

    public static int ascending(int x) {

        int count = 0;
        for (int i = 0; i <= 9; i++) {

            int y = x;
            while (y > 0) {
                int w = y % 10;
                if (i == w)
                    count = count * 10 + w;
                y = y / 10;
            }

        }
        return count;


    }
    public static int decreasing(int x) {

        int count = 0;
        for (int i = 9; i >= 0; i--) {

            int y = x;
            while (y > 0) {
                int w = y % 10;
                if (i == w)
                    count = count * 10 + w;
                y = y / 10;
            }

        }
        return count;

    }

}