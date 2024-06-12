package DynamicProgramming.Subsequences;

import java.util.Arrays;

public class SbQ6 {

    public static int coinChange(int[] coins, int amount,int ind,int dp[][]) {
        if(ind==0){
            if(amount%coins[0] == 0) return amount/coins[0];
            else return (int)Math.pow(10,9);
        }
        if(dp[ind][amount]!=-1){
            return  dp[ind][amount];
        }
        int notTake=0+coinChange(coins,amount,ind-1,dp);
        int take=(int)Math.pow(10,9);

        if(coins[ind]<=amount){
            take=1+coinChange(coins,amount-coins[ind],ind,dp);
        }
        return dp[ind][amount]= Math.min(take,notTake);
    }

    static int minimumElements(int[] arr, int T){

        int n= arr.length;

        int[][] dp=new int[n][T+1];

        for(int row[]: dp)
            Arrays.fill(row,-1);

        int ans=coinChange(arr,T,n-1,dp);
        if(ans >= (int)Math.pow(10,9)) return -1;
        return ans;
    }

    static int coinChangeTablulation(int[] arr, int T){

        int n= arr.length;

        int dp[][]=new int[n][T+1];

        for(int i=0; i<=T; i++){
            if(i%arr[0] == 0)
                dp[0][i] = i/arr[0];
            else dp[0][i] = (int)Math.pow(10,9);
        }

        for(int ind = 1; ind<n; ind++){
            for(int target = 0; target<=T; target++){

                int notTake = 0 + dp[ind-1][target];
                int take = (int)Math.pow(10,9);
                if(arr[ind]<=target)
                    take = 1 + dp[ind][target - arr[ind]];

                dp[ind][target] = Math.min(notTake, take);
            }
        }

        int ans = dp[n-1][T];
        if(ans >=(int)Math.pow(10,9)) return -1;
        return ans;
    }

    public static void main(String[] args) {
        int coins[]={1,2,3};
        int amo=7;
        System.out.println(minimumElements(coins,amo));

    }
}
