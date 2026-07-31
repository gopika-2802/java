package Array;

public class removedup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        int[] temp = new int[n];
        int j = 0; // index for unique elements

        for (int i = 0; i < n; i++) {
            boolean found = false;
            // check if arr[i] already exists in temp[0..j-1]
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[j++] = arr[i]; // add unique element
            }
        }

        // Print only the unique elements
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }

}