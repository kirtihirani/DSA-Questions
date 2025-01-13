package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermutations {

    static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static void perm2(int[] arr, List<int[]> ans, int ind ){
        if(ind==arr.length){
            List<Integer> ds = new ArrayList<>();
            for(int j =0; j<arr.length; j++){
                ds.add(arr[j]);
            }
            System.out.println(ds);
            ans.add(arr);
            return;
        }
        for(int i=ind; i<arr.length; i++){
            swap(arr, i , ind);

            perm2(arr, ans, ind+1);

            swap(arr, i, ind);
        }
    }
    static void perm(int[] arr, List<Integer> ds, List<List<Integer>> ans, boolean[] freq){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(arr[i]);
                perm(arr, ds, ans, freq);
                freq[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }
    static public void main(String[] args){
        int[] arr = {1,2,3};
        List<List<Integer>> ans  = new ArrayList<>();
        boolean freq[] = new boolean[arr.length];
        perm(arr, new ArrayList<>(), ans, freq);
        System.out.println(ans);
        List<int[]> ans2 = new ArrayList<>();
        perm2(arr, ans2, 0);
//        for(int i=0; i< ans2.size(); i++){
//            System.out.println(Arrays.toString(ans2.get(i)));
//        }

    }
}
