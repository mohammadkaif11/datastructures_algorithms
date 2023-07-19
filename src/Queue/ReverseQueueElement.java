package Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueElement {

    public void Reverse(Queue<Integer> queue ,int k)
    {
        Queue<Integer> result=new PriorityQueue<>();
        Stack<Integer> temp=new Stack<Integer>();

        while (!queue.isEmpty() && k!=0){
            int data=queue.peek();
            temp.push(data);
            queue.poll();
        }

        while (!temp.empty()){
            int data=temp.pop();
            temp.pop();
            result.add(data);
        }

        while (!queue.isEmpty())
        {
            int data=queue.peek();
            queue.poll();
            result.add(data);
        }

        queue=result;
    }


    public static void main(String[] args) {

    }
}
