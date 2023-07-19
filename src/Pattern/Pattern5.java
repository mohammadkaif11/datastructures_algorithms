package Pattern;

public class Pattern5 {
    public static void main(String[] args) {

        int n=3;
        for(int i=1;i<=n;i++)
        {
            int temp=0;
            for(int j=1;j<=i;j++){
                System.out.print(j);
                 temp=j;
            }
            temp--;
            while (temp>=1 && i!=1){
                System.out.print(temp);
                temp--;
            }
            System.out.println();
        }
    }
}
