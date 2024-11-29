package Graphs;


import java.util.LinkedList;
import java.util.Queue;

class Pair1 {
    int first;
    int second;
    Pair1(int first , int second){
        this.first = first;
        this.second = second;
    }
}
public class NoOfIslands {

    public static void bfs(char[][] grid, int[][] vis, int ro, int co){
        Queue<Pair1> q = new LinkedList<>();
        q.add(new Pair1(ro,co));
        vis[ro][co] = 1;
        int n =grid.length;
        int m = grid[0].length;
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            for(int delrow=-1; delrow<=1; delrow++){
                for(int delcol=-1; delcol<=1; delcol++){
                    int nrow = row+delrow;
                    int ncol = col+delcol;
                    if(nrow>=0 && nrow<=n-1 && ncol>=0 && ncol<=m-1){
                        if(grid[nrow][ncol] == '1' && vis[nrow][ncol]==0){
                            q.add(new Pair1(nrow, ncol));
                            vis[nrow][ncol] = 1;
                        }
                    }
                }
            }
        }
    }
    public static int countIslands(char[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int count =0;
        int[][]vis = new int[m][n];
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                if(vis[row][col] == 0 && grid[row][col] == '1'){
                    bfs(grid, vis, row, col);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        char[][] m ={
                {'1', '1', '0', '0', '0'},
                {'0', '1', '0', '0', '1'},
                {'1', '0', '0', '1', '1'},
                {'1', '0', '0', '0', '0'},
                {'1', '0', '1', '1', '0'}
        };
        System.out.println(countIslands(m));
    }
}
