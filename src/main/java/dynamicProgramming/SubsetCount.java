package dynamicProgramming;

public class SubsetCount {
    //recursion
    static int solve(int[] arr, int i, int sum){
        if(i==arr.length){
            if(sum==0)return 1;
            return 0;
        }
        int count1 = solve(arr, i+1, sum-arr[i]);
        int count2 = solve(arr, i+1, sum);
        return count1+count2;
    }

    //top-down
    static int topdown(int[] arr, int n, int sum){
        int[][] dp = new int[n+1][sum+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<sum+1; j++){
                if(i==0) dp[i][j]=0;
                else if (j==0) dp[i][j]=1;
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]]+dp[i-1][j];
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] arr = {1, 1,1,1};
        int sum = 1;
        int cnt = solve(arr, 0, sum);
        System.out.println(cnt);
        int[] arr1={ 1, 2, 3, 3};
        int s= 6;

        int res = topdown(arr1, arr1.length, s);
        System.out.println(res);
    }
}
