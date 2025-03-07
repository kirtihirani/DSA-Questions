package LinkedListQuestions;

import java.util.Scanner;


class Node{
    int data;
    Node next;
    public Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class LLImplementation {

    public static Node insertAtLAst(int data, Node head){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        Node curr = head;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;

    }

    public static Node insertNodeAtStart(int data, Node head){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static Node insertAtPosition(int data, Node head, int pos){
        int count =0;
        Node newNode = new Node(data);
        if(pos==0){
            System.out.println("at 0");
            newNode.next = head;
            head = newNode;
            printList(head);
            return head;
        }
        Node curr = head;

        while(count<pos-1 && curr!=null && curr.next!=null){
            curr=curr.next;
            count++;
        }
        newNode.next = curr.next;
        curr.next = newNode;


        return head;
    }

    public static Node deleteLastNode(Node head){
//        if(head==null || head.next==null) return null;
//        Node curr = head;
//        while(curr.next.next!= null){
//            curr = curr.next;
//        }
//        curr.next=null;
//        return head;

        if (head == null || head.next == null)
            return null;
        // Create a temporary pointer for traversal
        Node temp = head;
        // Traverse the list until the second-to-last node
        while (temp.next.next != null) {
            temp = temp.next;
        }
        // Nullify the connection from the second-to-last node to delete the last node
        temp.next = null;
        // Return the updated head of the linked list
        return head;
    }

    public static int lengthOfLL(Node head){
        Node curr = head;
        if(head==null){
            return 0;
        }
        else if (head.next == null){
            return 1;
        }
        int count=1;
        while(curr.next!= null){
            count++;
            curr = curr.next;
        }
        return count;

    }

    public static boolean searchElement(Node head, int k){
        if(head==null) return false;
        Node curr = head;

        while(curr!=null){
            if(curr.data == k) return true;
            curr = curr.next;
        }
        return false;
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+ " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(1);
        head = insertNodeAtStart(2, head);
        head = insertNodeAtStart(3, head);
        printList(head);
        head= insertAtLAst(5, head);
        printList(head);
        insertAtPosition(11,head,0);
        printList(head);
        deleteLastNode(head);
        printList(head);
        head = deleteLastNode(head);
        printList(head);
        deleteLastNode(head);
        printList(head);
        head=deleteLastNode(head);
        System.out.println("last");
        printList(head);
        head =deleteLastNode(head);
        System.out.println("last");
        printList(head);
        head = insertNodeAtStart(2, head);
        head = insertNodeAtStart(3, head);
        head = insertNodeAtStart(4, head);
        head = insertNodeAtStart(5, head);
        printList(head);
        int cnt = lengthOfLL(head);
        System.out.println("Length of linkedlist: "+cnt);
        boolean isNumberPresent = searchElement(head, 20);
        System.out.println("Is number present: "+ isNumberPresent);

    }
}
