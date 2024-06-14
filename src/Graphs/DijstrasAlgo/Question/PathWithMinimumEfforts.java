package Graphs.DijstrasAlgo.Question;

import java.util.PriorityQueue;

public class PathWithMinimumEfforts {

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
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>(((x, y) -> x.distance - y.distance));
        int n=heights.length;
        int m=heights[0].length;
        int dis[][]=new int[n][m];


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dis[i][j]=(int)1e9;
            }
        }

        int nRows[]={-1,0,1,0};
        int nCols[]={0, 1, 0, -1};


        dis[0][0]=0;
        pq.add(new Pair(0,0,0));
        while (!pq.isEmpty()){
            int r=pq.peek().row;
            int c=pq.peek().col;
            int d=pq.peek().distance;
            if(r==n-1 && c==m-1) return d;
            pq.remove();


            for(int i=0;i<4;i++){
                 int nRow = r+nRows[i];
                 int nCol  = c+nCols[i];
                if(nRow >= 0 && nRow<n && nCol>=0 && nCol <m){
                   int newEffort=Math.max(Math.abs(heights[nRow][nCol]-heights[r][c]),d);
                   if(newEffort<dis[nRow][nCol]){
                       dis[nRow][nCol]=newEffort;
                       pq.add(new Pair(nRow,nCol,newEffort));
                   }
                }
            }

        }

        return  -1;

    }
    public static void main(String[] args) {

    }
}
