package DAY5;

import java.util.Scanner;

public class mountaion_array {
    public static void mountarr(int[] arr) {
        if (arr.length < 3) 
        {
            System.out.println(false);
            return;
        }
        int i=0;
        int n = arr.length;
        for(;i+1<n&&arr[i]<arr[i+1];i++) //increasing up hill
        {}
        if (i == 0 || i == n - 1)
        {
            System.out.println(false); 
            return;
        }
        for(;i+1<n&&arr[i+1]<arr[i];i++) //decreasing down hill
        {}
        System.out.println(i == n - 1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3,5};
        int[] nums2 = {1, 2,3, 2, 1};
        int []n2=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        n2[i]=sc.nextInt();
        mountarr(nums1); 
        mountarr(nums2); 
        mountarr(n2);
        sc.close();
    }
}

