package Strings;
public class substringpali {
    public static void main(String[] args) {
        String s="abaac";
        int count=0;
        for(int i=0;i<s.length();i++)
        { 
            for(int j=i;j<s.length();j++)
            {
                String sub=s.substring(i, j+1);
                StringBuilder sb=new StringBuilder(sub);
                sb.reverse();
                if(sub.equalsIgnoreCase(sb.toString()))
                    count++;
            }
        }
        System.out.println(count);
    }
    // WITHOUT USIG STRINGBUILDER
    // public static void main(String[] args) {
    //     String s="abaac";
    //     int count=0;
    //     for(int i=0;i<s.length();i++)
    //     {
    //         for(int j=i;j<s.length();j++)
    //         {
    //             String sub=s.substring(i,j+1);
    //             if(ispali(sub)) count++;
    //         }
    //     }
    //     System.out.println(count);
    // }
    // public static boolean ispali(String s)
    // {
    //     int l=0,r=s.length()-1;
    //     while ((l<r)) {if(s.charAt(l)!=s.charAt(r)) return false;
    //         l++;r--;
    //     }
    //     return true ;
    // }
}
 