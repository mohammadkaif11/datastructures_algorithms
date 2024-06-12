package Array;

public class Array {
     public  static  void PrintSpirally(int arr[][],int r,int c) {
         int top = 0;
         int down = r - 1;
         int left = 0;
         int right = c - 1;
         int Dir = 1;
         while (top <= down && left <= right) {
             if (Dir == 1) {
                 for (int i = left; i <= right; i++) {
                     System.out.println(arr[top][i]);
                 }
                 top++;
             }
            else if (Dir == 2) {
                 for (int i = top; i <= down; i++) {
                     System.out.println(arr[i][right]);
                 }
                 right--;
             }
           else   if (Dir == 3) {
                 for (int i = right; i >= left; i--) {
                     System.out.println(arr[down][i]);
                 }
                 down--;
             }
           else if (Dir == 4) {
                 for (int i = down; i >= top; i--) {
                     System.out.println(arr[i][left]);
                 }
                 left++;
             }
             //For maintaining the directon
             Dir = (Dir + 1) % 4;
         }
     }
    public static void main(String[] args) {
         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
         PrintSpirally(arr,3,3);
    }

}
