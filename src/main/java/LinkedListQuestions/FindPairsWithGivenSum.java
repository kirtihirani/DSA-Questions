package LinkedListQuestions;

import oopsConcepts.ImmutableClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FindPairsWithGivenSum {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static ArrayList<ArrayList<Integer>> findPairs(Node head, int target){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Node curr = head;
        HashMap<Integer,Boolean> track = new HashMap<>();
        while(curr!=null){
            int remaining = target-curr.data;
            if(!track.containsKey(curr.data)) track.put(curr.data, true);
            if(track.containsKey(remaining) && remaining!= curr.data){
                ArrayList res1 = new ArrayList<>();
                res1.add(curr.data);
                res1.add(remaining);
                Collections.sort(res1);
                res.add(res1);
            }
            curr = curr.next;
        }
        res.sort(
                (a,b)->{
                    int comapreFirst = a.get(0).compareTo(b.get(0));
                    if (comapreFirst!=0) return comapreFirst;
                    else return a.get(1).compareTo(b.get(1));
                }
        );
        return res;

    }

    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next = new Node(9);
        ArrayList<ArrayList<Integer>>  res = findPairs(head, 7);
        for (int i=0; i<res.size(); i++){
            System.out.println(res.get(i));
        }


    }


}
