package String;

import java.util.Stack;

public class BlancedPranthesis {
    public static void main(String[] args) {
           System.out.println(isValid("]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch (ch){
                case '(' :
                    st.push('(');
                    break;
                case '{' :
                    st.push('{');
                    break;
                case '[' :
                    st.push('[');
                    break;
                case  ')':
                    if(!st.isEmpty() && st.peek()=='('){
                        st.pop();
                    }else{
                        return  false;
                    }
                    break;
                case '}':
                    if(!st.isEmpty() && st.peek()=='{'){
                        st.pop();
                    }else{
                        return false;
                    }
                    break;
                case ']':
                    if(!st.isEmpty() && st.peek()=='['){
                        st.pop();
                    }else{
                        return false;
                    }
                    break;
            }
        }

        if(st.isEmpty()){
            return  true;
        }

        return  false;
    }
}
