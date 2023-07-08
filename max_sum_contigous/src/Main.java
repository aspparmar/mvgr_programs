import java.util.*;
class kadane{
    static int kadane_algo(int arr[]){
        int currentsum=0;
        int end=0;
        int start=0;
        int s=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            currentsum=currentsum+arr[i];
            if( currentsum>max_sum){
                max_sum=currentsum;
                start=s;
                end=i;
            }
            if (currentsum<0){
                currentsum=0;
                s=i+1;
            }
        }
        for(int m =start;m<=end;m++){
            System.out.print(arr[m]+" ");
        }

        return max_sum;
    }
}
public class Main {
    static int  max_summ(int i, int j, int arr[]){
        int max_sum=0;
        while (i<=j){

            max_sum=max_sum+arr[i];
            i++;
        }



        return max_sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int max=1;
        int start=0;
        int end=0;
        int maxx=Integer.MIN_VALUE;
        int arr[]=new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(kadane.kadane_algo(arr));
        /*
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int result=Main.max_summ(i,j,arr);
                if (result>maxx){
                    start=i;
                    end=j;
                    maxx=result;
                    }

                }
            }
        for (int m=start;m<=end;m++) {
            System.out.print(arr[m] + " ");
        }*/




        }
    }