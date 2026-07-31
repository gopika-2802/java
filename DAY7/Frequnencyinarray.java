package DAY7;

import java.util.Scanner;

public class Frequnencyinarray {
    public static void fre(int arr[],int n)
    {
        int r=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    r++;
                    break;
                }
            }
            if(r>0) 
            continue;
            for(int k=0;k<n;k++)
            {
                if(arr[i]==arr[k])
                count++;
            }
            if(count>1)
            System.out.println(arr[i]+" is repeated "+count+" times");
        }
        if(r==0)
        System.out.println("noo repeated");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        fre(arr, n);
        sc.close();
    }
    
}
