
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static int mysterious_method(int num, int r){
        int summ=0;
        int summ_output=0;
        while (num>0){
            int rem=num%10;
            summ=summ+(rem*r);
            num=num/10;

        }
        while (summ>0){
            int rem=summ%10;
            summ_output=summ_output+(rem);
            summ=summ/10;

        }
        return summ_output;
    }
    static void sort(int arr[]){
        Arrays.sort(arr);

    }
    static void solution(int arr[]){
        if((arr[0]*arr[1])>(arr[arr.length-1]*arr[arr.length-2])){
            System.out.println(arr[0]+" "+arr[1]);
        }
        else{
            System.out.println(arr[arr.length-1]+" "+arr[arr.length-2]);
        }
    }
    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);

                int n=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                Main.sort(arr);
                Main.solution(arr);
    }
}