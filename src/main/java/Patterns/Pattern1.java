package Patterns;

import java.util.Scanner;

public class Pattern1 {

    static void printPattern1(int n){
        // output:
        // * * *
        // * * *
        // * * *
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printPattern2(int n){

//            *
//            * *
//            * * *
//            * * * *

        for(int i=0; i<n;i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printPattern3(int n){
//            1
//            12
//            123
//            1234
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }

    static void printPattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){                        // 1
                System.out.print(i+" ");                    // 2 2
            }                                               // 3 3 3
            System.out.println();                           // 4 4 4 4
        }
    }

    static void printPattern5(int n){           // * * * *
        for(int i=0; i<n; i++){                 // * * *
            for(int j=0; j<n-i; j++){           // * *
                System.out.print("* ");         // *
            }
            System.out.println();
        }
    }

    static void printPattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void printPattern7(int n) {
//           *
//          ***
//         *****
//        *******
        System.out.println("pattern 7");
        for(int i=0; i<n; i++){
            for(int j=0; j<n+i; j++){
                if(j<n-i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void printPattern8(int n){
//        *******
//         *****
//          ***
//           *

        for(int i=0; i<n; i++){
            for (int j=0 ; j<=n-i+2; j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printPattern9(int n){
//           *
//          ***
//         *****
//        *******
//        *******
//         *****
//          ***
//           *
        printPattern7(n);
        printPattern8(n);
    }

    static void printPattern10(int n){
//        *
//        **
//        ***
//        **
//        *
        int counter = n-1;
        for(int i=0; i<(n*2)-1; i++){
            if(i<n){
                for(int j=0; j<=i; j++){
                    System.out.print("*");
                }
            }
            else{
                int j=0;
                while(j<counter){
                    System.out.print("*");
                    j++;
                }
                counter=counter-1;
            }
            System.out.println();
        }
    }

    static void printPattern11(int n){
//        1
//        0 1
//        1 0 1
        for(int i=0; i<n; i++){
            if(i%2==0){
                for(int j=0; j<=i;j++){
                    if(j%2==0)System.out.print("1 ");
                    else{System.out.print("0 ");}
                }
            }
            else{
                for(int j=0; j<=i;j++){
                    if(j%2==0)System.out.print("0 ");
                    else{System.out.print("1 ");}
                }
            }
            System.out.println();
        }
    }

    static void printPattern12(int n){
        int spaces = (n*2)-2;
        for(int i=1; i<=n; i++){
            //numbers
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            //spaces
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
            spaces= spaces-2;
        }
    }

    static void printPattern13(int n){
        System.out.println("pattern 13");
        System.out.println();
        for (int i=0 ; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<i*2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*(n-i-1); j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void printPattern14(int n){
//        *    *
//        **  **
//        ******
//        **  **
//        *    *

        int spaces= 2*n -2;
        for(int i=1; i<=2*n -1; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i > n) spaces += 2;
            else spaces -= 2;

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern1(n);
        printPattern2(n);
        printPattern3(n);
        printPattern4(n);
        printPattern5(n);
        printPattern6(n);
        printPattern7(n);
        printPattern8(n);
        printPattern9(n);
        printPattern10(n);
        printPattern11(n);
        printPattern12(n);
        printPattern13(n);
    }
}

