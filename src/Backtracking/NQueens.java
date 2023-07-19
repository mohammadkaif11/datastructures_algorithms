package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueens {

    public  static List<List<String>>  solveNQueens(int n){
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }

        List<List<String>> ans=new ArrayList<>();
        int leftRow[]=new int[n];
        int lowerDiagonal[]=new int[2*n-1];
        int upperDiagonal[]=new int[2*n-1];
        Slove(0,ans,board,leftRow,lowerDiagonal,upperDiagonal);
        return  ans;
    }

    public  static  void Slove(int col,List<List<String>> ans , char[][] board,int[] leftRow,int[] lowerDiagonal,int [] upperDiagonal){

      if(col==board.length){
          ans.add(construct(board));
          return;
      }

      for(int row=0;row<board.length;row++){
          if(leftRow[row]==0 && lowerDiagonal[row+col]==0 && upperDiagonal[board.length-1+col-row]==0){
              board[row][col]='Q';
              leftRow[row]=1;
              lowerDiagonal[row+col]=1;
              upperDiagonal[board.length-1+col-row]=1;
              Slove(col+1,ans,board,leftRow,lowerDiagonal,upperDiagonal);
              board[row][col]='.';
              leftRow[row]=0;
              lowerDiagonal[row+col]=0;
              upperDiagonal[board.length-1+col-row]=0;
          }
      }
    }

    static List < String > construct(char[][] board) {
        List < String > res = new LinkedList< String >();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    public static void main(String[] args) {
        int N = 8;
        List < List < String >> queen = solveNQueens(N);
        int i = 1;
        for (List < String > it: queen) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
    }
}
