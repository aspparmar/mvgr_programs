import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int num_test=num;
        while (num>0){
            int r= num%10;
            rev=rev*10+r;
            num=num/10;
        }
        if (rev==num_test){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

        // input is 7654
        // output 4567

    }
}