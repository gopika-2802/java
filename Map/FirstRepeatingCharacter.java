package Map;

import java.util.*;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {

        String s = "abcdbea";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {

            if (map.get(c) > 1) {
                System.out.println(
                        "First repeating: " + c);
                return;
            }
        }
    }
}
