package Graphs;

import Array.PairSum;

import java.util.LinkedList;
import java.util.Queue;

class  Pair{
    int i;
    int j;
    public  Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}

public class NoOfIslands {

    static  void  bfs(int ro,int co,int viz[][],char[][] island){
        viz[ro][co]=1;
        Queue<Pair>  qu=new LinkedList<>();
        qu.add(new Pair(ro,co));

        int n=island.length;
        int m=island[0].length;
        while (!qu.isEmpty()){
            int row=qu.peek().i;
            int col=qu.peek().j;
            qu.remove();
            for(int delrow=-1;delrow<=1;delrow++){
                for(int delcol=-1;delcol<=1;delcol++){
                    int nrow=delrow+row;
                    int ncol=delcol+col;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && viz[nrow][ncol]==0 && island[nrow][ncol]=='l'){
                        viz[nrow][ncol]=1;
                        qu.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
    }

    static  int noOfIslansfind(char island[][])
    {
        int n=island.length;
        int m=island[0].length;
        int [][]viz=new int[n][m];
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(viz[i][j]==0 && island[i][j]=='l'){
                 count++;
                 viz[i][j]=1;
                 bfs(i,j,viz,island);
                }
            }
        }

        return  count;
    }

    //sc--n2
    //tc--n2
    public static void main(String[] args) {

    }
}
