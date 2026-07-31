package DAY13;

import java.util.Scanner;

public class arrayscompare {
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
        arraycomp(arr1,arr2);
        sc.close();
    }
    public static void arraycomp(int []arr1,int[]arr2)
    {
        int count=0;
        if(arr1.length==arr2.length)
        {
            for(int i=0;i<arr1.length;i++)
            {
                if(arr1[i]==arr2[i])
                count++;
            }
            if(count==arr1.length)
            System.out.println("true");
            else
            System.out.println("false");
        }
        else
        System.out.println("false");
    }
    
}
