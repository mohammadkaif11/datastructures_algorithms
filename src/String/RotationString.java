package String;

public class RotationString {

    public  static  boolean ISContain(String str1,String str2){
        String temp=str1+str1;
        if(str2.contains(str2)){
            return  true;
        }
        return  false;
    }

    public static void main(String[] args) {
       System.out.println(ISContain("code quotient","quotient code"));
    }
}
