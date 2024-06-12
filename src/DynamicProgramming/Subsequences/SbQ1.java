package DynamicProgramming.Subsequences;

import java.util.Arrays;

public class SbQ1 {
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


    public  static  boolean SolMemmoization(int arr[],int target)
    {
        int n=arr.length;
        int dp[][]=new int[n][target+1];
        for(int row[]: dp)
            Arrays.fill(row,-1);
        return  solRecursion(n-1,arr,target,dp);
    }

    public  static  boolean SolTabulation(int arr[],int target)
    {
        int n=arr.length;
        boolean dp[][]=new boolean[n][target+1];
        for(boolean row[]: dp)
            Arrays.fill(row,false);

        //base case
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        dp[0][arr[0]]=true;

        for (int i=1;i<n;i++){
            for(int t=1;t<=target;t++){
                boolean NotTake=dp[i-1][t];
                boolean take=false;
                if(arr[i]<=t){
                    take=dp[i-1][t-arr[i]];
                }
                dp[i][t]=NotTake||take;
            }
        }

      return   dp[n-1][target];
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k=4;
        int n = arr.length;
        System.out.println(SolMemmoization(arr,k));
        System.out.println(SolTabulation(arr,k));

    }
}
