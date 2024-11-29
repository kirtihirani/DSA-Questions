package Arrays;

import java.util.Scanner;

public class Searching {

    public static int search(int arr[], int x, int n ){
        for(int i=0; i<n; i++){
            if(arr[i]==x)
                return i;
        }
        return 0;
    }

    static int binarySearch1(int x, int[] arr){
        int low = 0, high=arr.length-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if (arr[mid] == x) return mid;
            if (x<arr[mid]) {
                high = mid-1;
            }
            else low=mid+1;
        }
        return -1;
    }

    static int binarySearch(int x, int[] arr)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

                // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }
    public static void main(String args[]){
        System.out.println("Enter a number to search");
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,34,12,56,24,2};
//        int x = sc.nextInt();
//       System.out.println(search(arr,x,arr.length)+1);
        System.out.println(binarySearch1(12, arr));

    }

}
