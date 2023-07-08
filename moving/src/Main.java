import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static void moving_zeroes(int arr[]){
        int i=0;
        int j=0;
        while (j<arr.length){
            if (arr[j]==0){
                j++;
            }
            else{
                arr[i]=arr[j];
                i++;
                j++;
            }
        }
        while (i<arr.length){
            arr[i]=0;
        }
        for(int m=0;m<arr.length;m++){
        System.out.print(arr[m]+' ');
    }}
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
}