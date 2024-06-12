package DynamicProgramming.Figures;


import java.util.Stack;

//base of Maximum area of histogram
public class MaximumAreaofReactangle {

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

    public  static  int findArea(int mat[][]){
        int max=0;
        int n=mat.length;
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    arr[j]=arr[j]+1;
                }else{
                    arr[j]=0;
                }
            }
            int MaxArrea=largestRectangleArea(arr);
            max=Math.max(MaxArrea,max);
        }

        return max;

    }


    public static void main(String[] args) {
         int[][] exampleVariableOne = new int[10][5];
        // returns the length of the rows in the array
        int lengthOne = exampleVariableOne.length;
        // returns the length of the columns in the array
        int lengthTwo = exampleVariableOne[0].length;

        System.out.println(lengthOne);
        System.out.println(lengthTwo);

    }
}
