package LinkedListQuestions;

public class Add1ToLL {

    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseLL(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node addOne(Node head){
        head = reverseLL(head);
        Node temp = head;
        int carry = 1;
        while(temp!=null){
            temp.data = temp.data+carry;
            if(temp.data<10){
                return head;
            }
            else {
                temp.data=0;
                carry=1;
            }
            temp = temp.next;
        }

        if(carry==1){
            Node carryOver = new Node(carry);
            head = reverseLL(head);
            carryOver.next = head;
            head = carryOver;
            return head;
        }
        head = reverseLL(head);
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);
        printList(head);
        head = addOne(head);
        printList(head);
    }
}
