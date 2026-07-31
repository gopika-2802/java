package Arraylist;
import java.util.*;

public class KthLargest {
    public static void main(String[] args) {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(10, 30, 20, 50, 40));

        int k = 2;

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(k + "th largest: " + list.get(k - 1));
    }
}
