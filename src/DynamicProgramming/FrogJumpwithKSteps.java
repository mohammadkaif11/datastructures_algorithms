package DynamicProgramming;

import java.util.Arrays;

public class FrogJumpwithKSteps {

    static int solveUtil(int ind, int[] height, int[] dp, int k){
        if(ind==0) return 0;
        if(dp[ind]!=-1) return dp[ind];

        int mmSteps = Integer.MAX_VALUE;

        for(int j=1;j<=k;j++){
            if(ind-j>=0){
                int jump = solveUtil(ind-j, height, dp, k)+ Math.abs(height[ind]-
                        height[ind-j]);
                mmSteps= Math.min(jump, mmSteps);
            }
        }
        return dp[ind]= mmSteps;

    }

    //Memomization
    static int solve(int n, int[] height , int k){
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solveUtil(n-1, height, dp, k);
    }

    //Solve Tabulation
    static int solveTab(int n, int[] height , int k){
        int dp[]=new int[n];
        Arrays.fill(dp,-1);

        dp[0]=0;

        for (int i=1;i<n;i++){
            int mmSteps = Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    int jump = dp[i-j]+ Math.abs(height[i]-
                            height[i-j]);
                    mmSteps= Math.min(jump, mmSteps);
                }
            }
             dp[i]= mmSteps;
        }
        return  dp[n-1];
    }

    public static void main(String[] args) {
        int height[]={30,10,60 , 10 , 60 , 50};
        int n=height.length;
        int k=2;
        System.out.println(solve(n,height,k));
        System.out.println(solveTab(n,height,k));


    }
}
