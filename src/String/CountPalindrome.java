package String;

public class CountPalindrome {
   public static boolean CheckPlanidrome(String word)
    {

        int n=word.length();
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            System.out.println(word.charAt(i)+" "+word.charAt(j));
            if(word.charAt(i)!=word.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

  public  static   int countPalindrome(String  str)
    {
        str=str+" ";
        int count=0;
        String temp="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' '){
                temp=temp+str.charAt(i);
            }else{
                Boolean result=CheckPlanidrome(temp);
                if(result){
                    count++;
                }
                temp="";
            }
        }
        return count;
    }
    public static void main(String[] args) {


       System.out.println( countPalindrome(
               "MOM AND DAD ARE MY BEST FRIENDS"));
    }
}
