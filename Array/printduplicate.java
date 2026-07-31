package Array;

import java.util.Scanner;

public class printduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int r=0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    r++;
                    break;
                }
            }

            if (r>0) continue; 
            
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " repeated " + count + " times");
            }
        }

        if (r==0) {
            System.out.println("No duplication");
        }
        sc.close();
    }
}
