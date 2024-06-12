package String;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        String ss="";
        for(int i=n-1;i>=0;i--){
            char temp= s.charAt(i);
            if(temp==' ' && ss.length()>0){
                return ss.length();
            }

            if(temp==' ' && ss==""){
                continue;
            }else {
                ss+=temp;
            }

        }

        return ss.length();

    }

}
