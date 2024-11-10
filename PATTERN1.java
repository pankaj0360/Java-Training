public class PATTERN1 {
    static void printPrtn(int currentNb , int nb){
        if(currentNb>nb){
            return;
        }
        PrintPrtn(nb);
        System.out.println();
        printPrtn(currentNb+1,nb);

    }
    static void PrintPrtn(int nb){
        if(nb==0){
            return;
        }
        System.out.print("* ");
        PrintPrtn(nb-1);
    }
    public static void main(String[] args) {
        printPrtn(1,4);
    }
}
