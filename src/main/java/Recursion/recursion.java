package Recursion;


import java.util.Arrays;

public class recursion {

    static void func(int n, int start){
        if (n<0 && start>n) return;

        System.out.println(n +" "+ start);
        func(--n, ++start);
    }

    static void sumOfNNumbers(int [] arr , int start, int sum){
        if(start>arr.length-1){
            System.out.println(sum);
            return;
        }
        sum = sum + arr[start];
        sumOfNNumbers(arr, ++start, sum);
    }

    static int fact(int n
    ){
        if (n==0) return 1;
        return n * fact(n-1);
    }

    static void reverseArray(int[] arr, int start, int end){
        if (end <= start) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int k = arr[start];
        arr[start] = arr[end];
        arr[end] = k;
        reverseArray(arr, ++start, --end);
    }
    public static void main(String[] args){
        int n = 5;
        func(n,0);
        int fct = fact(n);
        System.out.println("factorial of 5:" + " "+ fct);
        int[] arr = {1,2,3,4};
        sumOfNNumbers(arr, 0, 0);
        reverseArray(arr, 0, arr.length-1);
    }
}
