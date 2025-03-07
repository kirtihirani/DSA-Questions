package Arrays;

import java.util.HashMap;

public class LongestSubarrauSum {

    public static int longestSubarray(int[] arr, int k){
        int left =0;
        int right =0;
        int sum =0;
        int maxlen =0;
        while(right<arr.length){
            sum+=arr[right];
            while(sum>k && left<right){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen, right-left+1);
            }
            right++;
        }
        return maxlen;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,1,1,9};
        int k = 10;
        int res = longestSubarray(arr, k);
        System.out.println(res);
    }
}
