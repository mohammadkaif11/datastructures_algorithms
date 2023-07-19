package Pattern;

public class Pattern3 {
    public  static  void main(String arg[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int j=1;
            while (j<=n-i){
                System.out.print("*");
                j++;
            }
            int k=1;
            while (k<=i){
                System.out.print(k);
              k++;
            }

            System.out.println();
        }
    }
}
