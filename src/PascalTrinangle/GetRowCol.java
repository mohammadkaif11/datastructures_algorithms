package PascalTrinangle;

public class GetRowCol {

    public  static  long findNcr(int n,int r){
        long result=1;
        for(int i=0;i<r;i++){
            result=result*(n-i);
            result=result/(i+1);
        }
        return  result;
    }


    public static void main(String[] args) {

        //formule(5,3)---(5-1,3-1);
        System.out.println(findNcr(4,2));

    }
}
