package Graphs.kruskalsAlgo.GFG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Edge implements Comparable<Edge> {
    int src;
    int dist;
    int wt;

    public Edge(int src,int dist,int wt){
        this.src=src;
        this.dist=dist;
        this.wt=wt;
    }

    public int compareTo(Edge compareEdges){
        return this.wt-compareEdges.wt;
    }
}
class DisjointSet{
    int arr[];

    public DisjointSet(int n){
        arr=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=i;
        }
    }

    public  int find(int x){
        if(arr[x]==x){
            return  x;
        }
        return  find(arr[x]);
    }

    public   void union(int x,int y){
        int p_x=find(x);
        int p_y=find(y);
        if(p_y==p_x) return;

        arr[p_y]=p_x;
    }

}
public class Algo {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        int sum=0;
        List<Edge> el=new ArrayList<Edge>();

        for(int i=0;i<V;i++){
            for(int j=0;j<adj.get(i).size();j++){
                int adjnode=adj.get(i).get(j)[0];
                int adjWt=adj.get(i).get(j)[1];
                int node=i;
                el.add(new Edge(node,adjnode,adjWt));
            }
        }

        DisjointSet ds=new DisjointSet(V);
        Collections.sort(el);

        for(int i=0;i<el.size();i++){
            int wt=el.get(i).wt;
            int u=el.get(i).src;
            int v=el.get(i).dist;

            if(ds.find(u)!=ds.find(v)){
                sum+=wt;
                ds.union(u,v);
            }

        }

        return sum;
    }

}
