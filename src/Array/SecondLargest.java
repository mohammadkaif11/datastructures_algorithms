package Array;

public class SecondLargest {


    //better apprach
    public  static int Secondlargest(int arr[])
    {
        int n=arr.length;
        int Largest=arr[0];

        for(int i=0;i<n;i++)
        {
            if(arr[i]>Largest){
                Largest=arr[i];
            }
        }
        int SecondLargest=-1;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>SecondLargest && arr[i]<Largest){
                SecondLargest=arr[i];
            }
        }
        return  SecondLargest;
    }

    //optimal
    public  static int SecondlargestOptimal(int arr[])
    {
        int n=arr.length;
        int Largest=arr[0];
        int secondLargest=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>Largest){
                secondLargest=Largest;
                Largest=arr[i];
            } else if (arr[i]<Largest && arr[i]>secondLargest ){
                secondLargest=arr[i];
            }
        }

        return  secondLargest;
    }

    public static void main(String[] args) {
        int arr[]={3,4,5,6};
        System.out.println(SecondlargestOptimal(arr));
    }
}
