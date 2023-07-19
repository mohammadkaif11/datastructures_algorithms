package Dp;

public class Fib {

    //FIND FIND BY RECURSION
    public static   int FindFibbyR(int n){
        if(n<=1){
            return  0;
        }
        return FindFibbyR(n-1)+FindFibbyR(n-2);
    }

    //Tc-0(N) Sc-0(N)+0(N)
    public  static int FindFibbyRandMemo(int n,int dp[]){
        if(n<=1){
            return  n;
        }
        if(dp[n]!=-1){
            return  dp[n];
        }
        return  dp[n]=FindFibbyR(n-1)+FindFibbyR( n-2);
    }

    //Tc-0(N) Sc-0(N)
    public  static int FindFibbyTab(int n,int dp[]){
        if(n<=1){
            return  n;
        }
        dp[1]=1;
        dp[0]=0;
        for(int i=2;i<=n;i++){
            dp[i]=dp[n-1]+dp[n-2];
        }
        return  dp[n];
    }

    //Tc-0(N)
    public  static int FindFibbyTab(int n){
        if(n<=1){
            return  n;
        }
        int prev=1;
        int prev2=0;
        for(int i=2;i<=n;i++){
            int curi=prev2+prev;
            prev2=prev;
            prev=curi;
        }

        return prev;
    }

    public static void main(String[] args) {

    }
}
