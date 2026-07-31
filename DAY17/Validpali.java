public class Validpali {
    public static boolean Pali(String s) {
        StringBuilder s1=new StringBuilder();
        for(int i=0 ;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            s1.append(Character.toLowerCase(s.charAt(i)));
        }
        String s2=s1.toString();
        return s2.equals(s1.reverse().toString());
    }
    public static void main(String [] args) 
    {
        String s=" A man, a plan, a canal: panama ";
        boolean b=Pali(s);
        System.out.println(b);
    }
}
 