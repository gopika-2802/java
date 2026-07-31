package Arraylist;
import java.util.*;

public class DifferenceOfLists {
    public static void main(String[] args) {
        ArrayList<Integer> a =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> b =
                new ArrayList<>(Arrays.asList(2, 4, 6));

        ArrayList<Integer> result = new ArrayList<>();

        for (int x : a) {
            if (!b.contains(x)) {
                result.add(x);
            }
        }

        System.out.println(result);
    }
}