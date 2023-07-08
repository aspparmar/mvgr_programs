import java.util.Scanner;

public class Main {
    static int ternary_search(int arr[], int search_key){
        int l=0;
        int h=arr.length-1;
        int mid1;
        int mid2;
        while(l<=h){
            mid2=h-(h-l)/3;
            mid1=l+(h-l)/3;
            if (search_key==arr[mid1]){
                return mid1;
            }
            else if(search_key==arr[mid2]){
                return mid2;

            }
            else if(search_key<arr[mid1]){
                h=mid1-1;
            }
            else if (search_key>arr[mid2]){
                l=mid2+1;
            }
            else{
                l=mid1+1;
                h=mid2-1;
            }
        }
        return -1;
    }
    static int binary_search(int arr[],int search_key){

        int l=0;
        int h= arr.length-1;
        int mid;
        while(l<=h){
            mid=l+(h-l)/2;
            if (arr[mid]==search_key){
                return mid;}
            else if (arr[mid]<search_key){
                l=mid+1;}
            else{
                h=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int search_key=sc.nextInt();
        int arr[]=new int[6];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int result=Main.ternary_search(arr,search_key);
        System.out.println(result);
    }
}