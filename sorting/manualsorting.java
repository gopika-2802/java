package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class manualsorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
             if(arr[j]>arr[i])// use < for descending
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    
}
