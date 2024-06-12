package Searching;

public class FirstOccurences {

    public static void main(String[] args) {
        int arr[]={1,2,2,2,24,43};
        System.out.println(search(arr,0,arr.length-1,2));

    }
    public  static  int search(int arr[],int l,int r,int k)
    {
        while (l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k){
                if(mid-1>=l && arr[mid-1]==k)
                {
                    r=mid-1;
                }else{
                    return  mid;
                }
            }
            else if(arr[mid]>k)
            {
                r=mid-1;
            }else{
                l=mid+1;

            }
        }
        return  -1;
    }
}
