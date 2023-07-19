package String;

public class ReverseString {
    public  static  void  ReverseArray(char str[])
    {
        int n=str.length-1;
        for (int i=0;i<n/2;i++)
        {
            str[i]=str[n-i];
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
    }

    public static void main(String[] args) {
        char arr[]={'a','b','c'};
        ReverseArray(arr);
    }
}
