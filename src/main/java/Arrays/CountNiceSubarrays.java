package Arrays;

import java.util.HashMap;

public class CountNiceSubarrays {



    public static int countNiceSubarrays(int[] arr, int k){
        int i=0, res=0;
        for(int j=0; j< arr.length; j++){
            if (j-i+1 >=k){
                int len = j-i+1;
                int m =i;
                int cntOdd=0;
                while(m<=j){
                    if(arr[m]%2!=0){
                        cntOdd++;
                    }
                    if (cntOdd==k)res++;
                    else if (cntOdd>k){
                        if(arr[m]%2!=0 && i<arr.length){
                            cntOdd--;
                            i++;
                        }
                        else {
                            i++;
                        }
                    }
                    m++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,6,9};
        int k=2;
        int res = countNiceSubarrays(arr, k);
        System.out.println(res);
        HashMap<Character, Integer> test = new HashMap<>();
        test.put('a',1);
        test.put('b', 2);
        test.put('c', 2);
        System.out.println(test.size());


    }
}
