package Graphs.DisjointSet.Question;

public class NumberofOperationstoMakeNetworkConnected {
    public  class  Disjoint{
        int par[];
        Disjoint(int n){
            par=new int[n];
            for(int i=0;i<n;i++){
                par[i]=i;
            }
        }

        int find(int x){
            if(x==par[x]){
                return x;
            }
            return find(par[x]);
        }

        void union(int x,int y){
            int x_p=find(x);
            int y_p=find(y);

            if(x_p==y_p) return;

            par[y_p]=x_p;
        }

    }

    public int makeConnected(int n, int[][] connections) {
        Disjoint ds=new Disjoint(n);
        int nrows=connections.length;

        int countExtra=0;
        for(int i=0;i<nrows;i++){
            if(ds.find(connections[i][0])==ds.find(connections[i][1])){
                countExtra++;
            }else{
                ds.union(connections[i][0],connections[i][1]);
            }
        }

        int countC=0;
        //Count components
        for(int i=0;i<n;i++){
            if(ds.par[i]==i){
                countC++;
            }
        }

        int ans=countC-1;
        if(countExtra>=ans){
            return ans;
        }
        return -1;

    }

    public static void main(String[] args) {

    }

}
