package Recursions;

import java.util.ArrayList;
import java.util.List;

public class PermuationStringOP {

    public  static  void recuPermuate(int index,int nums[], List<List<Integer>> ans)
    {
        if(index==nums.length){
            List<Integer> list=new ArrayList<>();

            for (int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
            ans.add(list);
            return;
        }

       for(int i=index;i<nums.length;i++){
           swaps(index,i,nums);
           recuPermuate(index+1,nums,ans);
           swaps(index,i,nums);
       }
    }

    public  static  void swaps(int i,int j,int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public  static  List<List<Integer>> Permuate(int nums[]){
        List<List<Integer>> ans=new ArrayList<>();
        recuPermuate(0,nums,ans);
        return  ans;
    }


    public static void main(String[] args) {

        int arr[]={0,1};
        var dd=Permuate(arr);
        System.out.println(dd);
    }

}
