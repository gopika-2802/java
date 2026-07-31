package HashSet;
import java.util.*;

public class SameUniqueElements {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3};
        int[] b = {3, 1, 2, 2};

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        for (int x : a) {
            setA.add(x);
        }

        for (int x : b) {
            setB.add(x);
        }

        System.out.println(setA.equals(setB));
    }
}