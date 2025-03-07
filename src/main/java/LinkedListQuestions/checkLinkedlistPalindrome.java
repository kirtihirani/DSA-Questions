package LinkedListQuestions;

public class checkLinkedlistPalindrome {
    static class Node{
        Node next;
        int data;
       public Node(int data){
           this.next = null;
           this.data = data;
       }

    }

    static boolean solve(Node head){
        Node slow = head, fast=head;
        if (head==null || head.next==null)return true;
        while(fast!=null && fast.next!=null){

            fast = fast.next.next;
            if(fast!=null)slow=slow.next;
        }
        Node secondhalf = reverse(slow.next);
        Node firsthalf = head;
        Node temp = secondhalf;
        boolean ispalindrome = true;
        while (temp!=null && firsthalf!=null){
            if (temp.data!= firsthalf.data){
                ispalindrome=false;
                break;
            }
            temp=temp.next;
            firsthalf=firsthalf.next;
        }
        return ispalindrome;
    }

    static Node reverse(Node head){
        Node prev = null;
        Node next = null;
        Node curr = head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
       // head.next.next.next.next = new Node(2);
//        head.next.next.next.next.next = new Node(2);
        //head = reverse(head);
        //printList(head);
        System.out.println(solve(head));
    }
}
