import java.util.Scanner;
class pattern{
    static void heart(int n){
        for (int row=0;row<n;row++){
            for (int col =0;col<n+1;col++){
                if ((row==0 && col%3!=0) || (row==1 && col%3==0) || (row-col==2) || (row+col==8)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    static void cross(int n)
    { for(int row=1;row<=n;row++){
        for (int col=1;col<=n;col++){
            if ((col+row==n+1)|| (row==col)){
                System.out.print(row);
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }


    }
    static void arrow(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n;col++){
                if ((row==col)||(col+row==n+1)||(col==1)){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void pendulam(int n) {
        for (int row = 1; row <= n-1; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" " + " ");
            }
            for (int col = row; col <= n - 1; col++) {
                System.out.print("*" + " ");
            }
            for (int col = row; col <= n; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n - 1; col++) {
                System.out.print(" " + " ");
            }
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("*" + " ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    } }

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern.arrow(n);

    }
}