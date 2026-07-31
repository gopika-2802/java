package DAY3;

import java.util.Arrays;

public class Reverse_array_without_anotherarray {
    public static int[] rarr(int[]arr)
    {
        int temp=0;
        int s=0,e=arr.length-1;
        while(s<=e)
        {
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;e--; 
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
       System.out.println(Arrays.toString(rarr(arr))); 
    }
    
}
