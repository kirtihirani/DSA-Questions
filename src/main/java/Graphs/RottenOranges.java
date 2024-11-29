package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    static class Pair{
        int row, col, time;
        Pair(int row, int col, int time){
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static int rottenOranges(int[][] grid){
        int[][] vis = new int[grid.length][grid[0].length];
        int cntfrsh = 0;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }
                else if(grid[i][j] == 1)cntfrsh++;
                else vis[i][j]=0;
            }
        }

        int maxtime = 0;
        int cnt =0;
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,-1,0,1};
        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int t = q.peek().time;
            maxtime = Math.max(maxtime, t);
            q.remove();
            for(int i=0; i<4; i++){
                int nrow = row+drow[i];
                int ncol = col+dcol[i];
                if(nrow>=0 && nrow<grid.length && ncol >=0 && ncol<grid[0].length && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    vis[nrow][ncol]=2;
                    q.add(new Pair(nrow, ncol, t+1));
                    cnt++;
                }
            }
        }
        if(cnt!=cntfrsh) return -1;
        return maxtime;
    }

    public static void main(String[] args){
        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1},
        };

        System.out.println(rottenOranges(grid));

    }
}
