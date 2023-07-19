package Array;

import java.util.ArrayList;

public class MissingNumber {

    //buurte
    public static  ArrayList<Integer> FindMissing(int arr[],int n){
        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        for(int i=1;i<=n;i++){
            int flag=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==i) {
                    flag = 1;
                }
            }
            if(flag==0){
                arrayList.add(i);
            }
        }
        return  arrayList;
    }

    //better
    public  static  ArrayList<Integer> findMissingUsingHashing(int arr[],int n)
    {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        int hash[]=new int[n+1];
        for(int j=0;j<arr.length;j++)
        {
            hash[arr[j]]=1;
        }

        for(int i=1;i<hash.length;i++){
            if(hash[i]!=1){
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    //Xor and sumApproach
    public static int findMissingXor(int []arr,int n){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<arr.length;i++)
        {
            xor1=xor1^i+1;
            xor2=xor2^arr[i];
        }
        xor1=xor1^n;

        return  xor1^xor2;
    }


    public static void main(String[] args)
    {

         int arr[]={1,2,4,5};

        System.out.println(findMissingXor(arr,5));
    }
}
