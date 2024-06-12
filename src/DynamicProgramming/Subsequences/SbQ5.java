package DynamicProgramming.Subsequences;

public class SbQ5 {

    //memoization
    public  static int fun(int val[],int wt[],int w,int ind,int dp[][]){
        if(ind==0){
            if(wt[0]<=w){
                return  val[0];
            }else{
                return 0;
            }
        }
        if(dp[ind][w]!=-1){
            return dp[ind][w];
        }
        int Nottake=0+fun(val,wt,w,ind-1,dp);
        int take=Integer.MIN_VALUE;
        if(wt[ind]<=w){
            take=val[ind]+fun(val,wt,w-wt[ind],ind-1,dp);
        }

        return dp[ind][w]= Math.max(Nottake,take);
    }


    //Tabulation
    public  static int funTab(int val[],int wt[],int w,int ind,int n){
        int dp[][]=new int[n][w+1];

        //base case handle
        for(int i=wt[0];i<=w;i++){
            dp[0][i]=val[0];
        }

        for(int i=1;i<n;i++){
            for(int _w=0;i<=w;i++){
                int Nottake=dp[i-1][_w];
                int take=Integer.MIN_VALUE;
                if(wt[ind]<=w){
                    take=val[i]+dp[i-1][_w-wt[i]];
                }
                 dp[i][_w]= Math.max(Nottake,take);
            }
        }
      return   dp[n-1][w];
    }

    public static void main(String[] args) {

    }
}
