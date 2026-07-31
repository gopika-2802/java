package DAY6;

import java.util.Scanner;

public class leftrotatearray {
    public static void leftrotate(int []arr,int k)//k :number of rotation
    {
        k=k%arr.length;
        for(int i=1;i<=k;i++)
        {
            int n=arr.length;
            int s=0,e=n-1;
            while(s<=e)
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                e--;
            }
        }
        for(int i:arr)
        System.out.print(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=2;
        leftrotate(arr, k);
        sc.close();
    }
    
}
