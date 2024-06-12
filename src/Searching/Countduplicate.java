package Searching;


import java.util.Scanner;

//Find count of a number in a sorted list with duplicates
public class Countduplicate {
    public static void main(String[] args) {
        int arr[]={1 ,1, 1, 1 ,1 ,2 ,2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4 ,4};
        System.out.println("Found Running !!!");
        int a=First(arr,0,arr.length,2);
        int b=Last(arr,0,arr.length,2);

        System.out.println(a+" " +b);



    }
    public  static  int First(int arr[],int l,int r,int k)
    {
        while (l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k){
                if(mid-1>=l && arr[mid-1]==k){
                    r=mid-1;
                }
                else{
                    return  mid;
                }
            }
               else if(arr[mid]>k){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
        }

        return  0;
    }
    public  static  int Last(int arr[],int l,int r,int k)
    {
        if(arr.length==1){
            return  1;
        }
        while (l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k){
                if(mid+1<=r && arr[mid+1]==k){
                    l=mid+1;
                }
                else{
                    return  mid;
                }
            }else if(arr[mid]>k){
                    r=mid-1;
                }else{
                    l=mid+1;
                }

        }

        return  0;
    }

}
