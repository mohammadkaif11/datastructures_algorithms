package String;

import java.util.Stack;

public class RemoveOuter {

    //RemoveOuter
    static String RemoveOuter(String s)
    {
        Stack<Character> stack = new Stack<Character>();

        String result="";
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
                if(stack.size()>1){
                    char ch=stack.peek();
                    result=result+ch;
                }
            }
            if(s.charAt(i)==')'){
                if(stack.size()>1){
                    result=result+s.charAt(i);
                }
                stack.pop();
            }
        }

        return  result;
    }

    public static void main(String[] args) {

        System.out.println(RemoveOuter("(()())(())"));
    }
}
