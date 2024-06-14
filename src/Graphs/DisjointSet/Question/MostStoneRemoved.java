package Graphs.DisjointSet.Question;

import java.util.HashMap;
import java.util.Map;

public  class MostStoneRemoved {
        public  class  Disjoint{
            int par[];
            Disjoint(int n){
                par=new int[n+1];
                for(int i=0;i<=n;i++){
                    par[i]=i;
                }
            }

            int find(int x){
                if(x==par[x]){
                    return x;
                }
                return par[x]= find(par[x]);
            }

            void union(int x,int y){
                int x_p=find(x);
                int y_p=find(y);

                if(x_p==y_p) return;

                par[y_p]=x_p;
            }

        }

        public int removeStones(int[][] stones) {
            int maxRow = 0;
            int maxCol = 0;
            int n = stones.length;

            for (int i = 0; i < n; i++) {
                maxRow = Math.max(maxRow, stones[i][0]);
                maxCol = Math.max(maxCol, stones[i][1]);
            }

            Disjoint ds=new Disjoint(maxRow + maxCol + 1);
            HashMap<Integer, Integer> stoneNodes = new HashMap<>();



            for(int i=0;i<stones.length;i++){
                int nodeRow = stones[i][0];
                int nodeCol = stones[i][1] + maxRow + 1;
                ds.union(nodeRow, nodeCol);
                stoneNodes.put(nodeRow, 1);
                stoneNodes.put(nodeCol, 1);

                //0-1
                //5-1
                //7-1
                //3-1


                //1-1
                //8-1
                //4-1

                //2-2 [par[]]

                //6-6 [par[]]
            }


            int cnt = 0;
            for (Map.Entry<Integer, Integer> it : stoneNodes.entrySet()) {
                //count the no of component
                if (ds.find(it.getKey()) == it.getKey()) {
                    cnt++;
                }
            }


            for (Map.Entry<Integer, Integer> it : stoneNodes.entrySet()) {

                System.out.print(it.getKey()+" "+it.getValue()+" ");
            }
            System.out.println();
            for(int i=0;i<ds.par.length;i++){
                System.out.print(" "+ds.par[i]+" ");
            }

            return n - cnt;
        }


       public static void main(String[] args) {
            MostStoneRemoved mostStoneRemoved=new MostStoneRemoved();
           int[][] stones = {
                   {0, 0}, {0, 1},
                   {1, 0}, {1, 2},
                   {2, 1}, {2,2}
           };

           System.out.println(mostStoneRemoved.removeStones(stones));
       }
}
