package Array;

import java.util.Arrays;

public class pos_neg_arr {
    public static void main(String[] args) {
        int [] arr={1,-2,3,-4,-8,-5,6};
        int cpos=0,cneg=0;
        for(int i:arr)
        {
            if(i>0) cpos++;
            else if(i<0) cneg++;
        }
        int[] pos=new int[cpos];
        int [] neg=new int[cneg];
        int k=0,j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                {
                    pos[j]=arr[i];
                    j++;
                }
            }
            else if(arr[i]<0)
            {
                {
                    neg[k]=arr[i];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));
    }
    
}
