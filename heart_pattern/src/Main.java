
class patterns {
    static void vee(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<(2*n);col++){
                if ((row==col)|| (col+row==(2*n))){
                    System.out.print(("*"));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void invertedVee(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<(2*n);col++){
                if ((row+col==n+1)|| (col-row==(n-1))){
                    System.out.print(("*"));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void heart(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n + 1; col++) {
                if ((row == 0 && col % 3 != 0) || (row == 1 && col % 3 == 0) || (row + col == n + 2) || (row - col == 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    static void sq_daignal(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if ((row == col) || (row + col == n + 1)|| (row==1)|| (col==1)||(row==n)|| (col==n)) {
                    System.out.print("*"+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    static void cross(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if ((row<=n/2+1) && ((row == col) || (row + col == n + 1)) ) {
                    System.out.print(row);
                }
                else if((row>n/2+1) &&((row == col) || (row + col == n + 1))){
                    System.out.print(n+1-row);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void backward(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if ((row == col)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void forward_slash(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if ((row + col == n + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        int n=4;
        patterns.invertedVee(n);

    }
}