package sorting;

import java.util.Arrays;

public class Selection_sort {
    public static int[] selectionsort(int arr [])
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={4,28,3,1,-1,10};
        int [] res =selectionsort(arr);
        System.out.println(Arrays.toString(res));
    }
}

