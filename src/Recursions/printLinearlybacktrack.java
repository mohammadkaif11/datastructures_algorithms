package Recursions;

public class printLinearlybacktrack {

    //1-n backtracking
    public  static  void Print(int n,int i)
    {
        if(i<1){
            return;
        }
        Print(n,i-1);
        System.out.println(i);
    }

    //n-1 backtracking
    static void reverse(int i,int N){
        if(i>N){
            return ;
        }
        reverse(i+1,N);
        System.out.println(i);
    }


    public static void main(String[] args) {
        Print(3,3);
        reverse(1,4);
    }
}
