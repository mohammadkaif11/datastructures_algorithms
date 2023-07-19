package DynamicProgramming;

public class RepeatedSubarray {

    public static int findLength(int[] nums1, int[] nums2,int n) {
        if(n<0){
            return  0;
        }
        int take=Integer.MIN_VALUE;
        int notTake=Integer.MIN_VALUE;
        if(nums1[n]==nums2[n]){
            take=findLength(nums1,nums2,n-1)+1;
        }else{
            notTake=findLength(nums1,nums2,n-1);
        }

        return  Math.max(take,notTake);
    }

    public static void main(String[] args) {
      int arr1[] ={1,2,3,2,1};
      int arr2[]={3,2,1,4,7};
      System.out.println(findLength(arr1,arr2,4));
    }
}
