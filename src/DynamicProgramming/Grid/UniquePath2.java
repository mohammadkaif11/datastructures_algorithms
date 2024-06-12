package DynamicProgramming.Grid;

import java.util.Arrays;

public class UniquePath2 {
    public int Sol(int m,int n,int dp[][],int obstacleGrid[][]){
        if(m>=0 && n>=0 && obstacleGrid[m][n]==1){
            return 0;
        }

        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }

        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int left=Sol(m,n-1,dp,obstacleGrid);
        int top=Sol(m-1,n,dp,obstacleGrid);

        return dp[m][n]=left+top;

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(m==1 && n>1){
            for(int i=0;i<n;i++){
                if(obstacleGrid[0][i]==1){
                    return 0;
                }
            }
            return 1;
        }
        int dp[][]=new  int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int result=Sol(m-1,n-1,dp,obstacleGrid);
        return result;
    }
    static int mazeObstaclesUtilTab(int n, int m, int[][] maze, int[][] dp) {
        for(int i=0; i<n ;i++){
            for(int j=0; j<m; j++){

                //base conditions
                if(i>0 && j>0 && maze[i][j]==-1){
                    dp[i][j]=0;
                    continue;
                }
                if(i==0 && j==0){
                    dp[i][j]=1;
                    continue;
                }

                int up=0;
                int left = 0;

                if(i>0)
                    up = dp[i-1][j];
                if(j>0)
                    left = dp[i][j-1];

                dp[i][j] = up+left;
            }
        }

        return dp[n-1][m-1];

    }

    static int mazeObstaclesTab(int n, int m, int[][] maze){
        int dp[][]=new int[n][m];
        for(int row[]: dp)
            Arrays.fill(row,-1);
        return mazeObstaclesUtilTab(n,m,maze,dp);

    }

    public static void main(String[] args) {
        int[][] maze = { {0,0,0},
                {0,-1,0},
                {0,0,0}};
    }
}
