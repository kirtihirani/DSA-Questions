package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSum2 {

    static void comSum2(int[] arr, List<Integer> ds, int i, List<List<Integer>> ans, int target){

    }
    public static void main(String[] args){
        int[] arr = {2,5,2,1,2};
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        comSum2(arr, new ArrayList<>(), 0, ans, 5);
        System.out.println(ans);

    }
}
