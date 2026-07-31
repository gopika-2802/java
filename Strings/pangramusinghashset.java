package Strings;
import java .util.*;
public class pangramusinghashset {
    public static void main(String[] args) {
        String s=" the quick brown fox jumps over the lazy dog";
        s=s.replaceAll(" ", "").toLowerCase();
        HashSet<Character> set=new HashSet<>();
        for(char c:s.toCharArray())
            set.add(c);
        System.out.println(set);
        System.out.println(set.size()==26?"pangram":"no");
    }
}
