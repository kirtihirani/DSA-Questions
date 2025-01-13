import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;
import java.util.Scanner;

public class strings {

    static int search(int num, int start, int end, int[] ar){
        int mid = start + (end - start)/2;
        if (num == ar[mid]) return mid;
        else if (num < ar[mid]) {
            return search(num, start, mid-1, ar );
        }
        else{
            return search(num, mid+1,end,ar);
        }
    }

    //Find the number of each characters in a string
    public static HashMap<Character,Integer> findCharacters(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for( int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        return map;
    }
    public static void main(String args[]){
        String s = "kirtii";
        int n = s.length();
        int i = 0;
        String nstr ="";
        while(i<n){
            char c = s.charAt(i);
            nstr = c + nstr;
            i++;
        }
        System.out.println(nstr);

        HashMap<Character, Integer> map = new HashMap();
        for(int j =0; j< n; j++){
            Character ch = s.charAt(j);
            if (map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch,count +1);
            }
            else{map.put(s.charAt(j), 1);}

        }
        System.out.println(map);

        //liner search
//        System.out.println("enter a number to search");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int[] ar = {1,5,3,2,7,2};
//        for(int k=0; k<n; k++){
//            if (ar[k] == num ){
//                System.out.println(k +" "+ num);
//                break;
//            }
//        }


        String str = "abcabc";
        HashMap<Character,Integer> m = findCharacters(str);
        System.out.println("line 76"+m);


    }
}
