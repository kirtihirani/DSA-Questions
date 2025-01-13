package Arrays;

import java.util.Arrays;

public class SomeCodingProblems {

    static void subArrayWithGivenSum(int[] arr, int sum){
        if(arr.length ==0) return;
        if(arr.length==1 && arr[0] == sum){
            System.out.println(0);
            return;
        }
        int left=0 ,right=1;
        int tempsum =0;

        for(int i=0; i< arr.length; i++){
            tempsum+=arr[i];
            if(tempsum>=sum){
                while(tempsum<sum){}
            }
        }

    }

    static void swap(int i, int j, int[] arr){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void DutchNationalFlagAlgo(int[] a){
        int lo=0, mid=a.length-1, hi=0, temp=0;
        while (mid <= hi) {
            switch (a[mid]) {
                // If the element is 0
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                // If the element is 1
                case 1:
                    mid++;
                    break;
                // If the element is 2
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static void sort012(int a[], int n)
    {
        int lo = 0;
        int hi = n - 1;
        int mid = 0, temp = 0;
        // Iterate till all the elements
        // are sorted
        while (mid <= hi) {
            switch (a[mid]) {
                // If the element is 0
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                // If the element is 1
                case 1:
                    mid++;
                    break;
                // If the element is 2
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }

    /* Utility function to print array arr[] */
    static void printArray(int arr[], int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    /*Driver function to check for above functions*/
    public static void main(String[] args)
    {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        sort012(arr, n);
        printArray(arr, n);
    }

}
