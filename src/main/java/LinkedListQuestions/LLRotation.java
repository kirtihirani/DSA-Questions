package LinkedListQuestions;

public class LLRotation {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node rotate(Node head){
        Node curr = head;
        Node prev=null;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        curr.next=head;
        head=curr;
        printList(head);
        return head;
    }

    public static Node optimizedRotation(Node head, int k){
        int lenOfLL = 0;
        Node curr = head;
        while(curr!=null){
            lenOfLL++;
            curr = curr.next;
        }
        int lenOfUnmodifiedLL = lenOfLL-k;
        curr=head;
        Node newNodeNext;
        while (lenOfUnmodifiedLL!=1 && curr.next!=null){
            lenOfUnmodifiedLL--;
            curr=curr.next;
        }
        newNodeNext = curr.next;
        curr.next=null;
        Node temp = newNodeNext;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head=newNodeNext;
        return head;
    }

    public static Node rotateLL(Node head, int k){

        while (k>0){
            head=rotate(head);
            k--;
        }
            return head;
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
       Node head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);
       printList(head);
       head=optimizedRotation(head,2);
       printList(head);
    }
}
