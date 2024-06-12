package Graphs.Question;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    class Pair {
        int first;
        int second;


        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
       }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;

        int rc=image[sr][sc];

        int vis[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(image[i][j]==rc){
                    vis[i][j]=rc;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==sr && j==sc  && image[i][j]==rc && image[i][j]!=color){
                    bfs(image,i,j,color,n,m,rc,vis);
                }
            }
        }


        return image;

    }

    public void bfs(int[][] image, int sr, int sc, int color,int n,int m,int rc,int[][] vis){
        int row=sr;
        int col=sc;
        image[row][col]=color;
        vis[row][col]=color;
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(row,col));

        while (!queue.isEmpty()){
            int r=queue.peek().first;
            int c=queue.peek().second;
            queue.remove();
            int drow[]={-1,0,+1,0};
            int dcol[]={0,1,0,-1};
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow <n && ncol>= 0 && ncol<m && vis[nrow][ncol]==rc && image[nrow][ncol]==rc){
                    image[nrow][ncol]=color;
                    vis[nrow][ncol]=color;
                    queue.add(new Pair(nrow,ncol));
                }
            }
        }


    }

    public static void main(String[] args) {
        FloodFill ff=new FloodFill();
        int image[][]={{0,0,0},{0,0,0},{0,0,0}};
        var array=ff.floodFill(image,1,1,0);

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                System.out.println(array[i][j]);
            }
        }

    }
}
