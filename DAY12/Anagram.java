package DAY12;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int ch[]=new int[26];//[128] for capital letter
        for(int i=0;i<s.length();i++)
        {
            ch[s.charAt(i)-'a']++;
            ch[t.charAt(i)-'a']--;
        }
        for(int i:ch)
        {
            if(i!=0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
    
}
