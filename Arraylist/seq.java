package Arraylist;

import java.util.ArrayList;

public class seq {
    public static void main(String[] args) {
        ArrayList<String>a=new ArrayList<>();
        int i=0;
        int nums[]={1,2,4,5,7};
        while(i<nums.length)
        {
            int start=nums[i];
            while(i+1<nums.length&&nums[i]+1==nums[i+1])
            {
                i++;
            }
            if(start==nums[i])
            {
                a.add(" "+start);
            }
            else{
                a.add(start+"->"+nums[i]);
            }
            i++;
        }
        System.out.println(a);
    }
    
}
