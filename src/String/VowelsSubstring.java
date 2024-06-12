package String;

public class VowelsSubstring {
    public static void main(String[] args) {
        int count=countVowelSubstr("ABC");
        System.out.println(count);
    }
    static int countVowelSubstr(String str) {
        str=str.toLowerCase();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                char ch=str.substring(i,j).charAt(0);
                if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u' )
                {
                    count++;
                }
            }
        }
        return count;
    }

}
