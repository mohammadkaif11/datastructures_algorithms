package DynamicProgramming.Basis;

import java.util.Arrays;

public class FrogJump {

       //Memoization
       public  static  int solve(int index,int height[],int dp[]){
           if(index==0){
               return  0;
           }
           int jumpTwo=Integer.MAX_VALUE;
           if(dp[index] != -1) return  dp[index];
           int jumpOne= solve(index-1,height,dp)+Math.abs(height[index]-height[index-1]);
           if(index>1){
               jumpTwo= solve(index-2,height,dp)+Math.abs(height[index]-height[index-2]);
           }
           return dp[index]= Math.min(jumpOne,jumpTwo);
       }
       //Tabulation
       public  static  void solveTab(int index,int height[]){
        int n=height.length;
        int dp[]=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int jumpTwo=Integer.MAX_VALUE;
          int jumpOne=dp[i-1]+Math.abs(height[i]-height[i-1]);
          if(i>1){
              jumpTwo=dp[i-2]+Math.abs(height[i]-height[i-2]);
          }
          dp[i]=Math.min(jumpOne,jumpTwo);
        }
        System.out.println(dp[n-1]);
       }

       //SpaceOptimzation
       public  static  void  solveSpace(int index,int height[] ){
           int n=height.length;
           int prev=0;
           int prev2=0;
           for(int i=1;i<n;i++){

               int jumpTwo = Integer.MAX_VALUE;
               int jumpOne= prev + Math.abs(height[i]-height[i-1]);
               if(i>1)
                   jumpTwo = prev2 + Math.abs(height[i]-height[i-2]);

               int cur_i=Math.min(jumpOne, jumpTwo);
               prev2=prev;
               prev=cur_i;
           }
           System.out.println(prev);

       }

    public static void main(String[] args) {
        int height[]={30,10,60 , 10 , 60 , 50};
        int n=height.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(solve(n-1,height,dp));
        solveTab(n-1,height);
    }
}
