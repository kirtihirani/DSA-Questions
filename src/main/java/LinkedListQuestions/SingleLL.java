package LinkedListQuestions;

public class SingleLL {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static SingleLL insert(SingleLL ll , int d){
        Node newNode = new Node(d);
        if(ll.head == null){
            ll.head = newNode;
        }
        else{
            Node curr = ll.head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }

        return ll;
    }

    public static SingleLL reverseLL(SingleLL list){
        Node curr = list.head;
        Node next = null;
        Node prev = null;

        while(curr!=null){
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.head = prev;
        return list;
    }

    public static void printList(SingleLL list){
        if(list.head==null) System.out.println("empty list");
        else{
            Node curr = list.head;
            while(curr!= null){
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        SingleLL list = new SingleLL();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        printList(list);
        list = reverseLL(list);
        printList(list);
    }


}
