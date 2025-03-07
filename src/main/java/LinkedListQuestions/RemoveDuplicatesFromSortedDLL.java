package LinkedListQuestions;

public class RemoveDuplicatesFromSortedDLL {
    static class Node{
        int data;
        Node next, prev;

        public Node(){

        }
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node push(Node head, int data){
        Node newNode = new Node(data);
        newNode.prev = null;
        if(head==null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        head.prev=newNode;
        head = newNode;
        return head;
    }

    public static void deleteNode(Node head, Node del){
        if(head==null || del==null){
            return;
        }
        if(head==del){
            head = del.next;
        }
        if (del.next==null){
            del.prev.next = null;
        }
        if(del.prev==null){
            del.next.prev=null;
        }
        if(del.prev!=null && del.next!=null){
            Node temp = del.prev;
            del.next.prev=temp;
            temp.next=del.next;
        }
    }

    public static Node removeDuplicates(Node head){
        Node curr = head;
        while(curr.next!=null){
            if(curr.next.data == curr.data){
                deleteNode(head, curr.next);
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }

    public static void printList(Node head){
       Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + "<->");
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head = push(head, 3);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 2);
        head = push(head, 1);
        head = push(head, 1);
        printList(head);
        removeDuplicates(head);
        printList(head);
    }
}
