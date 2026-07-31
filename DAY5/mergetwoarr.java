package DAY5;

import java.util.Arrays;

public class mergetwoarr {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[] ={5,6,7,8};
        int merarr[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        merarr[i]=arr1[i];
        for(int i=0;i<arr2.length;i++)
        merarr[i+arr1.length]=arr2[i];
        System.out.println(Arrays.toString(merarr));
    }
}
