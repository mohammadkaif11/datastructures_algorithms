package Recursions;

public class SumOfNumber {

    //Parameterized Recursion
    public  static void Sum(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        Sum(n-1,sum+n);
    }

    public  static  int SumFun(int n){
        if(n==0){
            return 0;
        }

        return SumFun(n-1)+n;
    }

    public static void main(String[] args) {
         Sum(3,0);
         System.out.println(SumFun(3));
    }
}
