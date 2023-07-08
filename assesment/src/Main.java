import java.util.Scanner;

public   class Main{
    int missing;
    int repeating;
    static int bruteforce(int arr[]){
        int count=0;
        int repeat=0;
        for(int m=1;m<=arr.length;m++){
            count=0;
            for(int i=0;i<arr.length;i++){
                if (m==arr[i]){
                    count++;
                }
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j] && repeat==0){
                        System.out.println("repeating  "+arr[i]);
                        repeat++;

                    }
                }

                }
            if (count==0){
                System.out.println("missing "+m);

            }

        }
        return 0;

    }
    static   int hasing(int arr[]){
        int arr_count[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            arr_count[arr[i]]++;
        }
        for(int i=1;i<arr_count.length;i++){
            if (arr_count[i]==2){
                System.out.println("repeating "+i);
            }
            if (arr_count[i]==0){
                System.out.println("missing"+i);
            }
        }
        return 0;

    }
    static int optimal(int arr[]){
        return 0;

    }
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Main.hasing(arr);

    }
 }