package BasicMaths;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExtractDigits {
    static List<Integer> extractDigits(int n){
        List<Integer> digits = new ArrayList<>();
        while(n>0){
            int d = n%10;
            digits.add(d);
            n = n/10;
        }
        return digits;
    }

    static void countDigits(int n){
        int cnt =0;
        while(n>0){
            cnt++;
            n=n/10;
        }
        System.out.println(cnt);
    }

    public static int reverse(int n) {
        int rev =0;
        boolean negFlag = false;
        if(n<0){
            System.out.println("line 33"+n);
            n = n*(-1);
            System.out.println(n);
            negFlag=true;
        }
        while(n>0){
            int d = n%10;
            rev = (rev *10)+ d;
            n=n/10;
        }
        if(negFlag == true){

            return rev*-1;
        }

        return rev;
    }

    static boolean checkPalindrome(int x){
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        StringBuilder res = sb.reverse();
        String res1 = res.toString();
        System.out.println(res);
        return res1.equals(s);
    }

    static boolean checkArmstrongNo(int n){
        int sum =0;
        int temp = n;
        while(n>0){
            int d = n%10;
            sum = sum+ (d*d*d);
            n=n/10;
        }
        return temp == sum;
    }

    static void printDivisors(int n){
        List<Integer> divisors = new ArrayList<>();
        for(int i=1; i< Math.sqrt(n); i++){

            if(n%i == 0){
                divisors.add(i);
                if(n/i != i) divisors.add(n/i);
            }

        }
        Collections.sort(divisors);
        System.out.println(divisors);
    }

    static int gcd(int a, int b){
        if(a==0 || b==0){
            if(a == 0) return b;
            else return a;
        }
        if(a>b){
            return gcd(a%b, b);
        }
        else{
            return gcd(b%a, a);
        }

    }
    public static void main(String[] args){
        int n = 36;
        System.out.println(checkPalindrome(n));
        System.out.println(reverse(n));
        System.out.println(checkArmstrongNo(n));
        printDivisors(36);
        int a =10;
        int b=52;
        int res = gcd(a,b);
        System.out.println("gcd "+res);

    }

}
