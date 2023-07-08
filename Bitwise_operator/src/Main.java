class bitwise{
    static int x=90;
    static void even_odd(int n){
        // using and operator
        if ((n & 1)==0){
            System.out.println("number is even");

        }
        else{
            System.out.println("number is odd");
        }
    }
    static void even_odd_2(int n){
        // using or operator
        if ((n | 1)==n){
            System.out.println("number is odd");

        }
        else{
            System.out.println("number is even");
        }
    }
    static void power_two(int n){
        if ((n &(n-1))==0){
            System.out.println("power of two");

        }
        else{
            System.out.println("not a power of two");
        }
    }
    static void increment(int n){
        n=-(~n);
        System.out.println(n);
    }
    // set/ unset/toggle the kth bit
    static void set(int n, int k){
        int x=1;
        x=x<<(k-1);
        n=n|x;
        System.out.println(n);
    }
    static void unset(int n, int k){
        int x=1;
        x=x<<(k-1);
        n=n&(~x);
        System.out.println(n);
    }
    static void toggle(int n, int k){
        int x=1;
        x=x<<(k-1);
        n=n^(x);
        System.out.println(n);
    }
    static void set_count(int n){
        int count=0;
        int x=1;
        while(n>0){
            if ((n& 1)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
    static void unset_count(int n){
        int count=0;
        int x=1;
        while(x<=(n+1)){
            if ((n& x)==0){
                count++;
            }
            x=x<<1;
        }
        System.out.println(count);
    }
}
class Main {
    public static void main(String[] args) {
  bitwise.unset_count(2);

        
    }
}
/*
Q1. wap to check if a given number is even or odd
Q2. wap to check if a given number is power of two
Q3. wap to incerment given value of an integer by 1 (without using airthmetic operator)
Q3. wap to check if a given kth bit of a number is set or unset
Q5. wap to toggel the given kth bit
Q6. wap to set the given kth bit
Q7. wap to count the total number of set bit in a number
Q8 wap to count the total number of unsedt bits in an number
absolute count
 */