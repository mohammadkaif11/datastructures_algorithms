package Array;

public class Rotate270 {

    public  static void   Rotate(int arr[][],int n)
    {
        int[][] temp=new int[n][n];
        for (int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=0){
                    temp[i-n-1][j]=arr[j][i];
                }else{
                    temp[n-1][j]=arr[j][i];
                }
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=temp[i][j];
            }
        }

    }

    public static void main(String[] args) {

    }
}
