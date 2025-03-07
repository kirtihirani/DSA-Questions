package LinkedListQuestions;

import java.util.HashMap;

public class YIntersectionLL {
    public static Node intersectionNode(Node head1, Node head2){
        HashMap<Node, Boolean> vis = new HashMap<>();
        Node curr = head1;
        Node curr2 = head2;
        while(curr!=null){
            if(!vis.containsKey(curr)){
                vis.put(curr,true);
            }
            curr = curr.next;
        }
        while(curr2!=null){
            if(vis.containsKey(curr2)) return curr2;
            curr2 = curr2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(1);
        head1.next.next.next = new Node(2);
        head1.next.next.next.next = new Node(4);
        Node head2 = new Node(3);
        head2.next= head1.next.next.next;
        Node res = intersectionNode(head1, head2);
        System.out.println(res.data);
    }
}
