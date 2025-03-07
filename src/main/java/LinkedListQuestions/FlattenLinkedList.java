package LinkedListQuestions;

public class FlattenLinkedList {
    static class Node{
        int data;
        Node next;
        Node child;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.child = null;
        }
    }

    public static Node mergeLL(Node head1, Node head2){
        Node dummyHead = new Node(-1);
        Node temp = dummyHead;
        while(head1!=null && head2!=null){
            if (head1.data< head2.data){
                temp.child = head1;
                temp=head1;
                head1=head1.child;
            }
            else {
                temp.child = head2;
                temp=head2;
                head2 = head2.child;
            }
            temp.next=null;
        }
        if (head1!=null){
            temp.child=head1;
        }
        if (head2!=null){
            temp.child=head2;
        }
        if (dummyHead.child != null) {
            dummyHead.child.next = null;
        }
        return dummyHead.child;
    }

    public static Node flattenLL(Node head){
        if(head==null || head.next==null) return head;
        Node mergedHead = flattenLL(head.next);
        Node res = mergeLL(head,mergedHead);
        return res;
    }

    public static void printFlattenedList(Node head){
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data);
            System.out.print("->");
            curr = curr.child;
        }
    }

    public static void printOriginalLinkedList(Node head, int depth) {
        while (head != null) {
            System.out.print(head.data);

            // If child exists, recursively
            // print it with indentation
            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.child = new Node(14);

        head.next = new Node(10);
        head.next.child = new Node(4);

        head.next.next = new Node(12);
        head.next.next.child = new Node(20);
        head.next.next.child.child = new Node(13);

        head.next.next.next = new Node(7);
        head.next.next.next.child = new Node(17);
        printOriginalLinkedList(head, 0);
        Node flatHead = flattenLL(head);
        printFlattenedList(flatHead);
    }
}
