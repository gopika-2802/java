package Strings;

public class pangram {
    public static void main(String[] args) {
        String s="the quick brown fox jumps over the lazy dog";
        s=s.replaceAll(" ", "").toLowerCase();
        for( char c='a';c<='z';c++)
        {
            if(s.indexOf(c)==-1)
            {
                System.out.println("no its not pangram");
                return;
            }
        }
        System.out.println("yes it is pangram");
    }
    
}
