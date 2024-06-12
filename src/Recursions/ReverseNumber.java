package Recursions;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber(198);
    }
    public  static  void reverseNumber(int num)
    {
        if(num<10){
            System.out.print(num);
            return;
        }
        int LastDigit=num%10;
        System.out.print(LastDigit);
        reverseNumber(num/10);
    }
}
