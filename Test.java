import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

    }
}
class car {
    static car obj;
    String name ;
    int wheel;
    private car(String name,int wheel){
        this.name =name;
        this.wheel = wheel;
    }

     static car object( String name,int wheel) {
        if(obj!=null){
            obj = new car(name,wheel);
        }

        return obj;
    }
}

