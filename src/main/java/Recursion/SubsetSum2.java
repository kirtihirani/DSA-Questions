package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSum2 {
//    Given an integer array nums that may contain duplicates, return all possible
//    subsets
//    The solution set must not contain duplicate subsets. Return the solution in any order.
//
//    Example 1:
//    Input: nums = [1,2,2]
//    Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

    static void subsetSum2(int arr[],int ind, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i =ind; i<arr.length; i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            subsetSum2(arr, i+1, ans, ds);
            ds.remove(ds.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        subsetSum2(arr, 0, ans, new ArrayList<>());
        System.out.println(ans);
    }
}
