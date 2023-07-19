package Array;

import java.util.*;

public class DistnictUnionofTwoSorted {

    public  static  void Union(int a[],int b[])
    {
        int resultl=a.length+b.length;
        int result[]=new int[resultl];
        int i=0;
        int j=0;
        int k=0;

        while (i<a.length && j< b.length){
            if(a[i]<b[j]){
                if(k>0){
                    if(result[k-1]<a[i]){
                        result[k]=a[i];
                        k++;
                        i++;
                    }else{
                        i++;
                    }
                }else{
                    result[k]=a[i];
                    k++;
                    i++;
                }
            }else{
                if(k>0){
                    if(result[k-1]<b[j]){
                        result[k]=b[j];
                        k++;
                        j++;
                    }else{
                        j++;
                    }
                }else{
                    result[k]=b[j];
                    k++;
                    j++;
                }
            }
        }

        if (j> b.length-1){
            while (i<a.length){
                if(k>0){
                    if(result[k-1]<a[i]){
                        result[k]=a[i];
                        k++;
                    }
                }else{
                    result[k]=a[i];
                    k++;
                }
                i++;
            }
        }else if(i>a.length-1){
            while (j<b.length){
                if(k>0){
                    if(result[k-1]<b[j]){
                        result[k]=b[j];
                        k++;
                    }
                }else{
                    result[k]=b[j];
                    k++;
                }
                j++;
            }
        }


       for(int l=0;l<result.length;l++){
           System.out.println(result[l]);
       }
    }



    //Brute force approach using set
    public  static  void UnionBrute(int a[],int b[])
    {
        SortedSet<Integer> temp=new TreeSet<>();
        ArrayList<Integer> result=new ArrayList<Integer>();

        for(int i=0;i<a.length;i++){
            temp.add(a[i]);
        }
        for(int i=0;i<b.length;i++) {
            temp.add(b[i]);
        }

      for(Integer it:temp){
          result.add(it);
      }

    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[]={2,2,3,5};

        Union(arr,arr2);
    }
}
