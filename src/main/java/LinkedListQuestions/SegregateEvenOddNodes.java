package LinkedListQuestions;

public class SegregateEvenOddNodes {
    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    public static void segregation(Node head){
        Node oddHead = new Node(-1);
        Node evenHead = new Node(-1);
        Node oddTail = oddHead;
        Node evenTail = evenHead;
        Node curr = head, temp;
        int cnt = 1;
        while(curr!=null){
            temp = curr;
            curr = curr.next;
            temp.next = null;
            if(cnt%2==0){
                evenTail.next = temp;
                evenTail = evenTail.next;
            }
            else{
                oddTail.next = temp;
                oddTail = oddTail.next;
            }
        }
        evenTail.next = oddHead.next;
        printList(evenHead);

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
        head.next.next.next.next = new Node(5);
        segregation(head);
    }
}
