import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int num_temp=num;
        int count=0;

        while (num>0){
            int digit=num%10; //6
            num=num/10;  //5
            int temp=num;   //5

            while (temp>0){
                int r=temp%10;
                if (r==digit){
                    count++;
                    System.out.println("not a unique number");
                    break;
                }
                temp=temp/10;
            }

        }
        if (count==0){
            System.out.println("unique number");
        }

    }// wap to check twin primes in a given number pair
    // wap to check if  a given number is strong number
    // wap to print the prime digits of a given number
    // wap  to print the fibonacci nth term
    // wap to find the factorial of a number
    // wap to print nth catalan term of a given number

}