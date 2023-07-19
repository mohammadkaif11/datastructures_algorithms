package Recursions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {

    public  static  void findSubsetrec(int index,int nums[],List<List<Integer>> ans,List<Integer> ds)
    {
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<nums.length;i++){
            if(i!=index && nums[i]==nums[i-1]) continue;
                ds.add(nums[i]);
                findSubsetrec(i + 1, nums, ans, ds);
                ds.remove(ds.size() - 1);
        }
    }

    //find subset without duplicate
    public static List<List<Integer>> findSubset(int nums[]){
           Arrays.sort(nums);
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        findSubsetrec(0,nums,ans,ds);

        return  ans;
    }

    public static void main(String[] args) {
      int arr[]={1,2,2};
      System.out.println(findSubset(arr));

    }
}
