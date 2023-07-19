package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public  static int  Array(int arr[])
    {
        int count=0;
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
        }
        return  count;
    }
    public static void main(String[] args) {

        int arr[]={5,3,3,1,6,7};
        System.out.println(Array(arr));
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
