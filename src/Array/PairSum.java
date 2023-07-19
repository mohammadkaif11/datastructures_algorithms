package Array;

import java.util.HashMap;

public class PairSum {


    //with space
    int getCount(int arr[],int n,int k){
        HashMap<Integer,Integer> hmp=new HashMap<>();
        int ans=0;
        for(int i=0;i<n;i++){
            int value=k-arr[i];
            if(hmp.containsValue(value)){
                ans++;
            }
            hmp.put(arr[i],i);
        }


        return  ans;
    }

    //two pointer approach
    int getCountDiff(int arr[],int n,int k){
        k=Math.abs(k);
        int ans=0;
        int l=0;
        int r=1;
        while (r<n)
        {
            if(l==r){
                r++;
            }
            if(arr[r]-arr[l]==k){
                ans++;
            }else{
                if(arr[r]-arr[l]<k){
                  r++;
                }else{
                    l++;
                }
            }
        }

        return  ans;
    }

    public static void main(String[] args) {

    }
}
