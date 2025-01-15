package Arrays;

import java.util.Arrays;

public class KadanesAlgorithm {

    public static int[] printMaxSumSubarray(int[] arr){
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        int start =-1;
        int ansStart = -1, ansEnd=-1;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==0){
                start = i;
            }
            if(sum>maxSum) {
                maxSum = Math.max(sum, maxSum);
                ansStart = start;
                ansEnd = i;
            }
        }
        int[] res = new int[2];
        res[0] = ansStart;
        res[1] = ansEnd;
        return res;
    }
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxsum=0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                maxsum = Math.max(sum,maxsum);

            }
        }
        System.out.println(maxsum);
        int[] res = printMaxSumSubarray(arr);
        System.out.println(Arrays.toString(res));
    }
}
