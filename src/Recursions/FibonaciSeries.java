package Recursions;

import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(PrintFib(i));

        }
    }
    public static int PrintFib(int n)
    {
        if (n <= 1)
            return n;
        return PrintFib(n - 1) + PrintFib(n - 2);
    }

}

