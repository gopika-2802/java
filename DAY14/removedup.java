package DAY14;

import java.util.Arrays;

public class removedup {
    public static int[] remove(int []nums)
    {
        if(nums.length==0) return nums;
        int k=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[k])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        int []res =new int[k];
        for(int i=0;i<k;i++)
        res[i]=nums[i];
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,4,5,6,8};
        int res[]=remove(arr);
        System.out.println(Arrays.toString(res));
    }
}
