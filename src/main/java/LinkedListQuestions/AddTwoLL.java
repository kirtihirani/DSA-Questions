package LinkedListQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class AddTwoLL {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node addLL(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node resHead = new Node(-1);
        Node resTemp = resHead;
        int carry = 0;
        while (temp1!=null || temp2!=null || carry!=0){
            int sum = 0;
            if(temp1!=null){
                sum+= temp1.data;
                temp1=temp1.next;
            }
            if(temp2!=null){
                sum+= temp2.data;
                temp2=temp2.next;
            }
            sum+= carry;
            carry = sum/10;
            Node newNode = new Node(sum%10);
            resTemp.next = newNode;
            resTemp = newNode;
        }
        return resHead.next;
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList();
        Node curr=head;
        HashMap<Integer,Boolean> temp = new HashMap();
        while(curr!=null){
            if(!temp.containsKey(curr.data)){
                temp.put(curr.data, true);
            }
            int remaining = target-curr.data;
            if(temp.containsKey(remaining)){
                ArrayList<Integer> res1 = new ArrayList();
                res1.add(curr.data);
                res1.add(remaining);
                Collections.sort(res1);
                res.add(res1);

            }
            curr=curr.next;
        }
        res.sort((a, b) -> {
            int compareFirst = a.get(0).compareTo(b.get(0));
            if (compareFirst != 0) {
                return compareFirst; // Sort by the first element
            } else {
                return a.get(1).compareTo(b.get(1)); // Sort by the second element if the first elements are equal
            }
        });
        return res;
    }
    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next = new Node(9);

        Node head1 = new Node(9);
        head1.next = new Node(9);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(9);

        Node res = addLL(head, head1);
        printList(res);

    }
}
