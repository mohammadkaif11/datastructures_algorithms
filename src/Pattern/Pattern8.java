package Pattern;

public class Pattern8 {
    public static void main(String[] args) {
        int n=3;
        int Total=2*n-1;

        for(int i=n;i>=1;i--)
        {
            int count1=0;
            int k=1;
            while (k<=i){
                System.out.print(k);
                count1++;
                k++;
            }
            int as=Total-2*i;
            while (as>0){
                System.out.print("*");
                as--;
                count1++;
            }
            int rest=Total-count1;
            while (rest!=0){
                System.out.print(rest);
                rest--;
            }
            System.out.println();
        }
    }
}
