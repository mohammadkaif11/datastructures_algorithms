package Sorting;

public class MergeSort {

    public  static  void MergingSorting(int arr[],int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            MergingSorting(arr,start,mid);
            MergingSorting(arr,mid+1,end);
            Merge(arr,start,end,mid);
        }
    }
    public  static void Merge(int arr[],int startIndex,int  endIndex,int Mid)
    {
        int length=arr.length;
        int resul[] =new int[length];
        int i=startIndex;
        int j=Mid+1;
        int k=startIndex;
        while (i<=Mid && j<=endIndex)
        {
            if(arr[i]<arr[j])
            {
                resul[k]=arr[i];
                i++;
            }else{
                resul[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i>Mid){
            while (j<=endIndex){
                resul[k]=arr[j];
                k++;
                j++;
            }
        }else {
            while (i<=Mid){
                resul[k]=arr[i];
                k++;
                i++;
            }
        }
        for(k=startIndex;k<=endIndex;k++)
        {
            arr[k]=resul[k];
        }
    }

    public static void main(String[] args) {
        int arr[]={5,3,3,1,6,7};
        MergingSorting(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }

}
