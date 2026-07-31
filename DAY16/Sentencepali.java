package DAY16;

public class Sentencepali 
{
   public static void main(String[] args) 
   {
    String s="A man,a plan,a canal:panama";
    StringBuilder ss=new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
        if(Character.isLetter(s.charAt(i)))
        ss.append(s.charAt(i));
    }
    System.out.println(ss.toString().equalsIgnoreCase(rev(ss.toString())));
    }

   public static String rev(String s)
   {
    StringBuilder revs=new StringBuilder();
    for(int i=s.length()-1;i>=0;i--)
        revs.append(s.charAt(i));
    return revs.toString();
   }
}
