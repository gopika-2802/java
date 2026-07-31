package HashSet;
import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        int max = 0;

        for (int x : set) {

            if (!set.contains(x - 1)) {

                int current = x;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        System.out.println("Longest consecutive length: " + max);
    }
}