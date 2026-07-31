package DAY22;

public class Findthediff {
    public static void main(String[] args) 
    {
        String s="abcd";
        String t="abcde";
        char ch=diff(s,t);
        System.out.println(ch);
    }
    public static char diff(String s, String t) {
        for(int i=0;i<t.length();i++)
        {
            int count=1;
            for(int j=0;j<s.length();j++)
            {
                if(t.charAt(i)==s.charAt(j))
                count++;
            }
            if(count==1)
            return t.charAt(i);
        }
        return ' ';
    }
    
}
