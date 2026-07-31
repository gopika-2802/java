package DAY8;

import java.util.Arrays;

//import java.util.Scanner;

public class PositiveToNegativeNumbers {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -4, -6, 5};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // fixed condition
                if (!(arr[i] > 0 && arr[j] < 0)) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
