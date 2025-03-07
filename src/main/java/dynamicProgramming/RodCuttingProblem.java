package dynamicProgramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class RodCuttingProblem {
//    Given a rod of length n inches and an array price[].
//    price[i] denotes the value of a piece of length i. The task is to
//    determine the maximum value obtainable by cutting up the rod and selling the pieces.
//
//    Note: price[] is 1-indexed array.
//
//    Input: price[] =  [1, 5, 8, 9, 10, 17, 17, 20]
//    Output: 22
//    Explanation:  The maximum obtainable value is 22 by cutting in two pieces of lengths 2 and 6, i.e., 5 + 17 = 22.

    static void solve(int len[], int[] price, int maxPrice, int i, int N, ArrayList<Integer> ds){
        if(i==price.length || N==0){
            ds.add(maxPrice);
            return;
        }
        if(len[i]<=N){
            solve(len, price, maxPrice+price[i], i, N-len[i], ds);
        }
        solve(len, price, maxPrice,i+1,N,ds);
    }

    static void topdown(int len[], int[] price, int maxPrice){
        return;
    }
    public static void main(String[] args) {
        int[] length = {1,2,3,4,56,7,8};
        int price[] =  {3};
        ArrayList<Integer> ans = new ArrayList<>();
        solve(length, price, 0, 0, price.length,ans);
        Collections.sort(ans);
        System.out.println(ans.get(ans.size()-1));
    }
}
