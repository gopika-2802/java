package Arraylist;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(10, 40, 20, 50, 30));

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : list) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x != largest) {
                second = x;
            }
        }

        System.out.println("Second largest: " + second);
    }
}