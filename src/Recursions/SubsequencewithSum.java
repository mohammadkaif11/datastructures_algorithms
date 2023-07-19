package Recursions;

import java.util.ArrayList;
import java.util.List;

public class SubsequencewithSum {

    public static  void GenrateSubsequence(int arr[], int i, List<Integer> temp,int sum,int k){
        if(i>=arr.length){
            if(sum==k){
                System.out.println(temp);
            }
            return;
        }
        temp.add(arr[i]);
        sum=sum+arr[i];
        GenrateSubsequence(arr,i+1,temp,sum,k);
        sum=sum-arr[i];
        temp.remove(temp.size()-1);
        GenrateSubsequence(arr,i+1,temp,sum,k);
    }

    //Genrate number of subsequences
    public static  int GenrateSubsequence(int arr[], int i,int sum,int k){
        if(i>=arr.length){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        sum=sum+arr[i];
       int l=  GenrateSubsequence(arr,i+1,sum,k);
        sum=sum-arr[i];
       int r= GenrateSubsequence(arr,i+1,sum,k);
       return l+r;
    }


    public static void main(String[] args) {
        int arr[]={1,2,1};
        List<Integer> temp=new ArrayList<>();
        GenrateSubsequence(arr,0,temp,0,2);
        System.out.println( GenrateSubsequence(arr,0,0,2));
    }
}
