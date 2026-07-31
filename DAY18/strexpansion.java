package DAY18;

public class strexpansion {
    public static String strex(String s){
        // StringBuilder sb=new StringBuilder();
        int i=1;
        while(i<s.length())
        {
            // char c=s.charAt(i);
            // String count="";
            while(Character.isDigit(s.charAt(i))){}
            // count++;
        }
        return s;
    }
    public static void main(String[] args)
    {
        String s="aaaaaabbbbbccccccc";
        String str=strex(s);
        System.out.println(str);
    }
    
}