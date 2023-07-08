import java.util.*;
public class Main {
    static boolean palindromic(int i, int j, int arr[]){
        while (i<=j){
            if (arr[i]==arr[j]){
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
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int max=1;
        int start=0;
        int end=0;
        int arr[]=new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (Main.palindromic(i,j,arr)){
                    if (j-i>max){
                      start=i;
                      end=j;
                      max=j-i;
                    }
                    System.out.println();
                }
            }
        }
        for (int m=start;m<=end;m++) {
            System.out.print(arr[m] + " ");


    }
}}