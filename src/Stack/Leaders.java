package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Leaders {

    //Variant 1
    ArrayList<Integer> leaders(int arr[], int n){
         ArrayList<Integer> result=new ArrayList<Integer>();
         Stack<Integer> st=new Stack<Integer>();
         for (int i=n-1;i>=0;i--)
         {
             if(st.empty()){
                 result.add(i,-1);
                 st.push(arr[i]);
             }else{
                 int temp=st.peek();
                 if(temp>arr[i]){
                     result.add(i,temp);
                     st.push(arr[i]);
                 }else{
                     while(!st.empty() && st.peek()<arr[i])
                     {
                         st.pop();
                     }
                     if(st.empty()){
                         result.add(i,-1);
                         st.push(arr[i]);
                     }else{
                         result.add(i,st.peek());
                     }
                 }
             }
        }

        return  result;
    }

    //Variant 2
   public static ArrayList<Integer> Circularleaders(int arr[], int n){
        ArrayList<Integer> result=new ArrayList<Integer>();
        Stack<Integer> st=new Stack<Integer>();


        ///-> 5 6 1 3 6 | 5 6 1 3 6 ////
        for (int i=2*n-1;i>=0;i--)
        {
            while (st.isEmpty() == false && st.peek() <= arr[i % n]) {
                st.pop();
            }
           if(i<n){
               if (st.isEmpty() == false) result.add(i,st.peek());
               else result.add(i,-1);

           }
            st.push(arr[i%n]);
        }


        return  result;
    }


    //variant 3
    public static  void Single(int arr[], int n){
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> al=new ArrayList<>();

        int maxright=arr[n-1];
        st.push(maxright);
        for(int i=n-2;i>=0;i--){
            if(maxright<arr[i]){
                maxright=arr[i];
                st.push(maxright);
            }
        }

        while (!st.empty()){
            int data=st.peek();
            st.pop();
            al.add(data);
        }

        //return ar;
    }
    public static void main(String[] args) {

        int []input={16,17,4,3,5,2};
//        int[] res=Single(input,input.length);
//
//        for(int i=0;i<res.length;i++)
//        {
//            System.out.println(res[i]);
//        }
        Single(input,input.length);
    }
}


