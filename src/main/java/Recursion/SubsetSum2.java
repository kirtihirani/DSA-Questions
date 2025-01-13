package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum2 {

    public static void ss2(int[] arr, List<List<Integer>> ans, List<Integer> ds, int idx){
        ans.add(new ArrayList<>(ds));
        for(int i=idx; i<arr.length; i++){

            if(i>idx && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            ss2(arr, ans, ds, i+1);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,2,2,3,3};
        List<List<Integer>> ans = new ArrayList<>();
        ss2(arr, ans, new ArrayList<>(), 0);
        System.out.println(ans);
    }
}
