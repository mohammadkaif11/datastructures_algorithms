package Graphs.DetechCycle.Dfs;

import java.util.ArrayList;

public class DirectedGraph {


    private boolean checCycle(int node, int dfsViz[], int vis[], ArrayList<ArrayList<Integer>>  adj) {
        vis[node] = 1;
        dfsViz[node]=1;
        for(Integer it:adj.get(node)){
            if(vis[it]==0){
                if(checCycle(it,vis,dfsViz,adj)) return  true;
            } else if(dfsViz[it]==1){
                return  true;
            }
        }
        dfsViz[node]=0;
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V];
        int dfsVis[] =new int[V];
        for(int i = 0;i<V;i++) {
            if(vis[i] == 0) {
                if(checCycle(i, dfsVis, vis, adj) == true) return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
