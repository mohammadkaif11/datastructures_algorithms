package Stack.Problem;

import java.util.Stack;

public class NextGreatherElement {


    //Not Circular Array
    public static  void  FindNextGreather(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<Integer>();
        int neq[]=new int[n];
        for(int i=n-1;i>=0;i--){
            if(st.empty()){
                neq[i]=-1;
                st.push(arr[i]);
            }else{
                while (st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.empty()){
                    neq[i]=-1;
                }else{
                    neq[i]=st.peek();
                }
                st.push(arr[i]);
            }
        }
    }

    //Circular Array
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack < Integer > st = new Stack < > ();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) nge[i] = st.peek();
                else nge[i] = -1;
            }

            st.push(nums[i % n]);
        }
        return nge;
    }


    public static void main(String[] args) {

    }
}
