package Stack.Problem;

public class TrappingRainwater {
    public int trap(int[] height) {
        int l=0;
        int n=height.length;
        int r=n-1;
        int res=0;
        int leftMax=0;
        int rightMax=0;
        while (l<=r){
            if(height[l]<=height[r]){
                if(height[l]>=leftMax){
                    leftMax=height[l];
                }else{
                    res+=leftMax-height[l];
                }
                l++;
            }else{
                if(height[r]>=rightMax){
                    rightMax=height[r];
                }else{
                    res+=rightMax-height[r];
                }
                r--;
            }
        }

        return  res;

    }

    public static void main(String[] args) {

    }
}
