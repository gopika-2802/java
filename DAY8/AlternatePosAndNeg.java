package DAY8;

import java.util.Arrays;

public class AlternatePosAndNeg {

    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -4, -6, 5};
        int n = arr.length;

        int outOfPlace = -1;

        for (int i = 0; i < n; i++) {
            if (outOfPlace >= 0) {
                // check if element can be rotated
                if ((arr[i] >= 0 && arr[outOfPlace] < 0) || (arr[i] < 0 && arr[outOfPlace] >= 0)) {
                    // right rotate between outOfPlace and i
                    int temp = arr[i];
                    for (int j = i; j > outOfPlace; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[outOfPlace] = temp;

                    // update outOfPlace
                    if (i - outOfPlace >= 2)
                        outOfPlace += 2;
                    else
                        outOfPlace = -1;
                }
            } else {
                // check if current element is out of place
                if ((arr[i] >= 0 && i % 2 == 1) || (arr[i] < 0 && i % 2 == 0)) {
                    outOfPlace = i;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
