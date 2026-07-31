package DAY13;

import java.util.Arrays;
import java.util.Scanner;

public class Mergearrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of 1st array:");
        int n=sc.nextInt();
        System.out.println("enter the size of 2nd array:");
        int n1=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n1];
        System.out.println("enter the ele of 1st array:");
        for(int i=0;i<n;i++)
        arr1[i]=sc.nextInt();
        System.out.println("enter the ele of 2nd array");
        for(int i=0;i<n1;i++)
        arr2[i]=sc.nextInt();
        int marr[]=mergearr(arr1,arr2,n,n1);
        System.out.println(Arrays.toString(marr));
        sc.close();
    }
    public static int[] mergearr(int []arr1,int []arr2,int n1,int n2)
    {
        int []marr=new int [n1+n2];
        for(int i=0;i<n1;i++)
        marr[i]=arr1[i];
        for(int i=0;i<n2;i++)
        marr[i+n1]=arr2[i]; 
        Arrays.sort(marr);
        return marr;
    }
    
}
