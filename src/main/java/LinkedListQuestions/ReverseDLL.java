package LinkedListQuestions;


import java.util.Stack;

public class ReverseDLL {

    static class DllNode{
        int data;
        DllNode next;
        DllNode prev;
        public DllNode(int x){
            this.data = x;
            this.prev = null;
            this.next = null;
        }

    }

    public static DllNode reverseDll(DllNode head){
       Stack<Integer> st = new Stack<>();
       DllNode curr = head;

       while (curr!=null){
           st.push(curr.data);
           curr = curr.next;
       }
       curr = head;
       while (curr!=null && !st.empty()){
           curr.data = st.pop();
           curr = curr.next;
       }
       return head;
    }

    public static DllNode optimizedReverseDll(DllNode head){
        DllNode curr = head;
        DllNode temp = null;
        while (curr!=null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;

        }
        return temp.prev;
    }

    public static void printList(DllNode head){
        DllNode curr = head;
        while(curr!=null){
            System.out.print(curr.data+"<->");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        DllNode head = new DllNode(1);
        DllNode second = new DllNode(2);
        DllNode third = new DllNode(3);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        printList(head);
        head = optimizedReverseDll(head);
        printList(head);
    }
}
