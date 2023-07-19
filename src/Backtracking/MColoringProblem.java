package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class MColoringProblem {

    //check adjacent element color
    public  static  boolean isSafe(int node, List<Integer> graph[],int color[],int n,int col ){
        for (int it: graph[node]) {
            if (color[it] == col) return false;
        }
        return true;
    }
    public  static  boolean garphColoring(List<Integer> graph[],int color[],int i,int M){
        //find no of node
        int n=graph.length;
        if(color(0,graph,color,n,M)==true) return  true;
        return false;
    }

    public  static boolean color(int node,List<Integer> garph[],int color[],int n,int m){
        if(node==n){
            return  true;
        }
        for(int i=1;i<=m;i++){
            if(isSafe(node,garph,color,n,i)==true){
             color[node]=i;
             if(color(node+1,garph,color,n,m)==true) return  true;
             color[node]=0;
            }
        }
        return  false;
    }


    //TC-nXM
    //sc-NxN

    public static void main(String[] args) {
        int N = 4, M = 3;
        List < Integer > [] G = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList < > ();
        }
        G[0].add(1);
        G[1].add(0);
        G[1].add(2);
        G[2].add(1);
        G[2].add(3);
        G[3].add(2);
        G[3].add(0);
        G[0].add(3);
        G[0].add(2);
        G[2].add(0);
        //color array
        int[] color = new int[N];
        boolean ans = garphColoring(G, color, 0, M);
        if (ans == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
