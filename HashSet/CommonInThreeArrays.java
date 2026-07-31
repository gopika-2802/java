package HashSet;
import java.util.*;

public class CommonInThreeArrays {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 5, 7};
        int[] c = {2, 5, 8};

        HashSet<Integer> set1 = new HashSet<>();

        for (int x : a) {
            set1.add(x);
        }

        HashSet<Integer> set2 = new HashSet<>();

        for (int x : b) {
            if (set1.contains(x)) {
                set2.add(x);
            }
        }

        for (int x : c) {
            if (set2.contains(x)) {
                System.out.print(x + " ");
            }
        }
    }
}