package Map;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {

        String[] words =
                {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, ArrayList<String>> map =
                new HashMap<>();

        for (String word : words) {

            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.computeIfAbsent(
                    key, k -> new ArrayList<>()
            ).add(word);
        }

        System.out.println(map.values());
    }
}