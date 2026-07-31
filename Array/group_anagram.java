package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// leedcode 49
public class group_anagram {
    public static void main(String[] args) {
        String arr[]={"ate","eat","tea","tan","nat","bat"};
        HashMap<String,ArrayList> map=new HashMap<>();
        for(String s: arr)
        {
            char word[]=s.toCharArray();
            Arrays.sort(word);
            String str=new String (word);
            map.putIfAbsent(str, null);
        }
    }
}
