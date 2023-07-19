package Graphs;

import java.util.ArrayList;

public class graph02 {

      static  void
      AddEdge(ArrayList<ArrayList<Integer>> adj,int node1,int node2){
        adj.get(node1).add(node2);
        adj.get(node2).add(node1);
    }

    static void
    printGraph(ArrayList<ArrayList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);

        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }


    }
}
