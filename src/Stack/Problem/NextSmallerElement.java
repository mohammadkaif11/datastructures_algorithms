package Stack.Problem;

import java.util.Stack;

public class NextSmallerElement {

    public static  void  FindNextSmaller(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<Integer>();
        int neq[]=new int[n];
        for(int i=n-1;i>=0;i--){
            if(st.empty()){
                neq[i]=0;
                st.push(arr[i]);
            }else{
                Stack<Integer> tempStack=new Stack<Integer>();
                while (st.peek()>=arr[i]){
                    tempStack.push(st.peek());
                    tempStack.pop();
                }
                if(st.empty()){
                    neq[i]=0;
                }else{
                    neq[i]=st.size();
                }
                st.push(arr[i]);
            }
        }
    }

    public static void main(String[] args) {

    }
}
