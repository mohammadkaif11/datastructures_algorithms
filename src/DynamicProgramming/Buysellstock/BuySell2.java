package DynamicProgramming.Buysellstock;

public class BuySell2 {
    //Memoization
    public int sol(int [] prices,int buy,int dp[][],int i,int n,int cap){

        if(cap==0){
            return 0;
        }
        if(i==n){
            return 0;
        }
        int profit=0;
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }
        if(buy==1){
            profit=Math.max(-prices[i]+sol(prices,0,dp,i+1,n,cap),0+sol(prices,1,dp,i+1,n,cap));
        }else{
            profit=Math.max(prices[i]+sol(prices,1,dp,i+1,n,cap-1),0+sol(prices,0,dp,i+1,n,cap));
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

        //Int number of maximum tranaction
        int cap=2;
        int ans=sol(prices,1,dp,0,n,cap);

        return ans;

    }



    public static void main(String[] args) {

    }
}
