package Arraylist;
import java.util.*;

public class ElementsExactlyTwice {
    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4));

        ArrayList<Integer> result = new ArrayList<>();

        for (int x : list) {

            int count = Collections.frequency(list, x);

            if (count == 2 && !result.contains(x)) {
                result.add(x);
            }
        }

        System.out.println(result);
    }
}