package Searching;

import java.util.Arrays;

public class LinerSearch {
    public static void main(String[] args) {
        int arr[]={1, 2 ,4 ,4, 4, 4, 5, 8, 9, 1,2};
        Arrays.sort(arr);
        int k=BinarySearch(arr,0,arr.length,4);
        System.out.println(k);

    }
    public static   int BinarySearch(int arr[],int l,int r ,int k)
    {
        if(r>=l){
            int mid=l+(r-1)/2;
            if(arr[mid]==k){
                return  mid;
            }
            if(arr[mid]>k)
                return  BinarySearch(arr,l,mid-1,k);

            return  BinarySearch(arr,mid+1,r,k);
        }
        return -1;
    }

}
