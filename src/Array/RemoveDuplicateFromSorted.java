package Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSorted {

    //Remove Duplicate
    public  static  void RemoveDuplicate(int arr[])
    {
        int n=arr.length;
        int[] result=new int[n];
        int j=0;
        result[j++]=arr[0];
        int firstElement=arr[0];

        for (int i=1;i<n;i++){
            if(arr[i]>firstElement){
                result[j]=arr[i];
                firstElement=arr[i];
                j++;
            }
        }

        for(int k=0;k<j;k++)
        {
            System.out.println(result[k]);
        }

    }

    //Remove Duplicate with set
    public  static  void RemoveDuplicateWithSet(int arr[]){
        Set<Integer> set=new HashSet<Integer>() ;
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for (int Value:set){
            System.out.println(Value);
        }
    }


    //Remove Duplicate without extra place using two pointer approach

    public static void main(String[] args) {
     int arr[]={5,6,6,8,8,9,9,9};
     RemoveDuplicate(arr);
     RemoveDuplicateWithSet(arr);
    }
}
