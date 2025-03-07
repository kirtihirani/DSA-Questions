package Arrays;

import java.util.ArrayList;

public class UnionOf2SortedArrays {
    public static ArrayList<Integer> sol(int[] a, int b[]){
        int n = a.length;
        int m = b.length;
        int i=0, j=0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i<n && j<m){
            if(a[i]<=a[j]){
                if(res.size()==0 || res.get(res.size()-1) != a[i])
                    res.add(a[i]);
                i++;
            }
            else{
                if(res.size()==0 || res.get(res.size()-1)!= b[j])
                    res.add(b[j]);
                j++;
            }
        }
        while(i<n){
            if(res.get(res.size()-1) != a[i])
                res.add(a[i]);
            i++;
        }
        while(j<m){
            if(res.get(res.size()-1) != b[j])
                res.add(b[j]);
            j++;
        }
        return res;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {2,3,4,4,5,9,10};
        ArrayList<Integer> res = sol(a,b);
        System.out.println(res);
    }
}
