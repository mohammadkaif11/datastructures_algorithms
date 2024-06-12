package DynamicProgramming.Subsequences;

import java.util.Arrays;

public class SbQ2 {
    public  static  boolean  solRecursion (int ind,int arr[],int target,int dp[][]){
        if(target==0){
            return  true;
        }
        if(ind==0){
            if(target==arr[ind]){
                return  true;
            }else{
                return  false;
            }
        }
        if(dp[ind][target]!=-1)
            return dp[ind][target]==0?false:true;
        boolean NotTake=solRecursion(ind-1,arr,target,dp);
        boolean take=false;
        if(target>=arr[ind]){
            take=solRecursion(ind-1,arr,target-arr[ind],dp);
        }
        dp[ind][target]=NotTake||take?1:0;

        return  NotTake || take;
    }

    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return  false;
        }
        int target=sum/2;

        int dp[][]=new int[n][target+1];
        for(int row[]: dp)
            Arrays.fill(row,-1);

        boolean ans=solRecursion(n-1,nums,target,dp);

        return  ans;
    }


    public static void main(String[] args) {

    }
}
