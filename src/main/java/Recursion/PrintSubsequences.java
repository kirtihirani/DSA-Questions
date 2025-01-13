package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequences {

    static void printSubsequences(int i, int[] arr, List<Integer> res){
        if(i==arr.length){
//            System.out.println(res);
            return;
        }
        res.add(arr[i]);
        printSubsequences(i+1, arr, res);
        System.out.println(res);
        res.remove(res.size()-1);
        printSubsequences(i+1, arr, res);
        System.out.println(res);

    }

    static int printSumOfSubsequences(int i, int[] arr, int sum, List<Integer> res, int k){
        if(i>=arr.length){

            if(sum==k) return 1;
            return 0;
        }
        res.add(arr[i]);
        //System.out.println(res);
        sum+=arr[i];
        int l= printSumOfSubsequences(i+1, arr, sum, res, k);
        res.remove(res.size()-1);
        sum=sum-arr[i];
        int r = printSumOfSubsequences(i+1, arr, sum, res, k);
        return l+r;
    }
    public static void main(String[] args){
        int arr[] = {3,1,2};
        List<Integer> result = new ArrayList<>();
        //printSubsequences(0, arr, result);
        int ans = printSumOfSubsequences(0, arr, 0, result, 3);
        System.out.println(ans);
    }
}
