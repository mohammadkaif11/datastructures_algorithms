package Searching;

public class RotationCount {
    public static void main(String[] args) {
        int arr[]={15,18,3,4,6,12};
        System.out.println(rotationCount(arr,arr.length));
    }
    public  static   int rotationCount(int arr[], int size) {
       int l=0;
       int r=size-1;
       while (l<=r)
       {
           int mid=(l+r)/2;
           int next=(mid+1)%size;
           int prev=(mid-1+size)%size;
           if(arr[next]>arr[mid] && arr[prev]>arr[mid]){
               return  mid;
           }
           else{
               if(arr[mid]>arr[r]){
                   l=mid+1;
               }else{
                   r=mid-1;
               }
           }

       }
       return  0;
    }
}

