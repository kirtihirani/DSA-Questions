package Strings;

public class LengthOfLongestRepetingSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int count =0;
        int maxcount = 0;
        String window ="";
        if(s=="")return maxcount;
        for(int i=0; i<s.length(); i++){
            if(!window.contains(String.valueOf(s.charAt(i)))){
                window=window+s.charAt(i);
            }
            else{
                int ind = window.indexOf(s.charAt(i));
                window = window.substring(ind+1);
                if(!window.contains(String.valueOf(s.charAt(i)))){
                    window=window+s.charAt(i);
                }
            }
            count = window.length();
            maxcount = Math.max(count,maxcount);
        }
        return maxcount;
    }
    public static void main(String[] args) {
        String s = "abcdbc";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
