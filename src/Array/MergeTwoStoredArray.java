package Array;

public class MergeTwoStoredArray {

    public  static  int [] Merge(int a[],int b[])
    {
        int resultl=a.length+b.length;
        int result[]=new int[resultl];
        int i=0;
        int j=0;
        int k=0;

        while (i<a.length && j< b.length){
            if(a[i]>b[i]){
                result[k]=a[i];
                k++;
                i++;
            }else{
                result[k]=b[j];
                k++;
                j++;
            }
        }

        if (j> b.length-1){
            while (i<a.length){
                result[k]=a[i];
                k++;
                i++;
            }
        }else if(i>a.length-1){
            while (j<b.length){
                result[k]=a[j];
                k++;
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
