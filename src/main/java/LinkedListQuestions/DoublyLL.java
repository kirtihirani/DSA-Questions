package LinkedListQuestions;

public class DoublyLL {
    Node head;
    static class Node{
        int data;
        Node next,prev;
        Node(int d){
            data=d;
            next = null;
            prev = null;
        }
    }

    DoublyLL insert(DoublyLL list, int data){
        Node newNode = new Node(data);
        newNode.next = list.head;
        if(list.head!=null){
            list.head.prev = newNode;
        }
        return list;

    }

    void printList(DoublyLL list){
        System.out.println("hello"+ list.head.data);
        Node curr = list.head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args){
        DoublyLL list = new DoublyLL();
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);

        list.printList(list);

    }

}
