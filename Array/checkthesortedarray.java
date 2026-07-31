package Array;

import java.util.Arrays;

public class checkthesortedarray{
    public static boolean comp(int []arr) {
        boolean b=true;
        if(arr[0]<arr[1])
        {
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i]>arr[i+1])
                return b=false;
        }
        }
        else{
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i]<arr[i+1])
                return b=false;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int [] arr={1,2,4,6,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(comp(arr));
    }
    
}
