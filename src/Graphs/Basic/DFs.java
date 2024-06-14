package Graphs.Basic;

import java.util.ArrayList;

public class DFs {

    static  void
    AddEdge(ArrayList<ArrayList<Integer>> adj, int node1, int node2){
        adj.get(node1).add(node2);
        adj.get(node2).add(node1);
    }

    static  void

    Dfs(ArrayList<ArrayList<Integer>> adj,boolean viz[],int start){
        viz[start]=true;
        ArrayList<Integer> adjNode=adj.get(start);
        for(int i=0;i<adjNode.size();i++){
            int node=adjNode.get(i);
            if(viz[node]==false) {
                Dfs(adj,viz,node);
            }
        }
    }

    public static void main(String[] args) {
        int v=4;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
        boolean viz[]=new boolean[v];

        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }

        AddEdge(adj,0,1);
        AddEdge(adj,0,2);
        AddEdge(adj,1,2);
        AddEdge(adj,2,0);
        AddEdge(adj,2,3);
        AddEdge(adj,3,3);
        Dfs(adj,viz,2);
    }
}
