package Array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int arrn[]=new int[n-1];
        System.out.println("enter the index to insert: ");
        int ind=sc.nextInt();
        for(int i=0;i<ind;i++)
           arrn[i]=arr[i];
        System.out.println(arr[ind]+" is deleted.");
        for(int i=ind;i<n;i++)
           arrn[i-1]=arr[i];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrn));
        sc.close();
    }   
}
