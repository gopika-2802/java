package DAY6;

import java.util.Scanner;

public class SecmaxinArray {
    public static int secondmax(int [] arr)
    {
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>m1)
            {
                m2=m1;
                m1=arr[i];
            }
            else if(arr[i]>m2&&arr[i]!=m1)
            m2=arr[i];
        }
        return m2;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max2=secondmax(arr);
        System.out.println(max2);
        sc.close();
    }
    
}
