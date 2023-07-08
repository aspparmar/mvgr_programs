import java.util.Scanner;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        //happy number program

        int n = 1;

        while (n < 1000000000) {
            int num_test = n;
            int count = 0;
           int temp=n;
            int num_tem = n;
            double summ = 0;

            while (temp > 0) {
                count++;
                temp = temp/ 10;
            }
            while (num_test > 0) {
                double rem = num_test % 10;
                summ = summ + Math.pow((double) rem, (count));
                num_test = num_test / 10;
            }

            if ((int) summ == num_tem) {
                System.out.println(num_tem);
            }
            n++;


        }
    }
}
