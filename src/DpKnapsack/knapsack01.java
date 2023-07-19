package DpKnapsack;

public class knapsack01 {

    static int max(int a, int b) { return (a > b) ? a : b; }

    //Recursive Knapsack
    public  static int knapSack(int wt[],int value[],int weight,int n){
        if(n==0 || weight==0){
            return  0;
        }
        if(wt[n-1]>weight){
            return  knapSack(wt,value,weight,n-1);
        }
        else {
            return  max(value[n-1]+knapSack(wt,value,weight-wt[n-1],n-1),knapSack(wt,value,weight,n-1));
        }
    }



    public static void main(String[] args) {

        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapSack(weight,profit,W,n));
    }
}
