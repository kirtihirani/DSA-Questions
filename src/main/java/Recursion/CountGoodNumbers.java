package Recursion;

public class CountGoodNumbers {
    static long mod = (long) 1e9 + 7;

    public static long pow(long x, long n){
        long ans = 1;
        while(n>0){
            if(n%2==0){
                x = x*x%mod;
                n=n/2;
            }
            else{
                ans = ans*x%mod;
                n=n-1;
            }
        }
        return ans;

    }

    public static int countGoodNumbers(long n) {
        long odd = n/2;
        long even = (n+1)/2 ;

        int cnt = (int)(pow(5,even)*pow(4,odd))%(int)mod;
        return cnt;

    }
    public static void main(String[] args) {
        int n=10;
        int res = countGoodNumbers(n);
        System.out.println(res);
    }
}
