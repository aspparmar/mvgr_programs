import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int m=n;
        while(n!=0){
            int n1=n%10;
            int fact=1,i=1;
            while(i<=n1){
                fact=fact*i;
                i=i+1;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(m==sum){
            System.out.println("strong");
        }
        else{
            System.out.println("not");
        }
    }
}