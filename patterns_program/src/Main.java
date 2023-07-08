import java.util.Scanner;
import java.util.Stack;

class Patterns {
    static void  pyramid_test(int n ){
        for(int row=1;row<=n;row++){
            for(int col=row;col<=n-1;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*"+" ");
            }
            for (int col=1;col<=row;col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
    static void rhombus(int n){

        for (int row=1;  row<=n;row++){
            for(int col=row;col<=n-1;col++){
                System.out.print("-"+" ");
            }
            for(int col=1;col<=row-1;col++){
                System.out.print("*"+" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int row=1;row<=n;row++){
            for(int col=1;col<=row-1;col++) {
                System.out.print(" " + " ");
            }
            for (int col=row;col<=n;col++){
                System.out.print("*"+" ");
            }
            for (int col=row;col<=n;col++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
    static void inverted_pyramid_test(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row-1;col++){
                System.out.print("  ");
            }
            for(int col=row;col<=n;col++){
                System.out.print("*"+" ");
            }
            for(int col=row;col<=n-1;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void increasing_test(int n){
        for(int row =1;row<=n;row++){
            for(int col=row;col<=n-1;col++) {
                System.out.print(" " + " ");
            }
                for (int col = 1; col <= row; col++) {
                    System.out.print("*" + " ");
                }
            System.out.println( );

            }

        }

    static void square(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }

    static void increasing(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col=1; col <= row; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }
    static void decreasing(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = row; col <= n; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }

    static void rev_increase(int n) {
        for(int row = 1; row <= n; row++) {
            //decreasing with spaces traingle
            for(int col=row; col<=n-1; col++)
                System.out.print("-" + "  ");

            for(int col=1; col<=row; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }

    }

    static void rev_decreasing(int n) {
        for(int row = 1; row <= n; row++) {
            // Increasing with spaces
            for(int col=1; col<=row-1; col++)
                System.out.print(" " + "  ");
            // Decreasing with stars
            for(int col=row; col<=n; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }

    static void pyramid(int n) {
        for(int row = 1; row <= n; row++) {
            // 1. Decreasing with spaces
            for(int col = row; col <= n-1; col++)
                System.out.print(" " + "  ");
            // 2. Increasing with stars
            for(int col=1; col<=row-1; col++)
                System.out.print("*" + "  ");
            // 3. Increasing with stars
            for(int col=1; col<=row; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }

    static void rev_pyramid(int n) {
        for(int row = 1; row <= n; row++) {
            // 1. Increasing with spaces
            for(int col=1; col<=row-1; col++)
                System.out.print(" " + "  ");
            // 2. Decreasing with stars
            for(int col=row; col<=n-1;col++)
                System.out.print("*" + "  ");
            // 3. Decreasing with stars
            for(int col=row; col<=n;col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }

    static void hill_1(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col=row; col<=n-1;col++)
                System.out.print(" " + "  ");
            for(int col=1; col<=row-1; col++)
                System.out.print("*" + "  ");
            for(int col=1; col<=row; col++)
                System.out.print("*" + "  ");
            for(int col=row; col<=n-1;col++)
                System.out.print(" " + "  ");
            for(int col=row; col<=n-1;col++)
                System.out.print(" " + "  ");
            for(int col=1; col<=row-1; col++)
                System.out.print("*" + "  ");
            for(int col=1; col<=row; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }

    static void diamond(int n) {
        for(int row = 1; row <= n-1; row++) {
            // 1. Decreasing with spaces
            for(int col = row; col <= n-1; col++)
                System.out.print(" " + "  ");
            // 2. Increasing with stars
            for(int col=1; col<=row-1; col++)
                System.out.print("*" + "  ");
            // 3. Increasing with stars
            for(int col=1; col<=row; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
        for(int row = 1; row <= n; row++) {
            // 1. Increasing with spaces
            for(int col=1; col<=row-1; col++)
                System.out.print(" " + "  ");
            // 2. Decreasing with stars
            for(int col=row; col<=n-1;col++)
                System.out.print("*" + "  ");
            // 3. Decreasing with stars
            for(int col=row; col<=n;col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }

    static void mirror(int n) {
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=row; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n; col++)
                System.out.print(" " + "  ");
            for(int col=1; col<=row-1; col++)
                System.out.print(" " + "  ");
            for(int col=row; col<=n; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }

    static void stringPattern(String str) {
        int n = str.length();
        for(int row = 1; row <= n; row++) {
            for(int col=row; col <= n-1; col++)
                System.out.print(" ");
            for(int col=1; col<=row; col++)
                System.out.print(str.charAt(col-1));
            System.out.println();
        }
        for(int row = 1; row <= n; row++) {
            for(int col=row+1; col<=n; col++)
                System.out.print(str.charAt(col-1));
            System.out.println();
        }
    }

    static void h_horizontalLines(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(row==1 || row==n)
                    System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }

    static void h_verticalLines(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(col==1 || col==n)
                    System.out.print("*" + "  ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
    static void h_square(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(row==1 || col ==1 || row==n || col==n)
                    System.out.print("*" + "  ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }

    static void backwardSlash(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(row==col)
                    System.out.print("*" + "  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    static void forwardSlash(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(row+col == n+1)
                    System.out.print("*" + "  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    static void cross(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if((row+col == n+1) ||(row==col))
                    System.out.print("*" + "  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    static void plus(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if((row == n/2+1) || (col==n/2+1))
                    System.out.print("*" + "  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    static void arrow(int n) {
        for(int row = 1; row <= n-1; row++) {
            for(int col=1; col<=row; col++) {
                if (col == 1 || row==col || row==n)
                    System.out.print("*" + "  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        for(int row = 1; row<=n; row++) {
            for(int col=1; col<=n;col++) {
                if(col==1 || row==1 || row+col==n+1)
                    System.out.print("*" + "  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    static void steps(int n) {
        for(int row = 1; row<=n-1; row++) {
            for(int col=1; col<=n-1; col++) {
                if(row==col)
                    System.out.print(row + "  ");
                else
                    System.out.print("   ");
            }
            for(int col=1; col<=n; col++) {
                if(row+col == n+1)
                    System.out.print(row + "  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        for(int row = 1; row<=n; row++) {
            for(int col=1; col<=n-1; col++) {
                if(row+col == n+1)
                    System.out.print(n-row+1 + "  ");
                else
                    System.out.print("   ");
            }
            for(int col=1; col<=n; col++) {
                if(row == col)
                    System.out.print(n-row+1 + "  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner snr = new Scanner(System.in);
        int n = snr.nextInt();

        Patterns.rhombus(n);
    }
}