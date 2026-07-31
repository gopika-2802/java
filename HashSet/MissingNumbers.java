package HashSet;

import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 7};
        int n = 7;

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        for (int i = 1; i <= n; i++) {

            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
