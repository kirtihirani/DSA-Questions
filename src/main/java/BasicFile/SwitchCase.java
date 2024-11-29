package BasicFile;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        switch (age){
            case 23:{
                System.out.println("your age is 23");
                break;
            }
            case 22:{
                System.out.println("your age is 22");
                break;
            }
            default:{
                System.out.println("thankyou");
                break;
            }

        }
    }
}
