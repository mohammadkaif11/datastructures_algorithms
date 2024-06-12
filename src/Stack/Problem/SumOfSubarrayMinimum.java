package Stack.Problem;

import java.util.Stack;

public class SumOfSubarrayMinimum {


    //BruteForce
    public static int sumSubarrayMinsBF(int[] arr) {
        int sum=0;

        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        int Minum=0;
        for (int i=n-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(Minum==0){
                    if(arr[i]<arr[j]){
                        Minum=arr[i];
                    }else{
                        Minum=arr[j];
                    }
                }else{
                    if(arr[j]<Minum){
                        Minum=arr[j];
                    }
                }
                sum+=Minum;
            }
            Minum=0;
        }



        return sum;

    }

    public static int sumSubarrayMins(int[] arr) {
       int n=arr.length;
       int nextLess[]=new int[n];
       int prevLess[]=new int[n];
       Stack<Integer> stack =new Stack<Integer>();


       //NextLess and Prevless
        for(int i=0;i<n;i++){
            prevLess[i]=i;
            nextLess[i]=n-i-1;
        }


        //Calculating prevsmaller
        for(int i=0;i<n;i++){
            while (stack.isEmpty()==false && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                prevLess[i]=stack.peek();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()){
            stack.pop();
        }

        for(int i=n-1;i>=0;i--){
            while (stack.isEmpty()==false && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                nextLess[i]=stack.peek();
            }
            stack.push(i);
        }

        for(int i=0;i<n;i++){
            System.out.println("next smaller "+prevLess[i]);
        }

        int sum=0;

        for(int i=0;i<n;i++){
         sum+=(arr[i]*(prevLess[i]+1)*(nextLess[i]+1));
        }

        return  sum;
    }



    public static void main(String[] args) {
        int arr[] ={3,1,2,4};
       System.out.println(sumSubarrayMins(arr));
    }
}
