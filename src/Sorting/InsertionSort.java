package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={3,1,2,3,6,7};
        InsertSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public  static  void InsertSort(int arr[])
    {
         int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

}
