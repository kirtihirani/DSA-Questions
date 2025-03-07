package Arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> trackSum = new HashMap();
        for(int i=0; i<nums.length; i++){
            trackSum.put(nums[i],i);
        }
        int num;
        int j=0;
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){

            if(nums[i]>target){
                num = nums[i]-target;
            }
            else{
                num = target-nums[i];
            }
            if(trackSum.containsKey(num)){
                res[j] = trackSum.get(num);
                j++;
            }
            if(j>=2) break;
        }
        return res;

    }

    public static void main(String[] args){

    }
}
