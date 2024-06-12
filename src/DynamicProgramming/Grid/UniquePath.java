package DynamicProgramming.Grid;

import java.util.ArrayList;
import java.util.Arrays;

public class UniquePath {

    public  static  int Sol(int i,int j){
        if(i==0 && j==0){
            return  1;
        }
        if(i<0 || j<0){
            return  0;
        }
       int left=Sol(i-1,j);
        int right=Sol(i,j-1);

        return  left+right;
    }

    //Solve Memoization
    public  static  int SolMemo(int i,int j,int dp[][]){
        //i and j
        if(i==0 && j==0) {
            return 1;
        }
        //check for wheather i less than zero or j lesthan zerro
        if(i<0 || j<0){
            return  0;
        }
        if(dp[i][j]!=-1){
            return  dp[i][j];
        }
        int left=SolMemo(i-1,j,dp);
        int right=SolMemo(i,j-1,dp);

        return  dp[i][j]=left+right;
    }

    //Tabulation
    public  static  int SolTabulation(int m,int n){
        //dp array
        int dp[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    //handle base case
                    dp[i][j]=1;
                    continue;
                }
                int up=0;
                int left=0;
                if(i>0){
                    up=dp[i-1][j];
                }
                if(j>0){
                    left=dp[i][j-1];
                }
                dp[i][j]=up+left;
            }
        }

        return  dp[m-1][n-1];
    }


    public static void main(String[] args) {

        //3*7
        int dp[][]=new  int[4][8];

        for(int i=0;i<4;i++){
            for(int j=0;j<8;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(Sol(2,6));
        System.out.println(SolMemo(2,6,dp));
        System.out.println(SolTabulation(3,7));

    }

}
