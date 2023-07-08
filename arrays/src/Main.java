import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        Main.string_methods(str);

    }
    static  void string_methods(String str){
        // length
        System.out.println(str.length());
    }


}