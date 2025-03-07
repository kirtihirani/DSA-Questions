package LinkedListQuestions;

public class MiddleOfLL {
    static class Node{
        int data;
        Node next;
        public Node(int x){
            this.data = x;
            next = null;
        }
    }

    public static Node middleOfLl(Node head){
        Node fast = head;
        Node slow = head;
        while( fast!=null && fast.next!=null && slow!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static int findLength(Node slow, Node fast){

        // count to keep track of
        // nodes encountered in loop
        int cnt = 1;

        // move fast by one step
        fast = fast.next;

        // traverse fast till it
        // reaches back to slow
        while(slow!=fast){

            // at each node increase
            // count by 1 and move fast
            // forward by one step
            cnt++;
            fast = fast.next;
        }

        // loop terminates when fast reaches
        // slow again and the count is returned
        return cnt;
    }
    static int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Traverse the list to detect a loop
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;

            // Move fast two steps
            fast = fast.next.next;

            // Step 2: If the slow and fast
            // pointers meet, there is a loop
            if (slow == fast) {
                return findLength(slow, fast);
            }
        }

        // Step 3: If the fast pointer reaches the end
        // there is no loop

        return 0;
    }

    public static int loopLength(Node head){
        System.out.println("hello");
            Node fast = head;
            Node slow = head;
            int count = 1;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(fast==slow) break;
            }
            if(fast==slow){
                fast=fast.next;
                while(fast!=slow){
                    count++;

                    fast = fast.next;
                }
            }
            return count;
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!= null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();

    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next = head.next.next;
//        head = middleOfLl(head);
//        System.out.println(head.data);
        int count  = lengthOfLoop(head);
        int cnt = loopLength(head);
        System.out.println(count+" "+cnt);

    }
}
