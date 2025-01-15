package Arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayBySign {

    public static int[] rearrangeArray(int [] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0) neg.add(arr[i]);
            else  pos.add(arr[i]);
        }
        int res[] = new int[arr.length];
        int posLen = 0;
        int negLen = 0;
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                res[i] = pos.get(posLen);
                posLen++;
            }
            else {
                res[i] = neg.get(negLen);
                negLen++;
            }
        }
        return res;

    }


    public static void main(String[] args) {
        int[] arr = {1,2,-3,-5};
        int[] res = rearrangeArray(arr);
        System.out.println(Arrays.toString(res));
    }
}
