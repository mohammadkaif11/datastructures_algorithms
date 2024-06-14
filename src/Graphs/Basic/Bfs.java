package Graphs.Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    static void Bfs(ArrayList<ArrayList<Integer>> adj,int v,int s){
        Queue<Integer> queue=new LinkedList<>();
        boolean viz[]=new boolean[v];
        viz[s]=true;
        queue.add(s);
        while (queue.size()!=0){
            int node=queue.poll();
            // Use the Node
            ArrayList<Integer> adjacentNode=adj.get(node);
            for(int i=0;i<adjacentNode.size();i++){
                int  adj_node=adjacentNode.get(i);
                if(viz[adj_node]==false){
                    viz[adj_node]=true;
                    queue.add(adj_node);
                }
            }
        }
    }

    static  void
    AddEdge(ArrayList<ArrayList<Integer>> adj,int node1,int node2){
        adj.get(node1).add(node2);
        adj.get(node2).add(node1);
    }

    public static void main(String[] args) {
        int v=4;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);

        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }

        AddEdge(adj,0,1);
        AddEdge(adj,0,2);
        AddEdge(adj,1,2);
        AddEdge(adj,2,0);
        AddEdge(adj,2,3);
        AddEdge(adj,3,3);
        Bfs(adj,4,2);


    }
}
