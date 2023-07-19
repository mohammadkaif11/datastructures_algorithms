package Recursions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
    public  static void  Calculate(int index, int sum, ArrayList<Integer> res,ArrayList<Integer> input,int N){
        if(index==N){
            res.add(sum);
            return;
        }

        //pickup
        Calculate(index+1,sum+input.get(index),res,input,N);

        //not pickup
        Calculate(index+1,sum,res,input,N);
    }

    public  static  ArrayList<Integer> GetSubsetSum(ArrayList<Integer> arr,int n){
        ArrayList<Integer> res=new ArrayList<>();
        Calculate(0,0,res,arr,n);
        Collections.sort(res);
        return  res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(3);

        System.out.println(GetSubsetSum(arr,3));
    }
}
