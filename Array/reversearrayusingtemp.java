package Array;
import java.util.Arrays;

public class reversearrayusingtemp {
    public static int[] rev(int arr[])
    {
        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,6,10,28};
        System.out.println(Arrays.toString(rev(arr)));
    }
}
