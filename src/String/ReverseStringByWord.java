package String;

public class ReverseStringByWord {

    //Function to reverse words in a given string.
    static String reverseWords(String s)
    {
        String Result="";
        int n=s.length();

        String temp="";
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!='.'){
                temp=s.charAt(i)+temp;
            }else{
                Result=Result+temp+".";
                temp="";
            }
        }
        Result=Result+temp;
        return Result;
    }

    //Revers word with space
    static String  ReverseWordSpace(String s)
    {
        String Result="";
        int n=s.length();

        String temp="";
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                temp=s.charAt(i)+temp;
            }else{
                Result=Result+temp+" ";
                temp="";
            }
        }
        Result=Result+temp;
        return Result;
    }

    public static void main(String[] args) {
       System.out.println( reverseWords("I.Love.You"));
        System.out.println(ReverseWordSpace("Hello world"));
    }
}
