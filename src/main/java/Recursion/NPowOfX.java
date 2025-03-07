package Recursion;

public class NPowOfX {
    static double recursivePow(double x, int n, double ans){
        if (n<=0){
            //System.out.println(ans);
            return ans;
        }
        if (n%2==0){
           return recursivePow(x*x, n/2, ans);
        }
        else {
           return recursivePow(x,n-1,ans*x);
        }

    }
    static double pow(double x, int n){
        double ans = 1.0;
        long nn = n;
        if(nn<0) nn=-1*nn;
        while(nn>0){
            if(nn%2==0){
                x=x*x;
                nn=nn/2;
            }
            else {
                ans = ans*x;
                nn = nn-1;
            }
        }
        if (n<0){
            ans = 1.0/ans;
        }
        return ans;
    }
    public static void main(String[] args) {
//        double ans = pow(2,10);
//        System.out.println(ans);
        double ans = recursivePow(2,10,1.0);
        System.out.println(ans);
    }
}
