package Array;

import java.util.Scanner;

public class move_zero_in_array {
    public static void movezeros(int arr[])
    {
        /*int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length)
        {
            arr[index]=0;
            index++;
        }*/
        int index=0;
        for(int num:arr)
        {
            if(num!=0)
            {
                arr[index]=num;
                index++;
            }
        }
            while(index<arr.length)
            {
                arr[index]=0;
                index++;
            }
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        movezeros(arr);
        sc.close();
}
}
