package HashSet;

import java.util.*;

public class PairsWithTargetUsingSet {
    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 5, 3, 8};
        int target = 10;

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {

            int need = target - x;

            if (set.contains(need)) {
                System.out.println(need + " " + x);
            }

            set.add(x);
        }
    }
}
