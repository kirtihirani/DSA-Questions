package Graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Traversals {

    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adjlist, int n, int start){
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] vis = new boolean[n];
        q.add(start);
        vis[start] = true;
        ArrayList<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            Integer node = q.poll();
            result.add(node);
            for (Integer ele: adjlist.get(node)){
                if (vis[ele] == false){
                    vis[ele] = true;
                    q.add(ele);
                }
            }
        }
        return result;
    }

    static void dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean vis[], ArrayList<Integer> result  ){
        result.add(node);
        vis[node] = true;
        for (Integer data: graph.get(node) ){
            if(!vis[data]){
                dfs(graph,data, vis, result);
            }
        }

    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int n = 10;
        for (int i =0 ; i<n; i++){
            adjList.add(new ArrayList<>());
        }
//        adjList.get(1).add(2);
//        adjList.get(1).add(6);
//
//        adjList.get(2).add(1);
//        adjList.get(2).add(3);
//        adjList.get(2).add(4);
//
//        adjList.get(3).add(2);
//
//        adjList.get(4).add(2);
//        adjList.get(4).add(5);
//
//        adjList.get(5).add(4);
//        adjList.get(5).add(8);
//
//        adjList.get(6).add(1);
//        adjList.get(6).add(7);
//        adjList.get(6).add(9);
//
//        adjList.get(7).add(8);
//        adjList.get(7).add(6);
//
//        adjList.get(8).add(5);
//        adjList.get(8).add(7);
//
//        adjList.get(9).add(6);
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(2);

        adjList.get(2).add(0);
        adjList.get(2).add(3);
        adjList.get(3).add(3);


        System.out.println(bfs(adjList, n, 1));

        ArrayList<Integer> result = new ArrayList<>();
        boolean[] vis = new boolean[adjList.size()];
        dfs(adjList, 2,vis,result);
        System.out.println(result);

    }
}
