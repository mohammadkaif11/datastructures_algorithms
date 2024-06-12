package DynamicProgramming.Figures;

public class NumberofSquares {

    public  static  int FindNoOfSquares(int mat[][]){
        int row=mat.length;
        int col=mat[0].length;
        int dp[][]=new int[row][col];

        //copy first col
        for(int i=0;i<row;i++){
            dp[i][0]=mat[i][0];
        }

        //copy first row
        for(int i=0;i<col;i++){
            dp[0][i]=mat[0][i];
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(mat[i][j]==0){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]))+1;
                }
            }
        }
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum+=dp[i][j];
            }
        }
        return  sum;
    }
    public static void main(String[] args) {

    }
}
