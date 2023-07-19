package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class RatMaze {



    public static  void SloveRecur(int i,int j,int arr[][],int n,List<String> ans,String temp,int vis[][]){
        //base case
        if(i==n-1 && j==n-1){
            ans.add(temp);
        }

        //DownWard
        if(i+1<n && vis[i+1][j]!=1 && arr[i+1][j]==1){
            vis[i+1][j]=1;
            SloveRecur(i+1,j,arr,n,ans,temp+"D",vis);
            vis[i+1][j]=0;
        }

        //left
        if(j-1>=0 && vis[i][j-1]!=1 && arr[i][j-1]==1){
            vis[i][j-1]=1;
            SloveRecur(i,j-1,arr,n,ans,temp+"L",vis);
            vis[i][j-1]=0;
        }

        //right
        if(j+1<n && vis[i][j+1]!=1 && arr[i][j+1]==1){
            vis[i][j+1]=1;
            SloveRecur(i,j+1,arr,n,ans,temp+"R",vis);
            vis[i][j+1]=0;
        }

        //upward
        if(i-1>=0 && vis[i-1][j]!=1 && arr[i-1][j]==1){
            vis[i-1][j]=1;
            SloveRecur(i-1,j,arr,n,ans,temp+"U",vis);
            vis[i-1][j]=0;
        }
    }

    public static List<String> Slove(int arr[][],int n){
        int vis[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;
            }
        }

        List<String> ans=new ArrayList<>();
        SloveRecur(0,0,arr,n,ans,"",vis);
        return  ans;
    }


    public static void main(String[] args) {
        int n = 4;
        int[][] a = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        System.out.println(Slove(a,n));
    }
}
