package Recursion;

public class Question2 {

    static void print1ton(int n){
        if (n==0) return;
        print1ton(n-1);
        System.out.println(n);
    }

    static void printNto1(int n){
        if(n==0)return;
        System.out.println(n);
        printNto1(n-1);
    }

    static int sumOfNnumbers(int n, int sum){
        if(n==0)return sum;
        return sumOfNnumbers(n-1,sum+n);
    }

    static int fact(int n){
        if( n==0 || n==1) return 1;
        return n*fact(n-1);
    }


    public static void main(String[] args) {
        print1ton(5);
        printNto1(5);
        int s = sumOfNnumbers(3,0);
        System.out.println(s);
        int fct = fact(5);
        System.out.println(fct);
    }

}
