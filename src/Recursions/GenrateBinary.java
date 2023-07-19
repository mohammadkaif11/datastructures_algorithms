package Recursions;

import java.util.ArrayList;
import java.util.Arrays;


//Genrate all Binary digit
public class GenrateBinary {

    public static String toString(char[] a) {
        String string = new String(a);
        return string;
    }

    //M1
    public static  void Sol(ArrayList<String> res,int k,int i,char[] temp){
        //base case
        if(i==k){
            res.add(toString(temp));
            return;
        }
        if(temp[i-1]=='0'){
            temp[i]='0';
            Sol(res,k,i+1,temp);
            temp[i]='1';
            Sol(res,k,i+1,temp);
        }

        if(temp[i-1]=='1'){
            temp[i]='0';
            Sol(res,k,i+1,temp);
        }
    }

    //M1
    public static ArrayList<String> generateString(int k) {
        ArrayList<String> res=new ArrayList<>();
        if(k<=0){
            return  res;
        }
        char[] temp=new char[k];
        temp[0]='0';
        //genrate all string starts with zero;

        Sol(res,k,1,temp);

        temp[0]='1';
        Sol(res,k,1,temp);

        return  res;
    }

    //M2
    public static  void Sol2(ArrayList<String> res,int k,int i,char[] temp){
        //base case
        if(i==k){
            res.add(toString(temp));
            return;
        }
        //for other case
        if(i>0){
            temp[i]='0';
            Sol(res,k,i+1,temp);
            if(temp[i-1]!=1){
                temp[i]='1';
                Sol(res,k,i+1,temp);
            }
        }

        //for initial case
        if(i==0){
            temp[i]='0';
            Sol(res,k,i+1,temp);
            temp[i]='1';
            Sol(res,k,i+1,temp);
        }
    }

    //M2
    public static ArrayList<String> generateString2(int k) {
        ArrayList<String> res=new ArrayList<>();
        if(k<=0){
            return  res;
        }
        char[] temp=new char[k];

        Sol2(res,k,0,temp);

        return  res;
    }

    public static void main(String[] args) {
        ArrayList<String> result=generateString2(2);

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }


    }
}

