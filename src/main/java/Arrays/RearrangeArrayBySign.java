package Arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    public static void optimallyRearrangeArray(int[] arr){
        List<Integer> arr1 = new ArrayList(Arrays.asList(1,2,-4,-5));
        int posind =0;
        int negind= 1;
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(arr.length, 0));
        for(int i=0; i<arr.length; i++){
            if(arr1.get(i)>0){
                res.set(posind, arr1.get(i));
                posind+=2;
            }
            else {
                res.set(negind, arr1.get(i));
                negind+=2;
            }
        }
        System.out.println(res);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,-3,-5};
        int[] res = rearrangeArray(arr);
        //.out.println(Arrays.toString(res));
        optimallyRearrangeArray(arr);
    }
}
