package Array;

import java.util.Scanner;
public class missingeleinarray{
    public static int missingele(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]+1!=arr[i+1])
            return arr[i]+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int miss=missingele(arr, n);
        System.out.println(miss);
        sc.close();
    }
    
}