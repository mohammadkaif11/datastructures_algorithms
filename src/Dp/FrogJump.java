package Dp;

public class FrogJump {

    public  static  int findPathRecur(int n,int arr[]){
        if(n==0){
            return  0;
        }
        int right=Integer.MIN_VALUE;
        int left=findPathRecur(n-1,arr)+Math.abs(arr[n]-arr[n-1]);
        if(n>1){
             right=findPathRecur(n-2,arr)+Math.abs(arr[n]-arr[n-2]);
        }

        return  Math.min(left,right);
    }

    public  static  int findPathRecurWithMemoization(int n,int arr[],int dp[]){
        if(n==0){
            return  0;
        }
        if(dp[n]!=-1){
            return  dp[n];
        }
        int right=Integer.MIN_VALUE;
        int left=findPathRecur(n-1,arr)+Math.abs(arr[n]-arr[n-1]);
        if(n>1){
            right=findPathRecur(n-2,arr)+Math.abs(arr[n]-arr[n-2]);
        }

        return  dp[n]=Math.min(left,right);
    }

    public static void main(String[] args) {

    }
}
