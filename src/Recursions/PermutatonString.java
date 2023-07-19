package Recursions;

import java.util.ArrayList;
import java.util.List;

public class PermutatonString {
    public static  void  Permutate(int nums[], List<Integer> ds,List<List<Integer>> ans,boolean []freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<Integer>(ds));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
               freq[i]=true;
               ds.add(nums[i]);
                Permutate(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }

    public static   List<List<Integer>> GetPermutate(int nums[]){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        Permutate(nums,ds,ans,freq);
        return  ans;
    }



    public static void main(String[] args) {

        int arr[]={1,2,3};
        var dd=GetPermutate(arr);
        System.out.println(dd);
    }
}
