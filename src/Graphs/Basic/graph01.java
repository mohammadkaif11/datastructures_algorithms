package Graphs.Basic;

public class graph01 {

    public  static  void AddVer(int node1,int node2,int arr[][]){
        arr[node1][node2]=1;
        arr[node2][node1]=1;
    }
    public static void main(String[] args) {
        //no of vertices
        int v=5;
        int arr[][]=new int[v+1][v+1];


    }
}
