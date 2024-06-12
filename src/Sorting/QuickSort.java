package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={3,1,2,3,6,7};

       QuickSort(arr,0,5);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public  static  void QuickSort(int arr[],int start,int end)
    {
        if(start<end){
            int pivotPostion=Partion(arr,start,end);
            QuickSort(arr,start,pivotPostion-1);
            QuickSort(arr,pivotPostion+1,end);
        }
    }

    public  static int Partion(int arr[],int start ,int end)
    {
        int pivot=arr[start];
        int i=start;
        int j=end;
        while (i<j){
            while (arr[i]<=pivot) i++;
            while (arr[j]>pivot) j--;
            if(i<j){
                Swap(arr,i,j);
            }
        }

        Swap(arr,j,start);
     return j;
    }
    public  static  void Swap(int arr[],int i,int j)
    {
     int temp=arr[j];
     arr[j]=arr[i];
     arr[i]=temp;
    }

}
