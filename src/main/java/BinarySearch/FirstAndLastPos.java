package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPos {
    public static int[] bs(int[] arr, int low, int high, int target){
        return new int[2];
    }

    public static int[] searchRange(int[] nums, int target) {
        return bs(nums, 0, nums.length-1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,5,8,8,8,9};
        System.out.println(Arrays.toString(searchRange(arr,4 )));
    }
}
