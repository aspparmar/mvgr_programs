
import java.lang.*;
public class Main {

    public boolean backspaceCompare(String S, String T) {
        int i = S.length()-1;
        int j = T.length()-1;
        while(i>=0 || j>=0) {
            int c1 = 0;
            while (((i >= 0) && ((c1 > 0) || (S.charAt(i))=="#"))){
                if (S.charAt(i) =="#"){
                    c1++;
                }else{
                    c1--;
                }
                i--;
            }
            int c2 = 0;
            while (j >= 0 && (c2 > 0 || T.charAt(j) =="#")){
                if (T.charAt(j) =="#"){
                    c2++;
                }else{
                    c2--;
                }
                j--;
            }
            if (i >= 0 && j >= 0) {
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
            }}}

            public static void main (String[]args){
                System.out.println("a"=="b");


            }
        }