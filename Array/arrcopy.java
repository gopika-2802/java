package Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrcopy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp[]=new int [n];
        for(int i=0;i<n;i++)
        {
            temp[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));
        sc.close();
        
    }
    
}
