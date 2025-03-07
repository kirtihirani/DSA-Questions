package Recursion;

import java.util.ArrayList;

public class CombinationSum1 {
//    Input: array = [2,3,6,7], target = 7
//
//    Output: [[2,2,3],[7]]
//
//    Explanation: 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
//             7 is a candidate, and 7 = 7.
//    These are the only two combinations.

    static void comboSum(int i,int sum,int target, int[] arr, ArrayList<Integer> res, ArrayList<ArrayList<Integer>> ans){
        if (i>=arr.length){
            if(target==0){
                ans.add(new ArrayList<>(res));
                System.out.println(res);
            }
            return;
        }
        if(arr[i]<=target){
            res.add(arr[i]);
            comboSum(i, sum, target-arr[i], arr, res, ans);
            res.remove(res.size()-1);
        }
        comboSum(i+1, sum, target, arr, res, ans);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        comboSum(0, 0, target, arr, new ArrayList<>(), ans);
        //System.out.println(ans);

    }
}
