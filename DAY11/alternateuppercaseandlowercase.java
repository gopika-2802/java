package DAY11;

public class alternateuppercaseandlowercase {
    public static void main(String[] args) {
        String s="Helloo";
        rev(s);
        System.out.println();
        String res=rev1(s);
        System.out.println(res);
    }
    public static void rev(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            System.out.print(Character.toUpperCase(s.charAt(i)));
            else
            System.out.print(Character.toLowerCase(s.charAt(i)));
        }
    }
    public static String rev1(String s) { // with return string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }
}

