package Graphs.Question;

import java.util.LinkedList;
import java.util.Queue;

public class NoOfIslands {

    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public void bfs(int r,int c,char[][] grid,int[][] vis,int n,int m){
        vis[r][c] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(r,c));

        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            int drow[]={-1,0,+1,0};
            int dcol[]={0,1,0,-1};

            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow >= 0 && nrow<n && ncol>=0 && ncol <m  && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0){
                    System.out.println("[n:rows "+nrow+" n:cols "+nrow+" ]");
                    vis[nrow][ncol] = 1;
                    q.add(new Pair(nrow,ncol));
                }
            }

            // if count dignally
//            for(int nRows=-1;nRows<=1;nRows++){
//                for(int nCols=-1;nCols<=1;nCols++){
//                    int nRow = row+nRows;
//                    int nCol = col+nCols;
//                    if((nRows == 0 || nCols == 0) && nRow >= 0 && nRow<n && nCol>=0 && nCol <m  && grid[nRow][nCol] == '1' && vis[nRow][nCol] == 0){
//                        vis[nRow][nCol] = 1;
//                        q.add(new Pair(nRow,nCol));
//                    }
//                }
//            }
        }
    }
    public  int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] viz = new int[n][m];

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (viz[i][j]==0 && grid[i][j] == '1') {
                    count++;
                    bfs(i, j,grid,viz,n,m);
                }
            }
        }

        return count;
    }


    //sc--n2
    //tc--n2
    public static void main(String[] args) {
        NoOfIslands noOfIslands=new NoOfIslands();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int result = noOfIslands.numIslands(grid);
        System.out.println(result); // 4

    }
}
