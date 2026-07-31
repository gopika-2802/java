package Arraylist;
import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(0, 1, 0, 3, 12));

        ArrayList<Integer> result = new ArrayList<>();

        for (int x : list) {
            if (x != 0) {
                result.add(x);
            }
        }

        while (result.size() < list.size()) {
            result.add(0);
        }

        System.out.println(result);
    }
}
