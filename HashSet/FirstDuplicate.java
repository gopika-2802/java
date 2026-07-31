package HashSet;

import java.util.*;

public class FirstDuplicate {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 3, 2, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {

            if (set.contains(x)) {
                System.out.println("First duplicate: " + x);
                return;
            }

            set.add(x);
        }

        System.out.println("No duplicate");
    }
}