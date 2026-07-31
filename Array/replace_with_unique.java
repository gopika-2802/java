package Array;

import java.util.Arrays;

public class replace_with_unique {
    public static void main(String[] args) {
        int arr[]={2,3,2,4,3,5};
        int res[]=new int [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int count=0;
                for(int k=0;k<=i;k++)
                {
                    if(arr[k]==arr[j])
                        count++;
                }
                if(count==1)
                {
                    res[i]=arr[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
    
}
