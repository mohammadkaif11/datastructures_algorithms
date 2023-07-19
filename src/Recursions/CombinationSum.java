package Recursions;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {


    //CombinationSum
    public  static  void CombinationRecursion(int index,int nums[],int target,List<List<Integer>> ans ,List<Integer> ds)
    {
        if(index==nums.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(nums[index]<=target){
            ds.add(nums[index]);
            CombinationRecursion(index,nums,target-nums[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        CombinationRecursion(index+1,nums,target,ans,ds);
    }

    public  static  List<List<Integer>> Combination(int nums[],int traget){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();

        //use Hashset due we did not want duplicate  subset;
        CombinationRecursion(0,nums,traget,ans,ds);
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        System.out.println(Combination(arr,7));
    }
}
