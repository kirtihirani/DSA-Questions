package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LetterCombosOfPhnNumber {
    //        Examples:
//        Input: Digit = “23”
//        Output: [“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”].
//        Explanation:   The list shows the different possible combinations of the strings possible.
//
//“ad” – Press digit 2 once, digit 3 once.
//“ae”-   Press digit 2 once, digit 3 twice
//“af” –  Press digit 2 twice, digit 3 once, and so on.

    static void findCombos(int i, Map<Character,String> letters, String digits, ArrayList<String> result, StringBuilder temp){
        if(temp.length() == digits.length()){
            result.add(temp.toString());
            return;
        }
        for(int c=0; c<letters.get(digits.charAt(i)).length(); c++){
            temp.append(letters.get(digits.charAt(i)).charAt(c));
            findCombos(i+1, letters, digits, result, temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public static void main(String[] args) {

        Map<Character, String >letters = Map.of(
                '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
                '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
        String digits = "23";

        ArrayList<String> result = new ArrayList<>();
        findCombos(0, letters, digits, result, new StringBuilder());
        System.out.println(result);

    }
}
