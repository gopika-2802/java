package Array;
import java.util.Arrays;

public class rotatingofarray {
    public static int[] rotate(int arr[],int k)
    {
        k=k%arr.length;// for reducing the time
        for(int i=1;i<=k;i++)
        {
        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;//right  rotation(1,2,3,4,5 to 4,5,1,2,3)
            //e--;//left rotation(1,2,3,4,5, to 3,4,5,1,2)
        }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;//number of rotaton
        System.out.println(Arrays.toString(rotate(arr,k)));
    }
}
