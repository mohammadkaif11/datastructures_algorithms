package DynamicProgramming.Grid;

import java.util.Arrays;

public class UniquePath3 {
    public static int SolMemo(int i, int j, int dp[][], int Mat[][]) {
        //i and j
        if (i == 0 && j == 0) {
            return Mat[i][j];
        }
        //check for wheather i less than zero or j lesthan zerro
        if (i < 0 || j < 0) {
            return (int) Math.pow(10, 9);

        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int left = Mat[i][j] + SolMemo(i - 1, j, dp, Mat);
        int right = Mat[i][j] + SolMemo(i, j - 1, dp, Mat);

        return dp[i][j] = Math.min(left, right);
    }
    public static int solTab(int m, int n, int matrix[][]) {

        int dp[][]=new int[m][n];

        for(int i=0; i<m ; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j==0) dp[i][j] = matrix[i][j];
                else{

                    int up = matrix[i][j];
                    if(i>0) up += dp[i-1][j];
                    else up += (int)Math.pow(10,9);

                    int left = matrix[i][j];
                    if(j>0) left+=dp[i][j-1];
                    else left += (int)Math.pow(10,9);

                    dp[i][j] = Math.min(up,left);
                }
            }
        }

        return  dp[m-1][n-1];

}

    public static void main(String[] args) {
        int matrix[][] = {{5,9,6},{11,5,2}};

        int n = matrix.length;
        int m = matrix[0].length;
        int dp[][]=new int[n][m];
        for(int row[]: dp)
            Arrays.fill(row,-1);


        System.out.println(SolMemo(n-1,m-1,dp,matrix));
        System.out.println(solTab(n-1,m-1,matrix));

    }
}
