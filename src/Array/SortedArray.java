package Array;

public class SortedArray {

    public static boolean IsSorted(int ar[])
    {
      for(int i=1;i<ar.length-1;i++){
          if(ar[i-1]>ar[i]){
               return  false;
          }
      }

      return true;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6};
        System.out.println(IsSorted(arr));
    }


}
