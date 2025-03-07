package Recursion;

//Problem Statement: Given an array print all the sum of the subset generated from it, in the increasing order.
//
//        Examples:
//
//        Example 1:
//
//        Input: N = 3, arr[] = {5,2,1}
//
//        Output: 0,1,2,3,5,6,7,8
//
//        Explanation: We have to find all the subset’s sum and print them.in this case the
//        generated subsets are [ [], [1], [2], [2,1], [5], [5,1], [5,2]. [5,2,1],
//        so the sums we get will be  0,1,2,3,5,6,7,8


import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum1 {
    static void subsetSum(int[] arr,int sum, int i, ArrayList<Integer> res){
        if(i>=arr.length){
            res.add(sum);
            return;
        }
        sum+=arr[i];
        subsetSum(arr, sum, i+1, res);
        sum-=arr[i];
        subsetSum(arr,sum,i+1,res);
    }

    public static void main(String[] args) {
        int arr[] = {5,2,1};
        ArrayList<Integer> res = new ArrayList<>();
        subsetSum(arr, 0, 0 , res);
        Collections.sort(res);
        System.out.println(res);

    }

}
