package BinarySearch;

public class LowerBound {
    public static int bs(int arr[], int low, int high, int k){
        int idx=arr.length+1;
        int minIdx = Integer.MAX_VALUE;
        if (k>arr[high]) return arr.length;

        if(arr[low]>=k) return low;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=k){
                idx=mid;
                high=mid-1;
            };
            if (arr[mid]<k)low=mid+1;
            minIdx = Math.min(minIdx, idx);
        }
       return minIdx;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,8,15,19};
        int res = bs(arr,0,arr.length-1,9);
        System.out.println(res);
    }
}
