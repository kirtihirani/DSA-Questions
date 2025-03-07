package Arrays;

public class BinarySearch {

    int binarySearch(int arr[], int k){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==k)return mid;
            else if (k<arr[mid]) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        BinarySearch bs = new BinarySearch();
        int res = bs.binarySearch(arr,5);
        System.out.println(res);
    }
}
