package Array;

public class Largest {
    public  static int largest(int arr[])
    {
        int n=arr.length;
        int Largest=arr[0];

        for(int i=0;i<n;i++)
        {
            if(arr[i]>Largest){
                Largest=arr[i];
            }
        }
        return  Largest;
    }

    public static void main(String[] args) {

        int arr[]={3,4,5,6};
        System.out.println(largest(arr));
    }
}
