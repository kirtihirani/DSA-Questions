package Arrays;

import java.sql.Array;
import java.util.ArrayList;

public class LeadersInArray {

    public static void findLeaders(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[arr.length-1]);
        for(int i=arr.length-2; i>=0; i--){
            int j= i+1;
            boolean flag = false;
            while(j<arr.length){
                if(arr[j]>arr[i]) flag = true;
                j++;
            }
            if(!flag){
                res.add(arr[i]);
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        int[] arr = {10, 22, 12, 3, 0, 6};
        findLeaders(arr);
    }
}
