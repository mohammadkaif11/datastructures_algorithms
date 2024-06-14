package Graphs.DijstrasAlgo.Question;

import java.util.PriorityQueue;

class Pair{
    int row;

    int col;
    int distance;
    public Pair(int row,int col,int distance){
        this.row = row;
        this.col=col;
        this.distance = distance;
    }
}
public class ShortestpathBinary {
    public int shortestPathBinaryMatrix(int[][] grid) {

        PriorityQueue<Pair> pq=new PriorityQueue<Pair>(((x,y) -> x.distance - y.distance));
        int n=grid.length;
        int m=grid[0].length;
        int dis[][]=new int[n][m];

        if(grid[0][0]==1 || grid[n-1][m-1]==1){
            return -1;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dis[i][j]=(int)1e4;
            }
        }

        pq.add(new Pair(0,0,1));

        while (!pq.isEmpty()){
            int r=pq.peek().row;
            int c=pq.peek().col;
            int d=pq.peek().distance;
            pq.remove();


            if(r==n-1 && c==m-1){
                return  d;
            }

            for(int nRows=-1;nRows<=1;nRows++){
                for(int nCols=-1;nCols<=1;nCols++){
                    int nRow = r+nRows;
                    int nCol = c+nCols;
                    if(nRow >= 0 && nRow<n && nCol>=0 && nCol <m  && grid[nRow][nCol]==0 && d+1 < dis[nRow][nCol]){
                        dis[nRow][nCol]=d+1;
                        pq.add(new Pair(nRow,nCol,d+1));
                    }
                }
            }

        }


        return  -1;
    }
}

