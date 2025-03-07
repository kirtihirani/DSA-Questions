package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class MinimumSubsetSumDiff {

    static void solve(int[] arr, int n){
        int sum =0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        boolean [][] dp = new boolean[n+1][sum+1];
        for (int i = 0; i <= n; i++){
            dp[i][0] = true;
        }
        // Fill dp table( to check if subsetsum possible)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i-1] <= j) {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j - arr[i-1]];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }


        int min = Integer.MAX_VALUE;
        for (int j = 0; j <= sum / 2; j++) {
            if (dp[n][j]) {
                min = Math.min(min, sum - 2 * j);
            }
        }

        System.out.println(min);

    }


    public static void main(String[] args) {
        int[] arr = {1,6,11,5};
        //System.out.println(res);
        solve(arr, arr.length);
        //System.out.println(res);
    }
}
