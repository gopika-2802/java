package Array;

import java.util.Arrays;

public class rotationusingformula {
       public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 2;                 
        int n = arr.length;
        k = k % n;                 
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;   
            res[newIndex] = arr[i];
        }

        System.out.println(Arrays.toString(res));
    }
}
