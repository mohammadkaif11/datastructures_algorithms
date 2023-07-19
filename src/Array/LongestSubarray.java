package Array;

public class LongestSubarray {

    //brute force
    public  static  int find(int arr[],int n,int value)
    {
        int len=Integer.MIN_VALUE;

//         for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                int sum=0;
//                for(int k=i;k<j;k++) sum+=arr[k];
//                if(sum==value){
//                    System.out.println("J "+j+ " I "+i);
//                    System.out.println("Sum "+sum);
//                    len=Math.max(len,j-1-i+1);
//                }
//            }
//        }

        //better approach
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum==value){
                    len=Math.max(len,j-i+1);
                }
            }

        }

        return len;
    }

    //zero negative with prefix sum and hashing
    public  static  int findBetter(int arr[],int n,int value)
    {
        int len=Integer.MIN_VALUE;

//        int len=0;
//        map <int,int> hMap;
//        int sum=0;
//
//        for(int i=0;i<N;i++){
//            sum=sum+A[i];
//            if(sum==K){
//                len=max(len,i+1);
//            }
//            int rem=sum-K;
//            if(hMap.find(rem)!=hMap.end()){
//                int length=i-hMap[rem];
//                len=max(len,length);
//            }
//            if(hMap.find(sum)==hMap.end()){
//                hMap[sum]=i;
//            }
//        }


        return len;
    }

    //postive and zeros only optimal two pointer approach
    public static  int findOptmial(int arr[],int n,int value){
        int left=0;
        int right=0;
        int len=0;

        int sum=0;
        while (right<n){
            sum+=arr[right];
            while (left<=right && sum>value){
                sum-=arr[left];
                left++;
            }
            if(sum==value){
                len=Math.max(len,right-left+1);
            }
            right++;
        }

        return  len;
    }


    public static void main(String[] args) {

        int arr[]={1,2,3,1,1,1,1,2,4,8};
        System.out.println(findOptmial(arr,arr.length,4));
    }
}
