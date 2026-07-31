package Array;

import java.util.Arrays;

public class leetcode3379 {
    public static void main(String[] args) {
        //int nums[]={-1,4,-1};
        //int nums[]={3,-2,1,1};
        int nums[]={1,2,3,4,5};
        int res[]=constructTransformedArray(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] constructTransformedArray(int[] nums) {
       int n=nums.length;
       int res[]=new int[n];
       for(int i=0;i<n;i++)
       {
        res[i]=nums[(i+nums[i]%n+n)%n];
       }
       return res;
    }
}