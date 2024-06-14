package Graphs.TOPOQuestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseShedule1 {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        int v=numCourses;
        int indgree[]=new int[v];

        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        //find the indgree
        for(int i=0;i<v;i++){
            for(Integer it:graph.get(i)){
                indgree[it]++;
            }
        }

        Queue<Integer> queue=new LinkedList<>();

        for(int i=0;i<v;i++){
            if(indgree[i]==0){
                queue.add(i);
            }
        }


        ArrayList result=new ArrayList();
        int index=0;
        while (!queue.isEmpty()){
            int node=queue.peek();
            result.add(node);
            queue.remove();
            for(Integer it:graph.get(node)){
                indgree[it]--;
                if(indgree[it]==0){
                    queue.add(it);
                }
            }
        }
        if(result.size()==v){
            return  true;
        }
        return  false;
    }

    public static void main(String[] args) {
      int arr[][]={{1,0}};
      System.out.println(canFinish(2,arr));
    }
}
