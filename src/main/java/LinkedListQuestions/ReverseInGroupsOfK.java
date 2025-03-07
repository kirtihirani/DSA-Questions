package LinkedListQuestions;

public class ReverseInGroupsOfK {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseLL(Node head){
        Node next = null, prev=null;
        Node curr = head;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

//    public static Node reverseInGroups(int k, Node head){
//        Node curr = head;
//        int count=1;
//        while (curr!=null){
//
//        }
//    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        printList(head);
        head = reverseLL(head);
        printList(head);

    }
}
