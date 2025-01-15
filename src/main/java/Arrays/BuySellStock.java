package Arrays;

public class BuySellStock {

    public static int calculateMaxProfit(int[] arr){
        int maxProfit = Integer.MIN_VALUE;
        int minBuy = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=minBuy){
                minBuy = Math.min(arr[i], minBuy);
                maxProfit = Math.max(maxProfit, arr[i] - minBuy );
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int arr[] = {7,1,5,3,6,4};
        int maxProfit = calculateMaxProfit(arr);
        System.out.println(maxProfit);
    }
}
