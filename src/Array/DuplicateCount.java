package Array;

public class DuplicateCount {

    public  static  int Count(int arr[],int n,int k)
    {
        int l=0;
        int r=n-1;
        int count=0;

        while (l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==k){
                count++;
                int center=mid-1;
                if(center>=l && arr[center]==k){
                    while (center>=l && arr[center]==k)
                    {
                        count++;
                        center--;
                    }
                }

                center=mid+1;
                if(center<=r && arr[center]==k)
                {
                    while (center<=r && arr[center]==k)
                    {
                        count++;
                        center++;
                    }
                }
                break;
            }
            else{
                if(arr[mid]>k) {
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }

        System.out.println(count);
        return  0;
    }

    public static void main(String[] args) {
      int arr[]={1,2,2,2,3,3,3,3,3};
      int n=arr.length;
      int k=3;
      Count(arr,n,k);
    }
}
