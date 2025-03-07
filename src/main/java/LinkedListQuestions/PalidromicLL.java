package LinkedListQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class PalidromicLL {

    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    public static void isPalindrome(Node head){

        Node curr = head;
        Node next = null;
        Node prev = null;
        ArrayList<Integer> l = new ArrayList<>();

        while(curr!=null){
            l.add(curr.data);
            curr = curr.next;
        }
        ArrayList<Integer> iniL = (ArrayList)l.clone();
        Collections.reverse(l);
        if(l.equals(iniL)) System.out.println("true");
        else System.out.println("false");



//        while(curr!=null){
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//
//        }
//        Node reverseHead = prev;
//        printList(head);
//        printList(reverseHead);
//

        //return true;
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){

            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        isPalindrome(head);
    }
}
