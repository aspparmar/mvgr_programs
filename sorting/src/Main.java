import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] merge(int l, int h, int m, int arr[]){

        int n1=l+m-1;
        int n2=h-m+1;
        int output[]=new int[n1+n2];
        int arr_1[]=new int[n1];
        int arr_2[]=new int[n2];
        for(int i=l;l<n1;i++){
            arr_1[i]=arr[i];
        }
        for (int i=m;i<n2;i++){
            arr_2[i]=arr[i];
        }
        int i=0;
        int j=0;
        int k=0;
        while (i<=j){
            if (arr_1[i]<arr_2[j]){
                output[k]=arr_1[i];
                i++;
                k++;
            }
            else  {
                output[k]=arr_2[j];
                j++;
                k++;

            }
            while(i<=n1){
                output[k]=arr_1[i];
                i++;
                k++;
            }
            while(j<=n2){
                output[k]=arr_1[j];
                j++;
                k++;
            }
        }
     return output;

    }
    static int []   merge_sort(int arr[],int l, int h){


         if (l<=h){
             int mid=(l+h)/2;
         merge_sort(arr,l,mid);
         merge_sort(arr,mid+1,h);
         merge(l,h,mid,arr);
        }




    }
    static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while ((j>=0)&& (key<arr[j])){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    static void  selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void display_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
       int l=0;
       int h=arr.length-1;

       //Main.selection_sort(arr);
        //Main.bubble_sort((arr));
        //Main.insertion_sort(arr);
        Main.merge_sort(arr,l,h);
       Main.display_sort(arr);
    }
}