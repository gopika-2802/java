package Arraylist;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(4, 2, 4, 5, 2, 7, 5));

        ArrayList<Integer> result = new ArrayList<>();

        for (int x : list) {
            if (!result.contains(x)) {
                result.add(x);
            }
        }

        System.out.println(result);
    }
}