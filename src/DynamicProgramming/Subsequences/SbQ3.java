package DynamicProgramming.Subsequences;

import java.util.Arrays;

public class SbQ3 {

    //Postive work
    public   static  int minimumDifference(int[] nums) {

        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int k=sum;
        boolean dp[][]=new boolean[n][k+1];
        for(boolean row[]: dp)
            Arrays.fill(row,false);

        //base case
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(nums[0]<=k)  dp[0][nums[0]]=true;

        for (int i=1;i<n;i++){
            for(int t=1;t<=k;t++){
                boolean NotTake=dp[i-1][t];
                boolean take=false;
                if(nums[i]<=t){
                    take=dp[i-1][t-nums[i]];
                }
                dp[i][t]=NotTake||take;
            }
        }

        int mini=Integer.MAX_VALUE;

        for(int s1=0;s1<=sum;s1++){
            if(dp[n-1][s1]==true){
                mini=Math.min(mini,Math.abs((sum-s1)-s1));
            }
        }

        return  mini;
    }

    public static void main(String[] args) {
        int arr[]={-36,36};
        System.out.println(minimumDifference(arr));
    }
}
