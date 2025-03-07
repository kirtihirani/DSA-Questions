package Arrays.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

public class CharacterReplacement {

    public static int maxfreq(String s, int k){
        HashMap<Character, Integer> freq = new HashMap<>();
        int mxFreq = 0, res=0;
        int i=0;
        for(int j=0; j<s.length(); i++){
            freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0)+1);
            mxFreq = Math.max(mxFreq, freq.get(s.charAt(j)));
            if(j-i+1-mxFreq > k){
                freq.put(s.charAt(i), freq.get(s.charAt(i))-1);
                i++;
            }
            res=Math.max(j-i+1,res);
        }
        return res;

    }

    public static int characterReplacement(String s, int k){
        int i=0, mc=0, tempK=0;
        char temp;
        temp = s.charAt(i);
        ArrayList<Character> chars = new ArrayList<>();

        for(int j=0; j<s.length(); j++){
            if (s.charAt(j)!=temp){
                if(tempK<k){
                    tempK++;
                }
                else if (tempK>=k){
                    while(s.charAt(i)==temp){
                        chars.remove(i);
                        i++;
                    }

                    temp= s.charAt(i);

                    tempK=0;
                }
            }
            chars.add(s.charAt(j));
            System.out.println(chars);
            mc = Math.max(mc,j-i+1);
        }
        return mc;
    }
    public static void main(String[] args) {
        String s= "AABABBA";
        int res = maxfreq(s, 1 );
        System.out.println(res);
    }
}
