package Arraylist;
import java.util.*;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 1));

        int current = 1;
        int max = 1;

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) > list.get(i - 1)) {
                current++;
            } else {
                current = 1;
            }

            max = Math.max(max, current);
        }

        System.out.println("Longest length: " + max);
    }
}