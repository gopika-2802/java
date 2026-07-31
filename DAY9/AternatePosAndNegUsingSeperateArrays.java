package DAY9;

import java.util.Arrays;

public class AternatePosAndNegUsingSeperateArrays {

    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -4, -6, 5};
        int posCount = 0, negCount = 0;
        for (int num : arr) {
            if (num >= 0) posCount++;
            else negCount++;
        }

        int[] pos = new int[posCount];
        int[] neg = new int[negCount];

        // Fill positive and negative arrays
        int pi = 0, ni = 0;
        for (int num : arr) {
            if (num >= 0) pos[pi++] = num;
            else neg[ni++] = num;
        }

        // Merge alternately
        int i = 0;
        pi = 0;
        ni = 0;
        boolean usePos = true;

        while (pi < pos.length && ni < neg.length) {
            if (usePos) arr[i++] = pos[pi++];
            else arr[i++] = neg[ni++];
            usePos = !usePos;
        }

        // Append remaining elements
        while (pi < pos.length) arr[i++] = pos[pi++];
        while (ni < neg.length) arr[i++] = neg[ni++];

        System.out.println(Arrays.toString(arr));
    }
}
