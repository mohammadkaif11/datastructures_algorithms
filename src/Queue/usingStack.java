package Queue;

import java.util.Stack;

public class usingStack {

    Stack<Integer> input=new Stack<Integer>();
    Stack<Integer> output=new Stack<Integer>();

    public  void Enqueue(int data)
    {
     input.push(data);
    }

    public int Dequeue()
    {
    if(!output.empty()){
        int data=output.peek();
        return  data;
    }else{
        if(input.empty()){
            return -1;
        }else{
            while (!input.empty()){
                int data=input.peek();
                output.push(data);
                input.pop();
            }
            int data=output.peek();
            return data;
        }
    }
    }

    public static void main(String[] args) {
        usingStack uu=new usingStack();
        uu.Enqueue(1);
        uu.Enqueue(2);
        System.out.println(uu.Dequeue());
    }
}
