package Graphs.DetechCycle.Dfs;

import java.util.ArrayList;

public class UndirectedGraph {

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V];
        for(int i = 0;i<V;i++) {
            if(vis[i] == 0) {
                if(dfs(i, -1, vis, adj) == true) return true;
            }
        }
        return false;
    }

    public boolean dfs(int node,int parent, int vis[],ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;

        for(int i=0;i<adj.get(node).size();i++){
            int adjacentNode=adj.get(node).get(i);
            if(vis[adjacentNode]==0){
                if(dfs(adjacentNode,node,vis,adj)) return true;
            } else if(adjacentNode != parent){
                return true;
            }
        }


        return false;
    }

}
