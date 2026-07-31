package DAY25;

import java.util.Arrays;
public class Intersec349 
{
    public static void main(String[] args) 
    {
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) 
        {
            if (nums1[i] == nums2[j]) 
            {
                if (k == 0 || res[k - 1] != nums1[i]) 
                { 
                    res[k] = nums1[i];
                    k++;
                }
                i++;
                j++;
            } 
            else if (nums1[i] < nums2[j]) 
                i++;
            else 
                j++;
        }
        return Arrays.copyOf(res, k);
    }
}
