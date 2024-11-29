package Arrays;

import java.util.Arrays;

public class Quicksort {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high){
        int pivot = high;
        int i = low-1;
        for(int j=low; j<=high; j++){
            if(arr[j]<= pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, pivot);
        return i+1;
    }
    static void quicksort(int[] arr, int low, int high){
        if(low< high){
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    public static void main(String args[]){
        int[] arr = {2,1,5,3,6,4,10,9};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
