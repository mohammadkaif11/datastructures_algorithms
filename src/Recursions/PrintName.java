package Recursions;

public class PrintName {

    static  void Print(int n){
        if(n==0){
            return;
        }
        System.out.println("kaif");
        Print(n-1);
    }


    public static void main(String[] args) {
           Print(5);
    }
}
