package LinkedListQuestions;

import java.util.Collections;
import java.util.LinkedList;

public class LLMethods {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        System.out.println(ll);
        ll.add(5);
        ll.add(100);
        System.out.println(ll);
        ll.addFirst(20);
        System.out.println(ll);
        ll.set(2, 10);
        System.out.println(ll);
        System.out.println(ll.contains(10));
        System.out.println(ll.size());

    }
}
