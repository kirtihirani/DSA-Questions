package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Questions {

    static void printName(int n){

        if(n==0) return;
        System.out.println("Kirti");
        n = n-1;
        printName(n);
    }

    static void print1ton(int n, int i){

        if(i>n) return;
        System.out.println(i);

        print1ton(n, i+1);
    }

    static void printnto1(int n){
        if(n==0)return;
        System.out.println(n);
        printnto1(n-1);
    }

    static void printNto1BackTrack(int i, int n){
        if(i>n) return;

        printNto1BackTrack(i+1,n);
        System.out.println(i);
    }

    static int sumOfN(int n, int i, int sum){
        if(i>n) return sum;
        sum += i*i*i;
        return sumOfN(n, i+1, sum);
    }

    static int sumOfCubesN(int n){
        if(n<1) return 0;

        return sumOfCubesN(n-1)+ n*n*n;
    }

//    static void factorial(int n){
//        HashSet<Integer> s = new HashSet<>();
//
//        if (n==0 || n==1)return  ;
//        System.out.println(n*factorial(n-1));
//        (n*factorial(n-1));
//    }

    static int[] reverseArray(int[] a){
        int i=1;
        int n = a.length;
        int temp = a[i];
        a[i] = a[n-i];
        a[n-i] = temp;
        return reverseArray(a);

    }

    static boolean reverseString(String s){
        int i=0;
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println("line 72 "+s);
        while(i<s.length()/2){
            if(s.charAt(i)  != s.charAt(s.length()-i-1) ) return false;
            i++;
        }
        return true;
    }

    static void fibonacci(int n, List<Integer> list, int i, int j){
        if(list.size()== n+1) return;
        list.add(list.get(i)+ list.get(j));
        fibonacci(n, list, i+1, j+1);
    }

    static int findSize(String str){
        return 0;
    }

    public static void main(String[] args){
//        printName(5);
//        print1ton(6,1);
//        printnto1(10);
        printNto1BackTrack(1, 5);
        int sum = sumOfCubesN(5);
        System.out.println(sum);
        String s = "A man, a plan, a canal: Panama";
        boolean res =  reverseString(s);
        System.out.println(res);
        List<Integer> fibSeries = new ArrayList<>();
        fibSeries.add(0);
        fibSeries.add(1);
        fibonacci(5, fibSeries, 0, 1);
        System.out.println(fibSeries);
        System.out.println(Character.SIZE);

    }
}
