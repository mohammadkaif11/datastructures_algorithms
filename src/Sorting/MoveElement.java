package Sorting;

public class MoveElement {
    public static void main(String[] args) {

    }
    public  static void Move(int arr[],int n)
    {
     int i=0;
     for (int j=0;j<n;j++)
     {
         if(arr[j]>=0){
             int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              i++;
         }
     }
    }

}
