package DynamicProgramming.Basis;

import java.util.Arrays;

public class MaximumSumofNonAdjacentElement {

    public  static  int solveUtil(int ind,int []arr,int dp[]){
        if(ind==0){
            return  arr[ind];
        }
        if(ind<0){
            return  0;
        }
        if(dp[ind]!=-1 ) return  dp[ind];

        int pickup=solveUtil(ind-2,arr,dp)+arr[ind];
        int notPickup=solveUtil(ind-1,arr,dp)+0;

        return dp[ind]=Math.max(pickup,notPickup);
    }

    public  static  int solveTab(int arr[]){
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);

        //basecase
        dp[0]=arr[0];
        int neg=0;

        //loop
        for(int i=1;i<n;i++){
            int pickup=arr[i];
            if(i>1){
                pickup+=dp[i-2];
            }
            int notpickup=dp[i-1];
            dp[i]=Math.max(pickup,notpickup);
        }

        return  dp[n-1];
    }

    public  static  int solveSO(int arr[]){
        int n=arr.length;
        //basecase
        int prev=arr[0];
        int prev2=0;

        //loop
        for(int i=1;i<n;i++){
            int pickup=arr[i];
            if(i>1){
                pickup+=prev2;
            }
            int notpickup=prev;
            int curri=Math.max(pickup,notpickup);

            prev2=prev;
            prev=curri;
        }

        return  prev;
    }

    static  int solve(int n,int[] arr){
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solveUtil(n-1, arr, dp);
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,9};
        int n=arr.length;
        System.out.println(solve(n,arr));

    }
}
