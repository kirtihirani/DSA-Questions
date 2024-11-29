package Graphs;

import java.util.*;


public class FloodFill {

    public static int[][] bfs(int[][] a, int sc, int sr, int newcolor, boolean[][] vis){
        Queue<Pair1> q = new LinkedList<>();
        int ini = a[sr][sc];
        a[sr][sc] = newcolor;
        q.add(new Pair1(sr,sc));
        vis[sr][sc] = true;
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            List<Pair1> pair1s = new ArrayList<>();
            if(row-1>=0) pair1s.add(new Pair1(row-1, col));
            if(row+1<=a.length-1) pair1s.add(new Pair1(row+1, col));
            if(col-1>=0) pair1s.add(new Pair1(row, col-1));
            if(col+1<=a[0].length-1) pair1s.add(new Pair1(row, col+1));
            for(Pair1 p: pair1s){
                if(!vis[p.first][p.second] && a[p.first][p.second] == ini){
                    q.add(new Pair1(p.first,p.second));
                    vis[p.first][p.second] = true;
                    a[p.first][p.second] = newcolor;
                }
            }
            pair1s.clear();

        }
        return a;
    }



    public static void main(String[] args){
        int[][] a = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };
        int sc = 0;
        int sr = 2;
        int newcolor = 3;
        boolean vis[][] = new boolean[a.length][a[0].length];

        int[][] newa = bfs(a, sc, sr, newcolor, vis);
        for(int i=0; i<newa.length; i++){
            System.out.println(Arrays.toString(newa[i]));
        }
    }
}
