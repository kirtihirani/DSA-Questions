package dynamicProgramming;

import java.util.Arrays;

public class Knapsack01 {
    //Recursive Approach
    static int recursive(int[] wt, int[] val, int W, int n){
        if(n==0 || W==0){
            return 0;
        }
        if(wt[n-1]<=W){
            return Math.max(val[n-1]+recursive(wt, val, W-wt[n-1], n-1), recursive(wt, val, W, n-1)) ;
        }
        else {
            return recursive(wt, val, W, n-1);
        }
    }

    //Memoization approach
    static int memoization(int[] val, int[] wt, int W, int n,int[][] dp){
        if (n==0 || W==0){
            return 0;
        }
        if(dp[n-1][W]!=-1){
            return dp[n-1][W];
        }
        if(wt[n-1]<=W){
            dp[n-1][W] = Math.max(val[n-1]+memoization(val,wt,W-wt[n-1],n-1,dp), memoization(val,wt,W,n-1,dp));
        }
        else {
            dp[n-1][W]=memoization(val,wt,W,n-1,dp);
        }
        return dp[n-1][W];
    }

    //the real dp top-down approach
    static int topDown(int[] val, int[] wt, int W, int n, int[][]dp){
        for(int i=0; i<n; i++){
            for(int j=0; j<W; j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                if(wt[i-1]<=j){
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];

    }

    public static void main(String[] args) {
        int wt[] = {4,5,1};
        int val[] = {1,2,3};
        int W = 4;
        int n = 3;
        int [][] dp = new int[n+1][W+1];
        for(int[] r : dp){
            Arrays.fill(r, -1);
        }
        int res = recursive(wt, val, W, n);
        System.out.println(res);
        int res1 = memoization(val,wt,W,n,dp);
        System.out.println(res1);
        int[][] dp2 = new int[n+1][W+1];
        int res2 = topDown(val, wt, W,n,dp2);
        System.out.println(res2);
    }
}
