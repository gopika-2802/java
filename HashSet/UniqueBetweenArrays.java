package HashSet;

import java.util.*;

public class UniqueBetweenArrays {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        for (int x : a) {
            setA.add(x);
        }

        for (int x : b) {
            setB.add(x);
        }

        HashSet<Integer> result = new HashSet<>(setA);
        result.addAll(setB);

        HashSet<Integer> common = new HashSet<>(setA);
        common.retainAll(setB);

        result.removeAll(common);

        System.out.println(result);
    }
}