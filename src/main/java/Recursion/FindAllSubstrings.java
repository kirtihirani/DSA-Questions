package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class FindAllSubstrings {
    static void allSubStrings(String s, StringBuilder temp, int i, ArrayList<String> subs){
        if(i>s.length()-1){
            return;
        }
        temp.append(s.charAt(i));
        subs.add(temp.toString());
        allSubStrings(s, temp, i+1, subs);
        temp.deleteCharAt(temp.length()-1);
        if(temp.length()==0){
            allSubStrings(s, temp, i+1, subs);
        }

    }

    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> res = new ArrayList<>();
        allSubStrings(s, new StringBuilder(""), 0,res );
        Collections.sort(res);
        System.out.println(res);
    }
}
