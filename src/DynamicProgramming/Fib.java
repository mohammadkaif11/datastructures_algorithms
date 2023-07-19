package DynamicProgramming;

import java.util.Arrays;

public class Fib {

    //Memoization
    public static int  Fib(int n,int arr[]){
        if(n<=1){
            return n;
        }
        if(arr[n]!=-1){
            return  arr[n];
        }
        return   arr[n]=Fib(n-1,arr)+ Fib(n-2,arr);
    }

    //Tabulation
    public  static void FibTab(int n){
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]= 0;
        dp[1]= 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+ dp[i-2];
        }

        System.out.println(dp[n]);
    }

    //Space Optimzation
    public  static  void  FibSO(int n){
        if(n<=1){
            System.out.println(n);
        }

        int prev2 = 0;
        int prev = 1;

        for(int i=2; i<=n; i++){
            int cur_i = prev2+ prev;
            prev2 = prev;
            prev= cur_i;
        }
        System.out.println(prev);
    }

    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(Fib(5,dp));
    }
}
