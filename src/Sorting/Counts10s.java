package Sorting;

//Sorted Counts ....
public class Counts10s {
    public static void main(String[] args) {

    }
    public  void Sort(int arr[],int n)
    {
        int count0=0;
        int count1=0;
        int count2=0;
        for (int i=0;i<n;i++){
            if(arr[i]==0){
                count0++;
            } else if (arr[i]==1) {
                count1++;
            } else if (arr[i]==2) {
                count2++;
            }
        }

    }

    public  void SortMethod2(int arr[],int n){
        int i=0;
        int j=0;
        int k=n-1;
        while (j<=k){
            if(arr[j]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
          else   if(arr[j]==1)
            {
                j++;
            }
            if(arr[j]==2)
            {
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                k--;
            }
        }
    }

}
