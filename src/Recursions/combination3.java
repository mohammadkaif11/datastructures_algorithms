package Recursions;

import java.util.ArrayList;
import java.util.List;

public class combination3 {
    public  static  void CombinationRecursion(int index, int nums[], int target, List<List<Integer>> ans , List<Integer> ds)
    {
            if(target==0){
                ans.add(new ArrayList<>(ds));
                return;
            }

            for(int i=index;i<nums.length;i++){
                if(i>index && nums[i]==nums[i-1]) continue;
                if(nums[i]>target) break;
                ds.add(nums[i]);
                CombinationRecursion(index+1,nums,target-nums[i],ans,ds);
                ds.remove(ds.size()-1);
            }
    }

    //combination sum without duplicate with optimal
    public  static  List<List<Integer>> Combination(int nums[],int traget){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        CombinationRecursion(0,nums,traget,ans,ds);
        return ans;
    }


    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        System.out.println(Combination(arr,7));
    }
}
