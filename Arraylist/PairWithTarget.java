package Arraylist;
import java.util.*;

public class PairWithTarget {
    public static void main(String[] args) {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(2, 7, 11, 15, 3));

        int target = 10;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i) + list.get(j) == target) {
                    System.out.println(
                            list.get(i) + " " + list.get(j));
                }
            }
        }
    }
}