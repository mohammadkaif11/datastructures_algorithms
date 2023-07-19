package DynamicProgramming.Buysellstock;

import java.util.Arrays;

public class Buysell1 {

    //Memoization
    public int sol(int [] prices,int buy,int dp[][],int i,int n){
        if(i==n){
            return 0;
        }
        int profit=0;
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }
        if(buy==1){
            profit=Math.max(-prices[i]+sol(prices,0,dp,i+1,n),0+sol(prices,1,dp,i+1,n));
        }else{
            profit=Math.max(prices[i]+sol(prices,1,dp,i+1,n),0+sol(prices,0,dp,i+1,n));
        }

        return dp[i][buy]=profit;
    }

    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n][2];

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=-1;
            }
        }
        int ans=sol(prices,1,dp,0,n);

        return ans;

    }


    //Tabulation
    static long getMaximumProfit(long Arr[], int n)
    {
        //Write your code here

        long dp[][]=new long[n+1][2];
        for(long row[]: dp)
            Arrays.fill(row,-1);

        //base condition
        dp[n][0] = dp[n][1] = 0;

        long profit=0;

        for(int ind= n-1; ind>=0; ind--){
            for(int buy=0; buy<=1; buy++){
                if(buy==0){// We can buy the stock
                    profit = Math.max(0+dp[ind+1][0], -Arr[ind] + dp[ind+1][1]);
                }

                if(buy==1){// We can sell the stock
                    profit = Math.max(0+dp[ind+1][1], Arr[ind] + dp[ind+1][0]);
                }

                dp[ind][buy]  = profit;
            }
        }
        return dp[0][0];
    }

    public static void main(String args[]) {

        int n =6;
        long Arr[] = {7,1,5,3,6,4};

        System.out.println("The maximum profit that can be generated is "+getMaximumProfit(Arr, n));
    }
}
