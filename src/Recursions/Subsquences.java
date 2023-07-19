package Recursions;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Subsquences {
    //Genrate All Subsequences

    public static  void GenrateSubsequence(int arr[], int i, List<Integer> temp){
        if(i>=arr.length){
            System.out.println(temp);
            return;
        }
        temp.add(arr[i]);
        GenrateSubsequence(arr,i+1,temp);
        temp.remove(temp.size()-1);
        GenrateSubsequence(arr,i+1,temp);
    }

    //string
    public static  void  genrateSub(List<String> res,List<Character> temp,int index,String s){
        if(index>=s.length()){
            String result="";
            for(int i=0;i<temp.size();i++){
                result+=temp.get(i);
            }
            if(result!="" && !res.contains(result)){
                res.add(result);
            }else{
                res.add("Empty String");
            }
            return;
        }
        temp.add(s.charAt(index));
        genrateSub(res,temp,index+1,s);
        temp.remove(temp.size()-1);
        genrateSub(res,temp,index+1,s);
    }

    public static List<String> generateSubsequences(String s) {
        // Write your code here
        List<String> result=new ArrayList<>();


        List<Character> temp=new ArrayList<Character>();


        genrateSub(result,temp,0,s);

        return  result;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<Integer> temp=new ArrayList<>();
        GenrateSubsequence(arr,0,temp);
       var list=   generateSubsequences("dd");
       System.out.println(list);
    }
}
