package Array;

import Sorting.BubbleSort;

import java.util.BitSet;

public class SellBuysStock {
    public static void stockBuySell(int[] price, int n) {
       int Buy=price[0];
       int BuyIndex=0;
       int SellIndex=0;
       int Sell=price[0];
       int flag=0;
        int Profit=0;
        Profit=Math.max(Profit,Sell-Buy);
       for(int i=1;i<n;i++){
           if(Buy==Sell && Buy > price[i]){
               Buy=price[i];
               BuyIndex=i;
               Sell=price[i];
               SellIndex=i;
           }

          else if (Sell<price[i]) {
              int profit=price[i]-Buy;
              if(profit>Profit){
                  Profit=Math.max(Profit,profit);
                  Sell=price[i];
                  SellIndex=i;
              }
           }else{
               if(Sell!=Buy){
                   System.out.print("("+ BuyIndex+" "+SellIndex+")");
                   Buy=price[i];
                   BuyIndex=i;
                   Sell=price[i];
                   SellIndex=i;
                   flag=1;
               }
           }
           if(i==n-1){
               if(Buy<Sell){
                   System.out.print("("+BuyIndex+" "+SellIndex+")");
                   flag=1;
               }
           }
       }

       if(flag==0){
           System.out.println("Not profit");
       }


    }

    public static  void StockBuySellArray(int[] price ,int n)
    {

        int LocalMin=0;
        int LocalMinIndex=0;

        for(int i=0;i<n;i++){
          if(LocalMin==0 || LocalMin>price[i]){
              LocalMin=price[i];
              LocalMinIndex=i;
          }
          else if(LocalMin < price[i]){
              int j=i;
              while (j<n-1 && price[j]>price[j+1]){
                 j++;
              }


          }
        }
    }

    public static void SingleStockBuy(int[] price, int n) {
      int maxProfit=0;
      int Buy=price[0];

      for(int i=1;i<n;i++)
      {
          Buy=Math.min(Buy,price[i]);
          int profit=price[i]-Buy;
          maxProfit=Math.max(maxProfit,profit);
      }

      System.out.println(maxProfit);
    }

    //for single stock
    public static void main(String[] args) {

        int arr[]={23,13,25,29,33,19,34,45,65,67};
        int arr3[]={100,180,260,310,40,535,636};

        int arr2[]={3,1,4,8,7,2,5};
             stockBuySell(arr3,arr3.length);
//       SingleStockBuy(arr,arr.length);
    }
}
