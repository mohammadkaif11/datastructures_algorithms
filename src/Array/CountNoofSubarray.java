package Array;

import java.util.HashMap;
import java.util.Map;

public class CountNoofSubarray {

    static int findSubArraySum(int Arr[], int N, int k)
    {
        int prefixSum=0;
        int count=0;
        Map<Integer, Integer> hm   = new HashMap<Integer, Integer>();
        hm.put(0,1);

        for(int i=0;i<N;i++){
            prefixSum+=Arr[i];
            int Diff=prefixSum-k;
            if(hm.containsKey(Diff)){
                int noOfCount=hm.get(Diff);
                count+=noOfCount;
            }
            if(hm.containsKey(prefixSum)){
                hm.put(prefixSum,hm.get(prefixSum)+1);
            }else{
                hm.put(prefixSum,1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[]={9, 4, 20, 3, 10, 5};
        System.out.println(findSubArraySum(arr,arr.length,33));
    }
}
