package Array;

public class Bomb {
    public static int FindResult(int mat[][],int m,int n){
        int result[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=-1;
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    result[i][j]=0;
                    int tempi=0;
                    int tempj=0;
                    while (tempj<n){
                        result[i][tempj]=0;
                        tempj++;
                    }
                    while (tempi<m){
                        result[tempi][j]=0;
                        tempi++;
                    }
                }
            }
        }

        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if(result[i][j]==-1){
                  count+=mat[i][j];
              }
            }
        }

        return  count;
    }


    public static void main(String[] args) {

        int Mat[][]={{4,5,6},{7,0,9},{1,3,1}};

        System.out.println(FindResult(Mat,3,3));
    }
}
