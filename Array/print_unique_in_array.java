package Array;

import java.util.Scanner;

public class print_unique_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printUnique(arr);
        sc.close();
    }

    public static void printUnique(int[] arr) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(arr[i]+" ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No unique elements");
        }
    }
}