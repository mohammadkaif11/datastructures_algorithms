package Array;

import java.util.HashMap;

public class LongestsubArraySum {


    //-ve /+ve
    public  static  int Maxsumarray(int arr[],int k){

        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int length=0;
        int prefixSum=0;
        for (int i=0;i<length;i++){
            prefixSum+=arr[i];
            if(prefixSum==k){
                length=Math.max(length,i+1);
            }
            int diff=prefixSum-k;
            if(map.containsKey(diff)){
                length=Math.max(length,i-map.get(diff));
            }
            if(!map.containsKey(diff)){
                map.put(prefixSum,i);
            }
        }


        return length;
    }


    //+ve
    public  static  int MaxsumarrayWitPointer(int arr[],int k){
        int l=0;
        int r=0;
        int length=0;
        int sum=arr[0];
        while (r<arr.length){
            while (l<=r && sum>k){
                sum-=arr[l];
                l++;
            }
            if(sum==k){
                length=Math.max(length,r-l+1);
            }
           r++;
           if(r<arr.length)  sum+=arr[r];
        }

        return  length;
    }



    public static void main(String[] args) {

    }
}
