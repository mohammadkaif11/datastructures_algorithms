package Recursions;

public class CheckPalindrome {


    //parameterized or functional recursion
    public  static void CheckPalindrome(String str,int i,int n,int result){
        if(str.charAt(i)!=str.charAt(n-1)){
            System.out.println("Is not Palindrome");
            return;
        }
        if(i>=n){
          System.out.println("Is Palindrome");
            return;
        }
        CheckPalindrome(str,i+1,n-1,result);
    }


    public static void main(String[] args) {
        int result=-1;
        CheckPalindrome("abad",0,4,result);
        System.out.println("Result after "+result);
    }
}
