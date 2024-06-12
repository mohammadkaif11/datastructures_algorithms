package Sorting;

import java.util.Arrays;

public class MaximumToy{
    public static void main(String[] args) {
      int arr[]={10,4,1,17,5};
      System.out.println(BuyMaximum(arr,arr.length,10));

    }
    public  static  int BuyMaximum(int arr[],int n,int r){
        int remainingAmount=r;
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]>remainingAmount){
                break;
            }else{
                remainingAmount= remainingAmount-arr[i];
                count++;
            }
        }
    return  count;
    }

}
