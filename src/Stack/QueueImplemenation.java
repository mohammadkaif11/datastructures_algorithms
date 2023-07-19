package Stack;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplemenation {

    Queue<Integer> Q1=new LinkedList<>();
    Queue<Integer> Q2=new LinkedList<>();

    public  void push(int data){
        Q2.add(data);
        while (!Q1.isEmpty()){
            int temp=Q1.peek();
            Q2.add(temp);
            Q1.poll();
        }

        //swapping the linkedlist
        Queue<Integer> temp=new LinkedList<>();
        temp=Q1;
        Q1=Q2;
        Q2=temp;
    }

    public int pop(){
        if(Q1.isEmpty()){
            return -1;
        }else{
            return  Q1.peek();
        }
    }


    public static void main(String[] args) {

        QueueImplemenation qq=new QueueImplemenation();

        qq.push(1);
        qq.push(2);
        System.out.println(qq.pop());
    }
}
