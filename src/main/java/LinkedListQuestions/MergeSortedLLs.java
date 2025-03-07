package LinkedListQuestions;

public class MergeSortedLLs {

    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node mergeLL(Node head1, Node head2){
        Node dummyHead = new Node(-1);
        Node temp = dummyHead;
        while(head1!=null && head2!=null){
            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
       if (head1!=null){
            temp.next = head1;
//            head1 = head1.next;
        }
        if (head2!=null){
            temp.next = head2;
//            head2 = head2.next;
        }
        return dummyHead.next;

    }

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
        head.next.next = new Node(7);
        head.next.next.next = new Node(4);
        Node head1 = new Node(5);
        head1.next = new Node(6);
        printList(head);
        Node merged = mergeLL(head1, head);
        printList(merged);
    }
}
