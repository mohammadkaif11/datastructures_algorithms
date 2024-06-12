package Graphs.Question;

import java.util.LinkedList;
import java.util.Queue;

public class NearestOnes {
    class Pair {
        int first;
        int second;

        int step;
        public Pair(int first, int second,int step) {
            this.first = first;
            this.second = second;
            this.step=step;
        }
    }


    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int viz[][]=new int[n][m];
        int dist[][]=new int[n][m];
        Queue<Pair> queue=new LinkedList<Pair>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    queue.add(new Pair(i,j,0));
                    viz[i][j]=1;
                }else{
                    viz[i][j]=0;
                }
            }
        }
        int drow[] = {-1, 0, +1, 0};
        int dcol[] = {0, +1, 0, -1};


        while (!queue.isEmpty()){
            int r=queue.peek().first;
            int c=queue.peek().second;
            int s=queue.peek().step;
            dist[r][c]=s;
            queue.remove();

            for(int i=0;i<4;i++){
                int nrows=r+drow[i];
                int ncols=c+dcol[i];
                if(nrows>=0 && nrows<n && ncols>=0 && ncols<m && viz[nrows][ncols]==0){
                    viz[nrows][ncols]=1;
                    int currentStep=s+1;
                    queue.add(new Pair(nrows,ncols,currentStep));
                }
            }

        }
        return  dist;
    }

    public static void main(String[] args) {
        NearestOnes nn=new NearestOnes();
        int[][] grid = {
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };

        var ans=nn.updateMatrix(grid);

        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
