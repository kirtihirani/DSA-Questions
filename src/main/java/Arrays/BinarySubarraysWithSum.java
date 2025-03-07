package Arrays;

public class BinarySubarraysWithSum {

    public static int atmost(int[] arr, int k){
        int sum=0, cnt=0, i=0, j=0;
        while (j<arr.length){
            sum+=arr[j];
            while (sum>k){
                sum-=arr[i];
                i++;
            }
            cnt+=j-i+1;
            j++;
        }
        return cnt;
    }

    public static int countSubarraysOptimized(int arr[], int goal){
        int res = atmost(arr, goal) - atmost(arr, goal-1);
        return res;
    }

    public static int countSubarrays(int arr[], int goal){
        int sum=0, count=0, i=0, j=0;
        while(j<arr.length){
            sum+=arr[j];
            if(sum==goal){
                count++;
//                sum-=arr[i];
//                i++;
            }
            else if(sum>goal){
                while(sum>=goal){
                    if(sum==goal)count++;
                    sum-=arr[i];
                    i++;
                }
            }
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        int res = countSubarraysOptimized(arr, 2);
        System.out.println(res);

    }
}
