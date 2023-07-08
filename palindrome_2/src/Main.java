import java.util.Scanner;

public class Main {
    static void optimal_palindrome(String s, int m, int n) {
        while (m > 0 && m <= n && n < s.length()) {
            if (s.charAt(m) == s.charAt(n)) {
                System.out.println();
                for (int k = m; k <= n; k++) {
                    System.out.print(s.charAt(k));
                }
            }
        }
    }

            public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s="maharaja";
        for(int i=0; i<s.length();i++){

            Main.optimal_palindrome(s,i,i+1);
            Main.optimal_palindrome(s,i-1,i+1);
        }
    }
}