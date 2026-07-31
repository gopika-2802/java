package HashSet;

import java.util.*;

public class CheckSubset {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 4, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int x : a) {
            set.add(x);
        }

        boolean isSubset = true;

        for (int x : b) {

            if (!set.contains(x)) {
                isSubset = false;
                break;
            }
        }

        System.out.println("Is subset: " + isSubset);
    }
}
