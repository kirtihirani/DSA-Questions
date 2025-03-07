package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateBinaryStrings {
//    Given an integer, K. Generate all binary strings of size k without consecutive 1’s.
//
//            Examples:
//
//    Input : K = 3
//    Output : 000 , 001 , 010 , 100 , 101
//    Input : K  = 4
//    Output :0000 0001 0010 0100 0101 1000 1001 1010

    public static String toString(char[] a)
    {
        String string = String.valueOf(a);
        return string;
    }
    static void generateStrings(int k, char[] ch, int n){

        if (n==k){
            String s = String.copyValueOf(ch);
            System.out.println(toString(ch));
            return;
        }
        if (ch[n-1]=='0'){
            ch[n]='0';
            generateStrings(k,ch,n+1);
            ch[n]='1';
            generateStrings(k,ch,n+1);
        }
        if (ch[n-1]=='1'){
            ch[n]='0';
            generateStrings(k,ch,n+1);
        }

    }

    static void solve(int k, char [] ch){
        ch[0]='0';
        generateStrings(k, ch, 1);
        ch[0]='1';
        generateStrings(k, ch, 1);
    }
    public static void main(String[] args) {
        int k = 3;
        char ch[] = new char[k];
        solve(k, ch);
    }
}
