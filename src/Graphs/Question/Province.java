package Graphs.Question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Province {
    // dfs traversal function
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs ,int vis[]) {
        vis[node] = 1;
        for(Integer it: adjLs.get(node)) {
            if(vis[it] == 0) {
                dfs(it, adjLs, vis);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i<V;i++) {
            adjLs.add(new ArrayList<Integer>());
        }

        // to change adjacency matrix to list
        for(int i = 0;i<V;i++) {
            for(int j = 0;j<V;j++) {
                // self nodes are not considered
                if(adj.get(i).get(j) == 1 && i != j) {
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        int vis[] = new int[V];
        int cnt = 0;
        for(int i = 0;i<V;i++) {
            if(vis[i] == 0) {
                cnt++;
                dfs(i, adjLs, vis);
            }
        }
        return cnt;
    }

    //Leet Code
    public  static void bfs(int s ,ArrayList<ArrayList<Integer>> Garph,boolean viz[]){
        Queue<Integer> queue=new LinkedList<>();
        viz[s]=true;
        queue.add(s);
        while (queue.size()!=0){
            int Node=queue.poll();
            ArrayList<Integer> adjNode=Garph.get(Node);
            for(int i=0;i<adjNode.size();i++){
                int  adj_node=adjNode.get(i);
                if(viz[adj_node]==false){
                    viz[adj_node]=true;
                    queue.add(adj_node);
                }
            }
        }
    }

    public static int findCircleNum(int[][] isConnected) {
        int m=isConnected.length;
        int n=isConnected[0].length;
        int v=m;

        boolean viz[]=new boolean[v];
        ArrayList<ArrayList<Integer>> Garph=new ArrayList<ArrayList<Integer>>(v);

        for(int i=0;i<v;i++){
            Garph.add(new ArrayList<Integer>());
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && isConnected[j][i]==1){
                    Garph.get(i).add(j);
                    Garph.get(j).add(i);
                }
            }
        }

        int count=0;
        for(int i=0;i<v;i++){
            if(viz[i]==false){
                count++;
                bfs(i,Garph,viz);
            }
        }

        return count;
    }
    public static void main(String[] args)
    {

        // adjacency matrix
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();

        adj.add(new ArrayList<Integer>());
        adj.get(0).add(0, 1);
        adj.get(0).add(1, 0);
        adj.get(0).add(2, 1);
        adj.add(new ArrayList<Integer>());
        adj.get(1).add(0, 0);
        adj.get(1).add(1, 1);
        adj.get(1).add(2, 0);
        adj.add(new ArrayList<Integer>());
        adj.get(2).add(0, 1);
        adj.get(2).add(1, 0);
        adj.get(2).add(2, 1);

        Province ob = new Province();
        System.out.println(ob.numProvinces(adj,3));

        int Graph[][]={{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(findCircleNum(Graph));
    }
};
