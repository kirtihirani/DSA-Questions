package Recursion;


import java.util.ArrayList;

//Given an array arr of non-negative integers and an integer target,
//the task is to count all subsets of the array whose sum is equal to the given target.
public class CountSubsequences {

    static int cntSubsets(int[] arr, int target, int sum, int i, ArrayList<Integer> ds){
        if(i>=arr.length){
            if(sum==target){
                System.out.println(ds);
                return 1;
            }

            return 0;
        }
        sum+=arr[i];
        ds.add(arr[i]);
        int l = cntSubsets(arr, target, sum, i+1, ds);
        sum-=arr[i];
        ds.remove(ds.size()-1);
        int r = cntSubsets(arr, target, sum, i+1, ds);
        return l+r;
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 10, 6, 8};
        int target = 10;
        int sum=0;
        int cnt =cntSubsets(arr, target,  sum ,0, new ArrayList<>());
        System.out.println(cnt);
    }
}


