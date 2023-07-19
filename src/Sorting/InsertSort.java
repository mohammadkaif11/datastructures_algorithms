package Sorting;

public class InsertSort {
    public  static  int InsertSorting(int arr[])
    {
        int n=arr.length-1;
        int count=0;

        for(int j=1;j<n;j++){
            int rand=arr[j];
            int i=j-1;
            while(i>=0 && arr[i]>rand){
                    //right Shift of element
                    arr[i+1]=arr[i];
                    i--;

            }
            arr[i+1]=rand;
        }
        return  count;
    }
    public static void main(String[] args) {
        int arr[]={5,3,3,1,6,7};
        System.out.println(InsertSorting(arr));
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
