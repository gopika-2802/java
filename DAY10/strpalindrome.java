package DAY10;

public class strpalindrome {
    public static void main(String[] args) {
        String s="Anna";
        String sr=new StringBuilder(s).reverse().toString();
        if(s.equalsIgnoreCase(sr))
        System.out.println("palin.");
        else
        System.out.println("not palin.");
        for(char c:s.toCharArray())// just print using for each loop
        System.out.println(c);
        char ch='a';
        System.out.println(Character.toUpperCase(ch));
        System.out.println(Character.toLowerCase(ch));
        
    }   
}
