import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name_1=sc.nextLine();
        String name_2=sc.nextLine();
        int count[]=new int[26];
        int i=0;
        int j=0;
        int count=0;

        while (i<name_1.length() && j<name_2.length()){
            if (name_1.charAt(i)==name_2.charAt(j)){
                i++;
                j++;
            }
            else{
                count=count+2;
                i++;
                j++;
            }
        }
        count=count+(name_1.length()-i) +name_2.length()-j;
        System.out.println(count);



    }
}