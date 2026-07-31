package Map;

import java.util.*;

public class MaxFrequencyElement {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 3, 4, 3, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int answer = arr[0];

        for (int x : map.keySet()) {

            if (map.get(x) > map.get(answer)) {
                answer = x;
            }
        }

        System.out.println("Maximum frequency: " + answer);
    }
}
