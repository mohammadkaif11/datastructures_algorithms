package Stack.Problem;

import java.util.Stack;

public class MaximumAreaHistorgram {

    //Brute force
    static int largestarea(int arr[], int n) {
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                minHeight = Math.min(minHeight, arr[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }

    //Optimize
    public  static  int largestRectangleArea(int histogram[]){
        Stack<Integer> stack=new Stack<>();
        int n=histogram.length;
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];

        for(int i=0;i<n;i++){
            while (!stack.isEmpty() && histogram[stack.peek()] >= histogram[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                leftSmall[i]=0;
            }else {
                leftSmall[i]=stack.peek()+1;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()){
            stack.pop();
        }

        for(int i=n-1;i>=0;i--){
            while (!stack.isEmpty() && histogram[stack.peek()]>=histogram[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                rightSmall[i]=n-1;
            }else {
                rightSmall[i]=stack.peek()-1;
            }
            stack.push(i);
        }

        int maxA = 0;
        for (int i = 0; i < n; i++) {
            maxA = Math.max(maxA, histogram[i] * (rightSmall[i] - leftSmall[i] + 1));
        }
        return maxA;

    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        System.out.println("The largest area in the histogram is " + largestRectangleArea(arr));

    }
}
