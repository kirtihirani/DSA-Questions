package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class graphs {
    public static int[][] createdAdjacencyMatrix(ArrayList<ArrayList<Integer>> graph, int numVertices){
        int[][] adjMatrix = new int[numVertices][numVertices];
        for (int i =0; i<numVertices; i++){
            for (int j=0; j<numVertices; j++){
                if(graph.get(i).get(j)==1){
                    adjMatrix[i][j] = 1;
                    adjMatrix[j][i] =1;
                }
            }
        }
        return adjMatrix;
    }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        graph.add(new ArrayList<>(Arrays.asList(0,1,0,0)));
        graph.add(new ArrayList<>(Arrays.asList(1,0,1,0)));
        graph.add(new ArrayList<>(Arrays.asList(0,1,0,1)));
        graph.add(new ArrayList<>(Arrays.asList(0,0,1,0)));
        int numVertices = graph.size();
        int[][] adjMatrix = createdAdjacencyMatrix(graph,numVertices);
        for(int i =0; i<numVertices; i++){
            for(int j=0; j<numVertices; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("adjacency list");
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int n = 3, m=3;
        for (int i=0; i<=n; i++){
            adjList.add(new ArrayList<>());
        }
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        adjList.get(2).add(3);
        adjList.get(3).add(2);

        for (int i=0; i<=n; i++){
            System.out.print(i+ "-> ");
            for (int j=0; j<adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j)+ " ");
            }
            System.out.println();
        }

    }
}
