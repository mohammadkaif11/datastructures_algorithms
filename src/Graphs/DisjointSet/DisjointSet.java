package Graphs.DisjointSet;

public class DisjointSet {
    int arr[];

   public DisjointSet(int n){
        arr=new int[n];
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

    public  void union(int x,int y){
       int p_x=find(x);
       int p_y=find(y);
       if(p_y==p_x) return;

       arr[p_y]=p_x;
    }

}




