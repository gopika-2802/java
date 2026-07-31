package Array;

import java.util.Arrays;

public class ranking_array {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int res[]=new int[arr.length];
        int sortarr[]=arr.clone();
        Arrays.sort(sortarr);
        for(int i=0;i<arr.length;i++)
        {   
            for(int j=0;j<sortarr.length;j++)
            {    
                if(arr[i]==sortarr[j])
                    res[i]=j+1;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}