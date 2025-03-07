package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramStrings {

    public static boolean checkAnagrams(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        char temp1[] = s1.toCharArray();
        char temp2[] = s2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        return Arrays.equals(temp1, temp2);
    }
    public static void main(String[] args){
        String s1 = "cat";
        String s2 = "act";
        boolean res = checkAnagrams(s1, s2);
        System.out.println(res);
    }
}
