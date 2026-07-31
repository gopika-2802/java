package DAY2;

import java.util.Arrays;
import java.util.Scanner;

public class mergeing {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int [] arr1={2,3,4,5};
        int arr2[]={1,2,3,4};
        int n1=arr1.length;
        int n2=arr2.length;
        int mn=n1+n2;
        int [] marr=new int[mn];
        for(int i=0;i<n1;i++) 
        marr[i]=arr1[i];
        for(int i=0;i<n2;i++) 
        marr[n1+i]=arr2[i];
        System.out.println(Arrays.toString(marr));
        sc.close();
    }
    
}