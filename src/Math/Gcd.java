package Math;

public class Gcd {
    //Inclusion-Exclusion Principle
    public  static int  FindCommonDivison(int n,int a,int b)
    {
        int c1=n/a;
        int c2=n/b;
        int c3=n/(a*b);
        return  Math.abs(c1+c2-c3);
    }
    //Eculid Algo
    public  static  int FindGcd(int a ,int b){
        while (b!=0){
             int rem=a%b;
             a=b;
             b=rem;
        }
        return  a;
    }
    public static void main(String[] args) {

        System.out.println(FindCommonDivison(20,2,4));
        System.out.println(FindGcd(30,18));

    }
}

