package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestConsectiveSubsequence {

    public  static  int findLength(int arr[])
    {
        int length=0;
        int count=1;
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }


        for(int i=0;i<arr.length;i++)
        {
            int start=arr[i];
            while (hs.contains(start-1)){
                start=start-1;
            }
            while (hs.contains(start+1)){
                count++;
                start=start+1;
            }
            length=Math.max(length,count);
            count=1;
        }

        return  length;
    }


    //Using sort techinque tc---n*log(n)
    public  static  int findLengthUsingSort(int arr[]) {


        int length = 0;
        Arrays.sort(arr);

        int first = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i]-1) == first ) {
                count++;
                first = arr[i];
            } else {
                if (arr[i] == first) {
                    continue;
                } else {
                    first = arr[i];
                    length = Math.max(length, count);
                    count = 1;
                }


            }

        }
        return length;

    }


    public static void main(String[] args) {
        int arr[]=new int[]{10,11,12,12,12,13,20,21,100,101};
        int arr2[]=new int[]{10,11,12,13,14,15,16};

        System.out.println(findLength(arr2));
    }
}
