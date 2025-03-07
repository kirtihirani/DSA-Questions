package LinkedListQuestions;

public class MergeSortedLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node findMiddle(Node head){
        if(head==null || head.next==null) return head;
        Node fast = head.next;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public static Node mergeLL(Node leftHead, Node rightHead){
        Node dummyHead = new Node(-1);
        Node temp = dummyHead;
        while(leftHead!=null && rightHead!=null){
            if(leftHead.data<=rightHead.data){
                temp.next = leftHead;
                leftHead = leftHead.next;
            }
            else {
                temp.next = rightHead;
                rightHead = rightHead.next;
            }
            temp=temp.next;
        }
        if(leftHead!=null){
            temp.next = leftHead;
        }
        if (rightHead!=null){
            temp.next = rightHead;
        }
        return dummyHead.next;
    }

    public static Node sortLL(Node head){
        if(head==null || head.next==null) return head ;
        Node middle = findMiddle(head);
        Node right = middle.next;
        Node left = head;
        middle.next=null;
        left = sortLL(left);
        right =sortLL(right);
        return mergeLL(left, right);
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data);
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(1);

        head = sortLL(head);
        printList(head);
    }
}
