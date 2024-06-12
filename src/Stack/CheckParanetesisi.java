package Stack;

import java.util.Stack;

public class CheckParanetesisi {
    public static void main(String[] args) {
        char ch[]={'(','2','+','2',')'};
        System.out.println(areBracketsBalanced(ch));

    }
    static boolean areBracketsBalanced(char exp[]) {
        Stack<Character> stack=new Stack();
        for (int i=0;i<exp.length;i++)
        {
            char cur=exp[i];
            if(IsBracket(cur)) {
                if (IsOpenning(cur)) {
                    stack.push(cur);
                } else if (!IsMaking(stack.peek(), cur)) {
                    return false;
                } else {
                    if(!stack.isEmpty()){
                        stack.pop();

                    }
                }
            }

        }
        return stack.isEmpty();
    }
  public   static  boolean IsOpenning(char c){
        return  c=='(' || c=='{'|| c=='[';
    }
   public static  boolean IsMaking(char c,char b){
        return  c=='(' && b==')' || c=='{' &&  b=='}' || c=='[' && b==']';
    }
    public static  boolean IsBracket(char c)
    {
        return  c=='(' || c=='{'|| c=='[' || c==')' || c=='}'  || c==']';
    }

}
