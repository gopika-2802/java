package DAY23;
public class LongestcommonPrefix {
    public static void main(String[] args) {
        String []s={"flower","flow","flour"};
        String res=CommonPrefix(s);
        System.out.println(res);
    }
    /*public static String commonprefix(String[] s)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<s.length;i++)
        {
            for(int j=0;j<Math.min(s[i].length(), s[j].length()-1);j++)
            {
                if(s[i].charAt(j)==s[i+1].charAt(j))
                {
                    sb.append(s[i].charAt(i));
                }
            }
        }
        StringBuilder sb1=new StringBuilder();
        for(char ch1:sb.toString().toCharArray())
        {
            for(char ch2:s[s.length-1].toCharArray() )
            {
                if(ch1==ch2)
                sb1.append(ch1);
            }
        }
        return sb1.toString();
    }*/
    public static String CommonPrefix(String[] s) {
    if (s == null || s.length == 0) return "";
        String cp = s[0];
        for (int i = 1; i < s.length; i++) 
        {
            while (s[i].indexOf(cp) != 0) 
            {
                cp = cp.substring(0, cp.length() - 1);
                if (cp.isEmpty()) 
                return "";
            }
        }
        return cp;
    }
}