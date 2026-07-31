package Array;

public class missing_number_in_Array {
    public static int findMissing(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5; 
        int missing = findMissing(arr, n);
        System.out.println("Missing number is: " + missing);
    }
}
