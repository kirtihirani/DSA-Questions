package Recursion;

import java.util.ArrayList;

public class PrintAllSubsequences {

    static void printAllSubsequences(int[] arr, int i, ArrayList<Integer> ds){
        if (i>=arr.length){
            System.out.println(ds);
            return;
        }
        ds.add(arr[i]);
        printAllSubsequences(arr, i+1, ds);
        ds.remove(ds.size()-1);
        printAllSubsequences(arr, i+1, ds);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        printAllSubsequences(arr, 0, new ArrayList<>());
    }
}
