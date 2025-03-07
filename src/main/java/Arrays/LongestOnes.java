package Arrays;

public class LongestOnes {

    public static int count(int[] arr, int k){
        int count =0;
        int maxcount=0;
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for(int left =i; left< arr.length; left++){
                if(arr[left]==1){
                    count++;
                }
                else {
                    if(temp<k){
                        count++;
                        temp++;
                    }
                    else {
                        temp=0;
                        break;
                    }
                }
            }
            maxcount = Math.max(maxcount, count);
            count=0;
        }
        return maxcount;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int res = count(arr,k);
        System.out.println(res);
    }
}
