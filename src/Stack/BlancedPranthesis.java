package Stack;

import java.util.Stack;

public class BlancedPranthesis{

    public  static  int  CheckBlanced(String arg)
    {
        Stack<Character> stack=new Stack<Character>();

        int closedBracket=0;

        for(int i=0;i<arg.length();i++)
        {
            if(arg.charAt(i)=='{'){
                stack.push(arg.charAt(i));
            }
            if(arg.charAt(i)=='}')
            {
                if(stack.empty()) closedBracket++;
                else stack.pop();
            }
        }


        //already blanced;
        if(stack.empty() && closedBracket==0){
            return  0;
        }

        if(!stack.empty() && closedBracket==0){
            return  -1;
        }

        //for both even
        if(stack.size()==1 && closedBracket==1){
            return   stack.size()+ closedBracket;
        }

        //for both odd
        if(stack.size()%2!=0 && closedBracket%2!=0){
          return   stack.size()/2 + closedBracket/2 +2;
        }

        //for both even
        if(stack.size()%2==0 && closedBracket%2==0){
            return  stack.size()/2 +closedBracket/2;
        }


        return -1;
    }

    public static void main(String[] args) {
      System.out.println(CheckBlanced("{}"));
      System.out.println(CheckBlanced("{{{}}}"));
      System.out.println(CheckBlanced("}}}{{{"));
      System.out.println(CheckBlanced("}}}}{{{{"));
      System.out.println(CheckBlanced("}{"));
      System.out.println(CheckBlanced("{{}"));
      System.out.println(CheckBlanced("{{}"));
    }
}
