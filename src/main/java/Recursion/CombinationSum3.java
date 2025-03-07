package Recursion;

import java.util.ArrayList;

public class CombinationSum3 {
//    Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
//
//    Only numbers 1 through 9 are used.
//    Each number is used at most once.
//    Return a list of all possible valid combinations.
//    The list must not contain the same combination twice, and the combinations may be returned in any order.
//            Example 1:
//
//    Input: k = 3, n = 7
//    Output: [[1,2,4]]
//    Explanation:
//            1 + 2 + 4 = 7
//    There are no other valid combinations.

    static void combosum(int i, int k, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans, int target){
        if(i>9){
            if(target==0 && ds.size()==k ){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(i<=target){
            ds.add(i);
            combosum(i+1, k, ds, ans, target-i);
            ds.remove(ds.size()-1);
        }
        combosum(i+1, k, ds,ans, target);

    }

    public static void main(String[] args) {
        int target = 9;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        combosum(1, 3, new ArrayList<>(), ans, target);
        System.out.println(ans);
    }
}
