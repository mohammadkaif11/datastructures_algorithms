package Recursions;

import java.util.ArrayList;

public class GenrateBlancedParnatisis {
    //Genrate all blancedParantiss

    public static String toString(char[] a) {
        String string = new String(a);
        return string;
    }
    public static  void Sol(ArrayList<String> res, int ob, int cb,String temp){
        //base case
        if(ob==0 && cb==0){
            res.add(temp);
            return;
        }
        //for open bracket
        if(ob>0){
            Sol(res,ob-1,cb,temp+"{");
        }

        //for closed bracket
        if(ob<cb){
            Sol(res,ob,cb-1,temp+"}");
        }
    }

    public static ArrayList<String> genrateallPar(int k) {
        ArrayList<String> res=new ArrayList<>();
        if(k<=0){
            return  res;
        }
        String temp="";
        int ob=k;
        int cb=k;
        Sol(res,ob,cb,temp);
        return  res;
    }

    public static void main(String[] args) {
        ArrayList<String> result=genrateallPar(3);

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }

}
