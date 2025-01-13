package Recursion;

import java.util.*;

public class SubsetSum1 {

    static void ss1(int[] arr, int i, List<Integer> ans, int sum){
        if(i==arr.length){
            ans.add(sum);
            return;
        }

        ss1(arr, i+1, ans, sum+arr[i] );

        ss1(arr,i+1, ans, sum);
    }
    public static void main(String[] args){
        int[] arr = {3,1,2};
        List<Integer> ans = new ArrayList<>();

        ss1(arr, 0, ans, 0);
        Collections.sort(ans);
         //HashSet s = new HashSet(ans);
        System.out.println(ans);
    }
}
