public  class Main {
    public int fac_loop(int n){
        int  fac=1;
        while (n>0){
            fac=fac*n;
            n--;
        }
        return fac;

    }
    public int  factorial_re(int n){

        if (n==1){
            return 1;
        }
        else{

            n=n*factorial_re(n-1);
        }
        return n;

    }
    public int catalan(int n){
        int x=0;

        if (n==0 || n==1){
            return 1;
        }
        else{
            for (int i=0;i<=n-1;i++){
                x=x+catalan(n-i-1)*catalan(i);

            }
            System.out.println(x);

            return x;

        }
    }

    public static void main(String[] args) {
        Main ob=new Main();
        int result=ob.fac_loop(5);
        System.out.println(result);
        int result_re=ob.factorial_re(7);
        System.out.println((result_re));
        int result_catalan=ob.catalan(5);
        System.out.println(result_catalan);
;
    }
}