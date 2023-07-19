package Dp;

public class ClimbStaris {

    public static int ClimbStrainsrec(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return  1;
        }
      return  ClimbStrainsrec(n-1) +ClimbStrainsrec(n-2);
    }

    public static void main(String[] args) {
        System.out.println(ClimbStrainsrec(3));
    }

}
