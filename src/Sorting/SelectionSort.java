package Sorting;

public class SelectionSort {

    public  static  int  SelectionSorting(int arr[])
    {
        int count=0;
        int n=arr.length-1;

        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        int arr[]={5,3,3,1,6,7};
        System.out.println(SelectionSorting(arr));
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
