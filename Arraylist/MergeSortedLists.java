package Arraylist;

import java.util.*;

public class MergeSortedLists {
    public static void main(String[] args) {
        ArrayList<Integer> a =
                new ArrayList<>(Arrays.asList(1, 3, 5, 7));

        ArrayList<Integer> b =
                new ArrayList<>(Arrays.asList(2, 4, 6, 8));

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < a.size() && j < b.size()) {

            if (a.get(i) <= b.get(j)) {
                result.add(a.get(i));
                i++;
            } else {
                result.add(b.get(j));
                j++;
            }
        }

        while (i < a.size()) {
            result.add(a.get(i++));
        }

        while (j < b.size()) {
            result.add(b.get(j++));
        }

        System.out.println(result);
    }
}
