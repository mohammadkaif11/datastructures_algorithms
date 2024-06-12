package String;

public class FindFirstIndexOccurences {
    public static int strStr(String haystack, String needle) {
     int hl=haystack.length();
     int nl=needle.length();
     int result=-1;
     for(int i=0;i<hl;i++){
         int j=i;
         int k=0;
         String temp="";
         while (j<hl && k<nl){
             if(haystack.charAt(j)==needle.charAt(k)){
                 temp+=haystack.charAt(j);
             }
             j++;
             k++;
         }

         if(needle.equals(temp) && result==-1){
             result=i;
             break;
         }

     }

     return result;
    }
    public static void main(String[] args) {
       System.out.println( strStr("sadbutsad","sad"));
    }
}
