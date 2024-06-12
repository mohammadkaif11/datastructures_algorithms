package String;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int n=strs.length;

        String first=strs[0];
        String result="";

        for(int i=1;i<n;i++){
            String second=strs[i];
            int fsp=0;
            int ssp=0;
            if(result==""){
                while (fsp < first.length() && ssp <second.length()){
                    if(first.charAt(fsp)==second.charAt(ssp)){
                        result=result+first.charAt(fsp);
                    }else{
                        break;
                    }
                    fsp++;
                    ssp++;
                }
            }else{
                String temp="";
                 while (fsp < result.length() && ssp <second.length()){
                    if(result.charAt(fsp)==second.charAt(ssp)){
                        temp=temp+first.charAt(fsp);
                    }else{
                        break;
                    }
                    fsp++;
                    ssp++;
                }
                 result=temp;
            }
        }

        return  result;

    }

    public static void main(String[] args) {
        String s[]={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));

    }
}
