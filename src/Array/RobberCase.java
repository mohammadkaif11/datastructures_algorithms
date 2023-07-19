package Array;

public class RobberCase {

    public  static  int Findmax(int arr[][],int n,int m)
    {
        int i=0;
        int j=0;
        int result=arr[0][0];

        while (i<n && j<m){
            if(i==n-1 || j==m-1)
            {
                if(i==n-1){
                    if(j<m-1){
                        result+=arr[i][j+1];
                        System.out.println(arr[i][j+1]);
                    }
                    j++;
                }else{
                    if(i<n-1) {
                        result += arr[i + 1][j];
                        System.out.println(arr[i+1][j]);

                    }
                    i++;
                }
            }
           else  if(arr[i][j+1]>arr[i+1][j])
            {
                result+=arr[i][j+1];
                System.out.println(arr[i][j+1]);
                j=j+1;
            }else{
                result+=arr[i+1][j];
                System.out.println(arr[i+1][j]);
                i=i+1;
            }
        }

        return  result;
    }

    public static void main(String[] args) {

        int arr[][]={{1,2,3},{4,3,2},{1,8,3}};
        System.out.println(Findmax(arr,3,3));
    }

}
