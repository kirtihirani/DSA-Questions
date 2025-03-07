package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class UnboundedKnapSack {

    static int solve(int[] wt, int[] val, int n, int W, int maxVal, ArrayList<Integer> ls, int sum){
        if(n<0 || W==0){
            maxVal = Math.max(maxVal, sum);
            return maxVal;
        }
        if(wt[n]<=W){
            return  solve(wt, val, n, W-wt[n] , maxVal, ls, sum+val[n]);
        }
         return solve(wt, val, n-1, W, maxVal, ls, sum );
    }


    public static void main(String[] args) {
        int wt[] = {2,4,6};
        int val[]={5,11,13};
        ArrayList<Integer> ans = new ArrayList<>();
        int maxVal = Integer.MIN_VALUE;
        solve(wt, val, wt.length-1, 10, maxVal, ans, 0 );
        System.out.println(maxVal);
    }
}
