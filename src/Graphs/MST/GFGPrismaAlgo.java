package Graphs.MST;

import java.util.List;
import java.util.PriorityQueue;

public class GFGPrismaAlgo {

    class Pair{
        int weight;
        int node;
        int parentNode;
        public Pair(int weight,int node,int parentNode){
            this.weight=weight;
            this.node=node;
            this.parentNode=parentNode;
        }
    }

    int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        int sum=0;
        int viz[]=new int[V];
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((x, y)->x.weight - y.weight);

        pq.add(new Pair(0,0,-1));
        while(!pq.isEmpty()){
            int n=pq.peek().node;
            int w=pq.peek().weight;
            int pn=pq.peek().parentNode;
            pq.remove();
            if(viz[n]==0){
                viz[n]=1;
                sum+=w;
                for(int i=0;i<adj.get(n).size();i++){
                    int en=adj.get(n).get(i)[0];
                    int ew=adj.get(n).get(i)[1];
                    if(viz[en]==0){
                        pq.add(new Pair(ew,en,n));
                    }
                }

            }
        }
        return sum;
    }
}
