package Graphs.TOPOQuestion;

import Array.Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseShedule2 {
    public static int[] canFinish(int numCourses, int[][] prerequisites) {
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


        ArrayList<Integer> result=new ArrayList();
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
        int size=result.size();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
           int node=result.get(i);
           arr[i]=node;
        }

        if(result.size()==v){
            return  arr;
        }
        int[] arr2 = {};

        return arr2;
    }

}
