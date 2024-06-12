package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={3,1,2,3,6,7};
        int k=Search(arr,6,1);
        System.out.println(k);

    }

    //LinerSearch
    public static  int Search(int arr[],int N,int x)
    {

        for(int i=0;i<N;i++)
        {
            if(arr[i]==x)
                return i;
        }
        return  -1;
    }

    //BinarySearch
    public static  int BinarySearch(int arr[],int x)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                start = mid + 1;

                // If x is smaller, ignore right half
            else
                end = mid - 1;

        }

        return -1;

    }
}
