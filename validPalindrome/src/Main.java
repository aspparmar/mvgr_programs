import java.lang.*;
import java.util.*;
public class Main {
    static boolean optimal_palindrome(String s, int m, int n){
        while(m>0 && m<=n && n<s.length()){
            if (s.charAt(m)==s.charAt(n)){
                System.out.println();
                for(int k=m;k<=n;k++){
                    System.out.print(s.charAt(k));
                }
            }

        }
    }
    static boolean substring_palindrome(String s, int i, int j){
        while(i<=j){
        if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }
        else{
            return false;
        }}
        return true;

    }
    static boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;

        while (i<=j){

            while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z')
               || (s.charAt(i)>='0' && s.charAt(i)<='9') || (s.charAt(i)>='A') && s.charAt(i)<='Z')){
                i++;
            }
            while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z')
                    || (s.charAt(j)>='0' && s.charAt(j)<='9') || (s.charAt(j)>='A') && s.charAt(j)<='Z')){
                j--;
            }
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }


        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0; i<s.length();i++){

            for(int j=i+1;j<s.length();j++){

               if( Main.substring_palindrome(s,i,j)){
                   System.out.println();
                   for(int m=i;m<=j;m++){
                       System.out.print(s.charAt(m));
                   }
               }
            }
        }


    }
}