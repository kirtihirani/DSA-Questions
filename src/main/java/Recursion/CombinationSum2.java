package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CombinationSum2 {
//    Problem Statement: Given a collection of candidate numbers (candidates) and a target number (target),
//    find all unique combinations in candidates where the
//    candidate numbers sum to target. Each number in candidates may only be used once in the combination.
//    Input: candidates = [10,1,2,7,6,1,5], target = 8
//
//    Output:
//            [
//            [1,1,6],
//            [1,2,5],
//            [1,7],
//            [2,6]]
//
//
//    Explanation: These are the unique combinations whose sum is equal to target.

    static void comboSum2(int[] arr, int i, int target, ArrayList<Integer> ds, HashSet<ArrayList<Integer>> ans){
        if (i>=arr.length){
            if (target==0){
                ans.add(new ArrayList<>(ds));
//                System.out.println(ds);
                System.out.println(ans);
            }
            return;
        }
        if (arr[i]<=target){
            ds.add(arr[i]);
            comboSum2(arr, i+1, target-arr[i],ds, ans);
            ds.remove(ds.size()-1);
        }
        comboSum2(arr, i+1, target,ds,ans);


    }
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        HashSet<ArrayList<Integer>> ans = new HashSet<>();
        Arrays.sort(arr);
        comboSum2(arr, 0 ,target, new ArrayList<Integer>(), ans);
        System.out.println(ans);
    }
}
