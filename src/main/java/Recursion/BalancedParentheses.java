package Recursion;

import java.util.ArrayList;

public class BalancedParentheses {
//    Given a number n, the task is to generate all possible n pairs of balanced parentheses.
//
//            Examples:
//
//    Input: n=1
//    Output: {}
//    Explanation: This is the only sequence of balanced parenthesis formed using 1 pair of balanced parenthesis.
//
//
//    Input : n=2
//    Output: {}{}
//    {{}}
//    Explanation: Theses are the only two sequences of balanced parenthesis formed using 2 pair of balanced parenthesis.

    static void balancedParenthses(int n, char[] ch, int nopen, int nclose, int i){
        if (nopen==n && nclose==n){
            System.out.println(String.valueOf(ch));
            return;
        }
        if (nopen<n){
            ch[i]='(';
            balancedParenthses(n, ch, nopen+1, nclose, i+1);
        }
        if (nopen>nclose){
            ch[i]=')';
            balancedParenthses(n, ch, nopen, nclose+1 ,i+1);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        char[] ch = new char[n*2];
        ch[0]='(';
        balancedParenthses(n, ch, 1, 0, 1);

    }
}
