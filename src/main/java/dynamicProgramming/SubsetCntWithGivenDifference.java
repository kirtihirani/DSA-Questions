package dynamicProgramming;

public class SubsetCntWithGivenDifference {

    static int solv(int[] arr,int n, int s1,int sum, int i){
        if(i==n){
            if (s1==sum){
                return 1;
            }
            return 0;
        }
        int c1 = solv(arr, n, s1, sum+arr[i], i+1);
        int c2 = solv(arr, n, s1, sum, i+1);
        return c1+c2;

    }

    static int topDown(int[] arr, int n, int sum){
        int[][] dp = new int[n+1][sum+1];
        for(int j=0; j<=sum; j++){
            dp[0][j] = 0;
        }
        for(int i=0; i<=n; i++){
            dp[i][0] = 1;
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        int n = arr.length;
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int diff = 1;
        int s1 = (sum+diff)/2;
        int res = solv( arr,n, s1,0, 0);
        System.out.println(res);
        int res1 = topDown(arr, n ,s1);
        System.out.println(res1);
    }
}
