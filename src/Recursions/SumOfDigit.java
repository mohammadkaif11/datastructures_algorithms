package Recursions;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(123));
    }
    public static int sum(int num)
    {
        if(num<=0){
            return num;
        }
        int LastDigit=num%10;

        return LastDigit+sum(num/10);
    }
}
