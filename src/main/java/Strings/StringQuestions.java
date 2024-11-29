package Strings;

import java.util.*;

public class StringQuestions {
    public static String reverseString(String s){
        String[] arr = s.split(" ");
        Collections.reverse(Arrays.asList(arr));
        return String.join(" ",arr);
    }

    //longest common prefix from given array of strings

    public static String longestCommonPrefix(String[] arr){
        if(arr.length==0) return " ";
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        int minlen = Math.min(first.length(),last.length());
        int i=0;
        String res="";
        while (i<minlen && first.charAt(i)==last.charAt(i)){
            res+= first.charAt(i);
            i++;
        }
        if(i==0) return "";
        return first.substring(0,i);
    }

    //Converting roman numerals to integers
    public static int convert(String s){
        HashMap<Character, Integer> dict = new HashMap<>();
        dict.put('I',1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
        int sum =0;
        for(int i=0; i<s.length(); i++){
            if(i+1<s.length() && dict.get(s.charAt(i))<dict.get(s.charAt(i+1))){
                sum+= dict.get(s.charAt(i+1)) - dict.get(s.charAt(i));
                i++;
            }
            else{
                sum+=dict.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static boolean checkNum(String number){
        String[] ch = number.split("");
        Set<String> s = new HashSet<>();
        for(int i=0; i<number.length(); i++){
            s.add(ch[i]);
        }
        if(ch.length != s.size()) return false;
        return true;
    }
    public static String calculate(String number){
        String result =  number;
        int start = 0;
        int end = 0;
        int i=0;
        int n = number.length();
        int sum =0 ;
        while(!checkNum(number)) {
            System.out.println("check number: "+checkNum(number));
            while (i < number.length()) {
                int j = i;
                int count = 1;
                while (j + 1 < n && number.charAt(j) == number.charAt(j + 1)) {
                    count++;
                    j++;
                }
                if (count > 1) {
                    sum = number.charAt(i) * count;
                    result = result.replace(result.substring(i, j), String.valueOf(sum));
                    i += j;
                } else {
                    i += j;
                }

            }
        }
        System.out.println("check number "+result);
        return result;
    }

    public static String addConsecutiveDigits(String number) {
        char[] arr = number.toCharArray();
        StringBuilder result = new StringBuilder();
        boolean foundConsecutive = false; // boolean flag for checking if the number contained consecutive equal digits
        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i] - '0'; //Subtracting ascii values to get integer values
            int newNumber = digit;
            if (i+1 != arr.length) {
                int nextDigit = arr[i + 1] - '0';

                if (digit == nextDigit) { // check if the digits are consecutive digits
                    newNumber = digit + nextDigit;
                    i++; // increment i as we have already added the i+1 digit
                    foundConsecutive = true;
                }
            }
            result.append(newNumber);
        }
        if (!foundConsecutive) // if no consecutive equal digits were found then return the result;
            return result.toString();
        else // recurse to check for more consecutive equal digits
            return addConsecutiveDigits(result.toString());
    }


    public static void main(String[] args){
        String s = "I love my family";
        String res = reverseString(s);
        System.out.println(res);
        String[] strs = { "geeksforgeeks", "geeks", "geek",
                "geezer" };
        Collections.sort(Arrays.asList(strs));
        System.out.println(Arrays.toString(strs));
        String ress = longestCommonPrefix(strs);
        System.out.println(ress);

        String num = "X";
        int resnum = convert(num);
        System.out.println(resnum);

        String number = "999433";
        String newnum = addConsecutiveDigits(number);
        System.out.println(newnum);

    }
}
