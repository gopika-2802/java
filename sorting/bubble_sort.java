package sorting;

import java.util.Arrays;

public class bubble_sort {
    int [] arr={1,5,8,11,3,2,-1};

    public static int [] bubble_sortarr(int arr[])
    {

         for(int i=0;i<arr.length;i++)
         {
             for(int j=i+1;j<arr.length;j++)
             {
                 if(arr[j]<arr[i]) // < for ascending order // > is descending order
                 {
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
             }
        }
            // for time complexity
            // for(int j=0;j<arr.length-1;j++)
            // {
            //     if(arr[j+1]<arr[j])
            //     {
            //         int temp=arr[j];
            //         arr[j]=arr[j+1];
            //         arr[j+1]=temp;
            //     }
            // }
        
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={1,5,8,11,3,2,-1};
        int [] res=bubble_sortarr(arr);
        System.out.println(Arrays.toString(res));
    }
}