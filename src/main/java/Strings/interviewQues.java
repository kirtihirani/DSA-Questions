package Strings;

import java.util.HashSet;
import java.util.Set;

public class interviewQues {

    public static boolean checkNum(String num){
        char[] ch = num.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(i+1<ch.length && ch[i]==ch[i+1]) return false;
        }
        return true;
    }

    public static String calculate(String num){
        while(!checkNum(num)){
            int i=0, n=num.length(),j=0;
            String res ="";
            while(i<n){
                int count =1;
                int sum =0;

                while(j+1<n && num.charAt(j)==num.charAt(j+1)){
                    count++;
                    j++;
                }
                if(count>1){
                    int digit = num.charAt(j) - '0';
                    sum = sum+ digit*count;
                    res+= sum;

                }
                else{
                    res+= num.charAt(i);
                }
                j++;
                i=j;
            }
            num = res;
        }
        return num;
    }
    public static void main(String args[]){
        String num = "199448";
        System.out.println(calculate(num));
    }
}
