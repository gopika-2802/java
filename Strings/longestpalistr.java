package Strings;
public class longestpalistr {
    public static void main(String[] args) {
        String s="babad";
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            int len1=expand(s, i, i);
            int len2=expand(s, i, i+1);
            len=Math.max(len1, len2);
        }
        System.out.println(s.substring(len));
    }
    public static int expand(String s,int l,int r)
    {
        while(s.charAt(l)==s.charAt(r)&& l>=0 && r<s.length())
        {
            l--;r++;
        }
        return r-l-1;
    }
}
