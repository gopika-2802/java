package Array;

import java.util.Scanner;

public class zigzagarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        boolean b=zigzag(arr,n);
        System.out.println(b);
        sc.close();
    }
    public static boolean zigzag(int []arr,int n)
    {
        for(int i=1;i<n-1;i++)
            {
                if(arr[i]>arr[i+1]&&arr[i-1]<arr[i]||arr[i]<arr[i+1]&&arr[i-1]>arr[i])
                {
                    return true;
                }
            }
            return false;
    }
    
}