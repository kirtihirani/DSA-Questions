package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSumProblem {
    static int solve(int[] arr, int sum, int i, int n, ArrayList<Integer> ds,int[][]dp){
        if (i == n){
            if (sum==0){
                System.out.println(ds);
                return dp[i][sum];
            }
            return -1;
        }

        if(dp[i][sum] != -1){
            return dp[i][sum];
        }

        if(arr[i]<=sum){
            ds.add(arr[i]);
            dp[i][sum] = solve(arr,sum-arr[i],i+1,n,ds,dp);
            ds.remove(ds.size()-1);
        }


        dp[i][sum]=solve(arr,sum,i+1,n,ds,dp);
        return dp[i][sum];

    }
    //top-down approach
    static boolean topDown(int n, int sum, int[] arr){
        boolean[][]dp = new boolean[n+1][sum+1];
        for(int nn=0 ;nn<n+1; nn++){
            for (int ss=0; ss<sum+1; ss++){
                if (nn==0) dp[nn][ss]=false;
                if (ss==0)dp[nn][ss]=true;
            }
        }
        for(int nn=1; nn<n+1; nn++){
            for(int ss=1; ss<sum+1; ss++){
                if (arr[nn-1]<=ss){
                    dp[nn][ss] = dp[nn-1][ss-arr[nn-1]]|| dp[nn-1][ss];
                }
                else {
                    dp[nn][ss] = dp[nn-1][ss];
                }
            }
        }
        return dp[n][sum];
    }



    public static void main(String[] args) {
        int[] arr = {3,5,7,8,10};

        int sum = 11;
        int[][]dp = new int[arr.length+5][2*sum+1];
        for(int[] r: dp){
            Arrays.fill(r,-1);
        }
        solve(arr, sum , 0, arr.length, new ArrayList<>(), dp);
        int res = 0;

        System.out.println(res);

        boolean res1 = topDown(arr.length, sum, arr);
        System.out.println(res1);
    }
}
