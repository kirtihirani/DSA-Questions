package Arrays;

import java.util.Arrays;

public class sorting {

    static void merge(int[] a, int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0; i<n1; ++i){
            L[i] = a[l + i];
        }
        for(int j=0; j<n2; ++j){
            R[j] = a[mid+j+1];
        }
        int i = 0;
        int j = 0;
        int k=l;
        while(i <n1 && j<n2){
            if(L[i]<= R[j]){
                a[k] = L[i];
                i++;
            }
            else a[k] = R[j]; j++;
            k++;
        }
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }
    static void sort(int[] a, int l, int r){
        if (l < r){
            int mid = l+(r-l)/2;
            sort(a, l, mid);
            sort(a, mid+1, r);
            merge(a, l, mid, r);

        }
    }

    static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    static int partition(int low, int high, int[] arr){
        int i = low-1;
        int pi= arr[high];
        for(int j=low; j<high; j++){
            if(arr[j]<pi){
                i++;
                swap(i,j, arr);
            }
        }
        swap(i+1,high, arr);
        return i+1;
    }

    static void quickSort(int low, int high, int n, int[] arr){
        if(low < high){
            int pi = partition(low, high, arr);
            quickSort(low,pi-1,n, arr);
            quickSort(pi+1,n-1,n, arr);
        }
    }
    public static void main(String args[]){
        int[] arr = {3,4,2,6,10,5,1};
        quickSort(0, arr.length-1, arr.length, arr );
        System.out.println(Arrays.toString(arr));

    }
}
