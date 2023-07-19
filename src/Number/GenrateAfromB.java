package Number;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


 class Number{
     int number;
     int level;
     Number(int number,int level){
         this.number=number;
         this.level=level;
     }
 }

public class GenrateAfromB {

    public static  void  Genrate(int a,int b)
    {
        Queue<Number> queue=new LinkedList<>();
        HashSet<Integer> hs=new HashSet<Integer>();
        int level=0;
        hs.add(a);
        queue.add(new Number(a,level));

        while (!queue.isEmpty()){
            Number data=queue.poll();
            int newLevel=data.level+1;
            Number minus=new Number(data.number-1,newLevel);
            Number multy=new Number(data.number*data.number,newLevel);

            if(!hs.contains(minus.number)){
                if(minus.number==b){
                    System.out.println("Level "+newLevel+" Number "+minus.number);
                    break;
                }
                queue.add(minus);
                hs.add(minus.number);
            }
            if(!hs.contains(multy.number)){
                if(multy.number==b){
                    System.out.println("Level "+newLevel+" Number "+multy.number);
                    break;
                }
                queue.add(multy);
                hs.add(multy.number);
            }
        }

        return;
    }


    public static void main(String[] args) {
        Genrate(4,6);
    }
}
