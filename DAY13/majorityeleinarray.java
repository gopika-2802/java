package DAY13;

import java.util.Scanner;

public class majorityeleinarray {
    public static  int majorele(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>n/2)
            return arr[i];
        }
        return 0;
        }
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        // int arr[]={4,3,3,4,4,4,1,1,3,3,3,3,3,3,5};
        // int n=arr.length;
        int res=majorele(arr, n);
        System.out.println(res);
        sc.close();
    }
    
}