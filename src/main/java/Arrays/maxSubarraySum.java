package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class maxSubarraySum {

    public static int findMaxSum(int[] arr, int n){
        int meh = arr[0];
        int res = arr[0];
        for(int i=0; i<n; i++){
            meh = Math.max(meh+arr[i], arr[i]);
            res = Math.max(meh,res);
        }
        return res;
    }

    public static ArrayList<Integer> printMaxSubArray(int[] arr, int n){
        int meh = arr[0], res=arr[0], currSum=0, currStart=0, currEnd=0, resStart=0;
        for(int i=0; i<n; i++){
            if(meh+arr[i]<arr[i]){
                meh=arr[i];
                currStart = i;
            }
            else{
                meh = meh+arr[i];
            }
            if(res < meh){
                res = meh;
                currEnd = i;
                resStart = currStart;
            }

        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=resStart; i<=currEnd; i++){
            list.add(arr[i]);
        }
        return list;
    }

    public static void main(String args[]){
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int n= arr.length;
        int res = findMaxSum(arr, n);
        ArrayList<Integer> l = printMaxSubArray(arr,n);
        System.out.println(res);
        System.out.println(l);

    }
}
