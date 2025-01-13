package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SlidingWindow {

    static int maxSubarraySum(int arr[], int n, int k){
        int maxSum=0;
        if(n<k)return -1;
        for(int i=0; i<k; i++){
            maxSum+=arr[i];
        }
        int windowSum = maxSum;
        for(int i=k; i<n; i++){

            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);

        }
        return  maxSum;
    }

    ArrayList<Integer> findDuplicates(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
                if(map.get(arr[i]) > 1) l.add(arr[i]);
            }
            map.put(arr[i], 1);
        }
        if(l.isEmpty()) l.add(-1);
        return l;
    }

    void findDuplicates2(int[] arr){  //with o(1) extra space
        for(int i=0; i<arr.length; i++){
            int idx = arr[i]%arr.length;
            System.out.println("idx="+idx);
            arr[idx] += arr.length;
            System.out.println("arr[idx]="+arr[idx]);
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            if(arr[i]/arr.length >=2) System.out.println(arr[i]);
        }
    }

    static void reverseArray(){
        int[] arr = {1,2,3,4,5};
        Collections.reverse(Arrays.asList(arr));
        System.out.println("reversed array"+Arrays.asList(arr));
    }

    public static void main(String[] args){
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int n = arr.length;
        int res = maxSubarraySum(arr, n,4);
//        System.out.println(res);
//        SlidingWindow sw = new SlidingWindow();
//        ArrayList<Integer> rl = sw.findDuplicates(arr);
//        System.out.println(rl);
        SlidingWindow sw = new SlidingWindow();
        sw.findDuplicates2(arr);
        reverseArray();

    }
}
