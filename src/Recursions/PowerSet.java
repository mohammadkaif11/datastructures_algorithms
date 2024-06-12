package Recursions;

public class PowerSet {
    public static void main(String[] args) {
      System.out.println(Power(2,3));
    }
    public  static  int Power(int num,int p)
    {
        if (p != 0) {

            // recursive call to power()
            return (num * Power(num, p - 1));
        }
        else {
            return 1;
        }
    }
}
