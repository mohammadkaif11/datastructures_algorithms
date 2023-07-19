package String;

public class ObbessionString {
    public  static  int CheckResult(String para,String check)
    {
        int paraL=para.length();
        int checkL=check.length();
        int i=0;
        int Result=0;
        while (i<paraL){
            int j=0;
            if(para.charAt(i)==check.charAt(j)){
                String temp="";
                while (j<checkL && i<paraL && para.charAt(i)==check.charAt(j))
                {
                    temp=temp+para.charAt(i);
                    i++;
                    j++;
                }
                if(temp.length()==check.length()){
                    if(i<paraL-1){
                        if(para.charAt(i)==' '){
                            Result++;
                        }
                    }else{
                         Result++;
                    }
                }
            }
            i++;
        }

        return Result;
    }


    public static void main(String[] args) {
       System.out.println(CheckResult("TinA no Tina hey    Tina no Tina","Tina"));
        System.out.println(CheckResult("Riyal no Riya","Riya"));
        System.out.println(CheckResult("Kaifid  no Kaif ","Kaif"));
        System.out.println(CheckResult("Kaif no Riya","Kaif"));

    }
}
