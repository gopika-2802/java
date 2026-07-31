package Strings;

public class pangramusingfreq {
    public static void main(String[] args) {
        String s="the quick brown fox jumps over the lazy dog";
        s=s.replaceAll(" ", "").toLowerCase();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i:freq)
        {
            if(i==0){System.out.println("no");return;}
        }
        System.out.println("pangram");
    }
    
}
