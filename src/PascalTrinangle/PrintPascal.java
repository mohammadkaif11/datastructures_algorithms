package PascalTrinangle;


import java.util.ArrayList;

//Print any complete row
public class PrintPascal {

    public  static  long findNcr(int n,int r){
        long result=1;
        for(int i=0;i<r;i++){
            result=result*(n-i);
            result=result/(i+1);
        }
        return  result;
    }

    public  static  void PrintusingNcr(int row){
        int col=row;
        for(int i=1;i<=col;i++){
            long data=findNcr(row-1,i-1);
            System.out.println(data);
        }
    }

    public  static  void Print(int row){
        long  ans=1;
        System.out.println(ans+" ");
        int col=row;
        for(int i=1;i<col;i++){
            ans=ans*(row-i);
            ans=ans/(i);
            System.out.println(ans+" ");
        }
    }

    public  static  void ArrayListReturn(int row){
        ArrayList<Long> al=new ArrayList<Long>();
        long ans=1;
         al.add(ans);
        int col=row;
        for(int i=1;i<col;i++){
            ans=ans*(row-i);
            ans=ans/i;
            al.add(ans);
        }
    }

    public static void main(String[] args) {
        PrintusingNcr(6);
    }
}
