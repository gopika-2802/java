package Array;

import java.util.Arrays;

public class Two_sum {
    public static int[] twosum(int [] arr,int t)
    {
        int []arr1={0,0};
        boolean b = false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]!=arr[j]&&arr[i]+arr[j]==t)
                {
                     arr1[0]=i;
                     arr1[1]=j;
                     b = true;
                }
            }
            if(b) break;
        }
        return arr1;
    }
    public static void main(String[] args) {
        int [] arr={4,5,1,2};
        int t=6;
        System.out.println(Arrays.toString(twosum(arr,t)));
    }
}
