package DAY14;

import java.util.Arrays;

public class Uniquearray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={3,4,5,6};
        Unique(arr1,arr2);
    }
    public static void Unique(int []arr1,int []arr2)
    {
        int n1=arr1.length;
        int n2=arr2.length;
        int count=0;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(arr1[i]==arr2[j])
                count++;
            }
        }
        int index=n1;
        int n3=n1+n2-count;
        int uarr[]=new int[n3];
        for(int i=0;i<n1;i++)
        uarr[i]=arr1[i];
        for(int j=0;j<n2;j++)
        {
            boolean b=false;
            for(int k=0;k<n1;k++)
            {
                if(arr2[j]==uarr[k])
                {
                    b=true ;
                    break;
                }
            }
            if(!b)
            {
                uarr[index++]=arr2[j];
            }
        }
        System.out.println(Arrays.toString(uarr));
    }
     
}
 